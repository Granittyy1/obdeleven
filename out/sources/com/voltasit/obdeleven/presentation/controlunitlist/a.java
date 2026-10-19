package com.voltasit.obdeleven.presentation.controlunitlist;

import B8.W0;
import G8.C;
import Ia.p;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.O;
import androidx.core.view.Z;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.A;
import androidx.recyclerview.widget.C1451p;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: ControlUnitAdapter.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends A<C, b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f32023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f32024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p<View, Integer, r> f32025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f32026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PorterDuffColorFilter f32027f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PorterDuffColorFilter f32028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PorterDuffColorFilter f32029h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PorterDuffColorFilter f32030i;
    public final PorterDuffColorFilter j;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.controlunitlist.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ControlUnitAdapter.kt */
    public static final class C0335a extends C1451p.e<C> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0335a f32031a = new C0335a();

        @Override // androidx.recyclerview.widget.C1451p.e
        public final boolean a(C c10, C c11) {
            return c10.equals(c11);
        }

        @Override // androidx.recyclerview.widget.C1451p.e
        public final boolean b(C c10, C c11) {
            return c10.f3406a == c11.f3406a;
        }
    }

    /* JADX INFO: compiled from: ControlUnitAdapter.kt */
    public final class b extends RecyclerView.B {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final W0 f32032b;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(final a aVar, W0 w3) {
            View view = w3.f4488d;
            super(view);
            this.f32032b = w3;
            view.setOnClickListener(new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.controlunitlist.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    a this$0 = aVar;
                    i.e(this$0, "this$0");
                    a.b this$1 = this;
                    i.e(this$1, "this$1");
                    i.b(view2);
                    this$0.f32025d.invoke(view2, Integer.valueOf(this$1.getBindingAdapterPosition()));
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Context context, int i10, p<? super View, ? super Integer, r> pVar) {
        super(C0335a.f32031a);
        this.f32023b = context;
        this.f32024c = i10;
        this.f32025d = pVar;
        this.f32026e = new ArrayList();
        int iA = p0.a.b.a(context, R.color.black);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f32027f = new PorterDuffColorFilter(iA, mode);
        this.f32028g = new PorterDuffColorFilter(p0.a.b.a(context, R.color.yellow_500), mode);
        this.f32029h = new PorterDuffColorFilter(p0.a.b.a(context, R.color.holo_red_dark), mode);
        this.f32030i = new PorterDuffColorFilter(p0.a.b.a(context, R.color.holo_green_dark), mode);
        this.j = new PorterDuffColorFilter(-1, mode);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.B b10, int i10) {
        b holder = (b) b10;
        i.e(holder, "holder");
        C cA = a(i10);
        W0 w3 = holder.f32032b;
        w3.t(cA);
        w3.f1829v.setVisibility(0);
        FrameLayout frameLayout = w3.f1826s;
        frameLayout.setVisibility(8);
        View view = holder.itemView;
        String strC = B7.b.c("controlUnitListImageTransition_", p293xa.p.a(cA.f3406a));
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        O.d.v(view, strC);
        int iOrdinal = cA.f3409d.ordinal();
        TextView textView = w3.f1828u;
        if (iOrdinal == 0) {
            textView.getBackground().mutate().setColorFilter(this.f32029h);
            textView.setTextColor(-1);
            r rVar = r.f47939a;
        } else if (iOrdinal == 1) {
            textView.getBackground().mutate().setColorFilter(this.f32028g);
            textView.setTextColor(-1);
            r rVar2 = r.f47939a;
        } else if (iOrdinal == 2) {
            textView.getBackground().mutate().setColorFilter(this.f32027f);
            textView.setTextColor(-1);
            r rVar3 = r.f47939a;
        } else if (iOrdinal == 3) {
            textView.getBackground().mutate().setColorFilter(this.j);
            textView.setTextColor(-16777216);
            r rVar4 = r.f47939a;
        } else {
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            textView.getBackground().mutate().setColorFilter(this.f32030i);
            textView.setTextColor(-1);
            r rVar5 = r.f47939a;
        }
        Na.i iVar = E8.a.f3126a;
        frameLayout.setVisibility(0);
        ShapeableImageView shapeableImageView = w3.f1825r;
        com.bumptech.glide.d<Drawable> dVarM = com.bumptech.glide.b.d(shapeableImageView).m(cA.f3407b);
        dVarM.y(new c(holder));
        T3.d dVarJ = new T3.d().e(R.drawable.control_unit_default).f(R.drawable.control_unit_default).j(R.drawable.control_unit_default);
        i.d(dVarJ, "placeholder(...)");
        dVarM.a(dVarJ).x(shapeableImageView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.B onCreateViewHolder(ViewGroup parent, int i10) {
        i.e(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f32023b);
        int i11 = W0.f1824x;
        DataBinderMapperImpl dataBinderMapperImpl = M0.e.f4480a;
        W0 w3 = (W0) M0.h.h(layoutInflaterFrom, R.layout.item_control_unit, null, false, null);
        i.d(w3, "inflate(...)");
        w3.f4488d.setLayoutParams(new FrameLayout.LayoutParams(-1, this.f32024c));
        return new b(this, w3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(RecyclerView.B b10) {
        b holder = (b) b10;
        i.e(holder, "holder");
        synchronized (this) {
            long size = ((long) this.f32026e.size()) * 25;
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.f32023b, android.R.anim.slide_in_left);
            animationLoadAnimation.setStartOffset(size);
            animationLoadAnimation.setAnimationListener(new d(this, holder));
            ArrayList arrayList = this.f32026e;
            View itemView = holder.itemView;
            i.d(itemView, "itemView");
            arrayList.add(itemView);
            holder.itemView.startAnimation(animationLoadAnimation);
            r rVar = r.f47939a;
        }
    }
}
