package G8;

/* JADX INFO: compiled from: UserDetailsResult.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D f3413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f3414b;

    public E(D d10, t tVar) {
        this.f3413a = d10;
        this.f3414b = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e10 = (E) obj;
        return kotlin.jvm.internal.i.a(this.f3413a, e10.f3413a) && kotlin.jvm.internal.i.a(this.f3414b, e10.f3414b);
    }

    public final int hashCode() {
        return this.f3414b.hashCode() + (this.f3413a.hashCode() * 31);
    }

    public final String toString() {
        return "UserDetailsResult(userDetails=" + this.f3413a + ", personalInfoUpdate=" + this.f3414b + ")";
    }
}
