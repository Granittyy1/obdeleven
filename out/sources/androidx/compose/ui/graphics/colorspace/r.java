package androidx.compose.ui.graphics.colorspace;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.y;
import androidx.media3.exoplayer.K;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.presentation.signIn.SignupFragment;
import com.voltasit.obdeleven.ui.activity.LoginActivity;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import com.voltasit.obdeleven.ui.dialogs.deviceSelectionSheet.DeviceSelectionSheet;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import p220r9.P;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements j, j1.j.a, SignUpCallback, i9.c.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13613b;

    public /* synthetic */ r(Object obj) {
        this.f13613b = obj;
    }

    @Override // i9.c.a
    public void d(Object obj) {
        Q8.b item = (Q8.b) obj;
        DeviceSelectionSheet this$0 = (DeviceSelectionSheet) this.f13613b;
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(item, "item");
        if (item.f5132g) {
            DeviceSelectionSheet.a aVar = this$0.f33918u;
            if (aVar != null) {
                aVar.a(item);
                this$0.x().b();
                Dialog dialog = this$0.f17606m;
                if (dialog instanceof com.google.android.material.bottomsheet.b) {
                    com.google.android.material.bottomsheet.b bVar = (com.google.android.material.bottomsheet.b) dialog;
                    if (bVar.f26827g == null) {
                        bVar.f();
                    }
                    boolean z10 = bVar.f26827g.f26767J;
                }
                this$0.p(false, false);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("bluetoothDeviceInfo", item);
            DialogCallback.CallbackType callbackType = DialogCallback.CallbackType.f31102c;
            if (this$0.getTargetFragment() instanceof DialogCallback) {
                if ((this$0.getTargetFragment() instanceof BaseFragment) && ((BaseFragment) this$0.getTargetFragment()).f34089i) {
                    O.e.D("BaseBottomSheetDialog", "Target fragment's onSaveInstanceState() called. Ignoring ON_POSITIVE callback.");
                } else {
                    ((DialogCallback) this$0.getTargetFragment()).g("DeviceSelectionSheet", callbackType, bundle);
                }
            } else if (this$0.getTargetFragment() != null) {
                O.e.D("BaseBottomSheetDialog", "Target fragment does not implement callback interface");
            }
            this$0.x().b();
            Dialog dialog2 = this$0.f17606m;
            if (dialog2 instanceof com.google.android.material.bottomsheet.b) {
                com.google.android.material.bottomsheet.b bVar2 = (com.google.android.material.bottomsheet.b) dialog2;
                if (bVar2.f26827g == null) {
                    bVar2.f();
                }
                boolean z11 = bVar2.f26827g.f26767J;
            }
            this$0.p(false, false);
        }
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, xa.g] */
    @Override // com.parse.ParseCallback1
    public void done(Throwable th) {
        ParseException parseException = (ParseException) th;
        SignupFragment this$0 = (SignupFragment) this.f13613b;
        kotlin.jvm.internal.i.e(this$0, "this$0");
        if (!this$0.isVisible() || this$0.getActivity() == null) {
            return;
        }
        C2134a0.a();
        if (parseException != null) {
            int code = parseException.getCode();
            if (code == 125) {
                P.b(this$0.requireActivity(), R.string.common_email_invalid);
                return;
            } else if (code == 202 || code == 203) {
                P.b(this$0.requireActivity(), R.string.view_signup_email_already_taken);
                return;
            } else {
                P.b(this$0.requireActivity(), R.string.view_signup_could_not_sign_up);
                return;
            }
        }
        if (this$0.getActivity() == null || this$0.getFragmentManager() == null) {
            return;
        }
        ((J8.a) this$0.f33211c.getValue()).e0(new J8.r("user_registered"));
        ParseUser.logOut();
        P.e(this$0.requireActivity(), this$0.getString(R.string.toast_verify_email));
        if (this$0.getActivity() instanceof LoginActivity) {
            LoginActivity loginActivity = (LoginActivity) this$0.getActivity();
            kotlin.jvm.internal.i.b(loginActivity);
            if (loginActivity.f33530c) {
                y fragmentManager = this$0.getFragmentManager();
                kotlin.jvm.internal.i.b(fragmentManager);
                fragmentManager.S();
            }
        }
    }

    @Override // androidx.compose.ui.graphics.colorspace.j
    public double g(double d10) {
        float[] fArr = f.f13567a;
        return f.d((t) this.f13613b, d10);
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        ((g1.v.c) obj).m(K.this.f18003P);
    }
}
