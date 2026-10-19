package com.voltasit.obdeleven.presentation.appList;

import B8.O0;
import G8.C0700b;
import Ia.p;
import M0.h;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.view.O;
import androidx.core.view.Z;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.A;
import androidx.recyclerview.widget.C1451p;
import androidx.recyclerview.widget.RecyclerView;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import p293xa.r;

/* JADX INFO: compiled from: AppAdapter.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends A<d, b> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0326a f31294k = new C0326a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f31296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f31297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f31298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Lambda f31299f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f31300g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f31301h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f31302i;
    public final ArrayList j;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.appList.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AppAdapter.kt */
    public static final class C0326a extends C1451p.e<d> {
        @Override // androidx.recyclerview.widget.C1451p.e
        public final boolean a(d dVar, d dVar2) {
            return dVar.equals(dVar2);
        }

        @Override // androidx.recyclerview.widget.C1451p.e
        public final boolean b(d dVar, d dVar2) {
            d dVar3 = dVar;
            d dVar4 = dVar2;
            return ((dVar3 instanceof d.b) && (dVar4 instanceof d.b) && i.a(((d.b) dVar3).f31317a.f3901a, ((d.b) dVar4).f31317a.f3901a)) || ((dVar3 instanceof d.a) && (dVar4 instanceof d.a) && ((d.a) dVar3).f31315a == ((d.a) dVar4).f31315a);
        }
    }

    /* JADX INFO: compiled from: AppAdapter.kt */
    public static abstract class b extends RecyclerView.B {

        /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.appList.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AppAdapter.kt */
        public static final class C0327a extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final O0 f31303b;

            /* JADX WARN: Illegal instructions before constructor call */
            public C0327a(O0 o10) {
                View view = o10.f4488d;
                i.d(view, "getRoot(...)");
                super(view);
                this.f31303b = o10;
            }
        }

        /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.appList.a$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AppAdapter.kt */
        public static final class ViewOnClickListenerC0328b extends b implements View.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final p<Integer, View, r> f31304b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final ImageView f31305c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final ProgressBar f31306d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final LinearLayout f31307e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final LinearLayout f31308f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final TextView f31309g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final TextView f31310h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final TextView f31311i;
            public final TextView j;

            /* JADX WARN: Multi-variable type inference failed */
            public ViewOnClickListenerC0328b(View view, p<? super Integer, ? super View, r> pVar) {
                super(view);
                this.f31304b = pVar;
                View viewFindViewById = this.itemView.findViewById(R.id.itemApp_imageFrame);
                i.d(viewFindViewById, "findViewById(...)");
                View viewFindViewById2 = this.itemView.findViewById(R.id.itemApp_image);
                i.d(viewFindViewById2, "findViewById(...)");
                this.f31305c = (ImageView) viewFindViewById2;
                View viewFindViewById3 = this.itemView.findViewById(R.id.itemApp_progress);
                i.d(viewFindViewById3, "findViewById(...)");
                this.f31306d = (ProgressBar) viewFindViewById3;
                View viewFindViewById4 = this.itemView.findViewById(R.id.itemApp_layoutNew);
                i.d(viewFindViewById4, "findViewById(...)");
                this.f31307e = (LinearLayout) viewFindViewById4;
                View viewFindViewById5 = this.itemView.findViewById(R.id.itemApp_usage);
                i.d(viewFindViewById5, "findViewById(...)");
                View viewFindViewById6 = this.itemView.findViewById(R.id.appCreditsLayout);
                i.d(viewFindViewById6, "findViewById(...)");
                this.f31308f = (LinearLayout) viewFindViewById6;
                View viewFindViewById7 = this.itemView.findViewById(R.id.itemApp_usageNumber);
                i.d(viewFindViewById7, "findViewById(...)");
                this.f31309g = (TextView) viewFindViewById7;
                View viewFindViewById8 = this.itemView.findViewById(R.id.itemApp_name);
                i.d(viewFindViewById8, "findViewById(...)");
                this.f31310h = (TextView) viewFindViewById8;
                View viewFindViewById9 = this.itemView.findViewById(R.id.itemApp_credits);
                i.d(viewFindViewById9, "findViewById(...)");
                this.f31311i = (TextView) viewFindViewById9;
                View viewFindViewById10 = this.itemView.findViewById(R.id.appTestStateTextView);
                i.d(viewFindViewById10, "findViewById(...)");
                this.j = (TextView) viewFindViewById10;
                this.itemView.setOnClickListener(this);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View v10) {
                i.e(v10, "v");
                int adapterPosition = getAdapterPosition();
                if (adapterPosition != -1) {
                    Integer numValueOf = Integer.valueOf(adapterPosition);
                    View itemView = this.itemView;
                    i.d(itemView, "itemView");
                    this.f31304b.invoke(numValueOf, itemView);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(int i10, boolean z10, String str, boolean z11, p<? super d, ? super View, r> pVar) {
        super(f31294k);
        this.f31295b = i10;
        this.f31296c = z10;
        this.f31297d = str;
        this.f31298e = z11;
        this.f31299f = (Lambda) pVar;
        this.f31300g = new ArrayList();
        this.f31301h = true;
        this.j = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i10) {
        return !(a(i10) instanceof d.b) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.B b10, int i10) {
        Object next;
        b holder = (b) b10;
        i.e(holder, "holder");
        if (!(holder instanceof b.ViewOnClickListenerC0328b)) {
            d dVarA = a(i10);
            i.c(dVarA, "null cannot be cast to non-null type com.voltasit.obdeleven.presentation.appList.AppAdapterItem.Info");
            d.a aVar = (d.a) dVarA;
            O0 o10 = ((b.C0327a) holder).f31303b;
            TextView text = o10.f1771r;
            i.d(text, "text");
            W8.d.d(text, o10.f4488d.getContext().getString(aVar.f31315a, aVar.f31316b));
            o10.f1771r.setMovementMethod(LinkMovementMethod.getInstance());
            return;
        }
        View view = holder.itemView;
        String strB = J4.i.b(i10, "appListImageTransition_");
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        O.d.v(view, strB);
        b.ViewOnClickListenerC0328b viewOnClickListenerC0328b = (b.ViewOnClickListenerC0328b) holder;
        viewOnClickListenerC0328b.f31306d.setVisibility(0);
        d dVarA2 = a(i10);
        i.c(dVarA2, "null cannot be cast to non-null type com.voltasit.obdeleven.presentation.appList.AppAdapterItem.Item");
        long j = this.f31302i;
        I8.a aVar2 = ((d.b) dVarA2).f31317a;
        viewOnClickListenerC0328b.f31307e.setVisibility((j >= aVar2.f3912m || j == 0) ? 8 : 0);
        ImageView imageView = viewOnClickListenerC0328b.f31305c;
        com.bumptech.glide.d<Drawable> dVarM = com.bumptech.glide.b.d(imageView).m(aVar2.f3906f);
        dVarM.y(new com.voltasit.obdeleven.presentation.appList.b(holder));
        dVarM.x(imageView);
        boolean z10 = this.f31296c;
        TextView textView = viewOnClickListenerC0328b.f31309g;
        if (z10) {
            textView.setText(String.valueOf(aVar2.f3908h));
        } else {
            W8.d.f(textView, false);
        }
        Context context = viewOnClickListenerC0328b.itemView.getContext();
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(context.getResources().getColor(R.color.white), PorterDuff.Mode.SRC_IN);
        String str = this.f31297d;
        String str2 = aVar2.f3913n;
        boolean z11 = aVar2.j;
        TextView textView2 = viewOnClickListenerC0328b.j;
        if (z11) {
            textView2.setVisibility(8);
        } else if (n.S(str) || !i.a(str2, str)) {
            textView2.setVisibility(0);
            textView2.getBackground().mutate().setColorFilter(porterDuffColorFilter);
            textView2.setText(R.string.common_oca_state_not_public);
            textView2.setTextColor(context.getResources().getColor(R.color.black));
        } else {
            textView2.setVisibility(0);
            textView2.getBackground().mutate().setColorFilter(porterDuffColorFilter);
            textView2.setText(R.string.common_personal);
            textView2.setTextColor(context.getResources().getColor(R.color.black));
        }
        Iterator it = this.f31300g.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C0700b c0700b = (C0700b) next;
            if (i.a(c0700b.f3444c, "name") && i.a(c0700b.f3442a, aVar2.f3901a)) {
                break;
            }
        }
        C0700b c0700b2 = (C0700b) next;
        viewOnClickListenerC0328b.f31310h.setText(c0700b2 != null ? c0700b2.f3445d : aVar2.f3903c);
        boolean zS = n.S(str);
        LinearLayout linearLayout = viewOnClickListenerC0328b.f31308f;
        if (!zS && i.a(str2, str)) {
            linearLayout.setVisibility(8);
            return;
        }
        if (!this.f31298e) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        TextView textView3 = viewOnClickListenerC0328b.f31311i;
        if (z11) {
            textView3.setText(String.valueOf(aVar2.f3905e));
        } else {
            textView3.setText("0");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.B onCreateViewHolder(ViewGroup parent, int i10) {
        i.e(parent, "parent");
        int i11 = this.f31295b;
        if (i10 == 0) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_app, parent, false);
            viewInflate.getLayoutParams().height = i11;
            return new b.ViewOnClickListenerC0328b(viewInflate, new p<Integer, View, r>() { // from class: com.voltasit.obdeleven.presentation.appList.AppAdapter$onCreateViewHolder$1
                {
                    super(2);
                }

                /* JADX WARN: Type inference failed for: r1v0, types: [Ia.p, kotlin.jvm.internal.Lambda] */
                @Override // Ia.p
                public final r invoke(Integer num, View view) {
                    int iIntValue = num.intValue();
                    View itemView = view;
                    i.e(itemView, "itemView");
                    a aVar = this.this$0;
                    ?? r10 = aVar.f31299f;
                    d dVarA = aVar.a(iIntValue);
                    i.d(dVarA, "access$getItem(...)");
                    r10.invoke(dVarA, itemView);
                    return r.f47939a;
                }
            });
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        int i12 = O0.f1770s;
        DataBinderMapperImpl dataBinderMapperImpl = M0.e.f4480a;
        O0 o10 = (O0) h.h(layoutInflaterFrom, R.layout.item_add_oca, null, false, null);
        i.d(o10, "inflate(...)");
        o10.f4488d.setLayoutParams(new FrameLayout.LayoutParams(-1, i11));
        return new b.C0327a(o10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(RecyclerView.B b10) {
        b holder = (b) b10;
        i.e(holder, "holder");
        synchronized (this) {
            try {
                if (this.f31301h && (holder instanceof b.ViewOnClickListenerC0328b)) {
                    long size = ((long) this.j.size()) * 25;
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(holder.itemView.getContext(), android.R.anim.slide_in_left);
                    animationLoadAnimation.setStartOffset(size);
                    animationLoadAnimation.setAnimationListener(new c(this, holder));
                    ArrayList arrayList = this.j;
                    View itemView = holder.itemView;
                    i.d(itemView, "itemView");
                    arrayList.add(itemView);
                    holder.itemView.startAnimation(animationLoadAnimation);
                }
                r rVar = r.f47939a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.B b10) {
        b holder = (b) b10;
        i.e(holder, "holder");
        this.j.remove(holder.itemView);
        holder.itemView.clearAnimation();
    }
}
