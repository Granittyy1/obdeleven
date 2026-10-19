package p200q1;

import B6.d;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.image.ImageDecoderException;
import java.nio.ByteBuffer;
import p152m1.e;

/* JADX INFO: compiled from: BitmapFactoryImageDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends e<DecoderInputBuffer, d, ImageDecoderException> implements c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d f45977n;

    /* JADX INFO: compiled from: BitmapFactoryImageDecoder.java */
    public static final class a implements c.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f45978b = new d();

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
        
            if (r2 >= 26) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0078, code lost:
        
            if (r2 >= 34) goto L45;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int a(p078g1.n r7) {
            /*
                r6 = this;
                r0 = 4
                r1 = 1
                java.lang.String r2 = r7.f35302n
                r3 = 0
                if (r2 == 0) goto L84
                boolean r2 = p078g1.t.j(r2)
                if (r2 != 0) goto Lf
                goto L84
            Lf:
                int r2 = p114j1.A.f40996a
                java.lang.String r7 = r7.f35302n
                r7.getClass()
                int r2 = p114j1.A.f40996a
                r4 = -1
                int r5 = r7.hashCode()
                switch(r5) {
                    case -1487656890: goto L63;
                    case -1487464693: goto L58;
                    case -1487464690: goto L4d;
                    case -1487394660: goto L42;
                    case -1487018032: goto L37;
                    case -879272239: goto L2c;
                    case -879258763: goto L21;
                    default: goto L20;
                }
            L20:
                goto L6d
            L21:
                java.lang.String r5 = "image/png"
                boolean r7 = r7.equals(r5)
                if (r7 != 0) goto L2a
                goto L6d
            L2a:
                r4 = 6
                goto L6d
            L2c:
                java.lang.String r5 = "image/bmp"
                boolean r7 = r7.equals(r5)
                if (r7 != 0) goto L35
                goto L6d
            L35:
                r4 = 5
                goto L6d
            L37:
                java.lang.String r5 = "image/webp"
                boolean r7 = r7.equals(r5)
                if (r7 != 0) goto L40
                goto L6d
            L40:
                r4 = r0
                goto L6d
            L42:
                java.lang.String r5 = "image/jpeg"
                boolean r7 = r7.equals(r5)
                if (r7 != 0) goto L4b
                goto L6d
            L4b:
                r4 = 3
                goto L6d
            L4d:
                java.lang.String r5 = "image/heif"
                boolean r7 = r7.equals(r5)
                if (r7 != 0) goto L56
                goto L6d
            L56:
                r4 = 2
                goto L6d
            L58:
                java.lang.String r5 = "image/heic"
                boolean r7 = r7.equals(r5)
                if (r7 != 0) goto L61
                goto L6d
            L61:
                r4 = r1
                goto L6d
            L63:
                java.lang.String r5 = "image/avif"
                boolean r7 = r7.equals(r5)
                if (r7 != 0) goto L6c
                goto L6d
            L6c:
                r4 = r3
            L6d:
                switch(r4) {
                    case 0: goto L76;
                    case 1: goto L71;
                    case 2: goto L71;
                    case 3: goto L7a;
                    case 4: goto L7a;
                    case 5: goto L7a;
                    case 6: goto L7a;
                    default: goto L70;
                }
            L70:
                goto L7f
            L71:
                r7 = 26
                if (r2 < r7) goto L7f
                goto L7a
            L76:
                r7 = 34
                if (r2 < r7) goto L7f
            L7a:
                int r7 = androidx.media3.exoplayer.n0.n(r0, r3, r3, r3)
                goto L83
            L7f:
                int r7 = androidx.media3.exoplayer.n0.n(r1, r3, r3, r3)
            L83:
                return r7
            L84:
                int r7 = androidx.media3.exoplayer.n0.n(r3, r3, r3, r3)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: q1.b.a.a(g1.n):int");
        }
    }

    public b(d dVar) {
        super(new DecoderInputBuffer[1], new d[1]);
        this.f45977n = dVar;
    }

    @Override // p152m1.e
    public final DecoderInputBuffer h() {
        return new DecoderInputBuffer(1);
    }

    @Override // p152m1.e
    public final p152m1.d i() {
        return new p200q1.a(this);
    }

    @Override // p152m1.e
    public final DecoderException j(Throwable th) {
        return new ImageDecoderException("Unexpected decode error", th);
    }

    @Override // p152m1.e
    public final DecoderException k(DecoderInputBuffer decoderInputBuffer, p152m1.d dVar, boolean z10) {
        d dVar2 = (d) dVar;
        try {
            ByteBuffer byteBuffer = decoderInputBuffer.f17941e;
            byteBuffer.getClass();
            p241t7.b.k(byteBuffer.hasArray());
            p241t7.b.e(byteBuffer.arrayOffset() == 0);
            dVar2.f45980e = this.f45977n.a(byteBuffer.remaining(), byteBuffer.array());
            dVar2.f44563c = decoderInputBuffer.f17943g;
            return null;
        } catch (ImageDecoderException e10) {
            return e10;
        }
    }
}
