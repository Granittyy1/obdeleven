package kotlinx.coroutines;

/* JADX INFO: renamed from: kotlinx.coroutines.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CoroutineName.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2715z extends kotlin.coroutines.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f43620c = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43621b;

    /* JADX INFO: renamed from: kotlinx.coroutines.z$a */
    /* JADX INFO: compiled from: CoroutineName.kt */
    public static final class a implements kotlin.coroutines.e.b<C2715z> {
    }

    public C2715z(String str) {
        super(f43620c);
        this.f43621b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2715z) && kotlin.jvm.internal.i.a(this.f43621b, ((C2715z) obj).f43621b);
    }

    public final int hashCode() {
        return this.f43621b.hashCode();
    }

    public final String toString() {
        return B7.b.g(new StringBuilder("CoroutineName("), this.f43621b, ')');
    }
}
