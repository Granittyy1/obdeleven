package io.intercom.android.sdk.tickets.list.ui;

import Ia.p;
import androidx.compose.animation.k;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.h;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.tickets.TicketStatus;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import java.util.Iterator;
import kotlin.collections.l;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: TicketRow.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$TicketRowKt {
    public static final ComposableSingletons$TicketRowKt INSTANCE = new ComposableSingletons$TicketRowKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static p<InterfaceC1084f, Integer, r> f310lambda1 = new ComposableLambdaImpl(false, 1406853974, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.tickets.list.ui.ComposableSingletons$TicketRowKt$lambda-1$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            h.a aVar = h.a.f13984b;
            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f, 0);
            int iF = interfaceC1084f.F();
            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f.z();
            h hVarC = ComposedModifierKt.c(interfaceC1084f, aVar);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
            if (interfaceC1084f.u() == null) {
                I.b.k();
                throw null;
            }
            interfaceC1084f.r();
            if (interfaceC1084f.m()) {
                interfaceC1084f.v(aVar2);
            } else {
                interfaceC1084f.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f, c0953mA);
            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f, interfaceC1089h0Z);
            p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
            if (interfaceC1084f.m() || !i.a(interfaceC1084f.f(), Integer.valueOf(iF))) {
                k.b(iF, interfaceC1084f, iF, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f, hVarC);
            interfaceC1084f.L(-1850249373);
            Iterator it = l.s(new TicketRowData("123", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "#123 • Waiting on you", TicketStatus.WaitingOnCustomer, true), new TicketRowData("321", "Bug", "#123456789012345678901234567890 • Submitted", TicketStatus.Submitted, true), new TicketRowData("456", "Address change", "In progress", TicketStatus.InProgress, false), new TicketRowData("654", "Can’t download from dashboard request ", "Resolved", TicketStatus.Resolved, true)).iterator();
            while (it.hasNext()) {
                TicketRowKt.TicketRow(null, (TicketRowData) it.next(), null, false, interfaceC1084f, 0, 13);
                IntercomDividerKt.IntercomDivider(PaddingKt.h(aVar, 20, 0.0f, 2), interfaceC1084f, 6, 0);
            }
            interfaceC1084f.D();
            interfaceC1084f.J();
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static p<InterfaceC1084f, Integer, r> f311lambda2 = new ComposableLambdaImpl(false, 488165755, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.tickets.list.ui.ComposableSingletons$TicketRowKt$lambda-2$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                SurfaceKt.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$TicketRowKt.INSTANCE.m489getLambda1$intercom_sdk_base_release(), interfaceC1084f, 12582912, 127);
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final p<InterfaceC1084f, Integer, r> m489getLambda1$intercom_sdk_base_release() {
        return f310lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final p<InterfaceC1084f, Integer, r> m490getLambda2$intercom_sdk_base_release() {
        return f311lambda2;
    }
}
