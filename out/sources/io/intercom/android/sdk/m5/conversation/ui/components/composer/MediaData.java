package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: MediaData.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface MediaData extends Parcelable {

    /* JADX INFO: compiled from: MediaData.kt */
    public static final class Gif implements MediaData {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Gif> CREATOR = new Creator();
        private final String attribution;
        private final int height;
        private final String url;
        private final int width;

        /* JADX INFO: compiled from: MediaData.kt */
        public static final class Creator implements Parcelable.Creator<Gif> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Gif createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.i.e(parcel, "parcel");
                return new Gif(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Gif[] newArray(int i10) {
                return new Gif[i10];
            }
        }

        public Gif(int i10, int i11, String url, String attribution) {
            kotlin.jvm.internal.i.e(url, "url");
            kotlin.jvm.internal.i.e(attribution, "attribution");
            this.width = i10;
            this.height = i11;
            this.url = url;
            this.attribution = attribution;
        }

        public static /* synthetic */ Gif copy$default(Gif gif, int i10, int i11, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = gif.width;
            }
            if ((i12 & 2) != 0) {
                i11 = gif.height;
            }
            if ((i12 & 4) != 0) {
                str = gif.url;
            }
            if ((i12 & 8) != 0) {
                str2 = gif.attribution;
            }
            return gif.copy(i10, i11, str, str2);
        }

        public final int component1() {
            return this.width;
        }

        public final int component2() {
            return this.height;
        }

        public final String component3() {
            return this.url;
        }

        public final String component4() {
            return this.attribution;
        }

        public final Gif copy(int i10, int i11, String url, String attribution) {
            kotlin.jvm.internal.i.e(url, "url");
            kotlin.jvm.internal.i.e(attribution, "attribution");
            return new Gif(i10, i11, url, attribution);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Gif)) {
                return false;
            }
            Gif gif = (Gif) obj;
            return this.width == gif.width && this.height == gif.height && kotlin.jvm.internal.i.a(this.url, gif.url) && kotlin.jvm.internal.i.a(this.attribution, gif.attribution);
        }

        public final String getAttribution() {
            return this.attribution;
        }

        public final int getHeight() {
            return this.height;
        }

        public final String getUrl() {
            return this.url;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return this.attribution.hashCode() + B1.a.b(this.url, p005a4.q.b(this.height, Integer.hashCode(this.width) * 31, 31), 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Gif(width=");
            sb2.append(this.width);
            sb2.append(", height=");
            sb2.append(this.height);
            sb2.append(", url=");
            sb2.append(this.url);
            sb2.append(", attribution=");
            return B7.b.g(sb2, this.attribution, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            kotlin.jvm.internal.i.e(dest, "dest");
            dest.writeInt(this.width);
            dest.writeInt(this.height);
            dest.writeString(this.url);
            dest.writeString(this.attribution);
        }

        @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData
        public String getDataSource() {
            return this.url;
        }
    }

    /* JADX INFO: compiled from: MediaData.kt */
    public interface Media extends MediaData {
        public static final Companion Companion = Companion.$$INSTANCE;

        /* JADX INFO: compiled from: MediaData.kt */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final Image empty() {
                Uri EMPTY = Uri.EMPTY;
                kotlin.jvm.internal.i.d(EMPTY, "EMPTY");
                return new Image("", 0, 0, 0L, "", EMPTY);
            }
        }

        /* JADX INFO: compiled from: MediaData.kt */
        public static final class DefaultImpls {
            public static Uri getDataSource(Media media) {
                return media.getUri();
            }
        }

        /* JADX INFO: compiled from: MediaData.kt */
        public static final class Image implements Media {
            public static final int $stable = 8;
            public static final Parcelable.Creator<Image> CREATOR = new Creator();
            private final String fileName;
            private final int height;
            private final String mimeType;
            private final long size;
            private final Uri uri;
            private final int width;

            /* JADX INFO: compiled from: MediaData.kt */
            public static final class Creator implements Parcelable.Creator<Image> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Image createFromParcel(Parcel parcel) {
                    kotlin.jvm.internal.i.e(parcel, "parcel");
                    return new Image(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readString(), (Uri) parcel.readParcelable(Image.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Image[] newArray(int i10) {
                    return new Image[i10];
                }
            }

            public Image(String mimeType, int i10, int i11, long j, String fileName, Uri uri) {
                kotlin.jvm.internal.i.e(mimeType, "mimeType");
                kotlin.jvm.internal.i.e(fileName, "fileName");
                kotlin.jvm.internal.i.e(uri, "uri");
                this.mimeType = mimeType;
                this.width = i10;
                this.height = i11;
                this.size = j;
                this.fileName = fileName;
                this.uri = uri;
            }

            public static /* synthetic */ Image copy$default(Image image, String str, int i10, int i11, long j, String str2, Uri uri, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = image.mimeType;
                }
                if ((i12 & 2) != 0) {
                    i10 = image.width;
                }
                int i13 = i10;
                if ((i12 & 4) != 0) {
                    i11 = image.height;
                }
                int i14 = i11;
                if ((i12 & 8) != 0) {
                    j = image.size;
                }
                long j10 = j;
                if ((i12 & 16) != 0) {
                    str2 = image.fileName;
                }
                String str3 = str2;
                if ((i12 & 32) != 0) {
                    uri = image.uri;
                }
                return image.copy(str, i13, i14, j10, str3, uri);
            }

            public final String component1() {
                return this.mimeType;
            }

            public final int component2() {
                return this.width;
            }

            public final int component3() {
                return this.height;
            }

            public final long component4() {
                return this.size;
            }

            public final String component5() {
                return this.fileName;
            }

            public final Uri component6() {
                return this.uri;
            }

            public final Image copy(String mimeType, int i10, int i11, long j, String fileName, Uri uri) {
                kotlin.jvm.internal.i.e(mimeType, "mimeType");
                kotlin.jvm.internal.i.e(fileName, "fileName");
                kotlin.jvm.internal.i.e(uri, "uri");
                return new Image(mimeType, i10, i11, j, fileName, uri);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Image)) {
                    return false;
                }
                Image image = (Image) obj;
                return kotlin.jvm.internal.i.a(this.mimeType, image.mimeType) && this.width == image.width && this.height == image.height && this.size == image.size && kotlin.jvm.internal.i.a(this.fileName, image.fileName) && kotlin.jvm.internal.i.a(this.uri, image.uri);
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData
            public Uri getDataSource() {
                return DefaultImpls.getDataSource(this);
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media
            public String getFileName() {
                return this.fileName;
            }

            public final int getHeight() {
                return this.height;
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media
            public String getMimeType() {
                return this.mimeType;
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media
            public long getSize() {
                return this.size;
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media
            public Uri getUri() {
                return this.uri;
            }

            public final int getWidth() {
                return this.width;
            }

            public int hashCode() {
                return this.uri.hashCode() + B1.a.b(this.fileName, C4.b.c(this.size, p005a4.q.b(this.height, p005a4.q.b(this.width, this.mimeType.hashCode() * 31, 31), 31), 31), 31);
            }

            public String toString() {
                return "Image(mimeType=" + this.mimeType + ", width=" + this.width + ", height=" + this.height + ", size=" + this.size + ", fileName=" + this.fileName + ", uri=" + this.uri + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i10) {
                kotlin.jvm.internal.i.e(dest, "dest");
                dest.writeString(this.mimeType);
                dest.writeInt(this.width);
                dest.writeInt(this.height);
                dest.writeLong(this.size);
                dest.writeString(this.fileName);
                dest.writeParcelable(this.uri, i10);
            }
        }

        /* JADX INFO: compiled from: MediaData.kt */
        public static final class Other implements Media {
            public static final int $stable = 8;
            public static final Parcelable.Creator<Other> CREATOR = new Creator();
            private final String fileName;
            private final String mimeType;
            private final long size;
            private final Uri uri;

            /* JADX INFO: compiled from: MediaData.kt */
            public static final class Creator implements Parcelable.Creator<Other> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Other createFromParcel(Parcel parcel) {
                    kotlin.jvm.internal.i.e(parcel, "parcel");
                    return new Other(parcel.readString(), parcel.readLong(), parcel.readString(), (Uri) parcel.readParcelable(Other.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Other[] newArray(int i10) {
                    return new Other[i10];
                }
            }

            public Other(String mimeType, long j, String fileName, Uri uri) {
                kotlin.jvm.internal.i.e(mimeType, "mimeType");
                kotlin.jvm.internal.i.e(fileName, "fileName");
                kotlin.jvm.internal.i.e(uri, "uri");
                this.mimeType = mimeType;
                this.size = j;
                this.fileName = fileName;
                this.uri = uri;
            }

            public static /* synthetic */ Other copy$default(Other other, String str, long j, String str2, Uri uri, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = other.mimeType;
                }
                if ((i10 & 2) != 0) {
                    j = other.size;
                }
                long j10 = j;
                if ((i10 & 4) != 0) {
                    str2 = other.fileName;
                }
                String str3 = str2;
                if ((i10 & 8) != 0) {
                    uri = other.uri;
                }
                return other.copy(str, j10, str3, uri);
            }

            public final String component1() {
                return this.mimeType;
            }

            public final long component2() {
                return this.size;
            }

            public final String component3() {
                return this.fileName;
            }

            public final Uri component4() {
                return this.uri;
            }

            public final Other copy(String mimeType, long j, String fileName, Uri uri) {
                kotlin.jvm.internal.i.e(mimeType, "mimeType");
                kotlin.jvm.internal.i.e(fileName, "fileName");
                kotlin.jvm.internal.i.e(uri, "uri");
                return new Other(mimeType, j, fileName, uri);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Other)) {
                    return false;
                }
                Other other = (Other) obj;
                return kotlin.jvm.internal.i.a(this.mimeType, other.mimeType) && this.size == other.size && kotlin.jvm.internal.i.a(this.fileName, other.fileName) && kotlin.jvm.internal.i.a(this.uri, other.uri);
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData
            public Uri getDataSource() {
                return DefaultImpls.getDataSource(this);
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media
            public String getFileName() {
                return this.fileName;
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media
            public String getMimeType() {
                return this.mimeType;
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media
            public long getSize() {
                return this.size;
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media
            public Uri getUri() {
                return this.uri;
            }

            public int hashCode() {
                return this.uri.hashCode() + B1.a.b(this.fileName, C4.b.c(this.size, this.mimeType.hashCode() * 31, 31), 31);
            }

            public String toString() {
                return "Other(mimeType=" + this.mimeType + ", size=" + this.size + ", fileName=" + this.fileName + ", uri=" + this.uri + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i10) {
                kotlin.jvm.internal.i.e(dest, "dest");
                dest.writeString(this.mimeType);
                dest.writeLong(this.size);
                dest.writeString(this.fileName);
                dest.writeParcelable(this.uri, i10);
            }
        }

        /* JADX INFO: compiled from: MediaData.kt */
        public static final class Video implements Media {
            public static final int $stable = 8;
            public static final Parcelable.Creator<Video> CREATOR = new Creator();
            private final long duration;
            private final String fileName;
            private final int height;
            private final String mimeType;
            private final long size;
            private final Image thumbnail;
            private final Uri uri;
            private final int width;

            /* JADX INFO: compiled from: MediaData.kt */
            public static final class Creator implements Parcelable.Creator<Video> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Video createFromParcel(Parcel parcel) {
                    kotlin.jvm.internal.i.e(parcel, "parcel");
                    return new Video(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readString(), (Uri) parcel.readParcelable(Video.class.getClassLoader()), parcel.readLong(), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Video[] newArray(int i10) {
                    return new Video[i10];
                }
            }

            public Video(String mimeType, int i10, int i11, long j, String fileName, Uri uri, long j10, Image image) {
                kotlin.jvm.internal.i.e(mimeType, "mimeType");
                kotlin.jvm.internal.i.e(fileName, "fileName");
                kotlin.jvm.internal.i.e(uri, "uri");
                this.mimeType = mimeType;
                this.width = i10;
                this.height = i11;
                this.size = j;
                this.fileName = fileName;
                this.uri = uri;
                this.duration = j10;
                this.thumbnail = image;
            }

            public final String component1() {
                return this.mimeType;
            }

            public final int component2() {
                return this.width;
            }

            public final int component3() {
                return this.height;
            }

            public final long component4() {
                return this.size;
            }

            public final String component5() {
                return this.fileName;
            }

            public final Uri component6() {
                return this.uri;
            }

            public final long component7() {
                return this.duration;
            }

            public final Image component8() {
                return this.thumbnail;
            }

            public final Video copy(String mimeType, int i10, int i11, long j, String fileName, Uri uri, long j10, Image image) {
                kotlin.jvm.internal.i.e(mimeType, "mimeType");
                kotlin.jvm.internal.i.e(fileName, "fileName");
                kotlin.jvm.internal.i.e(uri, "uri");
                return new Video(mimeType, i10, i11, j, fileName, uri, j10, image);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Video)) {
                    return false;
                }
                Video video = (Video) obj;
                return kotlin.jvm.internal.i.a(this.mimeType, video.mimeType) && this.width == video.width && this.height == video.height && this.size == video.size && kotlin.jvm.internal.i.a(this.fileName, video.fileName) && kotlin.jvm.internal.i.a(this.uri, video.uri) && this.duration == video.duration && kotlin.jvm.internal.i.a(this.thumbnail, video.thumbnail);
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData
            public Uri getDataSource() {
                return DefaultImpls.getDataSource(this);
            }

            public final long getDuration() {
                return this.duration;
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media
            public String getFileName() {
                return this.fileName;
            }

            public final int getHeight() {
                return this.height;
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media
            public String getMimeType() {
                return this.mimeType;
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media
            public long getSize() {
                return this.size;
            }

            public final Image getThumbnail() {
                return this.thumbnail;
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media
            public Uri getUri() {
                return this.uri;
            }

            public final int getWidth() {
                return this.width;
            }

            public int hashCode() {
                int iC = C4.b.c(this.duration, (this.uri.hashCode() + B1.a.b(this.fileName, C4.b.c(this.size, p005a4.q.b(this.height, p005a4.q.b(this.width, this.mimeType.hashCode() * 31, 31), 31), 31), 31)) * 31, 31);
                Image image = this.thumbnail;
                return iC + (image == null ? 0 : image.hashCode());
            }

            public String toString() {
                return "Video(mimeType=" + this.mimeType + ", width=" + this.width + ", height=" + this.height + ", size=" + this.size + ", fileName=" + this.fileName + ", uri=" + this.uri + ", duration=" + this.duration + ", thumbnail=" + this.thumbnail + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i10) {
                kotlin.jvm.internal.i.e(dest, "dest");
                dest.writeString(this.mimeType);
                dest.writeInt(this.width);
                dest.writeInt(this.height);
                dest.writeLong(this.size);
                dest.writeString(this.fileName);
                dest.writeParcelable(this.uri, i10);
                dest.writeLong(this.duration);
                Image image = this.thumbnail;
                if (image == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    image.writeToParcel(dest, i10);
                }
            }
        }

        @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData
        Uri getDataSource();

        String getFileName();

        String getMimeType();

        long getSize();

        Uri getUri();
    }

    Object getDataSource();
}
