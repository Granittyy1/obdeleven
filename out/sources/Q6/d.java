package Q6;

import U1.l;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.E;
import androidx.media3.exoplayer.C1390h;
import com.google.common.collect.ImmutableList;
import com.voltasit.obdeleven.data.providers.u;
import com.voltasit.obdeleven.presentation.SfdViewModel;
import com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListFragment;
import java.util.List;
import java.util.concurrent.Executor;
import p033c7.X;
import p078g1.y;
import p114j1.j;
import p220r9.M;
import p228s6.p;
import p228s6.q;
import p237t3.InterfaceC2794g;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements p228s6.d, com.google.common.base.c, p096h7.a.InterfaceC0377a, InterfaceC2794g, E, M.b, j.a, v1.j.h.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5110b;

    public /* synthetic */ d(Object obj) {
        this.f5110b = obj;
    }

    @Override // p237t3.InterfaceC2794g
    public void a(com.android.billingclient.api.a responseCode, List list) {
        u this$0 = (u) this.f5110b;
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(responseCode, "responseCode");
        this$0.f30282a.f("GooglePurchaseProviderImpl", "onPurchaseUpdated(" + responseCode + ")");
    }

    @Override // com.google.common.base.c
    public Object apply(Object obj) {
        l lVar = (l) obj;
        ((U1.c) this.f5110b).getClass();
        return lVar;
    }

    @Override // r9.M.b
    public void b(int i10) {
        p073f9.b bVar = (p073f9.b) this.f5110b;
        if (i10 < 0) {
            bVar.getClass();
            return;
        }
        p073f9.b.C0365b c0365b = (p073f9.b.C0365b) bVar.f35015v.f36779a.get(i10);
        c0365b.f35021a.f34189a.setVisible(!c0365b.f35021a.f34189a.isVisible());
        bVar.f35015v.notifyDataSetChanged();
        if (bVar.f35013t != 1) {
            bVar.f35005l.getLineData().notifyDataChanged();
            bVar.f35005l.notifyDataSetChanged();
            bVar.f35005l.invalidate();
        }
    }

    @Override // v1.j.h.a
    public List c(int i10, y yVar, int[] iArr) {
        ImmutableList.b bVar = ImmutableList.f27874c;
        ImmutableList.a aVar = new ImmutableList.a();
        for (int i11 = 0; i11 < yVar.f35491a; i11++) {
            int i12 = i11;
            aVar.c(new v1.j.b(i10, yVar, i12, (v1.j.d) this.f5110b, iArr[i11]));
        }
        return aVar.h();
    }

    @Override // p096h7.a.InterfaceC0377a
    public void d(p096h7.b bVar) {
        X x10 = (X) this.f5110b;
        x10.getClass();
        x10.f22414a = bVar.get();
    }

    @Override // p228s6.d
    public Object f(q qVar) {
        return new com.google.firebase.heartbeatinfo.a((Context) qVar.a(Context.class), ((p144l6.e) qVar.a(p144l6.e.class)).d(), qVar.e(p.a(f.class)), qVar.d(B7.h.class), (Executor) qVar.c((p) this.f5110b));
    }

    @Override // androidx.fragment.app.E
    public void h(Bundle bundle, String str) {
        OnlineControlUnitListFragment this$0 = (OnlineControlUnitListFragment) this.f5110b;
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(str, "<anonymous parameter 0>");
        com.obdeleven.service.model.f fVar = this$0.V().f32093b0;
        if (fVar == null) {
            kotlin.jvm.internal.i.m("tempGateway");
            throw null;
        }
        SfdViewModel sfdViewModelY = this$0.Y();
        String objectId = fVar.f29320b.getControlUnitBase().getObjectId();
        kotlin.jvm.internal.i.d(objectId, "getObjectId(...)");
        sfdViewModelY.d(objectId, fVar.n().shortValue());
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        ((p162n1.b) obj).d((C1390h) this.f5110b);
    }

    public /* synthetic */ d(n1.b.a aVar, C1390h c1390h) {
        this.f5110b = c1390h;
    }
}
