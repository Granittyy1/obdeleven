package kotlinx.coroutines;

/* JADX INFO: compiled from: DefaultExecutor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H f43173a;

    static {
        String property;
        H h8;
        int i10 = kotlinx.coroutines.internal.y.f43506a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            Sa.b bVar = N.f43198a;
            kotlin.coroutines.e.a aVar = kotlinx.coroutines.internal.q.f43500a;
            aVar.getClass();
            h8 = !(aVar instanceof H) ? D.j : (H) aVar;
        } else {
            h8 = D.j;
        }
        f43173a = h8;
    }
}
