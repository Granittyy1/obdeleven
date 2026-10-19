package p033c7;

import Q3.k;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayCallbacks;
import p083g7.h;
import p083g7.m;
import p183oa.a;
import p183oa.c;

/* JADX INFO: renamed from: c7.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1504q implements a, c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22492c;

    public /* synthetic */ C1504q(Object obj, Object obj2) {
        this.f22491b = obj;
        this.f22492c = obj2;
    }

    @Override // p183oa.c, p311z4.f
    public Object apply(Object obj) {
        Y y10 = (Y) obj;
        Y.a aVarO = Y.O(y10);
        aVarO.r();
        Y.I((Y) aVarO.f29047c);
        long jM = y10.M() + 1;
        aVarO.r();
        Y.H((Y) aVarO.f29047c, jM);
        Y yP = aVarO.p();
        Z.a aVarK = Z.K((Z) this.f22491b);
        String strB = ((m) this.f22492c).b();
        strB.getClass();
        aVarK.r();
        Z.H((Z) aVarK.f29047c).put(strB, yP);
        return aVarK.p();
    }

    @Override // p183oa.a
    public void run() {
        C1506t c1506t = (C1506t) this.f22491b;
        O o10 = c1506t.f22503f;
        o10.getClass();
        h hVar = c1506t.f22505h;
        k kVar = hVar.f35628b;
        FirebaseInAppMessagingDisplayCallbacks.InAppMessagingErrorReason inAppMessagingErrorReason = (FirebaseInAppMessagingDisplayCallbacks.InAppMessagingErrorReason) this.f22492c;
        if (!kVar.f5085b) {
            o10.f22395c.getId().f(o10.f22399g, new L(o10, hVar, inAppMessagingErrorReason));
        }
        C1501n c1501n = o10.f22398f;
        for (C1501n.c cVar : c1501n.f22474d.values()) {
            cVar.getClass();
            c1501n.f22471a.execute(new RunnableC1498k(cVar, hVar, inAppMessagingErrorReason));
        }
    }
}
