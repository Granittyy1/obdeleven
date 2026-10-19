package io.intercom.android.sdk.survey.ui.components;

import Ia.p;
import S4.o;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.l;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.helpcenter.articles.u;
import io.intercom.android.sdk.m5.conversation.ui.components.O;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.survey.block.BlockRenderTextStyle;
import io.intercom.android.sdk.survey.block.BlockViewKt;
import io.intercom.android.sdk.survey.block.SuffixText;
import io.intercom.android.sdk.survey.ui.components.validation.ValidationErrorComponentKt;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.m;
import kotlin.text.n;
import p293xa.r;

/* JADX INFO: compiled from: QuestionHeaderComponent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class QuestionHeaderComponentKt {
    public static final void HeaderWithError(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(784176451);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            m404QuestionHeadern1tc1qA(M1.k(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText("How would your rate your experience?")), null, true, new ValidationError.ValidationStringError(R.string.intercom_surveys_required_response, null, 2, null), l.f15442g, G0.a.g(14), null, null, c1086gP, 225672, 194);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new O(i10, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r HeaderWithError$lambda$7(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        HeaderWithError(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    public static final void HeaderWithoutError(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1382338223);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            androidx.compose.ui.h hVarD = W.d(androidx.compose.ui.h.a.f13984b, 1.0f);
            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
            int i11 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarD);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i11))) {
                J4.i.d(i11, c1086gP, i11, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            m404QuestionHeadern1tc1qA(M1.k(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText("How would your rate your experience?")), new StringProvider.ActualString("Please select a rating"), true, ValidationError.NoValidationError.INSTANCE, l.f15442g, G0.a.g(16), null, null, c1086gP, (StringProvider.ActualString.$stable << 3) | 224648, 192);
            c1086gP.T(true);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new u(i10, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r HeaderWithoutError$lambda$9(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        HeaderWithoutError(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    /* JADX INFO: renamed from: QuestionHeader-n1tc1qA, reason: not valid java name */
    public static final void m404QuestionHeadern1tc1qA(final List<Block.Builder> title, StringProvider stringProvider, final boolean z10, final ValidationError validationError, final l fontWeight, final long j, p<? super InterfaceC1084f, ? super Integer, r> pVar, Integer num, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        final StringProvider actualString;
        int i12;
        kotlin.jvm.internal.i.e(title, "title");
        kotlin.jvm.internal.i.e(validationError, "validationError");
        kotlin.jvm.internal.i.e(fontWeight, "fontWeight");
        C1086g c1086gP = interfaceC1084f.p(224116790);
        if ((i11 & 2) != 0) {
            actualString = new StringProvider.ActualString("");
            i12 = i10 & (-113);
        } else {
            actualString = stringProvider;
            i12 = i10;
        }
        final p<? super InterfaceC1084f, ? super Integer, r> pVar2 = (i11 & 64) != 0 ? null : pVar;
        final Integer num2 = (i11 & 128) != 0 ? null : num;
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
        int i13 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, aVar);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA);
        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
        p<ComposeUiNode, Integer, r> pVar3 = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
            J4.i.d(i13, c1086gP, i13, pVar3);
        }
        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
        long jM633getError0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m633getError0d7_KjU();
        c1086gP.L(788845668);
        ListBuilder listBuilderF = M1.f();
        listBuilderF.addAll(title);
        if (num2 != null) {
            listBuilderF.add(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText(o.p(c1086gP, num2.intValue())));
        }
        ListBuilder listBuilderI = listBuilderF.I();
        ArrayList arrayList = new ArrayList(m.y(listBuilderI, 10));
        ListIterator listIterator = listBuilderI.listIterator(0);
        while (true) {
            ListBuilder.a aVar3 = (ListBuilder.a) listIterator;
            if (!aVar3.hasNext()) {
                break;
            }
            Block.Builder builder = (Block.Builder) aVar3.next();
            arrayList.add(builder.withText(builder.build().getText()).build());
        }
        int i14 = 0;
        for (Object obj : arrayList) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                kotlin.collections.l.x();
                throw null;
            }
            Block block = (Block) obj;
            if (i14 == 0 && z10) {
                c1086gP.L(669360671);
                c1086gP.L(-671143347);
                long jM645getPrimaryText0d7_KjU = validationError instanceof ValidationError.ValidationStringError ? jM633getError0d7_KjU : IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                c1086gP.T(false);
                String strP = o.p(c1086gP, R.string.intercom_surveys_required_response);
                kotlin.jvm.internal.i.b(block);
                BlockViewKt.BlockView(null, new BlockRenderData(block, null, null, null, new BlockRenderTextStyle(j, fontWeight, 0L, null, null, null, 60, null), 14, null), false, new SuffixText(" *", strP, jM645getPrimaryText0d7_KjU, null), false, null, null, null, null, false, null, null, c1086gP, 64, 0, 4085);
                c1086gP.T(false);
            } else {
                c1086gP.L(670259702);
                kotlin.jvm.internal.i.b(block);
                BlockViewKt.BlockView(null, new BlockRenderData(block, null, null, null, new BlockRenderTextStyle(j, fontWeight, 0L, null, null, null, 60, null), 14, null), false, null, false, null, null, null, null, false, null, null, c1086gP, 64, 0, 4093);
                c1086gP.T(false);
            }
            i14 = i15;
        }
        r rVar = null;
        c1086gP.T(false);
        c1086gP.L(788890949);
        if (validationError instanceof ValidationError.ValidationStringError) {
            c1086gP.L(-1314135158);
            Lb.a.a(c1086gP, W.e(aVar, 4));
            c1086gP.L(788894911);
            if (pVar2 != null) {
                pVar2.invoke(c1086gP, Integer.valueOf((i12 >> 18) & 14));
                rVar = r.f47939a;
            }
            c1086gP.T(false);
            if (rVar == null) {
                ValidationErrorComponentKt.m406ValidationErrorComponentFNF3uiM(null, (ValidationError.ValidationStringError) validationError, jM633getError0d7_KjU, c1086gP, 64, 1);
            }
            c1086gP.T(false);
        } else {
            c1086gP.L(788901884);
            int i16 = ((i12 >> 3) & 14) | StringProvider.$stable;
            boolean zS = n.S(actualString.getText(c1086gP, i16));
            c1086gP.T(false);
            if (!zS) {
                c1086gP.L(-1313820446);
                Lb.a.a(c1086gP, W.e(aVar, 4));
                String text = actualString.getText(c1086gP, i16);
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i17 = IntercomTheme.$stable;
                TextKt.b(text, null, H.b(0.6f, intercomTheme.getColors(c1086gP, i17).m645getPrimaryText0d7_KjU()), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i17).getType04(), c1086gP, 0, 0, 65530);
                c1086gP.T(false);
            }
        }
        C1105p0 c1105p0A = C4.a.a(c1086gP, false, true);
        if (c1105p0A != null) {
            c1105p0A.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.components.e
                @Override // Ia.p
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return QuestionHeaderComponentKt.QuestionHeader_n1tc1qA$lambda$6(title, actualString, z10, validationError, fontWeight, j, pVar2, num2, i10, i11, (InterfaceC1084f) obj2, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r QuestionHeader_n1tc1qA$lambda$6(List title, StringProvider stringProvider, boolean z10, ValidationError validationError, l fontWeight, long j, p pVar, Integer num, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(title, "$title");
        kotlin.jvm.internal.i.e(validationError, "$validationError");
        kotlin.jvm.internal.i.e(fontWeight, "$fontWeight");
        m404QuestionHeadern1tc1qA(title, stringProvider, z10, validationError, fontWeight, j, pVar, num, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }
}
