package X5;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.text.Editable;
import android.util.Pair;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.ActivityC1347l;
import androidx.media3.exoplayer.C1403v;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.presentation.twofactorauth.setup.TwoFactorAuthSetupFragment;
import com.voltasit.obdeleven.presentation.twofactorauth.setup.TwoFactorAuthSetupViewModel;
import com.voltasit.obdeleven.ui.dialogs.N0;
import com.voltasit.obdeleven.ui.dialogs.O0;
import java.util.ArrayList;

/* JADX INFO: renamed from: X5.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC0832a implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7235c;

    public /* synthetic */ ViewOnClickListenerC0832a(int i10, Object obj) {
        this.f7234b = i10;
        this.f7235c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, xa.g] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f7234b) {
            case 0:
                h hVar = (h) this.f7235c;
                EditText editText = hVar.f7246i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    hVar.q();
                    break;
                }
                break;
            case 1:
                TwoFactorAuthSetupFragment this$0 = (TwoFactorAuthSetupFragment) this.f7235c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                TwoFactorAuthSetupViewModel twoFactorAuthSetupViewModel = (TwoFactorAuthSetupViewModel) this$0.f33327m.getValue();
                ActivityC1347l activityC1347lRequireActivity = this$0.requireActivity();
                kotlin.jvm.internal.i.d(activityC1347lRequireActivity, "requireActivity(...)");
                twoFactorAuthSetupViewModel.getClass();
                String str = (String) twoFactorAuthSetupViewModel.f33332r.d();
                if (str != null) {
                    twoFactorAuthSetupViewModel.f33330p.getClass();
                    Object systemService = activityC1347lRequireActivity.getSystemService("clipboard");
                    ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
                    if (clipboardManager != null) {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("", str));
                    }
                    twoFactorAuthSetupViewModel.f33333s.j(Integer.valueOf(R.string.common_copied_to_clipboard));
                    break;
                }
                break;
            case 2:
                N0.a aVar = (N0.a) this.f7235c;
                N0 n10 = aVar.f33828d;
                C1403v c1403v = n10.f33827e;
                Pair pair = new Pair((String) n10.f36779a.get(aVar.getAdapterPosition()), Integer.valueOf(aVar.getAdapterPosition()));
                c1403v.getClass();
                O0 o10 = (O0) c1403v.f18827b;
                o10.getClass();
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add((String) pair.first);
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("items", arrayList);
                bundle.putInt("key_last_position", ((Integer) pair.second).intValue());
                o10.w("MultiChoiceDialog", DialogCallback.CallbackType.f31102c, bundle);
                o10.y();
                break;
            case 3:
                p048d9.a this$1 = (p048d9.a) this.f7235c;
                kotlin.jvm.internal.i.e(this$1, "this$0");
                this$1.P();
                break;
            case 4:
                androidx.media3.ui.c cVar = androidx.media3.ui.c.this;
                p078g1.v vVar = cVar.f18991z0;
                if (vVar != null && vVar.L(29)) {
                    cVar.f18991z0.z(cVar.f18991z0.U().a().b(3).d().f().h().a());
                    cVar.f18967l.dismiss();
                    break;
                }
                break;
            default:
                p165n4.v this$2 = (p165n4.v) this.f7235c;
                kotlin.jvm.internal.i.e(this$2, "this$0");
                this$2.cancel();
                break;
        }
    }
}
