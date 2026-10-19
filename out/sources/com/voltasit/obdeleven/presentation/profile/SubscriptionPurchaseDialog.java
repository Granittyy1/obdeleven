package com.voltasit.obdeleven.presentation.profile;

import G8.A;
import G8.z;
import Ia.p;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.ActivityC1347l;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.collections.q;
import kotlinx.coroutines.C2680e;
import p293xa.r;

/* JADX INFO: compiled from: SubscriptionPurchaseDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SubscriptionPurchaseDialog extends DialogInterfaceOnCancelListenerC1342g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f32886r;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.voltasit.obdeleven.presentation.profile.SubscriptionPurchaseDialog$special$$inlined$viewModel$default$1] */
    public SubscriptionPurchaseDialog() {
        final Ia.a<Ob.a> aVar = new Ia.a<Ob.a>() { // from class: com.voltasit.obdeleven.presentation.profile.SubscriptionPurchaseDialog$viewModel$2
            {
                super(0);
            }

            @Override // Ia.a
            public final Ob.a invoke() {
                List listO0;
                String string = this.this$0.requireArguments().getString("product_id", "");
                String string2 = this.this$0.requireArguments().getString("title_id", "");
                kotlin.jvm.internal.i.d(string2, "getString(...)");
                String string3 = this.this$0.requireArguments().getString("subtitle_id", "");
                kotlin.jvm.internal.i.d(string3, "getString(...)");
                ArrayList<String> stringArrayList = this.this$0.requireArguments().getStringArrayList("bullet_point_ids");
                if (stringArrayList == null || (listO0 = q.o0(stringArrayList)) == null) {
                    listO0 = EmptyList.f42983b;
                }
                List list = listO0;
                String string4 = this.this$0.requireArguments().getString("duration_id", "");
                kotlin.jvm.internal.i.d(string4, "getString(...)");
                String string5 = this.this$0.requireArguments().getString("action_id", "");
                kotlin.jvm.internal.i.d(string5, "getString(...)");
                return I.e.j(string, new z.a(string2, string3, string4, string5, list));
            }
        };
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.presentation.profile.SubscriptionPurchaseDialog$special$$inlined$viewModel$default$1
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
        this.f32886r = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<m>(this) { // from class: com.voltasit.obdeleven.presentation.profile.SubscriptionPurchaseDialog$special$$inlined$viewModel$default$2
            final /* synthetic */ Fragment $this_viewModel;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $extrasProducer = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.profile.m] */
            @Override // Ia.a
            public final m invoke() {
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
                return Gb.a.a(kotlin.jvm.internal.l.a(m.class), viewModelStore, null, defaultViewModelCreationExtras, aVar2, Cb.a.i(fragment), aVar5);
            }
        });
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final Dialog r(Bundle bundle) {
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.i.d(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6);
        composeView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        composeView.setContent(new ComposableLambdaImpl(true, -1831773899, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.profile.SubscriptionPurchaseDialog$onCreateDialog$1
            {
                super(2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ia.p
            public final r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
                InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
                if ((num.intValue() & 11) == 2 && interfaceC1084f2.s()) {
                    interfaceC1084f2.w();
                } else {
                    C1085f0 c1085f0 = this.this$0.w().f32932h;
                    C1085f0 c1085f1 = this.this$0.w().j;
                    C1085f0 c1085f2 = this.this$0.w().f32935l;
                    boolean zBooleanValue = ((Boolean) c1085f0.getValue()).booleanValue();
                    A a10 = (A) c1085f1.getValue();
                    String str = (String) c1085f2.getValue();
                    final SubscriptionPurchaseDialog subscriptionPurchaseDialog = this.this$0;
                    SubscriptionPurchaseDialogKt.d(zBooleanValue, a10, str, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.profile.SubscriptionPurchaseDialog$onCreateDialog$1.1
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            H3.c.l(subscriptionPurchaseDialog, "SubscriptionPurchaseDialog", p271w0.c.a());
                            subscriptionPurchaseDialog.p(false, false);
                            return r.f47939a;
                        }
                    }, interfaceC1084f2, 64);
                }
                return r.f47939a;
            }
        }));
        w().f32930f.e(this, new SubscriptionPurchaseDialogKt.a(new Ia.l<r, r>() { // from class: com.voltasit.obdeleven.presentation.profile.SubscriptionPurchaseDialog$onCreateDialog$2
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                this.this$0.p(false, false);
                return r.f47939a;
            }
        }));
        m mVarW = w();
        ActivityC1347l activityC1347lRequireActivity = requireActivity();
        kotlin.jvm.internal.i.d(activityC1347lRequireActivity, "requireActivity(...)");
        mVarW.getClass();
        C2680e.c(Z.a(mVarW), null, null, new SubscriptionPurchaseViewModel$init$1(mVarW, activityC1347lRequireActivity, null), 3);
        return new F5.b(requireContext(), R.style.DialogTheme).m(composeView).create();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    public final m w() {
        return (m) this.f32886r.getValue();
    }
}
