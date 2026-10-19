package coil.decode;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import coil.size.Scale;
import com.braze.Constants;
import java.io.IOException;

/* JADX INFO: compiled from: VideoFrameDecoder.kt */
/* JADX INFO: loaded from: classes.dex */
public final class B implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f22848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final coil.request.k f22849b;

    /* JADX INFO: compiled from: VideoFrameDecoder.kt */
    public static final class a implements d.a {
        @Override // coil.decode.d.a
        public final d create(coil.fetch.l lVar, coil.request.k kVar, coil.f fVar) {
            String str = lVar.f22990b;
            if (str == null || !kotlin.text.m.I(str, "video/", false)) {
                return null;
            }
            return new B(lVar.f22989a, kVar);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return a.class.hashCode();
        }
    }

    public B(x xVar, coil.request.k kVar) {
        this.f22848a = xVar;
        this.f22849b = kVar;
    }

    public final long a(MediaMetadataRetriever mediaMetadataRetriever) {
        Long lB;
        coil.request.k kVar = this.f22849b;
        Long l10 = (Long) kVar.f23108l.e("coil#video_frame_micros");
        if (l10 != null) {
            return l10.longValue();
        }
        Double d10 = (Double) kVar.f23108l.e("coil#video_frame_percent");
        long jLongValue = 0;
        if (d10 == null) {
            return 0L;
        }
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
        if (strExtractMetadata != null && (lB = kotlin.text.l.B(strExtractMetadata)) != null) {
            jLongValue = lB.longValue();
        }
        return Ka.a.c(d10.doubleValue() * jLongValue) * ((long) Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if (A0.f.g(r9.getWidth(), r9.getHeight(), r10 instanceof Z2.a.C0110a ? ((Z2.a.C0110a) r10).f7725a : r9.getWidth(), r2 instanceof Z2.a.C0110a ? ((Z2.a.C0110a) r2).f7725a : r9.getHeight(), r3.f23102e) == 1.0d) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap b(android.graphics.Bitmap r9, Z2.e r10) {
        /*
            r8 = this;
            android.graphics.Bitmap$Config r0 = r9.getConfig()
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.HARDWARE
            Z2.a r2 = r10.f7733b
            Z2.a r10 = r10.f7732a
            coil.request.k r3 = r8.f22849b
            if (r0 != r1) goto L12
            android.graphics.Bitmap$Config r0 = r3.f23099b
            if (r0 != r1) goto L48
        L12:
            boolean r0 = r3.f23103f
            if (r0 == 0) goto L17
            goto L47
        L17:
            int r0 = r9.getWidth()
            int r4 = r9.getHeight()
            boolean r5 = r10 instanceof Z2.a.C0110a
            if (r5 == 0) goto L29
            r5 = r10
            Z2.a$a r5 = (Z2.a.C0110a) r5
            int r5 = r5.f7725a
            goto L2d
        L29:
            int r5 = r9.getWidth()
        L2d:
            boolean r6 = r2 instanceof Z2.a.C0110a
            if (r6 == 0) goto L37
            r6 = r2
            Z2.a$a r6 = (Z2.a.C0110a) r6
            int r6 = r6.f7725a
            goto L3b
        L37:
            int r6 = r9.getHeight()
        L3b:
            coil.size.Scale r7 = r3.f23102e
            double r4 = A0.f.g(r0, r4, r5, r6, r7)
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L48
        L47:
            return r9
        L48:
            int r0 = r9.getWidth()
            int r4 = r9.getHeight()
            boolean r5 = r10 instanceof Z2.a.C0110a
            if (r5 == 0) goto L59
            Z2.a$a r10 = (Z2.a.C0110a) r10
            int r10 = r10.f7725a
            goto L5d
        L59:
            int r10 = r9.getWidth()
        L5d:
            boolean r5 = r2 instanceof Z2.a.C0110a
            if (r5 == 0) goto L66
            Z2.a$a r2 = (Z2.a.C0110a) r2
            int r2 = r2.f7725a
            goto L6a
        L66:
            int r2 = r9.getHeight()
        L6a:
            coil.size.Scale r5 = r3.f23102e
            double r4 = A0.f.g(r0, r4, r10, r2, r5)
            float r10 = (float) r4
            int r0 = r9.getWidth()
            float r0 = (float) r0
            float r0 = r0 * r10
            int r0 = Ka.a.b(r0)
            int r2 = r9.getHeight()
            float r2 = (float) r2
            float r2 = r2 * r10
            int r2 = Ka.a.b(r2)
            android.graphics.Bitmap$Config r3 = r3.f23099b
            if (r3 != r1) goto L8b
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
        L8b:
            android.graphics.Paint r1 = new android.graphics.Paint
            r4 = 3
            r1.<init>(r4)
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r2, r3)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r0)
            r2.scale(r10, r10)
            r10 = 0
            r2.drawBitmap(r9, r10, r10, r1)
            r9.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.decode.B.b(android.graphics.Bitmap, Z2.e):android.graphics.Bitmap");
    }

    public final void c(MediaMetadataRetriever mediaMetadataRetriever, x xVar) throws IOException {
        if (xVar.h() instanceof coil.fetch.j) {
            x.a aVarH = xVar.h();
            kotlin.jvm.internal.i.c(aVarH, "null cannot be cast to non-null type coil.fetch.MediaDataSourceFetcher.MediaSourceMetadata");
            mediaMetadataRetriever.setDataSource((MediaDataSource) null);
            return;
        }
        x.a aVarH2 = xVar.h();
        boolean z10 = aVarH2 instanceof C1554a;
        coil.request.k kVar = this.f22849b;
        if (z10) {
            AssetFileDescriptor assetFileDescriptorOpenFd = kVar.f23098a.getAssets().openFd(((C1554a) aVarH2).f22871a);
            try {
                mediaMetadataRetriever.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
                p293xa.r rVar = p293xa.r.f47939a;
                p241t7.b.n(assetFileDescriptorOpenFd, null);
                return;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    p241t7.b.n(assetFileDescriptorOpenFd, th);
                    throw th2;
                }
            }
        }
        if (aVarH2 instanceof C1555b) {
            mediaMetadataRetriever.setDataSource(kVar.f23098a, ((C1555b) aVarH2).f22872a);
            return;
        }
        if (!(aVarH2 instanceof z)) {
            mediaMetadataRetriever.setDataSource(xVar.b().e().getPath());
            return;
        }
        StringBuilder sb2 = new StringBuilder("android.resource://");
        z zVar = (z) aVarH2;
        sb2.append(zVar.f22910a);
        sb2.append('/');
        sb2.append(zVar.f22911b);
        mediaMetadataRetriever.setDataSource(sb2.toString());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0199 A[Catch: all -> 0x0024, TRY_ENTER, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x001e, B:12:0x0029, B:14:0x0035, B:16:0x003b, B:22:0x004d, B:24:0x0053, B:26:0x0059, B:28:0x005f, B:30:0x0065, B:32:0x006b, B:50:0x009f, B:54:0x00af, B:58:0x00bd, B:63:0x00cb, B:66:0x00ef, B:69:0x00fd, B:71:0x0101, B:73:0x0105, B:75:0x010f, B:87:0x0161, B:90:0x016a, B:94:0x017d, B:100:0x0199, B:101:0x01b3, B:76:0x0126, B:81:0x013e, B:84:0x0154, B:82:0x014c, B:57:0x00b7, B:53:0x00a9, B:65:0x00ea, B:35:0x0074, B:37:0x007a, B:39:0x0080, B:41:0x0086, B:43:0x008c, B:45:0x0092), top: B:107:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0070 A[PHI: r3
      0x0070: PHI (r3v16 int) = (r3v13 int), (r3v13 int), (r3v47 int), (r3v47 int) binds: [B:42:0x008a, B:44:0x0090, B:29:0x0063, B:31:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x0161 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x001e, B:12:0x0029, B:14:0x0035, B:16:0x003b, B:22:0x004d, B:24:0x0053, B:26:0x0059, B:28:0x005f, B:30:0x0065, B:32:0x006b, B:50:0x009f, B:54:0x00af, B:58:0x00bd, B:63:0x00cb, B:66:0x00ef, B:69:0x00fd, B:71:0x0101, B:73:0x0105, B:75:0x010f, B:87:0x0161, B:90:0x016a, B:94:0x017d, B:100:0x0199, B:101:0x01b3, B:76:0x0126, B:81:0x013e, B:84:0x0154, B:82:0x014c, B:57:0x00b7, B:53:0x00a9, B:65:0x00ea, B:35:0x0074, B:37:0x007a, B:39:0x0080, B:41:0x0086, B:43:0x008c, B:45:0x0092), top: B:107:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:92:0x017a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0191  */
    /* JADX WARN: Code duplicated, block: B:98:0x0195  */
    /* JADX WARN: Instruction removed from duplicated block: B:100:0x0199, please report this as an issue */
    @Override // coil.decode.d
    public final Object decode(kotlin.coroutines.c<? super c> cVar) throws IOException {
        int iIntValue;
        Integer numA;
        int iIntValue2;
        Integer numA2;
        Z2.e eVar;
        long j;
        Bitmap frameAtTime;
        int height;
        boolean z10;
        Integer numA3;
        Integer numA4;
        Integer numA5;
        coil.request.k kVar = this.f22849b;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            c(mediaMetadataRetriever, this.f22848a);
            coil.request.l lVar = kVar.f23108l;
            Z2.e eVar2 = kVar.f23101d;
            Integer num = (Integer) lVar.e("coil#video_frame_option");
            int iIntValue3 = num != null ? num.intValue() : 2;
            long jA = a(mediaMetadataRetriever);
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(24);
            int iIntValue4 = (strExtractMetadata == null || (numA5 = kotlin.text.l.A(strExtractMetadata)) == null) ? 0 : numA5.intValue();
            if (iIntValue4 == 90 || iIntValue4 == 270) {
                String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                iIntValue = (strExtractMetadata2 == null || (numA2 = kotlin.text.l.A(strExtractMetadata2)) == null) ? 0 : numA2.intValue();
                String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(18);
                if (strExtractMetadata3 == null || (numA = kotlin.text.l.A(strExtractMetadata3)) == null) {
                    iIntValue2 = 0;
                } else {
                    iIntValue2 = numA.intValue();
                }
            } else {
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(18);
                iIntValue = (strExtractMetadata4 == null || (numA4 = kotlin.text.l.A(strExtractMetadata4)) == null) ? 0 : numA4.intValue();
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(19);
                if (strExtractMetadata5 == null || (numA3 = kotlin.text.l.A(strExtractMetadata5)) == null) {
                    iIntValue2 = 0;
                } else {
                    iIntValue2 = numA3.intValue();
                }
            }
            int width = iIntValue;
            int i10 = iIntValue2;
            Scale scale = kVar.f23102e;
            if (width <= 0 || i10 <= 0) {
                eVar = Z2.e.f7731c;
            } else {
                Z2.e eVar3 = Z2.e.f7731c;
                double dG = A0.f.g(width, i10, kotlin.jvm.internal.i.a(eVar2, eVar3) ? width : coil.util.n.a(eVar2.f7732a, scale), kotlin.jvm.internal.i.a(eVar2, eVar3) ? i10 : coil.util.n.a(eVar2.f7733b, scale), scale);
                if (kVar.f23103f && dG > 1.0d) {
                    dG = 1.0d;
                }
                eVar = new Z2.e(new Z2.a.C0110a(Ka.a.a(((double) width) * dG)), new Z2.a.C0110a(Ka.a.a(dG * ((double) i10))));
            }
            Z2.e eVar4 = eVar;
            Z2.a aVar = eVar4.f7732a;
            Z2.a aVar2 = eVar4.f7733b;
            int i11 = Build.VERSION.SDK_INT;
            Bitmap.Config config = kVar.f23099b;
            if (i11 < 27 || !(aVar instanceof Z2.a.C0110a) || !(aVar2 instanceof Z2.a.C0110a)) {
                scale = scale;
                i10 = i10;
                if (i11 >= 30) {
                    MediaMetadataRetriever.BitmapParams bitmapParamsA = coil.util.l.a();
                    bitmapParamsA.setPreferredConfig(config);
                    j = jA;
                    frameAtTime = mediaMetadataRetriever.getFrameAtTime(j, iIntValue3, bitmapParamsA);
                } else {
                    j = jA;
                    frameAtTime = mediaMetadataRetriever.getFrameAtTime(j, iIntValue3);
                }
                if (frameAtTime != null) {
                    width = frameAtTime.getWidth();
                    height = frameAtTime.getHeight();
                } else {
                    frameAtTime = null;
                }
                if (frameAtTime != null) {
                    throw new IllegalStateException(("Failed to decode frame at " + j + " microseconds.").toString());
                }
                Bitmap bitmapB = b(frameAtTime, eVar4);
                if (width > 0 || height <= 0 || A0.f.g(width, height, bitmapB.getWidth(), bitmapB.getHeight(), scale) < 1.0d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                c cVar2 = new c(new BitmapDrawable(kVar.f23098a.getResources(), bitmapB), z10);
                if (i11 >= 29) {
                    mediaMetadataRetriever.release();
                } else {
                    mediaMetadataRetriever.release();
                }
                return cVar2;
            }
            int i12 = ((Z2.a.C0110a) aVar).f7725a;
            int i13 = ((Z2.a.C0110a) aVar2).f7725a;
            if (i11 >= 30) {
                MediaMetadataRetriever.BitmapParams bitmapParamsA2 = coil.util.l.a();
                bitmapParamsA2.setPreferredConfig(config);
                frameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(jA, iIntValue3, i12, i13, bitmapParamsA2);
            } else {
                frameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(jA, iIntValue3, i12, i13);
            }
            j = jA;
            height = i10;
            if (frameAtTime != null) {
                throw new IllegalStateException(("Failed to decode frame at " + j + " microseconds.").toString());
            }
            Bitmap bitmapB2 = b(frameAtTime, eVar4);
            if (width > 0) {
                z10 = true;
            } else {
                z10 = true;
            }
            c cVar3 = new c(new BitmapDrawable(kVar.f23098a.getResources(), bitmapB2), z10);
            if (i11 >= 29) {
                mediaMetadataRetriever.release();
            } else {
                mediaMetadataRetriever.release();
            }
            return cVar3;
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 29) {
                mediaMetadataRetriever.release();
            } else {
                mediaMetadataRetriever.release();
            }
            throw th;
        }
    }
}
