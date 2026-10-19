package J8;

/* JADX INFO: compiled from: DimensionProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface h {

    /* JADX INFO: compiled from: DimensionProvider.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4046b;

        public a(int i10, int i11) {
            this.f4045a = i10;
            this.f4046b = i11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f4045a == aVar.f4045a && this.f4046b == aVar.f4046b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f4046b) + (Integer.hashCode(this.f4045a) * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Dimension(width=");
            sb2.append(this.f4045a);
            sb2.append(", height=");
            return p005a4.q.c(sb2, this.f4046b, ")");
        }
    }

    void a(a aVar);

    a b();

    void c(a aVar);

    a d();
}
