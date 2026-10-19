package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.W;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.node.ComposeUiNode;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.m5.components.avatar.AvatarShape;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Metadata;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Source;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$FinAnswerRowKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: compiled from: FinAnswerRow.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$FinAnswerRowKt$lambda2$1 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
    public static final ComposableSingletons$FinAnswerRowKt$lambda2$1 INSTANCE = new ComposableSingletons$FinAnswerRowKt$lambda2$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invoke$lambda$1$lambda$0(List it) {
        kotlin.jvm.internal.i.e(it, "it");
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
        Part partBuild = new Part.Builder().withParticipantIsAdmin(true).withBlocks(kotlin.collections.l.s(BubbleMessageRowKt.getAnswerBlock(), BubbleMessageRowKt.getLongParagraphBlock())).withMetadata(new Metadata("Bot", "AI Agent", Long.valueOf(System.currentTimeMillis()), M1.k(new Avatar.Builder().withInitials("BB").withShape(AvatarShape.SQUIRCLE)))).withSources(kotlin.collections.l.s(new Source("1", "other", "Changing the date of your stay using our mobile app", "http://external.source.com"), new Source("2", "article", "Cancel your booking", "http://intercom.com"))).build();
        kotlin.jvm.internal.i.d(partBuild, "build(...)");
        FinAnswerRowKt.FinAnswerRow(partBuild, GroupingPosition.STANDALONE, null, null, new n(), interfaceC1084f, 24632, 12);
        Lb.a.a(interfaceC1084f, W.e(aVar, f10));
        interfaceC1084f.J();
    }
}
