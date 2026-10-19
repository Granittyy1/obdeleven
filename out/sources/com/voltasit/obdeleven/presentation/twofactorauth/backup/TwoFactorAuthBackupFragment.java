package com.voltasit.obdeleven.presentation.twofactorauth.backup;

import B8.AbstractC0653t0;
import Ia.l;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.D;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.models.Screen;
import com.voltasit.obdeleven.interfaces.Positionable$Position;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import com.voltasit.obdeleven.utils.NavigationManager;
import java.io.Serializable;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.i;
import p035c9.c;
import p293xa.e;
import p293xa.r;

/* JADX INFO: compiled from: TwoFactorAuthBackupFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public class TwoFactorAuthBackupFragment extends BaseFragment<AbstractC0653t0> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f33291l = "TwoFactorAuthPasswordFragment";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f33292m = R.layout.fragment_two_factor_auth_backup;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f33293n;

    /* JADX INFO: compiled from: TwoFactorAuthBackupFragment.kt */
    public static final class a implements D, f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f33294b;

        public a(l lVar) {
            this.f33294b = lVar;
        }

        @Override // kotlin.jvm.internal.f
        public final e<?> b() {
            return this.f33294b;
        }

        @Override // androidx.lifecycle.D
        public final /* synthetic */ void d(Object obj) {
            this.f33294b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof D) || !(obj instanceof f)) {
                return false;
            }
            return this.f33294b.equals(((f) obj).b());
        }

        public final int hashCode() {
            return this.f33294b.hashCode();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.voltasit.obdeleven.presentation.twofactorauth.backup.TwoFactorAuthBackupFragment$special$$inlined$viewModel$default$1] */
    public TwoFactorAuthBackupFragment() {
        final Ia.a<Ob.a> aVar = new Ia.a<Ob.a>() { // from class: com.voltasit.obdeleven.presentation.twofactorauth.backup.TwoFactorAuthBackupFragment$twoFactorBackupViewModel$2
            {
                super(0);
            }

            @Override // Ia.a
            public final Ob.a invoke() {
                String string;
                Bundle arguments = this.this$0.getArguments();
                if (arguments == null || (string = arguments.getString("key_backup_code")) == null) {
                    string = "";
                }
                return I.e.j(string);
            }
        };
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.presentation.twofactorauth.backup.TwoFactorAuthBackupFragment$special$$inlined$viewModel$default$1
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
        this.f33293n = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<b>(this) { // from class: com.voltasit.obdeleven.presentation.twofactorauth.backup.TwoFactorAuthBackupFragment$special$$inlined$viewModel$default$2
            final /* synthetic */ Fragment $this_viewModel;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $extrasProducer = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.twofactorauth.backup.b] */
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

    public void O() {
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("popToMainFragment") : null;
        i.c(serializable, "null cannot be cast to non-null type com.voltasit.obdeleven.domain.models.Screen");
        NavigationManager navigationManagerR = r();
        c cVar = new c();
        Bundle bundle = new Bundle();
        bundle.putSerializable("popToMainFragment", (Screen) serializable);
        cVar.setArguments(bundle);
        navigationManagerR.n(cVar, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void C(AbstractC0653t0 abstractC0653t0) {
        ?? r10 = this.f33293n;
        z((b) r10.getValue());
        ((b) r10.getValue()).f33297q.e(getViewLifecycleOwner(), new a(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.twofactorauth.backup.TwoFactorAuthBackupFragment$onCreateView$1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                this.this$0.O();
                return r.f47939a;
            }
        }));
        abstractC0653t0.t((b) r10.getValue());
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public String o() {
        return this.f33291l;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final int p() {
        return this.f33292m;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final Positionable$Position t() {
        return Positionable$Position.f31108d;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public String u() {
        return getString(R.string.view_profile_2_step_auth);
    }
}
