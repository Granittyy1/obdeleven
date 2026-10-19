package X8;

import android.view.View;
import androidx.lifecycle.D;
import androidx.lifecycle.Z;
import com.google.android.material.snackbar.Snackbar;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.garage.GarageFragment;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import java.util.ArrayList;
import kotlinx.coroutines.C2680e;
import p220r9.P;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f7375c;

    public /* synthetic */ b(BaseFragment baseFragment, int i10) {
        this.f7374b = i10;
        this.f7375c = baseFragment;
    }

    @Override // androidx.lifecycle.D
    public final void d(Object obj) {
        switch (this.f7374b) {
            case 0:
                ((s) this.f7375c).V();
                break;
            default:
                final com.voltasit.obdeleven.presentation.garage.t tVar = (com.voltasit.obdeleven.presentation.garage.t) obj;
                final GarageFragment this$0 = (GarageFragment) this.f7375c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                MainActivity mainActivityQ = this$0.q();
                tVar.getClass();
                Snackbar snackbarD = P.d(mainActivityQ, R.string.snackbar_remove_vehicle, R.string.common_remove, new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.garage.i
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        GarageFragment this$1 = this$0;
                        kotlin.jvm.internal.i.e(this$1, "this$0");
                        GarageViewModel garageViewModelO = this$1.O();
                        int i10 = tVar.f32393a;
                        garageViewModelO.getClass();
                        C2680e.c(Z.a(garageViewModelO), garageViewModelO.f32112a, null, new GarageViewModel$deleteVehicle$1(garageViewModelO, i10, null), 2);
                    }
                });
                com.voltasit.obdeleven.presentation.garage.o oVar = new com.voltasit.obdeleven.presentation.garage.o(this$0, tVar);
                if (snackbarD.f27407u == null) {
                    snackbarD.f27407u = new ArrayList();
                }
                snackbarD.f27407u.add(oVar);
                break;
        }
    }
}
