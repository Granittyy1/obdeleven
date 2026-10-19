package com.voltasit.obdeleven.presentation.garage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: PreloaderAdapter.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class s extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f32391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f32392b = true;

    /* JADX INFO: compiled from: PreloaderAdapter.kt */
    public final class a extends RecyclerView.B {
        public a() {
            throw null;
        }
    }

    public final void a(boolean z10) {
        this.f32392b = z10;
        View view = this.f32391a;
        if (view != null) {
            if (view != null) {
                W8.d.f(view, z10);
            } else {
                kotlin.jvm.internal.i.m("preloaderView");
                throw null;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.B b10, int i10) {
        a holder = (a) b10;
        kotlin.jvm.internal.i.e(holder, "holder");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.B onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.i.e(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.on_demand_list_preloader, (ViewGroup) null, false);
        kotlin.jvm.internal.i.d(viewInflate, "inflate(...)");
        this.f32391a = viewInflate;
        a(this.f32392b);
        LinearLayout linearLayout = new LinearLayout(parent.getContext());
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        View view = this.f32391a;
        if (view == null) {
            kotlin.jvm.internal.i.m("preloaderView");
            throw null;
        }
        if (view.getParent() != null) {
            View view2 = this.f32391a;
            if (view2 == null) {
                kotlin.jvm.internal.i.m("preloaderView");
                throw null;
            }
            ViewParent parent2 = view2.getParent();
            kotlin.jvm.internal.i.c(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent2;
            View view3 = this.f32391a;
            if (view3 == null) {
                kotlin.jvm.internal.i.m("preloaderView");
                throw null;
            }
            viewGroup.removeView(view3);
        }
        View view4 = this.f32391a;
        if (view4 != null) {
            linearLayout.addView(view4, -1, -2);
            return new a(linearLayout);
        }
        kotlin.jvm.internal.i.m("preloaderView");
        throw null;
    }
}
