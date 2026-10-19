package com.bumptech.glide.load.resource.bitmap;

import E3.h;
import K3.d;
import K3.m;
import K3.q;
import X3.f;
import X3.j;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.PreferredColorSpace;
import com.google.android.gms.internal.measurement.M1;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: Downsampler.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final A3.c<DecodeFormat> f24676f = A3.c.a(DecodeFormat.f24519d, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final A3.c<PreferredColorSpace> f24677g = A3.c.a(PreferredColorSpace.f24525b, "com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final A3.c<Boolean> f24678h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final A3.c<Boolean> f24679i;
    public static final Set<String> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0260a f24680k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Set<ImageHeaderParser.ImageType> f24681l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ArrayDeque f24682m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E3.c f24683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f24684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f24685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f24686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f24687e = m.a();

    /* JADX INFO: compiled from: Downsampler.java */
    public interface b {
        void a();

        void b(E3.c cVar, Bitmap bitmap) throws IOException;
    }

    static {
        DownsampleStrategy.e eVar = DownsampleStrategy.f24660a;
        Boolean bool = Boolean.FALSE;
        f24678h = A3.c.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f24679i = A3.c.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        j = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f24680k = new C0260a();
        f24681l = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = j.f7214a;
        f24682m = new ArrayDeque(0);
    }

    public a(ArrayList arrayList, DisplayMetrics displayMetrics, E3.c cVar, h hVar) {
        this.f24686d = arrayList;
        M1.d(displayMetrics, "Argument must not be null");
        this.f24684b = displayMetrics;
        M1.d(cVar, "Argument must not be null");
        this.f24683a = cVar;
        M1.d(hVar, "Argument must not be null");
        this.f24685c = hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        throw r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap c(com.bumptech.glide.load.resource.bitmap.b r8, android.graphics.BitmapFactory.Options r9, com.bumptech.glide.load.resource.bitmap.a.b r10, E3.c r11) throws java.io.IOException {
        /*
            boolean r0 = r9.inJustDecodeBounds
            if (r0 != 0) goto La
            r10.a()
            r8.c()
        La:
            int r0 = r9.outWidth
            int r1 = r9.outHeight
            java.lang.String r2 = r9.outMimeType
            java.util.concurrent.locks.Lock r3 = K3.q.f4271b
            r3.lock()
            android.graphics.Bitmap r8 = r8.b(r9)     // Catch: java.lang.Throwable -> L1d java.lang.IllegalArgumentException -> L1f
            r3.unlock()
            return r8
        L1d:
            r8 = move-exception
            goto L60
        L1f:
            r3 = move-exception
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L1d
            java.lang.String r5 = "Exception decoding bitmap, outWidth: "
            java.lang.String r6 = ", outHeight: "
            java.lang.String r7 = ", outMimeType: "
            java.lang.StringBuilder r0 = B6.a.a(r5, r6, r7, r0, r1)     // Catch: java.lang.Throwable -> L1d
            r0.append(r2)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = ", inBitmap: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L1d
            android.graphics.Bitmap r1 = r9.inBitmap     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = d(r1)     // Catch: java.lang.Throwable -> L1d
            r0.append(r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1d
            r4.<init>(r0, r3)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = "Downsampler"
            r1 = 3
            android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L1d
            android.graphics.Bitmap r0 = r9.inBitmap     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L5f
            r11.c(r0)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L5e
            r0 = 0
            r9.inBitmap = r0     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L5e
            android.graphics.Bitmap r8 = c(r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L5e
            java.util.concurrent.locks.Lock r9 = K3.q.f4271b
            r9.unlock()
            return r8
        L5e:
            throw r4     // Catch: java.lang.Throwable -> L1d
        L5f:
            throw r4     // Catch: java.lang.Throwable -> L1d
        L60:
            java.util.concurrent.locks.Lock r9 = K3.q.f4271b
            r9.unlock()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.a.c(com.bumptech.glide.load.resource.bitmap.b, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.a$b, E3.c):android.graphics.Bitmap");
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static void e(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final d a(com.bumptech.glide.load.resource.bitmap.b bVar, int i10, int i11, A3.d dVar, b bVar2) throws IOException {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        byte[] bArr = (byte[]) this.f24685c.d(byte[].class, 65536);
        synchronized (a.class) {
            arrayDeque = f24682m;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                e(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) dVar.c(f24676f);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) dVar.c(f24677g);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) dVar.c(DownsampleStrategy.f24665f);
        boolean zBooleanValue = ((Boolean) dVar.c(f24678h)).booleanValue();
        A3.c<Boolean> cVar = f24679i;
        try {
            d dVarD = d.d(this.f24683a, b(bVar, options2, downsampleStrategy, decodeFormat, preferredColorSpace, dVar.c(cVar) != null && ((Boolean) dVar.c(cVar)).booleanValue(), i10, i11, zBooleanValue, bVar2));
            e(options2);
            synchronized (arrayDeque) {
                arrayDeque.offer(options2);
            }
            return dVarD;
        } finally {
            e(options2);
            ArrayDeque arrayDeque2 = f24682m;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options2);
                this.f24685c.h(bArr);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:134:0x025e  */
    /* JADX WARN: Code duplicated, block: B:139:0x0267  */
    /* JADX WARN: Code duplicated, block: B:140:0x026f  */
    /* JADX WARN: Code duplicated, block: B:142:0x0272  */
    /* JADX WARN: Code duplicated, block: B:143:0x0274  */
    /* JADX WARN: Code duplicated, block: B:152:0x0290  */
    /* JADX WARN: Code duplicated, block: B:153:0x0293  */
    /* JADX WARN: Code duplicated, block: B:156:0x029b  */
    /* JADX WARN: Code duplicated, block: B:157:0x029f  */
    /* JADX WARN: Code duplicated, block: B:163:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:165:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:169:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:171:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:172:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:182:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:186:0x0305  */
    /* JADX WARN: Code duplicated, block: B:193:0x0316  */
    /* JADX WARN: Code duplicated, block: B:195:0x0319  */
    /* JADX WARN: Code duplicated, block: B:196:0x031c  */
    /* JADX WARN: Code duplicated, block: B:198:0x0325  */
    /* JADX WARN: Code duplicated, block: B:201:0x033b  */
    /* JADX WARN: Code duplicated, block: B:203:0x034f  */
    /* JADX WARN: Code duplicated, block: B:205:0x0359  */
    /* JADX WARN: Code duplicated, block: B:206:0x035c  */
    /* JADX WARN: Code duplicated, block: B:209:0x036d  */
    /* JADX WARN: Code duplicated, block: B:210:0x0371  */
    /* JADX WARN: Code duplicated, block: B:211:0x037a  */
    /* JADX WARN: Code duplicated, block: B:212:0x037e  */
    /* JADX WARN: Code duplicated, block: B:213:0x0387  */
    /* JADX WARN: Code duplicated, block: B:214:0x0390  */
    /* JADX WARN: Code duplicated, block: B:215:0x0394  */
    /* JADX WARN: Code duplicated, block: B:218:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:219:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:223:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:224:0x03ea A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:228:0x027a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0167  */
    /* JADX WARN: Code duplicated, block: B:85:0x0169  */
    /* JADX WARN: Code duplicated, block: B:89:0x018c  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a8  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Bitmap b(com.bumptech.glide.load.resource.bitmap.b bVar, BitmapFactory.Options options, DownsampleStrategy downsampleStrategy, DecodeFormat decodeFormat, PreferredColorSpace preferredColorSpace, boolean z10, int i10, int i11, boolean z11, b bVar2) throws IOException {
        char c10;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean zHasAlpha;
        Bitmap.Config config;
        boolean z15;
        int i12;
        int i13;
        boolean z16;
        float f10;
        int iRound;
        int i14;
        Bitmap bitmapC;
        Matrix matrix;
        Bitmap.Config config2;
        Bitmap bitmap;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        Bitmap.Config config3;
        Bitmap.Config config4;
        boolean z17;
        boolean z18;
        int i15;
        int i16;
        int iFloor;
        int iFloor2;
        double dB;
        double d10;
        int i17;
        int i18 = f.f7206a;
        SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        E3.c cVar = this.f24683a;
        c(bVar, options, bVar2, cVar);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i19 = iArr[0];
        int i20 = iArr[1];
        boolean z19 = (i19 == -1 || i20 == -1) ? false : z10;
        int iA = bVar.a();
        switch (iA) {
            case 3:
            case 4:
                c10 = 180;
                break;
            case 5:
            case 6:
                c10 = 'Z';
                break;
            case 7:
            case 8:
                c10 = 270;
                break;
            default:
                c10 = 0;
                break;
        }
        switch (iA) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z12 = true;
                break;
            default:
                z12 = false;
                break;
        }
        int i21 = i10;
        if (i21 == Integer.MIN_VALUE) {
            i21 = (c10 == 'Z' || c10 == 270) ? i20 : i19;
        }
        if (i11 == -2147483648) {
            i11 = (c10 == 'Z' || c10 == 270) ? i19 : i20;
        }
        ImageHeaderParser.ImageType imageTypeD = bVar.d();
        String str = "Downsampler";
        if (i19 <= 0 || i20 <= 0) {
            int i22 = 3;
            if (Log.isLoggable(str, i22)) {
                Objects.toString(imageTypeD);
            }
        } else {
            iA = iA;
            if (c10 == 'Z' || c10 == 270) {
                i15 = i20;
                i16 = i19;
            } else {
                i16 = i20;
                i15 = i19;
            }
            z12 = z12;
            float fB = downsampleStrategy.b(i15, i16, i21, i11);
            if (fB <= 0.0f) {
                throw new IllegalArgumentException("Cannot scale with factor: " + fB + " from: " + downsampleStrategy + ", source: [" + i19 + "x" + i20 + "], target: [" + i21 + "x" + i11 + "]");
            }
            z19 = z19;
            DownsampleStrategy.SampleSizeRounding sampleSizeRoundingA = downsampleStrategy.a(i15, i16, i21, i11);
            if (sampleSizeRoundingA == null) {
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            float f11 = i15;
            float f12 = i16;
            i11 = i11;
            int i23 = i15 / ((int) (((double) (fB * f11)) + 0.5d));
            int i24 = i16 / ((int) (((double) (fB * f12)) + 0.5d));
            DownsampleStrategy.SampleSizeRounding sampleSizeRounding = DownsampleStrategy.SampleSizeRounding.f24667b;
            int iMax = Math.max(1, Integer.highestOneBit(sampleSizeRoundingA == sampleSizeRounding ? Math.max(i23, i24) : Math.min(i23, i24)));
            if (sampleSizeRoundingA == sampleSizeRounding && iMax < 1.0f / fB) {
                iMax <<= 1;
            }
            options.inSampleSize = iMax;
            if (imageTypeD == ImageHeaderParser.ImageType.JPEG) {
                float fMin = Math.min(iMax, 8);
                iFloor = (int) Math.ceil(f11 / fMin);
                iFloor2 = (int) Math.ceil(f12 / fMin);
                int i25 = iMax / 8;
                if (i25 > 0) {
                    iFloor /= i25;
                    iFloor2 /= i25;
                }
            } else if (imageTypeD == ImageHeaderParser.ImageType.PNG || imageTypeD == ImageHeaderParser.ImageType.PNG_A) {
                float f13 = iMax;
                iFloor = (int) Math.floor(f11 / f13);
                iFloor2 = (int) Math.floor(f12 / f13);
            } else if (imageTypeD == ImageHeaderParser.ImageType.WEBP || imageTypeD == ImageHeaderParser.ImageType.WEBP_A) {
                float f14 = iMax;
                iFloor = Math.round(f11 / f14);
                iFloor2 = Math.round(f12 / f14);
            } else {
                if (i15 % iMax == 0 && i16 % iMax == 0) {
                    iFloor = i15 / iMax;
                    iFloor2 = i16 / iMax;
                } else {
                    options.inJustDecodeBounds = true;
                    c(bVar, options, bVar2, cVar);
                    options.inJustDecodeBounds = false;
                    int[] iArr2 = {options.outWidth, options.outHeight};
                    iFloor = iArr2[0];
                    iFloor2 = iArr2[1];
                }
                dB = downsampleStrategy.b(iFloor, iFloor2, i21, i11);
                if (dB <= 1.0d) {
                    d10 = dB;
                } else {
                    d10 = 1.0d / dB;
                }
                int iRound2 = (int) Math.round(d10 * 2.147483647E9d);
                int i26 = (int) ((((double) iRound2) * dB) + 0.5d);
                options.inTargetDensity = (int) (((dB / ((double) (i26 / iRound2))) * ((double) i26)) + 0.5d);
                if (dB > 1.0d) {
                    dB = 1.0d / dB;
                }
                int iRound3 = (int) Math.round(dB * 2.147483647E9d);
                options.inDensity = iRound3;
                i17 = options.inTargetDensity;
                if (i17 > 0 || iRound3 <= 0 || i17 == iRound3) {
                    options.inTargetDensity = 0;
                    options.inDensity = 0;
                } else {
                    options.inScaled = true;
                }
                str = "Downsampler";
                Log.isLoggable(str, 2);
                i20 = i20;
                i19 = i19;
            }
            dB = downsampleStrategy.b(iFloor, iFloor2, i21, i11);
            if (dB <= 1.0d) {
                d10 = dB;
            } else {
                d10 = 1.0d / dB;
            }
            int iRound4 = (int) Math.round(d10 * 2.147483647E9d);
            int i27 = (int) ((((double) iRound4) * dB) + 0.5d);
            options.inTargetDensity = (int) (((dB / ((double) (i27 / iRound4))) * ((double) i27)) + 0.5d);
            if (dB > 1.0d) {
                dB = 1.0d / dB;
            }
            int iRound5 = (int) Math.round(dB * 2.147483647E9d);
            options.inDensity = iRound5;
            i17 = options.inTargetDensity;
            if (i17 > 0) {
                options.inTargetDensity = 0;
                options.inDensity = 0;
            } else {
                options.inTargetDensity = 0;
                options.inDensity = 0;
            }
            str = "Downsampler";
            Log.isLoggable(str, 2);
            i20 = i20;
            i19 = i19;
        }
        m mVar = this.f24687e;
        if (z19) {
            if (mVar.f4260a && !z12) {
                int i28 = mVar.f4262c;
                if (i21 < i28 || i11 < i28) {
                    z17 = false;
                } else {
                    synchronized (mVar) {
                        try {
                            int i29 = mVar.f4263d + 1;
                            mVar.f4263d = i29;
                            if (i29 >= 50) {
                                mVar.f4263d = 0;
                                boolean z20 = m.f4258f.list().length < mVar.f4261b;
                                mVar.f4264e = z20;
                                if (!z20) {
                                    Log.isLoggable("Downsampler", 5);
                                }
                            }
                            z18 = mVar.f4264e;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (z18) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                }
                z13 = z17;
            }
            if (z13) {
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                z14 = false;
                options.inMutable = false;
            } else {
                z14 = false;
            }
            if (!z13) {
                z15 = true;
            } else if (decodeFormat != DecodeFormat.f24517b) {
                try {
                    zHasAlpha = bVar.d().hasAlpha();
                } catch (IOException unused) {
                    if (Log.isLoggable(str, 3)) {
                        Objects.toString(decodeFormat);
                    }
                    zHasAlpha = z14;
                }
                if (zHasAlpha) {
                    config = Bitmap.Config.ARGB_8888;
                } else {
                    config = Bitmap.Config.RGB_565;
                }
                options.inPreferredConfig = config;
                if (config == Bitmap.Config.RGB_565) {
                    z15 = true;
                    options.inDither = true;
                } else {
                    z15 = true;
                }
            } else {
                z15 = true;
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            }
            i12 = Build.VERSION.SDK_INT;
            if (i19 >= 0 || i20 < 0 || !z11) {
                i13 = options.inTargetDensity;
                if (i13 > 0 || (i14 = options.inDensity) <= 0 || i13 == i14) {
                    z16 = z14;
                } else {
                    z16 = z15;
                }
                if (z16) {
                    f10 = i13 / options.inDensity;
                } else {
                    f10 = 1.0f;
                }
                float f15 = options.inSampleSize;
                int iCeil = (int) Math.ceil(i19 / f15);
                int iCeil2 = (int) Math.ceil(i20 / f15);
                int iRound6 = Math.round(iCeil * f10);
                iRound = Math.round(iCeil2 * f10);
                Log.isLoggable(str, 2);
                i21 = iRound6;
            } else {
                iRound = i11;
            }
            if (i21 > 0 && iRound > 0 && (config3 = options.inPreferredConfig) != Bitmap.Config.HARDWARE) {
                config4 = options.outConfig;
                if (config4 != null) {
                    config3 = config4;
                }
                options.inBitmap = cVar.b(i21, iRound, config3);
            }
            if (i12 >= 28) {
                if (preferredColorSpace == PreferredColorSpace.f24526c || (colorSpace = options.outColorSpace) == null || !colorSpace.isWideGamut()) {
                    z15 = z14;
                }
                if (z15) {
                    named = ColorSpace.Named.DISPLAY_P3;
                } else {
                    named = ColorSpace.Named.SRGB;
                }
                options.inPreferredColorSpace = ColorSpace.get(named);
            } else {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
            bitmapC = c(bVar, options, bVar2, cVar);
            bVar2.b(cVar, bitmapC);
            if (Log.isLoggable(str, 2)) {
                d(bitmapC);
                d(options.inBitmap);
                Thread.currentThread().getName();
                SystemClock.elapsedRealtimeNanos();
            }
            if (bitmapC != null) {
                return null;
            }
            bitmapC.setDensity(this.f24684b.densityDpi);
            switch (iA) {
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    matrix = new Matrix();
                    switch (iA) {
                        case 2:
                            matrix.setScale(-1.0f, 1.0f);
                            break;
                        case 3:
                            matrix.setRotate(180.0f);
                            break;
                        case 4:
                            matrix.setRotate(180.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            break;
                        case 5:
                            matrix.setRotate(90.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            break;
                        case 6:
                            matrix.setRotate(90.0f);
                            break;
                        case 7:
                            matrix.setRotate(-90.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            break;
                        case 8:
                            matrix.setRotate(-90.0f);
                            break;
                    }
                    RectF rectF = new RectF(0.0f, 0.0f, bitmapC.getWidth(), bitmapC.getHeight());
                    matrix.mapRect(rectF);
                    int iRound7 = Math.round(rectF.width());
                    int iRound8 = Math.round(rectF.height());
                    if (bitmapC.getConfig() != null) {
                        config2 = bitmapC.getConfig();
                    } else {
                        config2 = Bitmap.Config.ARGB_8888;
                    }
                    Bitmap bitmapD = cVar.d(iRound7, iRound8, config2);
                    matrix.postTranslate(-rectF.left, -rectF.top);
                    bitmapD.setHasAlpha(bitmapC.hasAlpha());
                    q.a(bitmapC, bitmapD, matrix);
                    bitmap = bitmapD;
                    break;
                default:
                    bitmap = bitmapC;
                    break;
            }
            if (!bitmapC.equals(bitmap)) {
                return bitmap;
            }
            cVar.c(bitmapC);
            return bitmap;
        }
        mVar.getClass();
        z13 = false;
        if (z13) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            z14 = false;
            options.inMutable = false;
        } else {
            z14 = false;
        }
        if (!z13) {
            z15 = true;
        } else if (decodeFormat != DecodeFormat.f24517b) {
            zHasAlpha = bVar.d().hasAlpha();
            if (zHasAlpha) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = Bitmap.Config.RGB_565;
            }
            options.inPreferredConfig = config;
            if (config == Bitmap.Config.RGB_565) {
                z15 = true;
                options.inDither = true;
            } else {
                z15 = true;
            }
        } else {
            z15 = true;
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        }
        i12 = Build.VERSION.SDK_INT;
        if (i19 >= 0) {
            i13 = options.inTargetDensity;
            if (i13 > 0) {
                z16 = z14;
            } else {
                z16 = z14;
            }
            if (z16) {
                f10 = i13 / options.inDensity;
            } else {
                f10 = 1.0f;
            }
            float f16 = options.inSampleSize;
            int iCeil3 = (int) Math.ceil(i19 / f16);
            int iCeil4 = (int) Math.ceil(i20 / f16);
            int iRound9 = Math.round(iCeil3 * f10);
            iRound = Math.round(iCeil4 * f10);
            Log.isLoggable(str, 2);
            i21 = iRound9;
        } else {
            i13 = options.inTargetDensity;
            if (i13 > 0) {
                z16 = z14;
            } else {
                z16 = z14;
            }
            if (z16) {
                f10 = i13 / options.inDensity;
            } else {
                f10 = 1.0f;
            }
            float f17 = options.inSampleSize;
            int iCeil5 = (int) Math.ceil(i19 / f17);
            int iCeil6 = (int) Math.ceil(i20 / f17);
            int iRound10 = Math.round(iCeil5 * f10);
            iRound = Math.round(iCeil6 * f10);
            Log.isLoggable(str, 2);
            i21 = iRound10;
        }
        if (i21 > 0) {
            config4 = options.outConfig;
            if (config4 != null) {
                config3 = config4;
            }
            options.inBitmap = cVar.b(i21, iRound, config3);
        }
        if (i12 >= 28) {
            if (preferredColorSpace == PreferredColorSpace.f24526c) {
                z15 = z14;
            } else {
                z15 = z14;
            }
            if (z15) {
                named = ColorSpace.Named.DISPLAY_P3;
            } else {
                named = ColorSpace.Named.SRGB;
            }
            options.inPreferredColorSpace = ColorSpace.get(named);
        } else {
            options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        bitmapC = c(bVar, options, bVar2, cVar);
        bVar2.b(cVar, bitmapC);
        if (Log.isLoggable(str, 2)) {
            d(bitmapC);
            d(options.inBitmap);
            Thread.currentThread().getName();
            SystemClock.elapsedRealtimeNanos();
        }
        if (bitmapC != null) {
            return null;
        }
        bitmapC.setDensity(this.f24684b.densityDpi);
        switch (iA) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                matrix = new Matrix();
                switch (iA) {
                    case 2:
                        matrix.setScale(-1.0f, 1.0f);
                        break;
                    case 3:
                        matrix.setRotate(180.0f);
                        break;
                    case 4:
                        matrix.setRotate(180.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 5:
                        matrix.setRotate(90.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 6:
                        matrix.setRotate(90.0f);
                        break;
                    case 7:
                        matrix.setRotate(-90.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 8:
                        matrix.setRotate(-90.0f);
                        break;
                }
                RectF rectF2 = new RectF(0.0f, 0.0f, bitmapC.getWidth(), bitmapC.getHeight());
                matrix.mapRect(rectF2);
                int iRound11 = Math.round(rectF2.width());
                int iRound12 = Math.round(rectF2.height());
                if (bitmapC.getConfig() != null) {
                    config2 = bitmapC.getConfig();
                } else {
                    config2 = Bitmap.Config.ARGB_8888;
                }
                Bitmap bitmapD2 = cVar.d(iRound11, iRound12, config2);
                matrix.postTranslate(-rectF2.left, -rectF2.top);
                bitmapD2.setHasAlpha(bitmapC.hasAlpha());
                q.a(bitmapC, bitmapD2, matrix);
                bitmap = bitmapD2;
                break;
            default:
                bitmap = bitmapC;
                break;
        }
        if (!bitmapC.equals(bitmap)) {
            return bitmap;
        }
        cVar.c(bitmapC);
        return bitmap;
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Downsampler.java */
    public class C0260a implements b {
        @Override // com.bumptech.glide.load.resource.bitmap.a.b
        public final void a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a.b
        public final void b(E3.c cVar, Bitmap bitmap) {
        }
    }
}
