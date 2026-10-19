package com.voltasit.obdeleven.presentation.dialogs.sfd;

import I.e;
import Ia.p;
import J4.n;
import K8.o;
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
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.h;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.ActivityC1347l;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.components.LabeledSwitchKt;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import p293xa.r;

/* JADX INFO: compiled from: SfdAutoUnlockDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SfdAutoUnlockDialog extends DialogInterfaceOnCancelListenerC1342g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f32266r;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.voltasit.obdeleven.presentation.dialogs.sfd.SfdAutoUnlockDialog$special$$inlined$viewModel$default$1] */
    public SfdAutoUnlockDialog() {
        final Ia.a<Ob.a> aVar = new Ia.a<Ob.a>() { // from class: com.voltasit.obdeleven.presentation.dialogs.sfd.SfdAutoUnlockDialog$sfdAutoUnlockViewModel$2
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
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.presentation.dialogs.sfd.SfdAutoUnlockDialog$special$$inlined$viewModel$default$1
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
        this.f32266r = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<d>(this) { // from class: com.voltasit.obdeleven.presentation.dialogs.sfd.SfdAutoUnlockDialog$special$$inlined$viewModel$default$2
            final /* synthetic */ Fragment $this_viewModel;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $extrasProducer = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.dialogs.sfd.d] */
            @Override // Ia.a
            public final d invoke() {
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
                return Gb.a.a(l.a(d.class), viewModelStore, null, defaultViewModelCreationExtras, aVar2, Cb.a.i(fragment), aVar5);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xa.g] */
    public static final void x(final SfdAutoUnlockDialog sfdAutoUnlockDialog, InterfaceC1084f interfaceC1084f, final int i10) {
        sfdAutoUnlockDialog.getClass();
        C1086g c1086gP = interfaceC1084f.p(717122418);
        sfdAutoUnlockDialog.w(((Boolean) ((d) sfdAutoUnlockDialog.f32266r.getValue()).f32275e.getValue()).booleanValue(), new Ia.l<Boolean, r>() { // from class: com.voltasit.obdeleven.presentation.dialogs.sfd.SfdAutoUnlockDialog$SfdUnlockDialog$1
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xa.g] */
            @Override // Ia.l
            public final r invoke(Boolean bool) {
                Boolean bool2 = bool;
                bool2.getClass();
                ((d) this.this$0.f32266r.getValue()).f32274d.setValue(bool2);
                return r.f47939a;
            }
        }, c1086gP, 512);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.dialogs.sfd.SfdAutoUnlockDialog$SfdUnlockDialog$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    SfdAutoUnlockDialog.x(this.$tmp0_rcvr, interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.voltasit.obdeleven.presentation.dialogs.sfd.b] */
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final Dialog r(Bundle bundle) {
        Context contextRequireContext = requireContext();
        i.d(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6);
        composeView.setContent(new ComposableLambdaImpl(true, 897569938, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.dialogs.sfd.SfdAutoUnlockDialog$onCreateDialog$1
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
                    final SfdAutoUnlockDialog sfdAutoUnlockDialog = this.this$0;
                    MaterialThemeKt.a(c1034j, v11, null, androidx.compose.runtime.internal.a.b(-1803440066, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.dialogs.sfd.SfdAutoUnlockDialog$onCreateDialog$1.1
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final r invoke(InterfaceC1084f interfaceC1084f3, Integer num2) {
                            InterfaceC1084f interfaceC1084f4 = interfaceC1084f3;
                            if ((num2.intValue() & 11) == 2 && interfaceC1084f4.s()) {
                                interfaceC1084f4.w();
                            } else {
                                SfdAutoUnlockDialog.x(sfdAutoUnlockDialog, interfaceC1084f4, 8);
                            }
                            return r.f47939a;
                        }
                    }, interfaceC1084f2), interfaceC1084f2, 3120, 4);
                }
                return r.f47939a;
            }
        }));
        androidx.appcompat.app.e eVarShow = new F5.b(requireContext(), R.style.DialogTheme).m(composeView).k(R.string.common_sfd_protection).i(R.string.view_sfd_unlock_title, new DialogInterface.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.dialogs.sfd.a
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, xa.g] */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                SfdAutoUnlockDialog this$0 = this.f32267b;
                i.e(this$0, "this$0");
                d dVar = (d) this$0.f32266r.getValue();
                C1085f0 c1085f0 = dVar.f32274d;
                dVar.f32271a.d0(((Boolean) c1085f0.getValue()).booleanValue());
                boolean zBooleanValue = ((Boolean) c1085f0.getValue()).booleanValue();
                o oVar = dVar.f32273c;
                oVar.q(zBooleanValue);
                if (!oVar.c0()) {
                    oVar.R();
                }
                H3.c.l(this$0, "SfdAutoUnlockDialog", new Bundle());
                this$0.p(false, false);
            }
        }).f(new DialogInterface.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.dialogs.sfd.b
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, xa.g] */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                SfdAutoUnlockDialog this$0 = this.f32268b;
                i.e(this$0, "this$0");
                ((d) this$0.f32266r.getValue()).f32272b.g("https://support.obdeleven.com/en/collections/3195142-sfd");
            }
        }).d(R.string.common_cancel, new c(this, 0)).show();
        i.d(eVarShow, "show(...)");
        return eVarShow;
    }

    public final void w(final boolean z10, final Ia.l<? super Boolean, r> lVar, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086g;
        C1086g c1086gP = interfaceC1084f.p(878706895);
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
            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
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
            String strP = S4.o.p(c1086gP, R.string.view_sfd_required_description);
            androidx.compose.ui.text.font.l lVar2 = androidx.compose.ui.text.font.l.f15442g;
            long jG = G0.a.g(16);
            long j = com.voltasit.obdeleven.presentation.e.a.f32295s;
            TextKt.b(strP, null, j, jG, null, lVar2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 200064, 0, 131026);
            float f10 = 16;
            int i13 = i11 << 3;
            c1086g = c1086gP;
            LabeledSwitchKt.a(n.c(aVar, f10, c1086gP, R.string.view_settings_unlock_sfd_automatically, c1086gP), z10, lVar, null, null, 0L, j, c1086gP, (i13 & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 1572864 | (i13 & 896), 56);
            TextKt.b(n.c(aVar, f10, c1086g, R.string.view_sfd_trigger_unlock_auto_description, c1086g), null, j, G0.a.g(12), null, lVar2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086g, 200064, 0, 131026);
            c1086g.T(true);
        }
        C1105p0 c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.dialogs.sfd.SfdAutoUnlockDialog$SfdUnlockDialog$4
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
