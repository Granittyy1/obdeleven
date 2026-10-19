package p170n9;

import B8.AbstractC0633j;
import B8.E0;
import J8.u;
import P8.c;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.enums.SupportedFunction;
import com.obdeleven.service.exception.ControlUnitException;
import com.obdeleven.service.model.ControlUnit;
import com.parse.ControlUnitDB;
import com.parse.ParseFile;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.app.I;
import com.voltasit.obdeleven.domain.usecases.s;
import com.voltasit.obdeleven.models.MenuOption;
import com.voltasit.obdeleven.presentation.controlUnit.ControlUnitFragment;
import com.voltasit.obdeleven.presentation.profile.k;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.i;
import org.koin.java.KoinJavaComponent;
import p121j8.e;
import p134k8.a2;
import p255u9.C2801d;
import p255u9.E;
import p279w9.b;
import p279w9.d;

/* JADX INFO: compiled from: OfflineControlUnitFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends ControlUnitFragment {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final s f45020E = (s) KoinJavaComponent.a(s.class);

    @Override // com.voltasit.obdeleven.presentation.controlUnit.ControlUnitFragment, com.voltasit.obdeleven.ui.module.BaseFragment
    public final View B(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(inflater, "inflater");
        View viewB = super.B(inflater, viewGroup, bundle);
        if (this.f31429o == null) {
            return viewB;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(SupportedFunction.f29281b);
        arrayList.add(SupportedFunction.f29282c);
        arrayList.add(SupportedFunction.f29296r);
        arrayList.add(SupportedFunction.f29292n);
        arrayList.add(SupportedFunction.f29285f);
        ControlUnit controlUnit = this.f31429o;
        i.b(controlUnit);
        int iOrdinal = controlUnit.f29320b.getCodingType().ordinal();
        if (iOrdinal == 3) {
            arrayList.add(SupportedFunction.f29286g);
        } else if (iOrdinal == 4) {
            arrayList.add(SupportedFunction.f29287h);
        }
        ControlUnit controlUnit2 = this.f31429o;
        i.b(controlUnit2);
        int iOrdinal2 = controlUnit2.f29320b.getAdaptationType().ordinal();
        SupportedFunction supportedFunction = SupportedFunction.f29288i;
        if (iOrdinal2 == 0 || iOrdinal2 == 1) {
            arrayList.add(supportedFunction);
        } else if (iOrdinal2 == 2) {
            arrayList.add(SupportedFunction.j);
        }
        ControlUnit controlUnit3 = this.f31429o;
        i.b(controlUnit3);
        ApplicationProtocol applicationProtocol = controlUnit3.f29327i;
        ApplicationProtocol applicationProtocol2 = ApplicationProtocol.f29264d;
        if (applicationProtocol == applicationProtocol2) {
            arrayList.add(SupportedFunction.f29283d);
        }
        ControlUnit controlUnit4 = this.f31429o;
        i.b(controlUnit4);
        if (controlUnit4.f29327i == applicationProtocol2) {
            arrayList.add(SupportedFunction.f29289k);
        }
        ControlUnit controlUnit5 = this.f31429o;
        i.b(controlUnit5);
        if (controlUnit5.f29327i == applicationProtocol2) {
            arrayList.add(SupportedFunction.f29290l);
        }
        X().f1970u.setVisibility(8);
        try {
            ControlUnit controlUnit6 = this.f31429o;
            i.b(controlUnit6);
            if (controlUnit6.W().f42830b == null) {
                H(R.string.common_loading_data);
                Task.callInBackground(new Callable() { // from class: n9.l
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        m this$0 = this.f45019b;
                        i.e(this$0, "this$0");
                        return e.a(this$0.f31429o);
                    }
                }).continueWith(new V8.m(6, this), Task.UI_THREAD_EXECUTOR);
            }
        } catch (ControlUnitException e10) {
            b bVar = Application.f29634b;
            c.b(e10);
        }
        this.f31434t = new ArrayList();
        ControlUnit controlUnit7 = this.f31429o;
        i.b(controlUnit7);
        if (controlUnit7.f29320b.hasSubsystems()) {
            ControlUnitDB controlUnitDB = this.f31430p;
            i.b(controlUnitDB);
            ControlUnitDB controlUnitDB2 = this.f31430p;
            i.b(controlUnitDB2);
            E e11 = this.f31428n;
            i.b(e11);
            d.a(controlUnitDB.getSubsystemsQuery(controlUnitDB2, e11), null, null).continueWith(new I(this, 1, arrayList), Task.UI_THREAD_EXECUTOR);
        } else {
            V(arrayList);
        }
        return viewB;
    }

    @Override // com.voltasit.obdeleven.presentation.controlUnit.ControlUnitFragment
    public final boolean Z() {
        return true;
    }

    @Override // com.voltasit.obdeleven.presentation.controlUnit.ControlUnitFragment
    public final void b0() {
        U(MenuOption.f31150c, R.string.common_faults, new k(this, 3));
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "OfflineControlUnitFragment";
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (bundle == null) {
            bundle = arguments;
        }
        if (bundle == null) {
            return;
        }
        this.f31431q = (C2801d) bundle.getParcelable("ControlUnitBaseDB");
        this.f31430p = (ControlUnitDB) bundle.getParcelable("ControlUnitDB");
        E e10 = (E) bundle.getParcelable("vehicleData");
        this.f31428n = e10;
        if (e10 != null) {
            this.f31429o = new ControlUnit(this.f31430p, new a2(this.f31428n), null, null);
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        String url;
        super.onResume();
        C2801d c2801d = this.f31431q;
        i.b(c2801d);
        ParseFile parseFile = c2801d.getParseFile("picture");
        if (parseFile != null) {
            url = parseFile.getUrl();
            i.d(url, "getUrl(...)");
        } else {
            url = "";
        }
        com.bumptech.glide.d<Drawable> dVarM = com.bumptech.glide.b.c(getContext()).f(this).m(url);
        T3.d dVarJ = ((T3.d) E0.a(R.drawable.control_unit_default)).f(R.drawable.control_unit_default).j(R.drawable.control_unit_default);
        i.d(dVarJ, "placeholder(...)");
        dVarM.a(dVarJ).x(X().f1968s);
        AbstractC0633j abstractC0633jX = X();
        C2801d c2801d2 = this.f31431q;
        i.b(c2801d2);
        abstractC0633jX.f1970u.setText(c2801d2.b());
        AbstractC0633j abstractC0633jX2 = X();
        C2801d c2801d3 = this.f31431q;
        i.b(c2801d3);
        abstractC0633jX2.f1969t.setText(c2801d3.getString("name"));
        W();
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        i.e(bundle, "bundle");
        super.onSaveInstanceState(bundle);
        boolean zE = ((u) KoinJavaComponent.a(u.class)).e();
        O.e.j("OfflineControlUnitFragment", "isSaveInstanceStateEnabled: " + zE);
        if (zE) {
            bundle.putParcelable("ControlUnitBaseDB", this.f31431q);
            bundle.putParcelable("ControlUnitDB", this.f31430p);
            bundle.putParcelable("vehicleData", this.f31428n);
        }
    }
}
