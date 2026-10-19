package io.intercom.android.sdk.m5.inbox.ui;

import Ia.p;
import Ia.q;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.m0;
import kotlin.collections.EmptyList;
import p293xa.r;

/* JADX INFO: compiled from: InboxScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$InboxScreenKt {
    public static final ComposableSingletons$InboxScreenKt INSTANCE = new ComposableSingletons$InboxScreenKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static p<InterfaceC1084f, Integer, r> f223lambda1 = new ComposableLambdaImpl(false, -455897824, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.m5.inbox.ui.ComposableSingletons$InboxScreenKt$lambda-1$1
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
            androidx.compose.ui.graphics.vector.c cVarB = A.a.f378a;
            if (cVarB == null) {
                androidx.compose.ui.graphics.vector.c.a aVar = new androidx.compose.ui.graphics.vector.c.a("Outlined.Edit", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                EmptyList emptyList = androidx.compose.ui.graphics.vector.i.f13970a;
                m0 m0Var = new m0(H.f13495b);
                androidx.compose.ui.graphics.vector.d dVar = new androidx.compose.ui.graphics.vector.d();
                dVar.h(14.06f, 9.02f);
                dVar.g(0.92f, 0.92f);
                dVar.f(5.92f, 19.0f);
                dVar.f(5.0f, 19.0f);
                dVar.l(-0.92f);
                dVar.g(9.06f, -9.06f);
                dVar.h(17.66f, 3.0f);
                dVar.c(-0.25f, 0.0f, -0.51f, 0.1f, -0.7f, 0.29f);
                dVar.g(-1.83f, 1.83f);
                dVar.g(3.75f, 3.75f);
                dVar.g(1.83f, -1.83f);
                dVar.c(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                dVar.g(-2.34f, -2.34f);
                dVar.c(-0.2f, -0.2f, -0.45f, -0.29f, -0.71f, -0.29f);
                dVar.a();
                dVar.h(14.06f, 6.19f);
                dVar.f(3.0f, 17.25f);
                dVar.f(3.0f, 21.0f);
                dVar.e(3.75f);
                dVar.f(17.81f, 9.94f);
                dVar.g(-3.75f, -3.75f);
                dVar.a();
                androidx.compose.ui.graphics.vector.c.a.a(aVar, dVar.f13897a, m0Var);
                cVarB = aVar.b();
                A.a.f378a = cVarB;
            }
            IconKt.b(cVarB, null, null, 0L, interfaceC1084f, 48, 12);
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static q<androidx.compose.foundation.lazy.b, InterfaceC1084f, Integer, r> f224lambda2 = new ComposableLambdaImpl(false, 877667555, new q<androidx.compose.foundation.lazy.b, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.m5.inbox.ui.ComposableSingletons$InboxScreenKt$lambda-2$1
        @Override // Ia.q
        public /* bridge */ /* synthetic */ r invoke(androidx.compose.foundation.lazy.b bVar, InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(bVar, interfaceC1084f, num.intValue());
            return r.f47939a;
        }

        public final void invoke(androidx.compose.foundation.lazy.b item, InterfaceC1084f interfaceC1084f, int i10) {
            kotlin.jvm.internal.i.e(item, "$this$item");
            if ((i10 & 81) == 16 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                InboxScreenKt.InboxLoadingRow(interfaceC1084f, 0);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    public static q<androidx.compose.foundation.lazy.b, InterfaceC1084f, Integer, r> f225lambda3 = new ComposableLambdaImpl(false, 64179351, new q<androidx.compose.foundation.lazy.b, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.m5.inbox.ui.ComposableSingletons$InboxScreenKt$lambda-3$1
        @Override // Ia.q
        public /* bridge */ /* synthetic */ r invoke(androidx.compose.foundation.lazy.b bVar, InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(bVar, interfaceC1084f, num.intValue());
            return r.f47939a;
        }

        public final void invoke(androidx.compose.foundation.lazy.b item, InterfaceC1084f interfaceC1084f, int i10) {
            kotlin.jvm.internal.i.e(item, "$this$item");
            if ((i10 & 81) == 16 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                InboxLoadingScreenKt.InboxLoadingScreen(interfaceC1084f, 0);
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final p<InterfaceC1084f, Integer, r> m334getLambda1$intercom_sdk_base_release() {
        return f223lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final q<androidx.compose.foundation.lazy.b, InterfaceC1084f, Integer, r> m335getLambda2$intercom_sdk_base_release() {
        return f224lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final q<androidx.compose.foundation.lazy.b, InterfaceC1084f, Integer, r> m336getLambda3$intercom_sdk_base_release() {
        return f225lambda3;
    }
}
