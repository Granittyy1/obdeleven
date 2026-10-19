package S4;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public class I {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final I f5520c = new I(true, null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Exception f5522b;

    public I(boolean z10, String str, Exception exc) {
        this.f5521a = z10;
        this.f5522b = exc;
    }

    public static I b(String str) {
        return new I(false, str, null);
    }

    public static I c(String str, Exception exc) {
        return new I(false, str, exc);
    }

    public void a() {
    }
}
