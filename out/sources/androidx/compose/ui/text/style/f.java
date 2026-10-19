package androidx.compose.ui.text.style;

import p005a4.q;

/* JADX INFO: compiled from: LineHeightStyle.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f15661c = new f(a.f15665c, 17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f15662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15663b;

    /* JADX INFO: compiled from: LineHeightStyle.kt */
    @Ha.a
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final float f15664b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final float f15665c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final float f15666d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f15667a;

        static {
            a(0.0f);
            a(0.5f);
            f15664b = 0.5f;
            a(-1.0f);
            f15665c = -1.0f;
            a(1.0f);
            f15666d = 1.0f;
        }

        public static void a(float f10) {
            if ((0.0f > f10 || f10 > 1.0f) && f10 != -1.0f) {
                Y.a.c("topRatio should be in [0..1] range or -1");
            }
        }

        public static String b(float f10) {
            if (f10 == 0.0f) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f10 == f15664b) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f10 == f15665c) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f10 == f15666d) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f10 + ')';
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return Float.compare(this.f15667a, ((a) obj).f15667a) == 0;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.f15667a);
        }

        public final String toString() {
            return b(this.f15667a);
        }
    }

    /* JADX INFO: compiled from: LineHeightStyle.kt */
    @Ha.a
    public static final class b {
        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final String toString() {
            return "Mode(value=0)";
        }
    }

    /* JADX INFO: compiled from: LineHeightStyle.kt */
    @Ha.a
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f15668a;

        public static String a(int i10) {
            if (i10 == 1) {
                return "LineHeightStyle.Trim.FirstLineTop";
            }
            if (i10 == 16) {
                return "LineHeightStyle.Trim.LastLineBottom";
            }
            if (i10 == 17) {
                return "LineHeightStyle.Trim.Both";
            }
            return i10 == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        }

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return this.f15668a == ((c) obj).f15668a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f15668a);
        }

        public final String toString() {
            return a(this.f15668a);
        }
    }

    public f(float f10, int i10) {
        this.f15662a = f10;
        this.f15663b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        float f10 = fVar.f15662a;
        float f11 = a.f15664b;
        return Float.compare(this.f15662a, f10) == 0 && this.f15663b == fVar.f15663b;
    }

    public final int hashCode() {
        float f10 = a.f15664b;
        return Integer.hashCode(0) + q.b(this.f15663b, Float.hashCode(this.f15662a) * 31, 31);
    }

    public final String toString() {
        return "LineHeightStyle(alignment=" + ((Object) a.b(this.f15662a)) + ", trim=" + ((Object) c.a(this.f15663b)) + ",mode=Mode(value=0))";
    }
}
