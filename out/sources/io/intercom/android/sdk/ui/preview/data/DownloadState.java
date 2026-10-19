package io.intercom.android.sdk.ui.preview.data;

import B1.a;
import B7.b;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: IntercomPreviewArgs.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DownloadState implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DownloadState> CREATOR = new Creator();
    private final String fileSavedText;
    private final String fileSavingText;
    private final String permissionDeniedText;
    private final String saveFailedText;
    private final boolean showDownloadAction;

    /* JADX INFO: compiled from: IntercomPreviewArgs.kt */
    public static final class Creator implements Parcelable.Creator<DownloadState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DownloadState createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new DownloadState(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DownloadState[] newArray(int i10) {
            return new DownloadState[i10];
        }
    }

    public DownloadState(boolean z10, String fileSavingText, String fileSavedText, String saveFailedText, String permissionDeniedText) {
        i.e(fileSavingText, "fileSavingText");
        i.e(fileSavedText, "fileSavedText");
        i.e(saveFailedText, "saveFailedText");
        i.e(permissionDeniedText, "permissionDeniedText");
        this.showDownloadAction = z10;
        this.fileSavingText = fileSavingText;
        this.fileSavedText = fileSavedText;
        this.saveFailedText = saveFailedText;
        this.permissionDeniedText = permissionDeniedText;
    }

    public static /* synthetic */ DownloadState copy$default(DownloadState downloadState, boolean z10, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = downloadState.showDownloadAction;
        }
        if ((i10 & 2) != 0) {
            str = downloadState.fileSavingText;
        }
        String str5 = str;
        if ((i10 & 4) != 0) {
            str2 = downloadState.fileSavedText;
        }
        String str6 = str2;
        if ((i10 & 8) != 0) {
            str3 = downloadState.saveFailedText;
        }
        String str7 = str3;
        if ((i10 & 16) != 0) {
            str4 = downloadState.permissionDeniedText;
        }
        return downloadState.copy(z10, str5, str6, str7, str4);
    }

    public final boolean component1() {
        return this.showDownloadAction;
    }

    public final String component2() {
        return this.fileSavingText;
    }

    public final String component3() {
        return this.fileSavedText;
    }

    public final String component4() {
        return this.saveFailedText;
    }

    public final String component5() {
        return this.permissionDeniedText;
    }

    public final DownloadState copy(boolean z10, String fileSavingText, String fileSavedText, String saveFailedText, String permissionDeniedText) {
        i.e(fileSavingText, "fileSavingText");
        i.e(fileSavedText, "fileSavedText");
        i.e(saveFailedText, "saveFailedText");
        i.e(permissionDeniedText, "permissionDeniedText");
        return new DownloadState(z10, fileSavingText, fileSavedText, saveFailedText, permissionDeniedText);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadState)) {
            return false;
        }
        DownloadState downloadState = (DownloadState) obj;
        return this.showDownloadAction == downloadState.showDownloadAction && i.a(this.fileSavingText, downloadState.fileSavingText) && i.a(this.fileSavedText, downloadState.fileSavedText) && i.a(this.saveFailedText, downloadState.saveFailedText) && i.a(this.permissionDeniedText, downloadState.permissionDeniedText);
    }

    public final String getFileSavedText() {
        return this.fileSavedText;
    }

    public final String getFileSavingText() {
        return this.fileSavingText;
    }

    public final String getPermissionDeniedText() {
        return this.permissionDeniedText;
    }

    public final String getSaveFailedText() {
        return this.saveFailedText;
    }

    public final boolean getShowDownloadAction() {
        return this.showDownloadAction;
    }

    public int hashCode() {
        return this.permissionDeniedText.hashCode() + a.b(this.saveFailedText, a.b(this.fileSavedText, a.b(this.fileSavingText, Boolean.hashCode(this.showDownloadAction) * 31, 31), 31), 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DownloadState(showDownloadAction=");
        sb2.append(this.showDownloadAction);
        sb2.append(", fileSavingText=");
        sb2.append(this.fileSavingText);
        sb2.append(", fileSavedText=");
        sb2.append(this.fileSavedText);
        sb2.append(", saveFailedText=");
        sb2.append(this.saveFailedText);
        sb2.append(", permissionDeniedText=");
        return b.g(sb2, this.permissionDeniedText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        i.e(dest, "dest");
        dest.writeInt(this.showDownloadAction ? 1 : 0);
        dest.writeString(this.fileSavingText);
        dest.writeString(this.fileSavedText);
        dest.writeString(this.saveFailedText);
        dest.writeString(this.permissionDeniedText);
    }
}
