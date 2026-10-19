package io.intercom.android.sdk.survey.block;

import android.content.Context;
import android.text.Spanned;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.B;
import androidx.compose.ui.text.F;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.C2289k0;
import io.intercom.android.sdk.m5.navigation.X;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: CodeBlock.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CodeBlockKt {
    public static final void CodeBlock(final Block block, androidx.compose.ui.h hVar, Ia.l<? super B, p293xa.r> lVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        kotlin.jvm.internal.i.e(block, "block");
        C1086g c1086gP = interfaceC1084f.p(-1370899294);
        androidx.compose.ui.h hVar2 = (i11 & 2) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        Ia.l<? super B, p293xa.r> x10 = (i11 & 4) != 0 ? new X(1) : lVar;
        Spanned spannedA = p307z0.b.a(block.getText(), 0);
        kotlin.jvm.internal.i.d(spannedA, "fromHtml(...)");
        final androidx.compose.ui.h hVar3 = hVar2;
        TextKt.c(BlockExtensionsKt.toAnnotatedString(spannedA, (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null), C0932d.b(PaddingKt.g(16, 12, hVar2), Q3.d.e(4285098354L), h0.f13629a), H.f13499f, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, x10, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04(), 0L, 0L, null, androidx.compose.ui.text.font.d.f15427d, 0L, null, 0, 0L, null, null, 16777183), c1086gP, 384, (i10 << 12) & 3670016, 65528);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final Ia.l<? super B, p293xa.r> lVar2 = x10;
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.survey.block.j
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    androidx.compose.ui.h hVar4 = hVar3;
                    int i12 = i10;
                    int i13 = i11;
                    return CodeBlockKt.CodeBlock$lambda$1(block, hVar4, lVar2, i12, i13, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r CodeBlock$lambda$0(B it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r CodeBlock$lambda$1(Block block, androidx.compose.ui.h hVar, Ia.l lVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(block, "$block");
        CodeBlock(block, hVar, lVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void CodeBlockPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1610207419);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$CodeBlockKt.INSTANCE.m382getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2289k0(i10, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r CodeBlockPreview$lambda$2(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        CodeBlockPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
