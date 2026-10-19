package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AdapterListUpdateCallback.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1437b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView.Adapter f19817a;

    public C1437b(RecyclerView.Adapter adapter) {
        this.f19817a = adapter;
    }

    public final void a(int i10, int i11) {
        this.f19817a.notifyItemRangeInserted(i10, i11);
    }

    public final void b(int i10, int i11) {
        this.f19817a.notifyItemRangeRemoved(i10, i11);
    }
}
