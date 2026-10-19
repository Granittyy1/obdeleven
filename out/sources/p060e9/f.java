package p060e9;

import com.obdeleven.service.odx.e;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.settings.b;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import org.koin.java.KoinJavaComponent;
import p022b9.a;

/* JADX INFO: compiled from: UDSLiveDataBackupFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public class f extends n {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public e.g f34838o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.f f34839p = (com.voltasit.obdeleven.domain.usecases.f) KoinJavaComponent.a(com.voltasit.obdeleven.domain.usecases.f.class);

    @Override // p060e9.n
    public final void Q() {
        C2134a0.b(getActivity(), R.string.common_loading);
        P().continueWith(new b(1, this)).continueWith(new a(3, this), Task.UI_THREAD_EXECUTOR);
    }
}
