package com.voltasit.obdeleven.presentation.main;

import B8.AbstractC0630h0;
import B8.E0;
import G8.u;
import Ia.l;
import T4.AbstractC0779l;
import T4.C0772e;
import T4.G;
import T4.h0;
import T4.u0;
import T4.y0;
import U4.C0795c;
import U4.C0804l;
import Z3.o;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.WorkSource;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import androidx.appcompat.widget.d0;
import androidx.collection.AbstractC0878f;
import androidx.collection.C0873a;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.ActivityC1347l;
import androidx.fragment.app.C1336a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import androidx.lifecycle.D;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.recyclerview.widget.C1445j;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.braze.support.BrazeLogger;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.obdeleven.service.model.ControlUnit;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.models.Screen;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.presentation.components.coverLayout.MainCoverLayout;
import com.voltasit.obdeleven.presentation.components.progressWheel.ProgressWheel;
import com.voltasit.obdeleven.presentation.controlUnit.faults.FaultsFragment;
import com.voltasit.obdeleven.presentation.controlunitlist.ControlUnitListFragment;
import com.voltasit.obdeleven.presentation.models.BatteryVoltageState;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import com.voltasit.obdeleven.presentation.models.UserInteractionState;
import com.voltasit.obdeleven.presentation.vehicle.VehicleBaseFragment;
import com.voltasit.obdeleven.ui.dialogs.I0;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import com.voltasit.obdeleven.utils.NavigationManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import kotlin.text.n;
import kotlinx.coroutines.C2680e;
import p134k8.a2;
import p191p5.A;
import p191p5.B;
import p191p5.t;
import p220r9.P;
import p255u9.E;
import p293xa.r;

