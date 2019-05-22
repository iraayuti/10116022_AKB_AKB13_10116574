package com.bismillah.uts_akb_akb13_10116574;

// NIM : 10116574
// NAMA : IRA YUTI
// KELAS : AKB13
// TANGGAL PENGERJAAN : 20 MEI 2019

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class IntroViewPagerAdapter extends PagerAdapter {

    Context mContext;
    List<Model> mList;

    public IntroViewPagerAdapter(Context mContext, List<Model> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View screenLayout = inflater.inflate(R.layout.layout_screen,null);

        ImageView imgslide = screenLayout.findViewById(R.id.intro_img);
        TextView title = screenLayout.findViewById(R.id.intro_title);
        TextView description = screenLayout.findViewById(R.id.intro_description);

        title.setText(mList.get(position).getTitle());
        description.setText(mList.get(position).getDescription());
        imgslide.setImageResource(mList.get(position).getScreenImg());

        container.addView(screenLayout);
        return  screenLayout;

    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view==o;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((View)object);

    }
}
