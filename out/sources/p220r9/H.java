package p220r9;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: OnDemandListener.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class H extends RecyclerView.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f46418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LinearLayoutManager f46419d;

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void b(int i10, int i11, RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager = this.f46419d;
        int iF = linearLayoutManager.F();
        int iR0 = linearLayoutManager.R0();
        if (iF < this.f46417b) {
            this.f46416a = 0;
            this.f46417b = iF;
            if (iF == 0) {
                this.f46418c = true;
            }
        }
        if (this.f46418c && iF > this.f46417b) {
            this.f46418c = false;
            this.f46417b = iF;
        }
        if (this.f46418c || iR0 + 5 <= iF) {
            return;
        }
        int i12 = this.f46416a;
        this.f46416a = i12 + 1;
        c(i12, iF, recyclerView);
        this.f46418c = true;
    }

    public abstract void c(int i10, int i11, RecyclerView recyclerView);
}
