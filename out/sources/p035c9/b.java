package p035c9;

import C4.v;
import C8.a;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.models.Screen;
import com.voltasit.obdeleven.domain.usecases.user.E;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.presentation.profile.ProfileFragment;
import com.voltasit.obdeleven.ui.dialogs.ChangePasswordDialog;
import com.voltasit.obdeleven.utils.NavigationManager;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Fragment f22525d;

    public /* synthetic */ b(Object obj, Fragment fragment, int i10) {
        this.f22523b = i10;
        this.f22524c = obj;
        this.f22525d = fragment;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, xa.g] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f22523b) {
            case 0:
                Screen screen = (Screen) this.f22524c;
                c this$0 = (c) this.f22525d;
                i.e(this$0, "this$0");
                int iOrdinal = screen.ordinal();
                if (iOrdinal == 0) {
                    this$0.r().o(false);
                } else if (iOrdinal == 1) {
                    NavigationManager.i(this$0.r(), ProfileFragment.class, false);
                } else {
                    this$0.r().o(false);
                }
                break;
            default:
                ChangePasswordDialog this$1 = (ChangePasswordDialog) this.f22525d;
                i.e(this$1, "this$0");
                EditText editText = (EditText) this.f22524c;
                String string = editText.getText().toString();
                ((E) this$1.f33771z.getValue()).getClass();
                if (!(E.a(string) instanceof a.C0024a)) {
                    Bundle bundleD = v.d("key_new_pass", string);
                    String str = this$1.f33770y;
                    i.b(str);
                    this$1.w(str.length() == 0 ? "InputDialog" : this$1.f33770y, DialogCallback.CallbackType.f31102c, bundleD);
                } else {
                    editText.setError(this$1.getString(R.string.common_password_doesnt_meet_requirements));
                }
                break;
        }
    }
}
