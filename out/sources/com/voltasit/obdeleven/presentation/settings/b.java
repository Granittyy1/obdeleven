package com.voltasit.obdeleven.presentation.settings;

import K8.o;
import com.obdeleven.service.model.NRC;
import com.obdeleven.service.model.UDSResult;
import com.obdeleven.service.odx.e;
import com.parse.ParseException;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.models.StartView;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import p060e9.f;
import p060e9.n;
import p134k8.a2;
import p170n9.j;
import p255u9.E;
import p255u9.y;
import p279w9.d;
import p293xa.r;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33195b;

    public /* synthetic */ b(int i10, Object obj) {
        this.f33194a = i10;
        this.f33195b = obj;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f33194a) {
            case 0:
                SettingsFragment this$0 = (SettingsFragment) this.f33195b;
                i.e(this$0, "this$0");
                E e10 = (E) task.getResult();
                if (e10 != null) {
                    SettingsViewModel settingsViewModelO = this$0.O();
                    settingsViewModelO.getClass();
                    StartView startView = StartView.CAR;
                    o oVar = settingsViewModelO.f33160o;
                    oVar.O(startView);
                    String objectId = e10.getObjectId();
                    i.d(objectId, "getObjectId(...)");
                    oVar.M(objectId);
                    settingsViewModelO.f33170t.j(p279w9.a.f47808e, e10);
                    settingsViewModelO.f33126R.j(Y8.c.a(R.string.common_car, true));
                    settingsViewModelO.f33143Z0 = true;
                }
                return r.f47939a;
            case 1:
                f fVar = (f) this.f33195b;
                fVar.getClass();
                e eVar = (e) task.getResult();
                fVar.f34838o = eVar.I("TAB_RecorDataIdentMeasuValue");
                if (fVar.f34853n.h().isEmpty()) {
                    n.R(fVar.f34853n.f(), fVar.f34838o, eVar);
                } else {
                    ArrayList<y> arrayListF = fVar.f34853n.f();
                    e.g gVar = fVar.f34838o;
                    for (y yVar : arrayListF) {
                        try {
                            if ("SECURITY_ACCESS".equals(yVar.b())) {
                                UDSResult.a("33");
                            } else {
                                UDSResult.b(yVar.a(), yVar.b().substring(6), gVar, eVar);
                            }
                        } catch (Exception e11) {
                            O.e.m(e11);
                        }
                    }
                }
                return eVar;
            case 2:
                androidx.compose.ui.graphics.colorspace.n nVar = (androidx.compose.ui.graphics.colorspace.n) this.f33195b;
                String str = (String) task.getResult();
                NRC nrc = NRC.f29381f;
                NRC nrcA = str.startsWith("7F") ? NRC.a(Integer.parseInt(str.substring(4), 16)) : nrc;
                j jVar = (j) nVar.f13608b;
                if (jVar.y()) {
                    return null;
                }
                jVar.Y();
                jVar.f31593p.f1934y.setRefreshing(false);
                jVar.R().f31602r.K();
                UserTrackingUtils.c(UserTrackingUtils.Key.f34251L, 1);
                if (nrcA != nrc) {
                    jVar.F(nrcA.c());
                    return null;
                }
                jVar.T(false);
                return null;
            case 3:
                return ((a2) this.f33195b).f42731h.b("0201010000FE97");
            default:
                ParseException parseException = task.getError() instanceof ParseException ? (ParseException) task.getError() : null;
                Object arrayList = task.getResult() == null ? new ArrayList() : (List) task.getResult();
                d.b bVar = (d.b) this.f33195b;
                if (bVar != null) {
                    bVar.g(arrayList, parseException);
                }
                return arrayList;
        }
    }
}
