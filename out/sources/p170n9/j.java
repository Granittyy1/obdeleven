package p170n9;

import O.e;
import O8.b;
import androidx.compose.ui.graphics.colorspace.n;
import com.google.firebase.messaging.D;
import com.obdeleven.service.model.OBDIICu;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.core.app.C2092g;
import com.voltasit.obdeleven.presentation.controlUnit.faults.FaultsFragment;
import com.voltasit.obdeleven.utils.bluetooth.l;

/* JADX INFO: compiled from: OBDIIFaultsFragment.java */
/* JADX INFO: loaded from: classes3.dex */
@b("http://obdeleven.proboards.com/thread/105/faults")
public class j extends FaultsFragment {
    @Override // com.voltasit.obdeleven.presentation.controlUnit.faults.FaultsFragment
    public final void O() {
        this.f31593p.f1928s.setEnabled(false);
        this.f31593p.f1934y.setRefreshing(true);
        OBDIICu oBDIICu = (OBDIICu) this.f31591n;
        n nVar = new n(this);
        oBDIICu.getClass();
        e.j("OBDIIControlUnit", "Clearing faults");
        oBDIICu.D(false).continueWithTask(new C2092g(4, oBDIICu), Task.BACKGROUND_EXECUTOR).continueWith(new com.voltasit.obdeleven.presentation.settings.b(2, nVar), Task.UI_THREAD_EXECUTOR);
    }

    @Override // com.voltasit.obdeleven.presentation.controlUnit.faults.FaultsFragment
    public final void T(boolean z10) {
        this.f31593p.f1928s.setEnabled(false);
        this.f31593p.f1927r.setVisibility(8);
        if (z10) {
            this.f31593p.f1928s.setEnabled(false);
            this.f31593p.f1934y.setRefreshing(true);
        } else {
            J();
        }
        OBDIICu oBDIICu = (OBDIICu) this.f31591n;
        D d10 = new D(this, z10);
        e.j("OBDIIControlUnit", oBDIICu.t() + "_" + oBDIICu.getName() + ": requestFaults()");
        oBDIICu.O0().continueWith(new l(2, d10), Task.UI_THREAD_EXECUTOR);
    }

    @Override // com.voltasit.obdeleven.presentation.controlUnit.faults.FaultsFragment, com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "OBDIIControlUnitFaultsFragment";
    }
}
