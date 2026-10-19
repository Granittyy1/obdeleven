package com.google.gson.internal;

import V8.n;
import android.content.Context;
import android.util.Log;
import androidx.appcompat.widget.SearchView;
import com.braze.models.cards.ICardListener;
import com.braze.ui.feed.view.BaseFeedCardView;
import com.google.android.gms.internal.measurement.Y;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.gson.JsonIOException;
import com.parse.ParseException;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.models.HistoryTypeFilter;
import com.voltasit.obdeleven.presentation.appList.AppListFragment;
import com.voltasit.obdeleven.presentation.appList.AppListViewModel;
import com.voltasit.obdeleven.presentation.garage.GarageFragment;
import com.voltasit.obdeleven.presentation.garage.GarageViewModel;
import com.voltasit.obdeleven.presentation.history.vehicle.VehicleHistoryFragment;
import com.voltasit.parse.model.HistoryDB;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p220r9.J;
import p228s6.p;
import p228s6.q;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements f, SearchView.j, O8.d, w9.d.b, i8.i.b, p228s6.d, p096h7.a.InterfaceC0377a, ICardListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28852b;

    public /* synthetic */ a(Object obj) {
        this.f28852b = obj;
    }

    @Override // i8.i.b
    public void a() {
        p073f9.k kVar = (p073f9.k) this.f28852b;
        ((p109i8.i) kVar.f35016w).g().continueWith(new n(6, kVar));
    }

    @Override // androidx.appcompat.widget.SearchView.k
    public boolean c(String query) {
        GarageFragment this$0 = (GarageFragment) this.f28852b;
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(query, "query");
        GarageViewModel garageViewModelO = this$0.O();
        garageViewModelO.getClass();
        garageViewModelO.f32347x = query;
        garageViewModelO.g(false, false);
        return true;
    }

    @Override // p096h7.a.InterfaceC0377a
    public void d(p096h7.b bVar) {
        p252u6.a aVar = (p252u6.a) this.f28852b;
        aVar.getClass();
        Log.isLoggable("FirebaseCrashlytics", 3);
        p192p6.a aVar2 = (p192p6.a) bVar.get();
        p005a4.c cVar = new p005a4.c(aVar2);
        p252u6.b bVar2 = new p252u6.b();
        p192p6.a.InterfaceC0518a interfaceC0518aF = aVar2.f("clx", bVar2);
        if (interfaceC0518aF == null) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            interfaceC0518aF = aVar2.f("crash", bVar2);
        }
        if (interfaceC0518aF != null) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            p276w6.d dVar = new p276w6.d();
            p276w6.c cVar2 = new p276w6.c(cVar, TimeUnit.MILLISECONDS);
            synchronized (aVar) {
                try {
                    Iterator it = aVar.f47430d.iterator();
                    while (it.hasNext()) {
                        dVar.c((p289x6.a) it.next());
                    }
                    bVar2.f47432b = dVar;
                    bVar2.f47431a = cVar2;
                    aVar.f47429c = dVar;
                    aVar.f47428b = cVar2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.SearchView.j
    public void e() {
        AppListFragment this$0 = (AppListFragment) this.f28852b;
        kotlin.jvm.internal.i.e(this$0, "this$0");
        this$0.f31241z = "";
        AppListViewModel.f(this$0.Q(), null, "", false, 5);
        this$0.T();
        this$0.R().f1813t.m0(0);
    }

    @Override // p228s6.d
    public Object f(q qVar) {
        return FirebasePerfRegistrar.lambda$getComponents$0((p) this.f28852b, qVar);
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, xa.g] */
    @Override // w9.d.b
    public void g(List items, ParseException parseException) {
        VehicleHistoryFragment this$0 = (VehicleHistoryFragment) this.f28852b;
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(items, "items");
        this$0.w();
        if (parseException != null) {
            if (parseException.getCode() != 100) {
                Context context = this$0.getContext();
                kotlin.jvm.internal.i.b(context);
                String strG = J.g(context, parseException);
                com.voltasit.obdeleven.presentation.history.vehicle.l lVar = (com.voltasit.obdeleven.presentation.history.vehicle.l) this$0.f32485v.getValue();
                lVar.getClass();
                lVar.f32512o.a(parseException);
                kotlin.jvm.internal.i.b(strG);
                this$0.T(strG, true);
                return;
            }
            Y.k(this$0, R.string.common_check_network, "TryAgainDialog");
        }
        Iterator it = items.iterator();
        while (it.hasNext()) {
            HistoryDB historyDB = (HistoryDB) it.next();
            historyDB.setVehicle(this$0.f32476m);
            if ((historyDB.c() != null && historyDB.c().getControlUnitBase() == null) || VehicleHistoryFragment.Q(historyDB) || (HistoryTypeFilter.b(historyDB.getString("type")) == HistoryTypeFilter.f31138i && !historyDB.d().optBoolean(MetricTracker.Action.COMPLETED))) {
                O.e.D("VehicleHistoryFragment", "History item remove because controlUnitBase or texttable is null or full scan is incompleted");
                it.remove();
            }
        }
        this$0.S(items);
    }

    @Override // com.google.gson.internal.f
    public Object i() {
        throw new JsonIOException((String) this.f28852b);
    }

    @Override // com.braze.models.cards.ICardListener
    public void onCardUpdate() {
        ((BaseFeedCardView) this.f28852b).lambda$setCard$1();
    }
}
