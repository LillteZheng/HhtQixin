package com.hht.hhtqixin;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.hht.hhtqixin.widget.BaseActivity;
import com.hht.hhtqixin.widget.fragment.HomeFragment;
import com.hht.hhtqixin.widget.fragment.MimeFragment;
import com.zhengsr.cusbottomlib.IBottomClickListener;
import com.zhengsr.cusbottomlib.view.CusBottomLayout;

import java.util.HashMap;
import java.util.Map;

import me.yokeyword.fragmentation.ISupportFragment;
import me.yokeyword.fragmentation.anim.DefaultHorizontalAnimator;
import me.yokeyword.fragmentation.anim.FragmentAnimator;

public class MainActivity extends BaseActivity implements IBottomClickListener {
    private static final String TAG = "MainActivity";
    private HomeFragment mHomeFragment;
    private MimeFragment mMineFragment;
    private Map<Integer,ISupportFragment> mFragments = new HashMap<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHomeFragment = HomeFragment.newInstance();
        mMineFragment = MimeFragment.newInstance();
        mFragments.put(0,mHomeFragment);
        mFragments.put(4,mMineFragment);
        if (findFragment(HomeFragment.class) == null){
            getSupportDelegate().loadMultipleRootFragment(R.id.bottom_content, 0,
                    mFragments.get(0), mFragments.get(4));
        }
        initview();
    }

    private void initview() {
        CusBottomLayout layout = findViewById(R.id.bottom_ly);
        layout.setBottomClickListener(this);
    }

    private int mLastPosition;
    @Override
    public void onClick(View view, int position) {
        showHideFragment(mFragments.get(position),mFragments.get(mLastPosition));
        mLastPosition = position;
    }


}
