package androidx.recyclerview.widget;

import java.util.ArrayList;

/* JADX INFO: compiled from: ItemTouchHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class u implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t.c f20035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f20037d;

    public u(t tVar, t.c cVar, int i10) {
        this.f20037d = tVar;
        this.f20035b = cVar;
        this.f20036c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t tVar = this.f20037d;
        RecyclerView recyclerView = tVar.f20006r;
        if (recyclerView == null || !recyclerView.f19647u) {
            return;
        }
        t.c cVar = this.f20035b;
        if (cVar.f20031l) {
            return;
        }
        RecyclerView.B b10 = cVar.f20026f;
        if (b10.getAbsoluteAdapterPosition() != -1) {
            RecyclerView.i itemAnimator = tVar.f20006r.getItemAnimator();
            if (itemAnimator == null || !itemAnimator.k()) {
                ArrayList arrayList = tVar.f20004p;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (((t.f) arrayList.get(i10)).f20032m) {
                    }
                }
                tVar.f20001m.onSwiped(b10, this.f20036c);
                return;
            }
            tVar.f20006r.post(this);
        }
    }
}
