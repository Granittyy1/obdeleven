package com.voltasit.obdeleven.presentation.controlUnit.kwp.coding;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f31731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Serializable f31732c;

    public /* synthetic */ f(BaseFragment baseFragment, Serializable serializable, int i10) {
        this.f31730a = i10;
        this.f31731b = baseFragment;
        this.f31732c = serializable;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f31730a) {
            case 0:
                m mVar = (m) this.f31731b;
                mVar.getClass();
                Integer num = (Integer) task.getResult();
                if (num.intValue() != 0) {
                    return Task.forResult(num);
                }
                UserTrackingUtils.c(UserTrackingUtils.Key.f34276u, 1);
                mVar.G(R.string.common_coding_accepted);
                mVar.f31749q.setText("");
                mVar.f31751s.y0((String) this.f31732c, true);
                mVar.P();
                return mVar.f31751s.n0().continueWith(new c());
            default:
                p182o9.d dVar = (p182o9.d) this.f31731b;
                dVar.w();
                if (task.isFaulted()) {
                    return null;
                }
                p135k9.e eVar = dVar.f31996m;
                com.obdeleven.service.odx.e.g gVar = dVar.f32002s;
                Map map = (Map) task.getResult();
                ArrayList arrayList = eVar.f42900e;
                arrayList.clear();
                arrayList.addAll((ArrayList) this.f31732c);
                eVar.f42906l = true;
                eVar.f42903h = gVar;
                eVar.f42902g.putAll(map);
                eVar.notifyDataSetChanged();
                eVar.f42896a.T();
                return null;
        }
    }
}
