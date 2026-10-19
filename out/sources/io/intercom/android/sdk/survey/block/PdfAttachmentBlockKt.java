package io.intercom.android.sdk.survey.block;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.U;
import androidx.compose.foundation.layout.V;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.layout.InterfaceC1161g;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.BlockAttachment;
import io.intercom.android.sdk.m5.components.C2282h;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.ui.preview.data.DownloadState;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.ui.preview.ui.IntercomPreviewActivity;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;

/* JADX INFO: compiled from: PdfAttachmentBlock.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class PdfAttachmentBlockKt {
    /* JADX INFO: renamed from: PdfAttachmentBlock-ww6aTOc, reason: not valid java name */
    public static final void m391PdfAttachmentBlockww6aTOc(final BlockAttachment blockAttachment, final boolean z10, androidx.compose.ui.h hVar, long j, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        long jM645getPrimaryText0d7_KjU;
        int i12;
        kotlin.jvm.internal.i.e(blockAttachment, "blockAttachment");
        C1086g c1086gP = interfaceC1084f.p(369048797);
        int i13 = i11 & 4;
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        androidx.compose.ui.h hVar2 = i13 != 0 ? aVar : hVar;
        if ((i11 & 8) != 0) {
            jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
            i12 = i10 & (-7169);
        } else {
            jM645getPrimaryText0d7_KjU = j;
            i12 = i10;
        }
        float f10 = 90;
        final Context context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
        p013b0.c cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
        final String strP = S4.o.p(c1086gP, R.string.intercom_permission_denied);
        final String strP2 = S4.o.p(c1086gP, R.string.intercom_file_saved);
        final String strP3 = S4.o.p(c1086gP, R.string.intercom_something_went_wrong_try_again);
        final String strP4 = S4.o.p(c1086gP, R.string.intercom_saving);
        String url = blockAttachment.getUrl();
        kotlin.jvm.internal.i.d(url, "getUrl(...)");
        String str = (String) kotlin.collections.q.O(kotlin.text.n.e0(url, new String[]{"?"}, 0, 6));
        androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
        final androidx.compose.ui.h hVar3 = hVar2;
        float f11 = 4;
        androidx.compose.ui.h hVarI = PaddingKt.i(ClickableKt.c(W.t(hVar2, null, 3), false, null, new Ia.a() { // from class: io.intercom.android.sdk.survey.block.t
            @Override // Ia.a
            public final Object invoke() {
                return PdfAttachmentBlockKt.PdfAttachmentBlock_ww6aTOc$lambda$0(context, blockAttachment, strP4, strP2, strP3, strP);
            }
        }, 7), z10 ? 16 : 4, f11, z10 ? 4 : 16, f11);
        T tA = S.a(C0945e.f10284a, bVar, c1086gP, 48);
        int i14 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarI);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
            J4.i.d(i14, c1086gP, i14, pVar);
        }
        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
        V v10 = V.f10222a;
        if (z10) {
            c1086gP.L(189348674);
            m392PdfDetailsFNF3uiM(v10, blockAttachment, jM645getPrimaryText0d7_KjU, true, c1086gP, 3142 | ((i12 >> 3) & 896));
            Lb.a.a(c1086gP, W.q(aVar, 16));
            m393PdfThumbnail3xixttE(context, str, blockAttachment, cVar, f10, c1086gP, 25096);
            c1086gP.T(false);
        } else {
            c1086gP.L(189553057);
            m393PdfThumbnail3xixttE(context, str, blockAttachment, cVar, f10, c1086gP, 25096);
            Lb.a.a(c1086gP, W.q(aVar, 16));
            m392PdfDetailsFNF3uiM(v10, blockAttachment, jM645getPrimaryText0d7_KjU, false, c1086gP, 3142 | ((i12 >> 3) & 896));
            c1086gP.T(false);
        }
        c1086gP.T(true);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final long j10 = jM645getPrimaryText0d7_KjU;
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.survey.block.u
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    androidx.compose.ui.h hVar4 = hVar3;
                    int i15 = i10;
                    int i16 = i11;
                    return PdfAttachmentBlockKt.PdfAttachmentBlock_ww6aTOc$lambda$2(blockAttachment, z10, hVar4, j10, i15, i16, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    @IntercomPreviews
    private static final void PdfAttachmentBlockPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1883421095);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$PdfAttachmentBlockKt.INSTANCE.m386getLambda4$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2282h(i10, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r PdfAttachmentBlockPreview$lambda$8(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        PdfAttachmentBlockPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r PdfAttachmentBlock_ww6aTOc$lambda$0(Context context, BlockAttachment blockAttachment, String fileSavingText, String fileSavedText, String saveFailedText, String permissionDeniedText) {
        kotlin.jvm.internal.i.e(context, "$context");
        kotlin.jvm.internal.i.e(blockAttachment, "$blockAttachment");
        kotlin.jvm.internal.i.e(fileSavingText, "$fileSavingText");
        kotlin.jvm.internal.i.e(fileSavedText, "$fileSavedText");
        kotlin.jvm.internal.i.e(saveFailedText, "$saveFailedText");
        kotlin.jvm.internal.i.e(permissionDeniedText, "$permissionDeniedText");
        IntercomPreviewActivity.Companion companion = IntercomPreviewActivity.Companion;
        String url = blockAttachment.getUrl();
        kotlin.jvm.internal.i.d(url, "getUrl(...)");
        List listK = M1.k(new IntercomPreviewFile.NetworkFile(url, "application/pdf"));
        String url2 = blockAttachment.getUrl();
        kotlin.jvm.internal.i.d(url2, "getUrl(...)");
        context.startActivity(companion.createIntent(context, new IntercomPreviewArgs(listK, null, null, false, new DownloadState(url2.length() > 0, fileSavingText, fileSavedText, saveFailedText, permissionDeniedText), 14, null)));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r PdfAttachmentBlock_ww6aTOc$lambda$2(BlockAttachment blockAttachment, boolean z10, androidx.compose.ui.h hVar, long j, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(blockAttachment, "$blockAttachment");
        m391PdfAttachmentBlockww6aTOc(blockAttachment, z10, hVar, j, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: renamed from: PdfDetails-FNF3uiM, reason: not valid java name */
    private static final void m392PdfDetailsFNF3uiM(final U u10, final BlockAttachment blockAttachment, final long j, final boolean z10, InterfaceC1084f interfaceC1084f, final int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1205911716);
        androidx.compose.ui.h hVarB = u10.b(androidx.compose.ui.h.a.f13984b, false);
        C0953m c0953mA = C0952l.a(C0945e.f10288e, z10 ? androidx.compose.ui.d.a.f13346m : androidx.compose.ui.d.a.f13348o, c1086gP, 6);
        int i11 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarB);
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
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i11))) {
            J4.i.d(i11, c1086gP, i11, pVar);
        }
        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
        String name = blockAttachment.getName();
        kotlin.jvm.internal.i.d(name, "getName(...)");
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i12 = IntercomTheme.$stable;
        int i13 = i10 & 896;
        TextKt.b(name, null, j, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(c1086gP, i12).getType04(), c1086gP, i13, 3120, 55290);
        String humanFileSize = blockAttachment.getHumanFileSize();
        kotlin.jvm.internal.i.d(humanFileSize, "getHumanFileSize(...)");
        TextKt.b(humanFileSize, null, j, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(c1086gP, i12).getType05(), c1086gP, i13, 3120, 55290);
        c1086gP.T(true);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.survey.block.s
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return PdfAttachmentBlockKt.PdfDetails_FNF3uiM$lambda$4(u10, blockAttachment, j, z10, i10, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r PdfDetails_FNF3uiM$lambda$4(U this_PdfDetails, BlockAttachment blockAttachment, long j, boolean z10, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        kotlin.jvm.internal.i.e(this_PdfDetails, "$this_PdfDetails");
        kotlin.jvm.internal.i.e(blockAttachment, "$blockAttachment");
        m392PdfDetailsFNF3uiM(this_PdfDetails, blockAttachment, j, z10, interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: renamed from: PdfThumbnail-3xixttE, reason: not valid java name */
    private static final void m393PdfThumbnail3xixttE(final Context context, final String str, final BlockAttachment blockAttachment, final p013b0.c cVar, final float f10, InterfaceC1084f interfaceC1084f, final int i10) {
        C1086g c1086gP = interfaceC1084f.p(1296049859);
        coil.request.g.a aVar = new coil.request.g.a(context);
        aVar.f23077f = str != null ? new X2.b.a(str) : null;
        aVar.f23078g = str;
        aVar.f23074c = blockAttachment.getUrl();
        aVar.e((int) cVar.T0(f10), (int) cVar.T0(f10));
        aVar.b();
        aVar.c(R.drawable.intercom_image_load_failed);
        coil.request.g gVarA = aVar.a();
        coil.f imageLoader = IntercomImageLoaderKt.getImageLoader(context);
        String name = blockAttachment.getName();
        androidx.compose.ui.h hVarM = W.m(A8.p.r(androidx.compose.ui.h.a.f13984b, p270w.g.b(5)), f10);
        InterfaceC1161g.a.C0159a c0159a = InterfaceC1161g.a.f14243a;
        ComposableSingletons$PdfAttachmentBlockKt composableSingletons$PdfAttachmentBlockKt = ComposableSingletons$PdfAttachmentBlockKt.INSTANCE;
        coil.compose.u.a(gVarA, name, imageLoader, hVarM, composableSingletons$PdfAttachmentBlockKt.m383getLambda1$intercom_sdk_base_release(), composableSingletons$PdfAttachmentBlockKt.m384getLambda2$intercom_sdk_base_release(), null, null, null, c0159a, c1086gP, 12780040, 384, 257872);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.survey.block.r
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return PdfAttachmentBlockKt.PdfThumbnail_3xixttE$lambda$7(context, str, blockAttachment, cVar, f10, i10, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r PdfThumbnail_3xixttE$lambda$7(Context context, String str, BlockAttachment blockAttachment, p013b0.c density, float f10, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        kotlin.jvm.internal.i.e(context, "$context");
        kotlin.jvm.internal.i.e(blockAttachment, "$blockAttachment");
        kotlin.jvm.internal.i.e(density, "$density");
        m393PdfThumbnail3xixttE(context, str, blockAttachment, density, f10, interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
