package io.intercom.android.sdk.m5.home.ui;

import Ia.p;
import Ia.q;
import androidx.compose.animation.InterfaceC0928f;
import androidx.compose.animation.k;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.W;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.LoadingScreenKt;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: HomeScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$HomeScreenKt {
    public static final ComposableSingletons$HomeScreenKt INSTANCE = new ComposableSingletons$HomeScreenKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static q<InterfaceC0928f, InterfaceC1084f, Integer, r> f192lambda1 = new ComposableLambdaImpl(false, -613291133, new q<InterfaceC0928f, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.m5.home.ui.ComposableSingletons$HomeScreenKt$lambda-1$1
        @Override // Ia.q
        public /* bridge */ /* synthetic */ r invoke(InterfaceC0928f interfaceC0928f, InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC0928f, interfaceC1084f, num.intValue());
            return r.f47939a;
        }

        public final void invoke(InterfaceC0928f AnimatedVisibility, InterfaceC1084f interfaceC1084f, int i10) {
            i.e(AnimatedVisibility, "$this$AnimatedVisibility");
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f, 0);
            int iF = interfaceC1084f.F();
            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f.z();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f, aVar);
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
            Lb.a.a(interfaceC1084f, W.e(aVar, 32));
            LoadingScreenKt.LoadingScreen(null, R.drawable.intercom_content_loading, interfaceC1084f, 0, 1);
            interfaceC1084f.J();
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final q<InterfaceC0928f, InterfaceC1084f, Integer, r> m301getLambda1$intercom_sdk_base_release() {
        return f192lambda1;
    }
}
