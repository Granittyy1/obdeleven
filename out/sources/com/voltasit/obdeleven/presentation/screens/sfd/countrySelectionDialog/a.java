package com.voltasit.obdeleven.presentation.screens.sfd.countrySelectionDialog;

import B8.Y0;
import G8.C0705g;
import Ia.l;
import M0.e;
import M0.h;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.RecyclerView;
import com.voltasit.obdeleven.R;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: CountryAdapter.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends RecyclerView.Adapter<C0344a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f33058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<C0705g, r> f33059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<C0705g> f33060c;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.screens.sfd.countrySelectionDialog.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CountryAdapter.kt */
    public static final class C0344a extends RecyclerView.B {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Y0 f33061b;

        public C0344a(Y0 y10) {
            super(y10.f4488d);
            this.f33061b = y10;
        }
    }

    public a(l onClick, boolean z10) {
        i.e(onClick, "onClick");
        this.f33058a = z10;
        this.f33059b = onClick;
        this.f33060c = EmptyList.f42983b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f33060c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.B b10, int i10) {
        C0344a holder = (C0344a) b10;
        i.e(holder, "holder");
        C0705g country = this.f33060c.get(i10);
        i.e(country, "country");
        l<C0705g, r> onClick = this.f33059b;
        i.e(onClick, "onClick");
        Y0 y10 = holder.f33061b;
        ImageView imageView = y10.f1840r;
        View view = y10.f4488d;
        Context context = view.getContext();
        i.d(context, "getContext(...)");
        Resources resources = context.getResources();
        String lowerCase = country.f3497c.toLowerCase(Locale.ROOT);
        i.d(lowerCase, "toLowerCase(...)");
        imageView.setImageResource(resources.getIdentifier("ic_flag_".concat(lowerCase), "drawable", context.getPackageName()));
        y10.f1842t.setText(country.f3495a);
        y10.f1841s.setText(this.f33058a ? country.f3496b : "");
        view.setOnClickListener(new com.braze.ui.widget.a(onClick, 1, country));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.B onCreateViewHolder(ViewGroup parent, int i10) {
        i.e(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        int i11 = Y0.f1839u;
        DataBinderMapperImpl dataBinderMapperImpl = e.f4480a;
        Y0 y10 = (Y0) h.h(layoutInflaterFrom, R.layout.item_country, parent, false, null);
        i.d(y10, "inflate(...)");
        return new C0344a(y10);
    }
}
