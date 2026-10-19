package p033c7;

import android.os.Bundle;
import androidx.appcompat.widget.SearchView;
import com.google.firebase.messaging.w;
import com.voltasit.obdeleven.presentation.garage.GarageFragment;
import com.voltasit.obdeleven.presentation.garage.GarageViewModel;
import java.io.IOException;
import kotlin.jvm.internal.i;
import p183oa.c;
import p191p5.InterfaceC2755a;
import p191p5.g;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b0 implements c, InterfaceC2755a, SearchView.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22427b;

    public /* synthetic */ b0(Object obj) {
        this.f22427b = obj;
    }

    @Override // p183oa.c, p311z4.f
    public Object apply(Object obj) {
        Z z10 = (Z) obj;
        e0 e0Var = (e0) this.f22427b;
        T t8 = e0Var.f22440a;
        t8.getClass();
        return new io.reactivex.internal.operators.completable.c(new S(t8, z10)).d(new r(e0Var, 1, z10));
    }

    @Override // androidx.appcompat.widget.SearchView.j
    public void e() {
        GarageFragment this$0 = (GarageFragment) this.f22427b;
        i.e(this$0, "this$0");
        GarageViewModel garageViewModelO = this$0.O();
        garageViewModelO.getClass();
        garageViewModelO.f32347x = "";
        garageViewModelO.g(false, false);
    }

    @Override // p191p5.InterfaceC2755a
    public Object i(g gVar) throws IOException {
        ((w) this.f22427b).getClass();
        Bundle bundle = (Bundle) gVar.l();
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null || (string = bundle.getString("unregistered")) != null) {
            return string;
        }
        String string2 = bundle.getString("error");
        if ("RST".equals(string2)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string2 != null) {
            throw new IOException(string2);
        }
        bundle.toString();
        new Throwable();
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }
}
