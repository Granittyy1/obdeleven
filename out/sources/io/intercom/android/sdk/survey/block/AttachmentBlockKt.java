package io.intercom.android.sdk.survey.block;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.F;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.lib.models.BlockAttachment;
import io.intercom.android.sdk.m5.components.E0;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.extension.ContentTypeExtensionKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.LinkOpener;
import java.util.List;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: AttachmentBlock.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AttachmentBlockKt {
    public static final void AttachmentBlock(androidx.compose.ui.h hVar, final BlockRenderData blockRenderData, final boolean z10, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        kotlin.jvm.internal.i.e(blockRenderData, "blockRenderData");
        C1086g c1086gP = interfaceC1084f.p(-1719159681);
        int i12 = i11 & 1;
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        final androidx.compose.ui.h hVar2 = i12 != 0 ? aVar : hVar;
        C0953m c0953mA = C0952l.a(C0945e.g(8), androidx.compose.ui.d.a.f13346m, c1086gP, 6);
        int i13 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVar2);
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
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
            J4.i.d(i13, c1086gP, i13, pVar);
        }
        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
        H hM378getTextColorQN2ZGVo = blockRenderData.getTextStyle().m378getTextColorQN2ZGVo();
        if (hM378getTextColorQN2ZGVo == null) {
            hM378getTextColorQN2ZGVo = blockRenderData.m366getTextColorQN2ZGVo();
        }
        c1086gP.L(-1626976079);
        long jM645getPrimaryText0d7_KjU = hM378getTextColorQN2ZGVo == null ? IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU() : hM378getTextColorQN2ZGVo.f13506a;
        c1086gP.T(false);
        c1086gP.L(-1626970016);
        List<BlockAttachment> attachments = blockRenderData.getBlock().getAttachments();
        kotlin.jvm.internal.i.d(attachments, "getAttachments(...)");
        for (BlockAttachment blockAttachment : attachments) {
            String contentType = blockAttachment.getContentType();
            kotlin.jvm.internal.i.d(contentType, "getContentType(...)");
            if (ContentTypeExtensionKt.isVideo(contentType)) {
                c1086gP.L(1321275707);
                VideoAttachmentBlock(A8.p.r(aVar, IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b), blockAttachment, c1086gP, 64, 0);
                c1086gP.T(false);
            } else {
                String contentType2 = blockAttachment.getContentType();
                kotlin.jvm.internal.i.d(contentType2, "getContentType(...)");
                if (ContentTypeExtensionKt.isPdf(contentType2)) {
                    c1086gP.L(1321435977);
                    PdfAttachmentBlockKt.m391PdfAttachmentBlockww6aTOc(blockAttachment, z10, null, jM645getPrimaryText0d7_KjU, c1086gP, ((i10 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8, 4);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(1321554459);
                    m362TextAttachmentBlockFNF3uiM(null, blockAttachment, jM645getPrimaryText0d7_KjU, c1086gP, 64, 1);
                    c1086gP.T(false);
                }
            }
        }
        C1105p0 c1105p0A = C4.a.a(c1086gP, false, true);
        if (c1105p0A != null) {
            c1105p0A.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.survey.block.c
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    androidx.compose.ui.h hVar3 = hVar2;
                    int i14 = i10;
                    int i15 = i11;
                    return AttachmentBlockKt.AttachmentBlock$lambda$2(hVar3, blockRenderData, z10, i14, i15, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r AttachmentBlock$lambda$2(androidx.compose.ui.h hVar, BlockRenderData blockRenderData, boolean z10, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(blockRenderData, "$blockRenderData");
        AttachmentBlock(hVar, blockRenderData, z10, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void AttachmentBlockPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-550090117);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AttachmentBlockKt.INSTANCE.m380getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new E0(i10, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r AttachmentBlockPreview$lambda$7(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        AttachmentBlockPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: renamed from: TextAttachmentBlock-FNF3uiM, reason: not valid java name */
    public static final void m362TextAttachmentBlockFNF3uiM(androidx.compose.ui.h hVar, final BlockAttachment blockAttachment, long j, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        long jM645getPrimaryText0d7_KjU;
        int i12;
        kotlin.jvm.internal.i.e(blockAttachment, "blockAttachment");
        C1086g c1086gP = interfaceC1084f.p(-1146554998);
        final androidx.compose.ui.h hVar2 = (i11 & 1) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        if ((i11 & 4) != 0) {
            jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
            i12 = i10 & (-897);
        } else {
            jM645getPrimaryText0d7_KjU = j;
            i12 = i10;
        }
        androidx.compose.ui.h hVarC = ClickableKt.c(hVar2, false, null, new io.intercom.android.sdk.blocks.a(blockAttachment, (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b), 1), 7);
        T tA = S.a(C0945e.g(4), androidx.compose.ui.d.a.f13344k, c1086gP, 54);
        int i13 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarC);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar);
        } else {
            c1086gP.A();
        }
        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
            J4.i.d(i13, c1086gP, i13, pVar);
        }
        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
        IconKt.a(U.c.a(io.intercom.android.sdk.R.drawable.intercom_ic_attachment, c1086gP, 0), "Attachment Icon", null, jM645getPrimaryText0d7_KjU, c1086gP, ((i12 << 3) & 7168) | 56, 4);
        String name = blockAttachment.getName();
        kotlin.jvm.internal.i.d(name, "getName(...)");
        TextKt.b(name, null, jM645getPrimaryText0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04(), 0L, 0L, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, 0, 0L, null, null, 16773119), c1086gP, i12 & 896, 0, 65530);
        c1086gP.T(true);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final long j10 = jM645getPrimaryText0d7_KjU;
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.survey.block.b
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AttachmentBlockKt.TextAttachmentBlock_FNF3uiM$lambda$5(hVar2, blockAttachment, j10, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TextAttachmentBlock_FNF3uiM$lambda$3(BlockAttachment blockAttachment, Context context) {
        kotlin.jvm.internal.i.e(blockAttachment, "$blockAttachment");
        kotlin.jvm.internal.i.e(context, "$context");
        LinkOpener.handleUrl(blockAttachment.getUrl(), context, Injector.get().getApi());
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TextAttachmentBlock_FNF3uiM$lambda$5(androidx.compose.ui.h hVar, BlockAttachment blockAttachment, long j, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(blockAttachment, "$blockAttachment");
        m362TextAttachmentBlockFNF3uiM(hVar, blockAttachment, j, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    public static final void VideoAttachmentBlock(androidx.compose.ui.h hVar, BlockAttachment blockAttachment, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        kotlin.jvm.internal.i.e(blockAttachment, "blockAttachment");
        C1086g c1086gP = interfaceC1084f.p(-745319067);
        if ((i11 & 1) != 0) {
            hVar = androidx.compose.ui.h.a.f13984b;
        }
        String url = blockAttachment.getUrl();
        kotlin.jvm.internal.i.d(url, "getUrl(...)");
        VideoFileBlockKt.VideoFileBlock(hVar, url, null, c1086gP, (i10 & 14) | 384, 0);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2463a(hVar, blockAttachment, i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r VideoAttachmentBlock$lambda$6(androidx.compose.ui.h hVar, BlockAttachment blockAttachment, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(blockAttachment, "$blockAttachment");
        VideoAttachmentBlock(hVar, blockAttachment, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }
}
