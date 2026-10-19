package p228s6;

import A8.A;
import J4.i;
import Q8.d;

/* JADX INFO: compiled from: Dependency.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p<?> f46962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f46964c;

    public j(int i10, int i11, Class cls) {
        this((p<?>) p.a(cls), i10, i11);
    }

    public static j a(Class<?> cls) {
        return new j(0, 1, cls);
    }

    public static j b(Class<?> cls) {
        return new j(1, 0, cls);
    }

    public static j c(p<?> pVar) {
        return new j(pVar, 1, 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f46962a.equals(jVar.f46962a) && this.f46963b == jVar.f46963b && this.f46964c == jVar.f46964c;
    }

    public final int hashCode() {
        return ((((this.f46962a.hashCode() ^ 1000003) * 1000003) ^ this.f46963b) * 1000003) ^ this.f46964c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f46962a);
        sb2.append(", type=");
        int i10 = this.f46963b;
        if (i10 == 1) {
            str = "required";
        } else {
            str = i10 == 0 ? "optional" : "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i11 = this.f46964c;
        if (i11 == 0) {
            str2 = "direct";
        } else if (i11 == 1) {
            str2 = "provider";
        } else {
            if (i11 != 2) {
                throw new AssertionError(i.b(i11, "Unsupported injection: "));
            }
            str2 = "deferred";
        }
        return d.a(sb2, str2, "}");
    }

    public j(p<?> pVar, int i10, int i11) {
        A.d(pVar, "Null dependency anInterface.");
        this.f46962a = pVar;
        this.f46963b = i10;
        this.f46964c = i11;
    }
}
