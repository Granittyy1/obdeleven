package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;

/* JADX INFO: compiled from: MessageMetadata.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$MessageMetadataKt {
    public static final ComposableSingletons$MessageMetadataKt INSTANCE = new ComposableSingletons$MessageMetadataKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f102lambda1 = new ComposableLambdaImpl(false, 1395125050, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$MessageMetadataKt$lambda-1$1
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
            MessageMetadataKt.MessageMetadata(M1.k(new AvatarWrapper(avatarCreate, false, 2, null)), "Lisa", null, null, 1726738186L, interfaceC1084f, 27704, 4);
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f103lambda2 = new ComposableLambdaImpl(false, -563128999, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$MessageMetadataKt$lambda-2$1
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
            androidx.compose.ui.h hVarD = androidx.compose.foundation.layout.W.d(androidx.compose.ui.h.a.f13984b, 1.0f);
            androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            int iF = interfaceC1084f.F();
            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f.z();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f, hVarD);
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
            SurfaceKt.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$MessageMetadataKt.INSTANCE.m173getLambda1$intercom_sdk_base_release(), interfaceC1084f, 12582912, 127);
            interfaceC1084f.J();
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f104lambda3 = new ComposableLambdaImpl(false, -1894671055, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$MessageMetadataKt$lambda-3$1
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
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, false, 2, null);
            Avatar avatarCreate2 = Avatar.create("", "PL");
            kotlin.jvm.internal.i.d(avatarCreate2, "create(...)");
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarCreate2, false, 2, null);
            Avatar avatarCreate3 = Avatar.create("", "IS");
            kotlin.jvm.internal.i.d(avatarCreate3, "create(...)");
            MessageMetadataKt.MessageMetadata(kotlin.collections.l.s(avatarWrapper, avatarWrapper2, new AvatarWrapper(avatarCreate3, false, 2, null)), "This Lisa Agent has very long and boring name", null, "AI Agent", 1726738186L, interfaceC1084f, 27704, 4);
        }
    });

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f105lambda4 = new ComposableLambdaImpl(false, 764966992, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$MessageMetadataKt$lambda-4$1
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
            androidx.compose.ui.h hVarD = androidx.compose.foundation.layout.W.d(androidx.compose.ui.h.a.f13984b, 1.0f);
            androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            int iF = interfaceC1084f.F();
            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f.z();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f, hVarD);
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
            SurfaceKt.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$MessageMetadataKt.INSTANCE.m175getLambda3$intercom_sdk_base_release(), interfaceC1084f, 12582912, 127);
            interfaceC1084f.J();
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m173getLambda1$intercom_sdk_base_release() {
        return f102lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m174getLambda2$intercom_sdk_base_release() {
        return f103lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m175getLambda3$intercom_sdk_base_release() {
        return f104lambda3;
    }

    /* JADX INFO: renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m176getLambda4$intercom_sdk_base_release() {
        return f105lambda4;
    }
}
