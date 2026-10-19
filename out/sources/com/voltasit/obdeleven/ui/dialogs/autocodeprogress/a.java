package com.voltasit.obdeleven.ui.dialogs.autocodeprogress;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.voltasit.obdeleven.utils.NavigationManager;
import kotlin.jvm.internal.i;
import p097h9.r;
import p097h9.x;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fragment f33892c;

    public /* synthetic */ a(Fragment fragment, int i10) {
        this.f33891b = i10;
        this.f33892c = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f33891b) {
            case 0:
                AutocodeProgressDialog this$0 = (AutocodeProgressDialog) this.f33892c;
                i.e(this$0, "this$0");
                this$0.B().e();
                break;
            default:
                x xVar = (x) this.f33892c;
                xVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putParcelable("vehicleBase", xVar.f36251o);
                NavigationManager navigationManagerR = xVar.r();
                r rVar = new r();
                rVar.setArguments(bundle);
                navigationManagerR.n(rVar, null);
                break;
        }
    }
}
