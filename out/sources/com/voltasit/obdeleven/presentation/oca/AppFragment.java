package com.voltasit.obdeleven.presentation.oca;

import B8.E0;
import B8.S;
import G8.C0700b;
import G8.C0706h;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.SpinnerAdapter;
import androidx.fragment.app.ActivityC1347l;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1377u;
import androidx.lifecycle.D;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import com.obdeleven.service.exception.OBDelevenException;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.app.C2098m;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.interfaces.Positionable$Transition;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.C2137c;
import com.voltasit.obdeleven.ui.dialogs.I0;
import com.voltasit.obdeleven.ui.dialogs.T;
import com.voltasit.obdeleven.ui.dialogs.fakeadapty.BuyCreditsDialog;
import com.voltasit.obdeleven.ui.dialogs.fakeadapty.UltimateUpsellDialog;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import com.voltasit.obdeleven.ui.view.AppSpinnerDropDown;
import com.voltasit.obdeleven.utils.CreditUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.q;
import kotlin.jvm.internal.Lambda;
import kotlin.text.n;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import org.koin.androidx.viewmodel.scope.ScopeExtKt;
import p110i9.u;
import p220r9.P;
import p255u9.E;
import p293xa.r;

/* JADX INFO: compiled from: AppFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AppFragment extends BaseFragment<S> implements DialogCallback {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public T f32674m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f32675n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public E f32676o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public I0 f32678q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f32679r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public S f32680s;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f32673l = R.layout.fragment_app;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f32677p = new ArrayList();

    /* JADX INFO: compiled from: AppFragment.kt */
    public static final class a implements D, kotlin.jvm.internal.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lambda f32681b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Ia.l lVar) {
            this.f32681b = (Lambda) lVar;
        }

        @Override // kotlin.jvm.internal.f
        public final p293xa.e<?> b() {
            return this.f32681b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        @Override // androidx.lifecycle.D
        public final /* synthetic */ void d(Object obj) {
            this.f32681b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof D) || !(obj instanceof kotlin.jvm.internal.f)) {
                return false;
            }
            return this.f32681b.equals(((kotlin.jvm.internal.f) obj).b());
        }

        public final int hashCode() {
            return this.f32681b.hashCode();
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.voltasit.obdeleven.presentation.oca.AppFragment$special$$inlined$stateViewModel$default$1] */
    public AppFragment() {
        final Ia.a<Ob.a> aVar = new Ia.a<Ob.a>() { // from class: com.voltasit.obdeleven.presentation.oca.AppFragment$ocaViewModel$2
            {
                super(0);
            }

            @Override // Ia.a
            public final Ob.a invoke() {
                Bundle arguments = this.this$0.getArguments();
                String string = arguments != null ? arguments.getString("key_app_id", "") : null;
                if (string == null) {
                    string = "";
                }
                E e10 = this.this$0.f32676o;
                String objectId = e10 != null ? e10.getObjectId() : null;
                return I.e.j(string, objectId != null ? objectId : "", Boolean.valueOf(this.this$0.f32675n));
            }
        };
        final Ia.a<Bundle> aVarA = ScopeExtKt.a();
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.presentation.oca.AppFragment$special$$inlined$stateViewModel$default$1
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
        this.f32679r = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<k>(this) { // from class: com.voltasit.obdeleven.presentation.oca.AppFragment$special$$inlined$stateViewModel$default$2
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Fragment $this_stateViewModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_stateViewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.oca.k] */
            @Override // Ia.a
            public final k invoke() {
                Fragment fragment = this.$this_stateViewModel;
                Pb.a aVar2 = this.$qualifier;
                Ia.a aVar3 = aVarA;
                Ia.a aVar4 = r10;
                Ia.a aVar5 = aVar;
                b0 viewModelStore = ((c0) aVar4.invoke()).getViewModelStore();
                p014b1.a aVarA2 = Hb.a.a((Bundle) aVar3.invoke(), fragment);
                if (aVarA2 == null) {
                    aVarA2 = fragment.getDefaultViewModelCreationExtras();
                    kotlin.jvm.internal.i.d(aVarA2, "<get-defaultViewModelCreationExtras>(...)");
                }
                return Gb.a.a(kotlin.jvm.internal.l.a(k.class), viewModelStore, null, aVarA2, aVar2, Cb.a.i(fragment), aVar5);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void O(AppFragment appFragment, int i10, boolean z10) {
        I8.a aVar = (I8.a) appFragment.P().f32727M.d();
        if (aVar == null) {
            return;
        }
        ArrayList<C0700b> translations = appFragment.f32677p;
        kotlin.jvm.internal.i.e(translations, "translations");
        ArrayList arrayList = new ArrayList(aVar.f3909i);
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            for (C0700b c0700b : translations) {
                if (kotlin.jvm.internal.i.a(c0700b.f3444c, "value" + i11) && kotlin.jvm.internal.i.a(c0700b.f3442a, aVar.f3901a)) {
                    arrayList.set(i11, c0700b.f3445d);
                }
            }
        }
        ArrayList arrayListP0 = q.p0(arrayList);
        C2098m c2098m = appFragment.P().f32734R;
        if (c2098m != null && c2098m.f30123h) {
            String string = appFragment.getString(R.string.view_app_original_value);
            kotlin.jvm.internal.i.d(string, "getString(...)");
            arrayListP0.add(0, string);
        }
        S s10 = appFragment.f32680s;
        if (s10 == null) {
            kotlin.jvm.internal.i.m("binding");
            throw null;
        }
        s10.f1803x.setVisibility(0);
        S s11 = appFragment.f32680s;
        if (s11 == null) {
            kotlin.jvm.internal.i.m("binding");
            throw null;
        }
        s11.f1803x.setItems(arrayListP0);
        if (!z10) {
            S s12 = appFragment.f32680s;
            if (s12 != null) {
                s12.f1803x.setSelection(i10);
                return;
            } else {
                kotlin.jvm.internal.i.m("binding");
                throw null;
            }
        }
        S s13 = appFragment.f32680s;
        if (s13 == null) {
            kotlin.jvm.internal.i.m("binding");
            throw null;
        }
        AppSpinnerDropDown appSpinnerDropDown = s13.f1803x;
        appSpinnerDropDown.setSelection(appSpinnerDropDown.getCount() - 1);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final boolean A() {
        T t8 = this.f32674m;
        if (t8 != null) {
            kotlin.jvm.internal.i.b(t8);
            t8.y();
            this.f32674m = null;
            P().i(2);
        }
        return super.A();
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final void C(M0.h hVar) {
        S s10 = (S) hVar;
        this.f32680s = s10;
        s10.t(P());
        Bundle arguments = getArguments();
        if ((arguments != null ? arguments.getString("key_app_id") : null) == null) {
            O.e.D("AppFragment", "AppFragment does not contain app id parameter");
            MainActivity mainActivityQ = q();
            P.a(mainActivityQ, mainActivityQ.getString(R.string.common_something_went_wrong));
            r().h();
        }
        if (q().E()) {
            s10.f1801v.setMaxHeight(q().f33570z);
        }
        Bundle arguments2 = getArguments();
        this.f34087g.e("AppFragment", androidx.compose.foundation.gestures.d.b("OCA_OPEN(", arguments2 != null ? arguments2.getString("key_app_id") : null, ")"));
        P().f32722J0.e(getViewLifecycleOwner(), new a(new Ia.l<Integer, r>() { // from class: com.voltasit.obdeleven.presentation.oca.AppFragment$setupObservers$1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Integer num) {
                Integer num2 = num;
                com.voltasit.obdeleven.presentation.dialogs.i iVar = new com.voltasit.obdeleven.presentation.dialogs.i();
                kotlin.jvm.internal.i.b(num2);
                iVar.w(num2.intValue());
                iVar.v(this.this$0.getChildFragmentManager(), "SfdRateLimitDialog");
                return r.f47939a;
            }
        }));
        P().f32726L0.e(getViewLifecycleOwner(), new a(new Ia.l<r, r>() { // from class: com.voltasit.obdeleven.presentation.oca.AppFragment$setupObservers$2
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                final AppFragment appFragment = this.this$0;
                new com.voltasit.obdeleven.presentation.dialogs.d(new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.oca.AppFragment$setupObservers$2.1
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        k kVarP = appFragment.P();
                        kVarP.getClass();
                        C2680e.c(Z.a(kVarP), null, null, new OcaViewModel$showUltimateUpsellDialog$1(kVarP, null), 3);
                        return r.f47939a;
                    }
                }).v(this.this$0.getChildFragmentManager(), "FairUsePolicyBreachDialog");
                return r.f47939a;
            }
        }));
        P().f32730N0.e(getViewLifecycleOwner(), new a(new Ia.l<List<? extends C0706h>, r>() { // from class: com.voltasit.obdeleven.presentation.oca.AppFragment$setupObservers$3
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(List<? extends C0706h> list) {
                List<? extends C0706h> list2 = list;
                kotlin.jvm.internal.i.b(list2);
                final AppFragment appFragment = this.this$0;
                new UltimateUpsellDialog(list2, new Ia.l<C0706h, r>() { // from class: com.voltasit.obdeleven.presentation.oca.AppFragment$setupObservers$3.1
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(C0706h c0706h) {
                        C0706h product = c0706h;
                        kotlin.jvm.internal.i.e(product, "product");
                        k kVarP = appFragment.P();
                        ActivityC1347l activityC1347lRequireActivity = appFragment.requireActivity();
                        kotlin.jvm.internal.i.d(activityC1347lRequireActivity, "requireActivity(...)");
                        kVarP.f(activityC1347lRequireActivity, product);
                        return r.f47939a;
                    }
                }).v(this.this$0.getChildFragmentManager(), "UltimateUpsellDialog");
                return r.f47939a;
            }
        }));
        P().f32754l0.e(getViewLifecycleOwner(), new a(new Ia.l<Integer, r>() { // from class: com.voltasit.obdeleven.presentation.oca.AppFragment$setupObservers$4
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Integer num) {
                final Integer num2 = num;
                Task<Boolean> taskB = C2137c.b(this.this$0.q(), R.string.common_check_ignition, R.string.common_try_again, R.string.common_cancel);
                final AppFragment appFragment = this.this$0;
                taskB.continueWith(new Continuation() { // from class: com.voltasit.obdeleven.presentation.oca.g
                    @Override // com.parse.boltsinternal.Continuation
                    public final Object then(Task task1) {
                        AppFragment this$0 = appFragment;
                        kotlin.jvm.internal.i.e(this$0, "this$0");
                        kotlin.jvm.internal.i.e(task1, "task1");
                        Object result = task1.getResult();
                        kotlin.jvm.internal.i.d(result, "getResult(...)");
                        if (((Boolean) result).booleanValue()) {
                            O.e.j("AppFragment", "Trying again");
                            Integer num3 = num2;
                            kotlin.jvm.internal.i.b(num3);
                            int iIntValue = num3.intValue();
                            int i10 = this$0.P().f32735S;
                            k kVarP = this$0.P();
                            C2098m c2098m = this$0.P().f32734R;
                            kotlin.jvm.internal.i.b(c2098m);
                            E e10 = this$0.f32676o;
                            kotlin.jvm.internal.i.b(e10);
                            kVarP.getClass();
                            C2680e.c(Z.a(kVarP), kVarP.f32112a, null, new OcaViewModel$writeValue$1(kVarP, iIntValue, i10, c2098m, e10, null), 2);
                        }
                        return null;
                    }
                }, Task.UI_THREAD_EXECUTOR);
                return r.f47939a;
            }
        }));
        P().f32756n0.e(getViewLifecycleOwner(), new a(new Ia.l<r, r>() { // from class: com.voltasit.obdeleven.presentation.oca.AppFragment$setupObservers$5
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                C2137c.b(this.this$0.q(), R.string.common_check_ignition, R.string.common_try_again, R.string.common_cancel).continueWith(new h(this.this$0), Task.UI_THREAD_EXECUTOR);
                return r.f47939a;
            }
        }));
        P().f32752j0.e(getViewLifecycleOwner(), new a(new Ia.l<r, r>() { // from class: com.voltasit.obdeleven.presentation.oca.AppFragment$setupObservers$6
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ia.l
            public final r invoke(r rVar) {
                String str;
                String str2;
                String str3;
                String str4;
                AppFragment appFragment = this.this$0;
                I8.a aVar = (I8.a) appFragment.P().f32727M.d();
                if (aVar != null) {
                    ArrayList translationDBS = appFragment.f32677p;
                    kotlin.jvm.internal.i.e(translationDBS, "translationDBS");
                    Iterator it = translationDBS.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        str = aVar.f3903c;
                        str2 = aVar.f3901a;
                        if (!zHasNext) {
                            str3 = str;
                            break;
                        }
                        C0700b c0700b = (C0700b) it.next();
                        if ("name".equals(c0700b.f3444c) && kotlin.jvm.internal.i.a(c0700b.f3442a, str2)) {
                            str3 = c0700b.f3445d;
                            break;
                        }
                    }
                    if (str3.length() != 0) {
                        str = str3;
                    }
                    S s11 = appFragment.f32680s;
                    if (s11 == null) {
                        kotlin.jvm.internal.i.m("binding");
                        throw null;
                    }
                    s11.f1802w.setText(str);
                    if (appFragment.P().g() || !aVar.j) {
                        S s12 = appFragment.f32680s;
                        if (s12 == null) {
                            kotlin.jvm.internal.i.m("binding");
                            throw null;
                        }
                        s12.f1797r.setVisibility(8);
                    } else {
                        S s13 = appFragment.f32680s;
                        if (s13 == null) {
                            kotlin.jvm.internal.i.m("binding");
                            throw null;
                        }
                        s13.f1799t.setText(String.format(Locale.getDefault(), "%d", Arrays.copyOf(new Object[]{Integer.valueOf(aVar.f3905e)}, 1)));
                    }
                    S s14 = appFragment.f32680s;
                    if (s14 == null) {
                        kotlin.jvm.internal.i.m("binding");
                        throw null;
                    }
                    AppSpinnerDropDown appSpinnerDropDown = s14.f1803x;
                    appSpinnerDropDown.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(appSpinnerDropDown.f34140k);
                    u uVar = new u(appSpinnerDropDown.getContext(), android.R.layout.simple_spinner_dropdown_item, arrayList);
                    appSpinnerDropDown.f34141l = uVar;
                    uVar.setDropDownViewResource(R.layout.item_dropdown);
                    appSpinnerDropDown.setAdapter((SpinnerAdapter) appSpinnerDropDown.f34141l);
                    ArrayList translations = appFragment.f32677p;
                    kotlin.jvm.internal.i.e(translations, "translations");
                    Iterator it2 = translations.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            str4 = aVar.f3904d;
                            break;
                        }
                        C0700b c0700b2 = (C0700b) it2.next();
                        if ("desc".equals(c0700b2.f3444c) && kotlin.jvm.internal.i.a(c0700b2.f3442a, str2)) {
                            str4 = c0700b2.f3445d;
                            break;
                        }
                    }
                    S s15 = appFragment.f32680s;
                    if (s15 == null) {
                        kotlin.jvm.internal.i.m("binding");
                        throw null;
                    }
                    s15.f1800u.setText(str4);
                    com.bumptech.glide.d<Drawable> dVarM = com.bumptech.glide.b.c(appFragment.getContext()).f(appFragment).m(aVar.f3906f);
                    T3.d dVarJ = ((T3.d) E0.a(R.drawable.app_default)).f(R.drawable.app_default).j(R.drawable.app_default);
                    kotlin.jvm.internal.i.d(dVarJ, "placeholder(...)");
                    com.bumptech.glide.d<Drawable> dVarA = dVarM.a(dVarJ);
                    S s16 = appFragment.f32680s;
                    if (s16 == null) {
                        kotlin.jvm.internal.i.m("binding");
                        throw null;
                    }
                    dVarA.x(s16.f1801v);
                    String str5 = aVar.f3907g;
                    if (!n.S(str5)) {
                        S s17 = appFragment.f32680s;
                        if (s17 == null) {
                            kotlin.jvm.internal.i.m("binding");
                            throw null;
                        }
                        s17.f1804y.setVisibility(0);
                        S s18 = appFragment.f32680s;
                        if (s18 == null) {
                            kotlin.jvm.internal.i.m("binding");
                            throw null;
                        }
                        s18.f1804y.setOnClickListener(new c(appFragment, 0, str5));
                    }
                    k kVarP = appFragment.P();
                    kVarP.getClass();
                    C2680e.c(Z.a(kVarP), kVarP.f32112a, null, new OcaViewModel$downloadOriginalValues$1(kVarP, null), 2);
                }
                return r.f47939a;
            }
        }));
        P().f32750h0.e(getViewLifecycleOwner(), new a(new Ia.l<r, r>() { // from class: com.voltasit.obdeleven.presentation.oca.AppFragment$setupObservers$7
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                new com.voltasit.obdeleven.presentation.dialogs.f(0).J(this.this$0);
                return r.f47939a;
            }
        }));
        P().f32748f0.e(getViewLifecycleOwner(), new a(new Ia.l<r, r>() { // from class: com.voltasit.obdeleven.presentation.oca.AppFragment$setupObservers$8
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                S s11 = this.this$0.f32680s;
                if (s11 == null) {
                    kotlin.jvm.internal.i.m("binding");
                    throw null;
                }
                int selectedItemPosition = s11.f1803x.getSelectedItemPosition();
                AppFragment appFragment = this.this$0;
                int i10 = appFragment.P().f32735S;
                k kVarP = appFragment.P();
                C2098m c2098m = appFragment.P().f32734R;
                kotlin.jvm.internal.i.b(c2098m);
                E e10 = appFragment.f32676o;
                kotlin.jvm.internal.i.b(e10);
                kVarP.getClass();
                C2680e.c(Z.a(kVarP), kVarP.f32112a, null, new OcaViewModel$writeValue$1(kVarP, selectedItemPosition, i10, c2098m, e10, null), 2);
                return r.f47939a;
            }
        }));
        P().f32738V.e(getViewLifecycleOwner(), new a(new Ia.l<Integer, r>() { // from class: com.voltasit.obdeleven.presentation.oca.AppFragment$setupObservers$9
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Integer num) {
                Integer num2 = num;
                k kVarP = this.this$0.P();
                kotlin.jvm.internal.i.b(num2);
                kVarP.f32735S = num2.intValue();
                return r.f47939a;
            }
        }));
        P().f32710D0.e(getViewLifecycleOwner(), new a(new Ia.l<r, r>() { // from class: com.voltasit.obdeleven.presentation.oca.AppFragment$setupObservers$10
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                Context contextRequireContext = this.this$0.requireContext();
                kotlin.jvm.internal.i.d(contextRequireContext, "requireContext(...)");
                new com.voltasit.obdeleven.presentation.dialogs.k(contextRequireContext).show();
                return r.f47939a;
            }
        }));
        P().f32760p0.e(getViewLifecycleOwner(), new a(new Ia.l<r, r>() { // from class: com.voltasit.obdeleven.presentation.oca.AppFragment$setupObservers$11
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                final AppFragment appFragment = this.this$0;
                appFragment.getClass();
                appFragment.K(new Ia.l<DialogInterface, r>() { // from class: com.voltasit.obdeleven.presentation.oca.AppFragment$showTryAgainDialog$1
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(DialogInterface dialogInterface) {
                        DialogInterface it = dialogInterface;
                        kotlin.jvm.internal.i.e(it, "it");
                        it.dismiss();
                        appFragment.r().h();
                        return r.f47939a;
                    }
                }, new Ia.l<DialogInterface, r>() { // from class: com.voltasit.obdeleven.presentation.oca.AppFragment$showTryAgainDialog$2
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(DialogInterface dialogInterface) {
                        DialogInterface it = dialogInterface;
                        kotlin.jvm.internal.i.e(it, "it");
                        it.dismiss();
                        k kVarP = appFragment.P();
                        kVarP.getClass();
                        C2680e.c(Z.a(kVarP), kVarP.f32112a, null, new OcaViewModel$getUserDetails$1(kVarP, null), 2);
                        return r.f47939a;
                    }
                });
                return r.f47939a;
            }
        }));
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AppFragment$setupObservers$12(this, null), P().f32764r0);
        InterfaceC1376t viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.i.d(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C2688e.l(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, C1377u.a(viewLifecycleOwner));
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$2 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AppFragment$setupObservers$13(this, null), P().f32768t0);
        InterfaceC1376t viewLifecycleOwner2 = getViewLifecycleOwner();
        kotlin.jvm.internal.i.d(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C2688e.l(flowKt__TransformKt$onEach$$inlined$unsafeTransform$2, C1377u.a(viewLifecycleOwner2));
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$3 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AppFragment$setupObservers$14(this, null), P().v0);
        InterfaceC1376t viewLifecycleOwner3 = getViewLifecycleOwner();
        kotlin.jvm.internal.i.d(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C2688e.l(flowKt__TransformKt$onEach$$inlined$unsafeTransform$3, C1377u.a(viewLifecycleOwner3));
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$4 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AppFragment$setupObservers$15(this, null), P().f32775x0);
        InterfaceC1376t viewLifecycleOwner4 = getViewLifecycleOwner();
        kotlin.jvm.internal.i.d(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C2688e.l(flowKt__TransformKt$onEach$$inlined$unsafeTransform$4, C1377u.a(viewLifecycleOwner4));
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$5 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AppFragment$setupObservers$16(this, null), P().f32779z0);
        InterfaceC1376t viewLifecycleOwner5 = getViewLifecycleOwner();
        kotlin.jvm.internal.i.d(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        C2688e.l(flowKt__TransformKt$onEach$$inlined$unsafeTransform$5, C1377u.a(viewLifecycleOwner5));
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$6 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AppFragment$setupObservers$17(this, null), P().f32714F0);
        InterfaceC1376t viewLifecycleOwner6 = getViewLifecycleOwner();
        kotlin.jvm.internal.i.d(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
        C2688e.l(flowKt__TransformKt$onEach$$inlined$unsafeTransform$6, C1377u.a(viewLifecycleOwner6));
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$7 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AppFragment$setupObservers$18(this, null), P().f32718H0);
        InterfaceC1376t viewLifecycleOwner7 = getViewLifecycleOwner();
        kotlin.jvm.internal.i.d(viewLifecycleOwner7, "getViewLifecycleOwner(...)");
        C2688e.l(flowKt__TransformKt$onEach$$inlined$unsafeTransform$7, C1377u.a(viewLifecycleOwner7));
        P().f32742Z.e(getViewLifecycleOwner(), new a(new Ia.l<k.a, r>() { // from class: com.voltasit.obdeleven.presentation.oca.AppFragment$observeNegativeSnackbar$1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(k.a aVar) {
                k.a aVar2 = aVar;
                if (aVar2 instanceof k.a.C0339a) {
                    this.this$0.F(((k.a.C0339a) aVar2).f32780a);
                } else {
                    this.this$0.E(R.string.common_check_network_try_again);
                }
                r rVar = r.f47939a;
                Na.i iVar = E8.a.f3126a;
                return r.f47939a;
            }
        }));
        P().f32746d0.e(getViewLifecycleOwner(), new a(new Ia.l<r, r>() { // from class: com.voltasit.obdeleven.presentation.oca.AppFragment$observePurchaseComplete$1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                this.this$0.P().i(2);
                this.this$0.Q();
                return r.f47939a;
            }
        }));
        getParentFragmentManager().b0("SfdWizardFullScreenDialog", this, new androidx.fragment.app.E() { // from class: com.voltasit.obdeleven.presentation.oca.d
            @Override // androidx.fragment.app.E
            public final void h(Bundle bundle, String str) {
                AppFragment this$0 = this.f32688b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                k kVarP = this$0.P();
                kVarP.getClass();
                C2680e.c(Z.a(kVarP), kVarP.f32112a, null, new OcaViewModel$onSfdWizardComplete$1(kVarP, null), 2);
            }
        });
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$8 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AppFragment$setupSfdWizard$2(this, null), P().f32706B0);
        InterfaceC1376t viewLifecycleOwner8 = getViewLifecycleOwner();
        kotlin.jvm.internal.i.d(viewLifecycleOwner8, "getViewLifecycleOwner(...)");
        C2688e.l(flowKt__TransformKt$onEach$$inlined$unsafeTransform$8, C1377u.a(viewLifecycleOwner8));
        P().f32740X.e(getViewLifecycleOwner(), new a(new Ia.l<String, r>() { // from class: com.voltasit.obdeleven.presentation.oca.AppFragment$setupNavigation$1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(String str) {
                this.this$0.r().g(str);
                return r.f47939a;
            }
        }));
        P().f32744b0.e(getViewLifecycleOwner(), new a(new Ia.l<List<? extends C0706h>, r>() { // from class: com.voltasit.obdeleven.presentation.oca.AppFragment$setupNavigation$2
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(List<? extends C0706h> list) {
                List<? extends C0706h> list2 = list;
                final AppFragment appFragment = this.this$0;
                if (((J8.u) kotlin.a.b(LazyThreadSafetyMode.f42971b, new Ia.a<J8.u>() { // from class: com.voltasit.obdeleven.presentation.oca.AppFragment$setupNavigation$2$invoke$$inlined$inject$default$1
                    final /* synthetic */ Pb.a $qualifier = null;
                    final /* synthetic */ Ia.a $parameters = null;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v2, types: [J8.u, java.lang.Object] */
                    @Override // Ia.a
                    public final J8.u invoke() {
                        ComponentCallbacks componentCallbacks = appFragment;
                        Pb.a aVar = this.$qualifier;
                        return Cb.a.i(componentCallbacks).a(this.$parameters, aVar, kotlin.jvm.internal.l.a(J8.u.class));
                    }
                }).getValue()).l()) {
                    kotlin.jvm.internal.i.b(list2);
                    final AppFragment appFragment2 = this.this$0;
                    new BuyCreditsDialog(list2, new Ia.l<C0706h, r>() { // from class: com.voltasit.obdeleven.presentation.oca.AppFragment$setupNavigation$2.1
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(C0706h c0706h) {
                            C0706h product = c0706h;
                            kotlin.jvm.internal.i.e(product, "product");
                            k kVarP = appFragment2.P();
                            ActivityC1347l activityC1347lRequireActivity = appFragment2.requireActivity();
                            kotlin.jvm.internal.i.d(activityC1347lRequireActivity, "requireActivity(...)");
                            kVarP.f(activityC1347lRequireActivity, product);
                            return r.f47939a;
                        }
                    }).v(this.this$0.getChildFragmentManager(), "BuyCreditsDialog");
                } else {
                    ArrayList arrayList = CreditUtils.f34225a;
                    kotlin.jvm.internal.i.b(list2);
                    T tA = CreditUtils.a(list2, this.this$0);
                    this.this$0.f32674m = tA;
                    kotlin.jvm.internal.i.b(tA);
                    tA.A();
                }
                return r.f47939a;
            }
        }));
        z(P());
        k kVarP = P();
        kVarP.getClass();
        C2680e.c(Z.a(kVarP), kVarP.f32112a, null, new OcaViewModel$onCreateView$1(kVarP, null), 2);
        k kVarP2 = P();
        kVarP2.getClass();
        C2680e.c(Z.a(kVarP2), kVarP2.f32112a, null, new OcaViewModel$getUserDetails$1(kVarP2, null), 2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    public final k P() {
        return (k) this.f32679r.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q() {
        Task taskForResult;
        if (((I8.a) P().f32727M.d()) == null) {
            return;
        }
        O.e.s("AppFragment", "writeIfValid()");
        S s10 = this.f32680s;
        if (s10 == null) {
            kotlin.jvm.internal.i.m("binding");
            throw null;
        }
        int selectedItemPosition = s10.f1803x.getSelectedItemPosition();
        S s11 = this.f32680s;
        if (s11 == null) {
            kotlin.jvm.internal.i.m("binding");
            throw null;
        }
        boolean z10 = s11.f1803x.getCount() == 1;
        if (!z10) {
            S s12 = this.f32680s;
            if (s12 == null) {
                kotlin.jvm.internal.i.m("binding");
                throw null;
            }
            if (selectedItemPosition == s12.f1803x.getCount() - 1) {
                P.a(q(), getString(R.string.common_select_value));
                return;
            }
        }
        if (!z10 && selectedItemPosition == P().f32735S) {
            MainActivity mainActivityQ = q();
            P.a(mainActivityQ, mainActivityQ.getString(R.string.common_value_not_changed));
            return;
        }
        P().i(1);
        try {
            com.voltasit.obdeleven.utils.bluetooth.n nVar = W7.c.f7066d;
            if (nVar == null) {
                throw new OBDelevenException(0);
            }
            taskForResult = nVar.g().continueWith(new b(0, this), Task.UI_THREAD_EXECUTOR);
            kotlin.jvm.internal.i.b(taskForResult);
            taskForResult.continueWithTask(new Continuation() { // from class: com.voltasit.obdeleven.presentation.oca.a
                @Override // com.parse.boltsinternal.Continuation
                public final Object then(Task task1) {
                    AppFragment this$0 = this.f32682a;
                    kotlin.jvm.internal.i.e(this$0, "this$0");
                    kotlin.jvm.internal.i.e(task1, "task1");
                    Object result = task1.getResult();
                    kotlin.jvm.internal.i.d(result, "getResult(...)");
                    if (((Boolean) result).booleanValue()) {
                        k kVarP = this$0.P();
                        kVarP.getClass();
                        C2680e.c(Z.a(kVarP), kVarP.f32112a, null, new OcaViewModel$checkPopTheHoodAndStartWrite$1(kVarP, null), 2);
                    }
                    return task1;
                }
            }, Task.UI_THREAD_EXECUTOR);
        } catch (OBDelevenException unused) {
            P().i(4);
            taskForResult = Task.forResult(Boolean.FALSE);
            kotlin.jvm.internal.i.b(taskForResult);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String dialogId, DialogCallback.CallbackType callbackType, Bundle data) {
        kotlin.jvm.internal.i.e(dialogId, "dialogId");
        kotlin.jvm.internal.i.e(data, "data");
        switch (dialogId.hashCode()) {
            case -1828132316:
                if (dialogId.equals("PopTheHoodDialog") && callbackType == DialogCallback.CallbackType.f31102c) {
                    Q();
                    break;
                }
                break;
            case -90289644:
                if (dialogId.equals("tag_download_values")) {
                    if (callbackType != DialogCallback.CallbackType.f31102c) {
                        r().h();
                    } else {
                        k kVarP = P();
                        kVarP.getClass();
                        C2680e.c(Z.a(kVarP), kVarP.f32112a, null, new OcaViewModel$downloadOriginalValues$1(kVarP, null), 2);
                    }
                    break;
                }
                break;
            case 852671290:
                if (dialogId.equals("tag_unable_to_save")) {
                    if (callbackType != DialogCallback.CallbackType.f31102c) {
                        r().h();
                    } else {
                        P().h();
                    }
                    break;
                }
                break;
            case 1355365788:
                if (dialogId.equals("buyCreditsDialog") && callbackType == DialogCallback.CallbackType.f31102c) {
                    T t8 = this.f32674m;
                    if (t8 != null) {
                        t8.y();
                        this.f32674m = null;
                    }
                    int i10 = data.getInt("key_selected_item", -1);
                    ArrayList arrayList = CreditUtils.f34226b;
                    kotlin.jvm.internal.i.b(arrayList);
                    C0706h c0706h = (C0706h) arrayList.get(i10);
                    k kVarP2 = P();
                    ActivityC1347l activityC1347lRequireActivity = requireActivity();
                    kotlin.jvm.internal.i.d(activityC1347lRequireActivity, "requireActivity(...)");
                    kVarP2.f(activityC1347lRequireActivity, c0706h);
                }
                break;
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "AppFragment";
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        w();
        I0 i10 = this.f32678q;
        if (i10 != null) {
            i10.y();
        }
        this.f32678q = null;
        S s10 = this.f32680s;
        if (s10 != null) {
            s10.f1798s.setOnClickListener(null);
            S s11 = this.f32680s;
            if (s11 != null) {
                s11.f1798s.setOnLongClickListener(null);
            } else {
                kotlin.jvm.internal.i.m("binding");
                throw null;
            }
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final int p() {
        return this.f32673l;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final Positionable$Transition s() {
        return Positionable$Transition.f31110b;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        String string = getString(R.string.common_apps);
        kotlin.jvm.internal.i.d(string, "getString(...)");
        return string;
    }
}
