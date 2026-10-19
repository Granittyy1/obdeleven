package io.intercom.android.sdk.m5.utils;

import android.net.Uri;
import kotlin.jvm.internal.i;
import p005a4.q;

/* JADX INFO: compiled from: MediaCompression.kt */
/* JADX INFO: loaded from: classes3.dex */
final class CompressedImageData {
    private final int height;
    private final long size;
    private final Uri uri;
    private final int width;

    public CompressedImageData(Uri uri, int i10, int i11, long j) {
        i.e(uri, "uri");
        this.uri = uri;
        this.width = i10;
        this.height = i11;
        this.size = j;
    }

    public static /* synthetic */ CompressedImageData copy$default(CompressedImageData compressedImageData, Uri uri, int i10, int i11, long j, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            uri = compressedImageData.uri;
        }
        if ((i12 & 2) != 0) {
            i10 = compressedImageData.width;
        }
        int i13 = i10;
        if ((i12 & 4) != 0) {
            i11 = compressedImageData.height;
        }
        int i14 = i11;
        if ((i12 & 8) != 0) {
            j = compressedImageData.size;
        }
        return compressedImageData.copy(uri, i13, i14, j);
    }

    public final Uri component1() {
        return this.uri;
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

    public final CompressedImageData copy(Uri uri, int i10, int i11, long j) {
        i.e(uri, "uri");
        return new CompressedImageData(uri, i10, i11, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompressedImageData)) {
            return false;
        }
        CompressedImageData compressedImageData = (CompressedImageData) obj;
        return i.a(this.uri, compressedImageData.uri) && this.width == compressedImageData.width && this.height == compressedImageData.height && this.size == compressedImageData.size;
    }

    public final int getHeight() {
        return this.height;
    }

    public final long getSize() {
        return this.size;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Long.hashCode(this.size) + q.b(this.height, q.b(this.width, this.uri.hashCode() * 31, 31), 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CompressedImageData(uri=");
        sb2.append(this.uri);
        sb2.append(", width=");
        sb2.append(this.width);
        sb2.append(", height=");
        sb2.append(this.height);
        sb2.append(", size=");
        return C4.a.h(sb2, this.size, ')');
    }
}
