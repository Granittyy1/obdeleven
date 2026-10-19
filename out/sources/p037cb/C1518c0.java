package p037cb;

import Ia.a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import coil.decode.BitmapFactoryDecoder;
import coil.decode.c;
import coil.decode.e;
import coil.decode.f;
import coil.decode.g;
import coil.decode.h;
import coil.decode.x;
import coil.decode.z;
import coil.request.k;
import coil.size.Scale;
import com.braze.support.BrazeLogger;
import io.intercom.android.sdk.AppIdentityInjector;
import io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.i;
import p011ab.l;
import p011ab.n;
import p241t7.b;
import p293xa.r;
import p318zb.A;
import p318zb.C;
import p318zb.v;
import zb.C.a;

/* JADX INFO: renamed from: cb.c0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1518c0 implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22600c;

    public /* synthetic */ C1518c0(int i10, Object obj) {
        this.f22599b = i10;
        this.f22600c = obj;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c6  */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, xa.g] */
    @Override // Ia.a
    public final Object invoke() throws Exception {
        e eVar;
        int i10;
        int i11;
        int iMin;
        double dMax;
        Bitmap bitmapCreateBitmap;
        int i12;
        Object obj = this.f22600c;
        switch (this.f22599b) {
            case 0:
                final C1522e0 c1522e0 = (C1522e0) obj;
                return l.c("kotlin.Unit", n.d.f8127a, new p011ab.e[0], new Ia.l() { // from class: cb.d0
                    @Override // Ia.l
                    public final Object invoke(Object obj2) {
                        p011ab.a buildSerialDescriptor = (p011ab.a) obj2;
                        i.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
                        EmptyList emptyList = c1522e0.f22604b;
                        i.e(emptyList, "<set-?>");
                        buildSerialDescriptor.f8083b = emptyList;
                        return r.f47939a;
                    }
                });
            case 1:
                BitmapFactory.Options options = new BitmapFactory.Options();
                BitmapFactoryDecoder bitmapFactoryDecoder = (BitmapFactoryDecoder) obj;
                x xVar = bitmapFactoryDecoder.f22850a;
                BitmapFactoryDecoder.a aVar = new BitmapFactoryDecoder.a(xVar.i());
                C cB = v.b(aVar);
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(v.b(new A(cB)).new a(), null, options);
                Exception exc = aVar.f22854c;
                if (exc != null) {
                    throw exc;
                }
                options.inJustDecodeBounds = false;
                Paint paint = g.f22880a;
                String str = options.outMimeType;
                Set<String> set = h.f22881a;
                int iOrdinal = bitmapFactoryDecoder.f22853d.ordinal();
                if (iOrdinal == 0) {
                    eVar = e.f22875c;
                } else {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (str == null || !h.f22881a.contains(str)) {
                        eVar = e.f22875c;
                    }
                    U0.a aVar2 = new U0.a(new f(v.b(new A(cB)).new a()));
                    int iC = aVar2.c(1, "Orientation");
                    boolean z10 = iC == 2 || iC == 7 || iC == 4 || iC == 5;
                    switch (aVar2.c(1, "Orientation")) {
                        case 3:
                        case 4:
                            i12 = 180;
                            break;
                        case 5:
                        case 8:
                            i12 = 270;
                            break;
                        case 6:
                        case 7:
                            i12 = 90;
                            break;
                        default:
                            i12 = 0;
                            break;
                    }
                    eVar = new e(i12, z10);
                }
                Exception exc2 = aVar.f22854c;
                if (exc2 != null) {
                    throw exc2;
                }
                options.inMutable = false;
                k kVar = bitmapFactoryDecoder.f22851b;
                ColorSpace colorSpace = kVar.f23100c;
                if (colorSpace != null) {
                    options.inPreferredColorSpace = colorSpace;
                }
                options.inPremultiplied = kVar.f23105h;
                int i13 = eVar.f22877b;
                Bitmap.Config config = kVar.f23099b;
                boolean z11 = eVar.f22876a;
                if ((z11 || i13 > 0) && (config == null || config == Bitmap.Config.HARDWARE)) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (kVar.f23104g && config == Bitmap.Config.ARGB_8888 && i.a(options.outMimeType, "image/jpeg")) {
                    config = Bitmap.Config.RGB_565;
                }
                Bitmap.Config config2 = options.outConfig;
                Bitmap.Config config3 = Bitmap.Config.RGBA_F16;
                if (config2 == config3 && config != Bitmap.Config.HARDWARE) {
                    config = config3;
                }
                options.inPreferredConfig = config;
                x.a aVarH = xVar.h();
                boolean z12 = aVarH instanceof z;
                Context context = kVar.f23098a;
                Z2.e eVar2 = kVar.f23101d;
                if (z12 && i.a(eVar2, Z2.e.f7731c)) {
                    options.inSampleSize = 1;
                    options.inScaled = true;
                    options.inDensity = ((z) aVarH).f22912c;
                    options.inTargetDensity = context.getResources().getDisplayMetrics().densityDpi;
                    i13 = i13;
                    z11 = z11;
                    context = context;
                } else {
                    int i14 = options.outWidth;
                    if (i14 <= 0 || (i10 = options.outHeight) <= 0) {
                        options.inSampleSize = 1;
                        options.inScaled = false;
                    } else {
                        int i15 = (i13 == 90 || i13 == 270) ? i10 : i14;
                        if (i13 != 90 && i13 != 270) {
                            i14 = i10;
                        }
                        Z2.e eVar3 = Z2.e.f7731c;
                        boolean zA = i.a(eVar2, eVar3);
                        Scale scale = kVar.f23102e;
                        int iE = zA ? i15 : coil.util.k.e(eVar2.f7732a, scale);
                        int iE2 = i.a(eVar2, eVar3) ? i14 : coil.util.k.e(eVar2.f7733b, scale);
                        int iHighestOneBit = Integer.highestOneBit(i15 / iE);
                        int iHighestOneBit2 = Integer.highestOneBit(i14 / iE2);
                        int iOrdinal2 = scale.ordinal();
                        if (iOrdinal2 != 0) {
                            i11 = 1;
                            if (iOrdinal2 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            iMin = Math.max(iHighestOneBit, iHighestOneBit2);
                        } else {
                            i11 = 1;
                            iMin = Math.min(iHighestOneBit, iHighestOneBit2);
                        }
                        if (iMin < i11) {
                            iMin = 1;
                        }
                        options.inSampleSize = iMin;
                        double d10 = i15;
                        i13 = i13;
                        double d11 = iMin;
                        context = context;
                        z11 = z11;
                        double d12 = ((double) i14) / d11;
                        double d13 = ((double) iE) / (d10 / d11);
                        double d14 = ((double) iE2) / d12;
                        int iOrdinal3 = scale.ordinal();
                        if (iOrdinal3 == 0) {
                            dMax = Math.max(d13, d14);
                        } else {
                            if (iOrdinal3 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            dMax = Math.min(d13, d14);
                        }
                        if (kVar.f23103f && dMax > 1.0d) {
                            dMax = 1.0d;
                        }
                        boolean z13 = dMax == 1.0d;
                        options.inScaled = !z13;
                        if (!z13) {
                            if (dMax > 1.0d) {
                                options.inDensity = Ka.a.a(((double) BrazeLogger.SUPPRESS) / dMax);
                                options.inTargetDensity = BrazeLogger.SUPPRESS;
                            } else {
                                options.inDensity = BrazeLogger.SUPPRESS;
                                options.inTargetDensity = Ka.a.a(((double) BrazeLogger.SUPPRESS) * dMax);
                            }
                        }
                    }
                }
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(cB.new a(), null, options);
                    b.n(cB, null);
                    Exception exc3 = aVar.f22854c;
                    if (exc3 != null) {
                        throw exc3;
                    }
                    if (bitmapDecodeStream == null) {
                        throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                    }
                    bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                    if (z11 || i13 > 0) {
                        Matrix matrix = new Matrix();
                        float width = bitmapDecodeStream.getWidth() / 2.0f;
                        float height = bitmapDecodeStream.getHeight() / 2.0f;
                        if (z11) {
                            matrix.postScale(-1.0f, 1.0f, width, height);
                        }
                        if (i13 > 0) {
                            matrix.postRotate(i13, width, height);
                        }
                        RectF rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                        matrix.mapRect(rectF);
                        float f10 = rectF.left;
                        if (f10 != 0.0f || rectF.top != 0.0f) {
                            matrix.postTranslate(-f10, -rectF.top);
                        }
                        if (i13 == 90 || i13 == 270) {
                            int height2 = bitmapDecodeStream.getHeight();
                            int width2 = bitmapDecodeStream.getWidth();
                            Bitmap.Config config4 = bitmapDecodeStream.getConfig();
                            if (config4 == null) {
                                config4 = Bitmap.Config.ARGB_8888;
                            }
                            bitmapCreateBitmap = Bitmap.createBitmap(height2, width2, config4);
                        } else {
                            int width3 = bitmapDecodeStream.getWidth();
                            int height3 = bitmapDecodeStream.getHeight();
                            Bitmap.Config config5 = bitmapDecodeStream.getConfig();
                            if (config5 == null) {
                                config5 = Bitmap.Config.ARGB_8888;
                            }
                            bitmapCreateBitmap = Bitmap.createBitmap(width3, height3, config5);
                        }
                        new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, g.f22880a);
                        bitmapDecodeStream.recycle();
                        bitmapDecodeStream = bitmapCreateBitmap;
                    }
                    return new c(new BitmapDrawable(context.getResources(), bitmapDecodeStream), options.inSampleSize > 1 || options.inScaled);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        b.n(cB, th);
                        throw th2;
                    }
                }
            case 2:
                return AppIdentityInjector.legacyRetrofit_delegate$lambda$6((AppIdentityInjector) obj);
            case 3:
                return IntercomArticleSearchActivity.args_delegate$lambda$1((IntercomArticleSearchActivity) obj);
            default:
                Pair pair = (Pair) ((p141l2.z) obj).f44334h.getValue();
                if (pair != null) {
                    return (String) pair.d();
                }
                return null;
        }
    }
}
