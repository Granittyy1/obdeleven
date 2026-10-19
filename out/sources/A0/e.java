package A0;

import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: Pools.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e<T> extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f383c;

    public e(int i10) {
        super(i10);
        this.f383c = new Object();
    }

    @Override // A0.d
    public final T a() {
        T t8;
        synchronized (this.f383c) {
            t8 = (T) super.a();
        }
        return t8;
    }

    @Override // A0.d
    public final boolean b(T instance) {
        boolean zB;
        i.e(instance, "instance");
        synchronized (this.f383c) {
            zB = super.b(instance);
        }
        return zB;
    }
}
