package H3;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: ModelCache.java */
/* JADX INFO: loaded from: classes.dex */
public final class p<A, B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f3664a = new o(500);

    /* JADX INFO: compiled from: ModelCache.java */
    public static final class a<A> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final ArrayDeque f3665b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public A f3666a;

        static {
            char[] cArr = X3.j.f7214a;
            f3665b = new ArrayDeque(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a a(Object obj) {
            a aVar;
            ArrayDeque arrayDeque = f3665b;
            synchronized (arrayDeque) {
                aVar = (a) arrayDeque.poll();
            }
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f3666a = obj;
            return aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            aVar.getClass();
            return this.f3666a.equals(aVar.f3666a);
        }

        public final int hashCode() {
            return this.f3666a.hashCode();
        }
    }
}
