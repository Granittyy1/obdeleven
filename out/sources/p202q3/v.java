package p202q3;

import android.graphics.Color;
import android.view.animation.Interpolator;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.parser.moshi.a;
import com.braze.Constants;
import java.io.IOException;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.R;
import p005a4.t;
import p079g3.b;
import p154m3.d;
import p154m3.i;
import p154m3.j;
import p214r3.c;
import p214r3.g;

/* JADX INFO: compiled from: LayerParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f46081a = JsonReader.a.a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", Constants.BRAZE_PUSH_TITLE_KEY, "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final JsonReader.a f46082b = JsonReader.a.a(Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, Constants.BRAZE_PUSH_CONTENT_KEY);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final JsonReader.a f46083c = JsonReader.a.a("ty", "nm");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:182:0x035a  */
    /* JADX WARN: Code duplicated, block: B:204:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:78:0x019b  */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x005a. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r3v16, types: [com.airbnb.lottie.model.content.Mask$MaskMode] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v67 */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v69 */
    /* JADX WARN: Type inference failed for: r3v70 */
    /* JADX WARN: Type inference failed for: r3v71 */
    /* JADX WARN: Type inference failed for: r3v72 */
    /* JADX WARN: Type inference failed for: r3v73 */
    /* JADX WARN: Type inference failed for: r4v10, types: [m3.g] */
    /* JADX WARN: Type inference failed for: r4v11, types: [E3.b] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v52 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static Layer a(a aVar, b bVar) throws IOException {
        boolean z10;
        ?? r13;
        p154m3.b bVar2;
        p154m3.b bVar3;
        p154m3.b bVar4;
        p154m3.b bVar5;
        ?? r10;
        boolean z11 = true;
        Layer.MatteType matteType = Layer.MatteType.f23471b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        aVar.c();
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        String strB = "UNSET";
        long jX = 0;
        boolean z12 = false;
        long jX2 = -1;
        Layer.MatteType matteType2 = matteType;
        float fS = 0.0f;
        float fS2 = 0.0f;
        float fS3 = 0.0f;
        float fS4 = 0.0f;
        float fS5 = 0.0f;
        int iC = 0;
        int iC2 = 0;
        int color = 0;
        boolean zP = false;
        Layer.LayerType layerType = null;
        String strB2 = null;
        j jVarA = null;
        float fS6 = 1.0f;
        i iVar = null;
        androidx.compose.ui.autofill.a aVar2 = null;
        p154m3.b bVarB = null;
        t tVar = null;
        C2766j c2766j = null;
        String strB3 = null;
        while (aVar.k()) {
            switch (aVar.N(f46081a)) {
                case 0:
                    strB = aVar.B();
                    break;
                case 1:
                    jX = aVar.x();
                    z11 = z11;
                    break;
                case 2:
                    strB2 = aVar.B();
                    break;
                case 3:
                    z10 = z11;
                    int iX = aVar.x();
                    layerType = iX < 6 ? Layer.LayerType.values()[iX] : Layer.LayerType.f23469d;
                    z11 = z10;
                    break;
                case 4:
                    jX2 = aVar.x();
                    z11 = z11;
                    break;
                case 5:
                    iC = (int) (g.c() * aVar.x());
                    break;
                case 6:
                    iC2 = (int) (g.c() * aVar.x());
                    break;
                case 7:
                    color = Color.parseColor(aVar.B());
                    break;
                case 8:
                    jVarA = C2759c.a(aVar, bVar);
                    break;
                case 9:
                    int iX2 = aVar.x();
                    if (iX2 < Layer.MatteType.values().length) {
                        matteType2 = Layer.MatteType.values()[iX2];
                        int iOrdinal = matteType2.ordinal();
                        if (iOrdinal == 3) {
                            bVar.a("Unsupported matte type: Luma");
                        } else if (iOrdinal == 4) {
                            bVar.a("Unsupported matte type: Luma Inverted");
                        }
                        z10 = true;
                        bVar.f35564n++;
                        z11 = z10;
                    } else {
                        bVar.a("Unsupported matte type: " + iX2);
                        z11 = true;
                    }
                    break;
                case 10:
                    d dVarD = null;
                    aVar.b();
                    while (aVar.k()) {
                        aVar.c();
                        d dVar = dVarD;
                        ?? gVar = dVar;
                        boolean zP2 = false;
                        ?? r11 = dVar;
                        while (aVar.k()) {
                            String strO0 = aVar.o0();
                            strO0.getClass();
                            switch (strO0.hashCode()) {
                                case R.styleable.AppCompatTheme_textColorSearchUrl /* 111 */:
                                    if (!strO0.equals("o")) {
                                        r13 = -1;
                                    } else {
                                        r13 = 0;
                                    }
                                    break;
                                case 3588:
                                    if (!strO0.equals("pt")) {
                                        r13 = -1;
                                    } else {
                                        r13 = z11;
                                    }
                                    break;
                                case 104433:
                                    if (!strO0.equals("inv")) {
                                        r13 = -1;
                                    } else {
                                        r13 = 2;
                                    }
                                    break;
                                case 3357091:
                                    if (!strO0.equals("mode")) {
                                        r13 = -1;
                                    } else {
                                        r13 = 3;
                                    }
                                    break;
                                default:
                                    r13 = -1;
                                    break;
                            }
                            switch (r13) {
                                case 0:
                                    dVarD = C2760d.d(aVar, bVar);
                                    break;
                                case 1:
                                    gVar = new p154m3.g(5, u.a(aVar, bVar, g.c(), F.f46033a, false));
                                    break;
                                case 2:
                                    zP2 = aVar.p();
                                    r11 = r11;
                                    break;
                                case 3:
                                    String strB4 = aVar.B();
                                    strB4.getClass();
                                    Mask.MaskMode maskMode = Mask.MaskMode.f23386b;
                                    switch (strB4) {
                                        case "a":
                                            r11 = maskMode;
                                            break;
                                        case "i":
                                            bVar.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                            r11 = Mask.MaskMode.f23388d;
                                            break;
                                        case "n":
                                            r11 = Mask.MaskMode.f23389e;
                                            break;
                                        case "s":
                                            r11 = Mask.MaskMode.f23387c;
                                            break;
                                        default:
                                            c.b("Unknown mask mode " + strO0 + ". Defaulting to Add.");
                                            r11 = maskMode;
                                            break;
                                    }
                                    break;
                                default:
                                    aVar.S();
                                    r11 = r11;
                                    break;
                            }
                            z11 = true;
                            r11 = r11;
                            gVar = gVar;
                        }
                        aVar.i();
                        arrayList.add(new Mask(r11, gVar, dVarD, zP2));
                        dVarD = null;
                        z11 = true;
                    }
                    z12 = false;
                    bVar.f35564n += arrayList.size();
                    aVar.h();
                    z11 = true;
                    break;
                case 11:
                    aVar.b();
                    while (aVar.k()) {
                        p164n3.b bVarA = C2764h.a(aVar, bVar);
                        if (bVarA != null) {
                            arrayList2.add(bVarA);
                        }
                    }
                    aVar.h();
                    z12 = false;
                    z11 = true;
                    break;
                case 12:
                    aVar.c();
                    while (aVar.k()) {
                        int iN = aVar.N(f46082b);
                        if (iN == 0) {
                            iVar = new i(5, u.a(aVar, bVar, g.c(), C2765i.f46051a, false));
                        } else if (iN != z11) {
                            aVar.R();
                            aVar.S();
                        } else {
                            aVar.b();
                            if (aVar.k()) {
                                JsonReader.a aVar3 = C2758b.f46042a;
                                aVar.c();
                                androidx.compose.ui.autofill.a aVar4 = null;
                                while (aVar.k()) {
                                    if (aVar.N(C2758b.f46042a) != 0) {
                                        aVar.R();
                                        aVar.S();
                                    } else {
                                        aVar.c();
                                        p154m3.a aVarA = null;
                                        p154m3.a aVarA2 = null;
                                        p154m3.b bVarB2 = null;
                                        p154m3.b bVarB3 = null;
                                        while (aVar.k()) {
                                            int iN2 = aVar.N(C2758b.f46043b);
                                            if (iN2 == 0) {
                                                aVarA = C2760d.a(aVar, bVar);
                                            } else if (iN2 == z11) {
                                                aVarA2 = C2760d.a(aVar, bVar);
                                            } else if (iN2 == 2) {
                                                bVarB2 = C2760d.b(aVar, bVar, z11);
                                            } else if (iN2 != 3) {
                                                aVar.R();
                                                aVar.S();
                                            } else {
                                                bVarB3 = C2760d.b(aVar, bVar, z11);
                                            }
                                        }
                                        aVar.i();
                                        aVar4 = new androidx.compose.ui.autofill.a(aVarA, aVarA2, bVarB2, bVarB3);
                                    }
                                }
                                aVar.i();
                                if (aVar4 == null) {
                                    aVar4 = new androidx.compose.ui.autofill.a(null, null, null, null);
                                }
                                aVar2 = aVar4;
                            }
                            while (aVar.k()) {
                                aVar.S();
                            }
                            aVar.h();
                        }
                    }
                    aVar.i();
                    z12 = false;
                    break;
                case 13:
                    aVar.b();
                    ArrayList arrayList3 = new ArrayList();
                    while (aVar.k()) {
                        aVar.c();
                        while (aVar.k()) {
                            int iN3 = aVar.N(f46083c);
                            if (iN3 == 0) {
                                int iX3 = aVar.x();
                                if (iX3 == 29) {
                                    JsonReader.a aVar5 = C2761e.f46046a;
                                    tVar = null;
                                    while (aVar.k()) {
                                        if (aVar.N(C2761e.f46046a) != 0) {
                                            aVar.R();
                                            aVar.S();
                                        } else {
                                            aVar.b();
                                            while (aVar.k()) {
                                                aVar.c();
                                                boolean z13 = z12;
                                                t tVar2 = null;
                                                while (aVar.k()) {
                                                    int iN4 = aVar.N(C2761e.f46047b);
                                                    if (iN4 == 0) {
                                                        z13 = aVar.x() == 0 ? z11 : z12;
                                                    } else if (iN4 != z11) {
                                                        aVar.R();
                                                        aVar.S();
                                                    } else if (z13) {
                                                        tVar2 = new t(C2760d.b(aVar, bVar, z11));
                                                    } else {
                                                        aVar.S();
                                                    }
                                                }
                                                aVar.i();
                                                if (tVar2 != null) {
                                                    tVar = tVar2;
                                                }
                                            }
                                            aVar.h();
                                        }
                                    }
                                } else if (iX3 == 25) {
                                    C2767k c2767k = new C2767k();
                                    while (aVar.k()) {
                                        if (aVar.N(C2767k.f46058f) != 0) {
                                            aVar.R();
                                            aVar.S();
                                        } else {
                                            aVar.b();
                                            while (aVar.k()) {
                                                aVar.c();
                                                String strB5 = "";
                                                while (aVar.k()) {
                                                    int iN5 = aVar.N(C2767k.f46059g);
                                                    if (iN5 == 0) {
                                                        strB5 = aVar.B();
                                                    } else if (iN5 == z11) {
                                                        strB5.getClass();
                                                        switch (strB5.hashCode()) {
                                                            case 353103893:
                                                                if (!strB5.equals("Distance")) {
                                                                    r10 = -1;
                                                                } else {
                                                                    r10 = z12;
                                                                }
                                                                break;
                                                            case 397447147:
                                                                if (!strB5.equals("Opacity")) {
                                                                    r10 = -1;
                                                                } else {
                                                                    r10 = z11;
                                                                }
                                                                break;
                                                            case 1041377119:
                                                                if (!strB5.equals("Direction")) {
                                                                    r10 = -1;
                                                                } else {
                                                                    r10 = 2;
                                                                }
                                                                break;
                                                            case 1379387491:
                                                                if (!strB5.equals("Shadow Color")) {
                                                                    r10 = -1;
                                                                } else {
                                                                    r10 = 3;
                                                                }
                                                                break;
                                                            case 1383710113:
                                                                if (!strB5.equals("Softness")) {
                                                                    r10 = -1;
                                                                } else {
                                                                    r10 = 4;
                                                                }
                                                                break;
                                                            default:
                                                                r10 = -1;
                                                                break;
                                                        }
                                                        switch (r10) {
                                                            case 0:
                                                                c2767k.f46063d = C2760d.b(aVar, bVar, z11);
                                                                break;
                                                            case 1:
                                                                c2767k.f46061b = C2760d.b(aVar, bVar, z12);
                                                                break;
                                                            case 2:
                                                                c2767k.f46062c = C2760d.b(aVar, bVar, z12);
                                                                break;
                                                            case 3:
                                                                c2767k.f46060a = C2760d.a(aVar, bVar);
                                                                break;
                                                            case 4:
                                                                c2767k.f46064e = C2760d.b(aVar, bVar, z11);
                                                                break;
                                                            default:
                                                                aVar.S();
                                                                break;
                                                        }
                                                    } else {
                                                        aVar.R();
                                                        aVar.S();
                                                    }
                                                }
                                                aVar.i();
                                            }
                                            aVar.h();
                                        }
                                    }
                                    p154m3.a aVar6 = c2767k.f46060a;
                                    c2766j = (aVar6 == null || (bVar2 = c2767k.f46061b) == null || (bVar3 = c2767k.f46062c) == null || (bVar4 = c2767k.f46063d) == null || (bVar5 = c2767k.f46064e) == null) ? null : new C2766j(aVar6, bVar2, bVar3, bVar4, bVar5);
                                }
                            } else if (iN3 != z11) {
                                aVar.R();
                                aVar.S();
                            } else {
                                arrayList3.add(aVar.B());
                            }
                            z12 = false;
                        }
                        aVar.i();
                        z12 = false;
                    }
                    aVar.h();
                    bVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                    z12 = false;
                    break;
                case 14:
                    fS6 = (float) aVar.s();
                    break;
                case 15:
                    fS2 = (float) aVar.s();
                    break;
                case 16:
                    fS3 = (float) (aVar.s() * ((double) g.c()));
                    break;
                case 17:
                    fS4 = (float) (aVar.s() * ((double) g.c()));
                    break;
                case 18:
                    fS = (float) aVar.s();
                    break;
                case 19:
                    fS5 = (float) aVar.s();
                    break;
                case 20:
                    bVarB = C2760d.b(aVar, bVar, z12);
                    break;
                case 21:
                    strB3 = aVar.B();
                    break;
                case 22:
                    zP = aVar.p();
                    break;
                default:
                    aVar.R();
                    aVar.S();
                    z11 = true;
                    break;
            }
        }
        aVar.i();
        ArrayList arrayList4 = new ArrayList();
        if (fS > 0.0f) {
            arrayList4.add(new p225s3.a(bVar, fValueOf, fValueOf, (Interpolator) null, 0.0f, Float.valueOf(fS)));
        }
        if (fS5 <= 0.0f) {
            fS5 = bVar.f35561k;
        }
        arrayList4.add(new p225s3.a(bVar, fValueOf2, fValueOf2, (Interpolator) null, fS, Float.valueOf(fS5)));
        arrayList4.add(new p225s3.a(bVar, fValueOf, fValueOf, (Interpolator) null, fS5, Float.valueOf(Float.MAX_VALUE)));
        if (strB.endsWith(".ai") || "ai".equals(strB3)) {
            bVar.a("Convert your Illustrator layers to shape layers.");
        }
        return new Layer(arrayList2, bVar, strB, jX, layerType, jX2, strB2, arrayList, jVarA, iC, iC2, color, fS6, fS2, fS3, fS4, iVar, aVar2, arrayList4, matteType2, bVarB, zP, tVar, c2766j);
    }
}
