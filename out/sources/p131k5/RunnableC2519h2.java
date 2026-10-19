package p131k5;

import android.content.ComponentName;
import com.google.android.gms.measurement.internal.e;

/* JADX INFO: renamed from: k5.h2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2519h2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Comparable f42195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f42196d;

    public /* synthetic */ RunnableC2519h2(Object obj, Comparable comparable, int i10) {
        this.f42194b = i10;
        this.f42195c = comparable;
        this.f42196d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42194b) {
            case 0:
                ((e) this.f42196d).I((Boolean) this.f42195c, true);
                break;
            default:
                C2587y2 c2587y2 = ((P2) this.f42196d).f41958d;
                c2587y2.p();
                if (c2587y2.f42536d != null) {
                    c2587y2.f42536d = null;
                    c2587y2.d().f41719n.b((ComponentName) this.f42195c, "Disconnected from device MeasurementService");
                    c2587y2.p();
                    c2587y2.C();
                }
                break;
        }
    }
}
