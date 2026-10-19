package p202q3;

import android.graphics.Path;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.MergePaths;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.parser.moshi.a;
import com.braze.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import p154m3.c;
import p154m3.d;
import p154m3.e;
import p154m3.k;
import p164n3.b;
import p164n3.f;
import p164n3.g;
import p164n3.i;
import p164n3.j;

/* JADX INFO: renamed from: q3.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ContentModelParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class C2764h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f46050a = JsonReader.a.a("ty", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:122:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    /* JADX WARN: Code duplicated, block: B:428:0x0745 A[LOOP:1: B:426:0x073f->B:428:0x0745, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v29, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v38, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v43 */
    /* JADX WARN: Type inference failed for: r13v44 */
    /* JADX WARN: Type inference failed for: r22v16 */
    /* JADX WARN: Type inference failed for: r22v17, types: [m3.b] */
    /* JADX WARN: Type inference failed for: r22v18 */
    /* JADX WARN: Type inference failed for: r22v19 */
    /* JADX WARN: Type inference failed for: r22v20 */
    /* JADX WARN: Type inference failed for: r22v21 */
    /* JADX WARN: Type inference failed for: r22v22 */
    /* JADX WARN: Type inference failed for: r22v23 */
    /* JADX WARN: Type inference failed for: r22v24 */
    /* JADX WARN: Type inference failed for: r22v25 */
    /* JADX WARN: Type inference failed for: r22v26 */
    /* JADX WARN: Type inference failed for: r22v27 */
    /* JADX WARN: Type inference failed for: r22v28 */
    /* JADX WARN: Type inference failed for: r22v29 */
    /* JADX WARN: Type inference failed for: r22v30 */
    /* JADX WARN: Type inference failed for: r22v31 */
    /* JADX WARN: Type inference failed for: r22v32 */
    /* JADX WARN: Type inference failed for: r22v33 */
    /* JADX WARN: Type inference failed for: r22v34 */
    public static b a(a aVar, p079g3.b bVar) throws IOException {
        b iVar;
        String strB;
        b aVar2;
        ShapeTrimPath.Type type;
        boolean zP = false;
        aVar.c();
        int iX = 2;
        while (true) {
            iVar = null;
            if (!aVar.k()) {
                strB = null;
                break;
            }
            int iN = aVar.N(f46050a);
            if (iN == 0) {
                strB = aVar.B();
                break;
            }
            if (iN != 1) {
                aVar.R();
                aVar.S();
            } else {
                iX = aVar.x();
            }
        }
        if (strB == null) {
            return null;
        }
        GradientType gradientType = GradientType.f23380c;
        GradientType gradientType2 = GradientType.f23379b;
        switch (strB) {
            case "el":
                JsonReader.a aVar3 = C2762f.f46048a;
                boolean z10 = iX == 3;
                boolean zP2 = false;
                String strB2 = null;
                k kVarB = null;
                e eVarE = null;
                while (aVar.k()) {
                    int iN2 = aVar.N(C2762f.f46048a);
                    if (iN2 == 0) {
                        strB2 = aVar.B();
                    } else if (iN2 == 1) {
                        kVarB = C2757a.b(aVar, bVar);
                    } else if (iN2 == 2) {
                        eVarE = C2760d.e(aVar, bVar);
                    } else if (iN2 == 3) {
                        zP2 = aVar.p();
                    } else if (iN2 != 4) {
                        aVar.R();
                        aVar.S();
                    } else {
                        z10 = aVar.x() == 3;
                    }
                }
                aVar2 = new p164n3.a(strB2, kVarB, eVarE, z10, zP2);
                iVar = aVar2;
                while (aVar.k()) {
                    aVar.S();
                }
                aVar.i();
                return iVar;
            case "fl":
                JsonReader.a aVar4 = G.f46035a;
                boolean zP3 = false;
                boolean zP4 = false;
                int iX2 = 1;
                d dVarD = null;
                String strB3 = null;
                p154m3.a aVarA = null;
                while (aVar.k()) {
                    int iN3 = aVar.N(G.f46035a);
                    if (iN3 == 0) {
                        strB3 = aVar.B();
                    } else if (iN3 == 1) {
                        aVarA = C2760d.a(aVar, bVar);
                    } else if (iN3 == 2) {
                        dVarD = C2760d.d(aVar, bVar);
                    } else if (iN3 == 3) {
                        zP3 = aVar.p();
                    } else if (iN3 == 4) {
                        iX2 = aVar.x();
                    } else if (iN3 != 5) {
                        aVar.R();
                        aVar.S();
                    } else {
                        zP4 = aVar.p();
                    }
                }
                iVar = new i(strB3, zP3, iX2 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, aVarA, dVarD == null ? new d(5, Collections.singletonList(new p225s3.a(100))) : dVarD, zP4);
                while (aVar.k()) {
                    aVar.S();
                }
                aVar.i();
                return iVar;
            case "gf":
                JsonReader.a aVar5 = p.f46070a;
                Path.FillType fillType = Path.FillType.WINDING;
                boolean zP5 = false;
                d dVarD2 = null;
                String strB4 = null;
                GradientType gradientType3 = null;
                c cVarC = null;
                e eVarE2 = null;
                e eVarE3 = null;
                while (aVar.k()) {
                    switch (aVar.N(p.f46070a)) {
                        case 0:
                            strB4 = aVar.B();
                            break;
                        case 1:
                            aVar.c();
                            int iX3 = -1;
                            while (aVar.k()) {
                                int iN4 = aVar.N(p.f46071b);
                                if (iN4 == 0) {
                                    iX3 = aVar.x();
                                } else if (iN4 != 1) {
                                    aVar.R();
                                    aVar.S();
                                } else {
                                    cVarC = C2760d.c(aVar, bVar, iX3);
                                }
                            }
                            aVar.i();
                            break;
                        case 2:
                            dVarD2 = C2760d.d(aVar, bVar);
                            break;
                        case 3:
                            gradientType3 = aVar.x() != 1 ? gradientType : gradientType2;
                            break;
                        case 4:
                            eVarE2 = C2760d.e(aVar, bVar);
                            break;
                        case 5:
                            eVarE3 = C2760d.e(aVar, bVar);
                            break;
                        case 6:
                            fillType = aVar.x() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                            break;
                        case 7:
                            zP5 = aVar.p();
                            break;
                        default:
                            aVar.R();
                            aVar.S();
                            break;
                    }
                }
                iVar = new p164n3.d(strB4, gradientType3, fillType, cVarC, dVarD2 == null ? new d(5, Collections.singletonList(new p225s3.a(100))) : dVarD2, eVarE2, eVarE3, zP5);
                while (aVar.k()) {
                    aVar.S();
                }
                aVar.i();
                return iVar;
            case "gr":
                JsonReader.a aVar6 = H.f46036a;
                ArrayList arrayList = new ArrayList();
                String strB5 = null;
                while (aVar.k()) {
                    int iN5 = aVar.N(H.f46036a);
                    if (iN5 == 0) {
                        strB5 = aVar.B();
                    } else if (iN5 == 1) {
                        zP = aVar.p();
                    } else if (iN5 != 2) {
                        aVar.S();
                    } else {
                        aVar.b();
                        while (aVar.k()) {
                            b bVarA = a(aVar, bVar);
                            if (bVarA != null) {
                                arrayList.add(bVarA);
                            }
                        }
                        aVar.h();
                    }
                }
                aVar2 = new j(strB5, arrayList, zP);
                iVar = aVar2;
                while (aVar.k()) {
                    aVar.S();
                }
                aVar.i();
                return iVar;
            case "gs":
                JsonReader.a aVar7 = q.f46072a;
                ArrayList arrayList2 = new ArrayList();
                boolean zP6 = false;
                float fS = 0.0f;
                d dVarD3 = null;
                String strB6 = null;
                GradientType gradientType4 = null;
                c cVarC2 = null;
                e eVarE4 = null;
                e eVarE5 = null;
                p154m3.b bVarB = null;
                ShapeStroke.LineCapType lineCapType = null;
                ShapeStroke.LineJoinType lineJoinType = null;
                p154m3.b bVar2 = null;
                while (aVar.k()) {
                    switch (aVar.N(q.f46072a)) {
                        case 0:
                            strB6 = aVar.B();
                            break;
                        case 1:
                            aVar.c();
                            int iX4 = -1;
                            while (aVar.k()) {
                                int iN6 = aVar.N(q.f46073b);
                                if (iN6 == 0) {
                                    iX4 = aVar.x();
                                } else if (iN6 != 1) {
                                    aVar.R();
                                    aVar.S();
                                } else {
                                    cVarC2 = C2760d.c(aVar, bVar, iX4);
                                }
                            }
                            aVar.i();
                            break;
                        case 2:
                            dVarD3 = C2760d.d(aVar, bVar);
                            break;
                        case 3:
                            gradientType4 = aVar.x() != 1 ? gradientType : gradientType2;
                            break;
                        case 4:
                            eVarE4 = C2760d.e(aVar, bVar);
                            break;
                        case 5:
                            eVarE5 = C2760d.e(aVar, bVar);
                            break;
                        case 6:
                            bVarB = C2760d.b(aVar, bVar, true);
                            break;
                        case 7:
                            lineCapType = ShapeStroke.LineCapType.values()[aVar.x() - 1];
                            break;
                        case 8:
                            lineJoinType = ShapeStroke.LineJoinType.values()[aVar.x() - 1];
                            break;
                        case 9:
                            fS = (float) aVar.s();
                            break;
                        case 10:
                            zP6 = aVar.p();
                            break;
                        case 11:
                            aVar.b();
                            while (aVar.k()) {
                                aVar.c();
                                String strB7 = null;
                                p154m3.b bVarB2 = null;
                                while (aVar.k()) {
                                    int iN7 = aVar.N(q.f46074c);
                                    if (iN7 == 0) {
                                        strB7 = aVar.B();
                                    } else if (iN7 != 1) {
                                        aVar.R();
                                        aVar.S();
                                    } else {
                                        bVarB2 = C2760d.b(aVar, bVar, true);
                                    }
                                }
                                aVar.i();
                                if (strB7.equals("o")) {
                                    bVar2 = bVarB2;
                                } else if (strB7.equals(Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE) || strB7.equals("g")) {
                                    bVar.f35563m = true;
                                    arrayList2.add(bVarB2);
                                }
                            }
                            aVar.h();
                            if (arrayList2.size() == 1) {
                                arrayList2.add((p154m3.b) arrayList2.get(0));
                            }
                            break;
                        default:
                            aVar.R();
                            aVar.S();
                            break;
                    }
                }
                iVar = new com.airbnb.lottie.model.content.a(strB6, gradientType4, cVarC2, dVarD3 == null ? new d(5, Collections.singletonList(new p225s3.a(100))) : dVarD3, eVarE4, eVarE5, bVarB, lineCapType, lineJoinType, fS, arrayList2, bVar2, zP6);
                while (aVar.k()) {
                    aVar.S();
                }
                aVar.i();
                return iVar;
            case "mm":
                JsonReader.a aVar8 = x.f46088a;
                MergePaths.MergePathsMode mergePathsMode = null;
                String strB8 = null;
                while (aVar.k()) {
                    int iN8 = aVar.N(x.f46088a);
                    if (iN8 == 0) {
                        strB8 = aVar.B();
                    } else if (iN8 == 1) {
                        int iX5 = aVar.x();
                        MergePaths.MergePathsMode mergePathsMode2 = MergePaths.MergePathsMode.f23393b;
                        if (iX5 != 1) {
                            if (iX5 == 2) {
                                mergePathsMode = MergePaths.MergePathsMode.f23394c;
                            } else if (iX5 == 3) {
                                mergePathsMode = MergePaths.MergePathsMode.f23395d;
                            } else if (iX5 == 4) {
                                mergePathsMode = MergePaths.MergePathsMode.f23396e;
                            } else if (iX5 == 5) {
                                mergePathsMode = MergePaths.MergePathsMode.f23397f;
                            }
                        }
                        mergePathsMode = mergePathsMode2;
                    } else if (iN8 != 2) {
                        aVar.R();
                        aVar.S();
                    } else {
                        zP = aVar.p();
                    }
                }
                MergePaths mergePaths = new MergePaths(strB8, mergePathsMode, zP);
                bVar.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                iVar = mergePaths;
                while (aVar.k()) {
                    aVar.S();
                }
                aVar.i();
                return iVar;
            case "rc":
                JsonReader.a aVar9 = B.f46029a;
                boolean zP7 = false;
                String strB9 = null;
                k kVarB2 = null;
                e eVarE6 = null;
                p154m3.b bVarB3 = null;
                while (aVar.k()) {
                    int iN9 = aVar.N(B.f46029a);
                    if (iN9 == 0) {
                        strB9 = aVar.B();
                    } else if (iN9 == 1) {
                        kVarB2 = C2757a.b(aVar, bVar);
                    } else if (iN9 == 2) {
                        eVarE6 = C2760d.e(aVar, bVar);
                    } else if (iN9 == 3) {
                        bVarB3 = C2760d.b(aVar, bVar, true);
                    } else if (iN9 != 4) {
                        aVar.S();
                    } else {
                        zP7 = aVar.p();
                    }
                }
                aVar2 = new p164n3.e(strB9, kVarB2, eVarE6, bVarB3, zP7);
                iVar = aVar2;
                while (aVar.k()) {
                    aVar.S();
                }
                aVar.i();
                return iVar;
            case "rd":
                JsonReader.a aVar10 = D.f46031a;
                String strB10 = null;
                p154m3.b bVarB4 = null;
                while (aVar.k()) {
                    int iN10 = aVar.N(D.f46031a);
                    if (iN10 == 0) {
                        strB10 = aVar.B();
                    } else if (iN10 == 1) {
                        bVarB4 = C2760d.b(aVar, bVar, true);
                    } else if (iN10 != 2) {
                        aVar.S();
                    } else {
                        zP = aVar.p();
                    }
                }
                iVar = zP ? null : new g(strB10, bVarB4);
                while (aVar.k()) {
                    aVar.S();
                }
                aVar.i();
                return iVar;
            case "rp":
                JsonReader.a aVar11 = C.f46030a;
                boolean zP8 = false;
                String strB11 = null;
                p154m3.b bVarB5 = null;
                p154m3.b bVarB6 = null;
                p154m3.j jVarA = null;
                while (aVar.k()) {
                    int iN11 = aVar.N(C.f46030a);
                    if (iN11 == 0) {
                        strB11 = aVar.B();
                    } else if (iN11 == 1) {
                        bVarB5 = C2760d.b(aVar, bVar, false);
                    } else if (iN11 == 2) {
                        bVarB6 = C2760d.b(aVar, bVar, false);
                    } else if (iN11 == 3) {
                        jVarA = C2759c.a(aVar, bVar);
                    } else if (iN11 != 4) {
                        aVar.S();
                    } else {
                        zP8 = aVar.p();
                    }
                }
                aVar2 = new f(strB11, bVarB5, bVarB6, jVarA, zP8);
                iVar = aVar2;
                while (aVar.k()) {
                    aVar.S();
                }
                aVar.i();
                return iVar;
            case "sh":
                JsonReader.a aVar12 = I.f46037a;
                int iX6 = 0;
                boolean zP9 = false;
                p154m3.g gVar = null;
                String strB12 = null;
                while (aVar.k()) {
                    int iN12 = aVar.N(I.f46037a);
                    if (iN12 == 0) {
                        strB12 = aVar.B();
                    } else if (iN12 == 1) {
                        iX6 = aVar.x();
                    } else if (iN12 == 2) {
                        gVar = new p154m3.g(5, u.a(aVar, bVar, p214r3.g.c(), F.f46033a, false));
                    } else if (iN12 != 3) {
                        aVar.S();
                    } else {
                        zP9 = aVar.p();
                    }
                }
                aVar2 = new p164n3.k(strB12, iX6, gVar, zP9);
                iVar = aVar2;
                while (aVar.k()) {
                    aVar.S();
                }
                aVar.i();
                return iVar;
            case "sr":
                JsonReader.a aVar13 = A.f46028a;
                boolean z11 = iX == 3;
                boolean zP10 = false;
                String strB13 = null;
                PolystarShape.Type typeA = null;
                p154m3.b bVarB7 = null;
                k kVarB3 = null;
                p154m3.b bVarB8 = null;
                p154m3.b bVarB9 = null;
                p154m3.b bVarB10 = null;
                p154m3.b bVarB11 = null;
                p154m3.b bVarB12 = null;
                while (aVar.k()) {
                    switch (aVar.N(A.f46028a)) {
                        case 0:
                            strB13 = aVar.B();
                            break;
                        case 1:
                            typeA = PolystarShape.Type.a(aVar.x());
                            break;
                        case 2:
                            bVarB7 = C2760d.b(aVar, bVar, false);
                            break;
                        case 3:
                            kVarB3 = C2757a.b(aVar, bVar);
                            break;
                        case 4:
                            bVarB8 = C2760d.b(aVar, bVar, false);
                            break;
                        case 5:
                            bVarB10 = C2760d.b(aVar, bVar, true);
                            break;
                        case 6:
                            bVarB12 = C2760d.b(aVar, bVar, false);
                            break;
                        case 7:
                            bVarB9 = C2760d.b(aVar, bVar, true);
                            break;
                        case 8:
                            bVarB11 = C2760d.b(aVar, bVar, false);
                            break;
                        case 9:
                            zP10 = aVar.p();
                            break;
                        case 10:
                            z11 = aVar.x() == 3;
                            break;
                        default:
                            aVar.R();
                            aVar.S();
                            break;
                    }
                }
                iVar = new PolystarShape(strB13, typeA, bVarB7, kVarB3, bVarB8, bVarB9, bVarB10, bVarB11, bVarB12, zP10, z11);
                while (aVar.k()) {
                    aVar.S();
                }
                aVar.i();
                return iVar;
            case "st":
                JsonReader.a aVar14 = J.f46038a;
                ArrayList arrayList3 = new ArrayList();
                boolean zP11 = false;
                d dVarD4 = null;
                ShapeStroke.LineCapType lineCapType2 = null;
                ShapeStroke.LineJoinType lineJoinType2 = null;
                String strB14 = null;
                ?? r22 = 0;
                p154m3.a aVarA2 = null;
                p154m3.b bVarB13 = null;
                float fS2 = 0.0f;
                while (aVar.k()) {
                    switch (aVar.N(J.f46038a)) {
                        case 0:
                            strB14 = aVar.B();
                            r22 = r22;
                            break;
                        case 1:
                            aVarA2 = C2760d.a(aVar, bVar);
                            r22 = r22;
                            break;
                        case 2:
                            bVarB13 = C2760d.b(aVar, bVar, true);
                            r22 = r22;
                            break;
                        case 3:
                            dVarD4 = C2760d.d(aVar, bVar);
                            r22 = r22;
                            break;
                        case 4:
                            lineCapType2 = ShapeStroke.LineCapType.values()[aVar.x() - 1];
                            r22 = r22;
                            break;
                        case 5:
                            lineJoinType2 = ShapeStroke.LineJoinType.values()[aVar.x() - 1];
                            r22 = r22;
                            break;
                        case 6:
                            fS2 = (float) aVar.s();
                            r22 = r22;
                            break;
                        case 7:
                            zP11 = aVar.p();
                            r22 = r22;
                            break;
                        case 8:
                            aVar.b();
                            ?? r23 = r22;
                            while (aVar.k()) {
                                aVar.c();
                                b bVar3 = iVar;
                                Object objB = bVar3;
                                ?? B10 = bVar3;
                                while (aVar.k()) {
                                    int iN13 = aVar.N(J.f46039b);
                                    if (iN13 == 0) {
                                        B10 = aVar.B();
                                    } else if (iN13 != 1) {
                                        aVar.R();
                                        aVar.S();
                                    } else {
                                        objB = C2760d.b(aVar, bVar, true);
                                    }
                                    B10 = B10;
                                    objB = objB;
                                }
                                aVar.i();
                                B10.getClass();
                                switch (B10) {
                                    case "d":
                                    case "g":
                                        bVar.f35563m = true;
                                        arrayList3.add(objB);
                                        break;
                                    case "o":
                                        r23 = objB;
                                        break;
                                }
                                iVar = null;
                                r23 = r23;
                            }
                            aVar.h();
                            r22 = r23;
                            if (arrayList3.size() == 1) {
                                arrayList3.add((p154m3.b) arrayList3.get(0));
                                r22 = r23;
                            }
                            break;
                        default:
                            aVar.S();
                            continue;
                    }
                    iVar = null;
                }
                iVar = new ShapeStroke(strB14, r22, arrayList3, aVarA2, dVarD4 == null ? new d(5, Collections.singletonList(new p225s3.a(100))) : dVarD4, bVarB13, lineCapType2 == null ? ShapeStroke.LineCapType.f23420b : lineCapType2, lineJoinType2 == null ? ShapeStroke.LineJoinType.f23422b : lineJoinType2, fS2, zP11);
                while (aVar.k()) {
                    aVar.S();
                }
                aVar.i();
                return iVar;
            case "tm":
                JsonReader.a aVar15 = K.f46040a;
                boolean zP12 = false;
                String strB15 = null;
                ShapeTrimPath.Type type2 = null;
                p154m3.b bVarB14 = null;
                p154m3.b bVarB15 = null;
                p154m3.b bVarB16 = null;
                while (aVar.k()) {
                    int iN14 = aVar.N(K.f46040a);
                    if (iN14 == 0) {
                        bVarB14 = C2760d.b(aVar, bVar, false);
                    } else if (iN14 == 1) {
                        bVarB15 = C2760d.b(aVar, bVar, false);
                    } else if (iN14 == 2) {
                        bVarB16 = C2760d.b(aVar, bVar, false);
                    } else if (iN14 == 3) {
                        strB15 = aVar.B();
                    } else if (iN14 == 4) {
                        int iX7 = aVar.x();
                        if (iX7 == 1) {
                            type = ShapeTrimPath.Type.f23429b;
                        } else {
                            if (iX7 != 2) {
                                throw new IllegalArgumentException(J4.i.b(iX7, "Unknown trim path type "));
                            }
                            type = ShapeTrimPath.Type.f23430c;
                        }
                        type2 = type;
                    } else if (iN14 != 5) {
                        aVar.S();
                    } else {
                        zP12 = aVar.p();
                    }
                }
                iVar = new ShapeTrimPath(strB15, type2, bVarB14, bVarB15, bVarB16, zP12);
                while (aVar.k()) {
                    aVar.S();
                }
                aVar.i();
                return iVar;
            case "tr":
                iVar = C2759c.a(aVar, bVar);
                while (aVar.k()) {
                    aVar.S();
                }
                aVar.i();
                return iVar;
            default:
                p214r3.c.b("Unknown shape type ".concat(strB));
                while (aVar.k()) {
                    aVar.S();
                }
                aVar.i();
                return iVar;
        }
    }
}
