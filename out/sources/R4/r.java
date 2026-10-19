package R4;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5300b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f5301c;

    public /* synthetic */ r() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5300b) {
            case 0:
                v vVar = (v) this.f5301c;
                synchronized (vVar) {
                    if (vVar.f5307b == 1) {
                        vVar.a(1, "Timed out while binding");
                    }
                    break;
                }
                return;
            default:
                ((com.google.android.gms.measurement.internal.e) this.f5301c).Q();
                return;
        }
    }

    public /* synthetic */ r(v vVar) {
        this.f5301c = vVar;
    }
}
