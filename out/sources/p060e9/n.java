package p060e9;

import Fa.d;
import M0.h;
import O8.b;
import P8.c;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1452q;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.measurement.M1;
import com.obdeleven.service.model.UDSResult;
import com.obdeleven.service.odx.e;
import com.parse.ControlUnitDB;
import com.parse.ParseQuery;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.a;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import com.voltasit.parse.model.HistoryDB;
import e9.n.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.i;
import p220r9.B;
import p220r9.J;
import p220r9.P;
import p255u9.D;
import p255u9.E;
import p255u9.y;

/* JADX INFO: compiled from: VehicleBackupFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@b("http://obdeleven.proboards.com/thread/97/history")
public abstract class n extends BaseFragment<h> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RecyclerView f34851l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public E f34852m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public HistoryDB f34853n;

    /* JADX INFO: compiled from: VehicleBackupFragment.kt */
    public static final class a<TTaskResult, TContinuationResult> implements Continuation {
        public a() {
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Object then(Task task) {
            C2134a0.a();
            boolean zIsFaulted = task.isFaulted();
            n nVar = n.this;
            if (!zIsFaulted) {
                nVar.startActivity(Intent.createChooser((Intent) task.getResult(), nVar.getString(R.string.common_send_history)));
                UserTrackingUtils.c(UserTrackingUtils.Key.f34247H, 1);
                return null;
            }
            int i10 = J.i(task.getError());
            MainActivity mainActivityQ = nVar.q();
            P.a(mainActivityQ, mainActivityQ.getString(i10));
            return null;
        }
    }

    public static void R(ArrayList arrayList, e.g gVar, e eVar) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            y yVar = (y) it.next();
            try {
                if ("SECURITY_ACCESS".equals(yVar.b())) {
                    UDSResult.a("33");
                } else {
                    UDSResult.b(yVar.a(), yVar.b(), gVar, eVar);
                }
            } catch (Exception e10) {
                O.e.m(e10);
            }
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final View B(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_vehicle_backup, viewGroup, false);
        if (bundle != null) {
            this.f34852m = (E) bundle.getParcelable("vehicleDb");
            this.f34853n = (HistoryDB) bundle.getParcelable("historyDb");
        } else if (getArguments() != null) {
            this.f34852m = (E) requireArguments().getParcelable("vehicleDb");
            this.f34853n = (HistoryDB) requireArguments().getParcelable("historyDb");
        }
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.vehicleBackupFragment_list);
        this.f34851l = recyclerView;
        recyclerView.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        C1452q c1452q = new C1452q(recyclerView.getContext(), linearLayoutManager.f19521p);
        Drawable drawable = recyclerView.getResources().getDrawable(R.drawable.divider_list_transparent);
        if (drawable == null) {
            throw new IllegalArgumentException("Drawable cannot be null.");
        }
        c1452q.f19936a = drawable;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.i(c1452q);
        if (this.f34852m != null && this.f34853n != null) {
            Q();
            return viewInflate;
        }
        p279w9.b bVar = Application.f29634b;
        c.a(5, "VehicleBackupFragment", "Vehicle or History instance is null", Arrays.copyOf(new Object[0], 0));
        MainActivity mainActivityQ = q();
        P.a(mainActivityQ, mainActivityQ.getString(R.string.common_something_went_wrong));
        q().K();
        return viewInflate;
    }

    public final com.obdeleven.service.odx.c O(String str, String str2, String str3) {
        HistoryDB historyDB = this.f34853n;
        i.b(historyDB);
        short sShortValue = historyDB.c().getControlUnitBase().a().shortValue();
        i.b(str);
        i.b(str2);
        return new com.obdeleven.service.odx.c(sShortValue, str, str2, str3, true);
    }

    public final Task<e> P() {
        Task<e> taskCallInBackground = Task.callInBackground(new Callable() { // from class: e9.m
            /* JADX WARN: Code duplicated, block: B:36:0x008e  */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.obdeleven.service.odx.c cVarO;
                ControlUnitDB controlUnitDBC;
                ControlUnitDB controlUnitDBC2;
                D dI;
                n this$0 = this.f34850b;
                i.e(this$0, "this$0");
                if (this$0.f34852m == null) {
                    ParseQuery query = ParseQuery.getQuery(E.class);
                    E e10 = this$0.f34852m;
                    i.b(e10);
                    this$0.f34852m = (E) query.get(e10.getObjectId());
                }
                d dVar = new d(new com.voltasit.obdeleven.domain.usecases.odx.c());
                HistoryDB historyDB = this$0.f34853n;
                i.b(historyDB);
                com.obdeleven.service.odx.d dVarC = dVar.c(historyDB);
                E e11 = this$0.f34852m;
                D dI2 = e11 != null ? e11.i() : null;
                E e12 = this$0.f34852m;
                String string = (e12 == null || (dI = e12.i()) == null) ? null : dI.getString("platform");
                if (dVarC == null) {
                    HistoryDB historyDB2 = this$0.f34853n;
                    String oDXName = (historyDB2 == null || (controlUnitDBC2 = historyDB2.c()) == null) ? null : controlUnitDBC2.getODXName();
                    HistoryDB historyDB3 = this$0.f34853n;
                    String oDXVersion = (historyDB3 == null || (controlUnitDBC = historyDB3.c()) == null) ? null : controlUnitDBC.getODXVersion();
                    if (oDXName == null || oDXVersion == null || dI2 == null || string == null) {
                        cVarO = null;
                    } else {
                        cVarO = this$0.O(oDXName, oDXVersion, string);
                    }
                } else if (dI2 == null || string == null) {
                    cVarO = null;
                } else {
                    cVarO = this$0.O(dVarC.f29486a, dVarC.f29487b, string);
                }
                if (cVarO == null) {
                    return null;
                }
                return e.a(cVarO);
            }
        });
        i.d(taskCallInBackground, "callInBackground(...)");
        return taskCallInBackground;
    }

    public abstract void Q();

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "VehicleBackupFragment";
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        i.e(menu, "menu");
        i.e(inflater, "inflater");
        MenuItem menuItemAdd = menu.add(R.string.common_share);
        menuItemAdd.setIcon(2131231719);
        menuItemAdd.setShowAsAction(1);
        menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: e9.k
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem it) {
                n this$0 = this.f34848a;
                i.e(this$0, "this$0");
                i.e(it, "it");
                C2134a0.b(this$0.q(), R.string.common_generating_log);
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                List<String> list = a.f29638c;
                Context contextRequireContext = this$0.requireContext();
                i.d(contextRequireContext, "requireContext(...)");
                intent.putExtra("android.intent.extra.EMAIL", new String[]{a.C0320a.a(contextRequireContext).g()});
                RecyclerView recyclerView = this$0.f34851l;
                i.b(recyclerView);
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                ArrayList arrayList = new ArrayList();
                if (adapter instanceof p147l9.e) {
                    Collection collection = ((p147l9.e) adapter).f36779a;
                    i.d(collection, "getItems(...)");
                    arrayList.addAll(collection);
                }
                Context applicationContext = this$0.q().getApplicationContext();
                E e10 = this$0.f34852m;
                i.b(e10);
                final B.a aVar = new B.a(applicationContext, e10);
                aVar.f46405c = M1.k(this$0.f34853n);
                aVar.f46406d = arrayList;
                Task.callInBackground(new Callable() { // from class: e9.l
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        B.a logBuilder = aVar;
                        i.e(logBuilder, "$logBuilder");
                        return logBuilder.a();
                    }
                }).continueWith(this$0.new a());
                return true;
            }
        });
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        i.e(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putParcelable("vehicleDb", this.f34852m);
        outState.putParcelable("historyDb", this.f34853n);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        String string = getString(R.string.common_backup);
        i.d(string, "getString(...)");
        return string;
    }
}
