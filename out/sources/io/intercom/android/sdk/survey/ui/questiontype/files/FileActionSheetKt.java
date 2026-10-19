package io.intercom.android.sdk.survey.ui.questiontype.files;

import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.E;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.X;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.view.D;
import androidx.core.view.v0;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.m5.components.C2278f;
import io.intercom.android.sdk.m5.components.C2280g;
import io.intercom.android.sdk.m5.conversation.ui.components.L;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.preview.data.DeleteType;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.ui.preview.ui.PreviewRootScreenKt;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: FileActionSheet.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class FileActionSheetKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.files.FileActionSheetKt$FileActionSheetPreviewForStatus$1, reason: invalid class name */
    /* JADX INFO: compiled from: FileActionSheet.kt */
    public static final class AnonymousClass1 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
        final /* synthetic */ Answer.MediaAnswer.FileUploadStatus $uploadStatus;

        public AnonymousClass1(Answer.MediaAnswer.FileUploadStatus fileUploadStatus) {
            this.$uploadStatus = fileUploadStatus;
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
            Uri EMPTY = Uri.EMPTY;
            kotlin.jvm.internal.i.d(EMPTY, "EMPTY");
            Answer.MediaAnswer.MediaItem mediaItem = new Answer.MediaAnswer.MediaItem(new MediaData.Media.Image("image/png", 0, 0, 0L, "google.png", EMPTY));
            mediaItem.setUploadStatus(this.$uploadStatus);
            FileActionSheetKt.FileActionSheet(mediaItem, new m(), new n(), new o(), new p(), interfaceC1084f, 28080);
        }
    }

    /* JADX WARN: Code duplicated, block: B:88:0x020d  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    public static final void FileActionSheet(final Answer.MediaAnswer.MediaItem item, final Ia.a<p293xa.r> onRetryClick, final Ia.a<p293xa.r> onDeleteClick, final Ia.a<p293xa.r> onStopUploading, final Ia.a<p293xa.r> dismiss, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086g;
        C1105p0 c1105p0V;
        int i12 = 2;
        kotlin.jvm.internal.i.e(item, "item");
        kotlin.jvm.internal.i.e(onRetryClick, "onRetryClick");
        kotlin.jvm.internal.i.e(onDeleteClick, "onDeleteClick");
        kotlin.jvm.internal.i.e(onStopUploading, "onStopUploading");
        kotlin.jvm.internal.i.e(dismiss, "dismiss");
        C1086g c1086gP = interfaceC1084f.p(592767504);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(item) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.k(onRetryClick) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c1086gP.k(onDeleteClick) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= c1086gP.k(onStopUploading) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= c1086gP.k(dismiss) ? 16384 : 8192;
        }
        if ((46811 & i11) != 9362 || !c1086gP.s()) {
            c1086gP.L(-984100944);
            Object objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            if (objF == c0153a) {
                objF = J0.f(item.getUploadStatus());
                c1086gP.E(objF);
            }
            X x10 = (X) objF;
            c1086gP.T(false);
            if (!kotlin.jvm.internal.i.a(x10.getValue(), item.getUploadStatus())) {
                dismiss.invoke();
            }
            x10.setValue(item.getUploadStatus());
            Answer.MediaAnswer.FileUploadStatus uploadStatus = item.getUploadStatus();
            if (uploadStatus instanceof Answer.MediaAnswer.FileUploadStatus.Error) {
                c1086gP.L(-442066387);
                int i13 = i11 << 3;
                FileUploadErrorComponentKt.FileUploadErrorComponent(item.getData().getFileName(), ((Answer.MediaAnswer.FileUploadStatus.Error) uploadStatus).getError(), onRetryClick, onDeleteClick, c1086gP, (i13 & 896) | 64 | (i13 & 7168));
                c1086gP.T(false);
            } else if (uploadStatus instanceof Answer.MediaAnswer.FileUploadStatus.Success) {
                c1086gP.L(-441779513);
                final View view = (View) c1086gP.x(AndroidCompositionLocals_androidKt.f14797f);
                ViewParent parent = view.getParent();
                androidx.compose.ui.window.g gVar = parent instanceof androidx.compose.ui.window.g ? (androidx.compose.ui.window.g) parent : null;
                final Window windowA = gVar != null ? gVar.a() : null;
                c1086gP.L(-984074315);
                if (windowA != null) {
                    Ia.a<p293xa.r> aVar = new Ia.a() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.j
                        @Override // Ia.a
                        public final Object invoke() {
                            return FileActionSheetKt.FileActionSheet$lambda$2$lambda$1(windowA, view);
                        }
                    };
                    B b10 = E.f12831a;
                    c1086gP.l(aVar);
                    p293xa.r rVar = p293xa.r.f47939a;
                }
                c1086gP.T(false);
                androidx.compose.ui.h hVarB = C0932d.b(W.f10226c, H.f13495b, h0.f13629a);
                IntercomPreviewArgs intercomPreviewArgs = new IntercomPreviewArgs(M1.k(new IntercomPreviewFile.LocalFile(item.getData().getUri())), DeleteType.Delete.INSTANCE, null, false, null, 28, null);
                c1086gP.L(-984055211);
                boolean z10 = (i11 & 896) == 256;
                Object objF2 = c1086gP.f();
                if (z10 || objF2 == c0153a) {
                    objF2 = new L(i12, onDeleteClick);
                    c1086gP.E(objF2);
                }
                c1086gP.T(false);
                c1086g = c1086gP;
                PreviewRootScreenKt.PreviewRootScreen(hVarB, intercomPreviewArgs, null, dismiss, (Ia.l) objF2, new io.intercom.android.sdk.m5.navigation.L(3), c1086g, (IntercomPreviewArgs.$stable << 3) | 196614 | ((i11 >> 3) & 7168), 4);
                c1086g.T(false);
            } else {
                c1086g = c1086gP;
                if (kotlin.jvm.internal.i.a(uploadStatus, Answer.MediaAnswer.FileUploadStatus.Uploading.INSTANCE)) {
                    c1086g.L(-440835873);
                    FileUploadProgressComponentKt.FileUploadProgressComponent(item.getData().getFileName(), onStopUploading, c1086g, (i11 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                    c1086g.T(false);
                } else {
                    if (!kotlin.jvm.internal.i.a(uploadStatus, Answer.MediaAnswer.FileUploadStatus.None.INSTANCE) && !kotlin.jvm.internal.i.a(uploadStatus, Answer.MediaAnswer.FileUploadStatus.Queued.INSTANCE)) {
                        c1086g.L(-984092382);
                        c1086g.T(false);
                        throw new NoWhenBranchMatchedException();
                    }
                    c1086g.L(-440655298);
                    c1086g.T(false);
                }
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.k
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return FileActionSheetKt.FileActionSheet$lambda$6(item, onRetryClick, onDeleteClick, onStopUploading, dismiss, i10, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        c1086gP.w();
        c1086g = c1086gP;
        c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.k
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return FileActionSheetKt.FileActionSheet$lambda$6(item, onRetryClick, onDeleteClick, onStopUploading, dismiss, i10, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r FileActionSheet$lambda$2$lambda$1(Window window, View view) {
        v0.e cVar;
        kotlin.jvm.internal.i.e(window, "$window");
        kotlin.jvm.internal.i.e(view, "$view");
        D d10 = new D(view);
        if (Build.VERSION.SDK_INT >= 30) {
            v0.d dVar = new v0.d(window.getInsetsController(), d10);
            dVar.f16996b = window;
            cVar = dVar;
        } else {
            cVar = new v0.c(window, d10);
        }
        cVar.c(false);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r FileActionSheet$lambda$4$lambda$3(Ia.a onDeleteClick, IntercomPreviewFile it) {
        kotlin.jvm.internal.i.e(onDeleteClick, "$onDeleteClick");
        kotlin.jvm.internal.i.e(it, "it");
        onDeleteClick.invoke();
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r FileActionSheet$lambda$5(List it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r FileActionSheet$lambda$6(Answer.MediaAnswer.MediaItem item, Ia.a onRetryClick, Ia.a onDeleteClick, Ia.a onStopUploading, Ia.a dismiss, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        kotlin.jvm.internal.i.e(item, "$item");
        kotlin.jvm.internal.i.e(onRetryClick, "$onRetryClick");
        kotlin.jvm.internal.i.e(onDeleteClick, "$onDeleteClick");
        kotlin.jvm.internal.i.e(onStopUploading, "$onStopUploading");
        kotlin.jvm.internal.i.e(dismiss, "$dismiss");
        FileActionSheet(item, onRetryClick, onDeleteClick, onStopUploading, dismiss, interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    private static final void FileActionSheetPreviewForStatus(final Answer.MediaAnswer.FileUploadStatus fileUploadStatus, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(-915176137);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(fileUploadStatus) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && c1086gP.s()) {
            c1086gP.w();
        } else {
            SurfaceKt.a(null, null, 0L, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(193945980, new AnonymousClass1(fileUploadStatus), c1086gP), c1086gP, 12582912, 127);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.l
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return FileActionSheetKt.FileActionSheetPreviewForStatus$lambda$9(fileUploadStatus, i10, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r FileActionSheetPreviewForStatus$lambda$9(Answer.MediaAnswer.FileUploadStatus uploadStatus, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        kotlin.jvm.internal.i.e(uploadStatus, "$uploadStatus");
        FileActionSheetPreviewForStatus(uploadStatus, interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void FileActionSheetQueuedPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-61695068);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            FileActionSheetPreviewForStatus(new Answer.MediaAnswer.FileUploadStatus.Error(new Answer.MediaAnswer.FileUploadError.FileLimitExceeded(M1.k(new StringProvider.StringRes(io.intercom.android.sdk.R.string.intercom_inbox_error_state_title, null, 2, null)))), c1086gP, 8);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2278f(i10, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r FileActionSheetQueuedPreview$lambda$8(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        FileActionSheetQueuedPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void FileActionSheetUploadingPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(31049684);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            FileActionSheetPreviewForStatus(Answer.MediaAnswer.FileUploadStatus.Uploading.INSTANCE, c1086gP, 6);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2280g(i10, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r FileActionSheetUploadingPreview$lambda$7(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        FileActionSheetUploadingPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
