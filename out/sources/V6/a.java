package V6;

/* JADX INFO: compiled from: DoubleCheck.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a<T> implements p268va.a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f6727c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile p268va.a<T> f6728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f6729b;

    public static <P extends p268va.a<T>, T> p268va.a<T> a(P p10) {
        if (p10 instanceof a) {
            return p10;
        }
        a aVar = new a();
        aVar.f6729b = f6727c;
        aVar.f6728a = p10;
        return aVar;
    }

    @Override // p268va.a
    public final T get() {
        T t8 = (T) this.f6729b;
        Object obj = f6727c;
        if (t8 == obj) {
            synchronized (this) {
                try {
                    t8 = (T) this.f6729b;
                    if (t8 == obj) {
                        t8 = this.f6728a.get();
                        Object obj2 = this.f6729b;
                        if (obj2 != obj && obj2 != t8) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + t8 + ". This is likely due to a circular dependency.");
                        }
                        this.f6729b = t8;
                        this.f6728a = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return t8;
    }
}
