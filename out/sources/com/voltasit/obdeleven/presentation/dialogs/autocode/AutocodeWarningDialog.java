package com.voltasit.obdeleven.presentation.dialogs.autocode;

import H3.c;
import I.e;
import Ia.p;
import J4.n;
import S4.o;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.material.C1034j;
import androidx.compose.material.MaterialThemeKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.V;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.d;
import androidx.compose.ui.h;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.ActivityC1347l;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.components.CheckboxKt;
import com.voltasit.obdeleven.presentation.models.FragmentResult;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import p293xa.r;

/* JADX INFO: compiled from: AutocodeWarningDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AutocodeWarningDialog extends DialogInterfaceOnCancelListenerC1342g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f32165r;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.voltasit.obdeleven.presentation.dialogs.autocode.AutocodeWarningDialog$special$$inlined$viewModel$default$1] */
    public AutocodeWarningDialog() {
        final Ia.a<Ob.a> aVar = new Ia.a<Ob.a>() { // from class: com.voltasit.obdeleven.presentation.dialogs.autocode.AutocodeWarningDialog$autocodeWarningViewModel$2
            {
                super(0);
            }

            @Override // Ia.a
            public final Ob.a invoke() {
                ActivityC1347l activity = this.this$0.getActivity();
                i.c(activity, "null cannot be cast to non-null type com.voltasit.obdeleven.ui.activity.MainActivity");
                return e.j(((MainActivity) activity).f33533B);
            }
        };
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.presentation.dialogs.autocode.AutocodeWarningDialog$special$$inlined$viewModel$default$1
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
        this.f32165r = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<b>(this) { // from class: com.voltasit.obdeleven.presentation.dialogs.autocode.AutocodeWarningDialog$special$$inlined$viewModel$default$2
            final /* synthetic */ Fragment $this_viewModel;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $extrasProducer = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.dialogs.autocode.b] */
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
                return Gb.a.a(l.a(b.class), viewModelStore, null, defaultViewModelCreationExtras, aVar2, Cb.a.i(fragment), aVar5);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xa.g] */
    public static final void x(final AutocodeWarningDialog autocodeWarningDialog, InterfaceC1084f interfaceC1084f, final int i10) {
        autocodeWarningDialog.getClass();
        C1086g c1086gP = interfaceC1084f.p(2076751506);
        autocodeWarningDialog.w(((Boolean) ((b) autocodeWarningDialog.f32165r.getValue()).f32169c.getValue()).booleanValue(), new Ia.l<Boolean, r>() { // from class: com.voltasit.obdeleven.presentation.dialogs.autocode.AutocodeWarningDialog$AutocodeWarningDialog$1
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xa.g] */
            @Override // Ia.l
            public final r invoke(Boolean bool) {
                Boolean bool2 = bool;
                bool2.getClass();
                ((b) this.this$0.f32165r.getValue()).f32168b.setValue(bool2);
                return r.f47939a;
            }
        }, c1086gP, 512);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.dialogs.autocode.AutocodeWarningDialog$AutocodeWarningDialog$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    AutocodeWarningDialog.x(this.$tmp0_rcvr, interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final Dialog r(Bundle bundle) {
        Context contextRequireContext = requireContext();
        i.d(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6);
        composeView.setContent(new ComposableLambdaImpl(true, -1053899235, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.dialogs.autocode.AutocodeWarningDialog$onCreateDialog$1
            {
                super(2);
            }

            @Override // Ia.p
            public final r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
                InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
                if ((num.intValue() & 11) == 2 && interfaceC1084f2.s()) {
                    interfaceC1084f2.w();
                } else {
                    V v10 = com.voltasit.obdeleven.presentation.e.f32276a;
                    O.e.w(interfaceC1084f2);
                    C1034j c1034j = com.voltasit.obdeleven.presentation.e.f32277b;
                    V v11 = com.voltasit.obdeleven.presentation.e.f32276a;
                    final AutocodeWarningDialog autocodeWarningDialog = this.this$0;
                    MaterialThemeKt.a(c1034j, v11, null, androidx.compose.runtime.internal.a.b(-1469363215, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.dialogs.autocode.AutocodeWarningDialog$onCreateDialog$1.1
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final r invoke(InterfaceC1084f interfaceC1084f3, Integer num2) {
                            InterfaceC1084f interfaceC1084f4 = interfaceC1084f3;
                            if ((num2.intValue() & 11) == 2 && interfaceC1084f4.s()) {
                                interfaceC1084f4.w();
                            } else {
                                AutocodeWarningDialog.x(autocodeWarningDialog, interfaceC1084f4, 8);
                            }
                            return r.f47939a;
                        }
                    }, interfaceC1084f2), interfaceC1084f2, 3120, 4);
                }
                return r.f47939a;
            }
        }));
        androidx.appcompat.app.e eVarShow = new F5.b(requireContext(), R.style.DialogTheme).m(composeView).k(R.string.view_settings_autocode_gateway_list).i(R.string.common_yes, new DialogInterface.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.dialogs.autocode.a
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, xa.g] */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                AutocodeWarningDialog this$0 = this.f32166b;
                i.e(this$0, "this$0");
                b bVar = (b) this$0.f32165r.getValue();
                bVar.f32167a.p(!((Boolean) bVar.f32168b.getValue()).booleanValue());
                c.l(this$0, "AutocodeWarningDialog", p271w0.c.b(new Pair("key_result", FragmentResult.OnPositive.a())));
                this$0.p(false, false);
            }
        }).d(R.string.common_cancel, new com.voltasit.obdeleven.presentation.controlUnit.sfd.lock.a(this, 1)).show();
        eVarShow.setCanceledOnTouchOutside(false);
        s(false);
        return eVarShow;
    }

    public final void w(final boolean z10, final Ia.l<? super Boolean, r> lVar, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086g;
        C1086g c1086gP = interfaceC1084f.p(770881483);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.c(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.k(lVar) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && c1086gP.s()) {
            c1086gP.w();
            c1086g = c1086gP;
        } else {
            h.a aVar = h.a.f13984b;
            h hVarH = PaddingKt.h(W.d(aVar, 1.0f), 24, 0.0f, 2);
            C0953m c0953mA = C0952l.a(C0945e.f10286c, d.a.f13346m, c1086gP, 0);
            int i12 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            h hVarC = ComposedModifierKt.c(c1086gP, hVarH);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i12))) {
                J4.i.d(i12, c1086gP, i12, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            String strP = o.p(c1086gP, R.string.view_cu_list_autocode_gateway);
            androidx.compose.ui.text.font.l lVar2 = androidx.compose.ui.text.font.l.f15442g;
            long jG = G0.a.g(16);
            long j = com.voltasit.obdeleven.presentation.e.a.f32295s;
            TextKt.b(strP, null, j, jG, null, lVar2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 200064, 0, 131026);
            int i13 = i11 << 3;
            c1086g = c1086gP;
            CheckboxKt.a(n.c(aVar, 16, c1086gP, R.string.common_do_not_show_again, c1086gP), z10, lVar, null, null, 0L, j, c1086gP, (i13 & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 1572864 | (i13 & 896), 56);
            c1086g.T(true);
        }
        C1105p0 c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.dialogs.autocode.AutocodeWarningDialog$AutocodeWarningDialog$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    this.$tmp0_rcvr.w(z10, lVar, interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }
}
