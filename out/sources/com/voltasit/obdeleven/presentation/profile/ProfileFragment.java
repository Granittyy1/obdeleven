package com.voltasit.obdeleven.presentation.profile;

import B8.AbstractC0620c1;
import B8.AbstractC0634j0;
import B8.E0;
import B8.i1;
import C4.v;
import G8.C0706h;
import J8.u;
import Z3.C0835a;
import Z3.o;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.ComponentCallbacks;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.ActivityC1347l;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1377u;
import androidx.lifecycle.D;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import com.facebook.FacebookException;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.login.w;
import com.facebook.login.y;
import com.google.android.gms.internal.measurement.M1;
import com.google.android.material.imageview.ShapeableImageView;
import com.parse.ParseException;
import com.parse.ParseFile;
import com.parse.ParseUser;
import com.parse.SaveCallback;
import com.voltas.crop.CropImageActivity;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.models.Screen;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.interfaces.Positionable$Position;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import com.voltasit.obdeleven.presentation.pro.BaseProFragment;
import com.voltasit.obdeleven.presentation.pro.ProViewModel;
import com.voltasit.obdeleven.presentation.twofactorauth.verify.TwoFactorAuthVerifyFragment;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.C2172u;
import com.voltasit.obdeleven.ui.dialogs.C2174v;
import com.voltasit.obdeleven.ui.dialogs.ChangePasswordDialog;
import com.voltasit.obdeleven.ui.dialogs.M;
import com.voltasit.obdeleven.ui.dialogs.T;
import com.voltasit.obdeleven.ui.dialogs.fakeadapty.BuyCreditsDialog;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import com.voltasit.obdeleven.utils.CreditUtils;
import com.voltasit.obdeleven.utils.NavigationManager;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import kotlin.text.n;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import p220r9.C;
import p220r9.J;
import p220r9.P;
import p255u9.z;
import p293xa.r;

