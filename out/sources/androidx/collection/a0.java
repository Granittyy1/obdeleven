package androidx.collection;

/* JADX INFO: compiled from: SparseArray.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends kotlin.collections.v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y<Object> f9158c;

    public a0(Y<Object> y10) {
        this.f9158c = y10;
    }

    @Override // kotlin.collections.v
    public final int a() {
        int i10 = this.f9157b;
        this.f9157b = i10 + 1;
        return this.f9158c.d(i10);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9157b < this.f9158c.f();
    }
}
