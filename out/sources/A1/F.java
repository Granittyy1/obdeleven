package A1;

/* JADX INFO: compiled from: SeekMap.java */
/* JADX INFO: loaded from: classes.dex */
public interface F {

    /* JADX INFO: compiled from: SeekMap.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final G f415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final G f416b;

        public a(G g10, G g11) {
            this.f415a = g10;
            this.f416b = g11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f415a.equals(aVar.f415a) && this.f416b.equals(aVar.f416b);
        }

        public final int hashCode() {
            return this.f416b.hashCode() + (this.f415a.hashCode() * 31);
        }

        public final String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder("[");
            G g10 = this.f415a;
            sb2.append(g10);
            G g11 = this.f416b;
            if (g10.equals(g11)) {
                str = "";
            } else {
                str = ", " + g11;
            }
            return Q8.d.a(sb2, str, "]");
        }
    }

    /* JADX INFO: compiled from: SeekMap.java */
    public static class b implements F {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f418b;

        public b(long j) {
            this(j, 0L);
        }

        @Override // A1.F
        public final boolean d() {
            return false;
        }

        @Override // A1.F
        public final a i(long j) {
            return this.f418b;
        }

        @Override // A1.F
        public final long k() {
            return this.f417a;
        }

        public b(long j, long j10) {
            this.f417a = j;
            G g10 = j10 == 0 ? G.f419c : new G(0L, j10);
            this.f418b = new a(g10, g10);
        }
    }

    boolean d();

    a i(long j);

    long k();
}
