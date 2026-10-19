package Y3;

import android.util.Log;

/* JADX INFO: compiled from: FactoryPools.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0107a f7598a = new C0107a();

    /* JADX INFO: compiled from: FactoryPools.java */
    public interface b<T> {
        T a();
    }

    /* JADX INFO: compiled from: FactoryPools.java */
    public static final class c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b<T> f7599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e<T> f7600b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final A0.e f7601c;

        public c(A0.e eVar, b bVar, e eVar2) {
            this.f7601c = eVar;
            this.f7599a = bVar;
            this.f7600b = eVar2;
        }

        public final T a() {
            T tA = (T) this.f7601c.a();
            if (tA == null) {
                tA = this.f7599a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    tA.getClass().toString();
                }
            }
            if (tA instanceof d) {
                tA.d().f7602a = false;
            }
            return (T) tA;
        }

        public final boolean b(T t8) {
            if (t8 instanceof d) {
                ((d) t8).d().f7602a = true;
            }
            this.f7600b.a(t8);
            return this.f7601c.b(t8);
        }
    }

    /* JADX INFO: compiled from: FactoryPools.java */
    public interface d {
        Y3.d.a d();
    }

    /* JADX INFO: compiled from: FactoryPools.java */
    public interface e<T> {
        void a(T t8);
    }

    public static c a(int i10, b bVar) {
        return new c(new A0.e(i10), bVar, f7598a);
    }

    /* JADX INFO: renamed from: Y3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FactoryPools.java */
    public class C0107a implements e<Object> {
        @Override // Y3.a.e
        public final void a(Object obj) {
        }
    }
}