/* JADX INFO: compiled from: ProfileFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ProfileFragment extends BaseProFragment<AbstractC0634j0> implements View.OnClickListener, CreditUtils.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public T f32811A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f32812B;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f32813n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public T f32814o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public M f32815p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C2172u f32816q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ChangePasswordDialog f32817r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C2174v f32818s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public z f32819t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public AbstractC0634j0 f32820u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f32821v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f32822w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public View f32823x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CheckBox f32824y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final CallbackManagerImpl f32825z;

    /* JADX INFO: compiled from: ProfileFragment.kt */
    public static final class a implements D, kotlin.jvm.internal.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lambda f32826b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Ia.l lVar) {
            this.f32826b = (Lambda) lVar;
        }

        @Override // kotlin.jvm.internal.f
        public final p293xa.e<?> b() {
            return this.f32826b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        @Override // androidx.lifecycle.D
        public final /* synthetic */ void d(Object obj) {
            this.f32826b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof D) || !(obj instanceof kotlin.jvm.internal.f)) {
                return false;
            }
            return this.f32826b.equals(((kotlin.jvm.internal.f) obj).b());
        }

        public final int hashCode() {
            return this.f32826b.hashCode();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.voltasit.obdeleven.presentation.profile.ProfileFragment$special$$inlined$viewModel$default$1] */
    public ProfileFragment() {
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.presentation.profile.ProfileFragment$special$$inlined$viewModel$default$1
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
        this.f32813n = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<ProfileViewModel>(this) { // from class: com.voltasit.obdeleven.presentation.profile.ProfileFragment$special$$inlined$viewModel$default$2
            final /* synthetic */ Fragment $this_viewModel;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $extrasProducer = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.profile.ProfileViewModel] */
            @Override // Ia.a
            public final ProfileViewModel invoke() {
                p014b1.a defaultViewModelCreationExtras;
                Fragment fragment = this.$this_viewModel;
                Pb.a aVar = this.$qualifier;
                Ia.a aVar2 = r10;
                Ia.a aVar3 = this.$extrasProducer;
                Ia.a aVar4 = this.$parameters;
                b0 viewModelStore = ((c0) aVar2.invoke()).getViewModelStore();
                if (aVar3 == null || (defaultViewModelCreationExtras = (p014b1.a) aVar3.invoke()) == null) {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    kotlin.jvm.internal.i.d(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
                }
                return Gb.a.a(kotlin.jvm.internal.l.a(ProfileViewModel.class), viewModelStore, null, defaultViewModelCreationExtras, aVar, Cb.a.i(fragment), aVar4);
            }
        });
        this.f32821v = 6;
        this.f32825z = new CallbackManagerImpl();
        this.f32812B = R.layout.fragment_profile;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final void C(M0.h hVar) {
        AbstractC0634j0 abstractC0634j0 = (AbstractC0634j0) hVar;
        z(U());
        U().f32858e0.e(getViewLifecycleOwner(), new a(new Ia.l<String, r>() { // from class: com.voltasit.obdeleven.presentation.profile.ProfileFragment$setupObservables$1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(String str) {
                this.this$0.r().g(str);
                return r.f47939a;
            }
        }));
        U().f32856c0.e(getViewLifecycleOwner(), new a(new Ia.l<ProfileViewModel.b, r>() { // from class: com.voltasit.obdeleven.presentation.profile.ProfileFragment$setupObservables$2
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(ProfileViewModel.b bVar) {
                ProfileViewModel.b bVar2 = bVar;
                SubscriptionPurchaseDialog subscriptionPurchaseDialog = new SubscriptionPurchaseDialog();
                String productId = bVar2.f32882a;
                kotlin.jvm.internal.i.e(productId, "productId");
                G8.z.a aVar = bVar2.f32883b;
                subscriptionPurchaseDialog.setArguments(p271w0.c.b(new Pair("product_id", productId), new Pair("title_id", aVar.f3574a), new Pair("subtitle_id", aVar.f3575b), new Pair("bullet_point_ids", new ArrayList(aVar.f3576c)), new Pair("duration_id", aVar.f3577d), new Pair("action_id", aVar.f3578e)));
                subscriptionPurchaseDialog.v(this.this$0.getChildFragmentManager(), "SubscriptionPurchaseDialog");
                return r.f47939a;
            }
        }));
        U().f32854a0.e(getViewLifecycleOwner(), new a(new Ia.l<List<? extends ProfileViewModel.a>, r>() { // from class: com.voltasit.obdeleven.presentation.profile.ProfileFragment$setupObservables$3
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(List<? extends ProfileViewModel.a> list) {
                String string;
                List<? extends ProfileViewModel.a> list2 = list;
                AbstractC0634j0 abstractC0634j1 = this.this$0.f32820u;
                if (abstractC0634j1 == null) {
                    kotlin.jvm.internal.i.m("binding");
                    throw null;
                }
                abstractC0634j1.f1972B.removeAllViews();
                kotlin.jvm.internal.i.b(list2);
                final ProfileFragment profileFragment = this.this$0;
                for (final ProfileViewModel.a aVar : list2) {
                    LayoutInflater layoutInflaterFrom = LayoutInflater.from(profileFragment.requireContext());
                    AbstractC0634j0 abstractC0634j2 = profileFragment.f32820u;
                    if (abstractC0634j2 == null) {
                        kotlin.jvm.internal.i.m("binding");
                        throw null;
                    }
                    int i10 = i1.f1965s;
                    DataBinderMapperImpl dataBinderMapperImpl = M0.e.f4480a;
                    i1 i1Var = (i1) M0.e.a(layoutInflaterFrom, R.layout.item_profile_button, abstractC0634j2.f1972B, true, null);
                    kotlin.jvm.internal.i.d(i1Var, "inflate(...)");
                    String lowerCase = aVar.f32881b.toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                    if (n.J(lowerCase, "pro", false)) {
                        string = profileFragment.getString(R.string.view_upgrade_to_pro);
                        kotlin.jvm.internal.i.b(string);
                    } else {
                        string = profileFragment.getString(R.string.view_upgrade_to_ultimate);
                        kotlin.jvm.internal.i.b(string);
                    }
                    Button button = i1Var.f1966r;
                    button.setText(string);
                    button.setOnClickListener(new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.profile.l
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ProfileFragment this$0 = profileFragment;
                            kotlin.jvm.internal.i.e(this$0, "this$0");
                            ProfileViewModel.a arguments = aVar;
                            kotlin.jvm.internal.i.e(arguments, "$arguments");
                            ProfileViewModel profileViewModelU = this$0.U();
                            profileViewModelU.getClass();
                            G8.z product = arguments.f32880a;
                            kotlin.jvm.internal.i.e(product, "product");
                            profileViewModelU.f32863j0 = product;
                            profileViewModelU.f32855b0.j(new ProfileViewModel.b(product.f3572b, product.f3573c));
                        }
                    });
                }
                return r.f47939a;
            }
        }));
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new ProfileFragment$setupObservables$4(this, null), U().f32848U);
        InterfaceC1376t viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.i.d(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C2688e.l(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, C1377u.a(viewLifecycleOwner));
        U().f32850W.e(getViewLifecycleOwner(), new a(new Ia.l<r, r>() { // from class: com.voltasit.obdeleven.presentation.profile.ProfileFragment$setupObservables$5
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                NavigationManager navigationManagerR = this.this$0.r();
                p048d9.a aVar = new p048d9.a();
                Screen rootScreen = Screen.ProfileFragment;
                kotlin.jvm.internal.i.e(rootScreen, "rootScreen");
                Bundle bundle = new Bundle();
                bundle.putSerializable("popToMainFragment", rootScreen);
                aVar.setArguments(bundle);
                navigationManagerR.n(aVar, null);
                return r.f47939a;
            }
        }));
        U().f32852Y.e(getViewLifecycleOwner(), new a(new Ia.l<r, r>() { // from class: com.voltasit.obdeleven.presentation.profile.ProfileFragment$setupObservables$6
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                NavigationManager navigationManagerR = this.this$0.r();
                TwoFactorAuthVerifyFragment twoFactorAuthVerifyFragment = new TwoFactorAuthVerifyFragment();
                Bundle bundle = new Bundle();
                bundle.putString("key_flow_type", "value_disable_2fa");
                twoFactorAuthVerifyFragment.setArguments(bundle);
                navigationManagerR.n(twoFactorAuthVerifyFragment, null);
                return r.f47939a;
            }
        }));
        U().f32835H.e(getViewLifecycleOwner(), new a(new Ia.l<Boolean, r>() { // from class: com.voltasit.obdeleven.presentation.profile.ProfileFragment$setupObservables$7
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Boolean bool) {
                Boolean bool2 = bool;
                AbstractC0634j0 abstractC0634j1 = this.this$0.f32820u;
                if (abstractC0634j1 == null) {
                    kotlin.jvm.internal.i.m("binding");
                    throw null;
                }
                TextView textView = abstractC0634j1.f1975E.f1884r;
                kotlin.jvm.internal.i.b(bool2);
                textView.setText(bool2.booleanValue() ? this.this$0.getString(R.string.common_enabled) : this.this$0.getString(R.string.common_disabled));
                return r.f47939a;
            }
        }));
        U().f32833F.e(getViewLifecycleOwner(), new a(new Ia.l<String, r>() { // from class: com.voltasit.obdeleven.presentation.profile.ProfileFragment$setupObservables$8
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(String str) {
                String str2 = str;
                kotlin.jvm.internal.i.b(str2);
                if (n.S(str2)) {
                    this.this$0.E(R.string.common_check_network_try_again);
                } else {
                    ProfileFragment profileFragment = this.this$0;
                    profileFragment.getClass();
                    P.a(profileFragment.q(), str2);
                }
                return r.f47939a;
            }
        }));
        O().f32803t.e(getViewLifecycleOwner(), new a(new Ia.l<String, r>() { // from class: com.voltasit.obdeleven.presentation.profile.ProfileFragment$setupObservables$9
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(String str) {
                this.this$0.r().g(str);
                return r.f47939a;
            }
        }));
        O().f32114c.e(getViewLifecycleOwner(), new a(new Ia.l<PreloaderState, r>() { // from class: com.voltasit.obdeleven.presentation.profile.ProfileFragment$setupObservables$10
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(PreloaderState preloaderState) {
                PreloaderState preloaderState2 = preloaderState;
                if (preloaderState2 instanceof PreloaderState.a) {
                    this.this$0.H(((PreloaderState.a) preloaderState2).f32641a);
                } else {
                    if (preloaderState2 instanceof PreloaderState.b) {
                        ProfileFragment profileFragment = this.this$0;
                        ((PreloaderState.b) preloaderState2).getClass();
                        profileFragment.I(null);
                        throw null;
                    }
                    if (kotlin.jvm.internal.i.a(preloaderState2, PreloaderState.c.f32642a)) {
                        this.this$0.J();
                    } else if (kotlin.jvm.internal.i.a(preloaderState2, PreloaderState.d.f32643a)) {
                        this.this$0.w();
                    }
                }
                return r.f47939a;
            }
        }));
        O().f32801r.e(getViewLifecycleOwner(), new a(new Ia.l<ProViewModel.a, r>() { // from class: com.voltasit.obdeleven.presentation.profile.ProfileFragment$setupObservables$11
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(ProViewModel.a aVar) {
                ProViewModel.a aVar2 = aVar;
                if (!(aVar2 instanceof ProViewModel.a.C0340a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ProfileFragment profileFragment = this.this$0;
                ((ProViewModel.a.C0340a) aVar2).getClass();
                profileFragment.getClass();
                kotlin.jvm.internal.i.e(null, "msg");
                P.a(profileFragment.q(), null);
                throw null;
            }
        }));
        O().f32802s.e(getViewLifecycleOwner(), new a(new Ia.l<r, r>() { // from class: com.voltasit.obdeleven.presentation.profile.ProfileFragment$setupObservables$12
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                ProfileFragment profileFragment = this.this$0;
                profileFragment.q().S();
                profileFragment.G(R.string.common_pro_activated);
                if (profileFragment.getActivity() != null) {
                    profileFragment.r().o(false);
                }
                return r.f47939a;
            }
        }));
        U().f32837J.e(getViewLifecycleOwner(), new a(new Ia.l<r, r>() { // from class: com.voltasit.obdeleven.presentation.profile.ProfileFragment$setupObservables$13
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                ChangePasswordDialog changePasswordDialog = this.this$0.f32817r;
                kotlin.jvm.internal.i.b(changePasswordDialog);
                changePasswordDialog.y();
                ProfileFragment profileFragment = this.this$0;
                profileFragment.f32817r = null;
                MainActivity mainActivityQ = profileFragment.q();
                P.e(mainActivityQ, mainActivityQ.getString(R.string.common_password_changed));
                this.this$0.q().S();
                return r.f47939a;
            }
        }));
        U().f32839L.e(getViewLifecycleOwner(), new a(new Ia.l<r, r>() { // from class: com.voltasit.obdeleven.presentation.profile.ProfileFragment$setupObservables$14
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                ChangePasswordDialog changePasswordDialog = this.this$0.f32817r;
                kotlin.jvm.internal.i.b(changePasswordDialog);
                changePasswordDialog.y();
                this.this$0.f32817r = null;
                return r.f47939a;
            }
        }));
        U().f32846S.e(getViewLifecycleOwner(), new a(new Ia.l<G8.D, r>() { // from class: com.voltasit.obdeleven.presentation.profile.ProfileFragment$setupObservables$15
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(G8.D d10) {
                G8.D d11 = d10;
                AbstractC0634j0 abstractC0634j1 = this.this$0.f32820u;
                if (abstractC0634j1 == null) {
                    kotlin.jvm.internal.i.m("binding");
                    throw null;
                }
                TextView subscriptionType = abstractC0634j1.f1974D;
                kotlin.jvm.internal.i.d(subscriptionType, "subscriptionType");
                W8.d.a(subscriptionType, d11.f3410a);
                String string = this.this$0.getString(R.string.common_subscription_plan_title);
                kotlin.jvm.internal.i.d(string, "getString(...)");
                String lowerCase = string.toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                AbstractC0634j0 abstractC0634j2 = this.this$0.f32820u;
                if (abstractC0634j2 == null) {
                    kotlin.jvm.internal.i.m("binding");
                    throw null;
                }
                abstractC0634j2.f1973C.f1885s.setText(d11.f3410a.a() + " " + lowerCase);
                return r.f47939a;
            }
        }));
        U().f32844Q.e(getViewLifecycleOwner(), new a(new Ia.l<Integer, r>() { // from class: com.voltasit.obdeleven.presentation.profile.ProfileFragment$setupObservables$16
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Integer num) {
                Integer num2 = num;
                if (num2 != null && num2.intValue() == -1) {
                    ProfileFragment profileFragment = this.this$0;
                    AbstractC0634j0 abstractC0634j1 = profileFragment.f32820u;
                    if (abstractC0634j1 == null) {
                        kotlin.jvm.internal.i.m("binding");
                        throw null;
                    }
                    abstractC0634j1.f1973C.f1884r.setText(profileFragment.getString(R.string.common_lifetime));
                } else {
                    ProfileFragment profileFragment2 = this.this$0;
                    AbstractC0634j0 abstractC0634j2 = profileFragment2.f32820u;
                    if (abstractC0634j2 == null) {
                        kotlin.jvm.internal.i.m("binding");
                        throw null;
                    }
                    abstractC0634j2.f1973C.f1884r.setText(profileFragment2.getString(R.string.common_days_left, num2));
                }
                return r.f47939a;
            }
        }));
        U().f32865l0.e(getViewLifecycleOwner(), new a(new Ia.l<List<? extends C0706h>, r>() { // from class: com.voltasit.obdeleven.presentation.profile.ProfileFragment$setupObservables$17
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(List<? extends C0706h> list) {
                List<? extends C0706h> list2 = list;
                final ProfileFragment profileFragment = this.this$0;
                if (((u) kotlin.a.b(LazyThreadSafetyMode.f42971b, new Ia.a<u>() { // from class: com.voltasit.obdeleven.presentation.profile.ProfileFragment$setupObservables$17$invoke$$inlined$inject$default$1
                    final /* synthetic */ Pb.a $qualifier = null;
                    final /* synthetic */ Ia.a $parameters = null;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v2, types: [J8.u, java.lang.Object] */
                    @Override // Ia.a
                    public final u invoke() {
                        ComponentCallbacks componentCallbacks = profileFragment;
                        Pb.a aVar = this.$qualifier;
                        return Cb.a.i(componentCallbacks).a(this.$parameters, aVar, kotlin.jvm.internal.l.a(u.class));
                    }
                }).getValue()).l()) {
                    kotlin.jvm.internal.i.b(list2);
                    final ProfileFragment profileFragment2 = this.this$0;
                    new BuyCreditsDialog(list2, new Ia.l<C0706h, r>() { // from class: com.voltasit.obdeleven.presentation.profile.ProfileFragment$setupObservables$17.1
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(C0706h c0706h) {
                            C0706h product = c0706h;
                            kotlin.jvm.internal.i.e(product, "product");
                            ProfileViewModel profileViewModelU = profileFragment2.U();
                            ActivityC1347l activityC1347lRequireActivity = profileFragment2.requireActivity();
                            kotlin.jvm.internal.i.d(activityC1347lRequireActivity, "requireActivity(...)");
                            profileViewModelU.getClass();
                            C2680e.c(Z.a(profileViewModelU), profileViewModelU.f32112a, null, new ProfileViewModel$buyCredits$1(profileViewModelU, activityC1347lRequireActivity, product, null), 2);
                            return r.f47939a;
                        }
                    }).v(this.this$0.getChildFragmentManager(), "BuyCreditsDialog");
                } else {
                    ProfileFragment profileFragment3 = this.this$0;
                    ArrayList arrayList = CreditUtils.f34225a;
                    kotlin.jvm.internal.i.b(list2);
                    profileFragment3.f32811A = CreditUtils.a(list2, this.this$0);
                    T t8 = this.this$0.f32811A;
                    if (t8 != null) {
                        t8.A();
                    }
                }
                return r.f47939a;
            }
        }));
        U().f32860g0.e(getViewLifecycleOwner(), new a(new Ia.l<String, r>() { // from class: com.voltasit.obdeleven.presentation.profile.ProfileFragment$setupObservables$18
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(String str) {
                this.this$0.r().g(str);
                return r.f47939a;
            }
        }));
        U().f32862i0.e(getViewLifecycleOwner(), new com.voltasit.obdeleven.presentation.controlUnit.kwp.livedata.a(this, 4));
        T();
        O().c(false);
        this.f32820u = abstractC0634j0;
        abstractC0634j0.t(U());
        ImageButton imageButton = abstractC0634j0.f1981v;
        imageButton.setOnClickListener(this);
        abstractC0634j0.f1982w.setOnClickListener(this);
        abstractC0634j0.f1971A.setOnClickListener(this);
        abstractC0634j0.f1984y.setOnClickListener(this);
        abstractC0634j0.f1980u.setOnClickListener(this);
        z zVar = this.f32819t;
        kotlin.jvm.internal.i.b(zVar);
        abstractC0634j0.f1985z.setText(zVar.getString("name"));
        z zVar2 = this.f32819t;
        kotlin.jvm.internal.i.b(zVar2);
        ParseFile parseFile = zVar2.getParseFile("picture");
        int i10 = A0.f.i(this);
        ShapeableImageView shapeableImageView = abstractC0634j0.f1983x;
        ViewGroup.LayoutParams layoutParams = shapeableImageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i10 / 4;
        }
        ViewGroup.LayoutParams layoutParams2 = shapeableImageView.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.width = i10 / 4;
        }
        ViewGroup.LayoutParams layoutParams3 = imageButton.getLayoutParams();
        kotlin.jvm.internal.i.c(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
        ViewGroup.LayoutParams layoutParams4 = shapeableImageView.getLayoutParams();
        if (layoutParams4 != null) {
            int i11 = layoutParams4.height / 20;
            marginLayoutParams.setMargins(0, 0, i11, i11);
        }
        imageButton.setLayoutParams(marginLayoutParams);
        com.bumptech.glide.d<Drawable> dVarM = com.bumptech.glide.b.c(getContext()).f(this).m(parseFile != null ? parseFile.getUrl() : null);
        T3.d dVarJ = ((T3.d) E0.a(2131230859)).f(2131230859).j(2131230859);
        kotlin.jvm.internal.i.d(dVarJ, "placeholder(...)");
        dVarM.a(dVarJ).x(shapeableImageView);
        AbstractC0620c1 abstractC0620c1 = abstractC0634j0.f1977r;
        abstractC0620c1.f1885s.setText(R.string.common_credits);
        z zVar3 = this.f32819t;
        kotlin.jvm.internal.i.b(zVar3);
        abstractC0620c1.f1884r.setText(String.valueOf(zVar3.getInt("credits")));
        ArrayList arrayList = CreditUtils.f34225a;
        if (!arrayList.contains(this)) {
            arrayList.add(this);
        }
        abstractC0634j0.f1978s.setOnClickListener(new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.profile.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileFragment this$0 = this.f32890b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                ProfileViewModel profileViewModelU = this$0.U();
                String string = profileViewModelU.toString();
                C2680e.c(Z.a(profileViewModelU), profileViewModelU.f32112a, null, new ProfileViewModel$onPersonalInfoClick$1(profileViewModelU, string, null), 2);
            }
        });
        getChildFragmentManager().b0("SubscriptionPurchaseDialog", this, new E() { // from class: com.voltasit.obdeleven.presentation.profile.e
            @Override // androidx.fragment.app.E
            public final void h(Bundle bundle, String str) {
                ProfileFragment this$0 = this.f32907b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(str, "<anonymous parameter 0>");
                ProfileViewModel profileViewModelU = this$0.U();
                ActivityC1347l activityC1347lRequireActivity = this$0.requireActivity();
                kotlin.jvm.internal.i.d(activityC1347lRequireActivity, "requireActivity(...)");
                profileViewModelU.getClass();
                C2680e.c(Z.a(profileViewModelU), null, null, new ProfileViewModel$buySubscription$1(profileViewModelU, activityC1347lRequireActivity, null), 3);
            }
        });
        AbstractC0634j0 abstractC0634j1 = this.f32820u;
        if (abstractC0634j1 == null) {
            kotlin.jvm.internal.i.m("binding");
            throw null;
        }
        abstractC0634j1.f1975E.f4488d.setOnClickListener(new k(this, 0));
        AbstractC0634j0 abstractC0634j2 = this.f32820u;
        if (abstractC0634j2 == null) {
            kotlin.jvm.internal.i.m("binding");
            throw null;
        }
        abstractC0634j2.f1975E.f1885s.setText(getString(R.string.view_profile_2_step_auth));
        w.f25181b.a().d(this.f32825z, new Z3.k<y>() { // from class: com.voltasit.obdeleven.presentation.profile.ProfileFragment$setUpFacebookLogin$1
            @Override // Z3.k
            public final void a(FacebookException facebookException) {
                this.f32827a.w();
                O.e.s("ProfileFragment", "onError(error=" + facebookException.getMessage() + ")");
            }

            @Override // Z3.k
            public final void b(y yVar) {
                C0835a c0835a = yVar.f25189a;
                StringBuilder sb2 = new StringBuilder("onSuccess(result=");
                Date expirationDate = c0835a.f7785b;
                sb2.append(expirationDate);
                sb2.append(")");
                O.e.s("ProfileFragment", sb2.toString());
                final ProfileFragment profileFragment = this.f32827a;
                ProfileViewModel profileViewModelU = profileFragment.U();
                Ia.a<r> aVar = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.profile.ProfileFragment$setUpFacebookLogin$1$onSuccess$1
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        profileFragment.w();
                        profileFragment.getClass();
                        z zVarV = BaseFragment.v();
                        if (zVarV != null && zVarV.isLinked("facebook")) {
                            ProfileFragment profileFragment2 = profileFragment;
                            View view = profileFragment2.f32823x;
                            if (view != null) {
                                ActivityC1347l activity = profileFragment2.getActivity();
                                kotlin.jvm.internal.i.b(activity);
                                P.g(view, activity, R.string.view_profile_facebook_linked);
                            }
                            CheckBox checkBox = profileFragment.f32824y;
                            if (checkBox != null) {
                                checkBox.setChecked(true);
                            }
                        }
                        return r.f47939a;
                    }
                };
                Ia.l<Throwable, r> lVar = new Ia.l<Throwable, r>() { // from class: com.voltasit.obdeleven.presentation.profile.ProfileFragment$setUpFacebookLogin$1$onSuccess$2
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(Throwable th) {
                        Throwable it = th;
                        kotlin.jvm.internal.i.e(it, "it");
                        profileFragment.w();
                        String string = profileFragment.getString(J.f(it));
                        kotlin.jvm.internal.i.d(string, "getString(...)");
                        ProfileFragment profileFragment2 = profileFragment;
                        View view = profileFragment2.f32823x;
                        if (view != null) {
                            ActivityC1347l activity = profileFragment2.getActivity();
                            kotlin.jvm.internal.i.b(activity);
                            P.c(view, activity, string);
                        }
                        return r.f47939a;
                    }
                };
                profileViewModelU.getClass();
                String userId = c0835a.j;
                kotlin.jvm.internal.i.e(userId, "userId");
                String accessToken = c0835a.f7789f;
                kotlin.jvm.internal.i.e(accessToken, "accessToken");
                kotlin.jvm.internal.i.e(expirationDate, "expirationDate");
                C2680e.c(Z.a(profileViewModelU), null, null, new ProfileViewModel$onFacebookAuthSuccess$1(profileViewModelU, userId, accessToken, expirationDate, aVar, lVar, null), 3);
            }

            @Override // Z3.k
            public final void onCancel() {
                this.f32827a.w();
                O.e.s("ProfileFragment", "onCancel()");
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    public final ProfileViewModel U() {
        return (ProfileViewModel) this.f32813n.getValue();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String dialogId, DialogCallback.CallbackType callbackType, Bundle data) throws Exception {
        Window window;
        kotlin.jvm.internal.i.e(dialogId, "dialogId");
        kotlin.jvm.internal.i.e(data, "data");
        switch (dialogId.hashCode()) {
            case -1613113878:
                if (dialogId.equals("deleteAccountDialog")) {
                    if (callbackType == DialogCallback.CallbackType.f31102c) {
                        int i10 = z.f47484b;
                        z zVar = (z) ParseUser.getCurrentUser();
                        if (zVar == null) {
                            p279w9.b bVar = Application.f29634b;
                            P8.c.a(6, "ProfileFragment", "User object is null when deleting account", Arrays.copyOf(new Object[0], 0));
                            return;
                        } else {
                            zVar.deleteInBackground(new androidx.media3.exoplayer.E(6, this));
                            C2174v c2174v = this.f32818s;
                            kotlin.jvm.internal.i.b(c2174v);
                            c2174v.y();
                        }
                    } else {
                        C2174v c2174v2 = this.f32818s;
                        kotlin.jvm.internal.i.b(c2174v2);
                        c2174v2.y();
                    }
                    this.f32818s = null;
                    return;
                }
                return;
            case -1565960547:
                if (dialogId.equals("editUserDialog") && callbackType == DialogCallback.CallbackType.f31102c) {
                    int i11 = data.getInt("key_selected_item");
                    T t8 = this.f32814o;
                    kotlin.jvm.internal.i.b(t8);
                    Dialog dialog = t8.f17606m;
                    if (dialog == null || (window = dialog.getWindow()) == null) {
                        return;
                    }
                    int width = window.getDecorView().getWidth();
                    if (i11 == 0) {
                        ActivityC1347l activity = getActivity();
                        try {
                            startActivityForResult(new Intent("android.intent.action.GET_CONTENT").setType("image/*"), 9162);
                            return;
                        } catch (ActivityNotFoundException unused) {
                            Toast.makeText(activity.getApplicationContext(), R.string.crop__pick_error, 0).show();
                            return;
                        }
                    }
                    if (i11 == 1) {
                        Bundle bundleA = o.a("key_tag", R.string.view_profile_change_name, "changeNameDialog", "key_title");
                        bundleA.putInt("key_positive_text", R.string.common_save);
                        bundleA.putInt("key_negative_text", R.string.common_cancel);
                        bundleA.putInt("key_input_type", 1);
                        bundleA.putBoolean("key_hint_above_text", true);
                        bundleA.putInt("key_input_hint_res", R.string.dialog_change_name_enter_new_name);
                        M m7 = new M();
                        m7.setArguments(bundleA);
                        m7.f32261r = getFragmentManager();
                        m7.setTargetFragment(this, 0);
                        this.f32815p = m7;
                        m7.A();
                        return;
                    }
                    if (i11 == 2) {
                        if (getActivity() != null) {
                            Bundle bundleA2 = o.a("key_tag", R.string.view_profile_change_email, "changeEmailDialog", "key_title");
                            bundleA2.putInt("key_positive_text", R.string.common_save);
                            bundleA2.putInt("key_negative_text", R.string.common_cancel);
                            bundleA2.putParcelable("key_user", BaseFragment.v());
                            C2172u c2172u = new C2172u();
                            c2172u.setArguments(bundleA2);
                            c2172u.f32261r = getFragmentManager();
                            c2172u.setTargetFragment(this, 0);
                            this.f32816q = c2172u;
                            c2172u.A();
                            return;
                        }
                        return;
                    }
                    if (i11 == 3) {
                        Bundle bundleA3 = o.a("key_tag", R.string.common_change_password, "changePasswordDialog", "key_title");
                        bundleA3.putInt("key_positive_text", R.string.common_save);
                        bundleA3.putInt("key_negative_text", R.string.common_cancel);
                        ChangePasswordDialog changePasswordDialog = new ChangePasswordDialog();
                        changePasswordDialog.setArguments(bundleA3);
                        changePasswordDialog.f32261r = getFragmentManager();
                        changePasswordDialog.setTargetFragment(this, 0);
                        this.f32817r = changePasswordDialog;
                        changePasswordDialog.A();
                        return;
                    }
                    if (i11 != 4) {
                        return;
                    }
                    androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(requireContext(), 2132018051);
                    LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
                    kotlin.jvm.internal.i.d(layoutInflater, "getLayoutInflater(...)");
                    View viewInflate = layoutInflater.inflate(R.layout.dialog_linking, (ViewGroup) null);
                    aVar.setView(viewInflate);
                    this.f32823x = viewInflate.findViewById(R.id.snackbarLayout);
                    RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.dialog_linking_rel_layout);
                    LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.dialog_view);
                    LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(R.id.email_row);
                    View viewFindViewById = viewInflate.findViewById(R.id.linking_dialog_divider);
                    LinearLayout linearLayout3 = (LinearLayout) viewInflate.findViewById(R.id.facebook_row);
                    final CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.cb_email);
                    this.f32824y = (CheckBox) viewInflate.findViewById(R.id.cb_fb);
                    Button button = (Button) viewInflate.findViewById(R.id.button_Done);
                    z zVarV = BaseFragment.v();
                    linearLayout2.setVisibility(C.a(zVarV != null ? zVarV.getEmail() : null) ? 0 : 8);
                    z zVarV2 = BaseFragment.v();
                    viewFindViewById.setVisibility(C.a(zVarV2 != null ? zVarV2.getEmail() : null) ? 0 : 8);
                    ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                    kotlin.jvm.internal.i.c(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                    layoutParams2.addRule(13);
                    layoutParams2.width = width;
                    layoutParams2.height = -2;
                    linearLayout.setLayoutParams(layoutParams2);
                    androidx.appcompat.app.e eVarCreate = aVar.create();
                    kotlin.jvm.internal.i.d(eVarCreate, "create(...)");
                    Window window2 = eVarCreate.getWindow();
                    if (window2 != null) {
                        window2.setBackgroundDrawableResource(android.R.drawable.screen_background_dark_transparent);
                    }
                    relativeLayout.setOnClickListener(new g(0, eVarCreate));
                    button.setOnClickListener(new h(0, eVarCreate));
                    CheckBox checkBox2 = this.f32824y;
                    if (checkBox2 != null) {
                        z zVar2 = this.f32819t;
                        kotlin.jvm.internal.i.b(zVar2);
                        checkBox2.setChecked(zVar2.isLinked("facebook"));
                    }
                    z zVarV3 = BaseFragment.v();
                    checkBox.setChecked(!C.a(zVarV3 != null ? zVarV3.getEmail() : null));
                    final View view = this.f32823x;
                    kotlin.jvm.internal.i.b(view);
                    linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.profile.j
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            ProfileFragment this$0 = this.f32918b;
                            kotlin.jvm.internal.i.e(this$0, "this$0");
                            View snackbarView = view;
                            kotlin.jvm.internal.i.e(snackbarView, "$snackbarView");
                            CheckBox checkBox3 = checkBox;
                            this$0.J();
                            z zVar3 = this$0.f32819t;
                            kotlin.jvm.internal.i.b(zVar3);
                            if (zVar3.isLinked("facebook")) {
                                b bVar2 = new b(this$0, snackbarView, checkBox3);
                                Date date = C0835a.f7782m;
                                C0835a c0835aB = C0835a.b.b();
                                U6.f fVar = new U6.f(bVar2);
                                String str = Z3.r.j;
                                Z3.r rVarH = Z3.r.c.h(c0835aB, fVar);
                                rVarH.f7876d = v.d("fields", "email");
                                rVarH.d();
                            }
                        }
                    });
                    final View view2 = this.f32823x;
                    kotlin.jvm.internal.i.b(view2);
                    kotlin.jvm.internal.i.b(linearLayout3);
                    final CheckBox checkBox3 = this.f32824y;
                    kotlin.jvm.internal.i.b(checkBox3);
                    z zVar3 = this.f32819t;
                    kotlin.jvm.internal.i.b(zVar3);
                    final boolean zA = C.a(zVar3.getEmail());
                    linearLayout3.setOnClickListener(new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.profile.i
                        /* JADX WARN: Code duplicated, block: B:6:0x002f  */
                        /* JADX WARN: Code duplicated, block: B:8:0x0035  */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) throws Exception {
                            final ProfileFragment this$0 = this.f32914b;
                            kotlin.jvm.internal.i.e(this$0, "this$0");
                            final CheckBox fbCheckbox = checkBox3;
                            kotlin.jvm.internal.i.e(fbCheckbox, "$fbCheckbox");
                            final View snackbarView = view2;
                            kotlin.jvm.internal.i.e(snackbarView, "$snackbarView");
                            this$0.J();
                            List listK = M1.k("public_profile");
                            if (zA) {
                                z zVar4 = this$0.f32819t;
                                kotlin.jvm.internal.i.b(zVar4);
                                if (zVar4.isLinked("facebook")) {
                                    if (fbCheckbox.isChecked()) {
                                        ProfileViewModel profileViewModelU = this$0.U();
                                        Ia.a<r> aVar2 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.profile.ProfileFragment$setupFacebookRow$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // Ia.a
                                            public final r invoke() {
                                                this$0.w();
                                                this$0.getClass();
                                                z zVarV4 = BaseFragment.v();
                                                if (zVarV4 == null || !zVarV4.isLinked("facebook")) {
                                                    P.g(snackbarView, this$0.requireActivity(), R.string.view_profile_facebook_unlinked);
                                                    fbCheckbox.setChecked(false);
                                                }
                                                return r.f47939a;
                                            }
                                        };
                                        Ia.l<Throwable, r> lVar = new Ia.l<Throwable, r>() { // from class: com.voltasit.obdeleven.presentation.profile.ProfileFragment$setupFacebookRow$1$2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final r invoke(Throwable th) {
                                                Throwable it = th;
                                                kotlin.jvm.internal.i.e(it, "it");
                                                this$0.w();
                                                String string = this$0.getString(J.f(it));
                                                kotlin.jvm.internal.i.d(string, "getString(...)");
                                                P.c(snackbarView, this$0.requireActivity(), string);
                                                return r.f47939a;
                                            }
                                        };
                                        profileViewModelU.getClass();
                                        C2680e.c(Z.a(profileViewModelU), null, null, new ProfileViewModel$clickUnlinkFacebook$1(profileViewModelU, aVar2, lVar, null), 3);
                                        return;
                                    }
                                }
                            } else if (fbCheckbox.isChecked()) {
                                ProfileViewModel profileViewModelU2 = this$0.U();
                                Ia.a<r> aVar3 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.profile.ProfileFragment$setupFacebookRow$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // Ia.a
                                    public final r invoke() {
                                        this$0.w();
                                        this$0.getClass();
                                        z zVarV4 = BaseFragment.v();
                                        if (zVarV4 == null || !zVarV4.isLinked("facebook")) {
                                            P.g(snackbarView, this$0.requireActivity(), R.string.view_profile_facebook_unlinked);
                                            fbCheckbox.setChecked(false);
                                        }
                                        return r.f47939a;
                                    }
                                };
                                Ia.l<Throwable, r> lVar2 = new Ia.l<Throwable, r>() { // from class: com.voltasit.obdeleven.presentation.profile.ProfileFragment$setupFacebookRow$1$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final r invoke(Throwable th) {
                                        Throwable it = th;
                                        kotlin.jvm.internal.i.e(it, "it");
                                        this$0.w();
                                        String string = this$0.getString(J.f(it));
                                        kotlin.jvm.internal.i.d(string, "getString(...)");
                                        P.c(snackbarView, this$0.requireActivity(), string);
                                        return r.f47939a;
                                    }
                                };
                                profileViewModelU2.getClass();
                                C2680e.c(Z.a(profileViewModelU2), null, null, new ProfileViewModel$clickUnlinkFacebook$1(profileViewModelU2, aVar3, lVar2, null), 3);
                                return;
                            }
                            if (!fbCheckbox.isChecked()) {
                                w.f25181b.a().b(this$0, listK);
                                return;
                            }
                            String string = this$0.getString(R.string.view_profile_cant_unlink);
                            kotlin.jvm.internal.i.d(string, "getString(...)");
                            P.c(snackbarView, this$0.requireActivity(), string);
                            this$0.w();
                        }
                    });
                    eVarCreate.show();
                    return;
                }
                return;
            case -1484556748:
                if (dialogId.equals("changeEmailDialog") && callbackType == DialogCallback.CallbackType.f31101b) {
                    C2172u c2172u2 = this.f32816q;
                    kotlin.jvm.internal.i.b(c2172u2);
                    c2172u2.y();
                    this.f32816q = null;
                    return;
                }
                return;
            case -728161405:
                if (dialogId.equals("changeNameDialog")) {
                    if (callbackType == DialogCallback.CallbackType.f31102c) {
                        String string = data.getString("key_input");
                        if (string == null) {
                            string = "";
                        }
                        if (!n.S(string)) {
                            z zVar4 = this.f32819t;
                            kotlin.jvm.internal.i.b(zVar4);
                            zVar4.put("name", string);
                            z zVar5 = this.f32819t;
                            kotlin.jvm.internal.i.b(zVar5);
                            zVar5.saveEventually();
                            AbstractC0634j0 abstractC0634j0 = this.f32820u;
                            if (abstractC0634j0 == null) {
                                kotlin.jvm.internal.i.m("binding");
                                throw null;
                            }
                            abstractC0634j0.f1985z.setText(string);
                            q().S();
                            P.f(requireActivity(), R.string.view_profile_name_changed);
                        }
                    }
                    M m10 = this.f32815p;
                    kotlin.jvm.internal.i.b(m10);
                    m10.y();
                    this.f32815p = null;
                    return;
                }
                return;
            case 81047443:
                if (dialogId.equals("changePasswordDialog")) {
                    if (callbackType != DialogCallback.CallbackType.f31102c) {
                        ChangePasswordDialog changePasswordDialog2 = this.f32817r;
                        kotlin.jvm.internal.i.b(changePasswordDialog2);
                        changePasswordDialog2.y();
                        this.f32817r = null;
                        return;
                    }
                    String string2 = data.getString("key_new_pass");
                    if (string2 == null) {
                        return;
                    }
                    ProfileViewModel profileViewModelU = U();
                    profileViewModelU.getClass();
                    C2680e.c(Z.a(profileViewModelU), profileViewModelU.f32112a, null, new ProfileViewModel$changeUserPassword$1(profileViewModelU, string2, null), 2);
                    return;
                }
                return;
            case 1355365788:
                if (dialogId.equals("buyCreditsDialog") && callbackType == DialogCallback.CallbackType.f31102c) {
                    T t10 = this.f32811A;
                    if (t10 != null) {
                        t10.y();
                    }
                    this.f32811A = null;
                    int i12 = data.getInt("key_selected_item", -1);
                    ProfileViewModel profileViewModelU2 = U();
                    ActivityC1347l activityC1347lRequireActivity = requireActivity();
                    kotlin.jvm.internal.i.d(activityC1347lRequireActivity, "requireActivity(...)");
                    ArrayList arrayList = CreditUtils.f34226b;
                    kotlin.jvm.internal.i.b(arrayList);
                    C0706h product = (C0706h) arrayList.get(i12);
                    profileViewModelU2.getClass();
                    kotlin.jvm.internal.i.e(product, "product");
                    C2680e.c(Z.a(profileViewModelU2), profileViewModelU2.f32112a, null, new ProfileViewModel$buyCredits$1(profileViewModelU2, activityC1347lRequireActivity, product, null), 2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // com.voltasit.obdeleven.utils.CreditUtils.a
    public final void m(int i10) {
        AbstractC0634j0 abstractC0634j0 = this.f32820u;
        if (abstractC0634j0 == null) {
            kotlin.jvm.internal.i.m("binding");
            throw null;
        }
        View childAt = abstractC0634j0.f1979t.getChildAt(2);
        kotlin.jvm.internal.i.c(childAt, "null cannot be cast to non-null type android.widget.LinearLayout");
        View childAt2 = ((LinearLayout) childAt).getChildAt(1);
        kotlin.jvm.internal.i.c(childAt2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) childAt2).setText(String.valueOf(i10));
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "ProfileFragment";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) throws Exception {
        super.onActivityResult(i10, i11, intent);
        if (this.f32825z.a(i10, i11, intent)) {
            return;
        }
        if (i10 == 6709) {
            if (i11 == -1) {
                String path = ((Uri) intent.getParcelableExtra("output")).getPath();
                if (path == null) {
                    path = "";
                }
                File file = new File(path);
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
                AbstractC0634j0 abstractC0634j0 = this.f32820u;
                if (abstractC0634j0 == null) {
                    kotlin.jvm.internal.i.m("binding");
                    throw null;
                }
                abstractC0634j0.f1983x.setImageBitmap(bitmapDecodeFile);
                final ParseFile parseFile = new ParseFile(file);
                parseFile.saveInBackground(new SaveCallback() { // from class: com.voltasit.obdeleven.presentation.profile.f
                    @Override // com.parse.ParseCallback1
                    public final void done(Throwable th) {
                        ParseException parseException = (ParseException) th;
                        ParseFile parseFile2 = parseFile;
                        ProfileFragment this$0 = this;
                        kotlin.jvm.internal.i.e(this$0, "this$0");
                        if (parseException == null) {
                            int i12 = z.f47484b;
                            if (((z) ParseUser.getCurrentUser()) != null) {
                                z zVar = (z) ParseUser.getCurrentUser();
                                kotlin.jvm.internal.i.b(zVar);
                                zVar.put("picture", parseFile2);
                                zVar.saveEventually();
                                if (this$0.isVisible()) {
                                    this$0.q().S();
                                }
                                UserTrackingUtils.c(UserTrackingUtils.Key.f34278w, 1);
                            }
                        }
                    }
                });
                q().R();
                return;
            }
            return;
        }
        if (i10 != 9162) {
            super.onActivityResult(i10, i11, intent);
            return;
        }
        if (i11 == -1) {
            try {
                File file2 = new File(requireActivity().getExternalCacheDir(), "profile.jpg");
                if (!file2.exists()) {
                    File parentFile = file2.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    file2.createNewFile();
                }
                F6.a aVarE = F6.a.e(intent != null ? intent.getData() : null, Uri.fromFile(file2));
                Intent intent2 = (Intent) aVarE.f3259c;
                intent2.putExtra("aspect_x", 1);
                intent2.putExtra("aspect_y", 1);
                Intent intent3 = (Intent) aVarE.f3259c;
                intent3.putExtra("aspect_x", 1);
                intent3.putExtra("aspect_y", 1);
                Intent intent4 = (Intent) aVarE.f3259c;
                intent4.putExtra("max_x", 512);
                intent4.putExtra("max_y", 512);
                ActivityC1347l activity = getActivity();
                Intent intent5 = (Intent) aVarE.f3259c;
                intent5.setClass(activity, CropImageActivity.class);
                startActivityForResult(intent5, 6709);
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v10) {
        kotlin.jvm.internal.i.e(v10, "v");
        switch (v10.getId()) {
            case R.id.profileFragment_deleteAccount /* 2131363101 */:
                if (getActivity() != null) {
                    Bundle bundleA = o.a("key_tag", R.string.view_profile_delete_account_title, "deleteAccountDialog", "key_title");
                    bundleA.putInt("key_positive_text", R.string.common_delete);
                    bundleA.putInt("key_negative_text", R.string.common_cancel);
                    C2174v c2174v = new C2174v();
                    c2174v.setArguments(bundleA);
                    c2174v.f32261r = getFragmentManager();
                    c2174v.setTargetFragment(this, 0);
                    this.f32818s = c2174v;
                    c2174v.A();
                    break;
                }
                break;
            case R.id.profileFragment_editUser /* 2131363102 */:
                if (!com.voltasit.obdeleven.domain.usecases.device.u.k(getActivity())) {
                    P.b(requireActivity(), R.string.common_check_network);
                } else {
                    Bundle bundle = new Bundle();
                    String[] strArr = {getString(R.string.view_profile_change_image), getString(R.string.view_profile_change_name), getString(R.string.view_profile_change_email), getString(R.string.common_change_password), getString(R.string.view_profile_link_to_other_account)};
                    bundle.putInt("key_title", R.string.view_profile_account_management);
                    bundle.putInt("key_positive_text", R.string.common_ok);
                    bundle.putString("key_tag", "editUserDialog");
                    bundle.putStringArray("item_array", strArr);
                    T t8 = new T();
                    t8.setArguments(bundle);
                    t8.f32261r = getFragmentManager();
                    t8.setTargetFragment(this, 0);
                    this.f32814o = t8;
                    t8.A();
                }
                break;
            case R.id.profileFragment_getCredits /* 2131363103 */:
                T t10 = this.f32811A;
                if (t10 == null || !t10.isVisible()) {
                    ProfileViewModel profileViewModelU = U();
                    profileViewModelU.getClass();
                    C2680e.c(Z.a(profileViewModelU), profileViewModelU.f32112a, null, new ProfileViewModel$clickBuyCredits$1(profileViewModelU, null), 2);
                }
                break;
            case R.id.profileFragment_logout /* 2131363106 */:
                q().G(null);
                break;
            case R.id.profileFragment_userStatistics /* 2131363108 */:
                r().n(new com.voltasit.obdeleven.ui.module.h(), null);
                break;
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i10 = z.f47484b;
        this.f32819t = (z) ParseUser.getCurrentUser();
        this.f32822w = getString(R.string.common_password_must_be, Integer.valueOf(this.f32821v));
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        T t8 = this.f32814o;
        if (t8 != null) {
            t8.y();
        }
        this.f32814o = null;
        M m7 = this.f32815p;
        if (m7 != null) {
            m7.y();
        }
        this.f32815p = null;
        C2172u c2172u = this.f32816q;
        if (c2172u != null) {
            c2172u.y();
        }
        this.f32816q = null;
        ChangePasswordDialog changePasswordDialog = this.f32817r;
        if (changePasswordDialog != null) {
            changePasswordDialog.y();
        }
        this.f32817r = null;
        C2174v c2174v = this.f32818s;
        if (c2174v != null) {
            c2174v.y();
        }
        this.f32818s = null;
        T t10 = this.f32811A;
        if (t10 != null) {
            t10.y();
        }
        this.f32811A = null;
        super.onDestroyView();
        CreditUtils.f34225a.remove(this);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final int p() {
        return this.f32812B;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final Positionable$Position t() {
        return Positionable$Position.f31108d;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        String string = getString(R.string.common_profile);
        kotlin.jvm.internal.i.d(string, "getString(...)");
        return string;
    }
}
