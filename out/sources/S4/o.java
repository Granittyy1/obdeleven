package S4;

import D2.V;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.graphics.C1141q;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.protobuf.ByteString;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.DoubleUnaryOperator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC2712w;
import kotlinx.coroutines.C2702l0;
import kotlinx.coroutines.D0;
import kotlinx.coroutines.InterfaceC2713x;
import kotlinx.coroutines.L;
import kotlinx.coroutines.L0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;
import p050db.AbstractC2184a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class o {
    public static C1141q a(int i10, int i11, int i12) {
        ColorSpace colorSpace;
        float[] fArr;
        ColorSpace.Rgb rgb;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        Rgb rgb2 = androidx.compose.ui.graphics.colorspace.f.f13571e;
        androidx.compose.ui.graphics.r.b(i12);
        int i13 = Build.VERSION.SDK_INT;
        Bitmap.Config configB = androidx.compose.ui.graphics.r.b(i12);
        if (kotlin.jvm.internal.i.a(rgb2, rgb2)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (kotlin.jvm.internal.i.a(rgb2, androidx.compose.ui.graphics.colorspace.f.f13582q)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (kotlin.jvm.internal.i.a(rgb2, androidx.compose.ui.graphics.colorspace.f.f13583r)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (kotlin.jvm.internal.i.a(rgb2, androidx.compose.ui.graphics.colorspace.f.f13580o)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (kotlin.jvm.internal.i.a(rgb2, androidx.compose.ui.graphics.colorspace.f.j)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (kotlin.jvm.internal.i.a(rgb2, androidx.compose.ui.graphics.colorspace.f.f13575i)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (kotlin.jvm.internal.i.a(rgb2, androidx.compose.ui.graphics.colorspace.f.f13585t)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (kotlin.jvm.internal.i.a(rgb2, androidx.compose.ui.graphics.colorspace.f.f13584s)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (kotlin.jvm.internal.i.a(rgb2, androidx.compose.ui.graphics.colorspace.f.f13576k)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (kotlin.jvm.internal.i.a(rgb2, androidx.compose.ui.graphics.colorspace.f.f13577l)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (kotlin.jvm.internal.i.a(rgb2, androidx.compose.ui.graphics.colorspace.f.f13573g)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (kotlin.jvm.internal.i.a(rgb2, androidx.compose.ui.graphics.colorspace.f.f13574h)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (kotlin.jvm.internal.i.a(rgb2, androidx.compose.ui.graphics.colorspace.f.f13572f)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (kotlin.jvm.internal.i.a(rgb2, androidx.compose.ui.graphics.colorspace.f.f13578m)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else {
            if (!kotlin.jvm.internal.i.a(rgb2, androidx.compose.ui.graphics.colorspace.f.f13581p)) {
                if (kotlin.jvm.internal.i.a(rgb2, androidx.compose.ui.graphics.colorspace.f.f13579n)) {
                    colorSpace = ColorSpace.get(ColorSpace.Named.SMPTE_C);
                } else {
                    ColorSpace.Rgb.TransferParameters transferParameters = null;
                    if (i13 >= 34) {
                        if (kotlin.jvm.internal.i.a(rgb2, androidx.compose.ui.graphics.colorspace.f.f13587v)) {
                            colorSpace2 = ColorSpace.get(ColorSpace.Named.BT2020_HLG);
                        } else {
                            colorSpace2 = kotlin.jvm.internal.i.a(rgb2, androidx.compose.ui.graphics.colorspace.f.f13588w) ? ColorSpace.get(ColorSpace.Named.BT2020_PQ) : null;
                        }
                        if (colorSpace2 != null) {
                            colorSpace3 = colorSpace2;
                            configB = configB;
                        }
                    }
                    if (rgb2 != null) {
                        float[] fArrA = rgb2.f13544d.a();
                        androidx.compose.ui.graphics.colorspace.t tVar = rgb2.f13547g;
                        if (tVar != null) {
                            fArr = fArrA;
                            transferParameters = new ColorSpace.Rgb.TransferParameters(tVar.f13617b, tVar.f13618c, tVar.f13619d, tVar.f13620e, tVar.f13621f, tVar.f13622g, tVar.f13616a);
                        } else {
                            fArr = fArrA;
                        }
                        if (transferParameters != null) {
                            rgb = new ColorSpace.Rgb(rgb2.f13564a, rgb2.f13548h, fArr, transferParameters);
                        } else {
                            String str = rgb2.f13564a;
                            final Ia.l<Double, Double> lVar = rgb2.f13551l;
                            DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.M
                                @Override // java.util.function.DoubleUnaryOperator
                                public final double applyAsDouble(double d10) {
                                    return ((Number) lVar.invoke(Double.valueOf(d10))).doubleValue();
                                }
                            };
                            final Ia.l<Double, Double> lVar2 = rgb2.f13554o;
                            rgb = new ColorSpace.Rgb(str, rgb2.f13548h, fArr, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.N
                                @Override // java.util.function.DoubleUnaryOperator
                                public final double applyAsDouble(double d10) {
                                    return ((Number) lVar2.invoke(Double.valueOf(d10))).doubleValue();
                                }
                            }, rgb2.f13545e, rgb2.f13546f);
                        }
                        colorSpace = rgb;
                    } else {
                        configB = configB;
                        colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                    }
                    colorSpace3 = colorSpace;
                }
                return new C1141q(Bitmap.createBitmap((DisplayMetrics) null, i10, i11, configB, true, colorSpace3));
            }
            colorSpace = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        configB = configB;
        colorSpace3 = colorSpace;
        return new C1141q(Bitmap.createBitmap((DisplayMetrics) null, i10, i11, configB, true, colorSpace3));
    }

    public static long b(AtomicLong atomicLong, long j) {
        long j10;
        do {
            j10 = atomicLong.get();
            if (j10 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j10, c(j10, j)));
        return j10;
    }

    public static long c(long j, long j10) {
        long j11 = j + j10;
        if (j11 < 0) {
            return Long.MAX_VALUE;
        }
        return j11;
    }

    public static int d(int i10, int i11, int i12) {
        if (i10 < i11) {
            return i11;
        }
        return i10 > i12 ? i12 : i10;
    }

    public static final String e(CharsetDecoder charsetDecoder, p061ea.d dVar, int i10) throws Throwable {
        CoderResult coderResultDecode;
        p074fa.a aVarC;
        boolean z10 = true;
        StringBuilder sb2 = new StringBuilder((int) Math.min(i10, ((long) (dVar.f34869f - dVar.f34868e)) + dVar.f34870g));
        CharBuffer charBuffer = p049da.a.f34632a;
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        p074fa.a aVarB = p074fa.b.b(dVar, 1);
        int iRemaining = 0;
        if (aVarB != null) {
            int i11 = 1;
            int i12 = 1;
            int iRemaining2 = 0;
            while (true) {
                try {
                    int i13 = aVarB.f34857c;
                    int i14 = aVarB.f34856b;
                    int i15 = i13 - i14;
                    if (i15 >= i11) {
                        int i16 = i10 - iRemaining2;
                        if (i16 == 0) {
                            i11 = 0;
                        } else {
                            try {
                                ByteBuffer byteBuffer = aVarB.f34855a;
                                ByteBuffer byteBuffer2 = p036ca.b.f22529a;
                                ByteBuffer byteBufferJ = kotlin.jvm.internal.n.j(byteBuffer, i14, i15);
                                charBufferAllocate.clear();
                                if (i16 < 8192) {
                                    charBufferAllocate.limit(i16);
                                }
                                CoderResult coderResultDecode2 = charsetDecoder.decode(byteBufferJ, charBufferAllocate, false);
                                charBufferAllocate.flip();
                                iRemaining2 += charBufferAllocate.remaining();
                                sb2.append((CharSequence) charBufferAllocate);
                                if (coderResultDecode2.isMalformed() || coderResultDecode2.isUnmappable()) {
                                    p049da.a.d(coderResultDecode2);
                                }
                                i12 = (coderResultDecode2.isUnderflow() && byteBufferJ.hasRemaining()) ? i12 + 1 : 1;
                                if (byteBufferJ.limit() != i15) {
                                    throw new IllegalStateException("Buffer's limit change is not allowed");
                                }
                                aVarB.c(byteBufferJ.position());
                                i11 = i12;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        i15 = aVarB.f34857c - aVarB.f34856b;
                    }
                    if (i15 == 0) {
                        try {
                            aVarC = p074fa.b.c(dVar, aVarB);
                        } catch (Throwable th2) {
                            th = th2;
                            z10 = false;
                            if (z10) {
                                p074fa.b.a(dVar, aVarB);
                            }
                            throw th;
                        }
                    } else if (i15 < i11 || aVarB.f34860f - aVarB.f34859e < 8) {
                        p074fa.b.a(dVar, aVarB);
                        aVarC = p074fa.b.b(dVar, i11);
                    } else {
                        aVarC = aVarB;
                    }
                    if (aVarC == null) {
                        break;
                    }
                    if (i11 <= 0) {
                        iRemaining = 1;
                        aVarB = aVarC;
                        break;
                    }
                    aVarB = aVarC;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            if (iRemaining != 0) {
                p074fa.b.a(dVar, aVarB);
            }
            iRemaining = iRemaining2;
        }
        do {
            charBufferAllocate.clear();
            int i17 = i10 - iRemaining;
            if (i17 == 0) {
                break;
            }
            if (i17 < 8192) {
                charBufferAllocate.limit(i17);
            }
            coderResultDecode = charsetDecoder.decode(p049da.a.f34633b, charBufferAllocate, true);
            charBufferAllocate.flip();
            iRemaining += charBufferAllocate.remaining();
            sb2.append((CharSequence) charBufferAllocate);
            if (coderResultDecode.isUnmappable() || coderResultDecode.isMalformed()) {
                p049da.a.d(coderResultDecode);
            }
        } while (coderResultDecode.isOverflow());
        String string = sb2.toString();
        kotlin.jvm.internal.i.d(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public static final p061ea.d f(CharsetEncoder charsetEncoder, String input, int i10, int i11) {
        kotlin.jvm.internal.i.e(input, "input");
        p061ea.c cVar = new p061ea.c(null);
        try {
            g(charsetEncoder, cVar, input, i10, i11);
            return cVar.s();
        } catch (Throwable th) {
            cVar.close();
            throw th;
        }
    }

    public static final void g(CharsetEncoder charsetEncoder, p061ea.g destination, CharSequence input, int i10, int i11) {
        int i12;
        kotlin.jvm.internal.i.e(destination, "destination");
        kotlin.jvm.internal.i.e(input, "input");
        if (i10 >= i11) {
            return;
        }
        p074fa.a aVarD = p074fa.b.d(destination, 1, null);
        while (true) {
            try {
                int iB = p049da.a.b(charsetEncoder, input, i10, i11, aVarD);
                if (iB < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                i10 += iB;
                if (i10 >= i11) {
                    i12 = 0;
                } else {
                    i12 = iB == 0 ? 8 : 1;
                }
                if (i12 > 0) {
                    aVarD = p074fa.b.d(destination, i12, aVarD);
                } else {
                    destination.b();
                    p074fa.a aVarD2 = p074fa.b.d(destination, 1, null);
                    int i13 = 1;
                    while (true) {
                        try {
                            i13 = p049da.a.a(charsetEncoder, aVarD2) ? 0 : i13 + 1;
                            if (i13 <= 0) {
                                destination.b();
                                return;
                            }
                            aVarD2 = p074fa.b.d(destination, 1, aVarD2);
                        } catch (Throwable th) {
                            destination.b();
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                destination.b();
                throw th2;
            }
        }
    }

    public static String h(ByteString byteString) {
        StringBuilder sb2 = new StringBuilder(byteString.size());
        for (int i10 = 0; i10 < byteString.size(); i10++) {
            byte bD = byteString.d(i10);
            if (bD == 34) {
                sb2.append("\\\"");
            } else if (bD == 39) {
                sb2.append("\\'");
            } else if (bD != 92) {
                switch (bD) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bD < 32 || bD > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bD >>> 6) & 3) + 48));
                            sb2.append((char) (((bD >>> 3) & 7) + 48));
                            sb2.append((char) ((bD & 7) + 48));
                        } else {
                            sb2.append((char) bD);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static final Method i(Class cls, String str, Class... args) {
        kotlin.jvm.internal.i.e(args, "args");
        try {
            return cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(args, args.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static final Method j(Class clazz, String str, Class... clsArr) {
        kotlin.jvm.internal.i.e(clazz, "clazz");
        try {
            return clazz.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static final void k(kotlin.coroutines.e eVar, Throwable th) {
        Throwable runtimeException;
        Iterator<InterfaceC2713x> it = kotlinx.coroutines.internal.g.f43474a.iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(eVar, th);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    V.e(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            V.e(th, new DiagnosticCoroutineContextException(eVar));
        } catch (Throwable unused2) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static final Object l(Class clazz, Object obj, Method method, Object... args) {
        kotlin.jvm.internal.i.e(clazz, "clazz");
        kotlin.jvm.internal.i.e(method, "method");
        kotlin.jvm.internal.i.e(args, "args");
        if (obj != null) {
            obj = clazz.cast(obj);
        }
        try {
            return method.invoke(obj, Arrays.copyOf(args, args.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final boolean m(String method) {
        kotlin.jvm.internal.i.e(method, "method");
        return (method.equals("GET") || method.equals("HEAD")) ? false : true;
    }

    public static void n(AtomicLong atomicLong, long j) {
        long j10;
        long j11;
        do {
            j10 = atomicLong.get();
            if (j10 == Long.MAX_VALUE) {
                return;
            }
            j11 = j10 - j;
            if (j11 < 0) {
                p231sa.a.c(new IllegalStateException(com.google.gson.internal.b.b(j11, "More produced than requested: ")));
                j11 = 0;
            }
        } while (!atomicLong.compareAndSet(j10, j11));
    }

    public static final Object o(AbstractC2184a abstractC2184a, String discriminator, p050db.z zVar, Ya.a aVar) {
        kotlin.jvm.internal.i.e(abstractC2184a, "<this>");
        kotlin.jvm.internal.i.e(discriminator, "discriminator");
        return new kotlinx.serialization.json.internal.r(abstractC2184a, zVar, discriminator, aVar.getDescriptor()).m(aVar);
    }

    public static final String p(InterfaceC1084f interfaceC1084f, int i10) {
        interfaceC1084f.x(AndroidCompositionLocals_androidKt.f14792a);
        return ((Context) interfaceC1084f.x(AndroidCompositionLocals_androidKt.f14793b)).getResources().getString(i10);
    }

    public static final void q(int i10, int i11) {
        if (!(i10 > 0 && i11 > 0)) {
            p245u.c.a("both minLines " + i10 + " and maxLines " + i11 + " must be greater than zero");
        }
        if (i10 <= i11) {
            return;
        }
        p245u.c.a("minLines " + i10 + " must be less than or equal to maxLines " + i11);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object r(ContinuationImpl continuationImpl) {
        Object obj;
        kotlin.coroutines.e context = continuationImpl.getContext();
        C2702l0.e(context);
        kotlin.coroutines.c cVarY = A8.p.y(continuationImpl);
        kotlinx.coroutines.internal.h hVar = cVarY instanceof kotlinx.coroutines.internal.h ? (kotlinx.coroutines.internal.h) cVarY : null;
        if (hVar == null) {
            obj = p293xa.r.f47939a;
        } else {
            AbstractC2712w abstractC2712w = hVar.f43476e;
            if (abstractC2712w.b1(context)) {
                hVar.f43478g = p293xa.r.f47939a;
                hVar.f43195d = 1;
                abstractC2712w.a1(context, hVar);
            } else {
                L0 l10 = new L0();
                kotlin.coroutines.e eVarPlus = context.plus(l10);
                p293xa.r rVar = p293xa.r.f47939a;
                hVar.f43478g = rVar;
                hVar.f43195d = 1;
                abstractC2712w.a1(eVarPlus, hVar);
                if (l10.f43197b) {
                    U uA = D0.a();
                    kotlin.collections.i<L<?>> iVar = uA.f43209e;
                    if (iVar != null ? iVar.isEmpty() : true) {
                        obj = p293xa.r.f47939a;
                    } else if (uA.g1()) {
                        hVar.f43478g = rVar;
                        hVar.f43195d = 1;
                        uA.e1(hVar);
                        obj = CoroutineSingletons.f43038b;
                    } else {
                        uA.f1(true);
                        try {
                            hVar.run();
                            do {
                            } while (uA.i1());
                        } catch (Throwable th) {
                            try {
                                hVar.g(th, null);
                            } catch (Throwable th2) {
                                uA.d1(true);
                                throw th2;
                            }
                        }
                        uA.d1(true);
                        obj = p293xa.r.f47939a;
                    }
                }
            }
            obj = CoroutineSingletons.f43038b;
        }
        return obj == CoroutineSingletons.f43038b ? obj : p293xa.r.f47939a;
    }

    public static int s(int i10) {
        int[] iArr = {1, 2, 3};
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = iArr[i11];
            int i13 = i12 - 1;
            if (i12 == 0) {
                throw null;
            }
            if (i13 == i10) {
                return i12;
            }
        }
        return 1;
    }
}
