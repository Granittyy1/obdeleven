package io.intercom.android.sdk;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.D;
import p005a4.q;

/* JADX INFO: compiled from: GalleryImage.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class GalleryImage implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<GalleryImage> CREATOR = new Creator();
    private final String attribution;
    private final String duration;
    private final String fileName;
    private final int fileSize;
    private final int imageHeight;
    private final int imageWidth;
    private final boolean isGif;
    private final boolean isVideo;
    private final String mimeType;
    private final String previewPath;
    private final Uri uri;

    /* JADX INFO: compiled from: GalleryImage.kt */
    public static final class Creator implements Parcelable.Creator<GalleryImage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GalleryImage createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.e(parcel, "parcel");
            return new GalleryImage(parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(GalleryImage.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GalleryImage[] newArray(int i10) {
            return new GalleryImage[i10];
        }
    }

    public GalleryImage() {
        this(null, null, null, null, null, 0, 0, 0, false, false, null, 2047, null);
    }

    public final String component1() {
        return this.fileName;
    }

    public final boolean component10() {
        return this.isVideo;
    }

    public final String component11() {
        return this.duration;
    }

    public final String component2() {
        return this.mimeType;
    }

    public final Uri component3() {
        return this.uri;
    }

    public final String component4() {
        return this.previewPath;
    }

    public final String component5() {
        return this.attribution;
    }

    public final int component6() {
        return this.imageWidth;
    }

    public final int component7() {
        return this.imageHeight;
    }

    public final int component8() {
        return this.fileSize;
    }

    public final boolean component9() {
        return this.isGif;
    }

    public final GalleryImage copy(String fileName, String mimeType, Uri uri, String previewPath, String attribution, int i10, int i11, int i12, boolean z10, boolean z11, String duration) {
        kotlin.jvm.internal.i.e(fileName, "fileName");
        kotlin.jvm.internal.i.e(mimeType, "mimeType");
        kotlin.jvm.internal.i.e(uri, "uri");
        kotlin.jvm.internal.i.e(previewPath, "previewPath");
        kotlin.jvm.internal.i.e(attribution, "attribution");
        kotlin.jvm.internal.i.e(duration, "duration");
        return new GalleryImage(fileName, mimeType, uri, previewPath, attribution, i10, i11, i12, z10, z11, duration);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GalleryImage)) {
            return false;
        }
        GalleryImage galleryImage = (GalleryImage) obj;
        return kotlin.jvm.internal.i.a(this.fileName, galleryImage.fileName) && kotlin.jvm.internal.i.a(this.mimeType, galleryImage.mimeType) && kotlin.jvm.internal.i.a(this.uri, galleryImage.uri) && kotlin.jvm.internal.i.a(this.previewPath, galleryImage.previewPath) && kotlin.jvm.internal.i.a(this.attribution, galleryImage.attribution) && this.imageWidth == galleryImage.imageWidth && this.imageHeight == galleryImage.imageHeight && this.fileSize == galleryImage.fileSize && this.isGif == galleryImage.isGif && this.isVideo == galleryImage.isVideo && kotlin.jvm.internal.i.a(this.duration, galleryImage.duration);
    }

    public final String getAttribution() {
        return this.attribution;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final int getFileSize() {
        return this.fileSize;
    }

    public final int getImageHeight() {
        return this.imageHeight;
    }

    public final int getImageWidth() {
        return this.imageWidth;
    }

    public final String getImageWidthXHeight() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.imageWidth);
        sb2.append('x');
        sb2.append(this.imageHeight);
        return sb2.toString();
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getPreviewPath() {
        return this.previewPath;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        return this.duration.hashCode() + D.b(D.b(q.b(this.fileSize, q.b(this.imageHeight, q.b(this.imageWidth, B1.a.b(this.attribution, B1.a.b(this.previewPath, (this.uri.hashCode() + B1.a.b(this.mimeType, this.fileName.hashCode() * 31, 31)) * 31, 31), 31), 31), 31), 31), 31, this.isGif), 31, this.isVideo);
    }

    public final boolean isGif() {
        return this.isGif;
    }

    public final boolean isVideo() {
        return this.isVideo;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GalleryImage(fileName=");
        sb2.append(this.fileName);
        sb2.append(", mimeType=");
        sb2.append(this.mimeType);
        sb2.append(", uri=");
        sb2.append(this.uri);
        sb2.append(", previewPath=");
        sb2.append(this.previewPath);
        sb2.append(", attribution=");
        sb2.append(this.attribution);
        sb2.append(", imageWidth=");
        sb2.append(this.imageWidth);
        sb2.append(", imageHeight=");
        sb2.append(this.imageHeight);
        sb2.append(", fileSize=");
        sb2.append(this.fileSize);
        sb2.append(", isGif=");
        sb2.append(this.isGif);
        sb2.append(", isVideo=");
        sb2.append(this.isVideo);
        sb2.append(", duration=");
        return B7.b.g(sb2, this.duration, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        dest.writeString(this.fileName);
        dest.writeString(this.mimeType);
        dest.writeParcelable(this.uri, i10);
        dest.writeString(this.previewPath);
        dest.writeString(this.attribution);
        dest.writeInt(this.imageWidth);
        dest.writeInt(this.imageHeight);
        dest.writeInt(this.fileSize);
        dest.writeInt(this.isGif ? 1 : 0);
        dest.writeInt(this.isVideo ? 1 : 0);
        dest.writeString(this.duration);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryImage(String fileName) {
        this(fileName, null, null, null, null, 0, 0, 0, false, false, null, 2046, null);
        kotlin.jvm.internal.i.e(fileName, "fileName");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryImage(String fileName, String mimeType) {
        this(fileName, mimeType, null, null, null, 0, 0, 0, false, false, null, 2044, null);
        kotlin.jvm.internal.i.e(fileName, "fileName");
        kotlin.jvm.internal.i.e(mimeType, "mimeType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryImage(String fileName, String mimeType, Uri uri) {
        this(fileName, mimeType, uri, null, null, 0, 0, 0, false, false, null, 2040, null);
        kotlin.jvm.internal.i.e(fileName, "fileName");
        kotlin.jvm.internal.i.e(mimeType, "mimeType");
        kotlin.jvm.internal.i.e(uri, "uri");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryImage(String fileName, String mimeType, Uri uri, String previewPath) {
        this(fileName, mimeType, uri, previewPath, null, 0, 0, 0, false, false, null, 2032, null);
        kotlin.jvm.internal.i.e(fileName, "fileName");
        kotlin.jvm.internal.i.e(mimeType, "mimeType");
        kotlin.jvm.internal.i.e(uri, "uri");
        kotlin.jvm.internal.i.e(previewPath, "previewPath");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryImage(String fileName, String mimeType, Uri uri, String previewPath, String attribution) {
        this(fileName, mimeType, uri, previewPath, attribution, 0, 0, 0, false, false, null, 2016, null);
        kotlin.jvm.internal.i.e(fileName, "fileName");
        kotlin.jvm.internal.i.e(mimeType, "mimeType");
        kotlin.jvm.internal.i.e(uri, "uri");
        kotlin.jvm.internal.i.e(previewPath, "previewPath");
        kotlin.jvm.internal.i.e(attribution, "attribution");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryImage(String fileName, String mimeType, Uri uri, String previewPath, String attribution, int i10) {
        this(fileName, mimeType, uri, previewPath, attribution, i10, 0, 0, false, false, null, 1984, null);
        kotlin.jvm.internal.i.e(fileName, "fileName");
        kotlin.jvm.internal.i.e(mimeType, "mimeType");
        kotlin.jvm.internal.i.e(uri, "uri");
        kotlin.jvm.internal.i.e(previewPath, "previewPath");
        kotlin.jvm.internal.i.e(attribution, "attribution");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryImage(String fileName, String mimeType, Uri uri, String previewPath, String attribution, int i10, int i11) {
        this(fileName, mimeType, uri, previewPath, attribution, i10, i11, 0, false, false, null, 1920, null);
        kotlin.jvm.internal.i.e(fileName, "fileName");
        kotlin.jvm.internal.i.e(mimeType, "mimeType");
        kotlin.jvm.internal.i.e(uri, "uri");
        kotlin.jvm.internal.i.e(previewPath, "previewPath");
        kotlin.jvm.internal.i.e(attribution, "attribution");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryImage(String fileName, String mimeType, Uri uri, String previewPath, String attribution, int i10, int i11, int i12) {
        this(fileName, mimeType, uri, previewPath, attribution, i10, i11, i12, false, false, null, 1792, null);
        kotlin.jvm.internal.i.e(fileName, "fileName");
        kotlin.jvm.internal.i.e(mimeType, "mimeType");
        kotlin.jvm.internal.i.e(uri, "uri");
        kotlin.jvm.internal.i.e(previewPath, "previewPath");
        kotlin.jvm.internal.i.e(attribution, "attribution");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryImage(String fileName, String mimeType, Uri uri, String previewPath, String attribution, int i10, int i11, int i12, boolean z10) {
        this(fileName, mimeType, uri, previewPath, attribution, i10, i11, i12, z10, false, null, 1536, null);
        kotlin.jvm.internal.i.e(fileName, "fileName");
        kotlin.jvm.internal.i.e(mimeType, "mimeType");
        kotlin.jvm.internal.i.e(uri, "uri");
        kotlin.jvm.internal.i.e(previewPath, "previewPath");
        kotlin.jvm.internal.i.e(attribution, "attribution");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryImage(String fileName, String mimeType, Uri uri, String previewPath, String attribution, int i10, int i11, int i12, boolean z10, boolean z11) {
        this(fileName, mimeType, uri, previewPath, attribution, i10, i11, i12, z10, z11, null, 1024, null);
        kotlin.jvm.internal.i.e(fileName, "fileName");
        kotlin.jvm.internal.i.e(mimeType, "mimeType");
        kotlin.jvm.internal.i.e(uri, "uri");
        kotlin.jvm.internal.i.e(previewPath, "previewPath");
        kotlin.jvm.internal.i.e(attribution, "attribution");
    }

    public GalleryImage(String fileName, String mimeType, Uri uri, String previewPath, String attribution, int i10, int i11, int i12, boolean z10, boolean z11, String duration) {
        kotlin.jvm.internal.i.e(fileName, "fileName");
        kotlin.jvm.internal.i.e(mimeType, "mimeType");
        kotlin.jvm.internal.i.e(uri, "uri");
        kotlin.jvm.internal.i.e(previewPath, "previewPath");
        kotlin.jvm.internal.i.e(attribution, "attribution");
        kotlin.jvm.internal.i.e(duration, "duration");
        this.fileName = fileName;
        this.mimeType = mimeType;
        this.uri = uri;
        this.previewPath = previewPath;
        this.attribution = attribution;
        this.imageWidth = i10;
        this.imageHeight = i11;
        this.fileSize = i12;
        this.isGif = z10;
        this.isVideo = z11;
        this.duration = duration;
    }

    public /* synthetic */ GalleryImage(String str, String str2, Uri uri, String str3, String str4, int i10, int i11, int i12, boolean z10, boolean z11, String str5, int i13, kotlin.jvm.internal.e eVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? Uri.EMPTY : uri, (i13 & 8) != 0 ? "" : str3, (i13 & 16) != 0 ? "" : str4, (i13 & 32) != 0 ? 0 : i10, (i13 & 64) != 0 ? 0 : i11, (i13 & 128) != 0 ? 0 : i12, (i13 & 256) != 0 ? false : z10, (i13 & 512) == 0 ? z11 : false, (i13 & 1024) == 0 ? str5 : "");
    }
}
