package E4;

/* JADX INFO: compiled from: DoubleCheck.java */
/* JADX INFO: loaded from: classes.dex */
public final class a<T> implements p268va.a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f3082c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile b f3083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f3084b;

    public static p268va.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f3084b = f3082c;
        aVar.f3083a = bVar;
        return aVar;
    }

    @Override // p268va.a
    public final T get() {
        T t8 = (T) this.f3084b;
        Object obj = f3082c;
        if (t8 == obj) {
            synchronized (this) {
                try {
                    t8 = (T) this.f3084b;
                    if (t8 == obj) {
                        t8 = this.f3083a.get();
                        Object obj2 = this.f3084b;
                        if (obj2 != obj && obj2 != t8) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + t8 + ". This is likely due to a circular dependency.");
                        }
                        this.f3084b = t8;
                        this.f3083a = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return t8;
    }
}