/* JADX INFO: compiled from: MainFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class MainFragment extends BaseFragment<AbstractC0630h0> implements DialogCallback {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f32517l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public AbstractC0630h0 f32518m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ObjectAnimator f32519n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c f32520o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.voltasit.obdeleven.presentation.main.b f32521p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f32522q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f32523r;

    /* JADX INFO: compiled from: MainFragment.kt */
    public static final class a implements D, kotlin.jvm.internal.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lambda f32524b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l lVar) {
            this.f32524b = (Lambda) lVar;
        }

        @Override // kotlin.jvm.internal.f
        public final p293xa.e<?> b() {
            return this.f32524b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        @Override // androidx.lifecycle.D
        public final /* synthetic */ void d(Object obj) {
            this.f32524b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof D) || !(obj instanceof kotlin.jvm.internal.f)) {
                return false;
            }
            return this.f32524b.equals(((kotlin.jvm.internal.f) obj).b());
        }

        public final int hashCode() {
            return this.f32524b.hashCode();
        }
    }

    /* JADX INFO: compiled from: MainFragment.kt */
    public static final class b extends FloatingActionButton.a {
        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
        public final void a(FloatingActionButton fab) {
            kotlin.jvm.internal.i.e(fab, "fab");
            fab.n();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.voltasit.obdeleven.presentation.main.MainFragment$special$$inlined$viewModel$default$1] */
    public MainFragment() {
        final Ia.a<Ob.a> aVar = new Ia.a<Ob.a>() { // from class: com.voltasit.obdeleven.presentation.main.MainFragment$mainViewModel$2
            {
                super(0);
            }

            @Override // Ia.a
            public final Ob.a invoke() {
                return I.e.j(this.this$0.r());
            }
        };
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.presentation.main.MainFragment$special$$inlined$viewModel$default$1
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
        this.f32517l = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<MainViewModel>(this) { // from class: com.voltasit.obdeleven.presentation.main.MainFragment$special$$inlined$viewModel$default$2
            final /* synthetic */ Fragment $this_viewModel;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $extrasProducer = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.main.MainViewModel] */
            @Override // Ia.a
            public final MainViewModel invoke() {
                p014b1.a defaultViewModelCreationExtras;
                Fragment fragment = this.$this_viewModel;
                Pb.a aVar2 = this.$qualifier;
                Ia.a aVar3 = r10;
                Ia.a aVar4 = this.$extrasProducer;
                Ia.a aVar5 = aVar;
                b0 viewModelStore = ((c0) aVar3.invoke()).getViewModelStore();
                if (aVar4 == null || (defaultViewModelCreationExtras = (p014b1.a) aVar4.invoke()) == null) {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    kotlin.jvm.internal.i.d(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
                }
                return Gb.a.a(kotlin.jvm.internal.l.a(MainViewModel.class), viewModelStore, null, defaultViewModelCreationExtras, aVar2, Cb.a.i(fragment), aVar5);
            }
        });
        this.f32523r = R.layout.fragment_main;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final boolean A() {
        MainViewModel mainViewModelP = P();
        if (!mainViewModelP.f32605t.b() || !mainViewModelP.f32547L) {
            return false;
        }
        mainViewModelP.f32545K = true;
        mainViewModelP.f32608u0.j(U8.c.a(mainViewModelP.c(), mainViewModelP.f32595o.a(R.string.common_cancelling, new Object[0]), 0, null, false, null, 62));
        return true;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final void C(M0.h hVar) {
        AbstractC0630h0 abstractC0630h0 = (AbstractC0630h0) hVar;
        this.f32518m = abstractC0630h0;
        Bundle arguments = getArguments();
        if (arguments != null ? arguments.getBoolean("setupTwoFactor") : false) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                arguments2.putBoolean("setupTwoFactor", false);
            }
            NavigationManager navigationManagerR = r();
            p048d9.a aVar = new p048d9.a();
            Screen rootScreen = Screen.MainFragment;
            kotlin.jvm.internal.i.e(rootScreen, "rootScreen");
            Bundle bundle = new Bundle();
            bundle.putSerializable("popToMainFragment", rootScreen);
            aVar.setArguments(bundle);
            navigationManagerR.n(aVar, null);
            return;
        }
        abstractC0630h0.t(P());
        ObjectAnimator objectAnimator = new ObjectAnimator();
        AbstractC0630h0 abstractC0630h1 = this.f32518m;
        if (abstractC0630h1 == null) {
            kotlin.jvm.internal.i.m("binding");
            throw null;
        }
        objectAnimator.setTarget(abstractC0630h1.f1935A);
        objectAnimator.setPropertyName("progress");
        objectAnimator.setDuration(500L);
        objectAnimator.setInterpolator(new DecelerateInterpolator());
        this.f32519n = objectAnimator;
        abstractC0630h0.f1941G.setColorSchemeResources(android.R.color.holo_green_dark, android.R.color.darker_gray);
        setHasOptionsMenu(true);
        setMenuVisibility(false);
        RecyclerView recyclerView = abstractC0630h0.f1937C;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0));
        recyclerView.i(new p208q9.d(recyclerView.getResources().getDimensionPixelSize(R.dimen.horizontal_list_divider_width)));
        this.f32520o = new c(new l<p109i8.e, r>() { // from class: com.voltasit.obdeleven.presentation.main.MainFragment$onCreateView$1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(p109i8.e eVar) {
                p109i8.e item = eVar;
                kotlin.jvm.internal.i.e(item, "item");
                FaultsFragment faultsFragment = new FaultsFragment();
                faultsFragment.f31591n = (ControlUnit) item;
                this.this$0.r().n(faultsFragment, null);
                return r.f47939a;
            }
        });
        recyclerView.setItemAnimator(new C1445j());
        c cVar = this.f32520o;
        if (cVar == null) {
            kotlin.jvm.internal.i.m("faultyCUHorizontalAdapter");
            throw null;
        }
        recyclerView.setAdapter(cVar);
        abstractC0630h0.f1938D.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.scale_in));
        P().f32544J0.e(getViewLifecycleOwner(), new a(new l<Boolean, r>() { // from class: com.voltasit.obdeleven.presentation.main.MainFragment$setupNavigation$1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Boolean bool) {
                MainFragment mainFragment = this.this$0;
                Bundle bundleA = o.a("key_tag", R.string.view_main_include_freeze_frame, "askFreezeFrameDialog", "key_title");
                bundleA.putInt("key_positive_text", R.string.common_include);
                bundleA.putInt("key_negative_text", R.string.common_exclude);
                I0 i10 = new I0();
                i10.setArguments(bundleA);
                i10.f32261r = mainFragment.getFragmentManager();
                i10.setTargetFragment(mainFragment, 0);
                i10.A();
                return r.f47939a;
            }
        }));
        P().f32540H0.e(getViewLifecycleOwner(), new a(new l<Boolean, r>() { // from class: com.voltasit.obdeleven.presentation.main.MainFragment$setupNavigation$2
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Boolean bool) {
                new d(0).J(this.this$0);
                return r.f47939a;
            }
        }));
        P().f32536F0.e(getViewLifecycleOwner(), new a(new l<Boolean, r>() { // from class: com.voltasit.obdeleven.presentation.main.MainFragment$setupNavigation$3
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Boolean bool) {
                b bVar = this.this$0.f32521p;
                if (bVar == null || !bVar.isVisible()) {
                    MainFragment mainFragment = this.this$0;
                    Bundle bundleA = o.a("key_tag", R.string.common_battery_voltage, "BatteryVoltageDialog", "key_title");
                    bundleA.putInt("key_positive_text", R.string.common_ok);
                    b bVar2 = new b();
                    bVar2.setArguments(bundleA);
                    bVar2.f32261r = mainFragment.getFragmentManager();
                    bVar2.setTargetFragment(mainFragment, 0);
                    mainFragment.f32521p = bVar2;
                    b bVar3 = this.this$0.f32521p;
                    if (bVar3 != null) {
                        bVar3.A();
                    }
                }
                return r.f47939a;
            }
        }));
        P().f32572X0.e(getViewLifecycleOwner(), new a(new l<Intent, r>() { // from class: com.voltasit.obdeleven.presentation.main.MainFragment$setupNavigation$4
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Intent intent) {
                this.this$0.startActivity(intent);
                return r.f47939a;
            }
        }));
        P().f32580b1.e(getViewLifecycleOwner(), new a(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.main.MainFragment$setupNavigation$5
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                new i(0).J(this.this$0);
                return r.f47939a;
            }
        }));
        P().f32530C0.e(getViewLifecycleOwner(), new a(new l<Boolean, r>() { // from class: com.voltasit.obdeleven.presentation.main.MainFragment$setupObservers$1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Boolean bool) {
                Boolean bool2 = bool;
                MainFragment mainFragment = this.this$0;
                kotlin.jvm.internal.i.b(bool2);
                mainFragment.S(bool2.booleanValue());
                return r.f47939a;
            }
        }));
        P().f32548L0.e(getViewLifecycleOwner(), new a(new l<Boolean, r>() { // from class: com.voltasit.obdeleven.presentation.main.MainFragment$setupObservers$2
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Boolean bool) {
                MainFragment mainFragment = this.this$0;
                AbstractC0630h0 abstractC0630h2 = mainFragment.f32518m;
                if (abstractC0630h2 == null) {
                    kotlin.jvm.internal.i.m("binding");
                    throw null;
                }
                abstractC0630h2.f1936B.setImageResource(2131231140);
                AbstractC0630h0 abstractC0630h3 = mainFragment.f32518m;
                if (abstractC0630h3 == null) {
                    kotlin.jvm.internal.i.m("binding");
                    throw null;
                }
                abstractC0630h3.f1936B.setBackgroundTintList(ColorStateList.valueOf(mainFragment.getResources().getColor(R.color.fab_red)));
                AbstractC0630h0 abstractC0630h4 = mainFragment.f32518m;
                if (abstractC0630h4 == null) {
                    kotlin.jvm.internal.i.m("binding");
                    throw null;
                }
                if (abstractC0630h4.f1936B.k()) {
                    AbstractC0630h0 abstractC0630h5 = mainFragment.f32518m;
                    if (abstractC0630h5 == null) {
                        kotlin.jvm.internal.i.m("binding");
                        throw null;
                    }
                    abstractC0630h5.f1936B.i(new h(), true);
                } else {
                    AbstractC0630h0 abstractC0630h6 = mainFragment.f32518m;
                    if (abstractC0630h6 == null) {
                        kotlin.jvm.internal.i.m("binding");
                        throw null;
                    }
                    abstractC0630h6.f1936B.n();
                }
                return r.f47939a;
            }
        }));
        P().f32532D0.e(getViewLifecycleOwner(), new a(new l<Integer, r>() { // from class: com.voltasit.obdeleven.presentation.main.MainFragment$setupObservers$3
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Integer num) {
                Integer num2 = num;
                ActivityC1347l activityC1347lRequireActivity = this.this$0.requireActivity();
                kotlin.jvm.internal.i.b(num2);
                P.b(activityC1347lRequireActivity, num2.intValue());
                return r.f47939a;
            }
        }));
        P().v0.e(getViewLifecycleOwner(), new a(new l<U8.c, r>() { // from class: com.voltasit.obdeleven.presentation.main.MainFragment$setupObservers$4
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(U8.c cVar2) {
                U8.c cVar3 = cVar2;
                MainFragment mainFragment = this.this$0;
                kotlin.jvm.internal.i.b(cVar3);
                AbstractC0630h0 abstractC0630h2 = mainFragment.f32518m;
                if (abstractC0630h2 == null) {
                    kotlin.jvm.internal.i.m("binding");
                    throw null;
                }
                abstractC0630h2.f1938D.setPrimaryText(cVar3.f6561a);
                AbstractC0630h0 abstractC0630h3 = mainFragment.f32518m;
                if (abstractC0630h3 == null) {
                    kotlin.jvm.internal.i.m("binding");
                    throw null;
                }
                abstractC0630h3.f1938D.setPrimaryTextColor(cVar3.f6562b);
                AbstractC0630h0 abstractC0630h4 = mainFragment.f32518m;
                if (abstractC0630h4 == null) {
                    kotlin.jvm.internal.i.m("binding");
                    throw null;
                }
                abstractC0630h4.f1938D.setSecondaryText(cVar3.f6563c);
                AbstractC0630h0 abstractC0630h5 = mainFragment.f32518m;
                if (abstractC0630h5 == null) {
                    kotlin.jvm.internal.i.m("binding");
                    throw null;
                }
                abstractC0630h5.f1938D.setIndeterminate(cVar3.f6564d);
                AbstractC0630h0 abstractC0630h6 = mainFragment.f32518m;
                if (abstractC0630h6 == null) {
                    kotlin.jvm.internal.i.m("binding");
                    throw null;
                }
                abstractC0630h6.f1938D.setProgress(cVar3.f6565e);
                AbstractC0630h0 abstractC0630h7 = mainFragment.f32518m;
                if (abstractC0630h7 == null) {
                    kotlin.jvm.internal.i.m("binding");
                    throw null;
                }
                final ProgressWheel progressWheel = abstractC0630h7.f1938D;
                u uVar = cVar3.f6566f;
                int i10 = uVar.f3543a;
                int i11 = uVar.f3544b;
                if (!progressWheel.f31396b) {
                    int i12 = i11 > 0 ? (i10 * 360) / i11 : 0;
                    ValueAnimator valueAnimator = new ValueAnimator();
                    progressWheel.f31395G = valueAnimator;
                    valueAnimator.setDuration(1000L);
                    progressWheel.f31395G.setIntValues(0, i12);
                    progressWheel.f31395G.setInterpolator(new OvershootInterpolator(1.5f));
                    progressWheel.f31395G.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: U8.a
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            int i13 = ProgressWheel.f31388H;
                            ProgressWheel progressWheel2 = progressWheel;
                            progressWheel2.getClass();
                            progressWheel2.f31394F = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                            progressWheel2.invalidate();
                        }
                    });
                    progressWheel.f31395G.start();
                }
                return r.f47939a;
            }
        }));
        P().f32606t0.e(getViewLifecycleOwner(), new a(new l<List<? extends p109i8.e>, r>() { // from class: com.voltasit.obdeleven.presentation.main.MainFragment$setupObservers$5
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(List<? extends p109i8.e> list) {
                List<? extends p109i8.e> list2 = list;
                c cVar2 = this.this$0.f32520o;
                if (cVar2 != null) {
                    cVar2.f19484a.b(list2, null);
                    return r.f47939a;
                }
                kotlin.jvm.internal.i.m("faultyCUHorizontalAdapter");
                throw null;
            }
        }));
        P().f32602r0.e(getViewLifecycleOwner(), new a(new l<Integer, r>() { // from class: com.voltasit.obdeleven.presentation.main.MainFragment$setupObservers$6
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Integer num) {
                Integer num2 = num;
                MainFragment mainFragment = this.this$0;
                kotlin.jvm.internal.i.b(num2);
                mainFragment.Q(num2.intValue());
                return r.f47939a;
            }
        }));
        P().f32598p0.e(getViewLifecycleOwner(), new a(new l<Integer, r>() { // from class: com.voltasit.obdeleven.presentation.main.MainFragment$setupObservers$7
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Integer num) {
                Integer num2 = num;
                ObjectAnimator objectAnimator2 = this.this$0.f32519n;
                if (objectAnimator2 == null) {
                    kotlin.jvm.internal.i.m("dtcStatusBarAnimation");
                    throw null;
                }
                kotlin.jvm.internal.i.b(num2);
                objectAnimator2.setIntValues(num2.intValue());
                ObjectAnimator objectAnimator3 = this.this$0.f32519n;
                if (objectAnimator3 == null) {
                    kotlin.jvm.internal.i.m("dtcStatusBarAnimation");
                    throw null;
                }
                if (!objectAnimator3.isStarted()) {
                    ObjectAnimator objectAnimator4 = this.this$0.f32519n;
                    if (objectAnimator4 == null) {
                        kotlin.jvm.internal.i.m("dtcStatusBarAnimation");
                        throw null;
                    }
                    objectAnimator4.start();
                }
                return r.f47939a;
            }
        }));
        P().f32586f0.e(getViewLifecycleOwner(), new a(new l<com.voltasit.obdeleven.presentation.components.coverLayout.a, r>() { // from class: com.voltasit.obdeleven.presentation.main.MainFragment$setupObservers$8
            {
                super(1);
            }

            /* JADX WARN: Code duplicated, block: B:21:0x005f  */
            @Override // Ia.l
            public final r invoke(com.voltasit.obdeleven.presentation.components.coverLayout.a aVar2) {
                com.voltasit.obdeleven.presentation.components.coverLayout.a aVar3 = aVar2;
                AbstractC0630h0 abstractC0630h2 = this.this$0.f32518m;
                if (abstractC0630h2 == null) {
                    kotlin.jvm.internal.i.m("binding");
                    throw null;
                }
                kotlin.jvm.internal.i.b(aVar3);
                MainCoverLayout mainCoverLayout = abstractC0630h2.f1951y;
                mainCoverLayout.getClass();
                if (aVar3.equals(com.voltasit.obdeleven.presentation.components.coverLayout.a.b.f31382a)) {
                    mainCoverLayout.c();
                } else if (aVar3.equals(com.voltasit.obdeleven.presentation.components.coverLayout.a.c.f31383a)) {
                    mainCoverLayout.d();
                } else {
                    if (!(aVar3 instanceof com.voltasit.obdeleven.presentation.components.coverLayout.a.C0332a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    E vehicleDb = ((com.voltasit.obdeleven.presentation.components.coverLayout.a.C0332a) aVar3).f31381a;
                    kotlin.jvm.internal.i.e(vehicleDb, "vehicleDb");
                    String strF = vehicleDb.f();
                    if (n.S(strF)) {
                        strF = "http://";
                    }
                    ShapeableImageView shapeableImageView = mainCoverLayout.f31377d;
                    kotlin.jvm.internal.i.b(shapeableImageView);
                    if (strF.equals(shapeableImageView.getTag())) {
                        ShapeableImageView shapeableImageView2 = mainCoverLayout.f31377d;
                        kotlin.jvm.internal.i.b(shapeableImageView2);
                        if (shapeableImageView2.getVisibility() != 0) {
                            mainCoverLayout.d();
                            ShapeableImageView shapeableImageView3 = mainCoverLayout.f31377d;
                            kotlin.jvm.internal.i.b(shapeableImageView3);
                            shapeableImageView3.setVisibility(0);
                            com.bumptech.glide.d<Drawable> dVarM = com.bumptech.glide.b.d(mainCoverLayout).m(strF);
                            T3.d dVarJ = ((T3.d) E0.a(R.drawable.vehicle_default)).f(R.drawable.vehicle_default).j(R.drawable.vehicle_default);
                            kotlin.jvm.internal.i.d(dVarJ, "placeholder(...)");
                            com.bumptech.glide.d<Drawable> dVarA = dVarM.a(dVarJ);
                            dVarA.y(new T8.a(mainCoverLayout, vehicleDb));
                            ShapeableImageView shapeableImageView4 = mainCoverLayout.f31377d;
                            kotlin.jvm.internal.i.b(shapeableImageView4);
                            dVarA.x(shapeableImageView4);
                            ShapeableImageView shapeableImageView5 = mainCoverLayout.f31377d;
                            kotlin.jvm.internal.i.b(shapeableImageView5);
                            shapeableImageView5.setTag(strF);
                        }
                    } else {
                        mainCoverLayout.d();
                        ShapeableImageView shapeableImageView6 = mainCoverLayout.f31377d;
                        kotlin.jvm.internal.i.b(shapeableImageView6);
                        shapeableImageView6.setVisibility(0);
                        com.bumptech.glide.d<Drawable> dVarM2 = com.bumptech.glide.b.d(mainCoverLayout).m(strF);
                        T3.d dVarJ2 = ((T3.d) E0.a(R.drawable.vehicle_default)).f(R.drawable.vehicle_default).j(R.drawable.vehicle_default);
                        kotlin.jvm.internal.i.d(dVarJ2, "placeholder(...)");
                        com.bumptech.glide.d<Drawable> dVarA2 = dVarM2.a(dVarJ2);
                        dVarA2.y(new T8.a(mainCoverLayout, vehicleDb));
                        ShapeableImageView shapeableImageView7 = mainCoverLayout.f31377d;
                        kotlin.jvm.internal.i.b(shapeableImageView7);
                        dVarA2.x(shapeableImageView7);
                        ShapeableImageView shapeableImageView8 = mainCoverLayout.f31377d;
                        kotlin.jvm.internal.i.b(shapeableImageView8);
                        shapeableImageView8.setTag(strF);
                    }
                }
                r rVar = r.f47939a;
                Na.i iVar = E8.a.f3126a;
                return r.f47939a;
            }
        }));
        P().f32579b0.e(getViewLifecycleOwner(), new a(new l<Boolean, r>() { // from class: com.voltasit.obdeleven.presentation.main.MainFragment$setupObservers$9
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Boolean bool) {
                Boolean bool2 = bool;
                MainFragment mainFragment = this.this$0;
                kotlin.jvm.internal.i.b(bool2);
                mainFragment.setMenuVisibility(bool2.booleanValue());
                return r.f47939a;
            }
        }));
        P().f32575Z.e(getViewLifecycleOwner(), new a(new l<UserInteractionState, r>() { // from class: com.voltasit.obdeleven.presentation.main.MainFragment$setupObservers$10
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(UserInteractionState userInteractionState) {
                UserInteractionState userInteractionState2 = userInteractionState;
                MainFragment mainFragment = this.this$0;
                kotlin.jvm.internal.i.b(userInteractionState2);
                mainFragment.getClass();
                int iOrdinal = userInteractionState2.ordinal();
                if (iOrdinal == 0) {
                    DrawerLayout drawerLayout = mainFragment.q().f33555k;
                    if (drawerLayout != null) {
                        drawerLayout.setDrawerLockMode(0);
                    }
                    mainFragment.O(false);
                    mainFragment.R(true);
                    r rVar = r.f47939a;
                } else if (iOrdinal == 1) {
                    DrawerLayout drawerLayout2 = mainFragment.q().f33555k;
                    if (drawerLayout2 != null) {
                        drawerLayout2.setDrawerLockMode(1);
                    }
                    mainFragment.O(false);
                    mainFragment.R(false);
                    r rVar2 = r.f47939a;
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    DrawerLayout drawerLayout3 = mainFragment.q().f33555k;
                    if (drawerLayout3 != null) {
                        drawerLayout3.setDrawerLockMode(1);
                    }
                    mainFragment.O(true);
                    mainFragment.R(false);
                    r rVar3 = r.f47939a;
                }
                Na.i iVar = E8.a.f3126a;
                return r.f47939a;
            }
        }));
        P().f32559R.e(getViewLifecycleOwner(), new a(new l<BatteryVoltageState, r>() { // from class: com.voltasit.obdeleven.presentation.main.MainFragment$setupObservers$11
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(BatteryVoltageState batteryVoltageState) {
                BatteryVoltageState batteryVoltageState2 = batteryVoltageState;
                final MainFragment mainFragment = this.this$0;
                kotlin.jvm.internal.i.b(batteryVoltageState2);
                AbstractC0630h0 abstractC0630h2 = mainFragment.f32518m;
                if (abstractC0630h2 == null) {
                    kotlin.jvm.internal.i.m("binding");
                    throw null;
                }
                abstractC0630h2.f1950x.setImageResource(batteryVoltageState2.b());
                int color = mainFragment.getResources().getColor(batteryVoltageState2.a());
                if (!mainFragment.f32522q) {
                    AbstractC0630h0 abstractC0630h3 = mainFragment.f32518m;
                    if (abstractC0630h3 == null) {
                        kotlin.jvm.internal.i.m("binding");
                        throw null;
                    }
                    Object tag = abstractC0630h3.f1950x.getTag();
                    if (!(tag instanceof Integer) || color != ((Number) tag).intValue()) {
                        mainFragment.f32522q = true;
                        ValueAnimator valueAnimator = new ValueAnimator();
                        AbstractC0630h0 abstractC0630h4 = mainFragment.f32518m;
                        if (abstractC0630h4 == null) {
                            kotlin.jvm.internal.i.m("binding");
                            throw null;
                        }
                        Object tag2 = abstractC0630h4.f1950x.getTag();
                        kotlin.jvm.internal.i.c(tag2, "null cannot be cast to non-null type kotlin.Int");
                        valueAnimator.setIntValues(((Integer) tag2).intValue(), color);
                        valueAnimator.setEvaluator(new ArgbEvaluator());
                        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.voltasit.obdeleven.presentation.main.f
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                MainFragment this$0 = mainFragment;
                                kotlin.jvm.internal.i.e(this$0, "this$0");
                                kotlin.jvm.internal.i.e(valueAnimator2, "valueAnimator");
                                if (this$0.y() || this$0.P().f32553O == 0) {
                                    return;
                                }
                                Object animatedValue = valueAnimator2.getAnimatedValue();
                                kotlin.jvm.internal.i.c(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                                this$0.Q(((Integer) animatedValue).intValue());
                            }
                        });
                        valueAnimator.addListener(new g(mainFragment));
                        valueAnimator.setDuration(1000L);
                        valueAnimator.start();
                    }
                }
                return r.f47939a;
            }
        }));
        P().f32576Z0.e(getViewLifecycleOwner(), new a(new l<Boolean, r>() { // from class: com.voltasit.obdeleven.presentation.main.MainFragment$setupObservers$12
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Boolean bool) {
                this.this$0.q().x();
                return r.f47939a;
            }
        }));
        z(P());
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final void D() {
        BaseFragment<?> baseFragment = r().f34233d;
        p195p9.c cVar = baseFragment instanceof p195p9.c ? (p195p9.c) baseFragment : null;
        if (cVar != null) {
            d0 d0Var = new d0(2, this);
            if (cVar.j) {
                d0Var.run();
            } else {
                cVar.f34084d = d0Var;
            }
        }
    }

    public final void O(boolean z10) {
        if (getActivity() == null) {
            return;
        }
        if (z10) {
            requireActivity().getWindow().setFlags(16, 16);
        } else {
            requireActivity().getWindow().clearFlags(16);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    public final MainViewModel P() {
        return (MainViewModel) this.f32517l.getValue();
    }

    public final void Q(int i10) {
        AbstractC0630h0 abstractC0630h0 = this.f32518m;
        if (abstractC0630h0 == null) {
            kotlin.jvm.internal.i.m("binding");
            throw null;
        }
        abstractC0630h0.f1950x.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
        AbstractC0630h0 abstractC0630h1 = this.f32518m;
        if (abstractC0630h1 == null) {
            kotlin.jvm.internal.i.m("binding");
            throw null;
        }
        abstractC0630h1.f1950x.setTag(Integer.valueOf(i10));
    }

    public final void R(boolean z10) {
        if (q().E()) {
            BaseFragment<?> baseFragment = r().f34233d;
            if (baseFragment instanceof VehicleBaseFragment) {
                ((VehicleBaseFragment) baseFragment).P().f33383G.j(Boolean.valueOf(!z10));
            } else if (baseFragment instanceof ControlUnitListFragment) {
                ControlUnitListFragment controlUnitListFragment = (ControlUnitListFragment) baseFragment;
                boolean z11 = !z10;
                controlUnitListFragment.U().f1854r.setClickable(z11);
                controlUnitListFragment.setMenuVisibility(z11);
            }
        }
    }

    public final void S(boolean z10) {
        AbstractC0630h0 abstractC0630h0 = this.f32518m;
        if (abstractC0630h0 == null) {
            kotlin.jvm.internal.i.m("binding");
            throw null;
        }
        abstractC0630h0.f1936B.setImageResource(2131231583);
        AbstractC0630h0 abstractC0630h1 = this.f32518m;
        if (abstractC0630h1 == null) {
            kotlin.jvm.internal.i.m("binding");
            throw null;
        }
        abstractC0630h1.f1936B.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.fab_blue)));
        if (!z10) {
            AbstractC0630h0 abstractC0630h2 = this.f32518m;
            if (abstractC0630h2 != null) {
                abstractC0630h2.f1936B.h();
                return;
            } else {
                kotlin.jvm.internal.i.m("binding");
                throw null;
            }
        }
        AbstractC0630h0 abstractC0630h3 = this.f32518m;
        if (abstractC0630h3 == null) {
            kotlin.jvm.internal.i.m("binding");
            throw null;
        }
        if (!abstractC0630h3.f1936B.k()) {
            AbstractC0630h0 abstractC0630h4 = this.f32518m;
            if (abstractC0630h4 != null) {
                abstractC0630h4.f1936B.n();
                return;
            } else {
                kotlin.jvm.internal.i.m("binding");
                throw null;
            }
        }
        AbstractC0630h0 abstractC0630h5 = this.f32518m;
        if (abstractC0630h5 == null) {
            kotlin.jvm.internal.i.m("binding");
            throw null;
        }
        abstractC0630h5.f1936B.i(new b(), true);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x02e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0308 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x02bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:74:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:79:0x02fc A[Catch: all -> 0x0302, TryCatch #0 {all -> 0x0302, blocks: (B:77:0x02e6, B:79:0x02fc, B:82:0x0304), top: B:113:0x02e6 }] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String dialogId, DialogCallback.CallbackType callbackType, Bundle data) {
        boolean z10;
        ActivityC1347l activityC1347lRequireActivity;
        t tVar;
        y supportFragmentManager;
        WeakHashMap weakHashMap;
        WeakReference weakReference;
        y0 y0Var;
        A a10;
        kotlin.jvm.internal.i.e(dialogId, "dialogId");
        kotlin.jvm.internal.i.e(data, "data");
        if (dialogId.equals("BatteryVoltageDialog") && callbackType == DialogCallback.CallbackType.f31102c) {
            com.voltasit.obdeleven.presentation.main.b bVar = this.f32521p;
            if (bVar != null) {
                bVar.y();
            }
            this.f32521p = null;
            return;
        }
        boolean z11 = false;
        boolean z12 = true;
        if (dialogId.equals("askFreezeFrameDialog") && callbackType == DialogCallback.CallbackType.f31102c) {
            P().f32601r.E(true);
            P().f32601r.l();
            P().m(false);
            return;
        }
        if (dialogId.equals("askFreezeFrameDialog") && callbackType == DialogCallback.CallbackType.f31101b) {
            P().f32601r.E(false);
            P().f32601r.l();
            P().m(false);
            return;
        }
        if (!"LocationPermissionInfoDialog".equals(dialogId) || callbackType != DialogCallback.CallbackType.f31102c) {
            if ("SlowScanWarningDialog".equals(dialogId)) {
                MainViewModel mainViewModelP = P();
                if (callbackType == DialogCallback.CallbackType.f31102c) {
                    mainViewModelP.m(true);
                    return;
                } else {
                    mainViewModelP.d();
                    return;
                }
            }
            return;
        }
        Context contextRequireContext = requireContext();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        C0873a c0873a = new C0873a();
        C0873a c0873a2 = new C0873a();
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.f25297d;
        p156m5.b bVar2 = p156m5.e.f44597a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Looper mainLooper = contextRequireContext.getMainLooper();
        String packageName = contextRequireContext.getPackageName();
        String name = contextRequireContext.getClass().getName();
        com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.c.C0265c> aVar = LocationServices.f26526a;
        C0804l.i(aVar, "Api must not be null");
        c0873a2.put(aVar, null);
        C0804l.i(aVar.f25312a, "Base client builder must not be null");
        List listEmptyList = Collections.emptyList();
        hashSet2.addAll(listEmptyList);
        hashSet.addAll(listEmptyList);
        C0804l.a("must call addApi() to add at least one API", !c0873a2.isEmpty());
        p156m5.a aVar2 = p156m5.a.f44596b;
        com.google.android.gms.common.api.a aVar3 = p156m5.e.f44598b;
        if (c0873a2.containsKey(aVar3)) {
            aVar2 = (p156m5.a) c0873a2.get(aVar3);
        }
        C0795c c0795c = new C0795c(null, hashSet, c0873a, packageName, name, aVar2);
        Map map = c0795c.f6427d;
        C0873a c0873a3 = new C0873a();
        C0873a c0873a4 = new C0873a();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = ((C0873a.c) c0873a2.keySet()).iterator();
        while (true) {
            AbstractC0878f abstractC0878f = (AbstractC0878f) it;
            if (!abstractC0878f.hasNext()) {
                break;
            }
            com.google.android.gms.common.api.a aVar4 = (com.google.android.gms.common.api.a) abstractC0878f.next();
            V v10 = c0873a2.get(aVar4);
            boolean z13 = map.get(aVar4) != null ? z12 : z11;
            c0873a3.put(aVar4, Boolean.valueOf(z13));
            u0 u0Var = new u0(aVar4, z13);
            arrayList3.add(u0Var);
            com.google.android.gms.common.api.a.AbstractC0263a abstractC0263a = aVar4.f25312a;
            C0804l.h(abstractC0263a);
            C0873a c0873a5 = c0873a4;
            com.google.android.gms.common.api.a.e eVarA = abstractC0263a.a(contextRequireContext, mainLooper, c0795c, v10, u0Var, u0Var);
            c0873a5.put(aVar4.f25313b, eVarA);
            eVarA.getClass();
            c0873a4 = c0873a5;
            c0873a3 = c0873a3;
            arrayList3 = arrayList3;
            z11 = false;
            z12 = true;
        }
        C0873a c0873a6 = c0873a4;
        G g10 = new G(contextRequireContext, new ReentrantLock(), mainLooper, c0795c, googleApiAvailability, bVar2, c0873a3, arrayList, arrayList2, c0873a6, -1, G.a(c0873a6.values(), true), arrayList3);
        Set set = com.google.android.gms.common.api.d.f25326b;
        synchronized (set) {
            set.add(g10);
        }
        ReentrantLock reentrantLock = g10.f5845c;
        reentrantLock.lock();
        try {
            int i10 = 2;
            if (g10.f5848f >= 0) {
                C0804l.j("Sign-in mode should have been set explicitly by auto-manage.", g10.f5863v != null);
            } else {
                Integer num = g10.f5863v;
                if (num == null) {
                    g10.f5863v = Integer.valueOf(G.a(g10.f5857p.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            Integer num2 = g10.f5863v;
            C0804l.h(num2);
            int iIntValue = num2.intValue();
            reentrantLock.lock();
            try {
                if (iIntValue != 3 && iIntValue != 1) {
                    if (iIntValue != 2) {
                        i10 = iIntValue;
                        z10 = false;
                    }
                    C0804l.a("Illegal sign-in mode: " + i10, z10);
                    g10.e(i10);
                    g10.h();
                    reentrantLock.unlock();
                    reentrantLock.unlock();
                    LocationRequest locationRequest = new LocationRequest(me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, BrazeLogger.SUPPRESS, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
                    locationRequest.f26513b = me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_textAppearanceListItemSecondary;
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(locationRequest);
                    com.google.android.gms.internal.location.g gVar = new com.google.android.gms.internal.location.g(requireContext(), com.google.android.gms.internal.location.e.f25368i, com.google.android.gms.common.api.a.c.f25315a, com.google.android.gms.common.api.c.a.f25324b);
                    p106i5.a aVar5 = new p106i5.a(arrayList4, true, false);
                    AbstractC0779l.a aVar6 = new AbstractC0779l.a();
                    aVar6.f5970b = true;
                    aVar6.f5969a = new F6.c(aVar5);
                    aVar6.f5972d = 2426;
                    B b10 = gVar.b(0, new h0(aVar6, aVar6.f5971c, aVar6.f5970b, aVar6.f5972d));
                    kotlin.jvm.internal.i.d(b10, "checkLocationSettings(...)");
                    activityC1347lRequireActivity = requireActivity();
                    tVar = new t(p191p5.i.f45812a, new androidx.media3.exoplayer.E(5, this));
                    b10.f45806b.a(tVar);
                    C0804l.i(activityC1347lRequireActivity, "Activity must not be null");
                    WeakHashMap weakHashMap2 = y0.f6020c;
                    supportFragmentManager = activityC1347lRequireActivity.getSupportFragmentManager();
                    weakHashMap = y0.f6020c;
                    weakReference = (WeakReference) weakHashMap.get(activityC1347lRequireActivity);
                    if (weakReference != null || (y0Var = (y0) weakReference.get()) == null) {
                        try {
                            y0Var = (y0) supportFragmentManager.D("SLifecycleFragmentImpl");
                            if (y0Var != null || y0Var.isRemoving()) {
                                y0Var = new y0();
                                C1336a c1336a = new C1336a(supportFragmentManager);
                                c1336a.d(0, y0Var, "SLifecycleFragmentImpl", 1);
                                c1336a.j(true, true);
                            }
                            weakHashMap.put(activityC1347lRequireActivity, new WeakReference(y0Var));
                        } catch (ClassCastException e10) {
                            throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
                        }
                    }
                    synchronized (y0Var) {
                        try {
                            a10 = (A) ((C0772e) A.class.cast(y0Var.f6021b.f6015a.get("TaskOnStopCallback")));
                            if (a10 == null) {
                                a10 = new A(y0Var);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    synchronized (a10.f45804c) {
                        a10.f45804c.add(new WeakReference(tVar));
                    }
                    b10.w();
                    return;
                }
                i10 = iIntValue;
                C0804l.a("Illegal sign-in mode: " + i10, z10);
                g10.e(i10);
                g10.h();
                reentrantLock.unlock();
                reentrantLock.unlock();
                LocationRequest locationRequest2 = new LocationRequest(me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, BrazeLogger.SUPPRESS, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
                locationRequest2.f26513b = me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_textAppearanceListItemSecondary;
                ArrayList arrayList5 = new ArrayList();
                arrayList5.add(locationRequest2);
                com.google.android.gms.internal.location.g gVar2 = new com.google.android.gms.internal.location.g(requireContext(), com.google.android.gms.internal.location.e.f25368i, com.google.android.gms.common.api.a.c.f25315a, com.google.android.gms.common.api.c.a.f25324b);
                p106i5.a aVar7 = new p106i5.a(arrayList5, true, false);
                AbstractC0779l.a aVar8 = new AbstractC0779l.a();
                aVar8.f5970b = true;
                aVar8.f5969a = new F6.c(aVar7);
                aVar8.f5972d = 2426;
                B b11 = gVar2.b(0, new h0(aVar8, aVar8.f5971c, aVar8.f5970b, aVar8.f5972d));
                kotlin.jvm.internal.i.d(b11, "checkLocationSettings(...)");
                activityC1347lRequireActivity = requireActivity();
                tVar = new t(p191p5.i.f45812a, new androidx.media3.exoplayer.E(5, this));
                b11.f45806b.a(tVar);
                C0804l.i(activityC1347lRequireActivity, "Activity must not be null");
                WeakHashMap weakHashMap3 = y0.f6020c;
                supportFragmentManager = activityC1347lRequireActivity.getSupportFragmentManager();
                weakHashMap = y0.f6020c;
                weakReference = (WeakReference) weakHashMap.get(activityC1347lRequireActivity);
                if (weakReference != null) {
                    y0Var = (y0) supportFragmentManager.D("SLifecycleFragmentImpl");
                    if (y0Var != null) {
                        y0Var = new y0();
                        C1336a c1336a2 = new C1336a(supportFragmentManager);
                        c1336a2.d(0, y0Var, "SLifecycleFragmentImpl", 1);
                        c1336a2.j(true, true);
                    } else {
                        y0Var = new y0();
                        C1336a c1336a3 = new C1336a(supportFragmentManager);
                        c1336a3.d(0, y0Var, "SLifecycleFragmentImpl", 1);
                        c1336a3.j(true, true);
                    }
                    weakHashMap.put(activityC1347lRequireActivity, new WeakReference(y0Var));
                } else {
                    y0Var = (y0) supportFragmentManager.D("SLifecycleFragmentImpl");
                    if (y0Var != null) {
                        y0Var = new y0();
                        C1336a c1336a4 = new C1336a(supportFragmentManager);
                        c1336a4.d(0, y0Var, "SLifecycleFragmentImpl", 1);
                        c1336a4.j(true, true);
                    } else {
                        y0Var = new y0();
                        C1336a c1336a5 = new C1336a(supportFragmentManager);
                        c1336a5.d(0, y0Var, "SLifecycleFragmentImpl", 1);
                        c1336a5.j(true, true);
                    }
                    weakHashMap.put(activityC1347lRequireActivity, new WeakReference(y0Var));
                }
                synchronized (y0Var) {
                    a10 = (A) ((C0772e) A.class.cast(y0Var.f6021b.f6015a.get("TaskOnStopCallback")));
                    if (a10 == null) {
                        a10 = new A(y0Var);
                    }
                    synchronized (a10.f45804c) {
                        a10.f45804c.add(new WeakReference(tVar));
                        b11.w();
                        return;
                    }
                }
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
            z10 = true;
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "MainFragment";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1 && i11 == -1) {
            q().x();
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        kotlin.jvm.internal.i.e(menu, "menu");
        kotlin.jvm.internal.i.e(inflater, "inflater");
        MenuItem menuItemAdd = menu.add(R.string.common_share);
        menuItemAdd.setIcon(2131231719);
        menuItemAdd.setShowAsAction(1);
        menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.voltasit.obdeleven.presentation.main.e
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                MainFragment this$0 = this.f32629a;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                MainViewModel mainViewModelP = this$0.P();
                a2 a2VarK = mainViewModelP.f32605t.k();
                mainViewModelP.f32113b.j(new PreloaderState.a(R.string.common_generating_log));
                C2680e.c(Z.a(mainViewModelP), mainViewModelP.f32112a, null, new MainViewModel$clickShare$1(mainViewModelP, a2VarK, null), 2);
                return true;
            }
        });
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        O.e.j("MainFragment", "onDestroy()");
        getViewModelStore().a();
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        P().o();
        com.voltasit.obdeleven.presentation.main.b bVar = this.f32521p;
        if (bVar != null) {
            bVar.y();
        }
        this.f32521p = null;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        AbstractC0630h0 abstractC0630h0 = this.f32518m;
        if (abstractC0630h0 == null) {
            kotlin.jvm.internal.i.m("binding");
            throw null;
        }
        SwipeRefreshLayout swipeRefreshLayout = abstractC0630h0.f1941G;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
            swipeRefreshLayout.destroyDrawingCache();
            swipeRefreshLayout.clearAnimation();
        }
        p279w9.b bVar = Application.f29634b;
        synchronized (bVar) {
            bVar.f47824a.remove("MAIN_FRAGMENT");
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        MainViewModel mainViewModelP = P();
        mainViewModelP.getClass();
        if (mainViewModelP.f32601r.H()) {
            p279w9.b bVar = Application.f29634b;
            synchronized (bVar) {
                bVar.f47824a.put("MAIN_FRAGMENT", new w9.b.a(this, 31536000000L));
            }
        }
        if (mainViewModelP.f32553O == 2) {
            S8.c cVar = mainViewModelP.f32549M;
            cVar.f5701a = mainViewModelP.f32551N;
            cVar.f5702b = new Timer();
            cVar.f5702b.scheduleAtFixedRate(new S8.b(cVar), 0L, 1000L);
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        P().o();
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final int p() {
        return this.f32523r;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        String string = getString(R.string.common_obdeleven);
        kotlin.jvm.internal.i.d(string, "getString(...)");
        return string;
    }
}
