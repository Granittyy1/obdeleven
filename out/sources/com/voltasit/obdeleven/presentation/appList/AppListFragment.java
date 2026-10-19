package com.voltasit.obdeleven.presentation.appList;

import B8.U;
import D2.F;
import D2.I;
import G8.C0700b;
import Ia.l;
import Ia.p;
import K8.v;
import M0.h;
import Z3.o;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.compose.ui.text.font.s;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.D;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.gms.internal.measurement.M1;
import com.google.android.gms.internal.measurement.Y;
import com.parse.ParseUser;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.models.UserPermission;
import com.voltasit.obdeleven.domain.models.oca.OcaCategory;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.interfaces.Positionable$Transition;
import com.voltasit.obdeleven.interfaces.SimpleTransitionListener;
import com.voltasit.obdeleven.presentation.dialogs.backup.MultiBackupDialog;
import com.voltasit.obdeleven.presentation.oca.AppFragment;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.I0;
import com.voltasit.obdeleven.ui.dialogs.h1;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import io.intercom.android.sdk.models.Participant;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.q;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2680e;
import p220r9.A;
import p220r9.P;
import p220r9.Q;
import p255u9.E;
import p255u9.z;
import p293xa.r;

/* JADX INFO: compiled from: AppListFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public class AppListFragment extends BaseFragment<U> implements View.OnClickListener, DialogCallback, SwipeRefreshLayout.f, MultiBackupDialog.a, Jb.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f31227l = R.layout.fragment_app_list;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f31228m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f31229n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public U f31230o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.voltasit.obdeleven.presentation.appList.a f31231p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f31232q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public MenuItem f31233r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public E f31234s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f31235t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SwipeRefreshLayout f31236u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public SearchView f31237v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public h1 f31238w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public I0 f31239x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public MultiBackupDialog f31240y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f31241z;

    /* JADX INFO: compiled from: AppListFragment.kt */
    public static final class a implements SearchView.k {
        public a() {
        }

        @Override // androidx.appcompat.widget.SearchView.k
        public final boolean b(String newText) {
            i.e(newText, "newText");
            int length = newText.length();
            AppListFragment appListFragment = AppListFragment.this;
            if (length > 0) {
                appListFragment.T();
                SwipeRefreshLayout swipeRefreshLayout = appListFragment.f31236u;
                i.b(swipeRefreshLayout);
                swipeRefreshLayout.setEnabled(false);
                appListFragment.f31241z = newText;
                AppListViewModel appListViewModelQ = appListFragment.Q();
                String lowerCase = newText.toLowerCase();
                i.d(lowerCase, "toLowerCase(...)");
                AppListViewModel.f(appListViewModelQ, null, lowerCase, false, 5);
            } else {
                SwipeRefreshLayout swipeRefreshLayout2 = appListFragment.f31236u;
                i.b(swipeRefreshLayout2);
                swipeRefreshLayout2.setEnabled(true);
            }
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.k
        public final boolean c(String query) {
            i.e(query, "query");
            return false;
        }
    }

    /* JADX INFO: compiled from: AppListFragment.kt */
    public static final class b implements D, kotlin.jvm.internal.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lambda f31243b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(l lVar) {
            this.f31243b = (Lambda) lVar;
        }

        @Override // kotlin.jvm.internal.f
        public final p293xa.e<?> b() {
            return this.f31243b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        @Override // androidx.lifecycle.D
        public final /* synthetic */ void d(Object obj) {
            this.f31243b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof D) || !(obj instanceof kotlin.jvm.internal.f)) {
                return false;
            }
            return this.f31243b.equals(((kotlin.jvm.internal.f) obj).b());
        }

        public final int hashCode() {
            return this.f31243b.hashCode();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.voltasit.obdeleven.presentation.appList.AppListFragment$special$$inlined$viewModel$default$1] */
    public AppListFragment() {
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.presentation.appList.AppListFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ Fragment $this_viewModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            @Override // Ia.a
            public final Fragment invoke() {
                return this.$this_viewModel;
            }
        };
        this.f31228m = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<AppListViewModel>(this) { // from class: com.voltasit.obdeleven.presentation.appList.AppListFragment$special$$inlined$viewModel$default$2
            final /* synthetic */ Fragment $this_viewModel;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $extrasProducer = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.appList.AppListViewModel] */
            @Override // Ia.a
            public final AppListViewModel invoke() {
                p014b1.a defaultViewModelCreationExtras;
                Fragment fragment = this.$this_viewModel;
                Pb.a aVar = this.$qualifier;
                Ia.a aVar2 = r10;
                Ia.a aVar3 = this.$extrasProducer;
                Ia.a aVar4 = this.$parameters;
                b0 viewModelStore = ((c0) aVar2.invoke()).getViewModelStore();
                if (aVar3 == null || (defaultViewModelCreationExtras = (p014b1.a) aVar3.invoke()) == null) {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    i.d(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
                }
                return Gb.a.a(kotlin.jvm.internal.l.a(AppListViewModel.class), viewModelStore, null, defaultViewModelCreationExtras, aVar, Cb.a.i(fragment), aVar4);
            }
        });
        this.f31229n = kotlin.a.b(LazyThreadSafetyMode.f42971b, new Ia.a<J8.a>(this) { // from class: com.voltasit.obdeleven.presentation.appList.AppListFragment$special$$inlined$inject$default$1
            final /* synthetic */ Jb.a $this_inject;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_inject = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [J8.a, java.lang.Object] */
            @Override // Ia.a
            public final J8.a invoke() {
                Jb.a aVar = this.$this_inject;
                Pb.a aVar2 = this.$qualifier;
                return (aVar instanceof Jb.b ? ((Jb.b) aVar).b() : aVar.i().f3935a.f5143b).a(this.$parameters, aVar2, kotlin.jvm.internal.l.a(J8.a.class));
            }
        });
    }

    public static final void O(final AppListFragment appListFragment, d dVar, View view) {
        appListFragment.getClass();
        if (dVar instanceof d.b) {
            I8.a oca = ((d.b) dVar).f31317a;
            AppFragment appFragment = new AppFragment();
            ArrayList arrayList = new ArrayList();
            for (C0700b c0700b : appListFragment.Q().f31271b0) {
                if (i.a(c0700b.f3442a, oca.f3901a)) {
                    arrayList.add(c0700b);
                }
            }
            E e10 = appListFragment.f31234s;
            boolean z10 = appListFragment.f31235t;
            i.e(oca, "oca");
            Bundle bundle = new Bundle();
            bundle.putString("key_app_id", oca.f3901a);
            appFragment.setArguments(bundle);
            appFragment.f32676o = e10;
            appFragment.f32675n = z10;
            appFragment.f32677p = arrayList;
            F fC = new I(appListFragment.requireContext()).c();
            appFragment.setSharedElementEnterTransition(fC);
            fC.a(new SimpleTransitionListener() { // from class: com.voltasit.obdeleven.presentation.appList.e
                @Override // com.voltasit.obdeleven.interfaces.SimpleTransitionListener
                public final void f(SimpleTransitionListener.TransitionState transitionState) {
                    AppListFragment this$0 = this.f31318b;
                    i.e(this$0, "this$0");
                    if (transitionState != SimpleTransitionListener.TransitionState.f31118b) {
                        if (transitionState == SimpleTransitionListener.TransitionState.f31119c) {
                            a aVar = this$0.f31231p;
                            if (aVar != null) {
                                aVar.f31301h = true;
                                return;
                            } else {
                                i.m("appAdapter");
                                throw null;
                            }
                        }
                        return;
                    }
                    a aVar2 = this$0.f31231p;
                    if (aVar2 == null) {
                        i.m("appAdapter");
                        throw null;
                    }
                    aVar2.f31301h = false;
                    ArrayList arrayList2 = aVar2.j;
                    for (View view2 : new ArrayList(arrayList2)) {
                        arrayList2.remove(view2);
                        view2.clearAnimation();
                    }
                }
            });
            appListFragment.L(appFragment, view, "appImageTransition");
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public View B(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(inflater, "inflater");
        h hVarA = M0.e.a(inflater, R.layout.fragment_app_list, viewGroup, false, null);
        i.d(hVarA, "inflate(...)");
        this.f31230o = (U) hVarA;
        R();
        R().f1814u.setOnClickListener(this);
        R().f1815v.setOnClickListener(this);
        R().f1816w.setOnClickListener(this);
        if (bundle != null) {
            this.f31232q = bundle.getString("vehicle");
        }
        U uR = R();
        A.a(uR.f1813t, q().E());
        R().f1813t.setHasFixedSize(true);
        U uR2 = R();
        com.voltasit.obdeleven.presentation.appList.a aVar = this.f31231p;
        if (aVar == null) {
            i.m("appAdapter");
            throw null;
        }
        uR2.f1813t.setAdapter(aVar);
        if (S()) {
            return R().f4488d;
        }
        T();
        SwipeRefreshLayout swipeRefreshLayoutC = Q.c(R().f4488d);
        this.f31236u = swipeRefreshLayoutC;
        Q.a(swipeRefreshLayoutC, this);
        Q().f31266W.e(getViewLifecycleOwner(), new b(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.appList.AppListFragment$setupObservers$1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                this.this$0.R().f1813t.m0(0);
                return r.f47939a;
            }
        }));
        Q().f31245B.e(getViewLifecycleOwner(), new b(new l<f, r>() { // from class: com.voltasit.obdeleven.presentation.appList.AppListFragment$setupObservers$2
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(f fVar) {
                f fVar2 = fVar;
                MenuItem menuItem = this.this$0.f31233r;
                if (menuItem != null) {
                    if (fVar2.f31321c) {
                        menuItem.setIcon(R.drawable.ic_private_ocas);
                    } else {
                        menuItem.setIcon(R.drawable.ic_private_ocas_selected);
                    }
                }
                return r.f47939a;
            }
        }));
        Q().f31250G.e(getViewLifecycleOwner(), new b(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.appList.AppListFragment$setupObservers$3
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                AppListFragment appListFragment = this.this$0;
                Bundle bundleA = o.a("key_tag", R.string.common_attention, "tag_unable_to_check_backup", "key_title");
                bundleA.putInt("key_positive_text", R.string.try_again);
                bundleA.putInt("key_negative_text", R.string.common_cancel);
                bundleA.putInt("key_message_res", R.string.common_check_network);
                I0 i10 = new I0();
                i10.setArguments(bundleA);
                i10.f32261r = appListFragment.getFragmentManager();
                i10.setTargetFragment(appListFragment, 0);
                appListFragment.f31239x = i10;
                I0 i11 = this.this$0.f31239x;
                i.b(i11);
                i11.A();
                return r.f47939a;
            }
        }));
        Q().f31252I.e(getViewLifecycleOwner(), new b(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.appList.AppListFragment$setupObservers$4
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                AppListFragment appListFragment = this.this$0;
                Bundle bundleA = o.a("key_tag", R.string.common_attention, "tag_backup_disclaimer", "key_title");
                bundleA.putInt("key_positive_text", R.string.common_yes);
                bundleA.putInt("key_negative_text", R.string.common_no);
                bundleA.putInt("key_message_res", R.string.dialog_ask_for_backup);
                I0 i10 = new I0();
                i10.setArguments(bundleA);
                i10.f32261r = appListFragment.getFragmentManager();
                i10.setTargetFragment(appListFragment, 0);
                appListFragment.f31239x = i10;
                I0 i11 = this.this$0.f31239x;
                i.b(i11);
                i11.A();
                return r.f47939a;
            }
        }));
        Q().f31254K.e(getViewLifecycleOwner(), new b(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.appList.AppListFragment$setupObservers$5
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xa.g] */
            @Override // Ia.l
            public final r invoke(r rVar) {
                AppListFragment appListFragment = this.this$0;
                MultiBackupDialog multiBackupDialog = appListFragment.f31240y;
                if (multiBackupDialog == null || !multiBackupDialog.isVisible()) {
                    J8.a analyticsRepository = (J8.a) appListFragment.f31229n.getValue();
                    i.e(analyticsRepository, "analyticsRepository");
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("key_title", R.string.common_full_backup);
                    MultiBackupDialog multiBackupDialog2 = new MultiBackupDialog(analyticsRepository);
                    multiBackupDialog2.setArguments(bundle2);
                    multiBackupDialog2.f32261r = appListFragment.getFragmentManager();
                    multiBackupDialog2.setTargetFragment(appListFragment, 0);
                    multiBackupDialog2.f32171A = null;
                    multiBackupDialog2.f32174D = appListFragment;
                    appListFragment.f31240y = multiBackupDialog2;
                    multiBackupDialog2.A();
                }
                return r.f47939a;
            }
        }));
        Q().f31256M.e(getViewLifecycleOwner(), new b(new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.appList.AppListFragment$setupObservers$6
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(String str) {
                String str2 = str;
                AppListFragment appListFragment = this.this$0;
                i.b(str2);
                appListFragment.getClass();
                new com.voltasit.obdeleven.presentation.oca.i(str2).J(appListFragment);
                return r.f47939a;
            }
        }));
        Q().f31258O.e(getViewLifecycleOwner(), new b(new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.appList.AppListFragment$setupObservers$7
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(String str) {
                AppListFragment appListFragment = this.this$0;
                appListFragment.getClass();
                Y.k(appListFragment, R.string.common_check_network, str);
                return r.f47939a;
            }
        }));
        Q().f31260Q.e(getViewLifecycleOwner(), new b(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.appList.AppListFragment$setupObservers$8
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                AppListFragment appListFragment = this.this$0;
                appListFragment.F(appListFragment.getString(R.string.common_something_went_wrong));
                return r.f47939a;
            }
        }));
        Q().f31248E.e(getViewLifecycleOwner(), new b(new l<List<? extends d>, r>() { // from class: com.voltasit.obdeleven.presentation.appList.AppListFragment$setupObservers$9
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(List<? extends d> list) {
                List<? extends d> list2 = list;
                AppListFragment appListFragment = this.this$0;
                boolean z10 = true;
                if (!list2.isEmpty() && (list2.size() != 1 || !(list2.get(0) instanceof d.a))) {
                    z10 = false;
                }
                Object objW = q.W(list2);
                d.a aVar2 = objW instanceof d.a ? (d.a) objW : null;
                appListFragment.getClass();
                if (z10 && aVar2 != null) {
                    appListFragment.R().f1813t.setVisibility(8);
                    appListFragment.R().f1812s.setVisibility(0);
                    TextView appListFragmentEmpty = appListFragment.R().f1812s;
                    i.d(appListFragmentEmpty, "appListFragmentEmpty");
                    W8.d.d(appListFragmentEmpty, appListFragment.getString(aVar2.f31315a, aVar2.f31316b));
                    appListFragment.R().f1812s.setMovementMethod(LinkMovementMethod.getInstance());
                } else if (z10) {
                    appListFragment.R().f1813t.setVisibility(8);
                    appListFragment.R().f1812s.setVisibility(0);
                    appListFragment.R().f1812s.setText(R.string.view_apps_list_apps_not_available_category);
                } else {
                    if (appListFragment.Q().f31273d0 == null) {
                        O.e.j("AppListFragment", "Creating new timestamp object. All items should be marked as new.");
                        int i10 = z.f47484b;
                        if (((z) ParseUser.getCurrentUser()) != null) {
                            appListFragment.Q().f31273d0 = new p255u9.r();
                            p255u9.r rVar = appListFragment.Q().f31273d0;
                            i.b(rVar);
                            rVar.put(Participant.USER_TYPE, (z) ParseUser.getCurrentUser());
                            p255u9.r rVar2 = appListFragment.Q().f31273d0;
                            i.b(rVar2);
                            E e10 = appListFragment.f31234s;
                            i.b(e10);
                            rVar2.put("vehicleBase", e10.i());
                            p279w9.b bVar = Application.f29634b;
                            String strC = B7.b.c("APP_TIMESTAMP", appListFragment.P());
                            List listK = M1.k(appListFragment.Q().f31273d0);
                            synchronized (bVar) {
                                bVar.f47824a.put(strC, new w9.b.a(listK, 86400000L));
                            }
                        }
                    } else {
                        p255u9.r rVar3 = appListFragment.Q().f31273d0;
                        i.b(rVar3);
                        O.e.j("AppListFragment", "Will indicate list items newer than timestamp: " + rVar3.getLong("timestamp"));
                        a aVar3 = appListFragment.f31231p;
                        if (aVar3 == null) {
                            i.m("appAdapter");
                            throw null;
                        }
                        p255u9.r rVar4 = appListFragment.Q().f31273d0;
                        i.b(rVar4);
                        aVar3.f31302i = rVar4.getLong("timestamp");
                    }
                    appListFragment.R().f1813t.setVisibility(0);
                    appListFragment.R().f1812s.setVisibility(8);
                }
                AppListFragment appListFragment2 = this.this$0;
                a aVar4 = appListFragment2.f31231p;
                if (aVar4 == null) {
                    i.m("appAdapter");
                    throw null;
                }
                List<C0700b> list3 = appListFragment2.Q().f31271b0;
                ArrayList arrayList = aVar4.f31300g;
                i.b(list3);
                arrayList.addAll(list3);
                a aVar5 = this.this$0.f31231p;
                if (aVar5 != null) {
                    aVar5.f19484a.b(list2, null);
                    return r.f47939a;
                }
                i.m("appAdapter");
                throw null;
            }
        }));
        Q().f31262S.e(getViewLifecycleOwner(), new b(new l<Boolean, r>() { // from class: com.voltasit.obdeleven.presentation.appList.AppListFragment$setupObservers$10
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Boolean bool) {
                Boolean bool2 = bool;
                i.b(bool2);
                if (bool2.booleanValue()) {
                    SwipeRefreshLayout swipeRefreshLayout = this.this$0.f31236u;
                    i.b(swipeRefreshLayout);
                    swipeRefreshLayout.setRefreshing(false);
                }
                return r.f47939a;
            }
        }));
        Q().f31264U.e(getViewLifecycleOwner(), new b(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.appList.AppListFragment$setupObservers$11
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                Y.k(this.this$0, R.string.common_check_network, "TryAgainDialog");
                return r.f47939a;
            }
        }));
        Q().f31268Y.e(getViewLifecycleOwner(), new b(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.appList.AppListFragment$setupObservers$12
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                final AppListFragment appListFragment = this.this$0;
                appListFragment.getClass();
                appListFragment.K(new l<DialogInterface, r>() { // from class: com.voltasit.obdeleven.presentation.appList.AppListFragment$showTryAgainDialog$1
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(DialogInterface dialogInterface) {
                        DialogInterface it = dialogInterface;
                        i.e(it, "it");
                        it.dismiss();
                        appListFragment.r().h();
                        return r.f47939a;
                    }
                }, new l<DialogInterface, r>() { // from class: com.voltasit.obdeleven.presentation.appList.AppListFragment$showTryAgainDialog$2
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(DialogInterface dialogInterface) {
                        DialogInterface it = dialogInterface;
                        i.e(it, "it");
                        it.dismiss();
                        AppListViewModel appListViewModelQ = appListFragment.Q();
                        appListViewModelQ.getClass();
                        C2680e.c(Z.a(appListViewModelQ), appListViewModelQ.f32112a, null, new AppListViewModel$getUserDetails$1(appListViewModelQ, null), 2);
                        return r.f47939a;
                    }
                });
                return r.f47939a;
            }
        }));
        Q().f31270a0.e(getViewLifecycleOwner(), new b(new l<Boolean, r>() { // from class: com.voltasit.obdeleven.presentation.appList.AppListFragment$setupObservers$13
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Boolean bool) {
                Boolean bool2 = bool;
                DisplayMetrics displayMetrics = this.this$0.getResources().getDisplayMetrics();
                AppListFragment appListFragment = this.this$0;
                int i10 = displayMetrics.heightPixels / 6;
                boolean zD = this.this$0.Q().d(UserPermission.SEE_OCA_STATISTICS);
                v vVar = this.this$0.Q().f31275o;
                String objectId = vVar.z() ? vVar.L().getObjectId() : null;
                if (objectId == null) {
                    objectId = "";
                }
                i.b(bool2);
                boolean zBooleanValue = bool2.booleanValue();
                final AppListFragment appListFragment2 = this.this$0;
                appListFragment.f31231p = new a(i10, zD, objectId, zBooleanValue, new p<d, View, r>() { // from class: com.voltasit.obdeleven.presentation.appList.AppListFragment$setupObservers$13.1
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(d dVar, View view) {
                        d oca = dVar;
                        View view2 = view;
                        i.e(oca, "oca");
                        i.e(view2, "view");
                        AppListFragment.O(appListFragment2, oca, view2);
                        return r.f47939a;
                    }
                });
                U uR3 = this.this$0.R();
                a aVar2 = this.this$0.f31231p;
                if (aVar2 == null) {
                    i.m("appAdapter");
                    throw null;
                }
                uR3.f1813t.setAdapter(aVar2);
                AppListViewModel appListViewModelQ = this.this$0.Q();
                AppListFragment appListFragment3 = this.this$0;
                appListViewModelQ.e(false, appListFragment3.f31234s, appListFragment3.P());
                return r.f47939a;
            }
        }));
        z(Q());
        AppListViewModel appListViewModelQ = Q();
        appListViewModelQ.getClass();
        C2680e.c(Z.a(appListViewModelQ), appListViewModelQ.f32112a, null, new AppListViewModel$getUserDetails$1(appListViewModelQ, null), 2);
        return this.f31236u;
    }

    public final String P() {
        E e10 = this.f31234s;
        i.b(e10);
        String strC = "";
        if (e10.j() != null) {
            E e11 = this.f31234s;
            i.b(e11);
            p255u9.F fJ = e11.j();
            i.b(fJ);
            strC = B7.b.c("", fJ.getObjectId());
        }
        E e12 = this.f31234s;
        i.b(e12);
        if (e12.i() == null) {
            return strC;
        }
        E e13 = this.f31234s;
        i.b(e13);
        p255u9.D dI = e13.i();
        i.b(dI);
        return s.b(strC, dI.getObjectId());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    public final AppListViewModel Q() {
        return (AppListViewModel) this.f31228m.getValue();
    }

    public final U R() {
        U u10 = this.f31230o;
        if (u10 != null) {
            return u10;
        }
        i.m("binding");
        throw null;
    }

    public boolean S() {
        E e10 = this.f31234s;
        if (e10 != null) {
            i.b(e10);
            if (e10.i() != null) {
                return false;
            }
        }
        E(R.string.common_something_went_wrong);
        r().h();
        return true;
    }

    public final void T() {
        R().f1814u.setSelected(false);
        R().f1815v.setSelected(false);
        R().f1816w.setSelected(false);
        int iOrdinal = Q().c().f31319a.ordinal();
        if (iOrdinal == 0) {
            R().f1814u.setSelected(true);
        } else if (iOrdinal == 1) {
            R().f1815v.setSelected(true);
        } else {
            if (iOrdinal != 2) {
                return;
            }
            R().f1816w.setSelected(true);
        }
    }

    @Override // com.voltasit.obdeleven.presentation.dialogs.backup.MultiBackupDialog.a
    public final void a() {
        AppListViewModel appListViewModelQ = Q();
        appListViewModelQ.getClass();
        C2680e.c(Z.a(appListViewModelQ), appListViewModelQ.f32112a, null, new AppListViewModel$backupCompleted$1(appListViewModelQ, null), 2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String dialogId, DialogCallback.CallbackType callbackType, Bundle data) {
        i.e(dialogId, "dialogId");
        i.e(data, "data");
        switch (dialogId.hashCode()) {
            case -1729202363:
                if (!dialogId.equals("OcaAgreementDialog")) {
                    return;
                }
                break;
            case -1524705074:
                if (dialogId.equals("tag_check_policy") && callbackType == DialogCallback.CallbackType.f31102c) {
                    AppListViewModel appListViewModelQ = Q();
                    appListViewModelQ.getClass();
                    C2680e.c(Z.a(appListViewModelQ), appListViewModelQ.f32112a, null, new AppListViewModel$checkOcaPolicy$1(appListViewModelQ, null), 2);
                    return;
                }
                return;
            case -999013994:
                if (dialogId.equals("tag_unable_to_check_backup") && callbackType == DialogCallback.CallbackType.f31102c) {
                    Q().b();
                    return;
                }
                return;
            case -82040499:
                if (!dialogId.equals("tag_sign_agreement")) {
                    return;
                }
                break;
            case 199881773:
                if (dialogId.equals("TryAgainDialog")) {
                    if (callbackType == DialogCallback.CallbackType.f31102c) {
                        Q().e(false, this.f31234s, P());
                        return;
                    } else {
                        if (callbackType == DialogCallback.CallbackType.f31101b) {
                            r().h();
                            return;
                        }
                        return;
                    }
                }
                return;
            case 1604837731:
                if (dialogId.equals("MultiBackupDialog") && callbackType == DialogCallback.CallbackType.f31104e) {
                    MultiBackupDialog multiBackupDialog = this.f31240y;
                    if (multiBackupDialog != null) {
                        multiBackupDialog.y();
                    }
                    this.f31240y = null;
                    O.e.l("AppListFragment", "Multi backup dialog error");
                    MainActivity mainActivityQ = q();
                    P.a(mainActivityQ, mainActivityQ.getString(R.string.snackbar_unknown_exception));
                    return;
                }
                return;
            case 1718173395:
                if (dialogId.equals("tag_backup_disclaimer")) {
                    AppListViewModel appListViewModelQ2 = Q();
                    appListViewModelQ2.getClass();
                    if (callbackType == DialogCallback.CallbackType.f31102c) {
                        appListViewModelQ2.f31253J.j(r.f47939a);
                        return;
                    } else {
                        if (callbackType == DialogCallback.CallbackType.f31101b) {
                            AppListViewModel.f(appListViewModelQ2, null, null, false, 3);
                            appListViewModelQ2.f31265V.j(r.f47939a);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 1940956132:
                if (dialogId.equals("WarningDialog") && callbackType == DialogCallback.CallbackType.f31102c) {
                    boolean z10 = data.getBoolean("key_checkbox_bool");
                    List<String> list = com.voltasit.obdeleven.a.f29638c;
                    Context contextRequireContext = requireContext();
                    i.d(contextRequireContext, "requireContext(...)");
                    com.voltasit.obdeleven.a.C0320a.a(contextRequireContext).j("show_offline_apps_warning", !z10);
                    this.f31238w = null;
                    return;
                }
                return;
            default:
                return;
        }
        if (callbackType == DialogCallback.CallbackType.f31102c) {
            AppListViewModel appListViewModelQ3 = Q();
            appListViewModelQ3.getClass();
            C2680e.c(Z.a(appListViewModelQ3), appListViewModelQ3.f32112a, null, new AppListViewModel$signAgreement$1(appListViewModelQ3, null), 2);
        }
    }

    @Override // Jb.a
    public final Ib.a i() {
        return Jb.a.C0058a.a();
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "AppListFragment";
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v10) {
        i.e(v10, "v");
        SearchView searchView = this.f31237v;
        i.b(searchView);
        searchView.t("");
        SearchView searchView2 = this.f31237v;
        i.b(searchView2);
        searchView2.setIconified(true);
        switch (v10.getId()) {
            case R.id.category_adjustments /* 2131362001 */:
                f fVarC = Q().c();
                OcaCategory ocaCategory = OcaCategory.ADJUSTMENT;
                if (fVarC.f31319a == ocaCategory) {
                    return;
                }
                AppListViewModel.f(Q(), ocaCategory, "", false, 4);
                SearchView searchView3 = this.f31237v;
                i.b(searchView3);
                searchView3.clearFocus();
                break;
            case R.id.category_retrofits /* 2131362002 */:
                f fVarC2 = Q().c();
                OcaCategory ocaCategory2 = OcaCategory.RETROFIT;
                if (fVarC2.f31319a == ocaCategory2) {
                    return;
                }
                AppListViewModel.f(Q(), ocaCategory2, "", false, 4);
                SearchView searchView4 = this.f31237v;
                i.b(searchView4);
                searchView4.clearFocus();
                break;
            case R.id.category_workshop /* 2131362003 */:
                f fVarC3 = Q().c();
                OcaCategory ocaCategory3 = OcaCategory.WORKSHOP;
                if (fVarC3.f31319a == ocaCategory3) {
                    return;
                }
                AppListViewModel.f(Q(), ocaCategory3, "", false, 4);
                SearchView searchView5 = this.f31237v;
                i.b(searchView5);
                searchView5.clearFocus();
                break;
        }
        T();
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        setMenuVisibility(true);
        int i10 = getResources().getDisplayMetrics().heightPixels / 6;
        boolean zD = Q().d(UserPermission.SEE_OCA_STATISTICS);
        v vVar = Q().f31275o;
        String objectId = vVar.z() ? vVar.L().getObjectId() : null;
        if (objectId == null) {
            objectId = "";
        }
        this.f31231p = new com.voltasit.obdeleven.presentation.appList.a(i10, zD, objectId, true, new p<d, View, r>() { // from class: com.voltasit.obdeleven.presentation.appList.AppListFragment.onCreate.1
            {
                super(2);
            }

            @Override // Ia.p
            public final r invoke(d dVar, View view) {
                d oca = dVar;
                View view2 = view;
                i.e(oca, "oca");
                i.e(view2, "view");
                AppListFragment.O(AppListFragment.this, oca, view2);
                return r.f47939a;
            }
        });
        if (this.f31235t || !W7.c.e()) {
            List<String> list = com.voltasit.obdeleven.a.f29638c;
            Context contextRequireContext = requireContext();
            i.d(contextRequireContext, "requireContext(...)");
            if (com.voltasit.obdeleven.a.C0320a.a(contextRequireContext).b("show_offline_apps_warning", true) && this.f31238w == null) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("key_title", R.string.common_attention);
                bundle2.putInt("key_positive_text", R.string.common_ok);
                bundle2.putInt("key_message", R.string.view_apps_warning);
                bundle2.putInt("key_checkbox_text", R.string.common_do_not_show_again);
                h1 h1Var = new h1();
                h1Var.setArguments(bundle2);
                h1Var.f32261r = getParentFragmentManager();
                h1Var.setTargetFragment(this, 0);
                this.f31238w = h1Var;
                h1Var.A();
            }
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        i.e(menu, "menu");
        i.e(inflater, "inflater");
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.oca_list, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.non_public_oca);
        i.d(menuItemFindItem, "findItem(...)");
        this.f31233r = menuItemFindItem;
        if (Q().c().f31321c) {
            MenuItem menuItem = this.f31233r;
            if (menuItem == null) {
                i.m("ocaListSwitchMenuItem");
                throw null;
            }
            menuItem.setIcon(R.drawable.ic_private_ocas);
        } else {
            MenuItem menuItem2 = this.f31233r;
            if (menuItem2 == null) {
                i.m("ocaListSwitchMenuItem");
                throw null;
            }
            menuItem2.setIcon(R.drawable.ic_private_ocas_selected);
        }
        MenuItem menuItemFindItem2 = menu.findItem(R.id.search);
        View actionView = menuItemFindItem2.getActionView();
        i.c(actionView, "null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
        SearchView searchView = (SearchView) actionView;
        this.f31237v = searchView;
        searchView.setIconifiedByDefault(true);
        SearchView searchView2 = this.f31237v;
        i.b(searchView2);
        searchView2.setQueryHint(getString(R.string.common_app_name));
        SearchView searchView3 = this.f31237v;
        i.b(searchView3);
        searchView3.setOnCloseListener(new com.google.gson.internal.a(this));
        SearchView searchView4 = this.f31237v;
        i.b(searchView4);
        searchView4.setOnQueryTextListener(new a());
        String str = this.f31241z;
        if (str == null || str.length() == 0) {
            return;
        }
        String str2 = this.f31241z;
        i.b(str2);
        SearchView searchView5 = this.f31237v;
        i.b(searchView5);
        searchView5.c();
        SearchView searchView6 = this.f31237v;
        i.b(searchView6);
        searchView6.t(str2);
        SearchView searchView7 = this.f31237v;
        i.b(searchView7);
        searchView7.clearFocus();
        menuItemFindItem2.expandActionView();
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        if (Q().f31272c0 > 0 && Q().f31273d0 != null) {
            P8.c.a(3, "AppListFragment", "Updating last seen app timestamp to: %d", Long.valueOf(Q().f31272c0));
            p255u9.r rVar = Q().f31273d0;
            i.b(rVar);
            rVar.put("timestamp", Long.valueOf(Q().f31272c0));
            p255u9.r rVar2 = Q().f31273d0;
            i.b(rVar2);
            rVar2.saveInBackground();
        }
        super.onDestroy();
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        SearchView searchView = this.f31237v;
        if (searchView != null) {
            i.b(searchView);
            searchView.setOnQueryTextListener(null);
        }
        I0 i10 = this.f31239x;
        if (i10 != null) {
            i10.y();
        }
        this.f31239x = null;
        MultiBackupDialog multiBackupDialog = this.f31240y;
        if (multiBackupDialog != null) {
            multiBackupDialog.y();
        }
        this.f31240y = null;
        h1 h1Var = this.f31238w;
        if (h1Var != null) {
            i.b(h1Var);
            h1Var.y();
            this.f31238w = null;
        }
        w();
    }

    @Override // com.voltasit.obdeleven.presentation.dialogs.backup.MultiBackupDialog.a
    public final void onFailure() {
        MainActivity mainActivityQ = q();
        P.a(mainActivityQ, mainActivityQ.getString(R.string.snackbar_unknown_exception));
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem item) {
        i.e(item, "item");
        AppListViewModel appListViewModelQ = Q();
        if (item.getItemId() != R.id.non_public_oca) {
            appListViewModelQ.getClass();
            return false;
        }
        boolean z10 = appListViewModelQ.c().f31321c;
        boolean z11 = !z10;
        U7.a<r> aVar = appListViewModelQ.f31265V;
        if (z10 && appListViewModelQ.f31276p.b()) {
            C2680e.c(Z.a(appListViewModelQ), appListViewModelQ.f32112a, null, new AppListViewModel$checkOcaPolicy$1(appListViewModelQ, null), 2);
        } else {
            AppListViewModel.f(appListViewModelQ, null, null, z11, 3);
            aVar.j(r.f47939a);
        }
        return true;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void onRefresh() {
        Q().e(true, this.f31234s, P());
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        i.e(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putString("vehicle", this.f31232q);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final int p() {
        return this.f31227l;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final Positionable$Transition s() {
        return Positionable$Transition.f31112d;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        String string = getString(R.string.common_apps);
        i.d(string, "getString(...)");
        return string;
    }
}
