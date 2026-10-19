package com.voltasit.obdeleven.presentation.controlUnit;

import B8.AbstractC0633j;
import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import androidx.lifecycle.Z;
import com.afollestad.materialdialogs.MaterialDialog;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.enums.SupportedFunction;
import com.obdeleven.service.model.ControlUnit;
import com.parse.ControlUnitDB;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.interfaces.Positionable$Position;
import com.voltasit.obdeleven.interfaces.Positionable$Transition;
import com.voltasit.obdeleven.interfaces.SimpleAnimationListener;
import com.voltasit.obdeleven.models.MenuOption;
import com.voltasit.obdeleven.presentation.basicsettings.UDSBasicSettingsFragment;
import com.voltasit.obdeleven.presentation.controlUnit.eeprom.EepromFragment;
import com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.online.OnlineControlUnitAdaptationFragment;
import com.voltasit.obdeleven.presentation.controlUnit.sfd.lock.LockSfdDialog;
import com.voltasit.obdeleven.presentation.controlUnit.sfd.unlock.UnlockSfdDialog;
import com.voltasit.obdeleven.presentation.controlUnit.uds.outputtest.UDSOutputTestFragment;
import com.voltasit.obdeleven.presentation.pro.BaseProFragment;
import com.voltasit.obdeleven.presentation.vagpromo.VagProRedirectPromoPresenter;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.B0;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import com.voltasit.obdeleven.ui.dialogs.C2137c;
import com.voltasit.obdeleven.ui.dialogs.C2147h;
import com.voltasit.obdeleven.ui.dialogs.C2158m0;
import com.voltasit.obdeleven.ui.dialogs.I0;
import com.voltasit.obdeleven.ui.dialogs.T;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import com.voltasit.parse.model.AdaptationType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C2680e;
import org.koin.java.KoinJavaComponent;
import p134k8.D1;
import p134k8.Q0;
import p220r9.P;
import p255u9.C2801d;

