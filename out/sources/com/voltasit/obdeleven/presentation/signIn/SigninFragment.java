package com.voltasit.obdeleven.presentation.signIn;

import B8.AbstractC0642n0;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.ActivityC1347l;
import androidx.fragment.app.C1336a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import androidx.lifecycle.D;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.login.w;
import com.google.android.material.textfield.TextInputLayout;
import com.parse.ParseUser;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import com.voltasit.obdeleven.ui.activity.LoginActivity;
import com.voltasit.obdeleven.ui.dialogs.G0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C2680e;
import p220r9.P;
import p293xa.r;

/* JADX INFO: compiled from: SigninFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SigninFragment extends Fragment {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final List<String> f33197n = kotlin.collections.l.s("public_profile", "email");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public G0 f33198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextInputLayout f33199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EditText f33200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextInputLayout f33201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EditText f33202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f33203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Button f33204h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Button f33205i;
    public final CallbackManagerImpl j = new CallbackManagerImpl();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f33206k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f33207l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p303y8.a f33208m;

    /* JADX INFO: compiled from: SigninFragment.kt */
    public interface a {
        void j(String str, boolean z10);

        void k(String str, String str2);
    }

    /* JADX INFO: compiled from: SigninFragment.kt */
    public static final class b implements D, kotlin.jvm.internal.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lambda f33209b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Ia.l lVar) {
            this.f33209b = (Lambda) lVar;
        }

        @Override // kotlin.jvm.internal.f
        public final p293xa.e<?> b() {
            return this.f33209b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        @Override // androidx.lifecycle.D
        public final /* synthetic */ void d(Object obj) {
            this.f33209b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof D) || !(obj instanceof kotlin.jvm.internal.f)) {
                return false;
            }
            return this.f33209b.equals(((kotlin.jvm.internal.f) obj).b());
        }

        public final int hashCode() {
            return this.f33209b.hashCode();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.voltasit.obdeleven.presentation.signIn.SigninFragment$special$$inlined$viewModel$default$1] */
    public SigninFragment() {
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.presentation.signIn.SigninFragment$special$$inlined$viewModel$default$1
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
        this.f33206k = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<com.voltasit.obdeleven.presentation.signIn.b>(this) { // from class: com.voltasit.obdeleven.presentation.signIn.SigninFragment$special$$inlined$viewModel$default$2
            final /* synthetic */ Fragment $this_viewModel;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $extrasProducer = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.signIn.b] */
            @Override // Ia.a
            public final b invoke() {
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
                return Gb.a.a(kotlin.jvm.internal.l.a(b.class), viewModelStore, null, defaultViewModelCreationExtras, aVar, Cb.a.i(fragment), aVar4);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    public final com.voltasit.obdeleven.presentation.signIn.b o() {
        return (com.voltasit.obdeleven.presentation.signIn.b) this.f33206k.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        this.j.a(i10, i11, intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        super.onAttach(activity);
        if (!(activity instanceof a)) {
            throw new IllegalArgumentException("Activity must implement ParseLoginFragmentListener");
        }
        this.f33207l = (a) activity;
        if (!(activity instanceof p303y8.a)) {
            throw new IllegalArgumentException("Activity must implement OnLoginSuccessListener");
        }
        this.f33208m = (p303y8.a) activity;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.e(inflater, "inflater");
        int i10 = AbstractC0642n0.f2078u;
        AbstractC0642n0 abstractC0642n0 = (AbstractC0642n0) M0.e.a(inflater, R.layout.fragment_signin, null, false, null);
        kotlin.jvm.internal.i.d(abstractC0642n0, "inflate(...)");
        abstractC0642n0.t(o());
        abstractC0642n0.q(getViewLifecycleOwner());
        View view = abstractC0642n0.f4488d;
        kotlin.jvm.internal.i.d(view, "getRoot(...)");
        this.f33199c = (TextInputLayout) view.findViewById(R.id.signinFragment_emailInputLayout);
        this.f33200d = (EditText) view.findViewById(R.id.signinFragment_emailInput);
        this.f33201e = (TextInputLayout) view.findViewById(R.id.signinFragment_passwordInputLayout);
        this.f33202f = (EditText) view.findViewById(R.id.signinFragment_passwordInput);
        this.f33203g = (TextView) view.findViewById(R.id.signinFragment_forgotPassword);
        this.f33204h = (Button) view.findViewById(R.id.signinFragment_signin);
        this.f33205i = (Button) view.findViewById(R.id.signinFragment_signup);
        TextView textView = (TextView) view.findViewById(R.id.agreementText);
        EditText editText = this.f33202f;
        kotlin.jvm.internal.i.b(editText);
        Drawable[] compoundDrawablesRelative = editText.getCompoundDrawablesRelative();
        kotlin.jvm.internal.i.d(compoundDrawablesRelative, "getCompoundDrawablesRelative(...)");
        EditText editText2 = this.f33202f;
        kotlin.jvm.internal.i.b(editText2);
        editText2.setCompoundDrawablesRelativeWithIntrinsicBounds(getResources().getDrawable(2131231439), compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
        EditText editText3 = this.f33202f;
        kotlin.jvm.internal.i.b(editText3);
        editText3.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.voltasit.obdeleven.presentation.signIn.c
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i11, KeyEvent keyEvent) {
                List<String> list = SigninFragment.f33197n;
                SigninFragment this$0 = this.f33250a;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                if (i11 != 6) {
                    return false;
                }
                Button button = this$0.f33204h;
                kotlin.jvm.internal.i.b(button);
                button.performClick();
                return false;
            }
        });
        Button button = this.f33204h;
        kotlin.jvm.internal.i.b(button);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.signIn.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String string;
                Editable text;
                String string2;
                Editable text2;
                List<String> list = SigninFragment.f33197n;
                SigninFragment this$0 = this.f33251b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                b bVarO = this$0.o();
                EditText editText4 = this$0.f33200d;
                String str = "";
                if (editText4 == null || (text2 = editText4.getText()) == null || (string = text2.toString()) == null) {
                    string = "";
                }
                EditText editText5 = this$0.f33202f;
                if (editText5 != null && (text = editText5.getText()) != null && (string2 = text.toString()) != null) {
                    str = string2;
                }
                bVarO.getClass();
                C2680e.c(Z.a(bVarO), null, null, new SignInViewModel$clickLogIn$1(bVarO, string, str, null), 3);
            }
        });
        Button button2 = this.f33205i;
        kotlin.jvm.internal.i.b(button2);
        button2.setOnClickListener(new e(this, 0));
        TextView textView2 = this.f33203g;
        kotlin.jvm.internal.i.b(textView2);
        textView2.setOnClickListener(new com.voltasit.obdeleven.presentation.profile.g(1, this));
        w.f25181b.a().d(this.j, new h(this));
        textView.setMovementMethod(new LinkMovementMethod());
        o().f33231F.e(getViewLifecycleOwner(), new b(new Ia.l<r, r>() { // from class: com.voltasit.obdeleven.presentation.signIn.SigninFragment$setupObservers$1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) throws Exception {
                w.f25181b.a().b(this.this$0, SigninFragment.f33197n);
                return r.f47939a;
            }
        }));
        o().f33243v.e(getViewLifecycleOwner(), new b(new Ia.l<r, r>() { // from class: com.voltasit.obdeleven.presentation.signIn.SigninFragment$setupObservers$2
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                p303y8.a aVar = this.this$0.f33208m;
                if (aVar != null) {
                    aVar.d(false);
                }
                return r.f47939a;
            }
        }));
        o().f33241t.e(getViewLifecycleOwner(), new b(new Ia.l<Boolean, r>() { // from class: com.voltasit.obdeleven.presentation.signIn.SigninFragment$setupObservers$3
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Boolean bool) {
                ParseUser.logOutInBackground(new U6.a(this.this$0.requireActivity(), new i(this.this$0)));
                return r.f47939a;
            }
        }));
        o().f33245x.e(getViewLifecycleOwner(), new b(new Ia.l<Integer, r>() { // from class: com.voltasit.obdeleven.presentation.signIn.SigninFragment$setupObservers$4
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Integer num) {
                Integer num2 = num;
                SigninFragment signinFragment = this.this$0;
                TextInputLayout textInputLayout = signinFragment.f33199c;
                if (textInputLayout != null) {
                    kotlin.jvm.internal.i.b(num2);
                    textInputLayout.setError(signinFragment.getString(num2.intValue()));
                }
                return r.f47939a;
            }
        }));
        o().f33247z.e(getViewLifecycleOwner(), new b(new Ia.l<String, r>() { // from class: com.voltasit.obdeleven.presentation.signIn.SigninFragment$setupObservers$5
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(String str) {
                String str2 = str;
                TextInputLayout textInputLayout = this.this$0.f33201e;
                if (textInputLayout != null) {
                    textInputLayout.setError(str2);
                }
                return r.f47939a;
            }
        }));
        o().f33229D.e(getViewLifecycleOwner(), new b(new Ia.l<r, r>() { // from class: com.voltasit.obdeleven.presentation.signIn.SigninFragment$setupObservers$6
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                SigninFragment signinFragment = this.this$0;
                List<String> list = SigninFragment.f33197n;
                P.b(signinFragment.requireActivity(), R.string.view_signin_username_and_password_dont_match);
                EditText editText4 = signinFragment.f33202f;
                if (editText4 != null) {
                    editText4.selectAll();
                }
                EditText editText5 = signinFragment.f33202f;
                if (editText5 != null) {
                    editText5.requestFocus();
                }
                return r.f47939a;
            }
        }));
        o().f33233H.e(getViewLifecycleOwner(), new b(new Ia.l<G8.r, r>() { // from class: com.voltasit.obdeleven.presentation.signIn.SigninFragment$setupObservers$7
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(G8.r rVar) {
                G8.r rVar2 = rVar;
                ActivityC1347l activity = this.this$0.getActivity();
                LoginActivity loginActivity = activity instanceof LoginActivity ? (LoginActivity) activity : null;
                if (loginActivity != null) {
                    TwoFactorLoginFragment twoFactorLoginFragment = new TwoFactorLoginFragment();
                    kotlin.jvm.internal.i.b(rVar2);
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("key_login_data", rVar2);
                    twoFactorLoginFragment.setArguments(bundle2);
                    y supportFragmentManager = loginActivity.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    C1336a c1336a = new C1336a(supportFragmentManager);
                    c1336a.e(R.id.loginActivity_content, twoFactorLoginFragment, null);
                    c1336a.c(null);
                    c1336a.i();
                }
                return r.f47939a;
            }
        }));
        o().f32120i.e(getViewLifecycleOwner(), new b(new Ia.l<Integer, r>() { // from class: com.voltasit.obdeleven.presentation.signIn.SigninFragment$setupObservers$8
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Integer num) {
                Integer num2 = num;
                ActivityC1347l activityC1347lRequireActivity = this.this$0.requireActivity();
                SigninFragment signinFragment = this.this$0;
                kotlin.jvm.internal.i.b(num2);
                P.a(activityC1347lRequireActivity, signinFragment.getString(num2.intValue()));
                return r.f47939a;
            }
        }));
        o().f32121k.e(getViewLifecycleOwner(), new b(new Ia.l<String, r>() { // from class: com.voltasit.obdeleven.presentation.signIn.SigninFragment$setupObservers$9
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(String str) {
                P.a(this.this$0.requireActivity(), str);
                return r.f47939a;
            }
        }));
        o().f32114c.e(getViewLifecycleOwner(), new b(new Ia.l<PreloaderState, r>() { // from class: com.voltasit.obdeleven.presentation.signIn.SigninFragment$setupObservers$10
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(PreloaderState preloaderState) {
                PreloaderState preloaderState2 = preloaderState;
                if (kotlin.jvm.internal.i.a(preloaderState2, PreloaderState.c.f32642a)) {
                    SigninFragment signinFragment = this.this$0;
                    G0 g10 = signinFragment.f33198b;
                    if (g10 != null) {
                        if (g10 != null) {
                            g10.p(false, false);
                        }
                        signinFragment.f33198b = null;
                    }
                    G0 g11 = new G0();
                    signinFragment.f33198b = g11;
                    g11.v(signinFragment.getParentFragmentManager(), "SignInLoader");
                } else if (kotlin.jvm.internal.i.a(preloaderState2, PreloaderState.d.f32643a)) {
                    SigninFragment signinFragment2 = this.this$0;
                    List<String> list = SigninFragment.f33197n;
                    G0 g12 = signinFragment2.f33198b;
                    if (g12 != null) {
                        g12.p(false, false);
                    }
                    signinFragment2.f33198b = null;
                } else {
                    O.e.D("SigninFragment", "Unknown inProgress type");
                }
                return r.f47939a;
            }
        }));
        o().f33227B.e(getViewLifecycleOwner(), new b(new Ia.l<com.voltasit.obdeleven.presentation.signIn.b.a, r>() { // from class: com.voltasit.obdeleven.presentation.signIn.SigninFragment$setupObservers$11
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(b.a aVar) {
                b.a aVar2 = aVar;
                SigninFragment signinFragment = this.this$0;
                final String str = aVar2.f33248a;
                List<String> list = SigninFragment.f33197n;
                signinFragment.getClass();
                ParseUser.logOutInBackground();
                androidx.appcompat.app.e.a positiveButton = new androidx.appcompat.app.e.a(signinFragment.requireActivity(), R.style.EmailVerifyDialogTheme).setMessage(R.string.toast_verify_email).setCancelable(false).setPositiveButton(R.string.common_ok, (DialogInterface.OnClickListener) null);
                final String str2 = aVar2.f33249b;
                positiveButton.setNegativeButton(R.string.view_signin_resend_verification, new DialogInterface.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.signIn.f
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        List<String> list2 = SigninFragment.f33197n;
                        String email = str;
                        kotlin.jvm.internal.i.e(email, "$email");
                        String password = str2;
                        kotlin.jvm.internal.i.e(password, "$password");
                        ParseUser.logInInBackground(email, password, new g());
                    }
                }).show();
                return r.f47939a;
            }
        }));
        o().f33235J.e(getViewLifecycleOwner(), new b(new Ia.l<Integer, r>() { // from class: com.voltasit.obdeleven.presentation.signIn.SigninFragment$setupObservers$12
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Integer num) {
                Integer num2 = num;
                SigninFragment signinFragment = this.this$0;
                kotlin.jvm.internal.i.b(num2);
                List<String> list = SigninFragment.f33197n;
                new androidx.appcompat.app.e.a(signinFragment.requireContext(), R.style.EmailVerifyDialogTheme).setCancelable(true).setMessage(signinFragment.getString(R.string.dialog_too_many_sessions_message, num2)).setTitle(R.string.dialog_too_many_sessions_title).setPositiveButton(R.string.common_ok, (DialogInterface.OnClickListener) null).setNeutralButton(R.string.common_password_reset, new com.voltasit.obdeleven.presentation.dialogs.h(signinFragment, 1)).show();
                return r.f47939a;
            }
        }));
        return view;
    }

    public final void p() {
        EditText editText = this.f33200d;
        kotlin.jvm.internal.i.b(editText);
        String string = editText.getText().toString();
        int length = string.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = kotlin.jvm.internal.i.g(string.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                } else {
                    length--;
                }
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        String string2 = string.subSequence(i10, length + 1).toString();
        a aVar = this.f33207l;
        kotlin.jvm.internal.i.b(aVar);
        aVar.j(string2, false);
    }
}
