package Z2;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f7731c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f7732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f7733b;

    static {
        a.b bVar = a.b.f7726a;
        f7731c = new e(bVar, bVar);
    }

    public e(a aVar, a aVar2) {
        this.f7732a = aVar;
        this.f7733b = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.i.a(this.f7732a, eVar.f7732a) && kotlin.jvm.internal.i.a(this.f7733b, eVar.f7733b);
    }

    public final int hashCode() {
        return this.f7733b.hashCode() + (this.f7732a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f7732a + ", height=" + this.f7733b + ')';
    }
}
