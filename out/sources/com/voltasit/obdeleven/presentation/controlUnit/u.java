package com.voltasit.obdeleven.presentation.controlUnit;

import android.os.Bundle;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.presentation.controlUnit.faults.FaultsFragment;
import com.voltasit.obdeleven.presentation.pro.BaseProFragment;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.C2161o;
import com.voltasit.obdeleven.ui.dialogs.I0;
import java.util.Arrays;
import p220r9.P;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31890c;

    public /* synthetic */ u(int i10, Object obj) {
        this.f31889b = i10;
        this.f31890c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f31890c;
        switch (this.f31889b) {
            case 0:
                ControlUnitFragment this$0 = (ControlUnitFragment) obj;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                FaultsFragment jVar = this$0.f31429o instanceof p109i8.i ? new p170n9.j() : new FaultsFragment();
                jVar.f31591n = this$0.f31429o;
                this$0.r().n(jVar, null);
                break;
            case 1:
                BaseProFragment this$1 = (BaseProFragment) obj;
                kotlin.jvm.internal.i.e(this$1, "this$0");
                this$1.O().d();
                break;
            case 2:
                boolean z10 = MainActivity.f33531Q;
                MainActivity this$2 = (MainActivity) obj;
                kotlin.jvm.internal.i.e(this$2, "this$0");
                this$2.B().g(this$2.E());
                DrawerLayout drawerLayout = this$2.f33555k;
                kotlin.jvm.internal.i.b(drawerLayout);
                drawerLayout.d();
                break;
            case 3:
                C2161o c2161o = (C2161o) obj;
                c2161o.getClass();
                c2161o.w("editCarNameDialog", DialogCallback.CallbackType.f31101b, new Bundle());
                break;
            default:
                p073f9.b bVar = (p073f9.b) obj;
                if (bVar.f35013t == 0 && bVar.Q().f36779a.isEmpty()) {
                    MainActivity mainActivityQ = bVar.q();
                    P.a(mainActivityQ, mainActivityQ.getString(R.string.common_add_value));
                } else {
                    int i10 = bVar.f35013t;
                    if (i10 == 0) {
                        bVar.U(1);
                    } else if (i10 == 1) {
                        bVar.U(2);
                    } else if (i10 == 2) {
                        String strO = bVar.o();
                        p279w9.b bVar2 = Application.f29634b;
                        P8.c.a(3, strO, "Chart saving...", Arrays.copyOf(new Object[0], 0));
                        Bundle bundle = new Bundle();
                        p073f9.h hVar = new p073f9.h();
                        hVar.setArguments(bundle);
                        hVar.f32261r = bVar.getFragmentManager();
                        hVar.setTargetFragment(bVar, 0);
                        hVar.A();
                    } else if (i10 == 3) {
                        Bundle bundleA = Z3.o.a("key_tag", R.string.view_chart_delete_chart, "deleteChartDialog", "key_title");
                        bundleA.putInt("key_positive_text", R.string.common_delete);
                        bundleA.putInt("key_negative_text", R.string.common_cancel);
                        I0 i11 = new I0();
                        i11.setArguments(bundleA);
                        i11.f32261r = bVar.getFragmentManager();
                        i11.setTargetFragment(bVar, 0);
                        i11.A();
                    }
                }
                break;
        }
    }
}
