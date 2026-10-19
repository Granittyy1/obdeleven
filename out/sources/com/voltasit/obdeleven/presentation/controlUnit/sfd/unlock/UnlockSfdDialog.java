package com.voltasit.obdeleven.presentation.controlUnit.sfd.unlock;

import H3.c;
import Ia.p;
import K8.o;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.appcompat.app.e;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import com.voltasit.obdeleven.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import p293xa.r;

/* JADX INFO: compiled from: UnlockSfdDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class UnlockSfdDialog extends DialogInterfaceOnCancelListenerC1342g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f31882r;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.voltasit.obdeleven.presentation.controlUnit.sfd.unlock.UnlockSfdDialog$special$$inlined$viewModel$default$1] */
    public UnlockSfdDialog() {
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.presentation.controlUnit.sfd.unlock.UnlockSfdDialog$special$$inlined$viewModel$default$1
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
        this.f31882r = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<b>(this) { // from class: com.voltasit.obdeleven.presentation.controlUnit.sfd.unlock.UnlockSfdDialog$special$$inlined$viewModel$default$2
            final /* synthetic */ Fragment $this_viewModel;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $extrasProducer = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.controlUnit.sfd.unlock.b] */
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
                    i.d(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
                }
                return Gb.a.a(l.a(b.class), viewModelStore, null, defaultViewModelCreationExtras, aVar, Cb.a.i(fragment), aVar4);
            }
        });
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final Dialog r(Bundle bundle) {
        Context contextRequireContext = requireContext();
        i.d(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6);
        composeView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        composeView.setContent(new ComposableLambdaImpl(true, 1266126514, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.sfd.unlock.UnlockSfdDialog$onCreateDialog$1
            {
                super(2);
            }

            /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, xa.g] */
            @Override // Ia.p
            public final r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
                InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
                if ((num.intValue() & 11) == 2 && interfaceC1084f2.s()) {
                    interfaceC1084f2.w();
                } else {
                    UnlockSfdDialogKt.b((b) this.this$0.f31882r.getValue(), interfaceC1084f2, 0);
                }
                return r.f47939a;
            }
        }));
        e eVarShow = new F5.b(requireContext(), R.style.DialogTheme).m(composeView).k(R.string.common_sfd_protection).i(R.string.common_unlock, new DialogInterface.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.controlUnit.sfd.unlock.a
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, xa.g] */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                UnlockSfdDialog this$0 = this.f31883b;
                i.e(this$0, "this$0");
                b bVar = (b) this$0.f31882r.getValue();
                o oVar = bVar.f31884o;
                oVar.R();
                oVar.q(((Boolean) bVar.f31886q.getValue()).booleanValue());
                c.l(this$0, "UnlockSfdDialog", p271w0.c.a());
            }
        }).d(R.string.common_cancel, new com.voltasit.obdeleven.presentation.controlUnit.sfd.lock.b()).show();
        i.d(eVarShow, "show(...)");
        return eVarShow;
    }
}
