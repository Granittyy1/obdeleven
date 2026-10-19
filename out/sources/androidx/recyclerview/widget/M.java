package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: compiled from: SimpleItemAnimator.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class M extends RecyclerView.i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f19555g = true;

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final boolean a(RecyclerView.B b10, RecyclerView.i.b bVar, RecyclerView.i.b bVar2) {
        int i10;
        int i11;
        if (bVar != null && ((i10 = bVar.f19678a) != (i11 = bVar2.f19678a) || bVar.f19679b != bVar2.f19679b)) {
            return o(b10, i10, bVar.f19679b, i11, bVar2.f19679b);
        }
        m(b10);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final boolean b(RecyclerView.B b10, RecyclerView.B b11, RecyclerView.i.b bVar, RecyclerView.i.b bVar2) {
        int i10;
        int i11;
        int i12 = bVar.f19678a;
        int i13 = bVar.f19679b;
        if (b11.shouldIgnore()) {
            int i14 = bVar.f19678a;
            i11 = bVar.f19679b;
            i10 = i14;
        } else {
            i10 = bVar2.f19678a;
            i11 = bVar2.f19679b;
        }
        return n(b10, b11, i12, i13, i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final boolean c(RecyclerView.B b10, RecyclerView.i.b bVar, RecyclerView.i.b bVar2) {
        int i10 = bVar.f19678a;
        int i11 = bVar.f19679b;
        View view = b10.itemView;
        int left = bVar2 == null ? view.getLeft() : bVar2.f19678a;
        int top = bVar2 == null ? view.getTop() : bVar2.f19679b;
        if (b10.isRemoved() || (i10 == left && i11 == top)) {
            p(b10);
            return true;
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return o(b10, i10, i11, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final boolean d(RecyclerView.B b10, RecyclerView.i.b bVar, RecyclerView.i.b bVar2) {
        int i10 = bVar.f19678a;
        int i11 = bVar2.f19678a;
        if (i10 != i11 || bVar.f19679b != bVar2.f19679b) {
            return o(b10, i10, bVar.f19679b, i11, bVar2.f19679b);
        }
        h(b10);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final boolean f(RecyclerView.B b10) {
        return !this.f19555g || b10.isInvalid();
    }

    public abstract void m(RecyclerView.B b10);

    public abstract boolean n(RecyclerView.B b10, RecyclerView.B b11, int i10, int i11, int i12, int i13);

    public abstract boolean o(RecyclerView.B b10, int i10, int i11, int i12, int i13);

    public abstract void p(RecyclerView.B b10);
}
