package p170n9;

import B8.AbstractC0629h;
import B8.E0;
import K2.CallableC0723p;
import O8.b;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import androidx.fragment.app.y;
import com.bumptech.glide.d;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.odx.c;
import com.obdeleven.service.util.FaultsUtils;
import com.parse.ControlUnitDB;
import com.parse.boltsinternal.CancellationTokenSource;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.DatabaseLanguage;
import com.voltasit.obdeleven.presentation.controlUnit.faults.FaultsFragment;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.C2177w0;
import com.voltasit.parse.model.HistoryDB;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.i;
import p097h9.n;
import p122j9.a;
import p134k8.a2;
import p255u9.C2801d;
import p255u9.D;
import p255u9.E;

/* JADX INFO: compiled from: GenericFaultFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@b("http://obdeleven.proboards.com/thread/105/faults")
public final class i extends FaultsFragment {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public HistoryDB f45015r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f45016s = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CancellationTokenSource f45017t = new CancellationTokenSource();

    @Override // com.voltasit.obdeleven.presentation.controlUnit.faults.FaultsFragment
    public final void P() {
        Bundle bundle = this.f34090k;
        kotlin.jvm.internal.i.b(bundle);
        this.f45015r = (HistoryDB) bundle.getParcelable("historyItem");
        MainActivity mainActivityQ = q();
        DatabaseLanguage databaseLanguage = this.f31592o;
        HistoryDB historyDB = this.f45015r;
        this.f31590m = new a(mainActivityQ, databaseLanguage, historyDB == null ? null : historyDB.getVehicle(), false);
    }

    @Override // com.voltasit.obdeleven.presentation.controlUnit.faults.FaultsFragment, com.voltasit.obdeleven.ui.module.BaseFragment
    /* JADX INFO: renamed from: S */
    public final void C(AbstractC0629h abstractC0629h) {
        E vehicle;
        super.C(abstractC0629h);
        Bundle bundle = this.f34090k;
        kotlin.jvm.internal.i.b(bundle);
        this.f45015r = (HistoryDB) bundle.getParcelable("historyItem");
        abstractC0629h.f1927r.setVisibility(8);
        HistoryDB historyDB = this.f45015r;
        if (historyDB == null || (vehicle = historyDB.getVehicle()) == null || !vehicle.isDataAvailable()) {
            return;
        }
        W();
    }

    @Override // com.voltasit.obdeleven.presentation.controlUnit.faults.FaultsFragment
    public final void V(Menu menu) {
        kotlin.jvm.internal.i.e(menu, "menu");
        MenuItem menuItemAdd = menu.add("Share");
        menuItemAdd.setIcon(2131231719);
        menuItemAdd.setShowAsAction(1);
        menuItemAdd.setOnMenuItemClickListener(new n(this, 1));
    }

    @Override // com.voltasit.obdeleven.presentation.controlUnit.faults.FaultsFragment
    public final void W() {
        String strC;
        boolean z10 = false;
        Q().f1934y.setEnabled(false);
        Q().f1928s.h();
        HistoryDB historyDB = this.f45015r;
        kotlin.jvm.internal.i.b(historyDB);
        C2801d controlUnitBase = historyDB.c().getControlUnitBase();
        String url = (controlUnitBase == null || controlUnitBase.getParseFile("picture") == null) ? null : controlUnitBase.getParseFile("picture").getUrl();
        if (controlUnitBase != null) {
            DatabaseLanguage databaseLanguage = this.f31592o;
            kotlin.jvm.internal.i.b(databaseLanguage);
            strC = controlUnitBase.c(databaseLanguage.b());
        } else {
            strC = "";
        }
        d<Drawable> dVarM = com.bumptech.glide.b.d(Q().f1929t).m(url);
        T3.d dVarJ = ((T3.d) E0.a(R.drawable.control_unit_default)).f(R.drawable.control_unit_default).j(R.drawable.control_unit_default);
        kotlin.jvm.internal.i.d(dVarJ, "placeholder(...)");
        dVarM.a(dVarJ).x(Q().f1929t);
        Q().f1933x.setText(strC);
        y parentFragmentManager = getParentFragmentManager();
        Bundle bundle = new Bundle();
        bundle.putString("key_message", getString(R.string.common_loading));
        final C2177w0 c2177w0 = new C2177w0();
        c2177w0.setArguments(bundle);
        c2177w0.f32261r = parentFragmentManager;
        c2177w0.A();
        final ArrayList arrayList = new ArrayList();
        HistoryDB historyDB2 = this.f45015r;
        kotlin.jvm.internal.i.b(historyDB2);
        ControlUnitDB controlUnitDBC = historyDB2.c();
        HistoryDB historyDB3 = this.f45015r;
        kotlin.jvm.internal.i.b(historyDB3);
        final ControlUnit controlUnit = new ControlUnit(controlUnitDBC, new a2(historyDB3.getVehicle()), null, null);
        HistoryDB historyDB4 = this.f45015r;
        kotlin.jvm.internal.i.b(historyDB4);
        final ApplicationProtocol applicationProtocolA = ApplicationProtocol.a(historyDB4.c().getProtocol());
        HistoryDB historyDB5 = this.f45015r;
        kotlin.jvm.internal.i.b(historyDB5);
        if (historyDB5.getVehicle() != null) {
            HistoryDB historyDB6 = this.f45015r;
            kotlin.jvm.internal.i.b(historyDB6);
            if (historyDB6.getVehicle().i() != null) {
                HistoryDB historyDB7 = this.f45015r;
                kotlin.jvm.internal.i.b(historyDB7);
                D dI = historyDB7.getVehicle().i();
                kotlin.jvm.internal.i.b(dI);
                if (dI.getBoolean("supported")) {
                    z10 = true;
                }
            }
        }
        final boolean z11 = z10;
        Task.callInBackground(new Callable() { // from class: n9.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                c cVar;
                final i this$0 = this.f45006b;
                i.e(this$0, "this$0");
                ControlUnit controlUnit2 = controlUnit;
                ApplicationProtocol applicationProtocol = applicationProtocolA;
                final ArrayList arrayList2 = arrayList;
                final C2177w0 c2177w1 = c2177w0;
                Fa.d dVar = new Fa.d(new com.voltasit.obdeleven.domain.usecases.odx.c());
                HistoryDB historyDB8 = this$0.f45015r;
                i.b(historyDB8);
                com.obdeleven.service.odx.d dVarC = dVar.c(historyDB8);
                if (dVarC != null) {
                    short sShortValue = controlUnit2.n().shortValue();
                    HistoryDB historyDB9 = this$0.f45015r;
                    i.b(historyDB9);
                    String string = new a2(historyDB9.getVehicle()).f42726c.i().getString("platform");
                    i.d(string, "getPlatform(...)");
                    cVar = new c(sShortValue, dVarC.f29486a, dVarC.f29487b, string, true);
                } else {
                    cVar = null;
                }
                HistoryDB historyDB10 = this$0.f45015r;
                i.b(historyDB10);
                arrayList2.addAll(p169n8.a.k(applicationProtocol, historyDB10.e(), z11, controlUnit2, cVar));
                controlUnit2.q().addAll(arrayList2);
                controlUnit2.f29337t = !controlUnit2.q().isEmpty();
                this$0.f45016s.add(controlUnit2);
                FaultsUtils.f(controlUnit2, arrayList2, new Runnable() { // from class: n9.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        i this$1 = this$0;
                        i.e(this$1, "this$0");
                        Task.call(new CallableC0723p(this$1, c2177w1, arrayList2), Task.UI_THREAD_EXECUTOR);
                    }
                });
                return null;
            }
        }, this.f45017t.getToken());
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f45017t.cancel();
    }

    @Override // com.voltasit.obdeleven.presentation.controlUnit.faults.FaultsFragment, android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j) {
        this.f31592o = DatabaseLanguage.values()[i10];
        a aVar = this.f31590m;
        kotlin.jvm.internal.i.b(aVar);
        aVar.f41161e = this.f31592o;
        aVar.notifyDataSetChanged();
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.i.e(outState, "outState");
        super.onSaveInstanceState(outState);
        HistoryDB historyDB = this.f45015r;
        if (historyDB != null) {
            outState.putParcelable("historyItem", historyDB);
        }
    }

    @Override // com.voltasit.obdeleven.presentation.controlUnit.faults.FaultsFragment
    public final void O() {
    }

    @Override // com.voltasit.obdeleven.presentation.controlUnit.faults.FaultsFragment
    public final void T(boolean z10) {
    }
}
