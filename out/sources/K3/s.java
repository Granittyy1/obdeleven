package K3;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: compiled from: VideoDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class s<T> implements A3.e<T, Bitmap> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final A3.c<Long> f4273d = new A3.c<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final A3.c<Integer> f4274e = new A3.c<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f4275f = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f<T> f4276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E3.c f4277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f4278c = f4275f;

    /* JADX INFO: compiled from: VideoDecoder.java */
    public class a implements A3.c.b<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f4279a = ByteBuffer.allocate(8);

        @Override // A3.c.b
        public final void a(byte[] bArr, Long l10, MessageDigest messageDigest) {
            Long l11 = l10;
            messageDigest.update(bArr);
            synchronized (this.f4279a) {
                this.f4279a.position(0);
                messageDigest.update(this.f4279a.putLong(l11.longValue()).array());
            }
        }
    }

    /* JADX INFO: compiled from: VideoDecoder.java */
    public class b implements A3.c.b<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f4280a = ByteBuffer.allocate(4);

        @Override // A3.c.b
        public final void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            Integer num2 = num;
            if (num2 == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f4280a) {
                this.f4280a.position(0);
                messageDigest.update(this.f4280a.putInt(num2.intValue()).array());
            }
        }
    }

    /* JADX INFO: compiled from: VideoDecoder.java */
    public static final class c implements f<AssetFileDescriptor> {
        @Override // K3.s.f
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }
    }

    /* JADX INFO: compiled from: VideoDecoder.java */
    public static final class d implements f<ByteBuffer> {
        @Override // K3.s.f
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new t(byteBuffer));
        }
    }

    /* JADX INFO: compiled from: VideoDecoder.java */
    public static class e {
    }

    /* JADX INFO: compiled from: VideoDecoder.java */
    public interface f<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t8);
    }

    /* JADX INFO: compiled from: VideoDecoder.java */
    public static final class g implements f<ParcelFileDescriptor> {
        @Override // K3.s.f
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    public s(E3.c cVar, f<T> fVar) {
        this.f4277b = cVar;
        this.f4276a = fVar;
    }

    public static Bitmap c(MediaMetadataRetriever mediaMetadataRetriever, long j, int i10, int i11, int i12, DownsampleStrategy downsampleStrategy) {
        Bitmap scaledFrameAtTime = null;
        if (Build.VERSION.SDK_INT >= 27 && i11 != Integer.MIN_VALUE && i12 != Integer.MIN_VALUE && downsampleStrategy != DownsampleStrategy.f24663d) {
            try {
                int i13 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                int i14 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                int i15 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                if (i15 == 90 || i15 == 270) {
                    i14 = i13;
                    i13 = i14;
                }
                float fB = downsampleStrategy.b(i13, i14, i11, i12);
                scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(j, i10, Math.round(i13 * fB), Math.round(fB * i14));
            } catch (Throwable unused) {
                Log.isLoggable("VideoDecoder", 3);
            }
        }
        return scaledFrameAtTime == null ? mediaMetadataRetriever.getFrameAtTime(j, i10) : scaledFrameAtTime;
    }

    @Override // A3.e
    public final boolean a(T t8, A3.d dVar) {
        return true;
    }

    @Override // A3.e
    public final D3.o<Bitmap> b(T t8, int i10, int i11, A3.d dVar) throws IOException {
        long jLongValue = ((Long) dVar.c(f4273d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException(com.google.gson.internal.b.b(jLongValue, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "));
        }
        Integer num = (Integer) dVar.c(f4274e);
        if (num == null) {
            num = 2;
        }
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) dVar.c(DownsampleStrategy.f24665f);
        if (downsampleStrategy == null) {
            downsampleStrategy = DownsampleStrategy.f24664e;
        }
        DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        this.f4278c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                this.f4276a.a(mediaMetadataRetriever, t8);
                Bitmap bitmapC = c(mediaMetadataRetriever, jLongValue, num.intValue(), i10, i11, downsampleStrategy2);
                mediaMetadataRetriever.release();
                return K3.d.d(this.f4277b, bitmapC);
            } catch (RuntimeException e10) {
                throw new IOException(e10);
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }
}
