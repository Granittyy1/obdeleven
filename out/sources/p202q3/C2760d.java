package p202q3;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import p079g3.b;
import p154m3.a;
import p154m3.c;
import p154m3.d;
import p154m3.e;
import p214r3.g;

/* JADX INFO: renamed from: q3.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AnimatableValueParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class C2760d {
    public static a a(com.airbnb.lottie.parser.moshi.a aVar, b bVar) throws IOException {
        return new a(5, u.a(aVar, bVar, 1.0f, C2763g.f46049a, false));
    }

    public static p154m3.b b(JsonReader jsonReader, b bVar, boolean z10) throws IOException {
        return new p154m3.b(5, u.a(jsonReader, bVar, z10 ? g.c() : 1.0f, C2768l.f46065a, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c c(com.airbnb.lottie.parser.moshi.a aVar, b bVar, int i10) throws IOException {
        o oVar = new o();
        oVar.f46069a = i10;
        ArrayList arrayListA = u.a(aVar, bVar, 1.0f, oVar, false);
        for (int i11 = 0; i11 < arrayListA.size(); i11++) {
            p225s3.a aVar2 = (p225s3.a) arrayListA.get(i11);
            p164n3.c cVar = (p164n3.c) aVar2.f46886b;
            p164n3.c cVar2 = (p164n3.c) aVar2.f46887c;
            if (cVar != null && cVar2 != null) {
                float[] fArr = cVar.f44829a;
                int length = fArr.length;
                float[] fArr2 = cVar2.f44829a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f10 = Float.NaN;
                    int i12 = 0;
                    for (int i13 = 0; i13 < length2; i13++) {
                        float f11 = fArr3[i13];
                        if (f11 != f10) {
                            fArr3[i12] = f11;
                            i12++;
                            f10 = fArr3[i13];
                        }
                    }
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i12);
                    aVar2 = new p225s3.a(cVar.a(fArrCopyOfRange), cVar2.a(fArrCopyOfRange));
                }
            }
            arrayListA.set(i11, aVar2);
        }
        return new c(5, arrayListA);
    }

    public static d d(com.airbnb.lottie.parser.moshi.a aVar, b bVar) throws IOException {
        return new d(5, u.a(aVar, bVar, 1.0f, r.f46075a, false));
    }

    public static e e(com.airbnb.lottie.parser.moshi.a aVar, b bVar) throws IOException {
        return new e(5, u.a(aVar, bVar, g.c(), z.f46090a, true));
    }
}
