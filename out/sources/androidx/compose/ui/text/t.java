package androidx.compose.ui.text;

/* JADX INFO: compiled from: AndroidTextStyle.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f15686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f15687b;

    public t(s sVar, r rVar) {
        this.f15686a = sVar;
        this.f15687b = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return kotlin.jvm.internal.i.a(this.f15687b, tVar.f15687b) && kotlin.jvm.internal.i.a(this.f15686a, tVar.f15686a);
    }

    public final int hashCode() {
        s sVar = this.f15686a;
        int iHashCode = (sVar != null ? sVar.hashCode() : 0) * 31;
        r rVar = this.f15687b;
        return iHashCode + (rVar != null ? rVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f15686a + ", paragraphSyle=" + this.f15687b + ')';
    }

    public t() {
        this(null, new r(0));
    }
}
