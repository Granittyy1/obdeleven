package com.braze.support;

import A1.C0575j;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.TrafficStats;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import bo.app.d7;
import com.braze.Braze;
import com.braze.Constants;
import com.braze.enums.BrazeViewBounds;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: loaded from: classes.dex */
public final class BrazeImageUtils {
    private static final int MAX_IMAGE_CACHE_SIZE_BYTES = 33554432;
    private static final int MIN_IMAGE_CACHE_SIZE_BYTES = 1024;
    private static final int QUARTER_MAX_SAMPLED_IMAGE_BYTES = 4194304;
    public static final int RUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENT = 8;
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("BrazeImageUtils");

    public static final class a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f24237b = new a();

        public a() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Not sampling on 0 destination width or height";
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BitmapFactory.Options f24238b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f24239c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f24240d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(BitmapFactory.Options options, int i10, int i11) {
            super(0);
            this.f24238b = options;
            this.f24239c = i10;
            this.f24240d = i11;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Calculating sample size for source image bounds: (width ");
            sb2.append(this.f24238b.outWidth);
            sb2.append(" height ");
            sb2.append(this.f24238b.outHeight);
            sb2.append(") and destination image bounds: (width ");
            sb2.append(this.f24239c);
            sb2.append(" height ");
            return C0575j.b(sb2, this.f24240d, ')');
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref$IntRef f24241b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f24242c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f24243d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Ref$IntRef ref$IntRef, long j, long j10) {
            super(0);
            this.f24241b = ref$IntRef;
            this.f24242c = j;
            this.f24243d = j10;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Using image sample size of " + this.f24241b.element + ". Image will be scaled to width: " + (this.f24242c / ((long) this.f24241b.element)) + " and height: " + (this.f24243d / ((long) this.f24241b.element));
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Uri f24244b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Uri uri) {
            super(0);
            this.f24244b = uri;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Uri with unknown scheme received. Not getting image. Uri: " + this.f24244b;
        }
    }

    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f24245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f24246c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i10, int i11) {
            super(0);
            this.f24245b = i10;
            this.f24246c = i11;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Display width: " + this.f24245b + " and height " + this.f24246c;
        }
    }

    public static final class f extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Uri f24247b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Uri uri) {
            super(0);
            this.f24247b = uri;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Local bitmap path is null. URI: " + this.f24247b;
        }
    }

    public static final class g extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Uri f24248b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Uri uri) {
            super(0);
            this.f24248b = uri;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Local bitmap file does not exist. URI: " + this.f24248b;
        }
    }

    public static final class h extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f24249b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(File file) {
            super(0);
            this.f24249b = file;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Retrieving image from local path: " + this.f24249b.getAbsolutePath();
        }
    }

    public static final class i extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final i f24250b = new i();

        public i() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Destination bounds unset. Loading entire bitmap into memory.";
        }
    }

    public static final class j extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f24251b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f24252c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(int i10, int i11) {
            super(0);
            this.f24251b = i10;
            this.f24252c = i11;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Sampling bitmap with destination image bounds: (width ");
            sb2.append(this.f24251b);
            sb2.append(" height ");
            return C0575j.b(sb2, this.f24252c, ')');
        }
    }

    public static final class k extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Uri f24253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BitmapFactory.Options f24254c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Uri uri, BitmapFactory.Options options) {
            super(0);
            this.f24253b = uri;
            this.f24254c = options;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("The bitmap metadata with image uri ");
            sb2.append(this.f24253b);
            sb2.append(" had bounds: (height ");
            sb2.append(this.f24254c.outHeight);
            sb2.append(" width ");
            return p005a4.q.c(sb2, this.f24254c.outWidth, "). Returning a bitmap with no sampling.");
        }
    }

    public static final class l extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final l f24255b = new l();

        public l() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Decoding sampled bitmap";
        }
    }

    public static final class m extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Exception f24256b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Exception exc) {
            super(0);
            this.f24256b = exc;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Exception occurred when attempting to retrieve local bitmap. " + this.f24256b.getMessage();
        }
    }

    public static final class n extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final n f24257b = new n();

        public n() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "IOException during closing of bitmap metadata image stream.";
        }
    }

    public static final class o extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24258b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str) {
            super(0);
            this.f24258b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "SDK is in offline mode, not downloading remote bitmap with uri: " + this.f24258b;
        }
    }

    public static final class p extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f24259b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ URL f24260c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(int i10, URL url) {
            super(0);
            this.f24259b = i10;
            this.f24260c = url;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "HTTP response code was " + this.f24259b + ". Bitmap with url " + this.f24260c + " could not be downloaded.";
        }
    }

    public static final class q extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f24261b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f24262c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(int i10, int i11) {
            super(0);
            this.f24261b = i10;
            this.f24262c = i11;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Sampling bitmap with destination image bounds: (height ");
            sb2.append(this.f24261b);
            sb2.append(" width ");
            return C0575j.b(sb2, this.f24262c, ')');
        }
    }

    public static final class r extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ URL f24263b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BitmapFactory.Options f24264c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(URL url, BitmapFactory.Options options) {
            super(0);
            this.f24263b = url;
            this.f24264c = options;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("The bitmap metadata with image url ");
            sb2.append(this.f24263b);
            sb2.append(" had bounds: (height ");
            sb2.append(this.f24264c.outHeight);
            sb2.append(" width ");
            return p005a4.q.c(sb2, this.f24264c.outWidth, "). Returning a bitmap with no sampling.");
        }
    }

    public static final class s extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24265b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Exception f24266c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(String str, Exception exc) {
            super(0);
            this.f24265b = str;
            this.f24266c = exc;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Exception in image bitmap download for Uri: " + this.f24265b + ' ' + this.f24266c.getMessage();
        }
    }

    public static final class t extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final t f24267b = new t();

        public t() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "IOException during closing of bitmap metadata download stream.";
        }
    }

    public static final class u extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final u f24268b = new u();

        public u() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Neither source bitmap nor ImageView may be null. Not resizing ImageView";
        }
    }

    public static final class v extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImageView f24269b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(ImageView imageView) {
            super(0);
            this.f24269b = imageView;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Bitmap dimensions cannot be 0. Not resizing ImageView " + this.f24269b;
        }
    }

    public static final class w extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImageView f24270b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(ImageView imageView) {
            super(0);
            this.f24270b = imageView;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "ImageView dimensions cannot be 0. Not resizing ImageView " + this.f24270b;
        }
    }

    public static final class x extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f24271b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ImageView f24272c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(float f10, ImageView imageView) {
            super(0);
            this.f24271b = f10;
            this.f24272c = imageView;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Resizing ImageView to aspect ratio " + this.f24271b + " based on width: " + this.f24272c.getWidth() + " layoutParams: " + this.f24272c.getLayoutParams() + ' ' + this.f24272c;
        }
    }

    public static final int calculateInSampleSize(BitmapFactory.Options options, int i10, int i11) {
        long j10;
        long j11;
        kotlin.jvm.internal.i.e(options, "options");
        if (i11 == 0 || i10 == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) a.f24237b, 6, (Object) null);
            return 1;
        }
        long j12 = options.outHeight;
        long j13 = options.outWidth;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) new b(options, i10, i11), 6, (Object) null);
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = 1;
        long j14 = i11;
        if (j12 > j14 || j13 > i10) {
            long j15 = 2;
            long j16 = j12 / j15;
            long j17 = j13 / j15;
            while (true) {
                int i12 = ref$IntRef.element;
                j10 = j13;
                long j18 = i12;
                if (j16 / j18 < j14) {
                    j11 = j14;
                    if (j17 / j18 < i10 && (j10 * j12) / ((long) (i12 * i12)) <= 4194304) {
                        break;
                    }
                } else {
                    j11 = j14;
                }
                ref$IntRef.element = i12 * 2;
                j13 = j10;
                j14 = j11;
            }
        } else {
            j10 = j13;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) new c(ref$IntRef, j10, j12), 6, (Object) null);
        return ref$IntRef.element;
    }

    private static final Bitmap decodeSampledBitmapFromStream(InputStream inputStream, BitmapFactory.Options options, int i10, int i11) {
        options.inSampleSize = calculateInSampleSize(options, i10, i11);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    public static final Bitmap getBitmap(Context context, Uri uri, BrazeViewBounds viewBounds) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(uri, "uri");
        kotlin.jvm.internal.i.e(viewBounds, "viewBounds");
        Pair<Integer, Integer> destinationHeightAndWidthPixels = getDestinationHeightAndWidthPixels(context, viewBounds);
        int iIntValue = destinationHeightAndWidthPixels.a().intValue();
        int iIntValue2 = destinationHeightAndWidthPixels.b().intValue();
        if (BrazeFileUtils.isLocalUri(uri)) {
            return getLocalBitmap(uri, iIntValue2, iIntValue);
        }
        if (BrazeFileUtils.isRemoteUri(uri)) {
            return getRemoteBitmap(uri, iIntValue2, iIntValue);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, (Ia.a) new d(uri), 4, (Object) null);
        return null;
    }

    public static /* synthetic */ Bitmap getBitmap$default(Context context, Uri uri, BrazeViewBounds brazeViewBounds, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            brazeViewBounds = BrazeViewBounds.NO_BOUNDS;
        }
        return getBitmap(context, uri, brazeViewBounds);
    }

    public static final BitmapFactory.Options getBitmapMetadataFromStream(InputStream inputStream) {
        kotlin.jvm.internal.i.e(inputStream, "inputStream");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        return options;
    }

    public static final int getDensityDpi(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        return context.getResources().getConfiguration().densityDpi;
    }

    private static final Pair<Integer, Integer> getDestinationHeightAndWidthPixels(Context context, BrazeViewBounds brazeViewBounds) {
        Pair<Integer, Integer> displayHeightAndWidthPixels = getDisplayHeightAndWidthPixels(context);
        int iIntValue = displayHeightAndWidthPixels.a().intValue();
        int iIntValue2 = displayHeightAndWidthPixels.b().intValue();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.V, (Throwable) null, (Ia.a) new e(iIntValue2, iIntValue), 4, (Object) null);
        if (BrazeViewBounds.NO_BOUNDS == brazeViewBounds) {
            return new Pair<>(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
        }
        int densityDpi = getDensityDpi(context);
        return new Pair<>(Integer.valueOf(Math.min(iIntValue, getPixelsFromDensityAndDp(densityDpi, brazeViewBounds.getHeightDp()))), Integer.valueOf(Math.min(iIntValue2, getPixelsFromDensityAndDp(densityDpi, brazeViewBounds.getWidthDp()))));
    }

    public static final Pair<Integer, Integer> getDisplayHeightAndWidthPixels(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return new Pair<>(Integer.valueOf(displayMetrics.heightPixels), Integer.valueOf(displayMetrics.widthPixels));
    }

    public static final int getDisplayWidthPixels(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        return getDisplayHeightAndWidthPixels(context).d().intValue();
    }

    public static final int getImageLoaderCacheSize() {
        return Math.max(MIN_IMAGE_CACHE_SIZE_BYTES, Math.min((int) Math.min(Runtime.getRuntime().maxMemory() / ((long) 8), 2147483647L), MAX_IMAGE_CACHE_SIZE_BYTES));
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static final Bitmap getLocalBitmap(Uri uri, int i10, int i11) throws Throwable {
        FileInputStream fileInputStream;
        Bitmap bitmapDecodeFile;
        kotlin.jvm.internal.i.e(uri, "uri");
        FileInputStream fileInputStream2 = null;
        try {
            String path = uri.getPath();
            if (path != null && path.length() != 0) {
                File file = new File(path);
                if (!file.exists()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) new g(uri), 6, (Object) null);
                    return null;
                }
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                String str = TAG;
                BrazeLogger.brazelog$default(brazeLogger, str, BrazeLogger.Priority.I, (Throwable) null, (Ia.a) new h(file), 4, (Object) null);
                if (i10 > 0 && i11 > 0) {
                    fileInputStream = new FileInputStream(file);
                    try {
                        BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) new j(i10, i11), 6, (Object) null);
                        BitmapFactory.Options bitmapMetadataFromStream = getBitmapMetadataFromStream(fileInputStream);
                        fileInputStream.close();
                        FileInputStream fileInputStream3 = new FileInputStream(file);
                        try {
                            if (bitmapMetadataFromStream.outHeight == 0 || bitmapMetadataFromStream.outWidth == 0) {
                                BrazeLogger.brazelog$default(brazeLogger, str, BrazeLogger.Priority.W, (Throwable) null, (Ia.a) new k(uri, bitmapMetadataFromStream), 4, (Object) null);
                                bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
                            } else {
                                BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) l.f24255b, 6, (Object) null);
                                bitmapDecodeFile = decodeSampledBitmapFromStream(fileInputStream3, bitmapMetadataFromStream, i10, i11);
                            }
                            try {
                                fileInputStream3.close();
                            } catch (IOException e10) {
                                BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) e10, (Ia.a<String>) n.f24257b);
                            }
                            return bitmapDecodeFile;
                        } catch (Exception e11) {
                            e = e11;
                            fileInputStream = fileInputStream3;
                            try {
                                BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) e, (Ia.a<String>) new m(e));
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e12) {
                                        BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) e12, (Ia.a<String>) n.f24257b);
                                    }
                                }
                                return null;
                            } catch (Throwable th) {
                                th = th;
                                fileInputStream2 = fileInputStream;
                                fileInputStream = fileInputStream2;
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e13) {
                                        BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) e13, (Ia.a<String>) n.f24257b);
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream = fileInputStream3;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            throw th;
                        }
                    } catch (Exception e14) {
                        e = e14;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) i.f24250b, 6, (Object) null);
                return BitmapFactory.decodeFile(file.getAbsolutePath());
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) new f(uri), 6, (Object) null);
            return null;
        } catch (Exception e15) {
            e = e15;
            fileInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = fileInputStream2;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw th;
        }
    }

    public static final int getPixelsFromDensityAndDp(int i10, int i11) {
        return Math.abs((i10 * i11) / 160);
    }

    private static final Bitmap getRemoteBitmap(Uri uri, int i10, int i11) throws Throwable {
        Throwable th;
        InputStream inputStream;
        HttpURLConnection httpURLConnectionA;
        Bitmap bitmapDecodeStream;
        TrafficStats.setThreadStatsTag(Constants.TRAFFIC_STATS_THREAD_TAG);
        String string = uri.toString();
        kotlin.jvm.internal.i.d(string, "uri.toString()");
        HttpURLConnection httpURLConnection = null;
        try {
            if (Braze.Companion.getOutboundNetworkRequestsOffline()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, (Ia.a) new o(string), 4, (Object) null);
                return null;
            }
            try {
                URL url = new URL(string);
                d7 d7Var = d7.f20875a;
                httpURLConnectionA = d7Var.a(url);
                try {
                    int responseCode = httpURLConnectionA.getResponseCode();
                    if (responseCode != 200) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, (Ia.a) new p(responseCode, url), 4, (Object) null);
                        httpURLConnectionA.disconnect();
                        return null;
                    }
                    inputStream = httpURLConnectionA.getInputStream();
                    try {
                        if (i10 == 0 || i11 == 0) {
                            bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
                        } else {
                            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                            String str = TAG;
                            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) new q(i11, i10), 6, (Object) null);
                            BitmapFactory.Options bitmapMetadataFromStream = getBitmapMetadataFromStream(inputStream);
                            httpURLConnectionA.disconnect();
                            httpURLConnectionA = d7Var.a(url);
                            inputStream = httpURLConnectionA.getInputStream();
                            if (bitmapMetadataFromStream.outHeight == 0 || bitmapMetadataFromStream.outWidth == 0) {
                                BrazeLogger.brazelog$default(brazeLogger, str, BrazeLogger.Priority.W, (Throwable) null, (Ia.a) new r(url, bitmapMetadataFromStream), 4, (Object) null);
                                bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
                            } else {
                                bitmapDecodeStream = decodeSampledBitmapFromStream(inputStream, bitmapMetadataFromStream, i10, i11);
                            }
                        }
                        Bitmap bitmap = bitmapDecodeStream;
                        httpURLConnectionA.disconnect();
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e10) {
                                BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) e10, (Ia.a<String>) t.f24267b);
                            }
                        }
                        return bitmap;
                    } catch (Exception e11) {
                        e = e11;
                        BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) e, (Ia.a<String>) new s(string, e));
                        if (httpURLConnectionA != null) {
                            httpURLConnectionA.disconnect();
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e12) {
                                BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) e12, (Ia.a<String>) t.f24267b);
                            }
                        }
                        return null;
                    }
                } catch (Exception e13) {
                    e = e13;
                    inputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = null;
                }
            } catch (Exception e14) {
                e = e14;
                httpURLConnectionA = null;
                inputStream = null;
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        httpURLConnection = httpURLConnectionA;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        if (inputStream == null) {
            throw th;
        }
        try {
            inputStream.close();
            throw th;
        } catch (IOException e15) {
            BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) e15, (Ia.a<String>) t.f24267b);
            throw th;
        }
    }

    public static final void resizeImageViewToBitmapDimensions(Bitmap bitmap, ImageView imageView) {
        kotlin.jvm.internal.i.e(imageView, "imageView");
        resizeToBitmapDimensions(imageView, bitmap);
    }

    public static final void resizeToBitmapDimensions(ImageView imageView, Bitmap bitmap) {
        kotlin.jvm.internal.i.e(imageView, "<this>");
        if (bitmap == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, (Ia.a) u.f24268b, 4, (Object) null);
            return;
        }
        if (bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, (Ia.a) new v(imageView), 4, (Object) null);
            return;
        }
        if (imageView.getWidth() == 0 || imageView.getHeight() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, (Ia.a) new w(imageView), 4, (Object) null);
            return;
        }
        float width = bitmap.getWidth() / bitmap.getHeight();
        imageView.getLayoutParams().height = (int) (imageView.getWidth() / width);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.V, (Throwable) null, (Ia.a) new x(width, imageView), 4, (Object) null);
        imageView.setLayoutParams(imageView.getLayoutParams());
    }

    public static /* synthetic */ void getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENT$annotations() {
    }
}
