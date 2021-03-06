package com.example.tareainterfazusuariows.Adaptador;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private final List<Fragment>lstFragment = new ArrayList<>();
    private final List<String> lstTitulo = new ArrayList<>();

    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return lstFragment.get(position);
    }

    @Override
    public int getCount() {
        return lstTitulo.size();
    }
    @Override
    public CharSequence getPageTitle(int position)
    {
        return lstTitulo.get(position);
    }
    public void AddFragment(Fragment fragment, String titles)
    {
        lstFragment.add(fragment);
        lstTitulo.add(titles);
    }
}
