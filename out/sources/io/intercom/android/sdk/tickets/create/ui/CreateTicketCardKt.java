package io.intercom.android.sdk.tickets.create.ui;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.components.C2280g;
import io.intercom.android.sdk.m5.components.C2282h;
import io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: CreateTicketCard.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CreateTicketCardKt {
    private static final Block sampleBlock = new Block.Builder().withType(BlockType.CREATETICKETCARD.getSerializedName()).withText("Admin has requested you to create a ticket").withTitle("Create ticket").withTicketTypeTitle("Bug").withTicketType(new TicketType(1234, "Bug", "🎟", EmptyList.f42983b, false)).build();

    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.create.ui.CreateTicketCardKt$CreateTicketCard$1, reason: invalid class name */
    /* JADX INFO: compiled from: CreateTicketCard.kt */
    public static final class AnonymousClass1 implements Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> {
        final /* synthetic */ BlockRenderData $blockRenderData;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ Ia.a<p293xa.r> $onClick;

        public AnonymousClass1(boolean z10, Ia.a<p293xa.r> aVar, BlockRenderData blockRenderData) {
            this.$enabled = z10;
            this.$onClick = aVar;
            this.$blockRenderData = blockRenderData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$1$lambda$0(Ia.a aVar) {
            if (aVar != null) {
                aVar.invoke();
            }
            return p293xa.r.f47939a;
        }

        @Override // Ia.q
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0954n interfaceC0954n, InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC0954n, interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC0954n IntercomCard, InterfaceC1084f interfaceC1084f, int i10) {
            kotlin.jvm.internal.i.e(IntercomCard, "$this$IntercomCard");
            if ((i10 & 81) == 16 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            boolean z10 = this.$enabled;
            interfaceC1084f.L(2105918451);
            boolean zK = interfaceC1084f.K(this.$onClick);
            final Ia.a<p293xa.r> aVar2 = this.$onClick;
            Object objF = interfaceC1084f.f();
            if (zK || objF == InterfaceC1084f.a.f12980a) {
                objF = new Ia.a() { // from class: io.intercom.android.sdk.tickets.create.ui.u
                    @Override // Ia.a
                    public final Object invoke() {
                        return CreateTicketCardKt.AnonymousClass1.invoke$lambda$1$lambda$0(aVar2);
                    }
                };
                interfaceC1084f.E(objF);
            }
            interfaceC1084f.D();
            androidx.compose.ui.h hVarC = ClickableKt.c(aVar, z10, null, (Ia.a) objF, 6);
            boolean z11 = this.$enabled;
            BlockRenderData blockRenderData = this.$blockRenderData;
            E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            int iF = interfaceC1084f.F();
            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f.z();
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f, hVarC);
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
            Ia.p<ComposeUiNode, E, p293xa.r> pVar = ComposeUiNode.Companion.f14337f;
            R0.a(pVar, interfaceC1084f, eD);
            Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar2 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar2, interfaceC1084f, interfaceC1089h0Z);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
            if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF))) {
                androidx.compose.animation.k.b(iF, interfaceC1084f, iF, pVar3);
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar4 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar4, interfaceC1084f, hVarC2);
            float f10 = 16;
            androidx.compose.ui.h hVarF = PaddingKt.f(W.d(aVar, 1.0f), f10);
            T tA = S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, interfaceC1084f, 54);
            int iF2 = interfaceC1084f.F();
            InterfaceC1089h0 interfaceC1089h0Z2 = interfaceC1084f.z();
            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f, hVarF);
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
            R0.a(pVar, interfaceC1084f, tA);
            R0.a(pVar2, interfaceC1084f, interfaceC1089h0Z2);
            if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF2))) {
                androidx.compose.animation.k.b(iF2, interfaceC1084f, iF2, pVar3);
            }
            R0.a(pVar4, interfaceC1084f, hVarC3);
            if (1.0f <= 0.0d) {
                p258v.a.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE));
            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f, 0);
            int iF3 = interfaceC1084f.F();
            InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f.z();
            androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(interfaceC1084f, layoutWeightElement);
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
            R0.a(pVar, interfaceC1084f, c0953mA);
            R0.a(pVar2, interfaceC1084f, interfaceC1089h0Z3);
            if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF3))) {
                androidx.compose.animation.k.b(iF3, interfaceC1084f, iF3, pVar3);
            }
            R0.a(pVar4, interfaceC1084f, hVarC4);
            String title = blockRenderData.getBlock().getTitle();
            kotlin.jvm.internal.i.d(title, "getTitle(...)");
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i11 = IntercomTheme.$stable;
            TextKt.b(title, Cb.a.c(aVar, BubbleMessageRowKt.contentAlpha(z11, interfaceC1084f, 0)), intercomTheme.getColors(interfaceC1084f, i11).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(interfaceC1084f, i11).getType04SemiBold(), interfaceC1084f, 0, 0, 65528);
            Lb.a.a(interfaceC1084f, W.e(aVar, 2));
            TextKt.b(blockRenderData.getBlock().getTicketType().getName(), Cb.a.c(aVar, BubbleMessageRowKt.contentAlpha(z11, interfaceC1084f, 0)), Q3.d.e(4285887861L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(interfaceC1084f, i11).getType04(), interfaceC1084f, 384, 0, 65528);
            interfaceC1084f.J();
            Lb.a.a(interfaceC1084f, W.q(aVar, f10));
            IconKt.a(U.c.a(R.drawable.intercom_ticket_detail_icon, interfaceC1084f, 0), null, Cb.a.c(W.m(aVar, f10), BubbleMessageRowKt.contentAlpha(z11, interfaceC1084f, 0)), intercomTheme.getColors(interfaceC1084f, i11).m616getActionContrastWhite0d7_KjU(), interfaceC1084f, 56, 0);
            interfaceC1084f.J();
            interfaceC1084f.J();
        }
    }

    public static final void CreateTicketCard(androidx.compose.ui.h hVar, final BlockRenderData blockRenderData, final boolean z10, Ia.a<p293xa.r> aVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        kotlin.jvm.internal.i.e(blockRenderData, "blockRenderData");
        C1086g c1086gP = interfaceC1084f.p(-214450953);
        final androidx.compose.ui.h hVar2 = (i11 & 1) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        Ia.a<p293xa.r> aVar2 = (i11 & 8) != 0 ? null : aVar;
        IntercomCardKt.IntercomCard(W.d(hVar2, 1.0f), IntercomCardStyle.INSTANCE.m530conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, c1086gP, IntercomCardStyle.$stable << 15, 31), androidx.compose.runtime.internal.a.b(1721044843, new AnonymousClass1(z10, aVar2, blockRenderData), c1086gP), c1086gP, (IntercomCardStyle.Style.$stable << 3) | 384, 0);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final Ia.a<p293xa.r> aVar3 = aVar2;
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.tickets.create.ui.t
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return CreateTicketCardKt.CreateTicketCard$lambda$0(hVar2, blockRenderData, z10, aVar3, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r CreateTicketCard$lambda$0(androidx.compose.ui.h hVar, BlockRenderData blockRenderData, boolean z10, Ia.a aVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(blockRenderData, "$blockRenderData");
        CreateTicketCard(hVar, blockRenderData, z10, aVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    private static final void DisabledCreateTicketCardPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1443652823);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$CreateTicketCardKt.INSTANCE.m483getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2280g(i10, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r DisabledCreateTicketCardPreview$lambda$2(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        DisabledCreateTicketCardPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    private static final void EnabledCreateTicketCardPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1535832576);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$CreateTicketCardKt.INSTANCE.m482getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2282h(i10, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r EnabledCreateTicketCardPreview$lambda$1(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        EnabledCreateTicketCardPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
