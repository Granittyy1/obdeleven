package androidx.compose.ui.graphics.colorspace;

import p033c7.A;
import p033c7.C1493f;
import p033c7.C1494g;
import p033c7.H;
import p033c7.S;
import p033c7.T;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements j, p183oa.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13612c;

    public /* synthetic */ q(int i10, Object obj) {
        this.f13611b = i10;
        this.f13612c = obj;
    }

    @Override // p183oa.b
    public void a(Object obj) {
        switch (this.f13611b) {
            case 1:
                A a10 = (A) this.f13612c;
                a10.getClass();
                a10.f22340b = io.reactivex.internal.operators.maybe.b.f40795b;
                break;
            default:
                N7.e eVar = (N7.e) obj;
                C1494g c1494g = ((H) this.f13612c).f22355c;
                T t8 = c1494g.f22447a;
                t8.getClass();
                new io.reactivex.internal.operators.completable.f(new io.reactivex.internal.operators.completable.e(new io.reactivex.internal.operators.completable.c(new S(t8, eVar)).d(new C1493f(c1494g, eVar)).d(new B6.a()), new A8.f(6), qa.a.f46190c), new B6.b(2)).e();
                break;
        }
    }

    @Override // androidx.compose.ui.graphics.colorspace.j
    public double g(double d10) {
        t tVar = (t) this.f13612c;
        double d11 = tVar.f13617b;
        if (d10 >= tVar.f13620e) {
            return Math.pow((d11 * d10) + tVar.f13618c, tVar.f13616a) + tVar.f13621f;
        }
        return tVar.f13622g + (tVar.f13619d * d10);
    }
}
