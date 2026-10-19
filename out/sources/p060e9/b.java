package p060e9;

import com.obdeleven.service.odx.e;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.app.C2088c;
import com.voltasit.obdeleven.domain.usecases.f;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import com.voltasit.obdeleven.ui.dialogs.C2141e;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: compiled from: AdvancedInfoBackupFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public class b extends n {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public e.g f34830o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f34831p = (f) KoinJavaComponent.a(f.class);

    @Override // p060e9.n
    public final void Q() {
        C2134a0.b(getActivity(), R.string.common_loading);
        P().continueWith(new C2088c(2, this)).continueWith(new C2141e(2, this), Task.UI_THREAD_EXECUTOR);
    }
}
