package io.intercom.android.sdk.m5.conversation.utils;

import U0.a;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import androidx.core.content.FileProvider;
import io.intercom.android.sdk.IntercomFileProviderKt;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Pair;
import kotlin.jvm.internal.i;
import kotlin.text.l;
import kotlin.text.n;
import p241t7.b;
import p293xa.r;

/* JADX INFO: compiled from: URIExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class URIExtensionsKt {
    private static final MediaData.Media.Image getImageData(Uri uri, ContentResolver contentResolver, String str, String str2, long j) throws IOException {
        int i10;
        int i11;
        InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
        if (inputStreamOpenInputStream != null) {
            try {
                a aVar = new a(inputStreamOpenInputStream);
                int iC = aVar.c(480, "ImageLength");
                int iC2 = aVar.c(640, "ImageWidth");
                int iC3 = aVar.c(1, "Orientation");
                boolean z10 = iC3 == 6 || iC3 == 8;
                int i12 = z10 ? iC2 : iC;
                int i13 = z10 ? iC : iC2;
                r rVar = r.f47939a;
                b.n(inputStreamOpenInputStream, null);
                i10 = i13;
                i11 = i12;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    b.n(inputStreamOpenInputStream, th);
                    throw th2;
                }
            }
        } else {
            i10 = 0;
            i11 = 0;
        }
        return new MediaData.Media.Image(str2, i10, i11, j, str, uri);
    }

    public static final MediaData.Media getMediaData(Uri uri, Context context, boolean z10) {
        String string;
        MediaData.Media other;
        i.e(uri, "<this>");
        i.e(context, "context");
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursorQuery = contentResolver.query(uri, null, null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            cursorQuery.moveToFirst();
            String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name"));
            if (cursorQuery.getColumnIndex("mime_type") != -1) {
                string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("mime_type"));
            } else {
                i.b(string2);
                if (n.J(string2, ".jpg", false)) {
                    string = "image/jpg";
                } else {
                    string = n.J(string2, ".mp4", false) ? "video/mp4" : "";
                }
            }
            long j = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_size"));
            i.b(string);
            if (n.J(string, "video", false)) {
                i.b(string2);
                other = getVideoData(uri, context, string2, string, j, z10);
            } else if (n.J(string, AppearanceType.IMAGE, false)) {
                i.b(string2);
                other = getImageData(uri, contentResolver, string2, string, j);
            } else {
                i.b(string2);
                other = new MediaData.Media.Other(string, j, string2, uri);
            }
            b.n(cursorQuery, null);
            return other;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                b.n(cursorQuery, th);
                throw th2;
            }
        }
    }

    public static /* synthetic */ MediaData.Media getMediaData$default(Uri uri, Context context, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return getMediaData(uri, context, z10);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x010d  */
    public static final MediaData.Media.Video getVideoData(Uri uri, Context context, String fileName, String mimeType, long j, boolean z10) throws IOException {
        MediaData.Media.Image image;
        Integer numA;
        Integer numA2;
        Long lB;
        i.e(uri, "<this>");
        i.e(context, "context");
        i.e(fileName, "fileName");
        i.e(mimeType, "mimeType");
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(context, uri);
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
        long jLongValue = (strExtractMetadata == null || (lB = l.B(strExtractMetadata)) == null) ? 0L : lB.longValue();
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(18);
        int iIntValue = 0;
        int iIntValue2 = (strExtractMetadata2 == null || (numA2 = l.A(strExtractMetadata2)) == null) ? 0 : numA2.intValue();
        String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
        if (strExtractMetadata3 != null && (numA = l.A(strExtractMetadata3)) != null) {
            iIntValue = numA.intValue();
        }
        if (z10) {
            String str = "thumbnail_" + n.n0(fileName, ".") + ".jpg";
            Pair pair = iIntValue > iIntValue2 ? new Pair(320, 240) : new Pair(240, 320);
            Bitmap scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(0L, 2, Math.max(iIntValue2 / 2, ((Number) pair.b()).intValue()), Math.max(iIntValue / 2, ((Number) pair.a()).intValue()));
            if (scaledFrameAtTime != null) {
                File file = new File(context.getExternalCacheDir(), "images");
                file.mkdir();
                File file2 = new File(file, str);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                scaledFrameAtTime.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                Uri uriForFile = FileProvider.getUriForFile(context, IntercomFileProviderKt.fileProviderAuthority(context), file2);
                i.b(uriForFile);
                image = new MediaData.Media.Image("image/jpg", scaledFrameAtTime.getWidth(), scaledFrameAtTime.getHeight(), file2.length(), str, uriForFile);
            } else {
                image = null;
            }
        } else {
            image = null;
        }
        mediaMetadataRetriever.release();
        return new MediaData.Media.Video(mimeType, iIntValue2, iIntValue, j, fileName, uri, jLongValue, image);
    }
}
