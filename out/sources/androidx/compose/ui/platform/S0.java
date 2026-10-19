package androidx.compose.ui.platform;

/* JADX INFO: compiled from: InspectableValue.kt */
/* JADX INFO: loaded from: classes.dex */
public final class S0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14962b;

    public S0(String str, Object obj) {
        this.f14961a = str;
        this.f14962b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S0)) {
            return false;
        }
        S0 s10 = (S0) obj;
        return kotlin.jvm.internal.i.a(this.f14961a, s10.f14961a) && kotlin.jvm.internal.i.a(this.f14962b, s10.f14962b);
    }

    public final int hashCode() {
        int iHashCode = this.f14961a.hashCode() * 31;
        Object obj = this.f14962b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ValueElement(name=");
        sb2.append(this.f14961a);
        sb2.append(", value=");
        return B6.c.e(sb2, this.f14962b, ')');
    }
}
