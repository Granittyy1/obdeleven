package p182o9;

import C7.h;
import X8.m;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.media3.exoplayer.C1406y;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.obdeleven.service.model.OBDIIService01;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.presentation.controlUnit.uds.readdata.a;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.C2169s0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p022b9.b;
import p109i8.i;
import p110i9.p;
import p134k8.A1;
import p220r9.P;

/* JADX INFO: compiled from: OBDIILiveDataFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public class c extends a implements i.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public C2169s0 f45242A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public p f45243x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList<String> f45244y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f45245z = false;

    @Override // com.voltasit.obdeleven.presentation.controlUnit.uds.readdata.a
    public final void O() {
        H(R.string.common_loading_data);
        ((i) this.f31997n).g().continueWith(new b(6, this));
    }

    @Override // com.voltasit.obdeleven.presentation.controlUnit.uds.readdata.a
    public final void Q() {
        MainActivity mainActivityQ = q();
        P.a(mainActivityQ, mainActivityQ.getString(R.string.snackbar_live_data_not_available));
    }

    @Override // com.voltasit.obdeleven.presentation.controlUnit.uds.readdata.a, com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String str, DialogCallback.CallbackType callbackType, Bundle bundle) {
        if (!str.equals("MultiChoiceDialog") || callbackType != DialogCallback.CallbackType.f31102c) {
            if (str.equals("MultiChoiceDialog") && callbackType == DialogCallback.CallbackType.f31101b) {
                this.f45242A.y();
                r().h();
                return;
            }
            return;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("items");
        this.f45244y = stringArrayList;
        if (stringArrayList == null) {
            r().h();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f45244y.iterator();
        while (it.hasNext()) {
            arrayList.add(OBDIIService01.valueOf(it.next()));
        }
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.i.d(contextRequireContext, "requireContext(...)");
        p pVar = new p(contextRequireContext, (LinearLayoutManager) this.f32003t.f2190s.getLayoutManager());
        this.f45243x = pVar;
        pVar.f36822e = new C1406y(this);
        this.f32003t.f2190s.setAdapter(pVar);
        J();
        ((i) this.f31997n).r(arrayList, new m(6, this));
    }

    @Override // i8.i.a
    public final void l(List<A1> list) {
        w();
        p279w9.b bVar = Application.f29634b;
        P8.c.a(3, "OBDIILiveDataFragment", "Received live data result from control unit", Arrays.copyOf(new Object[0], 0));
        if (this.f45245z) {
            return;
        }
        this.f45243x.e(list);
    }

    @Override // com.voltasit.obdeleven.presentation.controlUnit.uds.readdata.a, com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "OBDIILiveDataFragment";
    }

    @Override // com.voltasit.obdeleven.presentation.controlUnit.uds.readdata.a, android.view.View.OnClickListener
    public final void onClick(View view) {
        H(R.string.dialog_stopping_requests);
        ((i) this.f31997n).m(new h(this));
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        q().T();
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        q().U();
        ((i) this.f31997n).m(null);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        return getString(R.string.common_live_data);
    }
}
