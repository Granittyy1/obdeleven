package p073f9;

import V8.p;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import java.util.List;
import p194p8.j;

/* JADX INFO: compiled from: UDSChartFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public class l extends b {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public List<j> f35062E;

    @Override // p073f9.b
    public final void O() {
        H(R.string.common_loading);
        this.f35001A.onSuccess(new p(4, this), Task.UI_THREAD_EXECUTOR);
    }

    @Override // p073f9.b, com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "UDSChartFragment";
    }
}
