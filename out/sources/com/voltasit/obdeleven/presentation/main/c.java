package com.voltasit.obdeleven.presentation.main;

import Ia.l;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.A;
import androidx.recyclerview.widget.C1451p;
import androidx.recyclerview.widget.RecyclerView;
import com.voltasit.obdeleven.R;
import p293xa.r;

/* JADX INFO: compiled from: FaultyCusHorizontalAdapter.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends A<p109i8.e, b> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f32624c = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<p109i8.e, r> f32625b;

    /* JADX INFO: compiled from: FaultyCusHorizontalAdapter.kt */
    public static final class a extends C1451p.e<p109i8.e> {
        @Override // androidx.recyclerview.widget.C1451p.e
        public final boolean a(p109i8.e eVar, p109i8.e eVar2) {
            return kotlin.jvm.internal.i.a(Integer.valueOf(eVar.n().shortValue()), Integer.valueOf(eVar2.n().shortValue()));
        }

        @Override // androidx.recyclerview.widget.C1451p.e
        public final boolean b(p109i8.e eVar, p109i8.e eVar2) {
            return eVar == eVar2;
        }
    }

    /* JADX INFO: compiled from: FaultyCusHorizontalAdapter.kt */
    public final class b extends RecyclerView.B {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f32626b;

        public b(View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.faultyCusHorizontalAdapter_cuNumberBg);
            kotlin.jvm.internal.i.d(viewFindViewById, "findViewById(...)");
            this.f32626b = (TextView) viewFindViewById;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(l<? super p109i8.e, r> lVar) {
        super(f32624c);
        this.f32625b = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.B b10, int i10) {
        b holder = (b) b10;
        kotlin.jvm.internal.i.e(holder, "holder");
        p109i8.e eVarA = a(i10);
        kotlin.jvm.internal.i.b(eVarA);
        holder.itemView.setOnClickListener(new com.braze.ui.widget.c(c.this, 1, eVarA));
        TextView textView = holder.f32626b;
        textView.getBackground().mutate().setColorFilter(holder.itemView.getContext().getResources().getColor(R.color.holo_red_dark), PorterDuff.Mode.MULTIPLY);
        textView.setText(eVarA.t());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.B onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.i.e(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_pro_faulty_cus, parent, false);
        kotlin.jvm.internal.i.b(viewInflate);
        return new b(viewInflate);
    }
}
