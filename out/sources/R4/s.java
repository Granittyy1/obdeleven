package R4;

import S4.C0760b;
import T4.g0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5303c;

    public /* synthetic */ s(int i10, Object obj) {
        this.f5302b = i10;
        this.f5303c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5302b) {
            case 0:
                ((v) this.f5303c).a(2, "Service disconnected");
                break;
            default:
                ((g0) this.f5303c).f5957i.b(new C0760b(4, null, null));
                break;
        }
    }
}
