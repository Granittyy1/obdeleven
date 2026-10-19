package U4;

/* JADX INFO: renamed from: U4.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0805m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C0805m f6475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0806n f6476c = new C0806n(0, 0, 0, false, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0806n f6477a;

    public static synchronized C0805m a() {
        try {
            if (f6475b == null) {
                f6475b = new C0805m();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6475b;
    }
}
