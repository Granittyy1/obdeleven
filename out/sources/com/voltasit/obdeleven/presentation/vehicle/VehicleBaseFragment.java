package com.voltasit.obdeleven.presentation.vehicle;

import B8.D0;
import Ia.l;
import M0.h;
import V8.C0828b;
import android.content.ComponentCallbacks;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;
import androidx.activity.p;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.D;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import com.google.android.material.imageview.ShapeableImageView;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.interfaces.Positionable$Position;
import com.voltasit.obdeleven.interfaces.SimpleAnimationListener;
import com.voltasit.obdeleven.models.MenuOption;
import com.voltasit.obdeleven.presentation.controlUnit.kwp.coding.g;
import com.voltasit.obdeleven.presentation.controlUnit.kwp.coding.j;
import com.voltasit.obdeleven.presentation.controlUnit.kwp.coding.k;
import com.voltasit.obdeleven.presentation.dialogs.backup.MultiBackupDialog;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import com.voltasit.obdeleven.presentation.vagpromo.VagProRedirectPromoPresenter;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2680e;
import org.koin.androidx.viewmodel.scope.ScopeExtKt;
import p220r9.P;
import p220r9.y;
import p255u9.E;
import p293xa.r;

/* JADX INFO: compiled from: VehicleBaseFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class VehicleBaseFragment extends BaseFragment<D0> implements O8.c, DialogCallback {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f33368l = R.layout.fragment_vehicle;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f33369m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public y f33370n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public MultiBackupDialog f33371o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public D0 f33372p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f33373q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f33374r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f33375s;

    /* JADX INFO: compiled from: VehicleBaseFragment.kt */
    public static final class a implements D, f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lambda f33376b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l lVar) {
            this.f33376b = (Lambda) lVar;
        }

        @Override // kotlin.jvm.internal.f
        public final p293xa.e<?> b() {
            return this.f33376b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        @Override // androidx.lifecycle.D
        public final /* synthetic */ void d(Object obj) {
            this.f33376b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof D) || !(obj instanceof f)) {
                return false;
            }
            return this.f33376b.equals(((f) obj).b());
        }

        public final int hashCode() {
            return this.f33376b.hashCode();
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.voltasit.obdeleven.presentation.vehicle.VehicleBaseFragment$special$$inlined$stateViewModel$default$1] */
    public VehicleBaseFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f42971b;
        this.f33373q = kotlin.a.b(lazyThreadSafetyMode, new Ia.a<J8.a>(this) { // from class: com.voltasit.obdeleven.presentation.vehicle.VehicleBaseFragment$special$$inlined$inject$default$1
            final /* synthetic */ ComponentCallbacks $this_inject;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_inject = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [J8.a, java.lang.Object] */
            @Override // Ia.a
            public final J8.a invoke() {
                ComponentCallbacks componentCallbacks = this.$this_inject;
                Pb.a aVar = this.$qualifier;
                return Cb.a.i(componentCallbacks).a(this.$parameters, aVar, kotlin.jvm.internal.l.a(J8.a.class));
            }
        });
        this.f33374r = kotlin.a.b(lazyThreadSafetyMode, new Ia.a<VagProRedirectPromoPresenter>(this) { // from class: com.voltasit.obdeleven.presentation.vehicle.VehicleBaseFragment$special$$inlined$inject$default$2
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
        final Ia.a<Ob.a> aVar = new Ia.a<Ob.a>() { // from class: com.voltasit.obdeleven.presentation.vehicle.VehicleBaseFragment$vehicleViewModel$2
            {
                super(0);
            }

            @Override // Ia.a
            public final Ob.a invoke() {
                Bundle arguments = this.this$0.getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                String string = arguments.getString("vehicleId", "");
                i.d(string, "getString(...)");
                return I.e.j(new e(string, (E) arguments.getParcelable("vehicle"), arguments.getBoolean("disable_picture_change", false), arguments.getBoolean("is_from_start", false)));
            }
        };
        final Ia.a<Bundle> aVarA = ScopeExtKt.a();
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.presentation.vehicle.VehicleBaseFragment$special$$inlined$stateViewModel$default$1
            final /* synthetic */ Fragment $this_stateViewModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_stateViewModel = this;
            }

            @Override // Ia.a
            public final Fragment invoke() {
                return this.$this_stateViewModel;
            }
        };
        this.f33375s = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<VehicleViewModel>(this) { // from class: com.voltasit.obdeleven.presentation.vehicle.VehicleBaseFragment$special$$inlined$stateViewModel$default$2
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Fragment $this_stateViewModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_stateViewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.vehicle.VehicleViewModel] */
            @Override // Ia.a
            public final VehicleViewModel invoke() {
                Fragment fragment = this.$this_stateViewModel;
                Pb.a aVar2 = this.$qualifier;
                Ia.a aVar3 = aVarA;
                Ia.a aVar4 = r10;
                Ia.a aVar5 = aVar;
                b0 viewModelStore = ((c0) aVar4.invoke()).getViewModelStore();
                p014b1.a aVarA2 = Hb.a.a((Bundle) aVar3.invoke(), fragment);
                if (aVarA2 == null) {
                    aVarA2 = fragment.getDefaultViewModelCreationExtras();
                    i.d(aVarA2, "<get-defaultViewModelCreationExtras>(...)");
                }
                return Gb.a.a(kotlin.jvm.internal.l.a(VehicleViewModel.class), viewModelStore, null, aVarA2, aVar2, Cb.a.i(fragment), aVar5);
            }
        });
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final void C(h hVar) {
        D0 d10 = (D0) hVar;
        this.f33372p = d10;
        d10.t(P());
        ArrayList<View> arrayList = this.f33369m;
        arrayList.clear();
        Button infoButton = d10.f1643D;
        i.d(infoButton, "infoButton");
        infoButton.setTag(MenuOption.f31161o);
        arrayList.add(infoButton);
        Button historyButton = d10.f1641B;
        i.d(historyButton, "historyButton");
        historyButton.setTag(MenuOption.f31160n);
        arrayList.add(historyButton);
        Button appButton = d10.f1648r;
        i.d(appButton, "appButton");
        appButton.setTag(MenuOption.f31162p);
        arrayList.add(appButton);
        Button gaugeButton = d10.f1640A;
        i.d(gaugeButton, "gaugeButton");
        gaugeButton.setTag(MenuOption.f31163q);
        arrayList.add(gaugeButton);
        Button manualButton = d10.f1644E;
        i.d(manualButton, "manualButton");
        manualButton.setTag(MenuOption.f31164r);
        arrayList.add(manualButton);
        Button chartButton = d10.f1651u;
        i.d(chartButton, "chartButton");
        chartButton.setTag(MenuOption.f31165s);
        arrayList.add(chartButton);
        Button controlUnitButton = d10.f1653w;
        i.d(controlUnitButton, "controlUnitButton");
        MenuOption menuOption = MenuOption.f31166t;
        controlUnitButton.setTag(menuOption);
        arrayList.add(controlUnitButton);
        Button forumButton = d10.f1656z;
        i.d(forumButton, "forumButton");
        forumButton.setTag(menuOption);
        arrayList.add(forumButton);
        Button backupButton = d10.f1649s;
        i.d(backupButton, "backupButton");
        backupButton.setTag(menuOption);
        arrayList.add(backupButton);
        if (getArguments() == null) {
            MainActivity mainActivityQ = q();
            P.a(mainActivityQ, mainActivityQ.getString(R.string.common_something_went_wrong));
            r().h();
            return;
        }
        Animation animation = null;
        int i10 = 0;
        for (View view : arrayList) {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.scale_in_horizontal);
            animationLoadAnimation.setStartOffset(i10);
            view.startAnimation(animationLoadAnimation);
            i10 += 50;
            animation = animationLoadAnimation;
        }
        if (P().f33417s.H() && animation != null) {
            animation.setAnimationListener(new SimpleAnimationListener() { // from class: com.voltasit.obdeleven.presentation.vehicle.a
                @Override // com.voltasit.obdeleven.interfaces.SimpleAnimationListener
                public final void a(SimpleAnimationListener.AnimationState animationState) {
                    VehicleBaseFragment this$0 = this.f33425a;
                    i.e(this$0, "this$0");
                    if (animationState == SimpleAnimationListener.AnimationState.f31115c) {
                        Boolean bool = this$0.f34083c;
                        if (bool == null ? true : bool.booleanValue()) {
                            if (this$0.Q()) {
                                VehicleViewModel vehicleViewModelP = this$0.P();
                                vehicleViewModelP.f33395S.j(vehicleViewModelP.f33423y);
                            } else {
                                if (!i.a(this$0.P().f33424z.d(), Boolean.FALSE) || W7.c.d()) {
                                    return;
                                }
                                VehicleViewModel vehicleViewModelP2 = this$0.P();
                                vehicleViewModelP2.f33391O.j(vehicleViewModelP2.f33423y);
                            }
                        }
                    }
                }
            });
        }
        if (P().f33417s.H()) {
            ShapeableImageView image = d10.f1642C;
            i.d(image, "image");
            image.getViewTreeObserver().addOnGlobalLayoutListener(new com.voltasit.obdeleven.ui.module.a(this, image, new b(this, 0, d10)));
        }
        P().f33386J.e(getViewLifecycleOwner(), new a(new l<Boolean, r>() { // from class: com.voltasit.obdeleven.presentation.vehicle.VehicleBaseFragment$setupObservers$1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Boolean bool) {
                this.this$0.S();
                return r.f47939a;
            }
        }));
        P().f33388L.e(getViewLifecycleOwner(), new a(new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.vehicle.VehicleBaseFragment$setupObservers$2
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(String str) {
                this.this$0.F(str);
                return r.f47939a;
            }
        }));
        P().f33390N.e(getViewLifecycleOwner(), new a(new l<Boolean, r>() { // from class: com.voltasit.obdeleven.presentation.vehicle.VehicleBaseFragment$setupObservers$3
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Boolean bool) {
                this.this$0.q();
                if (W7.c.d()) {
                    W7.c.b();
                }
                return r.f47939a;
            }
        }));
        P().f33412j0.e(getViewLifecycleOwner(), new D() { // from class: com.voltasit.obdeleven.presentation.vehicle.c
            @Override // androidx.lifecycle.D
            public final void d(Object obj) {
                E e10 = (E) obj;
                final VehicleBaseFragment this$0 = this.f33429b;
                i.e(this$0, "this$0");
                MainActivity mainActivityQ2 = this$0.q();
                y yVar = this$0.f33370n;
                if (yVar == null) {
                    i.m("imageCropHelper");
                    throw null;
                }
                ShapeableImageView image2 = this$0.O().f1642C;
                i.d(image2, "image");
                ImageView changeImageButton = this$0.O().f1650t;
                i.d(changeImageButton, "changeImageButton");
                i.b(e10);
                Ia.a<r> aVar = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.vehicle.VehicleBaseFragment$setupNavigation$1$1
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        VehicleViewModel vehicleViewModelP = this$0.P();
                        vehicleViewModelP.getClass();
                        C2680e.c(Z.a(vehicleViewModelP), vehicleViewModelP.f32112a, null, new VehicleViewModel$setVehicleChanges$1(vehicleViewModelP, null), 2);
                        return r.f47939a;
                    }
                };
                PopupMenu popupMenu = new PopupMenu(yVar.f46504a, changeImageButton);
                popupMenu.inflate(R.menu.change_restore);
                popupMenu.setOnMenuItemClickListener(new com.voltasit.obdeleven.presentation.vehicleInfo.f(yVar, e10, image2, mainActivityQ2, aVar));
                popupMenu.show();
            }
        });
        P().f33394R.e(getViewLifecycleOwner(), new g(this, 1));
        P().f33396T.e(getViewLifecycleOwner(), new com.voltasit.obdeleven.presentation.controlUnit.kwp.coding.h(this, 1));
        P().f33398V.e(getViewLifecycleOwner(), new com.voltasit.obdeleven.presentation.controlUnit.kwp.coding.i(this, 1));
        P().f33400X.e(getViewLifecycleOwner(), new j(this, 1));
        P().f33402Z.e(getViewLifecycleOwner(), new k(this, 3));
        P().f33404b0.e(getViewLifecycleOwner(), new com.voltasit.obdeleven.presentation.controlUnit.kwp.coding.l(this, 4));
        P().f33408f0.e(getViewLifecycleOwner(), new a(new l<E, r>() { // from class: com.voltasit.obdeleven.presentation.vehicle.VehicleBaseFragment$setupNavigation$8
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xa.g] */
            @Override // Ia.l
            public final r invoke(E e10) {
                VehicleBaseFragment vehicleBaseFragment = this.this$0;
                MultiBackupDialog multiBackupDialog = vehicleBaseFragment.f33371o;
                if (multiBackupDialog == null || !multiBackupDialog.isVisible()) {
                    ((VagProRedirectPromoPresenter) vehicleBaseFragment.f33374r.getValue()).a(vehicleBaseFragment, new p(2, vehicleBaseFragment));
                }
                return r.f47939a;
            }
        }));
        P().f33392P.e(getViewLifecycleOwner(), new com.voltasit.obdeleven.presentation.controlUnit.kwp.livedata.a(this, 5));
        P().f33406d0.e(getViewLifecycleOwner(), new com.voltasit.obdeleven.presentation.garage.g(this, 2));
        P().f33410h0.e(getViewLifecycleOwner(), new C0828b(this, 3));
        z(P());
    }

    public final D0 O() {
        D0 d10 = this.f33372p;
        if (d10 != null) {
            return d10;
        }
        i.m("binding");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    public final VehicleViewModel P() {
        return (VehicleViewModel) this.f33375s.getValue();
    }

    public abstract boolean Q();

    public final void R(E vehicleDb, boolean z10, boolean z11) {
        i.e(vehicleDb, "vehicleDb");
        Bundle bundle = new Bundle();
        bundle.putParcelable("vehicle", vehicleDb);
        bundle.putBoolean("is_from_start", z10);
        bundle.putBoolean("disable_picture_change", z11);
        setArguments(bundle);
    }

    public abstract void S();

    @Override // com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String dialogId, DialogCallback.CallbackType callbackType, Bundle data) {
        i.e(dialogId, "dialogId");
        i.e(data, "data");
        if (dialogId.equals("MultiBackupDialog") && callbackType == DialogCallback.CallbackType.f31104e) {
            MultiBackupDialog multiBackupDialog = this.f33371o;
            if (multiBackupDialog != null) {
                multiBackupDialog.y();
                this.f33371o = null;
            }
            p279w9.b bVar = Application.f29634b;
            P8.c.a(6, o(), "Multi backup dialog error", Arrays.copyOf(new Object[0], 0));
            if (y()) {
                return;
            }
            P.b(requireActivity(), R.string.snackbar_unknown_exception);
        }
    }

    @Override // O8.c
    public final List<View> h() {
        D0 d0O = O();
        D0 d0O2 = O();
        D0 d0O3 = O();
        D0 d0O4 = O();
        D0 d0O5 = O();
        D0 d0O6 = O();
        D0 d0O7 = O();
        return kotlin.collections.l.s(d0O.f1643D, d0O2.f1641B, d0O3.f1648r, d0O4.f1640A, d0O5.f1644E, d0O6.f1651u, d0O7.f1656z, O().f1649s);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        y yVar = this.f33370n;
        if (yVar == null) {
            i.m("imageCropHelper");
            throw null;
        }
        if (yVar.a(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f33370n = new y(this);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        MultiBackupDialog multiBackupDialog = this.f33371o;
        if (multiBackupDialog != null) {
            i.b(multiBackupDialog);
            multiBackupDialog.y();
            this.f33371o = null;
        }
        P().f32113b.j(PreloaderState.d.f32643a);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        p279w9.b bVar = Application.f29634b;
        p279w9.b bVar2 = Application.f29634b;
        synchronized (bVar2) {
            bVar2.f47824a.remove("VEHICLE_FRAGMENT");
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (q().E() && isVisible()) {
            p279w9.b bVar = Application.f29634b;
            synchronized (bVar) {
                bVar.f47824a.put("VEHICLE_FRAGMENT", new w9.b.a(this, 31536000000L));
            }
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final int p() {
        return this.f33368l;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final Positionable$Position t() {
        return Positionable$Position.f31106b;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        String string = getString(R.string.common_my_car);
        i.d(string, "getString(...)");
        return string;
    }
}
