package p297y1;

import C4.v;
import androidx.media3.exoplayer.K;
import p114j1.A;
import p162n1.a;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f48212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f48213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f48214d;

    public /* synthetic */ t(x xVar, Object obj, long j) {
        this.f48212b = xVar;
        this.f48213c = obj;
        this.f48214d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x xVar = this.f48212b;
        xVar.getClass();
        int i10 = A.f40996a;
        K k10 = K.this;
        a aVar = k10.f18039s;
        Object obj = this.f48213c;
        aVar.K(obj, this.f48214d);
        if (k10.f18004Q == obj) {
            k10.f18033m.e(26, new v(5));
        }
    }
}
