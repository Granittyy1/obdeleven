package com.voltasit.obdeleven.presentation.twofactorauth.verify;

import B8.AbstractC0665z0;
import Ia.l;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.D;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import com.google.android.material.textfield.TextInputEditText;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.models.Screen;
import com.voltasit.obdeleven.interfaces.Positionable$Position;
import com.voltasit.obdeleven.presentation.profile.ProfileFragment;
import com.voltasit.obdeleven.presentation.twofactorauth.backup.TwoFactorAuthBackupFragment;
import com.voltasit.obdeleven.presentation.twofactorauth.backupCode.DisableTwoFactorBackupCodeFragment;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import com.voltasit.obdeleven.utils.NavigationManager;
import java.io.Serializable;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2680e;
import p293xa.r;

/* JADX INFO: compiled from: TwoFactorAuthVerifyFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public class TwoFactorAuthVerifyFragment extends BaseFragment<AbstractC0665z0> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f33335l = "TwoFactorAuthPasswordFragment";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f33336m = R.layout.fragment_two_factor_auth_verify;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f33337n;

    /* JADX INFO: compiled from: TwoFactorAuthVerifyFragment.kt */
    public static final class b implements D, f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lambda f33339b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(l lVar) {
            this.f33339b = (Lambda) lVar;
        }

        @Override // kotlin.jvm.internal.f
        public final p293xa.e<?> b() {
            return this.f33339b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        @Override // androidx.lifecycle.D
        public final /* synthetic */ void d(Object obj) {
            this.f33339b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof D) || !(obj instanceof f)) {
                return false;
            }
            return this.f33339b.equals(((f) obj).b());
        }

        public final int hashCode() {
            return this.f33339b.hashCode();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.voltasit.obdeleven.presentation.twofactorauth.verify.TwoFactorAuthVerifyFragment$special$$inlined$viewModel$default$1] */
    public TwoFactorAuthVerifyFragment() {
        final Ia.a<Ob.a> aVar = new Ia.a<Ob.a>() { // from class: com.voltasit.obdeleven.presentation.twofactorauth.verify.TwoFactorAuthVerifyFragment$twoFactorVerifyViewModel$2
            {
                super(0);
            }

            @Override // Ia.a
            public final Ob.a invoke() {
                String string;
                Bundle arguments = this.this$0.getArguments();
                if (arguments == null || (string = arguments.getString("key_flow_type")) == null) {
                    string = "value_enable_2fa";
                }
                return I.e.j(string);
            }
        };
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.presentation.twofactorauth.verify.TwoFactorAuthVerifyFragment$special$$inlined$viewModel$default$1
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
        this.f33337n = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<e>(this) { // from class: com.voltasit.obdeleven.presentation.twofactorauth.verify.TwoFactorAuthVerifyFragment$special$$inlined$viewModel$default$2
            final /* synthetic */ Fragment $this_viewModel;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $extrasProducer = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.twofactorauth.verify.e] */
            @Override // Ia.a
            public final e invoke() {
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
                return Gb.a.a(kotlin.jvm.internal.l.a(e.class), viewModelStore, null, defaultViewModelCreationExtras, aVar2, Cb.a.i(fragment), aVar5);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    public final e O() {
        return (e) this.f33337n.getValue();
    }

    public void P(String backupCode) {
        i.e(backupCode, "backupCode");
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("popToMainFragment") : null;
        i.c(serializable, "null cannot be cast to non-null type com.voltasit.obdeleven.domain.models.Screen");
        NavigationManager navigationManagerR = r();
        TwoFactorAuthBackupFragment twoFactorAuthBackupFragment = new TwoFactorAuthBackupFragment();
        Bundle bundle = new Bundle();
        bundle.putString("key_backup_code", backupCode);
        bundle.putSerializable("popToMainFragment", (Screen) serializable);
        twoFactorAuthBackupFragment.setArguments(bundle);
        navigationManagerR.n(twoFactorAuthBackupFragment, null);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void C(final AbstractC0665z0 abstractC0665z0) {
        z(O());
        O().f33355v.e(getViewLifecycleOwner(), new b(new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.twofactorauth.verify.TwoFactorAuthVerifyFragment$setupNavigation$1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(String str) {
                String str2 = str;
                TwoFactorAuthVerifyFragment twoFactorAuthVerifyFragment = this.this$0;
                i.b(str2);
                twoFactorAuthVerifyFragment.P(str2);
                return r.f47939a;
            }
        }));
        O().f33357x.e(getViewLifecycleOwner(), new b(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.twofactorauth.verify.TwoFactorAuthVerifyFragment$setupNavigation$2
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                NavigationManager.i(this.this$0.r(), ProfileFragment.class, false);
                return r.f47939a;
            }
        }));
        O().f33353t.e(getViewLifecycleOwner(), new b(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.twofactorauth.verify.TwoFactorAuthVerifyFragment$setupNavigation$3
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                this.this$0.r().n(new DisableTwoFactorBackupCodeFragment(), null);
                return r.f47939a;
            }
        }));
        O().f33359z.e(getViewLifecycleOwner(), new b(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.twofactorauth.verify.TwoFactorAuthVerifyFragment$setupNavigation$4
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                this.this$0.r().g("https://support.obdeleven.com/en/articles/5627134-how-to-set-up-2-step-authentication-2fa");
                return r.f47939a;
            }
        }));
        O().f33347B.e(getViewLifecycleOwner(), new b(new l<Integer, r>() { // from class: com.voltasit.obdeleven.presentation.twofactorauth.verify.TwoFactorAuthVerifyFragment$onCreateView$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Integer num) {
                Integer num2 = num;
                TextView textView = abstractC0665z0.f2214u;
                TwoFactorAuthVerifyFragment twoFactorAuthVerifyFragment = this;
                i.b(num2);
                textView.setText(twoFactorAuthVerifyFragment.getString(num2.intValue()));
                return r.f47939a;
            }
        }));
        TextView backupButton = abstractC0665z0.f2211r;
        i.d(backupButton, "backupButton");
        Bundle arguments = getArguments();
        backupButton.setVisibility(i.a(arguments != null ? arguments.getString("key_flow_type") : null, "value_disable_2fa") ? 0 : 8);
        abstractC0665z0.f2215v.setOnClickListener(new com.voltasit.obdeleven.presentation.twofactorauth.verify.a(0, this));
        abstractC0665z0.f2213t.setOnClickListener(new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.twofactorauth.verify.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String string;
                TwoFactorAuthVerifyFragment this$0 = this;
                i.e(this$0, "this$0");
                AbstractC0665z0 abstractC0665z1 = abstractC0665z0;
                e eVarO = this$0.O();
                Editable text = abstractC0665z1.f2212s.getText();
                if (text == null || (string = text.toString()) == null) {
                    string = "";
                }
                eVarO.getClass();
                C2680e.c(Z.a(eVarO), eVarO.f32112a, null, new TwoFactorVerifyViewModel$clickContinue$1(eVarO, string, null), 2);
            }
        });
        backupButton.setOnClickListener(new c(0, this));
        TextInputEditText codeInput = abstractC0665z0.f2212s;
        i.d(codeInput, "codeInput");
        codeInput.addTextChangedListener(new a(abstractC0665z0));
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public String o() {
        return this.f33335l;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final int p() {
        return this.f33336m;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final Positionable$Position t() {
        return Positionable$Position.f31108d;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public String u() {
        return getString(R.string.view_profile_2_step_auth);
    }

    /* JADX INFO: compiled from: TextView.kt */
    public static final class a implements TextWatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC0665z0 f33338b;

        public a(AbstractC0665z0 abstractC0665z0) {
            this.f33338b = abstractC0665z0;
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            Button button = this.f33338b.f2213t;
            boolean z10 = false;
            if (charSequence != null && charSequence.length() == 6) {
                z10 = true;
            }
            button.setEnabled(z10);
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
