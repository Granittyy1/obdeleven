package io.intercom.android.sdk.tickets.list.ui;

import Ia.p;
import Ia.q;
import androidx.compose.animation.k;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.h;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: TicketsScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$TicketsScreenKt {
    public static final ComposableSingletons$TicketsScreenKt INSTANCE = new ComposableSingletons$TicketsScreenKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static q<androidx.compose.foundation.lazy.b, InterfaceC1084f, Integer, r> f318lambda1 = new ComposableLambdaImpl(false, -1474046781, new q<androidx.compose.foundation.lazy.b, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.tickets.list.ui.ComposableSingletons$TicketsScreenKt$lambda-1$1
        @Override // Ia.q
        public /* bridge */ /* synthetic */ r invoke(androidx.compose.foundation.lazy.b bVar, InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(bVar, interfaceC1084f, num.intValue());
            return r.f47939a;
        }

        public final void invoke(androidx.compose.foundation.lazy.b item, InterfaceC1084f interfaceC1084f, int i10) {
            i.e(item, "$this$item");
            if ((i10 & 81) == 16 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            h hVarD = W.d(PaddingKt.h(h.a.f13984b, 0.0f, 16, 1), 1.0f);
            E eD = BoxKt.d(androidx.compose.ui.d.a.f13339e, false);
            int iF = interfaceC1084f.F();
            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f.z();
            h hVarC = ComposedModifierKt.c(interfaceC1084f, hVarD);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
            if (interfaceC1084f.u() == null) {
                I.b.k();
                throw null;
            }
            interfaceC1084f.r();
            if (interfaceC1084f.m()) {
                interfaceC1084f.v(aVar);
            } else {
                interfaceC1084f.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f, eD);
            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f, interfaceC1089h0Z);
            p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
            if (interfaceC1084f.m() || !i.a(interfaceC1084f.f(), Integer.valueOf(iF))) {
                k.b(iF, interfaceC1084f, iF, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f, hVarC);
            ProgressIndicatorKt.a(null, IntercomTheme.INSTANCE.getColors(interfaceC1084f, IntercomTheme.$stable).m616getActionContrastWhite0d7_KjU(), 0.0f, 0L, 0, 0, interfaceC1084f, 29);
            interfaceC1084f.J();
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final q<androidx.compose.foundation.lazy.b, InterfaceC1084f, Integer, r> m497getLambda1$intercom_sdk_base_release() {
        return f318lambda1;
    }
}
