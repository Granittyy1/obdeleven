package p182o9;

import O8.b;
import W7.c;
import android.os.Bundle;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.presentation.controlUnit.uds.readdata.a;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import java.util.ArrayList;
import java.util.Iterator;
import org.koin.java.KoinJavaComponent;
import p135k9.e;
import p220r9.P;

/* JADX INFO: compiled from: UDSLiveDataFragment.java */
/* JADX INFO: loaded from: classes3.dex */
@b("http://obdeleven.proboards.com/thread/109/live-data-uds")
public class f extends a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f45248x = KoinJavaComponent.b(J8.a.class, null, null);

    @Override // com.voltasit.obdeleven.presentation.controlUnit.uds.readdata.a
    public final void Q() {
        MainActivity mainActivityQ = q();
        P.a(mainActivityQ, mainActivityQ.getString(R.string.snackbar_live_data_not_available));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    @Override // com.voltasit.obdeleven.presentation.controlUnit.uds.readdata.a, com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String str, DialogCallback.CallbackType callbackType, Bundle bundle) {
        ((J8.a) this.f45248x.getValue()).i();
        if (c.e()) {
            super.g(str, callbackType, bundle);
            return;
        }
        if (!str.equals("MultiChoiceDialog") || callbackType != DialogCallback.CallbackType.f31102c) {
            if (str.equals("MultiChoiceDialog") && callbackType == DialogCallback.CallbackType.f31101b) {
                r().h();
                return;
            }
            return;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("items");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            r().h();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f31998o.get(this.f31999p.indexOf(it.next())));
        }
        e eVar = this.f31996m;
        com.obdeleven.service.odx.e.g gVar = this.f32002s;
        eVar.f42900e.addAll(arrayList);
        eVar.f42903h = gVar;
        eVar.notifyDataSetChanged();
        eVar.j = false;
        eVar.f42899d = false;
        eVar.f42896a.T();
        eVar.b();
    }

    @Override // com.voltasit.obdeleven.presentation.controlUnit.uds.readdata.a, com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "UDSLiveDataFragment";
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        return getString(R.string.common_live_data);
    }
}
