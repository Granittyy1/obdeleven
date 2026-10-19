package io.intercom.android.sdk.survey.ui.questiontype.files;

import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.m5.components.C2271b0;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: FileUploadProgressComponent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class FileUploadProgressComponentKt {
    public static final void FileUploadProgressComponent(String title, Ia.a<p293xa.r> onStopUploading, InterfaceC1084f interfaceC1084f, int i10) {
        int i11;
        C1086g c1086g;
        kotlin.jvm.internal.i.e(title, "title");
        kotlin.jvm.internal.i.e(onStopUploading, "onStopUploading");
        C1086g c1086gP = interfaceC1084f.p(-1826067636);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(title) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.k(onStopUploading) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 91) == 18 && c1086gP.s()) {
            c1086gP.w();
            c1086g = c1086gP;
        } else {
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            androidx.compose.ui.h hVarD = W.d(aVar, 1.0f);
            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
            int i13 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarD);
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
            TextKt.b(title, PaddingKt.f(W.d(aVar, 1.0f), 16), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04(), c1086gP, (i12 & 14) | 48, 0, 65532);
            androidx.compose.ui.h hVarH = PaddingKt.h(W.d(aVar, 1.0f), 0.0f, 4, 1);
            c1086g = c1086gP;
            IntercomDividerKt.IntercomDivider(hVarH, c1086g, 6, 0);
            FileUploadErrorComponentKt.m441ActionRowFHprtrg(null, io.intercom.android.sdk.R.drawable.intercom_close, io.intercom.android.sdk.R.string.intercom_stop_upload, 0, 0L, onStopUploading, c1086g, (i12 << 12) & 458752, 25);
            c1086g.T(true);
        }
        C1105p0 c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.m5.home.ui.components.l(title, onStopUploading, i10, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r FileUploadProgressComponent$lambda$1(String title, Ia.a onStopUploading, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        kotlin.jvm.internal.i.e(title, "$title");
        kotlin.jvm.internal.i.e(onStopUploading, "$onStopUploading");
        FileUploadProgressComponent(title, onStopUploading, interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void UploadingActionSheetContentPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(2021767087);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$FileUploadProgressComponentKt.INSTANCE.m438getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2271b0(i10, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r UploadingActionSheetContentPreview$lambda$2(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        UploadingActionSheetContentPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
