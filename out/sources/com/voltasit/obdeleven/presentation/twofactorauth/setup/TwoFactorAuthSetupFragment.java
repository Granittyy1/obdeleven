package com.voltasit.obdeleven.presentation.twofactorauth.setup;

import B8.AbstractC0661x0;
import Ia.l;
import X5.ViewOnClickListenerC0832a;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.core.view.O;
import androidx.core.view.Z;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.D;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.models.Screen;
import com.voltasit.obdeleven.interfaces.Positionable$Position;
import com.voltasit.obdeleven.presentation.dialogs.devicePassword.b;
import com.voltasit.obdeleven.presentation.twofactorauth.verify.TwoFactorAuthVerifyFragment;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import com.voltasit.obdeleven.utils.NavigationManager;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.i;
import p220r9.C2786s;
import p293xa.e;
import p293xa.r;

/* JADX INFO: compiled from: TwoFactorAuthSetupFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public class TwoFactorAuthSetupFragment extends BaseFragment<AbstractC0661x0> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f33326l = R.layout.fragment_two_factor_auth_setup;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f33327m;

    /* JADX INFO: compiled from: TwoFactorAuthSetupFragment.kt */
    public static final class a implements D, f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lambda f33328b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l lVar) {
            this.f33328b = (Lambda) lVar;
        }

        @Override // kotlin.jvm.internal.f
        public final e<?> b() {
            return this.f33328b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        @Override // androidx.lifecycle.D
        public final /* synthetic */ void d(Object obj) {
            this.f33328b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof D) || !(obj instanceof f)) {
                return false;
            }
            return this.f33328b.equals(((f) obj).b());
        }

        public final int hashCode() {
            return this.f33328b.hashCode();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.voltasit.obdeleven.presentation.twofactorauth.setup.TwoFactorAuthSetupFragment$special$$inlined$viewModel$default$1] */
    public TwoFactorAuthSetupFragment() {
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.presentation.twofactorauth.setup.TwoFactorAuthSetupFragment$special$$inlined$viewModel$default$1
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
        this.f33327m = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<TwoFactorAuthSetupViewModel>(this) { // from class: com.voltasit.obdeleven.presentation.twofactorauth.setup.TwoFactorAuthSetupFragment$special$$inlined$viewModel$default$2
            final /* synthetic */ Fragment $this_viewModel;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $extrasProducer = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.twofactorauth.setup.TwoFactorAuthSetupViewModel] */
            @Override // Ia.a
            public final TwoFactorAuthSetupViewModel invoke() {
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
                return Gb.a.a(kotlin.jvm.internal.l.a(TwoFactorAuthSetupViewModel.class), viewModelStore, null, defaultViewModelCreationExtras, aVar, Cb.a.i(fragment), aVar4);
            }
        });
    }

    public void O() {
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("popToMainFragment") : null;
        i.c(serializable, "null cannot be cast to non-null type com.voltasit.obdeleven.domain.models.Screen");
        NavigationManager navigationManagerR = r();
        TwoFactorAuthVerifyFragment twoFactorAuthVerifyFragment = new TwoFactorAuthVerifyFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("popToMainFragment", (Screen) serializable);
        twoFactorAuthVerifyFragment.setArguments(bundle);
        navigationManagerR.n(twoFactorAuthVerifyFragment, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void C(final AbstractC0661x0 abstractC0661x0) {
        ?? r10 = this.f33327m;
        z((TwoFactorAuthSetupViewModel) r10.getValue());
        abstractC0661x0.f2187t.setOnClickListener(new ViewOnClickListenerC0832a(1, this));
        ((TwoFactorAuthSetupViewModel) r10.getValue()).f33334t.e(getViewLifecycleOwner(), new a(new l<Integer, r>() { // from class: com.voltasit.obdeleven.presentation.twofactorauth.setup.TwoFactorAuthSetupFragment$onCreateView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Integer num) {
                Integer num2 = num;
                TwoFactorAuthSetupFragment twoFactorAuthSetupFragment = this.this$0;
                Button copyCodeButton = abstractC0661x0.f2187t;
                i.d(copyCodeButton, "copyCodeButton");
                i.b(num2);
                int iIntValue = num2.intValue();
                twoFactorAuthSetupFragment.getClass();
                int iA = C2786s.a(twoFactorAuthSetupFragment.getResources(), 10.0f);
                int iA2 = C2786s.a(twoFactorAuthSetupFragment.getResources(), 20.0f);
                Snackbar snackbarH = Snackbar.h(copyCodeButton, twoFactorAuthSetupFragment.getText(iIntValue), 500);
                Drawable drawableB = p186p0.a.C0517a.b(snackbarH.f27395h, R.drawable.rounded_corners);
                BaseTransientBottomBar.g gVar = snackbarH.f27396i;
                gVar.setBackground(drawableB);
                BaseTransientBottomBar.d dVar = snackbarH.f27398l;
                if (dVar != null) {
                    dVar.a();
                }
                BaseTransientBottomBar.d dVar2 = new BaseTransientBottomBar.d(snackbarH, copyCodeButton);
                WeakHashMap<View, Z> weakHashMap = O.f16859a;
                if (copyCodeButton.isAttachedToWindow()) {
                    copyCodeButton.getViewTreeObserver().addOnGlobalLayoutListener(dVar2);
                }
                copyCodeButton.addOnAttachStateChangeListener(dVar2);
                snackbarH.f27398l = dVar2;
                ((SnackbarContentLayout) gVar.getChildAt(0)).getMessageView().setTextColor(p0.a.b.a(twoFactorAuthSetupFragment.requireContext(), R.color.black));
                gVar.setAnimationMode(1);
                snackbarH.i();
                try {
                    Field declaredField = Snackbar.class.getSuperclass().getDeclaredField("originalMargins");
                    i.d(declaredField, "getDeclaredField(...)");
                    declaredField.setAccessible(true);
                    Rect rect = new Rect();
                    rect.bottom = iA2;
                    rect.left = iA;
                    rect.right = iA;
                    declaredField.set(snackbarH, rect);
                } catch (ClassNotFoundException unused) {
                    O.e.j("MainActivityFragment", "fixSnackBarMarginBottomBug error.");
                } catch (IllegalAccessException unused2) {
                    O.e.j("MainActivityFragment", "fixSnackBarMarginBottomBug error.");
                } catch (NoSuchFieldException unused3) {
                    O.e.j("MainActivityFragment", "fixSnackBarMarginBottomBug error.");
                }
                return r.f47939a;
            }
        }));
        ((TwoFactorAuthSetupViewModel) r10.getValue()).f33332r.e(getViewLifecycleOwner(), new a(new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.twofactorauth.setup.TwoFactorAuthSetupFragment$onCreateView$3
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(String str) {
                abstractC0661x0.f2185r.setText(str);
                return r.f47939a;
            }
        }));
        abstractC0661x0.f2186s.setOnClickListener(new b(this, 1));
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public String o() {
        return "TwoFactorAuthSetupFragment";
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final int p() {
        return this.f33326l;
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
