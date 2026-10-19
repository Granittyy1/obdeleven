package p202q3;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: renamed from: q3.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FloatParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class C2768l implements L<Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2768l f46065a = new C2768l();

    @Override // p202q3.L
    public final Float a(JsonReader jsonReader, float f10) throws IOException {
        return Float.valueOf(s.d(jsonReader) * f10);
    }
}
