package p182o9;

import V8.C0831e;
import android.os.Bundle;
import com.obdeleven.service.odx.model.COMPUSCALE;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.core.app.p0;
import com.voltasit.obdeleven.domain.usecases.f;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.ui.dialogs.C2150i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.koin.java.KoinJavaComponent;
import p010a9.a;
import p220r9.C2783o;

/* JADX INFO: compiled from: OfflineUDSAdvancedIdentificationFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public class d extends e {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f45246y = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final f f45247x = (f) KoinJavaComponent.a(f.class);

    @Override // com.voltasit.obdeleven.presentation.controlUnit.uds.readdata.a
    public final void P() {
        boolean zA = this.f45247x.a();
        ArrayList<String> arrayList = new ArrayList<>(C2783o.b(this.f31996m.f42900e, zA));
        C2150i0 c2150i0 = this.f31995l;
        if (c2150i0 == null || !c2150i0.isVisible()) {
            this.f31999p = C2783o.b(this.f31998o, zA);
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("items", this.f31999p);
            bundle.putStringArrayList("key_selected_items", arrayList);
            C2150i0 c2150i1 = new C2150i0();
            c2150i1.setArguments(bundle);
            c2150i1.f32261r = getFragmentManager();
            c2150i1.setTargetFragment(this, 0);
            this.f31995l = c2150i1;
            c2150i1.A();
        }
    }

    @Override // com.voltasit.obdeleven.presentation.controlUnit.uds.readdata.a, com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String str, DialogCallback.CallbackType callbackType, Bundle bundle) {
        if (!str.equals("MultiChoiceDialog") || callbackType != DialogCallback.CallbackType.f31102c) {
            if (str.equals("MultiChoiceDialog") && callbackType == DialogCallback.CallbackType.f31101b) {
                r().h();
                return;
            }
            return;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("items");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            if (q().E()) {
                q().K();
                return;
            } else {
                q().onBackPressed();
                return;
            }
        }
        ArrayList<COMPUSCALE> arrayList = new ArrayList();
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f31998o.get(this.f31999p.indexOf(it.next())));
        }
        J();
        Task taskForResult = Task.forResult(null);
        HashMap map = new HashMap();
        for (COMPUSCALE compuscale : arrayList) {
            taskForResult = taskForResult.continueWithTask(new p0(this, 6, compuscale)).continueWith(new C0831e(map, 2, compuscale));
        }
        taskForResult.continueWithTask(new a(6, map)).continueWith(new com.voltasit.obdeleven.presentation.controlUnit.kwp.coding.f(this, arrayList, 1), Task.UI_THREAD_EXECUTOR);
    }

    @Override // p182o9.e, com.voltasit.obdeleven.presentation.controlUnit.uds.readdata.a, com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "OfflineUDSAdvancedIdentificationFragment";
    }
}
