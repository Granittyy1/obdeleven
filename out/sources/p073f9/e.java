package p073f9;

import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import p009a8.d;
import p255u9.C2800c;
import p255u9.CallableC2799b;

/* JADX INFO: compiled from: ChartDisplayFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public class e extends b {
    @Override // p073f9.b, com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "ChartDisplayFragment";
    }

    @Override // p073f9.b, com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C2134a0.b(q(), R.string.common_loading);
        if (this.f35016w == null) {
            d dVar = this.f35015v;
            int size = dVar.f36779a.size();
            dVar.f36779a.clear();
            dVar.notifyItemRangeRemoved(0, size);
        }
        C2800c c2800c = this.f35017x;
        c2800c.getClass();
        Task.callInBackground(new CallableC2799b(c2800c)).continueWith(new d(3, this), Task.UI_THREAD_EXECUTOR);
    }

    @Override // p073f9.b
    public final void O() {
    }
}
