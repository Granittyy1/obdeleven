package io.intercom.android.sdk.carousel;

import androidx.fragment.app.D;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class CarouselScreenPagerAdapter extends D {
    private List<CarouselScreenFragment> fragments;

    public CarouselScreenPagerAdapter(y yVar, List<CarouselScreenFragment> list) {
        super(yVar);
        this.fragments = list;
    }

    @Override // H2.a
    public int getCount() {
        return this.fragments.size();
    }

    @Override // androidx.fragment.app.D
    public Fragment getItem(int i10) {
        return this.fragments.get(i10);
    }
}
