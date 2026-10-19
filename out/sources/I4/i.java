package I4;

import android.content.Intent;
import com.google.firebase.messaging.AbstractServiceC2046i;
import java.util.HashSet;
import p033c7.A;
import p033c7.C1512z;
import p033c7.S;
import p033c7.T;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements K4.a.InterfaceC0060a, p183oa.c, p191p5.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3858c;

    public /* synthetic */ i(Object obj, Object obj2) {
        this.f3857b = obj;
        this.f3858c = obj2;
    }

    @Override // p183oa.c, p311z4.f
    public Object apply(Object obj) {
        N7.b bVar = (N7.b) obj;
        A a10 = (A) this.f3857b;
        a10.getClass();
        bVar.toString();
        Q3.d.B();
        N7.b.a aVarK = N7.b.K();
        for (N7.a aVar : bVar.I()) {
            if (!((HashSet) this.f3858c).contains(aVar.J())) {
                aVarK.r();
                N7.b.H((N7.b) aVarK.f29047c, aVar);
            }
        }
        N7.b bVarP = aVarK.p();
        bVarP.toString();
        Q3.d.B();
        T t8 = a10.f22339a;
        t8.getClass();
        return new io.reactivex.internal.operators.completable.c(new S(t8, bVarP)).d(new C1512z(a10, bVarP));
    }

    @Override // p191p5.c
    public void e(p191p5.g gVar) {
        ((AbstractServiceC2046i) this.f3857b).lambda$onStartCommand$1((Intent) this.f3858c, gVar);
    }

    @Override // K4.a.InterfaceC0060a
    public Object k() {
        return ((o) this.f3857b).f3873c.R0((C4.l) this.f3858c);
    }
}
