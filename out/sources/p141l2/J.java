package p141l2;

import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: NavOptions.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f44241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f44242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f44243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f44244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f44245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f44246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f44247h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f44248i;
    public String j;

    /* JADX INFO: compiled from: NavOptions.android.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f44249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f44250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f44251c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f44252d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f44253e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f44254f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f44255g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f44256h;
    }

    public J() {
        throw null;
    }

    public J(boolean z10, boolean z11, int i10, boolean z12, boolean z13, int i11, int i12) {
        this.f44240a = z10;
        this.f44241b = z11;
        this.f44242c = i10;
        this.f44243d = z12;
        this.f44244e = z13;
        this.f44245f = i11;
        this.f44246g = i12;
        this.f44247h = -1;
        this.f44248i = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof J)) {
            return false;
        }
        J j = (J) obj;
        return this.f44240a == j.f44240a && this.f44241b == j.f44241b && this.f44242c == j.f44242c && i.a(this.j, j.j) && i.a(null, null) && i.a(null, null) && this.f44243d == j.f44243d && this.f44244e == j.f44244e && this.f44245f == j.f44245f && this.f44246g == j.f44246g && this.f44247h == j.f44247h && this.f44248i == j.f44248i;
    }

    public final int hashCode() {
        int i10 = (((((this.f44240a ? 1 : 0) * 31) + (this.f44241b ? 1 : 0)) * 31) + this.f44242c) * 31;
        String str = this.j;
        return ((((((((((((i10 + (str != null ? str.hashCode() : 0)) * 29791) + (this.f44243d ? 1 : 0)) * 31) + (this.f44244e ? 1 : 0)) * 31) + this.f44245f) * 31) + this.f44246g) * 31) + this.f44247h) * 31) + this.f44248i;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(J.class.getSimpleName());
        sb2.append("(");
        if (this.f44240a) {
            sb2.append("launchSingleTop ");
        }
        if (this.f44241b) {
            sb2.append("restoreState ");
        }
        String str = this.j;
        if ((str != null || this.f44242c != -1) && str != null) {
            sb2.append("popUpTo(");
            sb2.append(str);
            if (this.f44243d) {
                sb2.append(" inclusive");
            }
            if (this.f44244e) {
                sb2.append(" saveState");
            }
            sb2.append(")");
        }
        int i10 = this.f44248i;
        int i11 = this.f44247h;
        int i12 = this.f44246g;
        int i13 = this.f44245f;
        if (i13 != -1 || i12 != -1 || i11 != -1 || i10 != -1) {
            sb2.append("anim(enterAnim=0x");
            sb2.append(Integer.toHexString(i13));
            sb2.append(" exitAnim=0x");
            sb2.append(Integer.toHexString(i12));
            sb2.append(" popEnterAnim=0x");
            sb2.append(Integer.toHexString(i11));
            sb2.append(" popExitAnim=0x");
            sb2.append(Integer.toHexString(i10));
            sb2.append(")");
        }
        String string = sb2.toString();
        i.d(string, "toString(...)");
        return string;
    }
}
