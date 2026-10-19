package U6;

import Z3.r;
import com.afollestad.materialdialogs.MaterialDialog;
import com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplayRegistrar;
import com.voltasit.obdeleven.models.HistoryTypeFilter;
import com.voltasit.obdeleven.presentation.history.HistoryAdapter;
import java.util.ArrayList;
import org.json.JSONObject;
import p191p5.InterfaceC2755a;
import p228s6.q;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements p228s6.d, MaterialDialog.e, r.d, InterfaceC2755a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6547b;

    public /* synthetic */ f(Object obj) {
        this.f6547b = obj;
    }

    @Override // Z3.r.d
    public void a(JSONObject jSONObject) {
        com.voltasit.obdeleven.presentation.profile.b bVar = (com.voltasit.obdeleven.presentation.profile.b) this.f6547b;
        if (jSONObject == null || jSONObject.optString("email").length() <= 0) {
            bVar.a("", false);
        } else {
            bVar.a(jSONObject.optString("email"), true);
        }
    }

    @Override // com.afollestad.materialdialogs.MaterialDialog.e
    public void c(MaterialDialog materialDialog) {
        HistoryAdapter historyAdapter = (HistoryAdapter) this.f6547b;
        historyAdapter.getClass();
        materialDialog.dismiss();
        p147l9.b bVar = historyAdapter.f32394h;
        ArrayList<HistoryTypeFilter> arrayList = bVar.f44472e;
        for (HistoryTypeFilter historyTypeFilter : bVar.f44469b) {
            historyTypeFilter.i(arrayList.contains(historyTypeFilter));
        }
    }

    @Override // p228s6.d
    public Object f(q qVar) {
        return ((FirebaseInAppMessagingDisplayRegistrar) this.f6547b).buildFirebaseInAppMessagingUI(qVar);
    }

    @Override // p191p5.InterfaceC2755a
    public Object i(p191p5.g gVar) {
        boolean zO = gVar.o();
        p191p5.h hVar = (p191p5.h) this.f6547b;
        if (zO) {
            hVar.d(gVar.k());
            return null;
        }
        if (gVar.j() == null) {
            return null;
        }
        hVar.c(gVar.j());
        return null;
    }
}
