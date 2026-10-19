package io.intercom.android.sdk.ui.preview.data;

import B7.b;
import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlin.text.n;

/* JADX INFO: compiled from: IntercomPreviewArgs.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class IntercomPreviewFile implements Parcelable {
    public static final int $stable = 8;
    private final Uri uri;

    /* JADX INFO: compiled from: IntercomPreviewArgs.kt */
    public static final class LocalFile extends IntercomPreviewFile {
        public static final int $stable = 8;
        public static final Parcelable.Creator<LocalFile> CREATOR = new Creator();
        private final Uri fileUri;

        /* JADX INFO: compiled from: IntercomPreviewArgs.kt */
        public static final class Creator implements Parcelable.Creator<LocalFile> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocalFile createFromParcel(Parcel parcel) {
                i.e(parcel, "parcel");
                return new LocalFile((Uri) parcel.readParcelable(LocalFile.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocalFile[] newArray(int i10) {
                return new LocalFile[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocalFile(Uri fileUri) {
            super(fileUri, null);
            i.e(fileUri, "fileUri");
            this.fileUri = fileUri;
        }

        public static /* synthetic */ LocalFile copy$default(LocalFile localFile, Uri uri, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                uri = localFile.fileUri;
            }
            return localFile.copy(uri);
        }

        public final Uri component1() {
            return this.fileUri;
        }

        public final LocalFile copy(Uri fileUri) {
            i.e(fileUri, "fileUri");
            return new LocalFile(fileUri);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LocalFile) && i.a(this.fileUri, ((LocalFile) obj).fileUri);
        }

        public final Uri getFileUri() {
            return this.fileUri;
        }

        public int hashCode() {
            return this.fileUri.hashCode();
        }

        public String toString() {
            return "LocalFile(fileUri=" + this.fileUri + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            i.e(dest, "dest");
            dest.writeParcelable(this.fileUri, i10);
        }
    }

    /* JADX INFO: compiled from: IntercomPreviewArgs.kt */
    public static final class NetworkFile extends IntercomPreviewFile {
        public static final int $stable = 0;
        public static final Parcelable.Creator<NetworkFile> CREATOR = new Creator();
        private final String mimeType;
        private final String url;

        /* JADX INFO: compiled from: IntercomPreviewArgs.kt */
        public static final class Creator implements Parcelable.Creator<NetworkFile> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NetworkFile createFromParcel(Parcel parcel) {
                i.e(parcel, "parcel");
                return new NetworkFile(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NetworkFile[] newArray(int i10) {
                return new NetworkFile[i10];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public NetworkFile(String url, String mimeType) {
            i.e(url, "url");
            i.e(mimeType, "mimeType");
            Uri uri = Uri.parse(url);
            i.d(uri, "parse(...)");
            super(uri, null);
            this.url = url;
            this.mimeType = mimeType;
        }

        public static /* synthetic */ NetworkFile copy$default(NetworkFile networkFile, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = networkFile.url;
            }
            if ((i10 & 2) != 0) {
                str2 = networkFile.mimeType;
            }
            return networkFile.copy(str, str2);
        }

        public final String component1() {
            return this.url;
        }

        public final String component2() {
            return this.mimeType;
        }

        public final NetworkFile copy(String url, String mimeType) {
            i.e(url, "url");
            i.e(mimeType, "mimeType");
            return new NetworkFile(url, mimeType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NetworkFile)) {
                return false;
            }
            NetworkFile networkFile = (NetworkFile) obj;
            return i.a(this.url, networkFile.url) && i.a(this.mimeType, networkFile.mimeType);
        }

        public final String getMimeType() {
            return this.mimeType;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.mimeType.hashCode() + (this.url.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("NetworkFile(url=");
            sb2.append(this.url);
            sb2.append(", mimeType=");
            return b.g(sb2, this.mimeType, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            i.e(dest, "dest");
            dest.writeString(this.url);
            dest.writeString(this.mimeType);
        }
    }

    public /* synthetic */ IntercomPreviewFile(Uri uri, e eVar) {
        this(uri);
    }

    public final String getMimeType(Context context) {
        i.e(context, "context");
        if (this instanceof LocalFile) {
            String type = context.getContentResolver().getType(this.uri);
            return type == null ? "application/*" : type;
        }
        if (this instanceof NetworkFile) {
            return ((NetworkFile) this).getMimeType();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final boolean isImage(Context context) {
        i.e(context, "context");
        return n.J(getMimeType(context), AppearanceType.IMAGE, false);
    }

    public final boolean isVideo(Context context) {
        i.e(context, "context");
        return n.J(getMimeType(context), "video", false);
    }

    private IntercomPreviewFile(Uri uri) {
        this.uri = uri;
    }
}
