package p202q3;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import p142l3.a;
import p164n3.h;
import p214r3.f;

/* JADX INFO: compiled from: ShapeDataParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class F implements L<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F f46033a = new F();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final JsonReader.a f46034b = JsonReader.a.a("c", "v", "i", "o");

    @Override // p202q3.L
    public final h a(JsonReader jsonReader, float f10) throws IOException {
        if (jsonReader.C() == JsonReader.Token.f23516b) {
            jsonReader.b();
        }
        jsonReader.c();
        ArrayList arrayListC = null;
        ArrayList arrayListC2 = null;
        ArrayList arrayListC3 = null;
        boolean zP = false;
        while (jsonReader.k()) {
            int iN = jsonReader.N(f46034b);
            if (iN == 0) {
                zP = jsonReader.p();
            } else if (iN == 1) {
                arrayListC = s.c(jsonReader, f10);
            } else if (iN == 2) {
                arrayListC2 = s.c(jsonReader, f10);
            } else if (iN != 3) {
                jsonReader.R();
                jsonReader.S();
            } else {
                arrayListC3 = s.c(jsonReader, f10);
            }
        }
        jsonReader.i();
        if (jsonReader.C() == JsonReader.Token.f23517c) {
            jsonReader.h();
        }
        if (arrayListC == null || arrayListC2 == null || arrayListC3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (arrayListC.isEmpty()) {
            return new h(new PointF(), false, Collections.emptyList());
        }
        int size = arrayListC.size();
        PointF pointF = (PointF) arrayListC.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 1; i10 < size; i10++) {
            PointF pointF2 = (PointF) arrayListC.get(i10);
            int i11 = i10 - 1;
            arrayList.add(new a(f.a((PointF) arrayListC.get(i11), (PointF) arrayListC3.get(i11)), f.a(pointF2, (PointF) arrayListC2.get(i10)), pointF2));
        }
        if (zP) {
            PointF pointF3 = (PointF) arrayListC.get(0);
            int i12 = size - 1;
            arrayList.add(new a(f.a((PointF) arrayListC.get(i12), (PointF) arrayListC3.get(i12)), f.a(pointF3, (PointF) arrayListC2.get(0)), pointF3));
        }
        return new h(pointF, zP, arrayList);
    }
}
