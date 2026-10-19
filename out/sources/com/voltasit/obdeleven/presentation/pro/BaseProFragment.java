package com.voltasit.obdeleven.presentation.pro;

import Ia.l;
import M0.h;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import androidx.lifecycle.D;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.models.SubscriptionType;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.presentation.controlUnit.u;
import com.voltasit.obdeleven.presentation.dialogs.j;
import com.voltasit.obdeleven.ui.dialogs.C2177w0;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2673a0;
import kotlinx.coroutines.C2680e;
import p220r9.P;
import p293xa.e;
import p293xa.r;

/* JADX INFO: compiled from: BaseProFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseProFragment<T extends h> extends BaseFragment<T> implements DialogCallback {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f32790l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C2177w0 f32791m;

    /* JADX INFO: compiled from: BaseProFragment.kt */
    public static final class a implements D, f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lambda f32792b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l lVar) {
            this.f32792b = (Lambda) lVar;
        }

        @Override // kotlin.jvm.internal.f
        public final e<?> b() {
            return this.f32792b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        @Override // androidx.lifecycle.D
        public final /* synthetic */ void d(Object obj) {
            this.f32792b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof D) || !(obj instanceof f)) {
                return false;
            }
            return this.f32792b.equals(((f) obj).b());
        }

        public final int hashCode() {
            return this.f32792b.hashCode();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.voltasit.obdeleven.presentation.pro.BaseProFragment$special$$inlined$viewModel$default$1] */
    public BaseProFragment() {
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.presentation.pro.BaseProFragment$special$$inlined$viewModel$default$1
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
        this.f32790l = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<ProViewModel>(this) { // from class: com.voltasit.obdeleven.presentation.pro.BaseProFragment$special$$inlined$viewModel$default$2
            final /* synthetic */ Fragment $this_viewModel;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $extrasProducer = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.pro.ProViewModel] */
            @Override // Ia.a
            public final ProViewModel invoke() {
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
                return Gb.a.a(kotlin.jvm.internal.l.a(ProViewModel.class), viewModelStore, null, defaultViewModelCreationExtras, aVar, Cb.a.i(fragment), aVar4);
            }
        });
    }

    public static void S(BaseProFragment baseProFragment, FloatingActionButton fab) {
        baseProFragment.getClass();
        i.e(fab, "fab");
        baseProFragment.R(fab, null, true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    public final ProViewModel O() {
        return (ProViewModel) this.f32790l.getValue();
    }

    public final void P() {
        ProViewModel proViewModelO = O();
        C2680e.c(C2673a0.f43223b, proViewModelO.f32112a, null, new ProViewModel$notifyProFunctionalityUsed$1(proViewModelO, null), 2);
    }

    public final void Q(FloatingActionButton fab) {
        i.e(fab, "fab");
        S(this, fab);
    }

    public final void R(final FloatingActionButton fab, final Integer num, boolean z10) {
        i.e(fab, "fab");
        O().f32808y.e(getViewLifecycleOwner(), new a(new l<G8.D, r>(this) { // from class: com.voltasit.obdeleven.presentation.pro.BaseProFragment$setupProFab$1
            final /* synthetic */ BaseProFragment<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // Ia.l
            public final r invoke(G8.D d10) {
                if (d10.f3410a.c()) {
                    Fragment fragment = this.this$0;
                    FloatingActionButton floatingActionButton = fab;
                    Integer num2 = num;
                    floatingActionButton.setImageDrawable(p186p0.a.C0517a.b(fragment.requireContext(), num2 != null ? num2.intValue() : 2131231137));
                    floatingActionButton.setBackgroundTintList(p186p0.a.b(fragment.requireContext(), R.color.fab_selector_green));
                } else {
                    Fragment fragment2 = this.this$0;
                    FloatingActionButton floatingActionButton2 = fab;
                    floatingActionButton2.setImageDrawable(p186p0.a.C0517a.b(fragment2.requireContext(), R.drawable.ic_lock_24dp));
                    floatingActionButton2.setBackgroundTintList(p186p0.a.b(fragment2.requireContext(), R.color.fab_selector_red));
                }
                return r.f47939a;
            }
        }));
        fab.setOnClickListener(new u(1, this));
        if (z10) {
            fab.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.voltasit.obdeleven.presentation.pro.a
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    SubscriptionType subscriptionType;
                    BaseProFragment this$0 = this.f32810b;
                    i.e(this$0, "this$0");
                    ProViewModel proViewModelO = this$0.O();
                    G8.D d10 = (G8.D) proViewModelO.f32808y.d();
                    if (d10 == null || (subscriptionType = d10.f3410a) == null || !subscriptionType.c()) {
                        proViewModelO.f32804u.j(r.f47939a);
                    } else {
                        proViewModelO.f32796D.j(r.f47939a);
                    }
                    return true;
                }
            });
        }
    }

    public final void T() {
        z(O());
        O().f32803t.e(getViewLifecycleOwner(), new a(new l<String, r>(this) { // from class: com.voltasit.obdeleven.presentation.pro.BaseProFragment$setupProObservables$1
            final /* synthetic */ BaseProFragment<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // Ia.l
            public final r invoke(String str) {
                this.this$0.r().g(str);
                return r.f47939a;
            }
        }));
        O().f32801r.e(getViewLifecycleOwner(), new a(new l<ProViewModel.a, r>(this) { // from class: com.voltasit.obdeleven.presentation.pro.BaseProFragment$setupProObservables$2
            final /* synthetic */ BaseProFragment<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // Ia.l
            public final r invoke(ProViewModel.a aVar) {
                ProViewModel.a aVar2 = aVar;
                if (!(aVar2 instanceof ProViewModel.a.C0340a)) {
                    throw new NoWhenBranchMatchedException();
                }
                BaseFragment baseFragment = this.this$0;
                ((ProViewModel.a.C0340a) aVar2).getClass();
                baseFragment.getClass();
                i.e(null, "msg");
                P.a(baseFragment.q(), null);
                throw null;
            }
        }));
        O().f32802s.e(getViewLifecycleOwner(), new a(new l<r, r>(this) { // from class: com.voltasit.obdeleven.presentation.pro.BaseProFragment$setupProObservables$3
            final /* synthetic */ BaseProFragment<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                this.this$0.G(R.string.common_pro_activated);
                return r.f47939a;
            }
        }));
        O().f32805v.e(getViewLifecycleOwner(), new a(new l<r, r>(this) { // from class: com.voltasit.obdeleven.presentation.pro.BaseProFragment$setupProObservables$4
            final /* synthetic */ BaseProFragment<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                Context contextRequireContext = this.this$0.requireContext();
                i.d(contextRequireContext, "requireContext(...)");
                new j(contextRequireContext).show();
                return r.f47939a;
            }
        }));
        O().f32793A.e(getViewLifecycleOwner(), new a(new l<Boolean, r>(this) { // from class: com.voltasit.obdeleven.presentation.pro.BaseProFragment$setupProObservables$5
            final /* synthetic */ BaseProFragment<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // Ia.l
            public final r invoke(Boolean bool) {
                Boolean bool2 = bool;
                i.b(bool2);
                if (bool2.booleanValue()) {
                    BaseProFragment<T> baseProFragment = this.this$0;
                    y parentFragmentManager = baseProFragment.getParentFragmentManager();
                    Bundle bundle = new Bundle();
                    bundle.putString("key_message", baseProFragment.getString(R.string.common_loading));
                    C2177w0 c2177w0 = new C2177w0();
                    c2177w0.setArguments(bundle);
                    c2177w0.f32261r = parentFragmentManager;
                    baseProFragment.f32791m = c2177w0;
                    c2177w0.A();
                } else {
                    BaseProFragment<T> baseProFragment2 = this.this$0;
                    C2177w0 c2177w1 = baseProFragment2.f32791m;
                    if (c2177w1 != null) {
                        c2177w1.y();
                    }
                    baseProFragment2.f32791m = null;
                }
                return r.f47939a;
            }
        }));
        O().f32807x.e(getViewLifecycleOwner(), new a(new l<r, r>(this) { // from class: com.voltasit.obdeleven.presentation.pro.BaseProFragment$setupProObservables$6
            final /* synthetic */ BaseProFragment<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // Ia.l
            public final r invoke(r rVar) {
                final BaseProFragment<T> baseProFragment = this.this$0;
                baseProFragment.getClass();
                baseProFragment.K(new l<DialogInterface, r>() { // from class: com.voltasit.obdeleven.presentation.pro.BaseProFragment$showTryAgainDialog$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(DialogInterface dialogInterface) {
                        DialogInterface it = dialogInterface;
                        i.e(it, "it");
                        it.dismiss();
                        if (baseProFragment.getActivity() != null) {
                            baseProFragment.r().h();
                        }
                        return r.f47939a;
                    }
                }, new l<DialogInterface, r>() { // from class: com.voltasit.obdeleven.presentation.pro.BaseProFragment$showTryAgainDialog$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(DialogInterface dialogInterface) {
                        DialogInterface it = dialogInterface;
                        i.e(it, "it");
                        it.dismiss();
                        baseProFragment.O().c(true);
                        return r.f47939a;
                    }
                });
                return r.f47939a;
            }
        }));
    }
}
