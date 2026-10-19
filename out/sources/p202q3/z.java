package p202q3;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: PointFParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class z implements L<PointF> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f46090a = new z();

    @Override // p202q3.L
    public final PointF a(JsonReader jsonReader, float f10) throws IOException {
        JsonReader.Token tokenC = jsonReader.C();
        if (tokenC == JsonReader.Token.f23516b) {
            return s.b(jsonReader, f10);
        }
        if (tokenC == JsonReader.Token.f23518d) {
            return s.b(jsonReader, f10);
        }
        if (tokenC != JsonReader.Token.f23522h) {
            throw new IllegalArgumentException("Cannot convert json to point. Next token is " + tokenC);
        }
        PointF pointF = new PointF(((float) jsonReader.s()) * f10, ((float) jsonReader.s()) * f10);
        while (jsonReader.k()) {
            jsonReader.S();
        }
        return pointF;
    }
}
