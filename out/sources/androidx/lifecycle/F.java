package androidx.lifecycle;

import bo.app.F0;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class F implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17726c;

    public /* synthetic */ F(int i10, Object obj) {
        this.f17725b = i10;
        this.f17726c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17725b) {
            case 0:
                G g10 = (G) this.f17726c;
                int i10 = g10.f17730c;
                C1378v c1378v = g10.f17734g;
                if (i10 == 0) {
                    g10.f17731d = true;
                    c1378v.f(Lifecycle.Event.ON_PAUSE);
                }
                if (g10.f17729b == 0 && g10.f17731d) {
                    c1378v.f(Lifecycle.Event.ON_STOP);
                    g10.f17732e = true;
                    break;
                }
                break;
            case 1:
                p182o9.c cVar = (p182o9.c) this.f17726c;
                ((p109i8.i) cVar.f31997n).m(new F0(3, cVar));
                break;
            default:
                ((p297y1.i) this.f17726c).f48128l--;
                break;
        }
    }
}
