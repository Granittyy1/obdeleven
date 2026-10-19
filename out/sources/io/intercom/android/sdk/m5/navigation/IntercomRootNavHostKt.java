package io.intercom.android.sdk.m5.navigation;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.google.android.gms.internal.measurement.C1787c0;
import io.intercom.android.sdk.logger.LumberMill;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: compiled from: IntercomRootNavHost.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomRootNavHostKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.IntercomRootNavHostKt$IntercomRootNavHost$2, reason: invalid class name */
    /* JADX INFO: compiled from: IntercomRootNavHost.kt */
    public static final class AnonymousClass2 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
        final /* synthetic */ IntercomRootActivityArgs $intercomRootActivityArgs;
        final /* synthetic */ p141l2.H $navController;
        final /* synthetic */ ComponentActivity $rootActivity;
        final /* synthetic */ kotlinx.coroutines.A $scope;

        public AnonymousClass2(p141l2.H h8, IntercomRootActivityArgs intercomRootActivityArgs, ComponentActivity componentActivity, kotlinx.coroutines.A a10) {
            this.$navController = h8;
            this.$intercomRootActivityArgs = intercomRootActivityArgs;
            this.$rootActivity = componentActivity;
            this.$scope = a10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$1$lambda$0(p141l2.H navController, ComponentActivity rootActivity, kotlinx.coroutines.A scope, IntercomRootActivityArgs intercomRootActivityArgs, p141l2.F NavHost) {
            kotlin.jvm.internal.i.e(navController, "$navController");
            kotlin.jvm.internal.i.e(rootActivity, "$rootActivity");
            kotlin.jvm.internal.i.e(scope, "$scope");
            kotlin.jvm.internal.i.e(intercomRootActivityArgs, "$intercomRootActivityArgs");
            kotlin.jvm.internal.i.e(NavHost, "$this$NavHost");
            HomeScreenDestinationKt.homeScreen(NavHost, navController, rootActivity, scope);
            MessagesDestinationKt.messagesDestination(NavHost, navController, rootActivity);
            HelpCenterDestinationKt.helpCenterDestination(NavHost, rootActivity, navController, intercomRootActivityArgs);
            TicketDetailDestinationKt.ticketDetailDestination(NavHost, navController, rootActivity);
            ConversationDestinationKt.conversationDestination(NavHost, navController, rootActivity);
            TicketsDestinationKt.ticketsDestination(NavHost, navController, rootActivity);
            CreateTicketDestinationKt.createTicketDestination(NavHost, navController, rootActivity);
            return p293xa.r.f47939a;
        }

        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            FillElement fillElement = androidx.compose.foundation.layout.W.f10226c;
            final p141l2.H h8 = this.$navController;
            final IntercomRootActivityArgs intercomRootActivityArgs = this.$intercomRootActivityArgs;
            final ComponentActivity componentActivity = this.$rootActivity;
            final kotlinx.coroutines.A a10 = this.$scope;
            androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            int iF = interfaceC1084f.F();
            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f.z();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f, fillElement);
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
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
            if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF))) {
                androidx.compose.animation.k.b(iF, interfaceC1084f, iF, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f, hVarC);
            androidx.navigation.compose.Q.a(h8, intercomRootActivityArgs.getRoute(), null, null, null, null, null, null, null, null, new Ia.l() { // from class: io.intercom.android.sdk.m5.navigation.K
                @Override // Ia.l
                public final Object invoke(Object obj) {
                    return IntercomRootNavHostKt.AnonymousClass2.invoke$lambda$1$lambda$0(h8, componentActivity, a10, intercomRootActivityArgs, (p141l2.F) obj);
                }
            }, interfaceC1084f, 8, 0, 1020);
            interfaceC1084f.J();
        }
    }

    public static final void IntercomRootNavHost(final Intent intent, final ComponentActivity rootActivity, InterfaceC1084f interfaceC1084f, final int i10) {
        kotlin.jvm.internal.i.e(intent, "intent");
        kotlin.jvm.internal.i.e(rootActivity, "rootActivity");
        C1086g c1086gP = interfaceC1084f.p(884340874);
        IntercomRootActivityArgs argsForIntent = IntercomRootActivityArgsKt.getArgsForIntent(intent);
        if (argsForIntent instanceof IntercomRootActivityArgs.NoContent) {
            rootActivity.finish();
            LumberMill.getLogger().e("No content to display. Closing the activity.", new Object[0]);
            C1105p0 c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.navigation.I
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return IntercomRootNavHostKt.IntercomRootNavHost$lambda$0(intent, rootActivity, i10, (InterfaceC1084f) obj, iIntValue);
                    }
                };
                return;
            }
            return;
        }
        p141l2.H hS = C1787c0.s(new p141l2.P[0], c1086gP);
        Object objF = c1086gP.f();
        if (objF == InterfaceC1084f.a.f12980a) {
            objF = androidx.compose.runtime.E.f(EmptyCoroutineContext.f43032b, c1086gP);
            c1086gP.E(objF);
        }
        SurfaceKt.a(null, null, 0L, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(1903672037, new AnonymousClass2(hS, argsForIntent, rootActivity, (kotlinx.coroutines.A) objF), c1086gP), c1086gP, 12582912, 127);
        C1105p0 c1105p0V2 = c1086gP.V();
        if (c1105p0V2 != null) {
            c1105p0V2.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.navigation.J
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return IntercomRootNavHostKt.IntercomRootNavHost$lambda$1(intent, rootActivity, i10, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r IntercomRootNavHost$lambda$0(Intent intent, ComponentActivity rootActivity, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        kotlin.jvm.internal.i.e(intent, "$intent");
        kotlin.jvm.internal.i.e(rootActivity, "$rootActivity");
        IntercomRootNavHost(intent, rootActivity, interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r IntercomRootNavHost$lambda$1(Intent intent, ComponentActivity rootActivity, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        kotlin.jvm.internal.i.e(intent, "$intent");
        kotlin.jvm.internal.i.e(rootActivity, "$rootActivity");
        IntercomRootNavHost(intent, rootActivity, interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
