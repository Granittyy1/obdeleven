package io.intercom.android.sdk.ui.preview.model;

import B7.b;
import androidx.compose.animation.D;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import p005a4.q;

/* JADX INFO: compiled from: PreviewUiState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PreviewUiState {
    public static final int $stable = 8;
    private final String confirmationText;
    private final int currentPage;
    private final String fileSavedText;
    private final String fileSavingText;
    private final List<IntercomPreviewFile> files;
    private final String saveFailedText;
    private final boolean showDeleteAction;
    private final boolean showDownloadAction;
    private final boolean showSendAction;

    public PreviewUiState() {
        this(null, 0, false, false, null, false, null, null, null, 511, null);
    }

    public final List<IntercomPreviewFile> component1() {
        return this.files;
    }

    public final int component2() {
        return this.currentPage;
    }

    public final boolean component3() {
        return this.showDeleteAction;
    }

    public final boolean component4() {
        return this.showSendAction;
    }

    public final String component5() {
        return this.confirmationText;
    }

    public final boolean component6() {
        return this.showDownloadAction;
    }

    public final String component7() {
        return this.fileSavingText;
    }

    public final String component8() {
        return this.fileSavedText;
    }

    public final String component9() {
        return this.saveFailedText;
    }

    public final PreviewUiState copy(List<? extends IntercomPreviewFile> files, int i10, boolean z10, boolean z11, String str, boolean z12, String str2, String str3, String str4) {
        i.e(files, "files");
        return new PreviewUiState(files, i10, z10, z11, str, z12, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewUiState)) {
            return false;
        }
        PreviewUiState previewUiState = (PreviewUiState) obj;
        return i.a(this.files, previewUiState.files) && this.currentPage == previewUiState.currentPage && this.showDeleteAction == previewUiState.showDeleteAction && this.showSendAction == previewUiState.showSendAction && i.a(this.confirmationText, previewUiState.confirmationText) && this.showDownloadAction == previewUiState.showDownloadAction && i.a(this.fileSavingText, previewUiState.fileSavingText) && i.a(this.fileSavedText, previewUiState.fileSavedText) && i.a(this.saveFailedText, previewUiState.saveFailedText);
    }

    public final String getConfirmationText() {
        return this.confirmationText;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final String getFileSavedText() {
        return this.fileSavedText;
    }

    public final String getFileSavingText() {
        return this.fileSavingText;
    }

    public final List<IntercomPreviewFile> getFiles() {
        return this.files;
    }

    public final String getSaveFailedText() {
        return this.saveFailedText;
    }

    public final boolean getShowDeleteAction() {
        return this.showDeleteAction;
    }

    public final boolean getShowDownloadAction() {
        return this.showDownloadAction;
    }

    public final boolean getShowSendAction() {
        return this.showSendAction;
    }

    public int hashCode() {
        int iB = D.b(D.b(q.b(this.currentPage, this.files.hashCode() * 31, 31), 31, this.showDeleteAction), 31, this.showSendAction);
        String str = this.confirmationText;
        int iB2 = D.b((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.showDownloadAction);
        String str2 = this.fileSavingText;
        int iHashCode = (iB2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fileSavedText;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.saveFailedText;
        return iHashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PreviewUiState(files=");
        sb2.append(this.files);
        sb2.append(", currentPage=");
        sb2.append(this.currentPage);
        sb2.append(", showDeleteAction=");
        sb2.append(this.showDeleteAction);
        sb2.append(", showSendAction=");
        sb2.append(this.showSendAction);
        sb2.append(", confirmationText=");
        sb2.append(this.confirmationText);
        sb2.append(", showDownloadAction=");
        sb2.append(this.showDownloadAction);
        sb2.append(", fileSavingText=");
        sb2.append(this.fileSavingText);
        sb2.append(", fileSavedText=");
        sb2.append(this.fileSavedText);
        sb2.append(", saveFailedText=");
        return b.g(sb2, this.saveFailedText, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PreviewUiState(List<? extends IntercomPreviewFile> files, int i10, boolean z10, boolean z11, String str, boolean z12, String str2, String str3, String str4) {
        i.e(files, "files");
        this.files = files;
        this.currentPage = i10;
        this.showDeleteAction = z10;
        this.showSendAction = z11;
        this.confirmationText = str;
        this.showDownloadAction = z12;
        this.fileSavingText = str2;
        this.fileSavedText = str3;
        this.saveFailedText = str4;
    }

    public PreviewUiState(List list, int i10, boolean z10, boolean z11, String str, boolean z12, String str2, String str3, String str4, int i11, e eVar) {
        this((i11 & 1) != 0 ? EmptyList.f42983b : list, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? false : z10, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? null : str, (i11 & 32) == 0 ? z12 : false, (i11 & 64) != 0 ? null : str2, (i11 & 128) != 0 ? null : str3, (i11 & 256) == 0 ? str4 : null);
    }
}
