package p240t6;

import androidx.media3.exoplayer.C1391i;
import androidx.media3.exoplayer.K;
import p078g1.n;
import p114j1.A;
import p114j1.p;
import p297y1.x;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f47340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f47341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f47342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f47343e;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i10) {
        this.f47340b = i10;
        this.f47341c = obj;
        this.f47342d = obj2;
        this.f47343e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f47343e;
        Object obj2 = this.f47342d;
        Object obj3 = this.f47341c;
        switch (this.f47340b) {
            case 0:
                h hVar = (h) obj3;
                hVar.getClass();
                hVar.f47347b.execute(new p((Runnable) obj2, 3, (i.a) obj));
                break;
            default:
                x xVar = (x) obj3;
                xVar.getClass();
                int i10 = A.f40996a;
                K k10 = K.this;
                k10.getClass();
                k10.f18039s.F((n) obj2, (C1391i) obj);
                break;
        }
    }
}
