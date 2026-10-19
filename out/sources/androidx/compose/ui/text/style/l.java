package androidx.compose.ui.text.style;

/* JADX INFO: compiled from: TextMotion.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f15681c = new l(2, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f15682d = new l(1, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15684b;

    /* JADX INFO: compiled from: TextMotion.android.kt */
    @Ha.a
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f15685a;

        public static final boolean a(int i10, int i11) {
            return i10 == i11;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.f15685a == ((a) obj).f15685a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f15685a);
        }

        public final String toString() {
            int i10 = this.f15685a;
            if (a(i10, 1)) {
                return "Linearity.Linear";
            }
            if (a(i10, 2)) {
                return "Linearity.FontHinting";
            }
            return a(i10, 3) ? "Linearity.None" : "Invalid";
        }
    }

    public l(int i10, boolean z10) {
        this.f15683a = i10;
        this.f15684b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return a.a(this.f15683a, lVar.f15683a) && this.f15684b == lVar.f15684b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15684b) + (Integer.hashCode(this.f15683a) * 31);
    }

    public final String toString() {
        if (equals(f15681c)) {
            return "TextMotion.Static";
        }
        return equals(f15682d) ? "TextMotion.Animated" : "Invalid";
    }
}
