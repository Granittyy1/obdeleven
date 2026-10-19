package p131k5;

/* JADX INFO: renamed from: k5.e1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2503e1 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2493c1 f42153b;

    public C2503e1(C2493c1 c2493c1, String str) {
        this.f42153b = c2493c1;
        this.f42152a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f42153b.d().f41712f.b(th, this.f42152a);
    }
}
