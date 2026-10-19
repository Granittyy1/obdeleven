package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.W;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.node.ComposeUiNode;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.avatar.AvatarShape;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Metadata;
import io.intercom.android.sdk.models.StreamingPart;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: compiled from: FinStreamingRow.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$FinStreamingRowKt {
    public static final ComposableSingletons$FinStreamingRowKt INSTANCE = new ComposableSingletons$FinStreamingRowKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f143lambda1 = new ComposableLambdaImpl(false, -283499477, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$FinStreamingRowKt$lambda-1$1
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
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            androidx.compose.ui.h hVarB = C0932d.b(W.d(aVar, 1.0f), IntercomTheme.INSTANCE.getColors(interfaceC1084f, IntercomTheme.$stable).m621getBackground0d7_KjU(), h0.f13629a);
            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f, 0);
            int iF = interfaceC1084f.F();
            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f.z();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f, hVarB);
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
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
            if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF))) {
                androidx.compose.animation.k.b(iF, interfaceC1084f, iF, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f, hVarC);
            float f10 = 16;
            Lb.a.a(interfaceC1084f, W.e(aVar, f10));
            FinStreamingRowKt.FinStreamingRow(kotlin.collections.l.s(new Block.Builder().withType("paragraph").withText("<b>Hello</b> <i>World</i> Three <a href=\"http://test.com\">Four</a").build(), new Block.Builder().withType("paragraph").withText("Next line").build()), new StreamingPart(new Metadata("Bot", "AI Agent", 1726738186L, M1.k(new Avatar.Builder().withInitials("BB").withShape(AvatarShape.SQUIRCLE)))), W.d(aVar, 1.0f), interfaceC1084f, 456, 0);
            Lb.a.a(interfaceC1084f, W.e(aVar, f10));
            interfaceC1084f.J();
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m229getLambda1$intercom_sdk_base_release() {
        return f143lambda1;
    }
}
