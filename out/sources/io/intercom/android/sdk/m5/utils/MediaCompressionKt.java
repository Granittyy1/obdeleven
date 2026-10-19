package io.intercom.android.sdk.m5.utils;

import A8.p;
import Aa.c;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.compose.ui.text.font.s;
import com.google.android.gms.internal.measurement.M1;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.lightcompressor.CompressionListener;
import io.intercom.android.sdk.lightcompressor.VideoCompressor;
import io.intercom.android.sdk.lightcompressor.VideoQuality;
import io.intercom.android.sdk.lightcompressor.config.AppSpecificStorageConfiguration;
import io.intercom.android.sdk.lightcompressor.config.Configuration;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.m5.conversation.utils.URIExtensionsKt;
import io.intercom.android.sdk.utilities.BitmapUtilsKt;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.b;
import kotlin.collections.q;
import kotlin.coroutines.f;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: MediaCompression.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class MediaCompressionKt {
    private static final String compressedImagesFolderName = "compressed_images";
    private static final String compressedVideosFolderName = "compressed_videos";

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.utils.MediaCompressionKt$getCompressedMediaData$1, reason: invalid class name */
    /* JADX INFO: compiled from: MediaCompression.kt */
    @c(c = "io.intercom.android.sdk.m5.utils.MediaCompressionKt", f = "MediaCompression.kt", l = {133}, m = "getCompressedMediaData")
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MediaCompressionKt.getCompressedMediaData(null, null, this);
        }
    }

    public static final void deleteCompressedMedia(Uri uri) {
        i.e(uri, "uri");
        if (uri.getPathSegments().contains(compressedVideosFolderName) || uri.getPathSegments().contains(compressedImagesFolderName)) {
            new File(uri.toString()).delete();
        }
    }

    private static final CompressedImageData getCompressedImageData(Uri uri, Context context, String str) throws Throwable {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        FileOutputStream fileOutputStream = null;
        BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
        if (inputStreamOpenInputStream != null) {
            inputStreamOpenInputStream.close();
        }
        options.inSampleSize = BitmapUtilsKt.calculateInSampleSize(options, 612, 816);
        options.inJustDecodeBounds = false;
        InputStream inputStreamOpenInputStream2 = context.getContentResolver().openInputStream(uri);
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream2, null, options);
        if (inputStreamOpenInputStream2 != null) {
            inputStreamOpenInputStream2.close();
        }
        if (bitmapDecodeStream == null) {
            return null;
        }
        Bitmap bitmapDetermineBitmapRotation = BitmapUtilsKt.determineBitmapRotation(context, uri, bitmapDecodeStream);
        File file = new File(context.getCacheDir(), compressedImagesFolderName);
        file.mkdirs();
        File file2 = new File(file, s.b(str, ".jpg"));
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
            try {
                bitmapDetermineBitmapRotation.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream2);
                Uri uriFromFile = Uri.fromFile(file2);
                fileOutputStream2.flush();
                fileOutputStream2.close();
                if (uriFromFile != null) {
                    return new CompressedImageData(uriFromFile, bitmapDetermineBitmapRotation.getWidth(), bitmapDetermineBitmapRotation.getHeight(), file2.length());
                }
                return null;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    fileOutputStream.flush();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00d6 A[Catch: all -> 0x00db, TRY_LEAVE, TryCatch #1 {all -> 0x00db, blocks: (B:23:0x0086, B:25:0x0090, B:27:0x00b9, B:30:0x00d6, B:19:0x0056), top: B:46:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final Object getCompressedMediaData(MediaData.Media media, Context context, kotlin.coroutines.c<? super MediaData.Media> cVar) {
        AnonymousClass1 anonymousClass1;
        Object compressedVideoData;
        Context context2;
        String str;
        MediaData.Media.Video videoCopy;
        MediaData.Media media2 = media;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object obj = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            b.b(obj);
            if (!(media2 instanceof MediaData.Media.Video)) {
                if (!(media2 instanceof MediaData.Media.Image)) {
                    if (media2 instanceof MediaData.Media.Other) {
                        return media2;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                MediaData.Media.Image image = (MediaData.Media.Image) media2;
                String str2 = (String) q.O(n.e0(image.getFileName(), new String[]{"."}, 0, 6));
                CompressedImageData compressedImageData = getCompressedImageData(image.getUri(), context, str2);
                return compressedImageData != null ? new MediaData.Media.Image("image/jpg", compressedImageData.getWidth(), compressedImageData.getHeight(), compressedImageData.getSize(), s.b(str2, ".jpg"), compressedImageData.getUri()) : image;
            }
            try {
                String str3 = (String) q.O(n.e0(((MediaData.Media.Video) media2).getFileName(), new String[]{"."}, 0, 6));
                Uri uri = ((MediaData.Media.Video) media2).getUri();
                anonymousClass1.L$0 = media2;
                anonymousClass1.L$1 = context;
                anonymousClass1.L$2 = str3;
                anonymousClass1.label = 1;
                compressedVideoData = getCompressedVideoData(uri, context, str3, anonymousClass1);
                if (compressedVideoData == coroutineSingletons) {
                    return coroutineSingletons;
                }
                context2 = context;
                str = str3;
            } catch (Throwable unused) {
                return (MediaData.Media.Video) media2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str4 = (String) anonymousClass1.L$2;
            Context context3 = (Context) anonymousClass1.L$1;
            MediaData.Media media3 = (MediaData.Media) anonymousClass1.L$0;
            try {
                b.b(obj);
                str = str4;
                media2 = media3;
                compressedVideoData = obj;
                context2 = context3;
            } catch (Throwable unused2) {
                media2 = media3;
                return (MediaData.Media.Video) media2;
            }
        }
        Pair pair = (Pair) compressedVideoData;
        Uri uri2 = (Uri) pair.c();
        if (uri2 != null) {
            MediaData.Media.Video videoData = URIExtensionsKt.getVideoData(uri2, context2, str + ".mp4", "video/mp4", ((Number) pair.d()).longValue(), false);
            if (videoData == null || (videoCopy = videoData.copy((127 & 1) != 0 ? videoData.mimeType : null, (127 & 2) != 0 ? videoData.width : 0, (127 & 4) != 0 ? videoData.height : 0, (127 & 8) != 0 ? videoData.size : 0L, (127 & 16) != 0 ? videoData.fileName : null, (127 & 32) != 0 ? videoData.uri : null, (127 & 64) != 0 ? videoData.duration : 0L, (127 & 128) != 0 ? videoData.thumbnail : ((MediaData.Media.Video) media2).getThumbnail())) == null) {
                videoCopy = (MediaData.Media.Video) media2;
            }
        } else {
            videoCopy = (MediaData.Media.Video) media2;
        }
        return videoCopy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getCompressedVideoData(Uri uri, Context context, String str, kotlin.coroutines.c<? super Pair<? extends Uri, Long>> cVar) {
        final f fVar = new f(p.y(cVar), CoroutineSingletons.f43039c);
        final Twig logger = LumberMill.getLogger();
        VideoCompressor.start$default(context, M1.k(uri), false, null, new AppSpecificStorageConfiguration(compressedVideosFolderName), new Configuration(VideoQuality.LOW, false, null, false, false, null, null, M1.k(str), R.styleable.AppCompatTheme_windowNoTitle, null), new CompressionListener() { // from class: io.intercom.android.sdk.m5.utils.MediaCompressionKt$getCompressedVideoData$2$1
            @Override // io.intercom.android.sdk.lightcompressor.CompressionListener
            public void onCancelled(int i10) {
                logger.internal("Video compression cancelled.");
                fVar.resumeWith(b.a(new CancellationException()));
            }

            @Override // io.intercom.android.sdk.lightcompressor.CompressionListener
            public void onFailure(int i10, String failureMessage) {
                i.e(failureMessage, "failureMessage");
                logger.internal("Video compression failed: " + failureMessage + '.');
                fVar.resumeWith(b.a(new Throwable(failureMessage)));
            }

            @Override // io.intercom.android.sdk.lightcompressor.CompressionListener
            public void onProgress(int i10, float f10) {
                logger.internal("Video compression in progress: " + f10 + '.');
            }

            @Override // io.intercom.android.sdk.lightcompressor.CompressionListener
            public void onStart(int i10) {
                logger.internal("Video compression started.");
            }

            @Override // io.intercom.android.sdk.lightcompressor.CompressionListener
            public void onSuccess(int i10, long j, String str2) {
                logger.internal("Video compression succeeded. Video saved in " + str2 + '.');
                fVar.resumeWith(new Pair(Uri.fromFile(str2 != null ? new File(str2) : null), Long.valueOf(j)));
            }
        }, 8, null);
        return fVar.a();
    }
}
