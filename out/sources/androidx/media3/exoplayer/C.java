package androidx.media3.exoplayer;

import B8.AbstractC0637l;
import S6.a;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.inappmessaging.EventType;
import com.parse.ParseException;
import com.parse.SaveCallback;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.devices.DeviceFragment;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import java.util.List;
import p033c7.C1501n;
import p033c7.C1506t;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C implements j1.j.a, p183oa.a, SaveCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17950b;

    public /* synthetic */ C(Object obj) {
        this.f17950b = obj;
    }

    public void a(Q8.b bVar) {
        DeviceFragment this$0 = (DeviceFragment) this.f17950b;
        kotlin.jvm.internal.i.e(this$0, "this$0");
        if (bVar == null) {
            AbstractC0637l abstractC0637l = this$0.f32127m;
            if (abstractC0637l == null) {
                kotlin.jvm.internal.i.m("binding");
                throw null;
            }
            p110i9.d dVar = abstractC0637l.f1998t;
            kotlin.jvm.internal.i.b(dVar);
            List<T> list = dVar.f36779a;
            kotlin.jvm.internal.i.d(list, "getItems(...)");
            this$0.P(list);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable(this$0.f32126l, bVar);
        Bundle bundle2 = new Bundle();
        bundle2.putString("key_title", this$0.getString(R.string.common_rename));
        String str = bVar.f5127b;
        if (str == null) {
            str = "";
        }
        bundle2.putString("key_value", str);
        bundle2.putBundle("key_bundle", bundle);
        com.voltasit.obdeleven.ui.dialogs.E e10 = new com.voltasit.obdeleven.ui.dialogs.E();
        e10.setArguments(bundle2);
        e10.f32261r = this$0.getFragmentManager();
        e10.setTargetFragment(this$0, 0);
        e10.A();
    }

    @Override // com.parse.ParseCallback1
    public void done(Throwable th) {
        ParseException parseException = (ParseException) th;
        p073f9.b bVar = (p073f9.b) this.f17950b;
        bVar.w();
        if (parseException != null) {
            p279w9.b bVar2 = Application.f29634b;
            P8.c.b(parseException);
            MainActivity mainActivityQ = bVar.q();
            p220r9.P.a(mainActivityQ, mainActivityQ.getString(R.string.snackbar_chart_save_failed));
            return;
        }
        bVar.U(3);
        p279w9.a aVar = new p279w9.a(B7.b.c("CHARTS", bVar.f35016w.f29321c.f42726c.getObjectId() + bVar.f35016w.f29320b.getObjectId()), 3600000L);
        p279w9.b bVar3 = Application.f29634b;
        if (bVar3.f(aVar, true) != null) {
            bVar3.a(aVar);
        }
        MainActivity mainActivityQ2 = bVar.q();
        p220r9.P.e(mainActivityQ2, mainActivityQ2.getString(R.string.snackbar_chart_saved));
        UserTrackingUtils.c(UserTrackingUtils.Key.f34260d, 1);
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        ((g1.v.c) obj).x(((K) this.f17950b).f18002O);
    }

    @Override // p183oa.a
    public void run() {
        boolean zB;
        C1506t c1506t = (C1506t) this.f17950b;
        final p033c7.O o10 = c1506t.f22503f;
        o10.getClass();
        final p083g7.h hVar = c1506t.f22505h;
        if (!hVar.f35628b.f5085b) {
            o10.f22395c.getId().f(o10.f22399g, new p191p5.e() { // from class: c7.K
                @Override // p191p5.e
                public final void onSuccess(Object obj) {
                    EventType eventType = EventType.IMPRESSION_EVENT_TYPE;
                    O o11 = o10;
                    a.C0079a c0079aA = o11.a(hVar, (String) obj);
                    c0079aA.r();
                    a.I((a) c0079aA.f29047c, eventType);
                    o11.f22393a.a(c0079aA.p().n());
                }
            });
            int i10 = c7.O.a.f22400a[hVar.f35627a.ordinal()];
            boolean z10 = false;
            if (i10 != 1) {
                if (i10 == 2) {
                    zB = p033c7.O.b(((p083g7.i) hVar).f35633g);
                } else if (i10 == 3) {
                    zB = p033c7.O.b(((p083g7.c) hVar).f35614g);
                } else if (i10 != 4) {
                    Log.e("FIAM.Headless", "Unable to determine if impression should be counted as conversion.");
                } else {
                    zB = p033c7.O.b(((p083g7.g) hVar).f35626e);
                }
                z10 = !zB;
            } else {
                p083g7.e eVar = (p083g7.e) hVar;
                boolean zB2 = p033c7.O.b(eVar.f35621g);
                boolean zB3 = p033c7.O.b(eVar.f35622h);
                if (!zB2 && !zB3) {
                    z10 = true;
                }
            }
            o10.c(hVar, "fiam_impression", z10);
        }
        C1501n c1501n = o10.f22398f;
        for (C1501n.e eVar2 : c1501n.f22475e.values()) {
            eVar2.getClass();
            c1501n.f22471a.execute(new androidx.activity.j(eVar2, hVar));
        }
    }
}
