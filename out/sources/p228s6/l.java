package p228s6;

import p096h7.b;

/* JADX INFO: compiled from: Lazy.java */
/* JADX INFO: loaded from: classes3.dex */
public final class l<T> implements b<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f46968c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f46969a = f46968c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile b<T> f46970b;

    public l(b<T> bVar) {
        this.f46970b = bVar;
    }

    @Override // p096h7.b
    public final T get() {
        T t8 = (T) this.f46969a;
        Object obj = f46968c;
        if (t8 == obj) {
            synchronized (this) {
                try {
                    t8 = (T) this.f46969a;
                    if (t8 == obj) {
                        t8 = this.f46970b.get();
                        this.f46969a = t8;
                        this.f46970b = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return t8;
    }
}
