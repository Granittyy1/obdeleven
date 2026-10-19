package Z2;

/* JADX INFO: compiled from: Dimension.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: Z2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Dimension.kt */
    public static final class C0110a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7725a;

        public C0110a(int i10) {
            this.f7725a = i10;
            if (i10 <= 0) {
                throw new IllegalArgumentException("px must be > 0.");
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0110a) {
                if (this.f7725a == ((C0110a) obj).f7725a) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f7725a;
        }

        public final String toString() {
            return String.valueOf(this.f7725a);
        }
    }

    /* JADX INFO: compiled from: Dimension.kt */
    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f7726a = new b();

        public final String toString() {
            return "Dimension.Undefined";
        }
    }
}
