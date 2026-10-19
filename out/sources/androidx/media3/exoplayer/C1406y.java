package androidx.media3.exoplayer;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import com.obdeleven.service.model.ControlUnit;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.SaveCallback;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.history.child.VehicleHistoryChildrenFragment;
import com.voltasit.obdeleven.ui.dialogs.C2145g;
import com.voltasit.obdeleven.ui.dialogs.C2147h;
import com.voltasit.obdeleven.ui.dialogs.C2164p0;
import com.voltasit.obdeleven.ui.dialogs.C2166q0;
import com.voltasit.parse.model.ControlUnitLabelDB;
import com.voltasit.parse.model.HistoryDB;
import io.reactivex.internal.operators.maybe.MaybeFlatMapCompletable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: androidx.media3.exoplayer.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1406y implements j1.j.b, p183oa.b, p191p5.f, w9.d.b, SaveCallback, ControlUnit.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18831b;

    public /* synthetic */ C1406y(Object obj) {
        this.f18831b = obj;
    }

    @Override // p183oa.b
    public void a(Object obj) {
        p033c7.A a10 = ((p033c7.H) this.f18831b).f22359g;
        a10.getClass();
        HashSet hashSet = new HashSet();
        for (CampaignProto$ThickContent campaignProto$ThickContent : ((N7.e) obj).K()) {
            hashSet.add(campaignProto$ThickContent.K().equals(CampaignProto$ThickContent.PayloadCase.VANILLA_PAYLOAD) ? campaignProto$ThickContent.N().H() : campaignProto$ThickContent.I().H());
        }
        hashSet.toString();
        Q3.d.B();
        p123ja.h<N7.b> hVarA = a10.a();
        N7.b bVar = p033c7.A.f22338c;
        Q3.d.I(bVar, "item is null");
        new MaybeFlatMapCompletable(hVarA.e(p123ja.h.b(bVar)), new I4.i(a10, hashSet)).e();
    }

    @Override // com.obdeleven.service.model.ControlUnit.g
    public void b(List list) {
        List<p255u9.u> list2;
        C2166q0 c2166q0 = (C2166q0) this.f18831b;
        ArrayList arrayList = c2166q0.f34011x;
        if (arrayList != null) {
            arrayList.addAll(list);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p121j8.c label = ((p194p8.j) it.next()).getLabel();
            if (label.f41144c >= c2166q0.f34007t) {
                String str = p267v9.a.f47671a;
                ArrayList arrayList3 = new ArrayList();
                for (ControlUnitLabelDB controlUnitLabelDB : label.f41145d) {
                    if (controlUnitLabelDB.getInt("value") == -1) {
                        ParseObject parseObjectCreate = ParseObject.create((Class<ParseObject>) ControlUnitLabelDB.class);
                        for (String str2 : controlUnitLabelDB.keySet()) {
                            Object obj = controlUnitLabelDB.get(str2);
                            if (obj != null) {
                                parseObjectCreate.put(str2, obj);
                            }
                        }
                        ControlUnitLabelDB controlUnitLabelDB2 = (ControlUnitLabelDB) parseObjectCreate;
                        if (!TextUtils.isEmpty(controlUnitLabelDB2.getString("description"))) {
                            HashMap<String, List<p255u9.u>> map = label.f41146e.get(controlUnitLabelDB2.getString("description"));
                            if (map != null && (list2 = map.get(str)) != null && !list2.isEmpty()) {
                                String string = list2.get(0).getString("value");
                                if (!TextUtils.isEmpty(string)) {
                                    controlUnitLabelDB2.put("description", string);
                                    arrayList3.add(controlUnitLabelDB2);
                                }
                            }
                        }
                    }
                }
                arrayList2.addAll(arrayList3);
            }
        }
        c2166q0.f34013z.clear();
        if (arrayList2.isEmpty()) {
            c2166q0.f34013z.add(c2166q0.getString(R.string.common_not_available));
            return;
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((ControlUnitLabelDB) it2.next()).getString("description"));
        }
        c2166q0.f34013z.add(c2166q0.getString(R.string.common_select_value));
        c2166q0.f34013z.addAll(arrayList4);
        c2166q0.f34012y.f1638v.setOnItemSelectedListener(new C2164p0(c2166q0, arrayList2));
        c2166q0.f34012y.f1638v.setEnabled(true);
    }

    @Override // p191p5.f
    public p191p5.g c(Object obj) {
        return FirebaseMessaging.lambda$unsubscribeFromTopic$11((String) this.f18831b, (com.google.firebase.messaging.P) obj);
    }

    @Override // com.parse.ParseCallback1
    public void done(Throwable th) {
        ParseException parseException = (ParseException) th;
        C2147h c2147h = ((C2145g) this.f18831b).f33951b;
        c2147h.getClass();
        c2147h.D(parseException == null ? 2 : 4);
    }

    @Override // j1.j.b
    public void f(Object obj, p078g1.m mVar) {
        ((K) this.f18831b).getClass();
        ((g1.v.c) obj).Y(new g1.v.b(mVar));
    }

    @Override // w9.d.b
    public void g(List list, ParseException parseException) {
        VehicleHistoryChildrenFragment this$0 = (VehicleHistoryChildrenFragment) this.f18831b;
        kotlin.jvm.internal.i.e(this$0, "this$0");
        if (this$0.y()) {
            return;
        }
        if (parseException != null) {
            if (parseException.getCode() == 100) {
                com.google.android.gms.internal.measurement.Y.k(this$0, R.string.common_check_network, "TryAgainDialog");
            } else {
                Context contextRequireContext = this$0.requireContext();
                kotlin.jvm.internal.i.d(contextRequireContext, "requireContext(...)");
                this$0.F(p220r9.J.g(contextRequireContext, parseException));
            }
        }
        Collections.sort(list, new HistoryDB.a());
        com.voltasit.obdeleven.presentation.history.k kVar = this$0.f32423l;
        kotlin.jvm.internal.i.b(kVar);
        kotlin.jvm.internal.i.b(list);
        kVar.b(list);
    }
}
