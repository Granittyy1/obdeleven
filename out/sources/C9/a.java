package C9;

import p193p7.d;

/* JADX INFO: compiled from: DoubleCheck.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a<T> implements p268va.a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f2464c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile d f2465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f2466b;

    @Override // p268va.a
    public final T get() {
        Object obj = (T) this.f2466b;
        Object obj2 = f2464c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f2466b;
                    if (obj == obj2) {
                        obj = (T) this.f2465a.get();
                        Object obj3 = this.f2466b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f2466b = obj;
                        this.f2465a = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (T) obj;
    }
}
