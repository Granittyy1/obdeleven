package com.voltasit.obdeleven.presentation.dialogs;

import android.content.DialogInterface;
import androidx.fragment.app.ActivityC1347l;
import androidx.fragment.app.Fragment;
import com.voltasit.obdeleven.presentation.signIn.SigninFragment;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.utils.NavigationManager;
import java.util.List;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fragment f32265c;

    public /* synthetic */ h(Fragment fragment, int i10) {
        this.f32264b = i10;
        this.f32265c = fragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        NavigationManager navigationManager;
        Fragment fragment = this.f32265c;
        switch (this.f32264b) {
            case 0:
                i this$0 = (i) fragment;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                ActivityC1347l activity = this$0.getActivity();
                MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
                if (mainActivity != null && (navigationManager = mainActivity.f33533B) != null) {
                    navigationManager.g("https://support.obdeleven.com/en/collections/3195142-sfd");
                    break;
                }
                break;
            default:
                List<String> list = SigninFragment.f33197n;
                SigninFragment this$1 = (SigninFragment) fragment;
                kotlin.jvm.internal.i.e(this$1, "this$0");
                this$1.p();
                break;
        }
    }
}
