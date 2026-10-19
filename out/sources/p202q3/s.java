package p202q3;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: JsonUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f46076a = JsonReader.a.a("x", "y");

    public static int a(JsonReader jsonReader) throws IOException {
        jsonReader.b();
        int iS = (int) (jsonReader.s() * 255.0d);
        int iS2 = (int) (jsonReader.s() * 255.0d);
        int iS3 = (int) (jsonReader.s() * 255.0d);
        while (jsonReader.k()) {
            jsonReader.S();
        }
        jsonReader.h();
        return Color.argb(255, iS, iS2, iS3);
    }

    public static PointF b(JsonReader jsonReader, float f10) throws IOException {
        int iOrdinal = jsonReader.C().ordinal();
        if (iOrdinal == 0) {
            jsonReader.b();
            float fS = (float) jsonReader.s();
            float fS2 = (float) jsonReader.s();
            while (jsonReader.C() != JsonReader.Token.f23517c) {
                jsonReader.S();
            }
            jsonReader.h();
            return new PointF(fS * f10, fS2 * f10);
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 6) {
                throw new IllegalArgumentException("Unknown point starts with " + jsonReader.C());
            }
            float fS3 = (float) jsonReader.s();
            float fS4 = (float) jsonReader.s();
            while (jsonReader.k()) {
                jsonReader.S();
            }
            return new PointF(fS3 * f10, fS4 * f10);
        }
        jsonReader.c();
        float fD = 0.0f;
        float fD2 = 0.0f;
        while (jsonReader.k()) {
            int iN = jsonReader.N(f46076a);
            if (iN == 0) {
                fD = d(jsonReader);
            } else if (iN != 1) {
                jsonReader.R();
                jsonReader.S();
            } else {
                fD2 = d(jsonReader);
            }
        }
        jsonReader.i();
        return new PointF(fD * f10, fD2 * f10);
    }

    public static ArrayList c(JsonReader jsonReader, float f10) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.b();
        while (jsonReader.C() == JsonReader.Token.f23516b) {
            jsonReader.b();
            arrayList.add(b(jsonReader, f10));
            jsonReader.h();
        }
        jsonReader.h();
        return arrayList;
    }

    public static float d(JsonReader jsonReader) throws IOException {
        JsonReader.Token tokenC = jsonReader.C();
        int iOrdinal = tokenC.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 6) {
                return (float) jsonReader.s();
            }
            throw new IllegalArgumentException("Unknown value for token of type " + tokenC);
        }
        jsonReader.b();
        float fS = (float) jsonReader.s();
        while (jsonReader.k()) {
            jsonReader.S();
        }
        jsonReader.h();
        return fS;
    }
}
