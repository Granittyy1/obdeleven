package p202q3;

import android.graphics.Rect;
import androidx.collection.C0891t;
import androidx.collection.Y;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.parser.moshi.a;
import com.braze.Constants;
import io.intercom.android.sdk.models.AttributeType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import p079g3.b;
import p079g3.p;
import p142l3.c;
import p164n3.j;
import p214r3.g;

/* JADX INFO: compiled from: LottieCompositionMoshiParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f46084a = JsonReader.a.a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final JsonReader.a f46085b = JsonReader.a.a("id", "layers", "w", "h", Constants.BRAZE_PUSH_PRIORITY_KEY, "u");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final JsonReader.a f46086c = JsonReader.a.a(AttributeType.LIST);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final JsonReader.a f46087d = JsonReader.a.a("cm", "tm", "dr");

    public static b a(a aVar) throws IOException {
        ArrayList arrayList;
        float f10;
        Y<c> y10;
        float f11;
        float f12;
        int i10;
        ArrayList arrayList2;
        float fC = g.c();
        C0891t<Layer> c0891t = new C0891t<>();
        ArrayList arrayList3 = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        Y<c> y11 = new Y<>();
        b bVar = new b();
        aVar.c();
        float fS = 0.0f;
        float fS2 = 0.0f;
        float fS3 = 0.0f;
        int iX = 0;
        int iX2 = 0;
        while (aVar.k()) {
            switch (aVar.N(f46084a)) {
                case 0:
                    arrayList = arrayList4;
                    iX = aVar.x();
                    break;
                case 1:
                    arrayList = arrayList4;
                    iX2 = aVar.x();
                    break;
                case 2:
                    arrayList = arrayList4;
                    fS = (float) aVar.s();
                    break;
                case 3:
                    arrayList = arrayList4;
                    f10 = fS;
                    fS2 = ((float) aVar.s()) - 0.01f;
                    map3 = map3;
                    fS = f10;
                    break;
                case 4:
                    arrayList = arrayList4;
                    f10 = fS;
                    fS3 = (float) aVar.s();
                    fS = f10;
                    break;
                case 5:
                    map3 = map3;
                    arrayList = arrayList4;
                    y10 = y11;
                    f10 = fS;
                    f11 = fS2;
                    f12 = fS3;
                    String[] strArrSplit = aVar.B().split("\\.");
                    int i11 = Integer.parseInt(strArrSplit[0]);
                    int i12 = Integer.parseInt(strArrSplit[1]);
                    int i13 = Integer.parseInt(strArrSplit[2]);
                    if (i11 < 4 || (i11 <= 4 && (i12 < 4 || (i12 <= 4 && i13 < 0)))) {
                        bVar.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    fS3 = f12;
                    y11 = y10;
                    map3 = map3;
                    fS2 = f11;
                    fS = f10;
                    break;
                case 6:
                    map3 = map3;
                    arrayList = arrayList4;
                    y10 = y11;
                    f10 = fS;
                    f11 = fS2;
                    f12 = fS3;
                    aVar.b();
                    int i14 = 0;
                    while (aVar.k()) {
                        Layer layerA = v.a(aVar, bVar);
                        if (layerA.f23448e == Layer.LayerType.f23468c) {
                            i14++;
                        }
                        arrayList3.add(layerA);
                        c0891t.e(layerA, layerA.f23447d);
                        if (i14 > 4) {
                            p214r3.c.b("You have " + i14 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                    }
                    aVar.h();
                    fS3 = f12;
                    y11 = y10;
                    map3 = map3;
                    fS2 = f11;
                    fS = f10;
                    break;
                case 7:
                    arrayList = arrayList4;
                    y10 = y11;
                    f12 = fS3;
                    aVar.b();
                    while (aVar.k()) {
                        ArrayList arrayList5 = new ArrayList();
                        C0891t c0891t2 = new C0891t();
                        aVar.c();
                        HashMap map4 = map3;
                        String strB = null;
                        String strB2 = null;
                        int iX3 = 0;
                        int iX4 = 0;
                        while (aVar.k()) {
                            fS2 = fS2;
                            int iN = aVar.N(f46085b);
                            if (iN != 0) {
                                float f13 = fS;
                                if (iN != 1) {
                                    if (iN == 2) {
                                        iX3 = aVar.x();
                                    } else if (iN == 3) {
                                        iX4 = aVar.x();
                                    } else if (iN == 4) {
                                        strB2 = aVar.B();
                                    } else if (iN != 5) {
                                        aVar.R();
                                        aVar.S();
                                        i10 = iX4;
                                    } else {
                                        aVar.B();
                                    }
                                    fS = f13;
                                } else {
                                    aVar.b();
                                    while (aVar.k()) {
                                        Layer layerA2 = v.a(aVar, bVar);
                                        c0891t2.e(layerA2, layerA2.f23447d);
                                        arrayList5.add(layerA2);
                                        iX4 = iX4;
                                    }
                                    i10 = iX4;
                                    aVar.h();
                                }
                                fS = f13;
                                iX4 = i10;
                            } else {
                                strB = aVar.B();
                            }
                        }
                        float f14 = fS;
                        int i15 = iX4;
                        float f15 = fS2;
                        aVar.i();
                        if (strB2 != null) {
                            map2.put(strB, new p(iX3, i15, strB, strB2));
                        } else {
                            map.put(strB, arrayList5);
                        }
                        map3 = map4;
                        fS2 = f15;
                        fS = f14;
                    }
                    map3 = map3;
                    f10 = fS;
                    f11 = fS2;
                    aVar.h();
                    fS3 = f12;
                    y11 = y10;
                    map3 = map3;
                    fS2 = f11;
                    fS = f10;
                    break;
                case 8:
                    arrayList = arrayList4;
                    f12 = fS3;
                    aVar.c();
                    while (aVar.k()) {
                        if (aVar.N(f46086c) != 0) {
                            aVar.R();
                            aVar.S();
                        } else {
                            aVar.b();
                            while (aVar.k()) {
                                JsonReader.a aVar2 = n.f46068a;
                                aVar.c();
                                String strB3 = null;
                                String strB4 = null;
                                String strB5 = null;
                                while (aVar.k()) {
                                    int iN2 = aVar.N(n.f46068a);
                                    if (iN2 != 0) {
                                        Y<c> y12 = y11;
                                        if (iN2 == 1) {
                                            strB4 = aVar.B();
                                        } else if (iN2 == 2) {
                                            strB5 = aVar.B();
                                        } else if (iN2 != 3) {
                                            aVar.R();
                                            aVar.S();
                                        } else {
                                            aVar.s();
                                        }
                                        y11 = y12;
                                    } else {
                                        strB3 = aVar.B();
                                    }
                                }
                                aVar.i();
                                map3.put(strB4, new p142l3.b(strB3, strB4, strB5));
                                y11 = y11;
                            }
                            aVar.h();
                        }
                    }
                    y10 = y11;
                    aVar.i();
                    map3 = map3;
                    f10 = fS;
                    f11 = fS2;
                    fS3 = f12;
                    y11 = y10;
                    map3 = map3;
                    fS2 = f11;
                    fS = f10;
                    break;
                case 9:
                    f12 = fS3;
                    aVar.b();
                    while (aVar.k()) {
                        JsonReader.a aVar3 = m.f46066a;
                        ArrayList arrayList6 = new ArrayList();
                        aVar.c();
                        String strB6 = null;
                        String strB7 = null;
                        double dS = 0.0d;
                        char cCharAt = 0;
                        while (aVar.k()) {
                            int iN3 = aVar.N(m.f46066a);
                            if (iN3 != 0) {
                                arrayList2 = arrayList4;
                                if (iN3 == 1) {
                                    aVar.s();
                                } else if (iN3 == 2) {
                                    dS = aVar.s();
                                } else if (iN3 == 3) {
                                    strB6 = aVar.B();
                                } else if (iN3 == 4) {
                                    strB7 = aVar.B();
                                } else if (iN3 != 5) {
                                    aVar.R();
                                    aVar.S();
                                } else {
                                    aVar.c();
                                    while (aVar.k()) {
                                        if (aVar.N(m.f46067b) != 0) {
                                            aVar.R();
                                            aVar.S();
                                        } else {
                                            aVar.b();
                                            while (aVar.k()) {
                                                arrayList6.add((j) C2764h.a(aVar, bVar));
                                            }
                                            aVar.h();
                                        }
                                    }
                                    aVar.i();
                                }
                            } else {
                                arrayList2 = arrayList4;
                                cCharAt = aVar.B().charAt(0);
                            }
                            arrayList4 = arrayList2;
                        }
                        ArrayList arrayList7 = arrayList4;
                        aVar.i();
                        c cVar = new c(arrayList6, cCharAt, dS, strB6, strB7);
                        y11.e(cVar.hashCode(), cVar);
                        arrayList4 = arrayList7;
                    }
                    arrayList = arrayList4;
                    aVar.h();
                    y10 = y11;
                    f10 = fS;
                    f11 = fS2;
                    fS3 = f12;
                    y11 = y10;
                    map3 = map3;
                    fS2 = f11;
                    fS = f10;
                    break;
                case 10:
                    aVar.b();
                    while (aVar.k()) {
                        aVar.c();
                        while (aVar.k()) {
                            int iN4 = aVar.N(f46087d);
                            if (iN4 != 0) {
                                float f16 = fS3;
                                if (iN4 == 1 || iN4 == 2) {
                                    aVar.s();
                                } else {
                                    aVar.R();
                                    aVar.S();
                                }
                                fS3 = f16;
                            } else {
                                aVar.B();
                            }
                        }
                        aVar.i();
                        arrayList4.add(new G0.a());
                        fS3 = fS3;
                    }
                    f12 = fS3;
                    aVar.h();
                    arrayList = arrayList4;
                    y10 = y11;
                    f10 = fS;
                    f11 = fS2;
                    fS3 = f12;
                    y11 = y10;
                    map3 = map3;
                    fS2 = f11;
                    fS = f10;
                    break;
                default:
                    aVar.R();
                    aVar.S();
                    map3 = map3;
                    arrayList = arrayList4;
                    y10 = y11;
                    f10 = fS;
                    f11 = fS2;
                    f12 = fS3;
                    fS3 = f12;
                    y11 = y10;
                    map3 = map3;
                    fS2 = f11;
                    fS = f10;
                    break;
            }
            arrayList4 = arrayList;
        }
        bVar.f35560i = new Rect(0, 0, (int) (iX * fC), (int) (iX2 * fC));
        bVar.j = fS;
        bVar.f35561k = fS2;
        bVar.f35562l = fS3;
        bVar.f35559h = arrayList3;
        bVar.f35558g = c0891t;
        bVar.f35554c = map;
        bVar.f35555d = map2;
        bVar.f35557f = y11;
        bVar.f35556e = map3;
        return bVar;
    }
}
