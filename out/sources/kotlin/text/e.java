package kotlin.text;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Na.i f43150b;

    public e(String str, Na.i iVar) {
        this.f43149a = str;
        this.f43150b = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.i.a(this.f43149a, eVar.f43149a) && kotlin.jvm.internal.i.a(this.f43150b, eVar.f43150b);
    }

    public final int hashCode() {
        return this.f43150b.hashCode() + (this.f43149a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f43149a + ", range=" + this.f43150b + ')';
    }
}
