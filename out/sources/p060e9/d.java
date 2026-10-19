package p060e9;

import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.app.C2092g;
import com.voltasit.obdeleven.domain.usecases.f;
import com.voltasit.obdeleven.presentation.oca.b;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: compiled from: CodingBackupFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public class d extends n {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f34836o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f34837p = (f) KoinJavaComponent.a(f.class);

    @Override // p060e9.n
    public final void Q() {
        C2134a0.b(getActivity(), R.string.common_loading);
        P().continueWith(new b(2, this), Task.BACKGROUND_EXECUTOR).continueWith(new C2092g(2, this), Task.UI_THREAD_EXECUTOR);
    }
}
