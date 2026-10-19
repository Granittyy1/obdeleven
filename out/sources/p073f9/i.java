package p073f9;

import androidx.media3.exoplayer.E;
import com.voltasit.obdeleven.R;
import com.voltasit.parse.model.ControlUnitLabelDB;
import java.util.List;
import p194p8.j;

/* JADX INFO: compiled from: NonUdsChartFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public class i extends b {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public List<j> f35050E;

    @Override // p073f9.b
    public final void O() {
        List<j> list = this.f35050E;
        if (list != null) {
            W(list);
        } else {
            H(R.string.common_loading_channels);
            this.f35016w.m0(ControlUnitLabelDB.Type.f34409b, new E(7, this));
        }
    }

    @Override // p073f9.b, com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "NonUdsChartFragment";
    }
}
