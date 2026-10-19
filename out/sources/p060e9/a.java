package p060e9;

import V8.B;
import com.obdeleven.service.odx.e;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.usecases.f;
import com.voltasit.obdeleven.presentation.controlUnit.k;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p147l9.c;

/* JADX INFO: compiled from: AdaptationsBackupFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public class a extends n {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public e.g f34828o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f34829p = (f) KoinJavaComponent.a(f.class);

    @Override // p060e9.n
    public final void Q() {
        JSONObject jSONObjectOptJSONObject = this.f34853n.d().optJSONObject("adaptations");
        if ((jSONObjectOptJSONObject == null ? "" : jSONObjectOptJSONObject.optString("type")).startsWith("KWP")) {
            this.f34851l.setAdapter(new c(q(), this.f34853n.d().optJSONObject("adaptations")));
        } else {
            C2134a0.b(getActivity(), R.string.common_loading);
            P().continueWith(new k(1, this)).continueWith(new B(4, this), Task.UI_THREAD_EXECUTOR);
        }
    }
}
