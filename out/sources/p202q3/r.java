package p202q3;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: IntegerParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class r implements L<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f46075a = new r();

    @Override // p202q3.L
    public final Integer a(JsonReader jsonReader, float f10) throws IOException {
        return Integer.valueOf(Math.round(s.d(jsonReader) * f10));
    }
}
