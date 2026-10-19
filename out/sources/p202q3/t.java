package p202q3;

import C0.a;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.braze.Constants;
import java.io.IOException;
import p079g3.b;
import p214r3.f;
import p214r3.g;

/* JADX INFO: compiled from: KeyframeParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f46077a = new LinearInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final JsonReader.a f46078b = JsonReader.a.a(Constants.BRAZE_PUSH_TITLE_KEY, Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, "e", "o", "i", "h", "to", "ti");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final JsonReader.a f46079c = JsonReader.a.a("x", "y");

    public static Interpolator a(PointF pointF, PointF pointF2) {
        pointF.x = f.b(pointF.x, -1.0f, 1.0f);
        pointF.y = f.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = f.b(pointF2.x, -1.0f, 1.0f);
        float fB = f.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        g.a aVar = g.f46332a;
        try {
            return a.b(pointF.x, pointF.y, pointF2.x, fB);
        } catch (IllegalArgumentException e10) {
            return "The Path cannot loop back on itself.".equals(e10.getMessage()) ? a.b(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
    }

    /* JADX WARN: Code duplicated, block: B:98:0x01f7  */
    public static <T> p225s3.a<T> b(JsonReader jsonReader, b bVar, float f10, L<T> l10, boolean z10, boolean z11) throws IOException {
        T t8;
        Interpolator interpolatorA;
        Interpolator interpolatorA2;
        Interpolator interpolatorA3;
        T t10;
        p225s3.a<T> aVar;
        T t11;
        float f11;
        LinearInterpolator linearInterpolator = f46077a;
        JsonReader.a aVar2 = f46078b;
        if (!z10 || !z11) {
            JsonReader.a aVar3 = aVar2;
            if (!z10) {
                return new p225s3.a<>(l10.a(jsonReader, f10));
            }
            jsonReader.c();
            T tA = null;
            PointF pointFB = null;
            boolean z12 = false;
            float fS = 0.0f;
            PointF pointFB2 = null;
            PointF pointFB3 = null;
            PointF pointFB4 = null;
            T tA2 = null;
            while (jsonReader.k()) {
                JsonReader.a aVar4 = aVar3;
                switch (jsonReader.N(aVar4)) {
                    case 0:
                        fS = (float) jsonReader.s();
                        break;
                    case 1:
                        tA = l10.a(jsonReader, f10);
                        break;
                    case 2:
                        tA2 = l10.a(jsonReader, f10);
                        break;
                    case 3:
                        pointFB2 = s.b(jsonReader, 1.0f);
                        break;
                    case 4:
                        pointFB = s.b(jsonReader, 1.0f);
                        break;
                    case 5:
                        z12 = jsonReader.x() == 1;
                        break;
                    case 6:
                        pointFB3 = s.b(jsonReader, f10);
                        break;
                    case 7:
                        pointFB4 = s.b(jsonReader, f10);
                        break;
                    default:
                        jsonReader.S();
                        break;
                }
                aVar3 = aVar4;
            }
            jsonReader.i();
            if (!z12) {
                if (pointFB2 == null || pointFB == null) {
                    t8 = tA2;
                } else {
                    interpolatorA = a(pointFB2, pointFB);
                    t8 = tA2;
                }
                p225s3.a<T> aVar5 = new p225s3.a<>(bVar, tA, t8, interpolatorA, fS, (Float) null);
                aVar5.f46898o = pointFB3;
                aVar5.f46899p = pointFB4;
                return aVar5;
            }
            t8 = tA;
            interpolatorA = linearInterpolator;
            p225s3.a<T> aVar6 = new p225s3.a<>(bVar, tA, t8, interpolatorA, fS, (Float) null);
            aVar6.f46898o = pointFB3;
            aVar6.f46899p = pointFB4;
            return aVar6;
        }
        jsonReader.c();
        PointF pointF = null;
        PointF pointFB5 = null;
        PointF pointFB6 = null;
        boolean z13 = false;
        PointF pointFB7 = null;
        PointF pointFB8 = null;
        PointF pointF2 = null;
        T tA3 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        float fS2 = 0.0f;
        T tA4 = null;
        while (jsonReader.k()) {
            int iN = jsonReader.N(aVar2);
            JsonReader.Token token = JsonReader.Token.f23518d;
            linearInterpolator = linearInterpolator;
            JsonReader.Token token2 = JsonReader.Token.f23522h;
            aVar2 = aVar2;
            JsonReader.a aVar7 = f46079c;
            switch (iN) {
                case 0:
                    fS2 = (float) jsonReader.s();
                    break;
                case 1:
                    tA3 = l10.a(jsonReader, f10);
                    break;
                case 2:
                    tA4 = l10.a(jsonReader, f10);
                    break;
                case 3:
                    PointF pointF5 = pointFB5;
                    PointF pointF6 = pointFB6;
                    tA3 = tA3;
                    if (jsonReader.C() == token) {
                        jsonReader.c();
                        float fS3 = 0.0f;
                        float fS4 = 0.0f;
                        float fS5 = 0.0f;
                        float fS6 = 0.0f;
                        while (jsonReader.k()) {
                            int iN2 = jsonReader.N(aVar7);
                            if (iN2 != 0) {
                                if (iN2 != 1) {
                                    jsonReader.S();
                                } else if (jsonReader.C() == token2) {
                                    fS6 = (float) jsonReader.s();
                                    fS4 = fS6;
                                } else {
                                    jsonReader.b();
                                    fS4 = (float) jsonReader.s();
                                    fS6 = jsonReader.C() == token2 ? (float) jsonReader.s() : fS4;
                                    jsonReader.h();
                                }
                            } else if (jsonReader.C() == token2) {
                                fS5 = (float) jsonReader.s();
                                fS3 = fS5;
                            } else {
                                jsonReader.b();
                                fS3 = (float) jsonReader.s();
                                fS5 = jsonReader.C() == token2 ? (float) jsonReader.s() : fS3;
                                jsonReader.h();
                            }
                        }
                        PointF pointF7 = new PointF(fS3, fS4);
                        pointF3 = new PointF(fS5, fS6);
                        jsonReader.i();
                        pointF2 = pointF7;
                    } else {
                        pointFB7 = s.b(jsonReader, f10);
                    }
                    pointFB6 = pointF6;
                    pointFB5 = pointF5;
                    continue;
                case 4:
                    PointF pointF8 = pointFB6;
                    if (jsonReader.C() == token) {
                        jsonReader.c();
                        float fS7 = 0.0f;
                        float f12 = 0.0f;
                        float fS8 = 0.0f;
                        float fS9 = 0.0f;
                        while (jsonReader.k()) {
                            pointFB5 = pointFB5;
                            int iN3 = jsonReader.N(aVar7);
                            if (iN3 != 0) {
                                t11 = tA3;
                                if (iN3 != 1) {
                                    jsonReader.S();
                                    tA3 = t11;
                                } else if (jsonReader.C() == token2) {
                                    fS9 = (float) jsonReader.s();
                                    tA3 = t11;
                                    f12 = fS9;
                                } else {
                                    jsonReader.b();
                                    float fS10 = (float) jsonReader.s();
                                    if (jsonReader.C() == token2) {
                                        f11 = fS10;
                                        fS9 = (float) jsonReader.s();
                                    } else {
                                        f11 = fS10;
                                        fS9 = f11;
                                    }
                                    jsonReader.h();
                                    f12 = f11;
                                    tA3 = t11;
                                }
                            } else {
                                t11 = tA3;
                                if (jsonReader.C() == token2) {
                                    fS8 = (float) jsonReader.s();
                                    tA3 = t11;
                                    fS7 = fS8;
                                } else {
                                    jsonReader.b();
                                    fS7 = (float) jsonReader.s();
                                    fS8 = jsonReader.C() == token2 ? (float) jsonReader.s() : fS7;
                                    jsonReader.h();
                                    tA3 = t11;
                                }
                            }
                        }
                        PointF pointF9 = new PointF(fS7, f12);
                        pointF = new PointF(fS8, fS9);
                        jsonReader.i();
                        pointF4 = pointF9;
                    } else {
                        pointFB8 = s.b(jsonReader, f10);
                    }
                    pointFB6 = pointF8;
                    break;
                case 5:
                    z13 = jsonReader.x() == 1;
                    break;
                case 6:
                    pointFB5 = s.b(jsonReader, f10);
                    break;
                case 7:
                    pointFB6 = s.b(jsonReader, f10);
                    break;
                default:
                    jsonReader.S();
                    break;
            }
        }
        Interpolator interpolatorA4 = linearInterpolator;
        PointF pointF10 = pointFB5;
        PointF pointF11 = pointFB6;
        T t12 = tA3;
        jsonReader.i();
        if (z13) {
            t10 = t12;
        } else {
            if (pointFB7 == null || pointFB8 == null) {
                if (pointF2 != null && pointF3 != null && pointF4 != null && pointF != null) {
                    interpolatorA2 = a(pointF2, pointF4);
                    interpolatorA3 = a(pointF3, pointF);
                    t10 = tA4;
                    interpolatorA4 = null;
                }
                if (interpolatorA2 != null || interpolatorA3 == null) {
                    aVar = new p225s3.a<>(bVar, t12, t10, interpolatorA4, fS2, (Float) null);
                } else {
                    aVar = new p225s3.a<>(bVar, t12, t10, interpolatorA2, interpolatorA3, fS2);
                }
                aVar.f46898o = pointF10;
                aVar.f46899p = pointF11;
                return aVar;
            }
            interpolatorA4 = a(pointFB7, pointFB8);
            t10 = tA4;
        }
        interpolatorA2 = null;
        interpolatorA3 = null;
        if (interpolatorA2 != null) {
            aVar = new p225s3.a<>(bVar, t12, t10, interpolatorA4, fS2, (Float) null);
        } else {
            aVar = new p225s3.a<>(bVar, t12, t10, interpolatorA4, fS2, (Float) null);
        }
        aVar.f46898o = pointF10;
        aVar.f46899p = pointF11;
        return aVar;
    }
}
