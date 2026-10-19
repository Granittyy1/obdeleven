package io.intercom.android.sdk.survey.block;

import android.content.Context;
import android.graphics.ColorMatrixColorFilter;
import android.util.Patterns;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0949i;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.J;
import androidx.compose.ui.graphics.K;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.layout.InterfaceC1161g;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import coil.compose.AsyncImagePainter;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.LinkOpener;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: VideoFileBlock.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class VideoFileBlockKt {
    public static final void VideoFileBlock(androidx.compose.ui.h hVar, final String videoUrl, final String str, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        androidx.compose.ui.h hVar2;
        int i12;
        K k10;
        final androidx.compose.ui.h hVar3;
        kotlin.jvm.internal.i.e(videoUrl, "videoUrl");
        C1086g c1086gP = interfaceC1084f.p(-224511788);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            hVar2 = hVar;
        } else if ((i10 & 14) == 0) {
            hVar2 = hVar;
            i12 = (c1086gP.K(hVar2) ? 4 : 2) | i10;
        } else {
            hVar2 = hVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.K(videoUrl) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= c1086gP.K(str) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && c1086gP.s()) {
            c1086gP.w();
            hVar3 = hVar2;
        } else {
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            androidx.compose.ui.h hVar4 = i13 != 0 ? aVar : hVar2;
            Context context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
            coil.request.g.a aVar2 = new coil.request.g.a(context);
            aVar2.f23074c = (str == null || str.length() == 0) ? videoUrl : str;
            aVar2.b();
            aVar2.c(io.intercom.android.sdk.R.drawable.intercom_image_load_failed);
            AsyncImagePainter asyncImagePainterA = coil.compose.f.a(aVar2.a(), IntercomImageLoaderKt.getImageLoader(context), null, null, null, 0, c1086gP, R.styleable.AppCompatTheme_windowMinWidthMajor);
            androidx.compose.ui.h hVarC = ClickableKt.c(hVar4, false, null, new io.intercom.android.sdk.c(videoUrl, 1, context), 7);
            E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            int i14 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarC);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar3);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
                J4.i.d(i14, c1086gP, i14, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
            C0949i c0949i = C0949i.f10304a;
            float[] fArrA = J.a();
            J.b(0.0f, fArrA);
            androidx.compose.ui.h hVarN = W.n(640, 180, aVar);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i15 = IntercomTheme.$stable;
            androidx.compose.ui.h hVarB = C0932d.b(hVarN, intercomTheme.getColors(c1086gP, i15).m624getBubbleBackground0d7_KjU(), h0.f13629a);
            androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
            androidx.compose.ui.h hVarF = c0949i.f(hVarB, fVar);
            InterfaceC1161g.a.C0159a c0159a = InterfaceC1161g.a.f14243a;
            if (isRemoteUrl(videoUrl)) {
                k10 = null;
            } else {
                K k11 = new K(new ColorMatrixColorFilter(fArrA));
                k11.f13508b = fArrA;
                k10 = k11;
            }
            androidx.compose.ui.h hVar5 = hVar4;
            ImageKt.a(asyncImagePainterA, "Video Thumbnail", hVarF, fVar, c0159a, 0.0f, k10, c1086gP, 27696, 32);
            if (isRemoteUrl(videoUrl)) {
                c1086gP.L(1592327165);
                ImageKt.a(U.c.a(io.intercom.android.sdk.R.drawable.intercom_play_arrow, c1086gP, 0), "Play Video", C0932d.b(W.m(c0949i.f(aVar, fVar), 48), intercomTheme.getColors(c1086gP, i15).m621getBackground0d7_KjU(), p270w.g.a(50)), null, InterfaceC1161g.a.f14248f, 0.0f, new androidx.compose.ui.graphics.A(5, intercomTheme.getColors(c1086gP, i15).m616getActionContrastWhite0d7_KjU()), c1086gP, 24632, 40);
                c1086gP.T(false);
            } else {
                c1086gP.L(1592846880);
                ProgressIndicatorKt.a(W.m(c0949i.f(aVar, fVar), 32), intercomTheme.getColors(c1086gP, i15).m621getBackground0d7_KjU(), 0.0f, 0L, 0, 0, c1086gP, 28);
                c1086gP.T(false);
            }
            c1086gP.T(true);
            hVar3 = hVar5;
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.survey.block.A
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return VideoFileBlockKt.VideoFileBlock$lambda$3(hVar3, videoUrl, str, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r VideoFileBlock$lambda$1(String videoUrl, Context context) {
        kotlin.jvm.internal.i.e(videoUrl, "$videoUrl");
        kotlin.jvm.internal.i.e(context, "$context");
        if (isRemoteUrl(videoUrl)) {
            LinkOpener.handleUrl(videoUrl, context, Injector.get().getApi());
        }
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r VideoFileBlock$lambda$3(androidx.compose.ui.h hVar, String videoUrl, String str, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(videoUrl, "$videoUrl");
        VideoFileBlock(hVar, videoUrl, str, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    private static final boolean isRemoteUrl(String str) {
        return Patterns.WEB_URL.matcher(str).matches();
    }
}
