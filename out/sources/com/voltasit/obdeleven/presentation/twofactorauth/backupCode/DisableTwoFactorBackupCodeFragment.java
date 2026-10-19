package com.voltasit.obdeleven.presentation.twofactorauth.backupCode;

import B8.AbstractC0619c0;
import Ia.l;
import M0.h;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.D;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.Positionable$Position;
import com.voltasit.obdeleven.presentation.profile.ProfileFragment;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import com.voltasit.obdeleven.utils.NavigationManager;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.i;
import p293xa.e;
import p293xa.r;

/* JADX INFO: compiled from: DisableTwoFactorBackupCodeFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DisableTwoFactorBackupCodeFragment extends BaseFragment<AbstractC0619c0> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f33298l = "DisableTwoFactorBackupCodeFragment";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f33299m = R.layout.fragment_disable_two_factor_auth_backup;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f33300n;

    /* JADX INFO: compiled from: DisableTwoFactorBackupCodeFragment.kt */
    public static final class a implements D, f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lambda f33301b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l lVar) {
            this.f33301b = (Lambda) lVar;
        }

        @Override // kotlin.jvm.internal.f
        public final e<?> b() {
            return this.f33301b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        @Override // androidx.lifecycle.D
        public final /* synthetic */ void d(Object obj) {
            this.f33301b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof D) || !(obj instanceof f)) {
                return false;
            }
            return this.f33301b.equals(((f) obj).b());
        }

        public final int hashCode() {
            return this.f33301b.hashCode();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.voltasit.obdeleven.presentation.twofactorauth.backupCode.DisableTwoFactorBackupCodeFragment$special$$inlined$viewModel$default$1] */
    public DisableTwoFactorBackupCodeFragment() {
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.presentation.twofactorauth.backupCode.DisableTwoFactorBackupCodeFragment$special$$inlined$viewModel$default$1
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
        this.f33300n = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<DisableTwoFactorBackupCodeViewModel>(this) { // from class: com.voltasit.obdeleven.presentation.twofactorauth.backupCode.DisableTwoFactorBackupCodeFragment$special$$inlined$viewModel$default$2
            final /* synthetic */ Fragment $this_viewModel;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $extrasProducer = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.twofactorauth.backupCode.DisableTwoFactorBackupCodeViewModel] */
            @Override // Ia.a
            public final DisableTwoFactorBackupCodeViewModel invoke() {
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
                return Gb.a.a(kotlin.jvm.internal.l.a(DisableTwoFactorBackupCodeViewModel.class), viewModelStore, null, defaultViewModelCreationExtras, aVar, Cb.a.i(fragment), aVar4);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final void C(h hVar) {
        final AbstractC0619c0 abstractC0619c0 = (AbstractC0619c0) hVar;
        ?? r10 = this.f33300n;
        z((DisableTwoFactorBackupCodeViewModel) r10.getValue());
        ((DisableTwoFactorBackupCodeViewModel) r10.getValue()).f33311x.e(getViewLifecycleOwner(), new a(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.twofactorauth.backupCode.DisableTwoFactorBackupCodeFragment$onCreateView$1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                NavigationManager.i(this.this$0.r(), ProfileFragment.class, false);
                return r.f47939a;
            }
        }));
        ((DisableTwoFactorBackupCodeViewModel) r10.getValue()).f33305r.e(getViewLifecycleOwner(), new a(new l<Integer, r>() { // from class: com.voltasit.obdeleven.presentation.twofactorauth.backupCode.DisableTwoFactorBackupCodeFragment$onCreateView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Integer num) {
                Integer num2 = num;
                if (num2 != null && num2.intValue() == -1) {
                    abstractC0619c0.f1879t.setText("");
                } else {
                    TextView textView = abstractC0619c0.f1879t;
                    DisableTwoFactorBackupCodeFragment disableTwoFactorBackupCodeFragment = this;
                    i.b(num2);
                    textView.setText(disableTwoFactorBackupCodeFragment.getString(num2.intValue()));
                }
                return r.f47939a;
            }
        }));
        ((DisableTwoFactorBackupCodeViewModel) r10.getValue()).f33309v.e(getViewLifecycleOwner(), new a(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.twofactorauth.backupCode.DisableTwoFactorBackupCodeFragment$onCreateView$3
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                this.this$0.r().g("https://support.obdeleven.com/en/articles/5627134-how-to-set-up-2-step-authentication-2fa");
                return r.f47939a;
            }
        }));
        abstractC0619c0.t((DisableTwoFactorBackupCodeViewModel) r10.getValue());
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return this.f33298l;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final int p() {
        return this.f33299m;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final Positionable$Position t() {
        return Positionable$Position.f31108d;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        String string = getString(R.string.view_profile_2_step_auth);
        i.d(string, "getString(...)");
        return string;
    }
}
