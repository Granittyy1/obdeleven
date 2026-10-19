package S6;

import android.os.Bundle;
import androidx.fragment.app.E;
import androidx.media3.exoplayer.h0;
import com.afollestad.materialdialogs.MaterialDialog;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingRegistrar;
import com.google.gson.JsonIOException;
import com.parse.ParseException;
import com.parse.RequestPasswordResetCallback;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.presentation.SfdViewModel;
import com.voltasit.obdeleven.ui.activity.LoginActivity;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import com.voltasit.obdeleven.ui.dialogs.C2182z;
import com.voltasit.obdeleven.ui.dialogs.W;
import java.util.Arrays;
import p033c7.C1506t;
import p078g1.v;
import p220r9.P;
import p228s6.q;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements p228s6.d, j1.j.a, p183oa.a, com.google.gson.internal.f, E, RequestPasswordResetCallback, MaterialDialog.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5682c;

    public /* synthetic */ k(int i10, Object obj) {
        this.f5681b = i10;
        this.f5682c = obj;
    }

    @Override // com.afollestad.materialdialogs.MaterialDialog.e
    public void c(MaterialDialog materialDialog) {
        W this$0 = (W) this.f5682c;
        kotlin.jvm.internal.i.e(this$0, "this$0");
        C2182z c2182z = this$0.f33855s;
        if (c2182z != null) {
            c2182z.invoke();
        }
        this$0.w("LabelDeveloperAgreementDialog", DialogCallback.CallbackType.f31102c, new Bundle());
    }

    @Override // com.parse.ParseCallback1
    public void done(Throwable th) {
        ParseException parseException = (ParseException) th;
        com.voltasit.obdeleven.presentation.signIn.a aVar = (com.voltasit.obdeleven.presentation.signIn.a) this.f5682c;
        aVar.getClass();
        C2134a0.a();
        if ((aVar.getActivity() instanceof LoginActivity) && !((LoginActivity) aVar.getActivity()).f33530c) {
            p279w9.b bVar = Application.f29634b;
            P8.c.a(5, "RecoverFragment", "Unable to finish request password operation because Login activity is not visible", Arrays.copyOf(new Object[0], 0));
            return;
        }
        if (parseException == null) {
            P.f(aVar.getActivity(), R.string.view_recover_check_your_email);
            aVar.f33225d.c();
            return;
        }
        int code = parseException.getCode();
        if (code == 125) {
            aVar.f33223b.setError(aVar.getString(R.string.common_email_invalid));
        } else if (code != 205) {
            aVar.f33223b.setError(aVar.getString(R.string.view_recover_failed_to_reset_password));
        } else {
            aVar.f33223b.setError(aVar.getString(R.string.view_recover_email_not_found));
        }
    }

    @Override // p228s6.d
    public Object f(q qVar) {
        return ((FirebaseInAppMessagingRegistrar) this.f5682c).providesFirebaseInAppMessaging(qVar);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, xa.g] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, xa.g] */
    @Override // androidx.fragment.app.E
    public void h(Bundle bundle, String str) {
        switch (this.f5681b) {
            case 4:
                com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.q qVar = (com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.q) this.f5682c;
                ((SfdViewModel) qVar.f31843N.getValue()).d(qVar.f31857z.f29320b.getControlUnitBase().getObjectId(), qVar.f31857z.n().shortValue());
                break;
            default:
                com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.h hVar = (com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.h) this.f5682c;
                ((SfdViewModel) hVar.f31920F.getValue()).d(hVar.f31925q.f29320b.getControlUnitBase().getObjectId(), hVar.f31925q.n().shortValue());
                break;
        }
    }

    @Override // com.google.gson.internal.f
    public Object i() {
        throw new JsonIOException((String) this.f5682c);
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        h0 h0Var = (h0) this.f5682c;
        ((v.c) obj).o(h0Var.f18422m, h0Var.f18421l);
    }

    @Override // p183oa.a
    public void run() {
        ((C1506t) this.f5682c).j = true;
    }
}
