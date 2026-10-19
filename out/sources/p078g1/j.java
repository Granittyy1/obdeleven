package p078g1;

import p114j1.A;

/* JADX INFO: compiled from: DeviceInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f35261c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35263b;

    /* JADX INFO: compiled from: DeviceInfo.java */
    public static final class a {
    }

    static {
        new j(new a());
        A.B(0);
        A.B(1);
        A.B(2);
        A.B(3);
    }

    public j(a aVar) {
        aVar.getClass();
        this.f35262a = 0;
        this.f35263b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        jVar.getClass();
        return this.f35262a == jVar.f35262a && this.f35263b == jVar.f35263b;
    }

    public final int hashCode() {
        return (((16337 + this.f35262a) * 31) + this.f35263b) * 31;
    }
}
