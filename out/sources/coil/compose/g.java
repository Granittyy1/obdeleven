package coil.compose;

/* JADX INFO: compiled from: utils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f22768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f22769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final coil.f f22770c;

    public g(Object obj, l lVar, coil.f fVar) {
        this.f22768a = obj;
        this.f22769b = lVar;
        this.f22770c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f22769b.a(this.f22768a, gVar.f22768a) && kotlin.jvm.internal.i.a(this.f22770c, gVar.f22770c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f22770c.hashCode() + (this.f22769b.b(this.f22768a) * 31);
    }
}