/* JADX INFO: compiled from: ControlUnitFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@O8.b("http://obdeleven.proboards.com/board/100/app-usage-tips")
public abstract class ControlUnitFragment extends BaseProFragment<M0.h> implements O8.c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p255u9.E f31428n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ControlUnit f31429o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ControlUnitDB f31430p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C2801d f31431q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f31433s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List<D1> f31434t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public MaterialDialog f31435u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f31436v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public I0 f31437w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AbstractC0633j f31438x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public B0 f31439y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C2147h f31440z;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList<View> f31432r = new ArrayList<>();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.f f31424A = (com.voltasit.obdeleven.domain.usecases.f) KoinJavaComponent.a(com.voltasit.obdeleven.domain.usecases.f.class);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Object f31425B = KoinJavaComponent.b(ControlUnitViewModel.class, null, null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final J8.a f31426C = (J8.a) KoinJavaComponent.a(J8.a.class);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Object f31427D = kotlin.a.b(LazyThreadSafetyMode.f42971b, new Ia.a<VagProRedirectPromoPresenter>(this) { // from class: com.voltasit.obdeleven.presentation.controlUnit.ControlUnitFragment$special$$inlined$inject$default$1
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ Pb.a $qualifier = null;
        final /* synthetic */ Ia.a $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.$this_inject = this;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.voltasit.obdeleven.presentation.vagpromo.VagProRedirectPromoPresenter, java.lang.Object] */
        @Override // Ia.a
        public final VagProRedirectPromoPresenter invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            Pb.a aVar = this.$qualifier;
            return Cb.a.i(componentCallbacks).a(this.$parameters, aVar, kotlin.jvm.internal.l.a(VagProRedirectPromoPresenter.class));
        }
    });

    /* JADX INFO: compiled from: ControlUnitFragment.kt */
    public static final class a implements androidx.lifecycle.D, kotlin.jvm.internal.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lambda f31441b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Ia.l lVar) {
            this.f31441b = (Lambda) lVar;
        }

        @Override // kotlin.jvm.internal.f
        public final p293xa.e<?> b() {
            return this.f31441b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        @Override // androidx.lifecycle.D
        public final /* synthetic */ void d(Object obj) {
            this.f31441b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.D) || !(obj instanceof kotlin.jvm.internal.f)) {
                return false;
            }
            return this.f31441b.equals(((kotlin.jvm.internal.f) obj).b());
        }

        public final int hashCode() {
            return this.f31441b.hashCode();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xa.g] */
    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public View B(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.e(inflater, "inflater");
        ?? r10 = this.f31425B;
        z((com.voltasit.obdeleven.presentation.d) r10.getValue());
        ((ControlUnitViewModel) r10.getValue()).f31451s.e(getViewLifecycleOwner(), new a(new Ia.l<ProCuScreen, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.ControlUnitFragment$setupObservers$1
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, xa.g] */
            /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, xa.g] */
            @Override // Ia.l
            public final p293xa.r invoke(ProCuScreen proCuScreen) {
                ProCuScreen function = proCuScreen;
                kotlin.jvm.internal.i.e(function, "function");
                switch (function.ordinal()) {
                    case 0:
                        ControlUnitFragment controlUnitFragment = this.this$0;
                        C2158m0.a(controlUnitFragment.getActivity(), R.string.view_cu_enter_coding2, 65535).continueWith(new t(0, controlUnitFragment), Task.UI_THREAD_EXECUTOR);
                        break;
                    case 1:
                        ControlUnitViewModel controlUnitViewModel = (ControlUnitViewModel) this.this$0.f31425B.getValue();
                        controlUnitViewModel.getClass();
                        C2680e.c(Z.a(controlUnitViewModel), null, null, new ControlUnitViewModel$onEnterLoginClick$1(controlUnitViewModel, null), 3);
                        break;
                    case 2:
                        ControlUnitFragment controlUnitFragment2 = this.this$0;
                        String[] strArr = {controlUnitFragment2.getString(R.string.view_cu_hard_reset), controlUnitFragment2.getString(R.string.view_cu_key_off_on_reset), controlUnitFragment2.getString(R.string.view_cu_soft_reset)};
                        Bundle bundleD = C4.v.d("key_tag", "ResetDialog");
                        bundleD.putStringArray("item_array", strArr);
                        bundleD.putInt("key_positive_text", R.string.common_ok);
                        bundleD.putInt("key_negative_text", R.string.common_cancel);
                        T t8 = new T();
                        t8.setArguments(bundleD);
                        t8.f32261r = controlUnitFragment2.getFragmentManager();
                        t8.setTargetFragment(controlUnitFragment2, 0);
                        t8.A();
                        break;
                    case 3:
                        ControlUnitFragment controlUnitFragment3 = this.this$0;
                        C2134a0.b(controlUnitFragment3.q(), R.string.common_loading_data);
                        ControlUnit controlUnit = controlUnitFragment3.f31429o;
                        kotlin.jvm.internal.i.b(controlUnit);
                        Task.forResult(controlUnit.f29327i).onSuccessTask(new k(0, controlUnitFragment3), Task.UI_THREAD_EXECUTOR);
                        break;
                    case 4:
                        EepromFragment eepromFragment = new EepromFragment();
                        ControlUnitFragment controlUnitFragment4 = this.this$0;
                        eepromFragment.f31540m = controlUnitFragment4.f31429o;
                        controlUnitFragment4.r().n(eepromFragment, null);
                        break;
                    case 5:
                        final ControlUnitFragment controlUnitFragment5 = this.this$0;
                        controlUnitFragment5.getClass();
                        controlUnitFragment5.c0(new Ia.a<p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.ControlUnitFragment$showBackupDialog$1
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final p293xa.r invoke() {
                                ControlUnitFragment controlUnitFragment6 = controlUnitFragment5;
                                Bundle bundle2 = new Bundle();
                                ControlUnit controlUnit2 = controlUnitFragment5.f31429o;
                                bundle2.putInt("key_title", R.string.common_backup);
                                C2147h c2147h = new C2147h();
                                c2147h.setArguments(bundle2);
                                c2147h.f32261r = controlUnitFragment6.getFragmentManager();
                                c2147h.setTargetFragment(controlUnitFragment6, 0);
                                c2147h.f33985t = controlUnit2;
                                controlUnitFragment6.f31440z = c2147h;
                                C2147h c2147h2 = controlUnitFragment5.f31440z;
                                if (c2147h2 != null) {
                                    c2147h2.A();
                                }
                                return p293xa.r.f47939a;
                            }
                        });
                        break;
                    case 6:
                        ControlUnitViewModel controlUnitViewModel2 = (ControlUnitViewModel) this.this$0.f31425B.getValue();
                        ControlUnit controlUnit2 = this.this$0.f31429o;
                        kotlin.jvm.internal.i.b(controlUnit2);
                        short sShortValue = controlUnit2.n().shortValue();
                        controlUnitViewModel2.getClass();
                        C2680e.c(Z.a(controlUnitViewModel2), controlUnitViewModel2.f32112a, null, new ControlUnitViewModel$onShouldShowSfdLockUnlock$1(controlUnitViewModel2, sShortValue, null), 2);
                        break;
                    case 7:
                        final ControlUnitFragment controlUnitFragment6 = this.this$0;
                        controlUnitFragment6.c0(new Ia.a<p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.ControlUnitFragment$setupObservers$1.1
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final p293xa.r invoke() {
                                com.voltasit.obdeleven.presentation.controlUnit.basicsettings.i iVar = new com.voltasit.obdeleven.presentation.controlUnit.basicsettings.i();
                                ControlUnitFragment controlUnitFragment7 = controlUnitFragment6;
                                iVar.f31531y = controlUnitFragment7.f31429o;
                                controlUnitFragment7.r().n(iVar, null);
                                return p293xa.r.f47939a;
                            }
                        });
                        break;
                }
                return p293xa.r.f47939a;
            }
        }));
        ((ControlUnitViewModel) r10.getValue()).f31453u.e(getViewLifecycleOwner(), new a(new Ia.l<p293xa.r, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.ControlUnitFragment$setupObservers$2
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(p293xa.r rVar) {
                p293xa.r unit = rVar;
                kotlin.jvm.internal.i.e(unit, "unit");
                final ControlUnitFragment controlUnitFragment = this.this$0;
                controlUnitFragment.getClass();
                controlUnitFragment.K(new Ia.l<Object, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.ControlUnitFragment$showTryAgainDialog$1
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(Object dialog) {
                        kotlin.jvm.internal.i.e(dialog, "dialog");
                        controlUnitFragment.getClass();
                        ((DialogInterface) dialog).dismiss();
                        return p293xa.r.f47939a;
                    }
                }, new Ia.l<Object, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.ControlUnitFragment$showTryAgainDialog$2
                    {
                        super(1);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, xa.g] */
                    @Override // Ia.l
                    public final p293xa.r invoke(Object dialog) {
                        kotlin.jvm.internal.i.e(dialog, "dialog");
                        ControlUnitFragment controlUnitFragment2 = controlUnitFragment;
                        controlUnitFragment2.getClass();
                        ((DialogInterface) dialog).dismiss();
                        ControlUnitViewModel controlUnitViewModel = (ControlUnitViewModel) controlUnitFragment2.f31425B.getValue();
                        ProCuScreen proCuScreen = (ProCuScreen) controlUnitViewModel.f31451s.d();
                        if (proCuScreen != null) {
                            controlUnitViewModel.d(proCuScreen);
                        }
                        return p293xa.r.f47939a;
                    }
                });
                return p293xa.r.f47939a;
            }
        }));
        ((ControlUnitViewModel) r10.getValue()).f31455w.e(getViewLifecycleOwner(), new a(new Ia.l<p293xa.r, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.ControlUnitFragment$setupObservers$3
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(p293xa.r rVar) {
                p293xa.r unit = rVar;
                kotlin.jvm.internal.i.e(unit, "unit");
                U7.a<p293xa.r> aVar = this.this$0.O().f32804u;
                p293xa.r rVar2 = p293xa.r.f47939a;
                aVar.j(rVar2);
                return rVar2;
            }
        }));
        ((ControlUnitViewModel) r10.getValue()).f31442A.e(getViewLifecycleOwner(), new a(new Ia.l<Integer, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.ControlUnitFragment$setupObservers$4
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Integer num) {
                Integer num2 = num;
                LockSfdDialog lockSfdDialog = new LockSfdDialog();
                kotlin.jvm.internal.i.b(num2);
                lockSfdDialog.setArguments(p271w0.c.b(new Pair("param_time_left", num2)));
                lockSfdDialog.v(this.this$0.getChildFragmentManager(), "LockSfdDialog");
                return p293xa.r.f47939a;
            }
        }));
        ((ControlUnitViewModel) r10.getValue()).f31444C.e(getViewLifecycleOwner(), new a(new Ia.l<p293xa.r, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.ControlUnitFragment$setupObservers$5
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(p293xa.r rVar) {
                p293xa.r Unit = rVar;
                kotlin.jvm.internal.i.e(Unit, "Unit");
                new UnlockSfdDialog().v(this.this$0.getChildFragmentManager(), "UnlockSfdDialog");
                return p293xa.r.f47939a;
            }
        }));
        ((ControlUnitViewModel) r10.getValue()).f31457y.e(getViewLifecycleOwner(), new a(new Ia.l<String, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.ControlUnitFragment$setupObservers$6
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(String str) {
                String str2 = str;
                kotlin.jvm.internal.i.b(str2);
                new com.voltasit.obdeleven.presentation.dialogs.f(str2).J(this.this$0);
                return p293xa.r.f47939a;
            }
        }));
        ((ControlUnitViewModel) r10.getValue()).f31446E.e(getViewLifecycleOwner(), new a(new Ia.l<p293xa.r, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.ControlUnitFragment$setupObservers$7
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(p293xa.r rVar) {
                ControlUnitFragment controlUnitFragment = this.this$0;
                B0 b10 = controlUnitFragment.f31439y;
                if (b10 == null || !b10.isVisible()) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("key_login_finder_enabled", true);
                    bundle2.putBoolean("key_is_offline", !W7.c.e());
                    B0 b11 = new B0();
                    b11.setArguments(bundle2);
                    b11.setTargetFragment(controlUnitFragment, 0);
                    b11.f32261r = controlUnitFragment.getFragmentManager();
                    controlUnitFragment.f31439y = b11;
                    b11.f33753w = controlUnitFragment.f31429o;
                    b11.A();
                }
                return p293xa.r.f47939a;
            }
        }));
        T();
        if (bundle != null) {
            this.f31433s = true;
        }
        M0.h hVarA = M0.e.a(inflater, R.layout.control_unit_fragment, viewGroup, false, null);
        kotlin.jvm.internal.i.d(hVarA, "inflate(...)");
        this.f31438x = (AbstractC0633j) hVarA;
        this.f31432r.clear();
        return X().f4488d;
    }

    public final void U(MenuOption menuOption, int i10, View.OnClickListener onClickListener) {
        if (X().f1967r.getChildCount() > 0) {
            getLayoutInflater().inflate(R.layout.control_unit_fragment_divider, X().f1967r);
        }
        View viewInflate = getLayoutInflater().inflate(R.layout.control_unit_fragment_button, (ViewGroup) null);
        kotlin.jvm.internal.i.c(viewInflate, "null cannot be cast to non-null type android.widget.Button");
        Button button = (Button) viewInflate;
        button.setText(i10);
        button.setTag(menuOption);
        button.setOnClickListener(onClickListener);
        X().f1967r.addView(button);
        this.f31432r.add(button);
    }

    public final void V(List<? extends SupportedFunction> list) {
        if (list.contains(SupportedFunction.f29281b)) {
            U(MenuOption.f31149b, R.string.common_info, new w(this, 0));
        }
        if (list.contains(SupportedFunction.f29282c)) {
            b0();
        }
        if (list.contains(SupportedFunction.f29283d)) {
            U(MenuOption.f31151d, R.string.common_advanced_identification, new h(this, 0));
        }
        if (list.contains(SupportedFunction.f29284e)) {
            U(MenuOption.f31152e, R.string.common_subsystems, new j(0, this));
        }
        if (list.contains(SupportedFunction.f29285f)) {
            U(MenuOption.f31153f, R.string.common_live_data, new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.controlUnit.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final ControlUnitFragment this$0 = this.f31870b;
                    kotlin.jvm.internal.i.e(this$0, "this$0");
                    this$0.c0(new Ia.a<p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.ControlUnitFragment$addButtons$4$1
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final p293xa.r invoke() {
                            ControlUnit controlUnit = this$0.f31429o;
                            if (controlUnit instanceof p109i8.i) {
                                p182o9.c cVar = new p182o9.c();
                                ControlUnitFragment controlUnitFragment = this$0;
                                cVar.f31997n = controlUnitFragment.f31429o;
                                cVar.f32000q = "TAB_RecorDataIdentMeasuValue";
                                cVar.f32001r = true;
                                controlUnitFragment.r().n(cVar, null);
                            } else {
                                kotlin.jvm.internal.i.b(controlUnit);
                                if (controlUnit.f29327i == ApplicationProtocol.f29264d) {
                                    p182o9.f fVar = new p182o9.f();
                                    ControlUnitFragment controlUnitFragment2 = this$0;
                                    fVar.f31997n = controlUnitFragment2.f31429o;
                                    fVar.f32000q = "TAB_RecorDataIdentMeasuValue";
                                    fVar.f32001r = true;
                                    controlUnitFragment2.r().n(fVar, null);
                                } else if (W7.c.e()) {
                                    com.voltasit.obdeleven.presentation.controlUnit.kwp.livedata.f fVar2 = new com.voltasit.obdeleven.presentation.controlUnit.kwp.livedata.f();
                                    ControlUnitFragment controlUnitFragment3 = this$0;
                                    fVar2.f31783u = controlUnitFragment3.f31429o;
                                    controlUnitFragment3.r().n(fVar2, null);
                                } else {
                                    p170n9.n nVar = new p170n9.n();
                                    ControlUnitFragment controlUnitFragment4 = this$0;
                                    nVar.f31783u = controlUnitFragment4.f31429o;
                                    controlUnitFragment4.r().n(nVar, null);
                                }
                            }
                            return p293xa.r.f47939a;
                        }
                    });
                }
            });
        }
        if (list.contains(SupportedFunction.f29286g)) {
            U(MenuOption.f31154g, R.string.common_coding, new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.controlUnit.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final ControlUnitFragment this$0 = this.f31871b;
                    kotlin.jvm.internal.i.e(this$0, "this$0");
                    this$0.c0(new Ia.a<p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.ControlUnitFragment$addButtons$5$1
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final p293xa.r invoke() {
                            com.voltasit.obdeleven.presentation.controlUnit.kwp.coding.m mVar = new com.voltasit.obdeleven.presentation.controlUnit.kwp.coding.m();
                            ControlUnitFragment controlUnitFragment = this$0;
                            ControlUnit controlUnit = controlUnitFragment.f31429o;
                            boolean Z10 = controlUnitFragment.Z();
                            mVar.f31751s = controlUnit;
                            mVar.f31755w = Z10;
                            this$0.r().n(mVar, null);
                            return p293xa.r.f47939a;
                        }
                    });
                }
            });
        }
        if (list.contains(SupportedFunction.f29287h)) {
            U(MenuOption.f31155h, R.string.common_long_coding, new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.controlUnit.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final ControlUnitFragment this$0 = this.f31872b;
                    kotlin.jvm.internal.i.e(this$0, "this$0");
                    this$0.c0(new Ia.a<p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.ControlUnitFragment$addButtons$6$1
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final p293xa.r invoke() {
                            ControlUnit controlUnit = this$0.f31429o;
                            kotlin.jvm.internal.i.b(controlUnit);
                            if (controlUnit.f29327i == ApplicationProtocol.f29264d) {
                                X8.s sVar = new X8.s();
                                ControlUnitFragment controlUnitFragment = this$0;
                                ControlUnit controlUnit2 = controlUnitFragment.f31429o;
                                p255u9.E e10 = controlUnitFragment.f31428n;
                                boolean Z10 = controlUnitFragment.Z();
                                sVar.f7416q = controlUnit2;
                                sVar.f7408A = Z10;
                                sVar.f7419t = e10;
                                this$0.r().n(sVar, null);
                            } else {
                                com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.q qVar = new com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.q();
                                ControlUnitFragment controlUnitFragment2 = this$0;
                                ControlUnit controlUnit3 = controlUnitFragment2.f31429o;
                                boolean Z11 = controlUnitFragment2.Z();
                                qVar.f31857z = controlUnit3;
                                qVar.f31835F = false;
                                qVar.f31832C = Z11;
                                this$0.r().n(qVar, null);
                            }
                            return p293xa.r.f47939a;
                        }
                    });
                }
            });
        }
        if (list.contains(SupportedFunction.f29288i)) {
            U(MenuOption.f31156i, R.string.common_adaptation, new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.controlUnit.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final ControlUnitFragment this$0 = this.f31873b;
                    kotlin.jvm.internal.i.e(this$0, "this$0");
                    if (!W7.c.e()) {
                        ControlUnit controlUnit = this$0.f31429o;
                        kotlin.jvm.internal.i.b(controlUnit);
                        if (controlUnit.f29320b.getAdaptationType() == AdaptationType.UNKNOWN) {
                            I0 i10 = this$0.f31437w;
                            if (i10 == null || !i10.isVisible()) {
                                Bundle bundle = new Bundle();
                                bundle.putInt("key_title", R.string.common_not_available_offline);
                                bundle.putString("key_tag", "noOfflineData");
                                bundle.putInt("key_message_res", R.string.view_cu_no_offline_adaptations);
                                bundle.putInt("key_positive_text", R.string.common_ok);
                                I0 i11 = new I0();
                                i11.setArguments(bundle);
                                i11.f32261r = this$0.getFragmentManager();
                                i11.setTargetFragment(this$0, 0);
                                this$0.f31437w = i11;
                                i11.A();
                                return;
                            }
                            return;
                        }
                    }
                    this$0.c0(new Ia.a<p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.ControlUnitFragment$addButtons$7$1
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final p293xa.r invoke() {
                            ControlUnit controlUnit2 = this$0.f31429o;
                            kotlin.jvm.internal.i.b(controlUnit2);
                            if (controlUnit2.f29327i == ApplicationProtocol.f29264d) {
                                com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.h hVar = new com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.h();
                                ControlUnitFragment controlUnitFragment = this$0;
                                ControlUnit controlUnit3 = controlUnitFragment.f31429o;
                                boolean Z10 = controlUnitFragment.Z();
                                hVar.f31925q = controlUnit3;
                                hVar.f31916B = Z10;
                                this$0.r().n(hVar, null);
                            } else {
                                boolean zE = W7.c.e();
                                AdaptationType adaptationType = AdaptationType.ADAPTATION;
                                if (zE) {
                                    OnlineControlUnitAdaptationFragment onlineControlUnitAdaptationFragment = new OnlineControlUnitAdaptationFragment();
                                    ControlUnitFragment controlUnitFragment2 = this$0;
                                    onlineControlUnitAdaptationFragment.f31668B = controlUnitFragment2.f31429o;
                                    onlineControlUnitAdaptationFragment.f31670D = adaptationType;
                                    controlUnitFragment2.r().n(onlineControlUnitAdaptationFragment, null);
                                } else {
                                    p170n9.k kVar = new p170n9.k();
                                    ControlUnitFragment controlUnitFragment3 = this$0;
                                    kVar.f31668B = controlUnitFragment3.f31429o;
                                    kVar.f31670D = adaptationType;
                                    controlUnitFragment3.r().n(kVar, null);
                                }
                            }
                            return p293xa.r.f47939a;
                        }
                    });
                }
            });
        }
        if (list.contains(SupportedFunction.j)) {
            U(MenuOption.j, R.string.common_long_adaptation, new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.controlUnit.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final ControlUnitFragment this$0 = this.f31874b;
                    kotlin.jvm.internal.i.e(this$0, "this$0");
                    this$0.c0(new Ia.a<p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.ControlUnitFragment$addButtons$8$1
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final p293xa.r invoke() {
                            boolean zE = W7.c.e();
                            AdaptationType adaptationType = AdaptationType.LONG_ADAPTATION;
                            if (zE) {
                                OnlineControlUnitAdaptationFragment onlineControlUnitAdaptationFragment = new OnlineControlUnitAdaptationFragment();
                                ControlUnitFragment controlUnitFragment = this$0;
                                onlineControlUnitAdaptationFragment.f31668B = controlUnitFragment.f31429o;
                                onlineControlUnitAdaptationFragment.f31670D = adaptationType;
                                controlUnitFragment.r().n(onlineControlUnitAdaptationFragment, null);
                            } else {
                                p170n9.k kVar = new p170n9.k();
                                ControlUnitFragment controlUnitFragment2 = this$0;
                                kVar.f31668B = controlUnitFragment2.f31429o;
                                kVar.f31670D = adaptationType;
                                controlUnitFragment2.r().n(kVar, null);
                            }
                            return p293xa.r.f47939a;
                        }
                    });
                }
            });
        }
        if (list.contains(SupportedFunction.f29289k)) {
            U(MenuOption.f31157k, R.string.common_basic_settings, new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.controlUnit.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final ControlUnitFragment this$0 = this.f31875b;
                    kotlin.jvm.internal.i.e(this$0, "this$0");
                    this$0.c0(new Ia.a<p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.ControlUnitFragment$addButtons$9$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, xa.g] */
                        @Override // Ia.a
                        public final p293xa.r invoke() {
                            ControlUnit controlUnit = this$0.f31429o;
                            kotlin.jvm.internal.i.b(controlUnit);
                            if (controlUnit.f29327i == ApplicationProtocol.f29264d) {
                                UDSBasicSettingsFragment uDSBasicSettingsFragment = new UDSBasicSettingsFragment();
                                ControlUnitFragment controlUnitFragment = this$0;
                                uDSBasicSettingsFragment.f31330t = controlUnitFragment.f31429o;
                                controlUnitFragment.r().n(uDSBasicSettingsFragment, null);
                            } else {
                                ((ControlUnitViewModel) this$0.f31425B.getValue()).d(ProCuScreen.f31486i);
                            }
                            return p293xa.r.f47939a;
                        }
                    });
                }
            });
        }
        final boolean zContains = list.contains(SupportedFunction.f29290l);
        ControlUnit controlUnit = this.f31429o;
        kotlin.jvm.internal.i.b(controlUnit);
        ApplicationProtocol applicationProtocol = controlUnit.f29327i;
        ApplicationProtocol applicationProtocol2 = ApplicationProtocol.f29263c;
        MenuOption menuOption = MenuOption.f31158l;
        if (applicationProtocol == applicationProtocol2 && list.contains(SupportedFunction.f29299u)) {
            U(menuOption, R.string.common_output_test, new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.controlUnit.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final ControlUnitFragment this$0 = this.f31876b;
                    kotlin.jvm.internal.i.e(this$0, "this$0");
                    final boolean z10 = zContains;
                    this$0.c0(new Ia.a<p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.ControlUnitFragment$addButtons$10$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final p293xa.r invoke() {
                            p010a9.d dVar = new p010a9.d();
                            boolean z11 = z10;
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("is_sequential_test_supported", z11);
                            dVar.setArguments(bundle);
                            ControlUnitFragment controlUnitFragment = this$0;
                            dVar.f20629p = controlUnitFragment.f31429o;
                            controlUnitFragment.r().n(dVar, null);
                            return p293xa.r.f47939a;
                        }
                    });
                }
            });
        } else if (zContains) {
            U(menuOption, R.string.common_output_test, new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.controlUnit.x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final ControlUnitFragment this$0 = this.f32014b;
                    kotlin.jvm.internal.i.e(this$0, "this$0");
                    this$0.c0(new Ia.a<p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.ControlUnitFragment$addButtons$11$1
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final p293xa.r invoke() {
                            ControlUnit controlUnit2 = this$0.f31429o;
                            kotlin.jvm.internal.i.b(controlUnit2);
                            if (controlUnit2.f29327i == ApplicationProtocol.f29264d) {
                                UDSOutputTestFragment uDSOutputTestFragment = new UDSOutputTestFragment();
                                ControlUnitFragment controlUnitFragment = this$0;
                                ControlUnit controlUnit3 = controlUnitFragment.f31429o;
                                boolean Z10 = controlUnitFragment.Z();
                                uDSOutputTestFragment.f31971s = controlUnit3;
                                uDSOutputTestFragment.f31960F = Z10;
                                this$0.r().n(uDSOutputTestFragment, null);
                            } else {
                                p022b9.f fVar = new p022b9.f();
                                ControlUnitFragment controlUnitFragment2 = this$0;
                                fVar.f20629p = controlUnitFragment2.f31429o;
                                controlUnitFragment2.r().n(fVar, null);
                            }
                            return p293xa.r.f47939a;
                        }
                    });
                }
            });
        }
        boolean zContains2 = list.contains(SupportedFunction.f29291m);
        MenuOption menuOption2 = MenuOption.f31166t;
        if (zContains2) {
            U(menuOption2, R.string.common_coding2, new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.controlUnit.y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final ControlUnitFragment this$0 = this.f32015b;
                    kotlin.jvm.internal.i.e(this$0, "this$0");
                    this$0.c0(new Ia.a<p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.ControlUnitFragment$addButtons$12$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xa.g] */
                        @Override // Ia.a
                        public final p293xa.r invoke() {
                            ((ControlUnitViewModel) this$0.f31425B.getValue()).d(ProCuScreen.f31479b);
                            return p293xa.r.f47939a;
                        }
                    });
                }
            });
        }
        if (list.contains(SupportedFunction.f29292n)) {
            U(menuOption2, R.string.common_security_access, new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.controlUnit.z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final ControlUnitFragment this$0 = this.f32016b;
                    kotlin.jvm.internal.i.e(this$0, "this$0");
                    this$0.c0(new Ia.a<p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.ControlUnitFragment$addButtons$13$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xa.g] */
                        @Override // Ia.a
                        public final p293xa.r invoke() {
                            ((ControlUnitViewModel) this$0.f31425B.getValue()).d(ProCuScreen.f31480c);
                            return p293xa.r.f47939a;
                        }
                    });
                }
            });
        }
        if (list.contains(SupportedFunction.f29293o)) {
            U(menuOption2, R.string.view_cu_service_change, new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.controlUnit.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final ControlUnitFragment this$0 = this.f31488b;
                    kotlin.jvm.internal.i.e(this$0, "this$0");
                    this$0.c0(new Ia.a<p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.ControlUnitFragment$addButtons$14$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xa.g] */
                        @Override // Ia.a
                        public final p293xa.r invoke() {
                            ((ControlUnitViewModel) this$0.f31425B.getValue()).d(ProCuScreen.f31482e);
                            return p293xa.r.f47939a;
                        }
                    });
                }
            });
        }
        U(MenuOption.f31165s, R.string.common_charts, new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.controlUnit.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ControlUnitFragment controlUnitFragment = this.f31533b;
                p060e9.e eVar = new p060e9.e();
                ControlUnit controlUnit2 = controlUnitFragment.f31429o;
                kotlin.jvm.internal.i.b(controlUnit2);
                p255u9.E e10 = controlUnit2.f29321c.f42726c;
                ControlUnit controlUnit3 = controlUnitFragment.f31429o;
                eVar.f35047s = e10;
                eVar.f35048t = controlUnit3;
                eVar.f35046r = e10.getObjectId();
                controlUnitFragment.r().n(eVar, null);
            }
        });
        if (list.contains(SupportedFunction.f29294p)) {
            U(menuOption2, R.string.common_reset, new ViewOnClickListenerC2130d(this, 0));
        }
        if (list.contains(SupportedFunction.f29295q)) {
            U(MenuOption.f31159m, R.string.common_readiness, new ViewOnClickListenerC2131e(this, 0));
        }
        if (list.contains(SupportedFunction.f29296r)) {
            U(MenuOption.f31160n, R.string.common_history, new ViewOnClickListenerC2132f(this, 0));
        }
        if (list.contains(SupportedFunction.f29301w)) {
            U(menuOption2, R.string.common_sfd_protection, new com.google.android.material.datepicker.p(this, 1));
        }
        if (list.contains(SupportedFunction.f29297s)) {
            U(menuOption2, R.string.common_backup, new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.controlUnit.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final ControlUnitFragment this$0 = this.f31611b;
                    kotlin.jvm.internal.i.e(this$0, "this$0");
                    this$0.c0(new Ia.a<p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.ControlUnitFragment$addButtons$20$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xa.g] */
                        @Override // Ia.a
                        public final p293xa.r invoke() {
                            ((ControlUnitViewModel) this$0.f31425B.getValue()).d(ProCuScreen.f31484g);
                            return p293xa.r.f47939a;
                        }
                    });
                }
            });
        }
        if (list.contains(SupportedFunction.f29298t)) {
            U(menuOption2, R.string.view_eeprom_title, new i(0, this));
        }
    }

    public final void W() {
        int i10 = 0;
        Animation animationLoadAnimation = null;
        for (View view : this.f31432r) {
            if (view.getVisibility() == 0) {
                animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.scale_in_horizontal);
                animationLoadAnimation.setStartOffset(i10);
                view.startAnimation(animationLoadAnimation);
                i10 += 50;
            }
        }
        if (!q().E() || animationLoadAnimation == null) {
            return;
        }
        animationLoadAnimation.setAnimationListener(new SimpleAnimationListener() { // from class: com.voltasit.obdeleven.presentation.controlUnit.a
            @Override // com.voltasit.obdeleven.interfaces.SimpleAnimationListener
            public final void a(SimpleAnimationListener.AnimationState animationState) {
                ControlUnitFragment controlUnitFragment = this.f31487a;
                if (animationState == SimpleAnimationListener.AnimationState.f31115c) {
                    Boolean bool = controlUnitFragment.f34083c;
                    if (bool == null ? true : bool.booleanValue()) {
                        controlUnitFragment.f31432r.get(0).performClick();
                    }
                }
            }
        });
    }

    public final AbstractC0633j X() {
        AbstractC0633j abstractC0633j = this.f31438x;
        if (abstractC0633j != null) {
            return abstractC0633j;
        }
        kotlin.jvm.internal.i.m("binding");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xa.g] */
    public final void Y(DialogCallback.CallbackType callbackType, String str) {
        if (callbackType == DialogCallback.CallbackType.f31102c) {
            boolean zA = kotlin.jvm.internal.i.a(str, "SECURITY_POP_THE_HOOD");
            ?? r10 = this.f31425B;
            if (zA) {
                ControlUnitViewModel controlUnitViewModel = (ControlUnitViewModel) r10.getValue();
                controlUnitViewModel.getClass();
                C2680e.c(Z.a(controlUnitViewModel), null, null, new ControlUnitViewModel$onEnterLoginClick$1(controlUnitViewModel, null), 3);
            } else if (kotlin.jvm.internal.i.a(str, "SFD_POP_THE_HOOD")) {
                ((ControlUnitViewModel) r10.getValue()).d(ProCuScreen.f31485h);
            }
        }
    }

    public abstract boolean Z();

    public final void a0() {
        int color;
        ControlUnit controlUnit = this.f31429o;
        if (controlUnit == null || !controlUnit.b()) {
            color = getResources().getColor(R.color.black);
        } else {
            ControlUnit controlUnit2 = this.f31429o;
            kotlin.jvm.internal.i.b(controlUnit2);
            if (controlUnit2.j0()) {
                ControlUnit controlUnit3 = this.f31429o;
                kotlin.jvm.internal.i.b(controlUnit3);
                color = controlUnit3.f29337t ? getResources().getColor(R.color.holo_red_dark) : getResources().getColor(R.color.holo_green_dark);
            } else {
                color = getResources().getColor(R.color.yellow_500);
            }
        }
        X().f1970u.getBackground().mutate().setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
    }

    public void b0() {
        U(MenuOption.f31150c, R.string.common_faults, new u(0, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    public final void c0(Ia.a<p293xa.r> aVar) {
        ((VagProRedirectPromoPresenter) this.f31427D.getValue()).a(this, new androidx.activity.p(aVar));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String dialogId, DialogCallback.CallbackType callbackType, Bundle data) {
        I0 i10;
        kotlin.jvm.internal.i.e(dialogId, "dialogId");
        kotlin.jvm.internal.i.e(data, "data");
        switch (dialogId.hashCode()) {
            case -266872374:
                if (dialogId.equals("BackupDialog") && callbackType == DialogCallback.CallbackType.f31104e) {
                    C2147h c2147h = this.f31440z;
                    if (c2147h != null) {
                        c2147h.y();
                        this.f31440z = null;
                    }
                    p279w9.b bVar = Application.f29634b;
                    P8.c.a(6, "ControlUnitFragment", "Backup dialog error", Arrays.copyOf(new Object[0], 0));
                    if (!y()) {
                        MainActivity mainActivityQ = q();
                        P.a(mainActivityQ, mainActivityQ.getString(R.string.snackbar_unknown_exception));
                    }
                }
                break;
            case 111107516:
                if (dialogId.equals("SecurityAccessDialogFragment")) {
                    if (callbackType == DialogCallback.CallbackType.f31102c) {
                        MainActivity mainActivityQ2 = q();
                        P.e(mainActivityQ2, mainActivityQ2.getString(R.string.login_accepted));
                        UserTrackingUtils.c(UserTrackingUtils.Key.f34270o, 1);
                    }
                    B0 b10 = this.f31439y;
                    if (b10 != null) {
                        b10.y();
                        this.f31439y = null;
                    }
                    break;
                }
                break;
            case 455161687:
                if (dialogId.equals("ResetDialog") && callbackType == DialogCallback.CallbackType.f31102c) {
                    int i11 = data.getInt("key_selected_item");
                    ControlUnit controlUnit = this.f31429o;
                    kotlin.jvm.internal.i.b(controlUnit);
                    O.e.j(controlUnit.f0(), "reset()");
                    controlUnit.D(false).continueWithTask(new Q0(i11 + 1, controlUnit)).continueWith(new p009a8.c(3, this), Task.UI_THREAD_EXECUTOR);
                }
                break;
            case 1577108422:
                if (dialogId.equals("SFD_POP_THE_HOOD")) {
                    Y(callbackType, dialogId);
                    break;
                }
                break;
            case 1915132215:
                if (dialogId.equals("SECURITY_POP_THE_HOOD")) {
                    Y(callbackType, dialogId);
                    break;
                }
                break;
            case 1950347180:
                if (dialogId.equals("noOfflineData") && callbackType == DialogCallback.CallbackType.f31102c && (i10 = this.f31437w) != null) {
                    i10.y();
                    this.f31437w = null;
                }
                break;
        }
    }

    @Override // O8.c
    public final List<View> h() {
        return this.f31432r;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        p279w9.b bVar = Application.f29634b;
        P8.c.a(3, "ControlUnitFragment", "onDestroy()", Arrays.copyOf(new Object[0], 0));
        super.onDestroy();
        ControlUnit controlUnit = this.f31429o;
        if (controlUnit != null) {
            controlUnit.a();
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        MaterialDialog materialDialog = C2158m0.f33992a;
        if (materialDialog != null && materialDialog.isShowing()) {
            C2158m0.f33992a.dismiss();
        }
        C2137c.a();
        MaterialDialog materialDialog2 = this.f31435u;
        if (materialDialog2 != null && materialDialog2.isShowing()) {
            MaterialDialog materialDialog3 = this.f31435u;
            kotlin.jvm.internal.i.b(materialDialog3);
            materialDialog3.dismiss();
        }
        C2147h c2147h = this.f31440z;
        if (c2147h != null) {
            c2147h.y();
            this.f31440z = null;
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final Positionable$Transition s() {
        return Positionable$Transition.f31112d;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final Positionable$Position t() {
        return Positionable$Position.f31106b;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        String string = getString(R.string.common_control_unit);
        kotlin.jvm.internal.i.d(string, "getString(...)");
        return string;
    }
}
