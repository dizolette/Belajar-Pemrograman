package geniuslabs.tabbelajar;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        viewPager = (ViewPager) findViewById(R.id.viewpager);
        //memanggil method setupViewPager
        setViewPager(viewPager);


        tabLayout = (TabLayout) findViewById(R.id.tabs);
        //menghubungkan ke viewPager
        tabLayout.setupWithViewPager(viewPager);


    }

    private void setViewPager(ViewPager viewPager){
        //membuat objek dari viewpageradapter
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FragmentSatu(), "home");
        adapter.addFragment(new FragmentDua(), "history");
        adapter.addFragment(new FragmentTiga(), "profile");
        viewPager.setAdapter(adapter);

    }


    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitle = new ArrayList<>();

        //untuk menambah penamaan fragment
        public void addFragment(Fragment fragment, String title){
            //menyimpan ke arrayList dengan method add()
            mFragmentList.add(fragment);
            mFragmentTitle.add(title);
        }

        //fragment manager buat ngatur fragment mana yang muncul
        public ViewPagerAdapter(FragmentManager adapter) {
            super(adapter);
        }

        //untuk tau posisi fragment
        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        //untuk tau posisi title
        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitle.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size(); //mengukur panjang size
        }
    }

}

