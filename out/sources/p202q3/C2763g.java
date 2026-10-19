package p202q3;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: renamed from: q3.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ColorParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class C2763g implements L<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2763g f46049a = new C2763g();

    @Override // p202q3.L
    public final Integer a(JsonReader jsonReader, float f10) throws IOException {
        boolean z10 = jsonReader.C() == JsonReader.Token.f23516b;
        if (z10) {
            jsonReader.b();
        }
        double dS = jsonReader.s();
        double dS2 = jsonReader.s();
        double dS3 = jsonReader.s();
        double dS4 = jsonReader.C() == JsonReader.Token.f23522h ? jsonReader.s() : 1.0d;
        if (z10) {
            jsonReader.h();
        }
        if (dS <= 1.0d && dS2 <= 1.0d && dS3 <= 1.0d) {
            dS *= 255.0d;
            dS2 *= 255.0d;
            dS3 *= 255.0d;
            if (dS4 <= 1.0d) {
                dS4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dS4, (int) dS, (int) dS2, (int) dS3));
    }
}
