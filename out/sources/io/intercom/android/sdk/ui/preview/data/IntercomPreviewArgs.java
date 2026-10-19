package io.intercom.android.sdk.ui.preview.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: IntercomPreviewArgs.kt */
/* JADX INFO: loaded from: classes.dex */
public final class IntercomPreviewArgs implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<IntercomPreviewArgs> CREATOR = new Creator();
    private final String ctaText;
    private final DeleteType deleteType;
    private final DownloadState downloadState;
    private final boolean showSendCTA;
    private final List<IntercomPreviewFile> uris;

    /* JADX INFO: compiled from: IntercomPreviewArgs.kt */
    public static final class Creator implements Parcelable.Creator<IntercomPreviewArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IntercomPreviewArgs createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(parcel.readParcelable(IntercomPreviewArgs.class.getClassLoader()));
            }
            return new IntercomPreviewArgs(arrayList, (DeleteType) parcel.readParcelable(IntercomPreviewArgs.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, DownloadState.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IntercomPreviewArgs[] newArray(int i10) {
            return new IntercomPreviewArgs[i10];
        }
    }

    public IntercomPreviewArgs() {
        this(null, null, null, false, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IntercomPreviewArgs copy$default(IntercomPreviewArgs intercomPreviewArgs, List list, DeleteType deleteType, String str, boolean z10, DownloadState downloadState, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = intercomPreviewArgs.uris;
        }
        if ((i10 & 2) != 0) {
            deleteType = intercomPreviewArgs.deleteType;
        }
        DeleteType deleteType2 = deleteType;
        if ((i10 & 4) != 0) {
            str = intercomPreviewArgs.ctaText;
        }
        String str2 = str;
        if ((i10 & 8) != 0) {
            z10 = intercomPreviewArgs.showSendCTA;
        }
        boolean z11 = z10;
        if ((i10 & 16) != 0) {
            downloadState = intercomPreviewArgs.downloadState;
        }
        return intercomPreviewArgs.copy(list, deleteType2, str2, z11, downloadState);
    }

    public final List<IntercomPreviewFile> component1() {
        return this.uris;
    }

    public final DeleteType component2() {
        return this.deleteType;
    }

    public final String component3() {
        return this.ctaText;
    }

    public final boolean component4() {
        return this.showSendCTA;
    }

    public final DownloadState component5() {
        return this.downloadState;
    }

    public final IntercomPreviewArgs copy(List<? extends IntercomPreviewFile> uris, DeleteType deleteType, String str, boolean z10, DownloadState downloadState) {
        i.e(uris, "uris");
        i.e(deleteType, "deleteType");
        i.e(downloadState, "downloadState");
        return new IntercomPreviewArgs(uris, deleteType, str, z10, downloadState);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntercomPreviewArgs)) {
            return false;
        }
        IntercomPreviewArgs intercomPreviewArgs = (IntercomPreviewArgs) obj;
        return i.a(this.uris, intercomPreviewArgs.uris) && i.a(this.deleteType, intercomPreviewArgs.deleteType) && i.a(this.ctaText, intercomPreviewArgs.ctaText) && this.showSendCTA == intercomPreviewArgs.showSendCTA && i.a(this.downloadState, intercomPreviewArgs.downloadState);
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final DeleteType getDeleteType() {
        return this.deleteType;
    }

    public final DownloadState getDownloadState() {
        return this.downloadState;
    }

    public final boolean getShowSendCTA() {
        return this.showSendCTA;
    }

    public final List<IntercomPreviewFile> getUris() {
        return this.uris;
    }

    public int hashCode() {
        int iHashCode = (this.deleteType.hashCode() + (this.uris.hashCode() * 31)) * 31;
        String str = this.ctaText;
        return this.downloadState.hashCode() + D.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.showSendCTA);
    }

    public String toString() {
        return "IntercomPreviewArgs(uris=" + this.uris + ", deleteType=" + this.deleteType + ", ctaText=" + this.ctaText + ", showSendCTA=" + this.showSendCTA + ", downloadState=" + this.downloadState + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        i.e(dest, "dest");
        List<IntercomPreviewFile> list = this.uris;
        dest.writeInt(list.size());
        Iterator<IntercomPreviewFile> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), i10);
        }
        dest.writeParcelable(this.deleteType, i10);
        dest.writeString(this.ctaText);
        dest.writeInt(this.showSendCTA ? 1 : 0);
        this.downloadState.writeToParcel(dest, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IntercomPreviewArgs(List<? extends IntercomPreviewFile> uris, DeleteType deleteType, String str, boolean z10, DownloadState downloadState) {
        i.e(uris, "uris");
        i.e(deleteType, "deleteType");
        i.e(downloadState, "downloadState");
        this.uris = uris;
        this.deleteType = deleteType;
        this.ctaText = str;
        this.showSendCTA = z10;
        this.downloadState = downloadState;
    }

    public IntercomPreviewArgs(List list, DeleteType deleteType, String str, boolean z10, DownloadState downloadState, int i10, e eVar) {
        this((i10 & 1) != 0 ? EmptyList.f42983b : list, (i10 & 2) != 0 ? DeleteType.None.INSTANCE : deleteType, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? new DownloadState(false, "Saving...", "File saved", "Something went wrong", "Permission denied") : downloadState);
    }
}
