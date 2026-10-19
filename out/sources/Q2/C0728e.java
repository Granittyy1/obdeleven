package Q2;

/* JADX INFO: renamed from: Q2.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Preference.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0728e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f5017b;

    public C0728e(String str, Long l10) {
        this.f5016a = str;
        this.f5017b = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0728e)) {
            return false;
        }
        C0728e c0728e = (C0728e) obj;
        return kotlin.jvm.internal.i.a(this.f5016a, c0728e.f5016a) && kotlin.jvm.internal.i.a(this.f5017b, c0728e.f5017b);
    }

    public final int hashCode() {
        int iHashCode = this.f5016a.hashCode() * 31;
        Long l10 = this.f5017b;
        return iHashCode + (l10 == null ? 0 : l10.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.f5016a + ", value=" + this.f5017b + ')';
    }
}
