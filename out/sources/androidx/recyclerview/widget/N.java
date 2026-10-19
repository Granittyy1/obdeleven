package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: compiled from: SnapHelper.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class N extends RecyclerView.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f19556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f19557b = new a();

    /* JADX INFO: compiled from: SnapHelper.java */
    public class a extends RecyclerView.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f19558a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void a(RecyclerView recyclerView, int i10) {
            if (i10 == 0 && this.f19558a) {
                this.f19558a = false;
                N.this.b();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void b(int i10, int i11, RecyclerView recyclerView) {
            if (i10 == 0 && i11 == 0) {
                return;
            }
            this.f19558a = true;
        }
    }

    public abstract int[] a(RecyclerView.l lVar, View view);

    public final void b() {
        RecyclerView.l layoutManager;
        View viewD;
        RecyclerView recyclerView = this.f19556a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        H h8 = (H) this;
        if (layoutManager.g()) {
            viewD = H.d(layoutManager, h8.f(layoutManager));
        } else {
            viewD = layoutManager.f() ? H.d(layoutManager, h8.e(layoutManager)) : null;
        }
        if (viewD == null) {
            return;
        }
        int[] iArrA = a(layoutManager, viewD);
        int i10 = iArrA[0];
        if (i10 == 0 && iArrA[1] == 0) {
            return;
        }
        this.f19556a.l0(i10, iArrA[1], false);
    }
}
