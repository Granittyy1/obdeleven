package androidx.media3.exoplayer;

import android.content.IntentSender;
import android.os.Bundle;
import com.braze.BrazeUser;
import com.braze.events.IValueCallback;
import com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.gson.JsonIOException;
import com.obdeleven.service.model.ControlUnit;
import com.parse.DeleteCallback;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.presentation.SfdViewModel;
import com.voltasit.obdeleven.presentation.controlUnit.uds.outputtest.UDSOutputTestFragment;
import com.voltasit.obdeleven.presentation.main.MainFragment;
import com.voltasit.obdeleven.presentation.profile.ProfileFragment;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class E implements j1.j.a, IValueCallback, com.google.gson.internal.f, Z3.r.d, androidx.fragment.app.E, p191p5.d, DeleteCallback, ControlUnit.g, p276w6.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17953c;

    public /* synthetic */ E(int i10, Object obj) {
        this.f17952b = i10;
        this.f17953c = obj;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [C8.a$b, T] */
    @Override // Z3.r.d
    public void a(JSONObject jSONObject) {
        Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f17953c;
        if (jSONObject != null) {
            String strOptString = jSONObject.optString("name");
            kotlin.jvm.internal.i.d(strOptString, "optString(...)");
            if (strOptString.length() > 0) {
                String strOptString2 = jSONObject.optString("name");
                String strOptString3 = jSONObject.optString("email");
                kotlin.jvm.internal.i.b(strOptString2);
                kotlin.jvm.internal.i.b(strOptString3);
                ref$ObjectRef.element = new C8.a.b(new G8.F(strOptString2, strOptString3));
            }
        }
    }

    @Override // com.obdeleven.service.model.ControlUnit.g
    public void b(List list) {
        p073f9.i iVar = (p073f9.i) this.f17953c;
        iVar.w();
        iVar.f35050E = list;
        iVar.W(list);
    }

    @Override // p276w6.a
    public void c(Bundle bundle) {
        ((p252u6.a) this.f17953c).f47428b.c(bundle);
    }

    @Override // p191p5.d
    public void d(Exception exc) throws Exception {
        MainFragment mainFragment = (MainFragment) this.f17953c;
        if (exc instanceof ResolvableApiException) {
            try {
                mainFragment.startIntentSenderForResult(((ResolvableApiException) exc).c().getIntentSender(), 1, null, 0, 0, 0, null);
            } catch (IntentSender.SendIntentException e10) {
                p279w9.b bVar = Application.f29634b;
                P8.c.b(e10);
            }
        }
    }

    @Override // com.parse.ParseCallback1
    public void done(Throwable th) {
        ProfileFragment this$0 = (ProfileFragment) this.f17953c;
        kotlin.jvm.internal.i.e(this$0, "this$0");
        this$0.q().G(null);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, xa.g] */
    @Override // androidx.fragment.app.E
    public void h(Bundle bundle, String str) {
        UDSOutputTestFragment this$0 = (UDSOutputTestFragment) this.f17953c;
        kotlin.jvm.internal.i.e(this$0, "this$0");
        ((SfdViewModel) this$0.f31962H.getValue()).c();
    }

    @Override // com.google.gson.internal.f
    public Object i() {
        throw new JsonIOException((String) this.f17953c);
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        switch (this.f17952b) {
            case 0:
                ((g1.v.c) obj).a0(((h0) this.f17953c).f18424o);
                break;
            default:
                p078g1.F f10 = (p078g1.F) this.f17953c;
                ((p162n1.b) obj).b(f10);
                int i10 = f10.f35229a;
                break;
        }
    }

    @Override // com.braze.events.IValueCallback
    public void onSuccess(Object obj) {
        InAppMessageUserJavascriptInterface.Companion.runOnUser$lambda$0((Ia.l) this.f17953c, (BrazeUser) obj);
    }

    public /* synthetic */ E(n1.b.a aVar, p078g1.F f10) {
        this.f17952b = 8;
        this.f17953c = f10;
    }
}
