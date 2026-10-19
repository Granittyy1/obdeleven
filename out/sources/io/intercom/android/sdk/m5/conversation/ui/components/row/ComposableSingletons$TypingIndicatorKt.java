package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType;
import io.intercom.android.sdk.models.Avatar;

/* JADX INFO: compiled from: TypingIndicator.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$TypingIndicatorKt {
    public static final ComposableSingletons$TypingIndicatorKt INSTANCE = new ComposableSingletons$TypingIndicatorKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f158lambda1 = new ComposableLambdaImpl(false, -800155812, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$TypingIndicatorKt$lambda-1$1
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
            C0945e.j jVar = C0945e.f10284a;
            C0945e.i iVarI = C0945e.i(16, androidx.compose.ui.d.a.f13344k);
            androidx.compose.ui.f.a aVar = androidx.compose.ui.d.a.f13346m;
            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
            C0953m c0953mA = C0952l.a(iVarI, aVar, interfaceC1084f, 54);
            int iF = interfaceC1084f.F();
            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f.z();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f, aVar2);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
            if (interfaceC1084f.u() == null) {
                I.b.k();
                throw null;
            }
            interfaceC1084f.r();
            if (interfaceC1084f.m()) {
                interfaceC1084f.v(aVar3);
            } else {
                interfaceC1084f.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f, c0953mA);
            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f, interfaceC1089h0Z);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
            if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF))) {
                androidx.compose.animation.k.b(iF, interfaceC1084f, iF, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f, hVarC);
            Avatar avatarCreate = Avatar.create("", "SK");
            kotlin.jvm.internal.i.d(avatarCreate, "create(...)");
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, false);
            TypingIndicatorType typingIndicatorType = TypingIndicatorType.ADMIN;
            TypingIndicatorKt.m257TypingIndicator6a0pyJM(null, new CurrentlyTypingState(avatarWrapper, false, null, typingIndicatorType, 6, null), 0.0f, interfaceC1084f, 64, 5);
            Avatar avatarCreate2 = Avatar.create("", "SK");
            kotlin.jvm.internal.i.d(avatarCreate2, "create(...)");
            TypingIndicatorKt.m257TypingIndicator6a0pyJM(null, new CurrentlyTypingState(new AvatarWrapper(avatarCreate2, true), false, null, typingIndicatorType, 6, null), 0.0f, interfaceC1084f, 64, 5);
            interfaceC1084f.J();
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f159lambda2 = new ComposableLambdaImpl(false, 10286785, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$TypingIndicatorKt$lambda-2$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                SurfaceKt.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$TypingIndicatorKt.INSTANCE.m244getLambda1$intercom_sdk_base_release(), interfaceC1084f, 12582912, 127);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f160lambda3 = new ComposableLambdaImpl(false, -946532027, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$TypingIndicatorKt$lambda-3$1
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
            Avatar avatarCreate = Avatar.create("", "SK");
            kotlin.jvm.internal.i.d(avatarCreate, "create(...)");
            TypingIndicatorKt.m257TypingIndicator6a0pyJM(null, new CurrentlyTypingState(new AvatarWrapper(avatarCreate, true), false, null, TypingIndicatorType.ADMIN, 4, null), 0.0f, interfaceC1084f, 64, 5);
        }
    });

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f161lambda4 = new ComposableLambdaImpl(false, 1884921344, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$TypingIndicatorKt$lambda-4$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                SurfaceKt.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$TypingIndicatorKt.INSTANCE.m246getLambda3$intercom_sdk_base_release(), interfaceC1084f, 12582912, 127);
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m244getLambda1$intercom_sdk_base_release() {
        return f158lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m245getLambda2$intercom_sdk_base_release() {
        return f159lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m246getLambda3$intercom_sdk_base_release() {
        return f160lambda3;
    }

    /* JADX INFO: renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m247getLambda4$intercom_sdk_base_release() {
        return f161lambda4;
    }
}
