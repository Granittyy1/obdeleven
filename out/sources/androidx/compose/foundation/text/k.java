package androidx.compose.foundation.text;

/* JADX INFO: compiled from: KeyboardOptions.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k f11351g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f11353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f11356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Z.c f11357f;

    static {
        int i10 = 0;
        f11351g = new k(null, i10, i10, 127);
    }

    public k(int i10, Boolean bool, int i11, int i12, Boolean bool2, Z.c cVar) {
        this.f11352a = i10;
        this.f11353b = bool;
        this.f11354c = i11;
        this.f11355d = i12;
        this.f11356e = bool2;
        this.f11357f = cVar;
    }

    public static k a(int i10, int i11, int i12, int i13) {
        k kVar = f11351g;
        if ((i13 & 1) != 0) {
            i10 = kVar.f11352a;
        }
        int i14 = i10;
        if ((i13 & 4) != 0) {
            i11 = kVar.f11354c;
        }
        int i15 = i11;
        if ((i13 & 8) != 0) {
            i12 = kVar.f11355d;
        }
        return new k(i14, kVar.f11353b, i15, i12, null, null);
    }

    public final androidx.compose.ui.text.input.l b(boolean z10) {
        int i10 = this.f11352a;
        androidx.compose.ui.text.input.m mVar = new androidx.compose.ui.text.input.m(i10);
        if (androidx.compose.ui.text.input.m.a(i10, -1)) {
            mVar = null;
        }
        int i11 = mVar != null ? mVar.f15556a : 0;
        Boolean bool = this.f11353b;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        int i12 = this.f11354c;
        androidx.compose.ui.text.input.n nVar = new androidx.compose.ui.text.input.n(i12);
        if (androidx.compose.ui.text.input.n.a(i12, 0)) {
            nVar = null;
        }
        int i13 = nVar != null ? nVar.f15557a : 1;
        int i14 = this.f11355d;
        androidx.compose.ui.text.input.k kVar = androidx.compose.ui.text.input.k.a(i14, -1) ? null : new androidx.compose.ui.text.input.k(i14);
        int i15 = kVar != null ? kVar.f15548a : 1;
        Z.c cVar = this.f11357f;
        if (cVar == null) {
            cVar = Z.c.f7671d;
        }
        return new androidx.compose.ui.text.input.l(z10, i11, zBooleanValue, i13, i15, cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return androidx.compose.ui.text.input.m.a(this.f11352a, kVar.f11352a) && kotlin.jvm.internal.i.a(this.f11353b, kVar.f11353b) && androidx.compose.ui.text.input.n.a(this.f11354c, kVar.f11354c) && androidx.compose.ui.text.input.k.a(this.f11355d, kVar.f11355d) && kotlin.jvm.internal.i.a(null, null) && kotlin.jvm.internal.i.a(this.f11356e, kVar.f11356e) && kotlin.jvm.internal.i.a(this.f11357f, kVar.f11357f);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f11352a) * 31;
        Boolean bool = this.f11353b;
        int iB = p005a4.q.b(this.f11355d, p005a4.q.b(this.f11354c, (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31, 31), 961);
        Boolean bool2 = this.f11356e;
        int iHashCode2 = (iB + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Z.c cVar = this.f11357f;
        return iHashCode2 + (cVar != null ? cVar.f7672b.hashCode() : 0);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) androidx.compose.ui.text.input.m.b(this.f11352a)) + ", autoCorrectEnabled=" + this.f11353b + ", keyboardType=" + ((Object) androidx.compose.ui.text.input.n.b(this.f11354c)) + ", imeAction=" + ((Object) androidx.compose.ui.text.input.k.b(this.f11355d)) + ", platformImeOptions=nullshowKeyboardOnFocus=" + this.f11356e + ", hintLocales=" + this.f11357f + ')';
    }

    public /* synthetic */ k(Boolean bool, int i10, int i11, int i12) {
        this(-1, (i12 & 2) != 0 ? null : bool, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? -1 : i11, null, null);
    }
}
