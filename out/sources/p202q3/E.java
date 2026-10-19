package p202q3;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import p225s3.b;

/* JADX INFO: compiled from: ScaleXYParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class E implements L<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E f46032a = new E();

    @Override // p202q3.L
    public final b a(JsonReader jsonReader, float f10) throws IOException {
        boolean z10 = jsonReader.C() == JsonReader.Token.f23516b;
        if (z10) {
            jsonReader.b();
        }
        float fS = (float) jsonReader.s();
        float fS2 = (float) jsonReader.s();
        while (jsonReader.k()) {
            jsonReader.S();
        }
        if (z10) {
            jsonReader.h();
        }
        return new b((fS / 100.0f) * f10, (fS2 / 100.0f) * f10);
    }
}
