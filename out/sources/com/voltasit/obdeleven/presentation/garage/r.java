package com.voltasit.obdeleven.presentation.garage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: GarageScrollListener.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class r extends RecyclerView.q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView.l f32386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f32387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f32388d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f32390f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32385a = 50;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f32389e = true;

    public r(RecyclerView.l lVar) {
        this.f32386b = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void b(int i10, int i11, RecyclerView view) {
        int iR0;
        kotlin.jvm.internal.i.e(view, "view");
        RecyclerView.l lVar = this.f32386b;
        int iF = lVar.F() - 2;
        if (lVar instanceof LinearLayoutManager) {
            iR0 = ((LinearLayoutManager) lVar).R0();
        } else {
            iR0 = lVar instanceof GridLayoutManager ? ((GridLayoutManager) lVar).R0() : 0;
        }
        if (iF < this.f32388d) {
            this.f32387c = 0;
            this.f32388d = iF;
            if (iF == 0) {
                this.f32389e = true;
            }
        }
        boolean z10 = iF > this.f32388d || this.f32390f;
        if (this.f32389e && z10) {
            this.f32389e = false;
            this.f32388d = iF;
            this.f32387c++;
        }
        boolean z11 = this.f32390f || iF >= this.f32385a;
        if (this.f32389e || !z11 || iR0 + 5 <= iF) {
            return;
        }
        c(this.f32387c, iF, view);
        this.f32389e = true;
    }

    public abstract void c(int i10, int i11, RecyclerView recyclerView);
}
