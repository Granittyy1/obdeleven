package T6;

/* JADX INFO: compiled from: DoubleCheck.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a<T> implements p268va.a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f6035c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile b f6036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f6037b;

    public static p268va.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f6037b = f6035c;
        aVar.f6036a = bVar;
        return aVar;
    }

    @Override // p268va.a
    public final T get() {
        T t8 = (T) this.f6037b;
        Object obj = f6035c;
        if (t8 == obj) {
            synchronized (this) {
                try {
                    t8 = (T) this.f6037b;
                    if (t8 == obj) {
                        t8 = this.f6036a.get();
                        Object obj2 = this.f6037b;
                        if (obj2 != obj && obj2 != t8) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + t8 + ". This is likely due to a circular dependency.");
                        }
                        this.f6037b = t8;
                        this.f6036a = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return t8;
    }
}
