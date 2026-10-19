package S4;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class y extends v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final WeakReference f5557f = new WeakReference(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WeakReference f5558e;

    public y(byte[] bArr) {
        super(bArr);
        this.f5558e = f5557f;
    }

    public abstract byte[] c0();

    @Override // S4.v
    public final byte[] g() {
        byte[] bArrC0;
        synchronized (this) {
            try {
                bArrC0 = (byte[]) this.f5558e.get();
                if (bArrC0 == null) {
                    bArrC0 = c0();
                    this.f5558e = new WeakReference(bArrC0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrC0;
    }
}
