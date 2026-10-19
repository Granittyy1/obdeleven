package p182o9;

import O8.b;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.controlUnit.uds.readdata.a;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import p220r9.P;

/* JADX INFO: compiled from: UDSAdvancedIdentificationFragment.java */
/* JADX INFO: loaded from: classes3.dex */
@b("http://obdeleven.proboards.com/thread/106/advanced-identification")
public class e extends a {
    @Override // com.voltasit.obdeleven.presentation.controlUnit.uds.readdata.a
    public final void Q() {
        MainActivity mainActivityQ = q();
        P.a(mainActivityQ, mainActivityQ.getString(R.string.snackbar_advanced_identification_not_available));
    }

    @Override // com.voltasit.obdeleven.presentation.controlUnit.uds.readdata.a, com.voltasit.obdeleven.ui.module.BaseFragment
    public String o() {
        return "UDSAdvancedIdentificationFragment";
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        return getString(R.string.common_advanced_identification);
    }
}
