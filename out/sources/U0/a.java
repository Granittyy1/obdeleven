package U0;

import J4.i;
import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import p005a4.q;

/* JADX INFO: compiled from: ExifInterface.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String[] f6068E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int[] f6069F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final byte[] f6070G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final d f6071H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final d[][] f6072I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final d[] f6073J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final HashMap<Integer, d>[] f6074K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final HashMap<String, d>[] f6075L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final Set<String> f6076M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final HashMap<Integer, Integer> f6077N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final Charset f6078O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final byte[] f6079P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final byte[] f6080Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileDescriptor f6095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AssetManager.AssetInputStream f6096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap<String, c>[] f6098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f6099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteOrder f6100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6102h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6103i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f6104k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f6105l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final boolean f6081m = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final List<Integer> f6082n = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final List<Integer> f6083o = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f6084p = {8, 8, 8};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f6085q = {8};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final byte[] f6086r = {-1, -40, -1};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final byte[] f6087s = {102, 116, 121, 112};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final byte[] f6088t = {109, 105, 102, 49};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final byte[] f6089u = {104, 101, 105, 99};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final byte[] f6090v = {97, 118, 105, 102};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final byte[] f6091w = {97, 118, 105, 115};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final byte[] f6092x = {79, 76, 89, 77, 80, 0};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final byte[] f6093y = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final byte[] f6094z = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final byte[] f6064A = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final byte[] f6065B = {82, 73, 70, 70};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final byte[] f6066C = {87, 69, 66, 80};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final byte[] f6067D = {69, 88, 73, 70};

    /* JADX INFO: compiled from: ExifInterface.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6114b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f6115c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f6116d;

        public c(byte[] bArr, int i10, int i11) {
            this(-1L, bArr, i10, i11);
        }

        public static c a(long j, ByteOrder byteOrder) {
            long[] jArr = {j};
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f6069F[4]]);
            byteBufferWrap.order(byteOrder);
            byteBufferWrap.putInt((int) jArr[0]);
            return new c(byteBufferWrap.array(), 4, 1);
        }

        public static c b(e eVar, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f6069F[5]]);
            byteBufferWrap.order(byteOrder);
            e eVar2 = new e[]{eVar}[0];
            byteBufferWrap.putInt((int) eVar2.f6121a);
            byteBufferWrap.putInt((int) eVar2.f6122b);
            return new c(byteBufferWrap.array(), 5, 1);
        }

        public static c c(int i10, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f6069F[3]]);
            byteBufferWrap.order(byteOrder);
            byteBufferWrap.putShort((short) new int[]{i10}[0]);
            return new c(byteBufferWrap.array(), 3, 1);
        }

        public final double d(ByteOrder byteOrder) throws Throwable {
            Object objG = g(byteOrder);
            if (objG == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objG instanceof String) {
                return Double.parseDouble((String) objG);
            }
            if (objG instanceof long[]) {
                long[] jArr = (long[]) objG;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objG instanceof int[]) {
                int[] iArr = (int[]) objG;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objG instanceof double[]) {
                double[] dArr = (double[]) objG;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objG instanceof e[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            e[] eVarArr = (e[]) objG;
            if (eVarArr.length != 1) {
                throw new NumberFormatException("There are more than one component");
            }
            e eVar = eVarArr[0];
            return eVar.f6121a / eVar.f6122b;
        }

        public final int e(ByteOrder byteOrder) throws Throwable {
            Object objG = g(byteOrder);
            if (objG == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objG instanceof String) {
                return Integer.parseInt((String) objG);
            }
            if (objG instanceof long[]) {
                long[] jArr = (long[]) objG;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objG instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objG;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public final String f(ByteOrder byteOrder) throws Throwable {
            Object objG = g(byteOrder);
            if (objG == null) {
                return null;
            }
            if (objG instanceof String) {
                return (String) objG;
            }
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            if (objG instanceof long[]) {
                long[] jArr = (long[]) objG;
                while (i10 < jArr.length) {
                    sb2.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (objG instanceof int[]) {
                int[] iArr = (int[]) objG;
                while (i10 < iArr.length) {
                    sb2.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (objG instanceof double[]) {
                double[] dArr = (double[]) objG;
                while (i10 < dArr.length) {
                    sb2.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (!(objG instanceof e[])) {
                return null;
            }
            e[] eVarArr = (e[]) objG;
            while (i10 < eVarArr.length) {
                sb2.append(eVarArr[i10].f6121a);
                sb2.append('/');
                sb2.append(eVarArr[i10].f6122b);
                i10++;
                if (i10 != eVarArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }

        /* JADX WARN: Type inference failed for: r15v20, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v21, types: [java.io.Serializable, long[]] */
        /* JADX WARN: Type inference failed for: r15v22, types: [U0.a$e[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v23, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v24, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v25, types: [U0.a$e[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v26, types: [double[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v27, types: [double[], java.io.Serializable] */
        public final Serializable g(ByteOrder byteOrder) throws Throwable {
            b bVar;
            byte b10;
            int length = 0;
            byte[] bArr = this.f6116d;
            b bVar2 = null;
            try {
                bVar = new b(bArr);
                try {
                    bVar.f6110d = byteOrder;
                    int i10 = this.f6113a;
                    int i11 = this.f6114b;
                    switch (i10) {
                        case 1:
                        case 6:
                            if (bArr.length != 1 || (b10 = bArr[0]) < 0 || b10 > 1) {
                                String str = new String(bArr, a.f6078O);
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e10) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                                }
                                return str;
                            }
                            String str2 = new String(new char[]{(char) (b10 + 48)});
                            try {
                                bVar.close();
                                break;
                            } catch (IOException e11) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                            }
                            return str2;
                        case 2:
                        case 7:
                            if (i11 >= a.f6070G.length) {
                                int i12 = 0;
                                while (true) {
                                    byte[] bArr2 = a.f6070G;
                                    if (i12 >= bArr2.length) {
                                        length = bArr2.length;
                                    } else if (bArr[i12] == bArr2[i12]) {
                                        i12++;
                                    }
                                }
                            }
                            StringBuilder sb2 = new StringBuilder();
                            try {
                                while (length < i11) {
                                    byte b11 = bArr[length];
                                    if (b11 == 0) {
                                        String string = sb2.toString();
                                        bVar.close();
                                        return string;
                                    }
                                    if (b11 >= 32) {
                                        sb2.append((char) b11);
                                    } else {
                                        sb2.append('?');
                                    }
                                    length++;
                                }
                                bVar.close();
                                break;
                            } catch (IOException e12) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                            }
                            String string2 = sb2.toString();
                            return string2;
                        case 3:
                            ?? r15 = new int[i11];
                            while (length < i11) {
                                r15[length] = bVar.readUnsignedShort();
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException e13) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e13);
                            }
                            return r15;
                        case 4:
                            ?? r16 = new long[i11];
                            while (length < i11) {
                                r16[length] = ((long) bVar.readInt()) & 4294967295L;
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException e14) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
                            }
                            return r16;
                        case 5:
                            ?? r17 = new e[i11];
                            while (length < i11) {
                                r17[length] = new e(((long) bVar.readInt()) & 4294967295L, ((long) bVar.readInt()) & 4294967295L);
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException e15) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                            }
                            return r17;
                        case 8:
                            ?? r18 = new int[i11];
                            while (length < i11) {
                                r18[length] = bVar.readShort();
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException e16) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e16);
                            }
                            return r18;
                        case 9:
                            ?? r19 = new int[i11];
                            while (length < i11) {
                                r19[length] = bVar.readInt();
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException e17) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e17);
                            }
                            return r19;
                        case 10:
                            ?? r110 = new e[i11];
                            while (length < i11) {
                                r110[length] = new e(bVar.readInt(), bVar.readInt());
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException e18) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e18);
                            }
                            return r110;
                        case 11:
                            ?? r111 = new double[i11];
                            while (length < i11) {
                                r111[length] = bVar.readFloat();
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException e19) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e19);
                            }
                            return r111;
                        case 12:
                            ?? r112 = new double[i11];
                            while (length < i11) {
                                r112[length] = bVar.readDouble();
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException e20) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e20);
                            }
                            return r112;
                        default:
                            try {
                                bVar.close();
                                break;
                            } catch (IOException e21) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e21);
                            }
                            return null;
                    }
                } catch (IOException unused) {
                    if (bVar != null) {
                        try {
                            bVar.close();
                        } catch (IOException e22) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e22);
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                    if (bVar2 != null) {
                        try {
                            bVar2.close();
                        } catch (IOException e23) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e23);
                        }
                    }
                    throw th;
                }
            } catch (IOException unused2) {
                bVar = null;
            } catch (Throwable th2) {
                th = th2;
            }
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("(");
            sb2.append(a.f6068E[this.f6113a]);
            sb2.append(", data length:");
            return q.c(sb2, this.f6116d.length, ")");
        }

        public c(long j, byte[] bArr, int i10, int i11) {
            this.f6113a = i10;
            this.f6114b = i11;
            this.f6115c = j;
            this.f6116d = bArr;
        }
    }

    /* JADX INFO: compiled from: ExifInterface.java */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f6121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f6122b;

        public e(long j, long j10) {
            if (j10 == 0) {
                this.f6121a = 0L;
                this.f6122b = 1L;
            } else {
                this.f6121a = j;
                this.f6122b = j10;
            }
        }

        public final String toString() {
            return this.f6121a + "/" + this.f6122b;
        }
    }

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f6068E = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f6069F = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f6070G = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f6071H = new d("StripOffsets", 273, 3);
        f6072I = new d[][]{dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, new d[]{new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        f6073J = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        f6074K = new HashMap[10];
        f6075L = new HashMap[10];
        f6076M = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        f6077N = new HashMap<>();
        Charset charsetForName = Charset.forName("US-ASCII");
        f6078O = charsetForName;
        f6079P = "Exif\u0000\u0000".getBytes(charsetForName);
        f6080Q = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            d[][] dVarArr6 = f6072I;
            if (i10 >= dVarArr6.length) {
                HashMap<Integer, Integer> map = f6077N;
                d[] dVarArr7 = f6073J;
                map.put(Integer.valueOf(dVarArr7[0].f6117a), 5);
                map.put(Integer.valueOf(dVarArr7[1].f6117a), 1);
                map.put(Integer.valueOf(dVarArr7[2].f6117a), 2);
                map.put(Integer.valueOf(dVarArr7[3].f6117a), 3);
                map.put(Integer.valueOf(dVarArr7[4].f6117a), 7);
                map.put(Integer.valueOf(dVarArr7[5].f6117a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f6074K[i10] = new HashMap<>();
            f6075L[i10] = new HashMap<>();
            for (d dVar : dVarArr6[i10]) {
                f6074K[i10].put(Integer.valueOf(dVar.f6117a), dVar);
                f6075L[i10].put(dVar.f6118b, dVar);
            }
            i10++;
        }
    }

    public a(InputStream inputStream) throws Throwable {
        d[][] dVarArr = f6072I;
        this.f6098d = new HashMap[dVarArr.length];
        this.f6099e = new HashSet(dVarArr.length);
        this.f6100f = ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            throw new NullPointerException("inputStream cannot be null");
        }
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f6096b = (AssetManager.AssetInputStream) inputStream;
            this.f6095a = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.f6096b = null;
                this.f6095a = fileInputStream.getFD();
            } catch (Exception unused) {
                this.f6096b = null;
                this.f6095a = null;
            }
        } else {
            this.f6096b = null;
            this.f6095a = null;
        }
        boolean z10 = f6081m;
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            try {
                this.f6098d[i10] = new HashMap<>();
            } catch (IOException | UnsupportedOperationException unused2) {
                a();
                if (!z10) {
                    return;
                }
            } catch (Throwable th) {
                a();
                if (z10) {
                    q();
                }
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS);
        int iG = g(bufferedInputStream);
        this.f6097c = iG;
        if (iG == 4 || iG == 9 || iG == 13 || iG == 14) {
            b bVar = new b(bufferedInputStream);
            int i11 = this.f6097c;
            if (i11 == 4) {
                f(bVar, 0, 0);
            } else if (i11 == 13) {
                i(bVar);
            } else if (i11 == 9) {
                j(bVar);
            } else if (i11 == 14) {
                m(bVar);
            }
        } else {
            f fVar = new f(bufferedInputStream);
            int i12 = this.f6097c;
            if (i12 == 12 || i12 == 15) {
                e(fVar, i12);
            } else if (i12 == 7) {
                h(fVar);
            } else if (i12 == 10) {
                l(fVar);
            } else {
                k(fVar);
            }
            fVar.c(this.f6102h);
            v(fVar);
        }
        a();
        if (!z10) {
            return;
        }
        q();
    }

    public static ByteOrder r(b bVar) throws IOException {
        short s10 = bVar.readShort();
        if (s10 == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s10 == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s10));
    }

    public final void a() {
        String strB = b("DateTimeOriginal");
        HashMap<String, c>[] mapArr = this.f6098d;
        if (strB != null && b("DateTime") == null) {
            HashMap<String, c> map = mapArr[0];
            byte[] bytes = strB.concat("\u0000").getBytes(f6078O);
            map.put("DateTime", new c(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", c.a(0L, this.f6100f));
        }
        if (b("ImageLength") == null) {
            mapArr[0].put("ImageLength", c.a(0L, this.f6100f));
        }
        if (b("Orientation") == null) {
            mapArr[0].put("Orientation", c.a(0L, this.f6100f));
        }
        if (b("LightSource") == null) {
            mapArr[1].put("LightSource", c.a(0L, this.f6100f));
        }
    }

    public final String b(String str) {
        c cVarD = d(str);
        if (cVarD == null) {
            return null;
        }
        if (!str.equals("GPSTimeStamp")) {
            if (!f6076M.contains(str)) {
                return cVarD.f(this.f6100f);
            }
            try {
                return Double.toString(cVarD.d(this.f6100f));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        int i10 = cVarD.f6113a;
        if (i10 != 5 && i10 != 10) {
            return null;
        }
        e[] eVarArr = (e[]) cVarD.g(this.f6100f);
        if (eVarArr == null || eVarArr.length != 3) {
            Arrays.toString(eVarArr);
            return null;
        }
        e eVar = eVarArr[0];
        Integer numValueOf = Integer.valueOf((int) (eVar.f6121a / eVar.f6122b));
        e eVar2 = eVarArr[1];
        Integer numValueOf2 = Integer.valueOf((int) (eVar2.f6121a / eVar2.f6122b));
        e eVar3 = eVarArr[2];
        return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (eVar3.f6121a / eVar3.f6122b)));
    }

    public final int c(int i10, String str) {
        c cVarD = d(str);
        if (cVarD == null) {
            return i10;
        }
        try {
            return cVarD.e(this.f6100f);
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    public final c d(String str) {
        c cVar;
        int i10;
        c cVar2;
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i10 = this.f6097c) != 4 && ((i10 == 9 || i10 == 15 || i10 == 12 || i10 == 13) && (cVar2 = this.f6105l) != null)) {
            return cVar2;
        }
        for (int i11 = 0; i11 < f6072I.length; i11++) {
            c cVar3 = this.f6098d[i11].get(str);
            if (cVar3 != null) {
                return cVar3;
            }
        }
        if (!"Xmp".equals(str) || (cVar = this.f6105l) == null) {
            return null;
        }
        return cVar;
    }

    public final void e(f fVar, int i10) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i11;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
        }
        if (i10 == 15 && i12 < 31) {
            throw new UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new C0083a(fVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap<String, c>[] mapArr = this.f6098d;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", c.c(Integer.parseInt(strExtractMetadata), this.f6100f));
                }
                if (strExtractMetadata3 != null) {
                    mapArr[0].put("ImageLength", c.c(Integer.parseInt(strExtractMetadata3), this.f6100f));
                }
                if (strExtractMetadata2 != null) {
                    int i13 = Integer.parseInt(strExtractMetadata2);
                    if (i13 == 90) {
                        i11 = 6;
                    } else if (i13 != 180) {
                        i11 = i13 != 270 ? 1 : 8;
                    } else {
                        i11 = 3;
                    }
                    mapArr[0].put("Orientation", c.c(i11, this.f6100f));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i14 = Integer.parseInt(strExtractMetadata4);
                    int i15 = Integer.parseInt(strExtractMetadata5);
                    if (i15 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.c(i14);
                    byte[] bArr = new byte[6];
                    fVar.readFully(bArr);
                    int i16 = i14 + 6;
                    int i17 = i15 - 6;
                    if (!Arrays.equals(bArr, f6079P)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i17];
                    fVar.readFully(bArr2);
                    this.f6102h = i16;
                    s(0, bArr2);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i18 = Integer.parseInt(strExtractMetadata8);
                    int i19 = Integer.parseInt(strExtractMetadata9);
                    long j = i18;
                    fVar.c(j);
                    byte[] bArr3 = new byte[i19];
                    fVar.readFully(bArr3);
                    this.f6105l = new c(j, bArr3, 1, i19);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e10) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e10);
            }
        } catch (Throwable th) {
            try {
                mediaMetadataRetriever.release();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006b A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0115 A[LOOP:0: B:10:0x0024->B:55:0x0115, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x011b A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x005d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0060. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0063. Please report as an issue. */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void f(U0.a.b r21, int r22, int r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.a.f(U0.a$b, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0143 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:112:0x0146  */
    /* JADX WARN: Code duplicated, block: B:115:0x014c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0154 A[LOOP:2: B:113:0x0147->B:118:0x0154, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:121:0x015a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:123:0x015d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0163  */
    /* JADX WARN: Code duplicated, block: B:129:0x016b A[LOOP:3: B:124:0x015e->B:129:0x016b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:133:0x0174  */
    /* JADX WARN: Code duplicated, block: B:136:0x017e A[LOOP:4: B:131:0x016f->B:136:0x017e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:139:0x0184 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:157:0x010f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x00d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x016e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x0169 A[EDGE_INSN: B:169:0x0169->B:128:0x0169 BREAK  A[LOOP:3: B:124:0x015e->B:129:0x016b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x0169 A[EDGE_INSN: B:171:0x0169->B:128:0x0169 BREAK  A[LOOP:3: B:124:0x015e->B:129:0x016b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00d5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:88:0x010d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:94:0x0124  */
    /* JADX WARN: Code duplicated, block: B:95:0x0126  */
    public final int g(BufferedInputStream bufferedInputStream) throws Throwable {
        b bVar;
        b bVar2;
        int i10;
        b bVar3;
        b bVar4;
        boolean z10;
        b bVar5;
        b bVar6;
        boolean z11;
        int i11;
        byte[] bArr;
        boolean z12;
        int i12;
        byte[] bArr2;
        int i13;
        byte[] bArr3;
        boolean z13;
        b bVar7;
        short s10;
        long j;
        bufferedInputStream.mark(InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS);
        byte[] bArr4 = new byte[InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i14 = 0;
        while (true) {
            byte[] bArr5 = f6086r;
            if (i14 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i14] != bArr5[i14]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i15 = 0; i15 < bytes.length; i15++) {
                    if (bArr4[i15] != bytes[i15]) {
                        try {
                            bVar2 = new b(bArr4);
                            try {
                                long j10 = bVar2.readInt();
                                byte[] bArr6 = new byte[4];
                                bVar2.readFully(bArr6);
                                if (Arrays.equals(bArr6, f6087s)) {
                                    if (j10 == 1) {
                                        j10 = bVar2.readLong();
                                        j = 16;
                                        if (j10 < 16) {
                                        }
                                    } else {
                                        j = 8;
                                    }
                                    long j11 = InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS;
                                    if (j10 > j11) {
                                        j10 = j11;
                                    }
                                    long j12 = j10 - j;
                                    if (j12 >= 8) {
                                        byte[] bArr7 = new byte[4];
                                        long j13 = 0;
                                        boolean z14 = false;
                                        boolean z15 = false;
                                        boolean z16 = false;
                                        while (true) {
                                            if (j13 < j12 / 4) {
                                                try {
                                                    bVar2.readFully(bArr7);
                                                    if (j13 != 1) {
                                                        if (Arrays.equals(bArr7, f6088t)) {
                                                            z14 = true;
                                                        } else if (Arrays.equals(bArr7, f6089u)) {
                                                            z15 = true;
                                                        } else if (Arrays.equals(bArr7, f6090v) || Arrays.equals(bArr7, f6091w)) {
                                                            z16 = true;
                                                        }
                                                        if (z14) {
                                                            if (z15) {
                                                                bVar2.close();
                                                                i10 = 12;
                                                            } else if (z16) {
                                                                bVar2.close();
                                                                i10 = 15;
                                                            }
                                                            if (i10 != 0) {
                                                                return i10;
                                                            }
                                                            try {
                                                                bVar4 = new b(bArr4);
                                                                try {
                                                                    ByteOrder byteOrderR = r(bVar4);
                                                                    this.f6100f = byteOrderR;
                                                                    bVar4.f6110d = byteOrderR;
                                                                    s10 = bVar4.readShort();
                                                                    if (s10 != 20306 || s10 == 21330) {
                                                                        z10 = true;
                                                                    } else {
                                                                        z10 = false;
                                                                    }
                                                                    bVar4.close();
                                                                } catch (Exception unused) {
                                                                    if (bVar4 != null) {
                                                                        bVar4.close();
                                                                    }
                                                                    z10 = false;
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    bVar3 = bVar4;
                                                                    if (bVar3 != null) {
                                                                        bVar3.close();
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (Exception unused2) {
                                                                bVar4 = null;
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                bVar3 = null;
                                                            }
                                                            if (z10) {
                                                                return 7;
                                                            }
                                                            try {
                                                                bVar7 = new b(bArr4);
                                                                try {
                                                                    ByteOrder byteOrderR2 = r(bVar7);
                                                                    this.f6100f = byteOrderR2;
                                                                    bVar7.f6110d = byteOrderR2;
                                                                    if (bVar7.readShort() == 85) {
                                                                        z11 = true;
                                                                    } else {
                                                                        z11 = false;
                                                                    }
                                                                    bVar7.close();
                                                                } catch (Exception unused3) {
                                                                    bVar6 = bVar7;
                                                                    if (bVar6 != null) {
                                                                        bVar6.close();
                                                                    }
                                                                    z11 = false;
                                                                } catch (Throwable th3) {
                                                                    th = th3;
                                                                    bVar5 = bVar7;
                                                                    if (bVar5 != null) {
                                                                        bVar5.close();
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (Exception unused4) {
                                                                bVar6 = null;
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                bVar5 = null;
                                                            }
                                                            if (z11) {
                                                                return 10;
                                                            }
                                                            i11 = 0;
                                                            while (true) {
                                                                bArr = f6094z;
                                                                if (i11 >= bArr.length) {
                                                                    z12 = true;
                                                                    break;
                                                                }
                                                                if (bArr4[i11] != bArr[i11]) {
                                                                    z12 = false;
                                                                    break;
                                                                }
                                                                i11++;
                                                            }
                                                            if (z12) {
                                                                return 13;
                                                            }
                                                            i12 = 0;
                                                            while (true) {
                                                                bArr2 = f6065B;
                                                                if (i12 >= bArr2.length) {
                                                                    i13 = 0;
                                                                    while (true) {
                                                                        bArr3 = f6066C;
                                                                        if (i13 >= bArr3.length) {
                                                                            z13 = true;
                                                                            break;
                                                                        }
                                                                        if (bArr4[bArr2.length + i13 + 4] != bArr3[i13]) {
                                                                            break;
                                                                        }
                                                                        i13++;
                                                                    }
                                                                    if (z13) {
                                                                        return 14;
                                                                    }
                                                                    return 0;
                                                                }
                                                                if (bArr4[i12] != bArr2[i12]) {
                                                                    break;
                                                                }
                                                                i12++;
                                                            }
                                                            z13 = false;
                                                            if (z13) {
                                                                return 14;
                                                            }
                                                            return 0;
                                                        }
                                                        continue;
                                                    }
                                                    j13++;
                                                } catch (EOFException unused5) {
                                                    bVar2.close();
                                                    i10 = 0;
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Exception unused6) {
                                if (bVar2 != null) {
                                }
                                i10 = 0;
                                if (i10 != 0) {
                                    return i10;
                                }
                                bVar4 = new b(bArr4);
                                ByteOrder byteOrderR3 = r(bVar4);
                                this.f6100f = byteOrderR3;
                                bVar4.f6110d = byteOrderR3;
                                s10 = bVar4.readShort();
                                if (s10 != 20306) {
                                    z10 = true;
                                } else {
                                    z10 = true;
                                }
                                bVar4.close();
                                if (z10) {
                                    return 7;
                                }
                                bVar7 = new b(bArr4);
                                ByteOrder byteOrderR4 = r(bVar7);
                                this.f6100f = byteOrderR4;
                                bVar7.f6110d = byteOrderR4;
                                if (bVar7.readShort() == 85) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                bVar7.close();
                                if (z11) {
                                    return 10;
                                }
                                i11 = 0;
                                while (true) {
                                    bArr = f6094z;
                                    if (i11 >= bArr.length) {
                                        z12 = true;
                                        break;
                                    }
                                    if (bArr4[i11] != bArr[i11]) {
                                        z12 = false;
                                        break;
                                    }
                                    i11++;
                                }
                                if (z12) {
                                    return 13;
                                }
                                i12 = 0;
                                while (true) {
                                    bArr2 = f6065B;
                                    if (i12 >= bArr2.length) {
                                        i13 = 0;
                                        while (true) {
                                            bArr3 = f6066C;
                                            if (i13 >= bArr3.length) {
                                                z13 = true;
                                                break;
                                            }
                                            if (bArr4[bArr2.length + i13 + 4] != bArr3[i13]) {
                                                break;
                                                break;
                                            }
                                            i13++;
                                        }
                                        if (z13) {
                                            return 14;
                                        }
                                        return 0;
                                    }
                                    if (bArr4[i12] != bArr2[i12]) {
                                        break;
                                        break;
                                    }
                                    i12++;
                                }
                                z13 = false;
                                if (z13) {
                                    return 14;
                                }
                                return 0;
                            } catch (Throwable th5) {
                                th = th5;
                                bVar = bVar2;
                                if (bVar != null) {
                                    bVar.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused7) {
                            bVar2 = null;
                        } catch (Throwable th6) {
                            th = th6;
                            bVar = null;
                        }
                        bVar2.close();
                        i10 = 0;
                        if (i10 != 0) {
                            return i10;
                        }
                        bVar4 = new b(bArr4);
                        ByteOrder byteOrderR5 = r(bVar4);
                        this.f6100f = byteOrderR5;
                        bVar4.f6110d = byteOrderR5;
                        s10 = bVar4.readShort();
                        if (s10 != 20306) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        bVar4.close();
                        if (z10) {
                            return 7;
                        }
                        bVar7 = new b(bArr4);
                        ByteOrder byteOrderR6 = r(bVar7);
                        this.f6100f = byteOrderR6;
                        bVar7.f6110d = byteOrderR6;
                        if (bVar7.readShort() == 85) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        bVar7.close();
                        if (z11) {
                            return 10;
                        }
                        i11 = 0;
                        while (true) {
                            bArr = f6094z;
                            if (i11 >= bArr.length) {
                                z12 = true;
                                break;
                            }
                            if (bArr4[i11] != bArr[i11]) {
                                z12 = false;
                                break;
                            }
                            i11++;
                        }
                        if (z12) {
                            return 13;
                        }
                        i12 = 0;
                        while (true) {
                            bArr2 = f6065B;
                            if (i12 >= bArr2.length) {
                                i13 = 0;
                                while (true) {
                                    bArr3 = f6066C;
                                    if (i13 >= bArr3.length) {
                                        z13 = true;
                                        break;
                                    }
                                    if (bArr4[bArr2.length + i13 + 4] != bArr3[i13]) {
                                        break;
                                        break;
                                    }
                                    i13++;
                                }
                                if (z13) {
                                    return 14;
                                }
                                return 0;
                            }
                            if (bArr4[i12] != bArr2[i12]) {
                                break;
                                break;
                            }
                            i12++;
                        }
                        z13 = false;
                        if (z13) {
                            return 14;
                        }
                        return 0;
                    }
                }
                return 9;
            }
            i14++;
        }
    }

    public final void h(f fVar) throws Throwable {
        int i10;
        int i11;
        k(fVar);
        HashMap<String, c>[] mapArr = this.f6098d;
        c cVar = mapArr[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f6116d);
            fVar2.f6110d = this.f6100f;
            byte[] bArr = f6092x;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.c(0L);
            byte[] bArr3 = f6093y;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.c(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.c(12L);
            }
            t(fVar2, 6);
            c cVar2 = mapArr[7].get("PreviewImageStart");
            c cVar3 = mapArr[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", cVar2);
                mapArr[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = mapArr[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.g(this.f6100f);
                if (iArr == null || iArr.length != 4) {
                    Arrays.toString(iArr);
                    return;
                }
                int i12 = iArr[2];
                int i13 = iArr[0];
                if (i12 <= i13 || (i10 = iArr[3]) <= (i11 = iArr[1])) {
                    return;
                }
                int i14 = (i12 - i13) + 1;
                int i15 = (i10 - i11) + 1;
                if (i14 < i15) {
                    int i16 = i14 + i15;
                    i15 = i16 - i15;
                    i14 = i16 - i15;
                }
                c cVarC = c.c(i14, this.f6100f);
                c cVarC2 = c.c(i15, this.f6100f);
                mapArr[0].put("ImageWidth", cVarC);
                mapArr[0].put("ImageLength", cVarC2);
            }
        }
    }

    public final void i(b bVar) throws Throwable {
        if (f6081m) {
            Objects.toString(bVar);
        }
        bVar.f6110d = ByteOrder.BIG_ENDIAN;
        int i10 = bVar.f6109c;
        bVar.b(f6094z.length);
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            if (z10 && z11) {
                return;
            }
            try {
                int i11 = bVar.readInt();
                int i12 = bVar.readInt();
                int i13 = bVar.f6109c;
                int i14 = i13 + i11 + 4;
                int i15 = i13 - i10;
                if (i15 == 16 && i12 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (i12 == 1229278788) {
                    return;
                }
                if (i12 == 1700284774 && !z10) {
                    this.f6102h = i15;
                    byte[] bArr = new byte[i11];
                    bVar.readFully(bArr);
                    int i16 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(i12 >>> 24);
                    crc32.update(i12 >>> 16);
                    crc32.update(i12 >>> 8);
                    crc32.update(i12);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != i16) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i16 + ", calculated CRC value: " + crc32.getValue());
                    }
                    s(0, bArr);
                    y();
                    v(new b(bArr));
                    z10 = true;
                } else if (i12 == 1767135348 && !z11) {
                    byte[] bArr2 = f6064A;
                    if (i11 >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        bVar.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i17 = bVar.f6109c - i10;
                            int i18 = i11 - length;
                            byte[] bArr4 = new byte[i18];
                            bVar.readFully(bArr4);
                            this.f6105l = new c(i17, bArr4, 1, i18);
                            z11 = true;
                        }
                    }
                }
                bVar.b(i14 - bVar.f6109c);
            } catch (EOFException e10) {
                throw new IOException("Encountered corrupt PNG file.", e10);
            }
        }
    }

    public final void j(b bVar) throws Throwable {
        if (f6081m) {
            Objects.toString(bVar);
        }
        bVar.b(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.b(i10 - bVar.f6109c);
        bVar.readFully(bArr4);
        f(new b(bArr4), i10, 5);
        bVar.b(i12 - bVar.f6109c);
        bVar.f6110d = ByteOrder.BIG_ENDIAN;
        int i13 = bVar.readInt();
        for (int i14 = 0; i14 < i13; i14++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == f6071H.f6117a) {
                short s10 = bVar.readShort();
                short s11 = bVar.readShort();
                c cVarC = c.c(s10, this.f6100f);
                c cVarC2 = c.c(s11, this.f6100f);
                HashMap<String, c>[] mapArr = this.f6098d;
                mapArr[0].put("ImageLength", cVarC);
                mapArr[0].put("ImageWidth", cVarC2);
                return;
            }
            bVar.b(unsignedShort2);
        }
    }

    public final void k(f fVar) throws Throwable {
        p(fVar);
        t(fVar, 0);
        x(fVar, 0);
        x(fVar, 5);
        x(fVar, 4);
        y();
        if (this.f6097c == 8) {
            HashMap<String, c>[] mapArr = this.f6098d;
            c cVar = mapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.f6116d);
                fVar2.f6110d = this.f6100f;
                fVar2.b(6);
                t(fVar2, 9);
                c cVar2 = mapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    mapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final void l(f fVar) throws Throwable {
        if (f6081m) {
            Objects.toString(fVar);
        }
        k(fVar);
        HashMap<String, c>[] mapArr = this.f6098d;
        c cVar = mapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            f(new b(cVar.f6116d), (int) cVar.f6115c, 5);
        }
        c cVar2 = mapArr[0].get("ISO");
        c cVar3 = mapArr[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", cVar2);
    }

    public final void m(b bVar) throws Throwable {
        if (f6081m) {
            Objects.toString(bVar);
        }
        bVar.f6110d = ByteOrder.LITTLE_ENDIAN;
        bVar.b(f6065B.length);
        int i10 = bVar.readInt() + 8;
        byte[] bArr = f6066C;
        bVar.b(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i11 = bVar.readInt();
                int i12 = length + 8;
                if (Arrays.equals(f6067D, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i11];
                    bVar.readFully(bArrCopyOfRange);
                    byte[] bArr3 = f6079P;
                    if (F8.a.j(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i11);
                    }
                    this.f6102h = i12;
                    s(0, bArrCopyOfRange);
                    v(new b(bArrCopyOfRange));
                    return;
                }
                if (i11 % 2 == 1) {
                    i11++;
                }
                length = i12 + i11;
                if (length == i10) {
                    return;
                }
                if (length > i10) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.b(i11);
            } catch (EOFException e10) {
                throw new IOException("Encountered corrupt WebP file.", e10);
            }
        }
    }

    public final void n(b bVar, HashMap<String, c> map) throws Throwable {
        c cVar = map.get("JPEGInterchangeFormat");
        c cVar2 = map.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int iE = cVar.e(this.f6100f);
        int iE2 = cVar2.e(this.f6100f);
        if (this.f6097c == 7) {
            iE += this.f6103i;
        }
        if (iE <= 0 || iE2 <= 0 || this.f6096b != null || this.f6095a != null) {
            return;
        }
        bVar.b(iE);
        bVar.readFully(new byte[iE2]);
    }

    public final boolean o(HashMap<String, c> map) {
        c cVar = map.get("ImageLength");
        c cVar2 = map.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.e(this.f6100f) <= 512 && cVar2.e(this.f6100f) <= 512;
    }

    public final void p(f fVar) throws IOException {
        ByteOrder byteOrderR = r(fVar);
        this.f6100f = byteOrderR;
        fVar.f6110d = byteOrderR;
        int unsignedShort = fVar.readUnsignedShort();
        int i10 = this.f6097c;
        if (i10 != 7 && i10 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i11 = fVar.readInt();
        if (i11 < 8) {
            throw new IOException(i.b(i11, "Invalid first Ifd offset: "));
        }
        int i12 = i11 - 8;
        if (i12 > 0) {
            fVar.b(i12);
        }
    }

    public final void q() throws Throwable {
        int i10 = 0;
        while (true) {
            HashMap<String, c>[] mapArr = this.f6098d;
            if (i10 >= mapArr.length) {
                return;
            }
            mapArr[i10].size();
            for (Map.Entry<String, c> entry : mapArr[i10].entrySet()) {
                c value = entry.getValue();
                entry.getKey();
                value.toString();
                value.f(this.f6100f);
            }
            i10++;
        }
    }

    public final void s(int i10, byte[] bArr) throws IOException {
        f fVar = new f(bArr);
        p(fVar);
        t(fVar, i10);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:98:0x0180  */
    public final void t(f fVar, int i10) throws IOException {
        HashMap<String, c>[] mapArr;
        boolean z10;
        long j;
        boolean z11;
        HashSet hashSet;
        long j10;
        int unsignedShort;
        long j11;
        int i11;
        int i12;
        Integer numValueOf = Integer.valueOf(fVar.f6109c);
        HashSet hashSet2 = this.f6099e;
        hashSet2.add(numValueOf);
        short s10 = fVar.readShort();
        if (s10 <= 0) {
            return;
        }
        short s11 = 0;
        while (true) {
            mapArr = this.f6098d;
            z10 = f6081m;
            if (s11 >= s10) {
                break;
            }
            int unsignedShort2 = fVar.readUnsignedShort();
            int unsignedShort3 = fVar.readUnsignedShort();
            int i13 = fVar.readInt();
            short s12 = s11;
            long j12 = ((long) fVar.f6109c) + 4;
            d dVar = f6074K[i10].get(Integer.valueOf(unsignedShort2));
            if (z10) {
                String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i10), Integer.valueOf(unsignedShort2), dVar != null ? dVar.f6118b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i13));
            }
            if (dVar != null && unsignedShort3 > 0) {
                int[] iArr = f6069F;
                if (unsignedShort3 < iArr.length) {
                    int i14 = dVar.f6119c;
                    if (i14 == 7 || unsignedShort3 == 7 || i14 == unsignedShort3 || (i12 = dVar.f6120d) == unsignedShort3 || (((i14 == 4 || i12 == 4) && unsignedShort3 == 3) || (((i14 == 9 || i12 == 9) && unsignedShort3 == 8) || ((i14 == 12 || i12 == 12) && unsignedShort3 == 11)))) {
                        if (unsignedShort3 == 7) {
                            unsignedShort3 = i14;
                        }
                        j = ((long) i13) * ((long) iArr[unsignedShort3]);
                        z11 = j >= 0 && j <= 2147483647L;
                    } else {
                        if (z10) {
                            String str = f6068E[unsignedShort3];
                        }
                        j = 0;
                    }
                } else {
                    j = 0;
                }
            } else {
                j = 0;
            }
            if (z11) {
                if (j > 4) {
                    int i15 = fVar.readInt();
                    if (this.f6097c == 7) {
                        if ("MakerNote".equals(dVar.f6118b)) {
                            this.f6103i = i15;
                        } else if (i10 == 6 && "ThumbnailImage".equals(dVar.f6118b)) {
                            this.j = i15;
                            this.f6104k = i13;
                            c cVarC = c.c(6, this.f6100f);
                            c cVarA = c.a(this.j, this.f6100f);
                            c cVarA2 = c.a(this.f6104k, this.f6100f);
                            mapArr[4].put("Compression", cVarC);
                            mapArr[4].put("JPEGInterchangeFormat", cVarA);
                            mapArr[4].put("JPEGInterchangeFormatLength", cVarA2);
                        }
                    }
                    fVar.c(i15);
                } else {
                    i13 = i13;
                }
                Integer num = f6077N.get(Integer.valueOf(unsignedShort2));
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == 4) {
                            j11 = ((long) fVar.readInt()) & 4294967295L;
                        } else if (unsignedShort3 == 8) {
                            unsignedShort = fVar.readShort();
                        } else if (unsignedShort3 == 9 || unsignedShort3 == 13) {
                            unsignedShort = fVar.readInt();
                        } else {
                            j11 = -1;
                        }
                        if (z10) {
                            String.format("Offset: %d, tagName: %s", Long.valueOf(j11), dVar.f6118b);
                        }
                        if (j11 > 0 || ((i11 = fVar.f6112f) != -1 && j11 >= i11)) {
                            hashSet = hashSet2;
                        } else {
                            hashSet = hashSet2;
                            if (!hashSet.contains(Integer.valueOf((int) j11))) {
                                fVar.c(j11);
                                t(fVar, num.intValue());
                            }
                        }
                        fVar.c(j12);
                    } else {
                        unsignedShort = fVar.readUnsignedShort();
                    }
                    j11 = unsignedShort;
                    if (z10) {
                        String.format("Offset: %d, tagName: %s", Long.valueOf(j11), dVar.f6118b);
                    }
                    if (j11 > 0) {
                        hashSet = hashSet2;
                    } else {
                        hashSet = hashSet2;
                    }
                    fVar.c(j12);
                } else {
                    hashSet = hashSet2;
                    int i16 = fVar.f6109c + this.f6102h;
                    byte[] bArr = new byte[(int) j10];
                    fVar.readFully(bArr);
                    c cVar = new c(i16, bArr, unsignedShort3, i13);
                    mapArr[i10].put(dVar.f6118b, cVar);
                    String str2 = dVar.f6118b;
                    if ("DNGVersion".equals(str2)) {
                        j10 = j;
                        this.f6097c = 3;
                    }
                    j10 = j;
                    if ((("Make".equals(str2) || "Model".equals(str2)) && cVar.f(this.f6100f).contains("PENTAX")) || ("Compression".equals(str2) && cVar.e(this.f6100f) == 65535)) {
                        this.f6097c = 8;
                    }
                    if (fVar.f6109c != j12) {
                        fVar.c(j12);
                    }
                }
            } else {
                fVar.c(j12);
                hashSet = hashSet2;
            }
            s11 = (short) (s12 + 1);
            hashSet2 = hashSet;
            s10 = s10;
        }
        HashSet hashSet3 = hashSet2;
        int i17 = fVar.readInt();
        if (z10) {
            String.format("nextIfdOffset: %d", Integer.valueOf(i17));
        }
        long j13 = i17;
        if (j13 <= 0 || hashSet3.contains(Integer.valueOf(i17))) {
            return;
        }
        fVar.c(j13);
        if (mapArr[4].isEmpty()) {
            t(fVar, 4);
        } else if (mapArr[5].isEmpty()) {
            t(fVar, 5);
        }
    }

    public final void u(int i10, String str, String str2) {
        HashMap<String, c>[] mapArr = this.f6098d;
        if (mapArr[i10].isEmpty() || mapArr[i10].get(str) == null) {
            return;
        }
        HashMap<String, c> map = mapArr[i10];
        map.put(str2, map.get(str));
        mapArr[i10].remove(str);
    }

    public final void v(b bVar) throws Throwable {
        c cVar;
        HashMap<String, c> map = this.f6098d[4];
        c cVar2 = map.get("Compression");
        if (cVar2 == null) {
            n(bVar, map);
            return;
        }
        int iE = cVar2.e(this.f6100f);
        if (iE != 1) {
            if (iE == 6) {
                n(bVar, map);
                return;
            } else if (iE != 7) {
                return;
            }
        }
        c cVar3 = map.get("BitsPerSample");
        if (cVar3 != null) {
            int[] iArr = (int[]) cVar3.g(this.f6100f);
            int[] iArr2 = f6084p;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.f6097c != 3 || (cVar = map.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int iE2 = cVar.e(this.f6100f);
                if ((iE2 != 1 || !Arrays.equals(iArr, f6085q)) && (iE2 != 6 || !Arrays.equals(iArr, iArr2))) {
                    return;
                }
            }
            c cVar4 = map.get("StripOffsets");
            c cVar5 = map.get("StripByteCounts");
            if (cVar4 == null || cVar5 == null) {
                return;
            }
            long[] jArrC = F8.a.c(cVar4.g(this.f6100f));
            long[] jArrC2 = F8.a.c(cVar5.g(this.f6100f));
            if (jArrC == null || jArrC.length == 0 || jArrC2 == null || jArrC2.length == 0 || jArrC.length != jArrC2.length) {
                return;
            }
            long j = 0;
            for (long j10 : jArrC2) {
                j += j10;
            }
            byte[] bArr = new byte[(int) j];
            this.f6101g = true;
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < jArrC.length; i12++) {
                int i13 = (int) jArrC[i12];
                int i14 = (int) jArrC2[i12];
                if (i12 < jArrC.length - 1 && i13 + i14 != jArrC[i12 + 1]) {
                    this.f6101g = false;
                }
                int i15 = i13 - i10;
                if (i15 < 0) {
                    return;
                }
                try {
                    bVar.b(i15);
                    int i16 = i10 + i15;
                    byte[] bArr2 = new byte[i14];
                    bVar.readFully(bArr2);
                    i10 = i16 + i14;
                    System.arraycopy(bArr2, 0, bArr, i11, i14);
                    i11 += i14;
                } catch (EOFException unused) {
                    return;
                }
            }
            if (this.f6101g) {
                long j11 = jArrC[0];
            }
        }
    }

    public final void w(int i10, int i11) throws Throwable {
        HashMap<String, c>[] mapArr = this.f6098d;
        if (mapArr[i10].isEmpty() || mapArr[i11].isEmpty()) {
            return;
        }
        c cVar = mapArr[i10].get("ImageLength");
        c cVar2 = mapArr[i10].get("ImageWidth");
        c cVar3 = mapArr[i11].get("ImageLength");
        c cVar4 = mapArr[i11].get("ImageWidth");
        if (cVar == null || cVar2 == null || cVar3 == null || cVar4 == null) {
            return;
        }
        int iE = cVar.e(this.f6100f);
        int iE2 = cVar2.e(this.f6100f);
        int iE3 = cVar3.e(this.f6100f);
        int iE4 = cVar4.e(this.f6100f);
        if (iE >= iE3 || iE2 >= iE4) {
            return;
        }
        HashMap<String, c> map = mapArr[i10];
        mapArr[i10] = mapArr[i11];
        mapArr[i11] = map;
    }

    public final void x(f fVar, int i10) throws Throwable {
        c cVarC;
        c cVarC2;
        HashMap<String, c>[] mapArr = this.f6098d;
        c cVar = mapArr[i10].get("DefaultCropSize");
        c cVar2 = mapArr[i10].get("SensorTopBorder");
        c cVar3 = mapArr[i10].get("SensorLeftBorder");
        c cVar4 = mapArr[i10].get("SensorBottomBorder");
        c cVar5 = mapArr[i10].get("SensorRightBorder");
        if (cVar != null) {
            if (cVar.f6113a == 5) {
                e[] eVarArr = (e[]) cVar.g(this.f6100f);
                if (eVarArr == null || eVarArr.length != 2) {
                    Arrays.toString(eVarArr);
                    return;
                } else {
                    cVarC = c.b(eVarArr[0], this.f6100f);
                    cVarC2 = c.b(eVarArr[1], this.f6100f);
                }
            } else {
                int[] iArr = (int[]) cVar.g(this.f6100f);
                if (iArr == null || iArr.length != 2) {
                    Arrays.toString(iArr);
                    return;
                } else {
                    cVarC = c.c(iArr[0], this.f6100f);
                    cVarC2 = c.c(iArr[1], this.f6100f);
                }
            }
            mapArr[i10].put("ImageWidth", cVarC);
            mapArr[i10].put("ImageLength", cVarC2);
            return;
        }
        if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int iE = cVar2.e(this.f6100f);
            int iE2 = cVar4.e(this.f6100f);
            int iE3 = cVar5.e(this.f6100f);
            int iE4 = cVar3.e(this.f6100f);
            if (iE2 <= iE || iE3 <= iE4) {
                return;
            }
            c cVarC3 = c.c(iE2 - iE, this.f6100f);
            c cVarC4 = c.c(iE3 - iE4, this.f6100f);
            mapArr[i10].put("ImageLength", cVarC3);
            mapArr[i10].put("ImageWidth", cVarC4);
            return;
        }
        c cVar6 = mapArr[i10].get("ImageLength");
        c cVar7 = mapArr[i10].get("ImageWidth");
        if (cVar6 == null || cVar7 == null) {
            c cVar8 = mapArr[i10].get("JPEGInterchangeFormat");
            c cVar9 = mapArr[i10].get("JPEGInterchangeFormatLength");
            if (cVar8 == null || cVar9 == null) {
                return;
            }
            int iE5 = cVar8.e(this.f6100f);
            int iE6 = cVar8.e(this.f6100f);
            fVar.c(iE5);
            byte[] bArr = new byte[iE6];
            fVar.readFully(bArr);
            f(new b(bArr), iE5, i10);
        }
    }

    public final void y() throws Throwable {
        w(0, 5);
        w(0, 4);
        w(5, 4);
        HashMap<String, c>[] mapArr = this.f6098d;
        c cVar = mapArr[1].get("PixelXDimension");
        c cVar2 = mapArr[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            mapArr[0].put("ImageWidth", cVar);
            mapArr[0].put("ImageLength", cVar2);
        }
        if (mapArr[4].isEmpty() && o(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        o(mapArr[4]);
        u(0, "ThumbnailOrientation", "Orientation");
        u(0, "ThumbnailImageLength", "ImageLength");
        u(0, "ThumbnailImageWidth", "ImageWidth");
        u(5, "ThumbnailOrientation", "Orientation");
        u(5, "ThumbnailImageLength", "ImageLength");
        u(5, "ThumbnailImageWidth", "ImageWidth");
        u(4, "Orientation", "ThumbnailOrientation");
        u(4, "ImageLength", "ThumbnailImageLength");
        u(4, "ImageWidth", "ThumbnailImageWidth");
    }

    /* JADX INFO: compiled from: ExifInterface.java */
    public static class b extends InputStream implements DataInput {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DataInputStream f6108b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f6109c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ByteOrder f6110d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f6111e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f6112f;

        public b(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.f6112f = bArr.length;
        }

        @Override // java.io.InputStream
        public final int available() throws IOException {
            return this.f6108b.available();
        }

        public final void b(int i10) throws IOException {
            int i11 = 0;
            while (i11 < i10) {
                DataInputStream dataInputStream = this.f6108b;
                int i12 = i10 - i11;
                int iSkip = (int) dataInputStream.skip(i12);
                if (iSkip <= 0) {
                    if (this.f6111e == null) {
                        this.f6111e = new byte[8192];
                    }
                    iSkip = dataInputStream.read(this.f6111e, 0, Math.min(8192, i12));
                    if (iSkip == -1) {
                        throw new EOFException(i.c(i10, "Reached EOF while skipping ", " bytes."));
                    }
                }
                i11 += iSkip;
            }
            this.f6109c += i11;
        }

        @Override // java.io.InputStream
        public final void mark(int i10) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            this.f6109c++;
            return this.f6108b.read();
        }

        @Override // java.io.DataInput
        public final boolean readBoolean() throws IOException {
            this.f6109c++;
            return this.f6108b.readBoolean();
        }

        @Override // java.io.DataInput
        public final byte readByte() throws IOException {
            this.f6109c++;
            int i10 = this.f6108b.read();
            if (i10 >= 0) {
                return (byte) i10;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final char readChar() throws IOException {
            this.f6109c += 2;
            return this.f6108b.readChar();
        }

        @Override // java.io.DataInput
        public final double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public final float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr, int i10, int i11) throws IOException {
            this.f6109c += i11;
            this.f6108b.readFully(bArr, i10, i11);
        }

        @Override // java.io.DataInput
        public final int readInt() throws IOException {
            this.f6109c += 4;
            DataInputStream dataInputStream = this.f6108b;
            int i10 = dataInputStream.read();
            int i11 = dataInputStream.read();
            int i12 = dataInputStream.read();
            int i13 = dataInputStream.read();
            if ((i10 | i11 | i12 | i13) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f6110d;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i13 << 24) + (i12 << 16) + (i11 << 8) + i10;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
            }
            throw new IOException("Invalid byte order: " + this.f6110d);
        }

        @Override // java.io.DataInput
        public final String readLine() throws IOException {
            return null;
        }

        @Override // java.io.DataInput
        public final long readLong() throws IOException {
            this.f6109c += 8;
            DataInputStream dataInputStream = this.f6108b;
            int i10 = dataInputStream.read();
            int i11 = dataInputStream.read();
            int i12 = dataInputStream.read();
            int i13 = dataInputStream.read();
            int i14 = dataInputStream.read();
            int i15 = dataInputStream.read();
            int i16 = dataInputStream.read();
            int i17 = dataInputStream.read();
            if ((i10 | i11 | i12 | i13 | i14 | i15 | i16 | i17) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f6110d;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (((long) i17) << 56) + (((long) i16) << 48) + (((long) i15) << 40) + (((long) i14) << 32) + (((long) i13) << 24) + (((long) i12) << 16) + (((long) i11) << 8) + ((long) i10);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (((long) i10) << 56) + (((long) i11) << 48) + (((long) i12) << 40) + (((long) i13) << 32) + (((long) i14) << 24) + (((long) i15) << 16) + (((long) i16) << 8) + ((long) i17);
            }
            throw new IOException("Invalid byte order: " + this.f6110d);
        }

        @Override // java.io.DataInput
        public final short readShort() throws IOException {
            this.f6109c += 2;
            DataInputStream dataInputStream = this.f6108b;
            int i10 = dataInputStream.read();
            int i11 = dataInputStream.read();
            if ((i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f6110d;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((i11 << 8) + i10);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((i10 << 8) + i11);
            }
            throw new IOException("Invalid byte order: " + this.f6110d);
        }

        @Override // java.io.DataInput
        public final String readUTF() throws IOException {
            this.f6109c += 2;
            return this.f6108b.readUTF();
        }

        @Override // java.io.DataInput
        public final int readUnsignedByte() throws IOException {
            this.f6109c++;
            return this.f6108b.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public final int readUnsignedShort() throws IOException {
            this.f6109c += 2;
            DataInputStream dataInputStream = this.f6108b;
            int i10 = dataInputStream.read();
            int i11 = dataInputStream.read();
            if ((i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f6110d;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i11 << 8) + i10;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i10 << 8) + i11;
            }
            throw new IOException("Invalid byte order: " + this.f6110d);
        }

        @Override // java.io.InputStream
        public final void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public final int skipBytes(int i10) throws IOException {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public b(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f6108b.read(bArr, i10, i11);
            this.f6109c += i12;
            return i12;
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr) throws IOException {
            this.f6109c += bArr.length;
            this.f6108b.readFully(bArr);
        }

        public b(InputStream inputStream, ByteOrder byteOrder) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f6108b = dataInputStream;
            dataInputStream.mark(0);
            this.f6109c = 0;
            this.f6110d = byteOrder;
            this.f6112f = inputStream instanceof b ? ((b) inputStream).f6112f : -1;
        }
    }

    /* JADX INFO: compiled from: ExifInterface.java */
    public static class f extends b {
        public f(byte[] bArr) throws IOException {
            super(bArr);
            this.f6108b.mark(BrazeLogger.SUPPRESS);
        }

        public final void c(long j) throws IOException {
            int i10 = this.f6109c;
            if (i10 > j) {
                this.f6109c = 0;
                this.f6108b.reset();
            } else {
                j -= (long) i10;
            }
            b((int) j);
        }

        public f(InputStream inputStream) throws IOException {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f6108b.mark(BrazeLogger.SUPPRESS);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    /* JADX INFO: compiled from: ExifInterface.java */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f6118b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6119c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f6120d;

        public d(String str, int i10, int i11) {
            this.f6118b = str;
            this.f6117a = i10;
            this.f6119c = i11;
            this.f6120d = -1;
        }

        public d(String str, int i10, int i11, int i12) {
            this.f6118b = str;
            this.f6117a = i10;
            this.f6119c = i11;
            this.f6120d = i12;
        }
    }

    /* JADX INFO: renamed from: U0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ExifInterface.java */
    public class C0083a extends MediaDataSource {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f6106b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f6107c;

        public C0083a(f fVar) {
            this.f6107c = fVar;
        }

        @Override // android.media.MediaDataSource
        public final long getSize() throws IOException {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public final int readAt(long j, byte[] bArr, int i10, int i11) throws IOException {
            if (i11 == 0) {
                return 0;
            }
            if (j < 0) {
                return -1;
            }
            try {
                long j10 = this.f6106b;
                f fVar = this.f6107c;
                if (j10 != j) {
                    if (j10 >= 0 && j >= j10 + ((long) fVar.f6108b.available())) {
                        return -1;
                    }
                    fVar.c(j);
                    this.f6106b = j;
                }
                if (i11 > fVar.f6108b.available()) {
                    i11 = fVar.f6108b.available();
                }
                int i12 = fVar.read(bArr, i10, i11);
                if (i12 >= 0) {
                    this.f6106b += (long) i12;
                    return i12;
                }
            } catch (IOException unused) {
            }
            this.f6106b = -1L;
            return -1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }
    }
}
