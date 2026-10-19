package p064f0;

/* JADX INFO: compiled from: Pools.java */
/* JADX INFO: loaded from: classes.dex */
public final class b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f34905a = new Object[256];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34906b;

    public final void a(androidx.constraintlayout.core.b bVar) {
        int i10 = this.f34906b;
        Object[] objArr = this.f34905a;
        if (i10 < objArr.length) {
            objArr[i10] = bVar;
            this.f34906b = i10 + 1;
        }
    }
}
