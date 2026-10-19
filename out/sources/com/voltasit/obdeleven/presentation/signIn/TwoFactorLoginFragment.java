package com.voltasit.obdeleven.presentation.signIn;

import B8.AbstractC0665z0;
import G8.r;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC1347l;
import androidx.fragment.app.C1336a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import androidx.lifecycle.D;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import com.google.android.material.datepicker.p;
import com.google.android.material.textfield.TextInputEditText;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.controlUnit.ViewOnClickListenerC2131e;
import com.voltasit.obdeleven.presentation.controlUnit.ViewOnClickListenerC2132f;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import com.voltasit.obdeleven.presentation.twofactorauth.backupCode.LoginTwoFactorBackupCodeFragment;
import com.voltasit.obdeleven.ui.activity.LoginActivity;
import com.voltasit.obdeleven.ui.dialogs.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C2680e;
import p220r9.P;

/* JADX INFO: compiled from: TwoFactorLoginFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TwoFactorLoginFragment extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public G0 f33218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f33219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AbstractC0665z0 f33220d;

    /* JADX INFO: compiled from: TwoFactorLoginFragment.kt */
    public static final class b implements D, kotlin.jvm.internal.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lambda f33222b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Ia.l lVar) {
            this.f33222b = (Lambda) lVar;
        }

        @Override // kotlin.jvm.internal.f
        public final p293xa.e<?> b() {
            return this.f33222b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        @Override // androidx.lifecycle.D
        public final /* synthetic */ void d(Object obj) {
            this.f33222b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof D) || !(obj instanceof kotlin.jvm.internal.f)) {
                return false;
            }
            return this.f33222b.equals(((kotlin.jvm.internal.f) obj).b());
        }

        public final int hashCode() {
            return this.f33222b.hashCode();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.voltasit.obdeleven.presentation.signIn.TwoFactorLoginFragment$special$$inlined$viewModel$default$1] */
    public TwoFactorLoginFragment() {
        final Ia.a<Ob.a> aVar = new Ia.a<Ob.a>() { // from class: com.voltasit.obdeleven.presentation.signIn.TwoFactorLoginFragment$viewModel$2
            {
                super(0);
            }

            @Override // Ia.a
            public final Ob.a invoke() {
                Object aVar2;
                Bundle arguments = this.this$0.getArguments();
                if (arguments == null || (aVar2 = arguments.getParcelable("key_login_data")) == null) {
                    aVar2 = new r.a("", "");
                }
                return I.e.j(aVar2);
            }
        };
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.presentation.signIn.TwoFactorLoginFragment$special$$inlined$viewModel$default$1
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
        this.f33219c = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<l>(this) { // from class: com.voltasit.obdeleven.presentation.signIn.TwoFactorLoginFragment$special$$inlined$viewModel$default$2
            final /* synthetic */ Fragment $this_viewModel;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $extrasProducer = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.signIn.l] */
            @Override // Ia.a
            public final l invoke() {
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
                return Gb.a.a(kotlin.jvm.internal.l.a(l.class), viewModelStore, null, defaultViewModelCreationExtras, aVar2, Cb.a.i(fragment), aVar5);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    public final l o() {
        return (l) this.f33219c.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        p100i.a supportActionBar;
        p100i.a supportActionBar2;
        kotlin.jvm.internal.i.e(inflater, "inflater");
        int i10 = AbstractC0665z0.f2210y;
        AbstractC0665z0 abstractC0665z0 = (AbstractC0665z0) M0.e.a(inflater, R.layout.fragment_two_factor_auth_verify, null, false, null);
        kotlin.jvm.internal.i.d(abstractC0665z0, "inflate(...)");
        this.f33220d = abstractC0665z0;
        abstractC0665z0.f4488d.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        AbstractC0665z0 abstractC0665z1 = this.f33220d;
        if (abstractC0665z1 == null) {
            kotlin.jvm.internal.i.m("binding");
            throw null;
        }
        abstractC0665z1.f2217x.setVisibility(0);
        AbstractC0665z0 abstractC0665z2 = this.f33220d;
        if (abstractC0665z2 == null) {
            kotlin.jvm.internal.i.m("binding");
            throw null;
        }
        abstractC0665z2.f2217x.setTitle(getString(R.string.view_profile_2_step_auth));
        ActivityC1347l activity = getActivity();
        LoginActivity loginActivity = activity instanceof LoginActivity ? (LoginActivity) activity : null;
        if (loginActivity != null) {
            AbstractC0665z0 abstractC0665z3 = this.f33220d;
            if (abstractC0665z3 == null) {
                kotlin.jvm.internal.i.m("binding");
                throw null;
            }
            loginActivity.setSupportActionBar(abstractC0665z3.f2217x);
        }
        ActivityC1347l activity2 = getActivity();
        LoginActivity loginActivity2 = activity2 instanceof LoginActivity ? (LoginActivity) activity2 : null;
        if (loginActivity2 != null && (supportActionBar2 = loginActivity2.getSupportActionBar()) != null) {
            supportActionBar2.m(true);
        }
        ActivityC1347l activity3 = getActivity();
        LoginActivity loginActivity3 = activity3 instanceof LoginActivity ? (LoginActivity) activity3 : null;
        if (loginActivity3 != null && (supportActionBar = loginActivity3.getSupportActionBar()) != null) {
            supportActionBar.n();
        }
        AbstractC0665z0 abstractC0665z4 = this.f33220d;
        if (abstractC0665z4 == null) {
            kotlin.jvm.internal.i.m("binding");
            throw null;
        }
        abstractC0665z4.f2217x.setNavigationOnClickListener(new ViewOnClickListenerC2131e(this, 2));
        AbstractC0665z0 abstractC0665z5 = this.f33220d;
        if (abstractC0665z5 == null) {
            kotlin.jvm.internal.i.m("binding");
            throw null;
        }
        abstractC0665z5.f2215v.setOnClickListener(new ViewOnClickListenerC2132f(this, 2));
        AbstractC0665z0 abstractC0665z6 = this.f33220d;
        if (abstractC0665z6 == null) {
            kotlin.jvm.internal.i.m("binding");
            throw null;
        }
        abstractC0665z6.f2211r.setOnClickListener(new p(this, 3));
        AbstractC0665z0 abstractC0665z7 = this.f33220d;
        if (abstractC0665z7 == null) {
            kotlin.jvm.internal.i.m("binding");
            throw null;
        }
        abstractC0665z7.f2213t.setOnClickListener(new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.signIn.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String string;
                TwoFactorLoginFragment this$0 = this.f33258b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                l lVarO = this$0.o();
                AbstractC0665z0 abstractC0665z8 = this$0.f33220d;
                if (abstractC0665z8 == null) {
                    kotlin.jvm.internal.i.m("binding");
                    throw null;
                }
                Editable text = abstractC0665z8.f2212s.getText();
                if (text == null || (string = text.toString()) == null) {
                    string = "";
                }
                lVarO.getClass();
                C2680e.c(Z.a(lVarO), lVarO.f32112a, null, new TwoFactorLoginViewModel$clickContinue$1(lVarO, string, null), 2);
            }
        });
        AbstractC0665z0 abstractC0665z8 = this.f33220d;
        if (abstractC0665z8 == null) {
            kotlin.jvm.internal.i.m("binding");
            throw null;
        }
        TextInputEditText codeInput = abstractC0665z8.f2212s;
        kotlin.jvm.internal.i.d(codeInput, "codeInput");
        codeInput.addTextChangedListener(new a());
        o().f33266s.e(getViewLifecycleOwner(), new b(new Ia.l<p293xa.r, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.signIn.TwoFactorLoginFragment.onCreateView.6
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(p293xa.r rVar) {
                p186p0.d activity4 = TwoFactorLoginFragment.this.getActivity();
                p303y8.a aVar = activity4 instanceof p303y8.a ? (p303y8.a) activity4 : null;
                if (aVar != null) {
                    aVar.d(false);
                }
                return p293xa.r.f47939a;
            }
        }));
        o().f32114c.e(getViewLifecycleOwner(), new b(new Ia.l<PreloaderState, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.signIn.TwoFactorLoginFragment.onCreateView.7
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(PreloaderState preloaderState) {
                PreloaderState preloaderState2 = preloaderState;
                if (kotlin.jvm.internal.i.a(preloaderState2, PreloaderState.c.f32642a)) {
                    TwoFactorLoginFragment twoFactorLoginFragment = TwoFactorLoginFragment.this;
                    G0 g10 = twoFactorLoginFragment.f33218b;
                    if (g10 != null) {
                        if (g10 != null) {
                            g10.p(false, false);
                        }
                        twoFactorLoginFragment.f33218b = null;
                    }
                    G0 g11 = new G0();
                    twoFactorLoginFragment.f33218b = g11;
                    g11.v(twoFactorLoginFragment.getParentFragmentManager(), "SignInLoader");
                } else if (kotlin.jvm.internal.i.a(preloaderState2, PreloaderState.d.f32643a)) {
                    TwoFactorLoginFragment twoFactorLoginFragment2 = TwoFactorLoginFragment.this;
                    G0 g12 = twoFactorLoginFragment2.f33218b;
                    if (g12 != null) {
                        g12.p(false, false);
                    }
                    twoFactorLoginFragment2.f33218b = null;
                } else if (!(preloaderState2 instanceof PreloaderState.a)) {
                    boolean z10 = preloaderState2 instanceof PreloaderState.b;
                }
                return p293xa.r.f47939a;
            }
        }));
        o().f33268u.e(getViewLifecycleOwner(), new b(new Ia.l<Integer, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.signIn.TwoFactorLoginFragment.onCreateView.8
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Integer num) {
                Integer num2 = num;
                TwoFactorLoginFragment twoFactorLoginFragment = TwoFactorLoginFragment.this;
                AbstractC0665z0 abstractC0665z9 = twoFactorLoginFragment.f33220d;
                if (abstractC0665z9 == null) {
                    kotlin.jvm.internal.i.m("binding");
                    throw null;
                }
                kotlin.jvm.internal.i.b(num2);
                abstractC0665z9.f2214u.setText(twoFactorLoginFragment.getString(num2.intValue()));
                return p293xa.r.f47939a;
            }
        }));
        o().f32120i.e(getViewLifecycleOwner(), new b(new Ia.l<Integer, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.signIn.TwoFactorLoginFragment.onCreateView.9
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Integer num) {
                Integer num2 = num;
                ActivityC1347l activityC1347lRequireActivity = TwoFactorLoginFragment.this.requireActivity();
                kotlin.jvm.internal.i.b(num2);
                P.b(activityC1347lRequireActivity, num2.intValue());
                return p293xa.r.f47939a;
            }
        }));
        o().f32121k.e(getViewLifecycleOwner(), new b(new Ia.l<String, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.signIn.TwoFactorLoginFragment.onCreateView.10
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(String str) {
                P.a(TwoFactorLoginFragment.this.requireActivity(), str);
                return p293xa.r.f47939a;
            }
        }));
        o().f33270w.e(getViewLifecycleOwner(), new b(new Ia.l<r, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.signIn.TwoFactorLoginFragment.onCreateView.11
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(r rVar) {
                r rVar2 = rVar;
                ActivityC1347l activity4 = TwoFactorLoginFragment.this.getActivity();
                LoginActivity loginActivity4 = activity4 instanceof LoginActivity ? (LoginActivity) activity4 : null;
                if (loginActivity4 != null) {
                    LoginTwoFactorBackupCodeFragment loginTwoFactorBackupCodeFragment = new LoginTwoFactorBackupCodeFragment();
                    kotlin.jvm.internal.i.b(rVar2);
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("login_data", rVar2);
                    loginTwoFactorBackupCodeFragment.setArguments(bundle2);
                    y supportFragmentManager = loginActivity4.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    C1336a c1336a = new C1336a(supportFragmentManager);
                    c1336a.e(R.id.loginActivity_content, loginTwoFactorBackupCodeFragment, null);
                    c1336a.c(null);
                    c1336a.i();
                }
                return p293xa.r.f47939a;
            }
        }));
        o().f33272y.e(getViewLifecycleOwner(), new b(new Ia.l<p293xa.r, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.signIn.TwoFactorLoginFragment.onCreateView.12
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(p293xa.r rVar) {
                try {
                    TwoFactorLoginFragment.this.requireActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://support.obdeleven.com/en/articles/5627134-how-to-set-up-2-step-authentication-2fa")));
                } catch (ActivityNotFoundException e10) {
                    O.e.m(e10);
                }
                return p293xa.r.f47939a;
            }
        }));
        o().f33261A.e(getViewLifecycleOwner(), new b(new Ia.l<Integer, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.signIn.TwoFactorLoginFragment.onCreateView.13
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Integer num) {
                Integer num2 = num;
                TwoFactorLoginFragment twoFactorLoginFragment = TwoFactorLoginFragment.this;
                kotlin.jvm.internal.i.b(num2);
                new androidx.appcompat.app.e.a(twoFactorLoginFragment.requireContext(), R.style.EmailVerifyDialogTheme).setCancelable(true).setMessage(twoFactorLoginFragment.getString(R.string.dialog_too_many_sessions_message, num2)).setTitle(R.string.dialog_too_many_sessions_title).setPositiveButton(R.string.common_ok, (DialogInterface.OnClickListener) null).setNeutralButton(R.string.common_password_reset, new k(0, twoFactorLoginFragment)).show();
                return p293xa.r.f47939a;
            }
        }));
        AbstractC0665z0 abstractC0665z9 = this.f33220d;
        if (abstractC0665z9 == null) {
            kotlin.jvm.internal.i.m("binding");
            throw null;
        }
        View view = abstractC0665z9.f4488d;
        kotlin.jvm.internal.i.d(view, "getRoot(...)");
        return view;
    }

    /* JADX INFO: compiled from: TextView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            AbstractC0665z0 abstractC0665z0 = TwoFactorLoginFragment.this.f33220d;
            if (abstractC0665z0 == null) {
                kotlin.jvm.internal.i.m("binding");
                throw null;
            }
            boolean z10 = false;
            if (charSequence != null && charSequence.length() == 6) {
                z10 = true;
            }
            abstractC0665z0.f2213t.setEnabled(z10);
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
