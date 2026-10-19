package io.intercom.android.sdk.survey.ui.questiontype.files;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.U;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.m5.components.z0;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.tickets.FIleAttachmentListKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: FileAttachmentList.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class FileAttachmentListKt {
    public static final void FileAttachmentList(List<Answer.MediaAnswer.MediaItem> items, final Ia.l<? super Answer.MediaAnswer.MediaItem, p293xa.r> onItemClick, InterfaceC1084f interfaceC1084f, int i10) {
        kotlin.jvm.internal.i.e(items, "items");
        kotlin.jvm.internal.i.e(onItemClick, "onItemClick");
        C1086g c1086gP = interfaceC1084f.p(-2107060022);
        C0945e.i iVarG = C0945e.g(8);
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        C0953m c0953mA = C0952l.a(iVarG, androidx.compose.ui.d.a.f13346m, c1086gP, 6);
        int i11 = c1086gP.f12996P;
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
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i11))) {
            J4.i.d(i11, c1086gP, i11, pVar);
        }
        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
        c1086gP.L(1339367056);
        for (final Answer.MediaAnswer.MediaItem mediaItem : items) {
            if (mediaItem.getUploadStatus() instanceof Answer.MediaAnswer.FileUploadStatus.Error) {
                c1086gP.L(-582474763);
                FIleAttachmentListKt.FailedFileAttached(ClickableKt.c(aVar, false, null, new q(onItemClick, 0, mediaItem), 7), mediaItem.getData().getFileName(), FIleAttachmentListKt.getFileType(mediaItem.getData().getMimeType()), c1086gP, 0, 0);
                c1086gP.T(false);
            } else {
                c1086gP.L(-582164546);
                FIleAttachmentListKt.m475FileAttachmentvRFhKjU(ClickableKt.c(aVar, false, null, new Ia.a() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.r
                    @Override // Ia.a
                    public final Object invoke() {
                        return FileAttachmentListKt.FileAttachmentList$lambda$3$lambda$2$lambda$1(onItemClick, mediaItem);
                    }
                }, 7), mediaItem.getData().getFileName(), FIleAttachmentListKt.getFileType(mediaItem.getData().getMimeType()), 0L, 0L, null, androidx.compose.runtime.internal.a.b(2007803062, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.FileAttachmentListKt$FileAttachmentList$1$1$3
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(u10, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(U FileAttachment, InterfaceC1084f interfaceC1084f2, int i12) {
                        kotlin.jvm.internal.i.e(FileAttachment, "$this$FileAttachment");
                        if ((i12 & 81) == 16 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        Answer.MediaAnswer.FileUploadStatus uploadStatus = mediaItem.getUploadStatus();
                        if (kotlin.jvm.internal.i.a(uploadStatus, Answer.MediaAnswer.FileUploadStatus.Uploading.INSTANCE)) {
                            ProgressIndicatorKt.a(W.m(androidx.compose.ui.h.a.f13984b, 16), 0L, 1, 0L, 0, 390, interfaceC1084f2, 26);
                        } else if (!kotlin.jvm.internal.i.a(uploadStatus, Answer.MediaAnswer.FileUploadStatus.None.INSTANCE) && !(uploadStatus instanceof Answer.MediaAnswer.FileUploadStatus.Success) && !(uploadStatus instanceof Answer.MediaAnswer.FileUploadStatus.Error) && !(uploadStatus instanceof Answer.MediaAnswer.FileUploadStatus.Queued)) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }, c1086gP), c1086gP, 1572864, 56);
                c1086gP.T(false);
            }
            aVar = aVar;
        }
        C1105p0 c1105p0A = C4.a.a(c1086gP, false, true);
        if (c1105p0A != null) {
            c1105p0A.f13109d = new io.intercom.android.sdk.post.f(items, onItemClick, i10, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r FileAttachmentList$lambda$3$lambda$2$lambda$0(Ia.l onItemClick, Answer.MediaAnswer.MediaItem it) {
        kotlin.jvm.internal.i.e(onItemClick, "$onItemClick");
        kotlin.jvm.internal.i.e(it, "$it");
        onItemClick.invoke(it);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r FileAttachmentList$lambda$3$lambda$2$lambda$1(Ia.l onItemClick, Answer.MediaAnswer.MediaItem it) {
        kotlin.jvm.internal.i.e(onItemClick, "$onItemClick");
        kotlin.jvm.internal.i.e(it, "$it");
        onItemClick.invoke(it);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r FileAttachmentList$lambda$4(List items, Ia.l onItemClick, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        kotlin.jvm.internal.i.e(items, "$items");
        kotlin.jvm.internal.i.e(onItemClick, "$onItemClick");
        FileAttachmentList(items, onItemClick, interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void FileAttachmentListErrorPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(232584117);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$FileAttachmentListKt.INSTANCE.m432getLambda4$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.helpcenter.articles.t(i10, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r FileAttachmentListErrorPreview$lambda$6(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        FileAttachmentListErrorPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void FileAttachmentListPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1973696025);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$FileAttachmentListKt.INSTANCE.m430getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new z0(i10, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r FileAttachmentListPreview$lambda$5(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        FileAttachmentListPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
