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
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$BubbleMessageRowKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: compiled from: BubbleMessageRow.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$BubbleMessageRowKt$lambda2$1 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
    public static final ComposableSingletons$BubbleMessageRowKt$lambda2$1 INSTANCE = new ComposableSingletons$BubbleMessageRowKt$lambda2$1();

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
        androidx.compose.ui.h hVarB = C0932d.b(W.f10226c, IntercomTheme.INSTANCE.getColors(interfaceC1084f, IntercomTheme.$stable).m621getBackground0d7_KjU(), h0.f13629a);
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
        Part partBuild = new Part.Builder().withParticipantIsAdmin(true).withBlocks(kotlin.collections.l.s(BubbleMessageRowKt.getParagraphBlock(), BubbleMessageRowKt.getLongParagraphBlock())).withMetadata(new Metadata("Bot", "AI Agent", 1726738186L, M1.k(new Avatar.Builder().withInitials("BB").withShape(AvatarShape.SQUIRCLE)))).build();
        kotlin.jvm.internal.i.d(partBuild, "build(...)");
        GroupingPosition groupingPosition = GroupingPosition.TOP;
        BubbleMessageRowKt.BubbleMessageRow(partBuild, groupingPosition, true, null, "10:08 AM", null, null, null, null, null, null, null, interfaceC1084f, 25016, 0, 4072);
        float f11 = 4;
        Lb.a.a(interfaceC1084f, W.e(aVar, f11));
        Part partBuild2 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(M1.k(BubbleMessageRowKt.getParagraphBlock())).build();
        kotlin.jvm.internal.i.d(partBuild2, "build(...)");
        BubbleMessageRowKt.BubbleMessageRow(partBuild2, GroupingPosition.MIDDLE, true, null, "11:08 AM", null, null, null, null, null, null, null, interfaceC1084f, 25016, 0, 4072);
        Lb.a.a(interfaceC1084f, W.e(aVar, f11));
        Part partBuild3 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(M1.k(BubbleMessageRowKt.getLongParagraphBlock())).build();
        kotlin.jvm.internal.i.d(partBuild3, "build(...)");
        GroupingPosition groupingPosition2 = GroupingPosition.BOTTOM;
        BubbleMessageRowKt.BubbleMessageRow(partBuild3, groupingPosition2, true, null, "11:10 AM", null, null, null, null, null, null, null, interfaceC1084f, 25016, 0, 4072);
        Lb.a.a(interfaceC1084f, W.e(aVar, f10));
        Part partBuild4 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(M1.k(BubbleMessageRowKt.getParagraphBlock())).withMetadata(new Metadata("Bob", null, 1726738186L, M1.k(new Avatar.Builder().withInitials("SK")), 2, null)).build();
        kotlin.jvm.internal.i.d(partBuild4, "build(...)");
        GroupingPosition groupingPosition3 = GroupingPosition.STANDALONE;
        BubbleMessageRowKt.BubbleMessageRow(partBuild4, groupingPosition3, true, null, "11:10 AM", null, null, null, null, null, null, null, interfaceC1084f, 25016, 0, 4072);
        Lb.a.a(interfaceC1084f, W.e(aVar, f10));
        Part partBuild5 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(M1.k(BubbleMessageRowKt.getParagraphBlock())).build();
        kotlin.jvm.internal.i.d(partBuild5, "build(...)");
        BubbleMessageRowKt.BubbleMessageRow(partBuild5, groupingPosition, false, null, "11:10 AM", null, null, null, null, null, null, null, interfaceC1084f, 25016, 0, 4072);
        Lb.a.a(interfaceC1084f, W.e(aVar, f11));
        Part partBuild6 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(M1.k(BubbleMessageRowKt.getLongParagraphBlock())).build();
        kotlin.jvm.internal.i.d(partBuild6, "build(...)");
        BubbleMessageRowKt.BubbleMessageRow(partBuild6, groupingPosition2, false, null, "11:08 AM", null, null, null, null, null, null, null, interfaceC1084f, 25016, 0, 4072);
        Lb.a.a(interfaceC1084f, W.e(aVar, f10));
        Part partBuild7 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(M1.k(BubbleMessageRowKt.getLongParagraphBlock())).build();
        kotlin.jvm.internal.i.d(partBuild7, "build(...)");
        BubbleMessageRowKt.BubbleMessageRow(partBuild7, groupingPosition3, false, null, "11:08 AM", null, null, null, null, null, new FailedMessage("Error message", new m()), null, interfaceC1084f, 25016, 0, 3048);
        interfaceC1084f.J();
    }
}
