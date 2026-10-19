package com.bumptech.glide.load.resource.bitmap;

import E3.h;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.google.android.gms.internal.measurement.M1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f24655a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f24656b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public interface Reader {

        public static final class EndOfFileException extends IOException {
            private static final long serialVersionUID = 1;

            public EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a() throws IOException;

        short b() throws IOException;

        long skip(long j) throws IOException;
    }

    public static final class a implements Reader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f24657a;

        public a(ByteBuffer byteBuffer) {
            this.f24657a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int a() throws Reader.EndOfFileException {
            return (b() << 8) | b();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final short b() throws Reader.EndOfFileException {
            ByteBuffer byteBuffer = this.f24657a;
            if (byteBuffer.remaining() >= 1) {
                return (short) (byteBuffer.get() & 255);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final long skip(long j) {
            ByteBuffer byteBuffer = this.f24657a;
            int iMin = (int) Math.min(byteBuffer.remaining(), j);
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f24658a;

        public b(int i10, byte[] bArr) {
            this.f24658a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
        }

        public final short a(int i10) {
            ByteBuffer byteBuffer = this.f24658a;
            if (byteBuffer.remaining() - i10 >= 2) {
                return byteBuffer.getShort(i10);
            }
            return (short) -1;
        }
    }

    public static final class c implements Reader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputStream f24659a;

        public c(InputStream inputStream) {
            this.f24659a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int a() throws IOException {
            return (b() << 8) | b();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final short b() throws IOException {
            int i10 = this.f24659a.read();
            if (i10 != -1) {
                return (short) i10;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final long skip(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j10 = j;
            while (j10 > 0) {
                InputStream inputStream = this.f24659a;
                long jSkip = inputStream.skip(j10);
                if (jSkip > 0) {
                    j10 -= jSkip;
                } else {
                    if (inputStream.read() == -1) {
                        break;
                    }
                    j10--;
                }
            }
            return j - j10;
        }
    }

    public static ImageHeaderParser.ImageType d(Reader reader) throws IOException {
        try {
            int iA = reader.a();
            if (iA == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iB = (iA << 8) | reader.b();
            if (iB == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iB2 = (iB << 8) | reader.b();
            if (iB2 == -1991225785) {
                reader.skip(21L);
                try {
                    return reader.b() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iB2 != 1380533830) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            reader.skip(4L);
            if (((reader.a() << 16) | reader.a()) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iA2 = (reader.a() << 16) | reader.a();
            if ((iA2 & (-256)) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i10 = iA2 & 255;
            if (i10 == 88) {
                reader.skip(4L);
                return (reader.b() & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (i10 != 76) {
                return ImageHeaderParser.ImageType.WEBP;
            }
            reader.skip(4L);
            return (reader.b() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    public static int e(c cVar, byte[] bArr, int i10) throws IOException {
        ByteOrder byteOrder;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10 && (i12 = cVar.f24659a.read(bArr, i11, i10 - i11)) != -1) {
            i11 += i12;
        }
        if (i11 == 0 && i12 == -1) {
            throw new Reader.EndOfFileException();
        }
        if (i11 != i10) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        byte[] bArr2 = f24655a;
        boolean z10 = bArr != null && i10 > bArr2.length;
        if (z10) {
            for (int i13 = 0; i13 < bArr2.length; i13++) {
                if (bArr[i13] != bArr2[i13]) {
                    z10 = false;
                    break;
                }
            }
        }
        if (!z10) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        b bVar = new b(i10, bArr);
        short sA = bVar.a(6);
        if (sA == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (sA != 19789) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        ByteBuffer byteBuffer = bVar.f24658a;
        byteBuffer.order(byteOrder);
        int i14 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
        short sA2 = bVar.a(i14 + 6);
        for (int i15 = 0; i15 < sA2; i15++) {
            int i16 = (i15 * 12) + i14 + 8;
            if (bVar.a(i16) == 274) {
                short sA3 = bVar.a(i16 + 2);
                if (sA3 < 1 || sA3 > 12) {
                    Log.isLoggable("DfltImageHeaderParser", 3);
                } else {
                    int i17 = i16 + 4;
                    int i18 = byteBuffer.remaining() - i17 >= 4 ? byteBuffer.getInt(i17) : -1;
                    if (i18 < 0) {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                    } else {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                        int i19 = i18 + f24656b[sA3];
                        if (i19 > 4) {
                            Log.isLoggable("DfltImageHeaderParser", 3);
                        } else {
                            int i20 = i16 + 8;
                            if (i20 < 0 || i20 > byteBuffer.remaining()) {
                                Log.isLoggable("DfltImageHeaderParser", 3);
                            } else {
                                if (i19 >= 0 && i19 + i20 <= byteBuffer.remaining()) {
                                    return bVar.a(i20);
                                }
                                Log.isLoggable("DfltImageHeaderParser", 3);
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) throws IOException {
        M1.d(byteBuffer, "Argument must not be null");
        return d(new a(byteBuffer));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType b(InputStream inputStream) throws IOException {
        return d(new c(inputStream));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int c(InputStream inputStream, h hVar) throws IOException {
        int iA;
        c cVar = new c(inputStream);
        M1.d(hVar, "Argument must not be null");
        try {
            int iA2 = cVar.a();
            if (!((iA2 & 65496) == 65496 || iA2 == 19789 || iA2 == 18761)) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            while (true) {
                if (cVar.b() != 255) {
                    Log.isLoggable("DfltImageHeaderParser", 3);
                } else {
                    short sB = cVar.b();
                    if (sB != 218) {
                        if (sB != 217) {
                            iA = cVar.a() - 2;
                            if (sB == 225) {
                                break;
                            }
                            long j = iA;
                            if (cVar.skip(j) != j) {
                                Log.isLoggable("DfltImageHeaderParser", 3);
                            }
                        } else {
                            Log.isLoggable("DfltImageHeaderParser", 3);
                        }
                    }
                }
                iA = -1;
                break;
            }
            if (iA == -1) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            byte[] bArr = (byte[]) hVar.d(byte[].class, iA);
            try {
                return e(cVar, bArr, iA);
            } finally {
                hVar.h(bArr);
            }
        } catch (Reader.EndOfFileException unused) {
            return -1;
        }
    }
}
