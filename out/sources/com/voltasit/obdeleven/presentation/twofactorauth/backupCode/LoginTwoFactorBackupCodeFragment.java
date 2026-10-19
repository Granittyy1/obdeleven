package com.voltasit.obdeleven.presentation.twofactorauth.backupCode;

import B8.AbstractC0619c0;
import G8.r;
import Ia.l;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC1347l;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.D;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.presentation.controlUnit.j;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import com.voltasit.obdeleven.ui.activity.LoginActivity;
import com.voltasit.obdeleven.ui.dialogs.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.i;
import p186p0.d;
import p220r9.P;
import p293xa.e;

/* JADX INFO: compiled from: LoginTwoFactorBackupCodeFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class LoginTwoFactorBackupCodeFragment extends Fragment implements DialogCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC0619c0 f33313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public G0 f33314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f33315d;

    /* JADX INFO: compiled from: LoginTwoFactorBackupCodeFragment.kt */
    public static final class a implements D, f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lambda f33316b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l lVar) {
            this.f33316b = (Lambda) lVar;
        }

        @Override // kotlin.jvm.internal.f
        public final e<?> b() {
            return this.f33316b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        @Override // androidx.lifecycle.D
        public final /* synthetic */ void d(Object obj) {
            this.f33316b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof D) || !(obj instanceof f)) {
                return false;
            }
            return this.f33316b.equals(((f) obj).b());
        }

        public final int hashCode() {
            return this.f33316b.hashCode();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.voltasit.obdeleven.presentation.twofactorauth.backupCode.LoginTwoFactorBackupCodeFragment$special$$inlined$viewModel$default$1] */
    public LoginTwoFactorBackupCodeFragment() {
        final Ia.a<Ob.a> aVar = new Ia.a<Ob.a>() { // from class: com.voltasit.obdeleven.presentation.twofactorauth.backupCode.LoginTwoFactorBackupCodeFragment$loginTwoFactorBackupCodeViewModel$2
            {
                super(0);
            }

            @Override // Ia.a
            public final Ob.a invoke() {
                Object aVar2;
                Bundle arguments = this.this$0.getArguments();
                if (arguments == null || (aVar2 = arguments.getParcelable("login_data")) == null) {
                    aVar2 = new r.a("", "");
                }
                return I.e.j(aVar2);
            }
        };
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.presentation.twofactorauth.backupCode.LoginTwoFactorBackupCodeFragment$special$$inlined$viewModel$default$1
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
        this.f33315d = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<b>(this) { // from class: com.voltasit.obdeleven.presentation.twofactorauth.backupCode.LoginTwoFactorBackupCodeFragment$special$$inlined$viewModel$default$2
            final /* synthetic */ Fragment $this_viewModel;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $extrasProducer = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.twofactorauth.backupCode.b] */
            @Override // Ia.a
            public final b invoke() {
                p014b1.a defaultViewModelCreationExtras;
                Fragment fragment = this.$this_viewModel;
                Pb.a aVar2 = this.$qualifier;
                Ia.a aVar3 = r10;
                Ia.a aVar4 = this.$extrasProducer;
                Ia.a aVar5 = aVar;
                b0 viewModelStore = ((c0) aVar3.invoke()).getViewModelStore();
                if (aVar4 == null || (defaultViewModelCreationExtras = (p014b1.a) aVar4.invoke()) == null) {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    i.d(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
                }
                return Gb.a.a(kotlin.jvm.internal.l.a(b.class), viewModelStore, null, defaultViewModelCreationExtras, aVar2, Cb.a.i(fragment), aVar5);
            }
        });
    }

    @Override // com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String dialogId, DialogCallback.CallbackType callbackType, Bundle data) {
        p303y8.a aVar;
        i.e(dialogId, "dialogId");
        i.e(data, "data");
        if (dialogId.equals("EnableTwoFactorDialog")) {
            int iOrdinal = callbackType.ordinal();
            if (iOrdinal == 0) {
                d activity = getActivity();
                aVar = activity instanceof p303y8.a ? (p303y8.a) activity : null;
                if (aVar != null) {
                    aVar.d(false);
                    return;
                }
                return;
            }
            if (iOrdinal != 1) {
                return;
            }
            d activity2 = getActivity();
            aVar = activity2 instanceof p303y8.a ? (p303y8.a) activity2 : null;
            if (aVar != null) {
                aVar.d(true);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    public final b o() {
        return (b) this.f33315d.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        p100i.a supportActionBar;
        p100i.a supportActionBar2;
        i.e(inflater, "inflater");
        int i10 = AbstractC0619c0.f1876y;
        AbstractC0619c0 abstractC0619c0 = (AbstractC0619c0) M0.e.a(inflater, R.layout.fragment_disable_two_factor_auth_backup, viewGroup, false, null);
        i.d(abstractC0619c0, "inflate(...)");
        this.f33313b = abstractC0619c0;
        o().f33321C.e(getViewLifecycleOwner(), new a(new l<p293xa.r, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.twofactorauth.backupCode.LoginTwoFactorBackupCodeFragment.onCreateView.1
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(p293xa.r rVar) {
                new com.voltasit.obdeleven.presentation.dialogs.a(0).J(LoginTwoFactorBackupCodeFragment.this);
                return p293xa.r.f47939a;
            }
        }));
        o().f33305r.e(getViewLifecycleOwner(), new a(new l<Integer, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.twofactorauth.backupCode.LoginTwoFactorBackupCodeFragment.onCreateView.2
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Integer num) {
                Integer num2 = num;
                if (num2 != null && num2.intValue() == -1) {
                    AbstractC0619c0 abstractC0619c1 = LoginTwoFactorBackupCodeFragment.this.f33313b;
                    if (abstractC0619c1 == null) {
                        i.m("binding");
                        throw null;
                    }
                    abstractC0619c1.f1879t.setText("");
                } else {
                    LoginTwoFactorBackupCodeFragment loginTwoFactorBackupCodeFragment = LoginTwoFactorBackupCodeFragment.this;
                    AbstractC0619c0 abstractC0619c2 = loginTwoFactorBackupCodeFragment.f33313b;
                    if (abstractC0619c2 == null) {
                        i.m("binding");
                        throw null;
                    }
                    i.b(num2);
                    abstractC0619c2.f1879t.setText(loginTwoFactorBackupCodeFragment.getString(num2.intValue()));
                }
                return p293xa.r.f47939a;
            }
        }));
        o().f32114c.e(getViewLifecycleOwner(), new a(new l<PreloaderState, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.twofactorauth.backupCode.LoginTwoFactorBackupCodeFragment.onCreateView.3
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(PreloaderState preloaderState) {
                PreloaderState preloaderState2 = preloaderState;
                if (i.a(preloaderState2, PreloaderState.c.f32642a)) {
                    LoginTwoFactorBackupCodeFragment loginTwoFactorBackupCodeFragment = LoginTwoFactorBackupCodeFragment.this;
                    G0 g10 = loginTwoFactorBackupCodeFragment.f33314c;
                    if (g10 != null) {
                        if (g10 != null) {
                            g10.p(false, false);
                        }
                        loginTwoFactorBackupCodeFragment.f33314c = null;
                    }
                    G0 g11 = new G0();
                    loginTwoFactorBackupCodeFragment.f33314c = g11;
                    g11.v(loginTwoFactorBackupCodeFragment.getParentFragmentManager(), "backup_login_loader");
                } else if (i.a(preloaderState2, PreloaderState.d.f32643a)) {
                    LoginTwoFactorBackupCodeFragment loginTwoFactorBackupCodeFragment2 = LoginTwoFactorBackupCodeFragment.this;
                    G0 g12 = loginTwoFactorBackupCodeFragment2.f33314c;
                    if (g12 != null) {
                        g12.p(false, false);
                    }
                    loginTwoFactorBackupCodeFragment2.f33314c = null;
                } else if (!(preloaderState2 instanceof PreloaderState.a)) {
                    boolean z10 = preloaderState2 instanceof PreloaderState.b;
                }
                return p293xa.r.f47939a;
            }
        }));
        o().f32120i.e(getViewLifecycleOwner(), new a(new l<Integer, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.twofactorauth.backupCode.LoginTwoFactorBackupCodeFragment.onCreateView.4
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Integer num) {
                Integer num2 = num;
                ActivityC1347l activityC1347lRequireActivity = LoginTwoFactorBackupCodeFragment.this.requireActivity();
                i.b(num2);
                P.b(activityC1347lRequireActivity, num2.intValue());
                return p293xa.r.f47939a;
            }
        }));
        o().f32121k.e(getViewLifecycleOwner(), new a(new l<String, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.twofactorauth.backupCode.LoginTwoFactorBackupCodeFragment.onCreateView.5
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(String str) {
                P.a(LoginTwoFactorBackupCodeFragment.this.requireActivity(), str);
                return p293xa.r.f47939a;
            }
        }));
        o().f33309v.e(getViewLifecycleOwner(), new a(new l<p293xa.r, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.twofactorauth.backupCode.LoginTwoFactorBackupCodeFragment.onCreateView.6
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(p293xa.r rVar) {
                try {
                    LoginTwoFactorBackupCodeFragment.this.requireActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://support.obdeleven.com/en/articles/5627134-how-to-set-up-2-step-authentication-2fa")));
                } catch (ActivityNotFoundException e10) {
                    O.e.m(e10);
                }
                return p293xa.r.f47939a;
            }
        }));
        o().f33323E.e(getViewLifecycleOwner(), new a(new l<Integer, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.twofactorauth.backupCode.LoginTwoFactorBackupCodeFragment.onCreateView.7
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Integer num) {
                Integer num2 = num;
                LoginTwoFactorBackupCodeFragment loginTwoFactorBackupCodeFragment = LoginTwoFactorBackupCodeFragment.this;
                i.b(num2);
                new androidx.appcompat.app.e.a(loginTwoFactorBackupCodeFragment.requireContext(), R.style.EmailVerifyDialogTheme).setCancelable(true).setMessage(loginTwoFactorBackupCodeFragment.getString(R.string.dialog_too_many_sessions_message, num2)).setTitle(R.string.dialog_too_many_sessions_title).setPositiveButton(R.string.common_ok, (DialogInterface.OnClickListener) null).setNeutralButton(R.string.common_password_reset, new com.voltasit.obdeleven.presentation.twofactorauth.backupCode.a(loginTwoFactorBackupCodeFragment, 0)).show();
                return p293xa.r.f47939a;
            }
        }));
        AbstractC0619c0 abstractC0619c1 = this.f33313b;
        if (abstractC0619c1 == null) {
            i.m("binding");
            throw null;
        }
        abstractC0619c1.t(o());
        AbstractC0619c0 abstractC0619c2 = this.f33313b;
        if (abstractC0619c2 == null) {
            i.m("binding");
            throw null;
        }
        abstractC0619c2.q(getViewLifecycleOwner());
        AbstractC0619c0 abstractC0619c3 = this.f33313b;
        if (abstractC0619c3 == null) {
            i.m("binding");
            throw null;
        }
        abstractC0619c3.f1882w.setVisibility(0);
        ActivityC1347l activity = getActivity();
        LoginActivity loginActivity = activity instanceof LoginActivity ? (LoginActivity) activity : null;
        if (loginActivity != null) {
            AbstractC0619c0 abstractC0619c4 = this.f33313b;
            if (abstractC0619c4 == null) {
                i.m("binding");
                throw null;
            }
            loginActivity.setSupportActionBar(abstractC0619c4.f1882w);
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
        AbstractC0619c0 abstractC0619c5 = this.f33313b;
        if (abstractC0619c5 == null) {
            i.m("binding");
            throw null;
        }
        abstractC0619c5.f1882w.setNavigationOnClickListener(new j(1, this));
        AbstractC0619c0 abstractC0619c6 = this.f33313b;
        if (abstractC0619c6 == null) {
            i.m("binding");
            throw null;
        }
        View view = abstractC0619c6.f4488d;
        i.d(view, "getRoot(...)");
        return view;
    }
}
