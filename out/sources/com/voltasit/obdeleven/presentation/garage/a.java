package com.voltasit.obdeleven.presentation.garage;

import B8.m1;
import G8.H;
import android.content.Context;
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
import p220r9.C2786s;

/* JADX INFO: compiled from: GarageAdapter.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends A<H, b> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0338a f32352f = new C0338a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ia.p<H, Integer, p293xa.r> f32354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f32355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f32356e;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.garage.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: GarageAdapter.kt */
    public static final class C0338a extends C1451p.e<H> {
        @Override // androidx.recyclerview.widget.C1451p.e
        public final boolean a(H h8, H h10) {
            return h8.equals(h10);
        }

        @Override // androidx.recyclerview.widget.C1451p.e
        public final boolean b(H h8, H h10) {
            return h8.f3427a.equals(h10.f3427a);
        }
    }

    /* JADX INFO: compiled from: GarageAdapter.kt */
    public final class b extends RecyclerView.B {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int f32357d = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m1 f32358b;

        public b(m1 m1Var) {
            super(m1Var.f4488d);
            this.f32358b = m1Var;
            TextView vinText = m1Var.f2073v;
            kotlin.jvm.internal.i.d(vinText, "vinText");
            W8.d.f(vinText, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(int i10, Ia.p<? super H, ? super Integer, p293xa.r> pVar) {
        super(f32352f);
        this.f32353b = i10;
        this.f32354c = pVar;
        this.f32355d = new ArrayList();
        this.f32356e = true;
    }

    public final void b(boolean z10) {
        this.f32356e = z10;
        if (z10) {
            return;
        }
        ArrayList arrayList = this.f32355d;
        for (View view : new ArrayList(arrayList)) {
            arrayList.remove(view);
            view.clearAnimation();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.B b10, int i10) {
        final b holder = (b) b10;
        kotlin.jvm.internal.i.e(holder, "holder");
        final H hA = a(i10);
        if (hA == null) {
            return;
        }
        m1 m1Var = holder.f32358b;
        Context context = m1Var.f4488d.getContext();
        final a aVar = a.this;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, aVar.f32353b);
        int absoluteAdapterPosition = holder.getAbsoluteAdapterPosition();
        View view = m1Var.f4488d;
        if (absoluteAdapterPosition == -1) {
            view.setOnClickListener(new com.voltasit.obdeleven.presentation.garage.b());
            return;
        }
        if (absoluteAdapterPosition != 0) {
            layoutParams.setMargins(0, 0, 0, 0);
            view.setOnClickListener(new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.garage.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    a this$0 = this.f32363b;
                    kotlin.jvm.internal.i.e(this$0, "this$0");
                    H item = hA;
                    kotlin.jvm.internal.i.e(item, "$item");
                    a.b this$1 = holder;
                    kotlin.jvm.internal.i.e(this$1, "this$1");
                    this$0.f32354c.invoke(item, Integer.valueOf(this$1.getAbsoluteAdapterPosition()));
                }
            });
        } else {
            layoutParams.setMargins(0, C2786s.a(context.getResources(), -6.0f) + 1, 0, 0);
            view.setOnClickListener(new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.garage.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    a this$0 = this.f32360b;
                    kotlin.jvm.internal.i.e(this$0, "this$0");
                    H item = hA;
                    kotlin.jvm.internal.i.e(item, "$item");
                    a.b this$1 = holder;
                    kotlin.jvm.internal.i.e(this$1, "this$1");
                    this$0.f32354c.invoke(item, Integer.valueOf(this$1.getAbsoluteAdapterPosition()));
                }
            });
        }
        String str = hA.f3427a;
        TextView textView = m1Var.f2071t;
        textView.setText(str);
        m1Var.f2074w.setText(hA.f3431e);
        String strConcat = "vehicleListImageTransition_".concat(str);
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        O.d.v(view, strConcat);
        m1Var.f2069r.setLayoutParams(layoutParams);
        m1Var.f2072u.setVisibility(0);
        ShapeableImageView shapeableImageView = m1Var.f2070s;
        com.bumptech.glide.d<Drawable> dVarM = com.bumptech.glide.b.d(shapeableImageView).m(hA.f3432f);
        dVarM.y(new e(holder));
        T3.d dVarJ = new T3.d().e(R.drawable.vehicle_default).f(R.drawable.vehicle_default).j(R.drawable.vehicle_default);
        kotlin.jvm.internal.i.d(dVarJ, "placeholder(...)");
        dVarM.a(dVarJ).x(shapeableImageView);
        String str2 = hA.f3430d;
        if (str2.length() > 0) {
            textView.setText(str2);
            return;
        }
        String str3 = hA.f3429c;
        if (str3.length() > 0) {
            textView.setText(str3);
        } else {
            textView.setText(hA.f3428b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.B onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.i.e(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        int i11 = m1.f2068x;
        DataBinderMapperImpl dataBinderMapperImpl = M0.e.f4480a;
        m1 m1Var = (m1) M0.h.h(layoutInflaterFrom, R.layout.item_vehicle, parent, false, null);
        kotlin.jvm.internal.i.d(m1Var, "inflate(...)");
        View view = m1Var.f4488d;
        kotlin.jvm.internal.i.d(view, "getRoot(...)");
        view.getLayoutParams().height = this.f32353b;
        return new b(m1Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(RecyclerView.B b10) {
        b holder = (b) b10;
        kotlin.jvm.internal.i.e(holder, "holder");
        synchronized (this) {
            try {
                if (this.f32356e) {
                    long size = ((long) this.f32355d.size()) * 25;
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(holder.itemView.getContext(), android.R.anim.slide_in_left);
                    animationLoadAnimation.setStartOffset(size);
                    animationLoadAnimation.setAnimationListener(new f(this, holder));
                    ArrayList arrayList = this.f32355d;
                    View itemView = holder.itemView;
                    kotlin.jvm.internal.i.d(itemView, "itemView");
                    arrayList.add(itemView);
                    holder.itemView.startAnimation(animationLoadAnimation);
                }
                p293xa.r rVar = p293xa.r.f47939a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.B b10) {
        b holder = (b) b10;
        kotlin.jvm.internal.i.e(holder, "holder");
        this.f32355d.remove(holder.itemView);
        holder.itemView.clearAnimation();
    }
}
