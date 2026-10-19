package p131k5;

import H2.b;
import android.os.Looper;
import com.google.android.gms.internal.measurement.HandlerC1801e0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class Y2 extends AbstractC2589z0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HandlerC1801e0 f42060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f42061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2510f3 f42062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2500d3 f42063f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f42064g;

    public Y2(C2523i1 c2523i1) {
        super(c2523i1);
        this.f42061d = true;
        this.f42062e = new C2510f3(this);
        this.f42063f = new C2500d3(this);
        b bVar = new b();
        bVar.f3627c = this;
        this.f42064g = bVar;
    }

    @Override // p131k5.AbstractC2589z0
    public final boolean v() {
        return false;
    }

    public final void w() {
        p();
        if (this.f42060c == null) {
            this.f42060c = new HandlerC1801e0(Looper.getMainLooper());
        }
    }
}
