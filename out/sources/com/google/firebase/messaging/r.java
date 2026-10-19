package com.google.firebase.messaging;

import com.google.android.gms.internal.measurement.Y;
import com.parse.ParseException;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import java.util.List;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements p191p5.e, w9.d.b, p228s6.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28390b;

    public /* synthetic */ r(Object obj) {
        this.f28390b = obj;
    }

    @Override // p228s6.d
    public Object f(p228s6.q qVar) {
        return this.f28390b;
    }

    @Override // w9.d.b
    public void g(List list, ParseException parseException) {
        com.voltasit.obdeleven.ui.module.h hVar = (com.voltasit.obdeleven.ui.module.h) this.f28390b;
        if (hVar.y()) {
            return;
        }
        hVar.f34118q.setVisibility(8);
        hVar.f34113l = new p255u9.C();
        if (parseException == null) {
            if (!list.isEmpty()) {
                p255u9.C c10 = (p255u9.C) list.get(0);
                hVar.f34113l = c10;
                hVar.f34120s.k(c10);
            }
            hVar.P(hVar.f34115n, hVar.f34116o, hVar.f34117p);
            hVar.Q(hVar.f34113l);
            return;
        }
        if (parseException.getCode() == 100) {
            p279w9.b bVar = Application.f29634b;
            P8.c.b(parseException);
            Y.k(hVar, R.string.common_check_network, "TryAgainDialog");
        } else {
            p220r9.P.a(hVar.getActivity(), hVar.getString(p220r9.J.h(parseException.getCode())));
            hVar.r().h();
        }
    }

    @Override // p191p5.e
    public void onSuccess(Object obj) {
        ((FirebaseMessaging) this.f28390b).lambda$setNotificationDelegationEnabled$6((Void) obj);
    }
}
