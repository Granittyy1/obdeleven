package G8;

/* JADX INFO: compiled from: UserNameAndEmail.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3416b;

    public F(String str, String str2) {
        this.f3415a = str;
        this.f3416b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        return kotlin.jvm.internal.i.a(this.f3415a, f10.f3415a) && kotlin.jvm.internal.i.a(this.f3416b, f10.f3416b);
    }

    public final int hashCode() {
        return this.f3416b.hashCode() + (this.f3415a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserNameAndEmail(userName=");
        sb2.append(this.f3415a);
        sb2.append(", email=");
        return Q8.d.a(sb2, this.f3416b, ")");
    }
}
