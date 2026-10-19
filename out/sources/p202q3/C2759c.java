package p202q3;

import U5.d;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.parser.moshi.a;
import com.braze.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p079g3.b;
import p154m3.f;
import p154m3.h;
import p154m3.j;
import p154m3.k;

/* JADX INFO: renamed from: q3.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AnimatableTransformParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class C2759c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f46044a = JsonReader.a.a(Constants.BRAZE_PUSH_CONTENT_KEY, Constants.BRAZE_PUSH_PRIORITY_KEY, Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, "rz", "r", "o", "so", "eo", "sk", "sa");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final JsonReader.a f46045b = JsonReader.a.a("k");

    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:24:0x0095  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:76:0x019e  */
    /* JADX WARN: Multi-variable type inference failed */
    public static j a(a aVar, b bVar) throws IOException {
        f fVar;
        p154m3.b bVarB;
        List list;
        p154m3.b bVar2;
        p154m3.b bVar3;
        boolean z10;
        boolean z11 = false;
        Object[] objArr = aVar.C() == JsonReader.Token.f23518d;
        if (objArr != false) {
            aVar.c();
        }
        p154m3.b bVar4 = null;
        p154m3.b bVarB2 = null;
        d dVarA = null;
        k kVarB = null;
        f fVar2 = null;
        p154m3.b bVarB3 = null;
        p154m3.d dVarD = null;
        p154m3.b bVarB4 = null;
        p154m3.b bVarB5 = null;
        while (aVar.k()) {
            switch (aVar.N(f46044a)) {
                case 0:
                    aVar.c();
                    while (aVar.k()) {
                        if (aVar.N(f46045b) != 0) {
                            aVar.R();
                            aVar.S();
                        } else {
                            dVarA = C2757a.a(aVar, bVar);
                        }
                    }
                    aVar.i();
                    bVarB2 = bVarB2;
                    z11 = false;
                    break;
                case 1:
                    kVarB = C2757a.b(aVar, bVar);
                    z11 = false;
                    break;
                case 2:
                    fVar2 = new f(5, u.a(aVar, bVar, 1.0f, E.f46032a, z11));
                    bVarB2 = bVarB2;
                    z11 = false;
                    break;
                case 3:
                    bVar.a("Lottie doesn't support 3D layers.");
                    bVarB = C2760d.b(aVar, bVar, z11);
                    list = (List) bVarB.f3048c;
                    if (list.isEmpty()) {
                        bVar2 = bVarB;
                        bVar3 = bVarB2;
                        if (((p225s3.a) list.get(z11 ? 1 : 0)).f46886b == 0) {
                            z10 = false;
                            list.set(0, new p225s3.a(bVar, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(bVar.f35561k)));
                        }
                        z11 = z10;
                        bVar4 = bVar2;
                        bVarB2 = bVar3;
                    } else {
                        bVar2 = bVarB;
                        bVar3 = bVarB2;
                        list.add(new p225s3.a(bVar, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(bVar.f35561k)));
                    }
                    z10 = false;
                    z11 = z10;
                    bVar4 = bVar2;
                    bVarB2 = bVar3;
                    break;
                case 4:
                    bVarB = C2760d.b(aVar, bVar, z11);
                    list = (List) bVarB.f3048c;
                    if (list.isEmpty()) {
                        bVar2 = bVarB;
                        bVar3 = bVarB2;
                        if (((p225s3.a) list.get(z11 ? 1 : 0)).f46886b == 0) {
                            z10 = false;
                            list.set(0, new p225s3.a(bVar, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(bVar.f35561k)));
                        }
                        z11 = z10;
                        bVar4 = bVar2;
                        bVarB2 = bVar3;
                    } else {
                        bVar2 = bVarB;
                        bVar3 = bVarB2;
                        list.add(new p225s3.a(bVar, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(bVar.f35561k)));
                    }
                    z10 = false;
                    z11 = z10;
                    bVar4 = bVar2;
                    bVarB2 = bVar3;
                    break;
                case 5:
                    dVarD = C2760d.d(aVar, bVar);
                    break;
                case 6:
                    bVarB4 = C2760d.b(aVar, bVar, z11);
                    break;
                case 7:
                    bVarB5 = C2760d.b(aVar, bVar, z11);
                    break;
                case 8:
                    bVarB3 = C2760d.b(aVar, bVar, z11);
                    break;
                case 9:
                    bVarB2 = C2760d.b(aVar, bVar, z11);
                    break;
                default:
                    aVar.R();
                    aVar.S();
                    break;
            }
        }
        p154m3.b bVar5 = bVarB2;
        if (objArr != false) {
            aVar.i();
        }
        d dVar = (dVarA == null || (dVarA.k() && ((PointF) ((p225s3.a) ((ArrayList) dVarA.f6509b).get(0)).f46886b).equals(0.0f, 0.0f))) ? null : dVarA;
        k kVar = (kVarB == null || (!(kVarB instanceof h) && kVarB.k() && ((PointF) ((p225s3.a) kVarB.e().get(0)).f46886b).equals(0.0f, 0.0f))) ? null : kVarB;
        if (bVar4 == null || (bVar4.k() && ((Float) ((p225s3.a) ((List) bVar4.f3048c).get(0)).f46886b).floatValue() == 0.0f)) {
            bVar4 = null;
        }
        if (fVar2 == null) {
            fVar = null;
        } else {
            if (fVar2.k()) {
                p225s3.b bVar6 = (p225s3.b) ((p225s3.a) ((List) fVar2.f3048c).get(0)).f46886b;
                if (bVar6.f46900a == 1.0f && bVar6.f46901b == 1.0f) {
                    fVar = null;
                }
            }
            fVar = fVar2;
        }
        return new j(dVar, kVar, fVar, bVar4, dVarD, bVarB4, bVarB5, (bVarB3 == null || (bVarB3.k() && ((Float) ((p225s3.a) ((List) bVarB3.f3048c).get(0)).f46886b).floatValue() == 0.0f)) ? null : bVarB3, (bVar5 == 0 || (bVar5.k() && ((Float) ((p225s3.a) ((List) bVar5.f3048c).get(0)).f46886b).floatValue() == 0.0f)) ? null : bVar5);
    }
}
