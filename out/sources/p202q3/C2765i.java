package p202q3;

import android.graphics.PointF;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.braze.Constants;
import java.io.IOException;

/* JADX INFO: renamed from: q3.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DocumentDataParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class C2765i implements L<DocumentData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2765i f46051a = new C2765i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final JsonReader.a f46052b = JsonReader.a.a(Constants.BRAZE_PUSH_TITLE_KEY, "f", Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // p202q3.L
    public final DocumentData a(JsonReader jsonReader, float f10) throws IOException {
        boolean z10;
        int i10;
        DocumentData.Justification justification = DocumentData.Justification.f23377b;
        jsonReader.c();
        String strB = null;
        DocumentData.Justification justification2 = justification;
        float fS = 0.0f;
        float fS2 = 0.0f;
        float fS3 = 0.0f;
        float fS4 = 0.0f;
        int iX = 0;
        int iA = 0;
        int iA2 = 0;
        boolean zP = true;
        String strB2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (jsonReader.k()) {
            switch (jsonReader.N(f46052b)) {
                case 0:
                    z10 = zP;
                    strB = jsonReader.B();
                    zP = z10;
                    break;
                case 1:
                    z10 = zP;
                    strB2 = jsonReader.B();
                    zP = z10;
                    break;
                case 2:
                    z10 = zP;
                    fS = (float) jsonReader.s();
                    zP = z10;
                    break;
                case 3:
                    z10 = zP;
                    i10 = iA2;
                    int iX2 = jsonReader.x();
                    justification2 = (iX2 > 2 || iX2 < 0) ? justification : DocumentData.Justification.values()[iX2];
                    iA2 = i10;
                    zP = z10;
                    break;
                case 4:
                    z10 = zP;
                    iX = jsonReader.x();
                    zP = z10;
                    break;
                case 5:
                    z10 = zP;
                    fS2 = (float) jsonReader.s();
                    zP = z10;
                    break;
                case 6:
                    z10 = zP;
                    fS3 = (float) jsonReader.s();
                    zP = z10;
                    break;
                case 7:
                    z10 = zP;
                    iA = s.a(jsonReader);
                    zP = z10;
                    break;
                case 8:
                    iA2 = s.a(jsonReader);
                    break;
                case 9:
                    z10 = zP;
                    fS4 = (float) jsonReader.s();
                    zP = z10;
                    break;
                case 10:
                    zP = jsonReader.p();
                    iA2 = iA2;
                    break;
                case 11:
                    z10 = zP;
                    jsonReader.b();
                    i10 = iA2;
                    pointF = new PointF(((float) jsonReader.s()) * f10, ((float) jsonReader.s()) * f10);
                    jsonReader.h();
                    iA2 = i10;
                    zP = z10;
                    break;
                case 12:
                    jsonReader.b();
                    z10 = zP;
                    pointF2 = new PointF(((float) jsonReader.s()) * f10, ((float) jsonReader.s()) * f10);
                    jsonReader.h();
                    iA2 = iA2;
                    zP = z10;
                    break;
                default:
                    jsonReader.R();
                    jsonReader.S();
                    break;
            }
        }
        jsonReader.i();
        DocumentData documentData = new DocumentData();
        documentData.f23365a = strB;
        documentData.f23366b = strB2;
        documentData.f23367c = fS;
        documentData.f23368d = justification2;
        documentData.f23369e = iX;
        documentData.f23370f = fS2;
        documentData.f23371g = fS3;
        documentData.f23372h = iA;
        documentData.f23373i = iA2;
        documentData.j = fS4;
        documentData.f23374k = zP;
        documentData.f23375l = pointF;
        documentData.f23376m = pointF2;
        return documentData;
    }
}
