package B3;

import java.util.HashMap;

/* JADX INFO: compiled from: DataRewinderRegistry.java */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1504b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f1505a = new HashMap();

    /* JADX INFO: compiled from: DataRewinderRegistry.java */
    public class a implements e.a<Object> {
        @Override // B3.e.a
        public final Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // B3.e.a
        public final e<Object> b(Object obj) {
            return new b(obj);
        }
    }

    /* JADX INFO: compiled from: DataRewinderRegistry.java */
    public static final class b implements e<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f1506a;

        public b(Object obj) {
            this.f1506a = obj;
        }

        @Override // B3.e
        public final Object a() {
            return this.f1506a;
        }

        @Override // B3.e
        public final void b() {
        }
    }
}
