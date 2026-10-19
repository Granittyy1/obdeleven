package B6;

import A6.W;
import A6.X;
import android.util.JsonReader;
import androidx.compose.ui.graphics.colorspace.j;
import com.google.firebase.messaging.A;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import p311z4.f;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements e.a, j, p183oa.c, f, com.google.gson.internal.f, j1.j.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1592b;

    public /* synthetic */ b(int i10) {
        this.f1592b = i10;
    }

    @Override // p183oa.c, p311z4.f
    public Object apply(Object obj) {
        switch (this.f1592b) {
            case 2:
                return io.reactivex.internal.operators.completable.a.f40671b;
            default:
                o7.a aVar = (o7.a) obj;
                aVar.getClass();
                O6.e eVar = A.f28264a;
                eVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    eVar.a(aVar, byteArrayOutputStream);
                    break;
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
        }
    }

    @Override // B6.e.a
    public Object b(JsonReader jsonReader) throws IOException {
        W.a aVar = new W.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "parameterKey":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null parameterKey");
                    }
                    aVar.f801b = strNextString;
                    break;
                    break;
                case "templateVersion":
                    aVar.f803d = Long.valueOf(jsonReader.nextLong());
                    break;
                case "rolloutVariant":
                    jsonReader.beginObject();
                    String strNextString2 = null;
                    String strNextString3 = null;
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("variantId")) {
                            strNextString3 = jsonReader.nextString();
                            if (strNextString3 == null) {
                                throw new NullPointerException("Null variantId");
                            }
                        } else if (strNextName2.equals("rolloutId")) {
                            strNextString2 = jsonReader.nextString();
                            if (strNextString2 == null) {
                                throw new NullPointerException("Null rolloutId");
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    String strConcat = strNextString2 == null ? " rolloutId" : "";
                    if (strNextString3 == null) {
                        strConcat = strConcat.concat(" variantId");
                    }
                    if (!strConcat.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(strConcat));
                    }
                    aVar.f800a = new X(strNextString2, strNextString3);
                    break;
                    break;
                case "parameterValue":
                    String strNextString4 = jsonReader.nextString();
                    if (strNextString4 == null) {
                        throw new NullPointerException("Null parameterValue");
                    }
                    aVar.f802c = strNextString4;
                    break;
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    @Override // androidx.compose.ui.graphics.colorspace.j
    public double g(double d10) {
        float[] fArr = androidx.compose.ui.graphics.colorspace.f.f13567a;
        return androidx.compose.ui.graphics.colorspace.f.c(androidx.compose.ui.graphics.colorspace.f.f13570d, d10);
    }

    @Override // com.google.gson.internal.f
    public Object i() {
        return new ConcurrentHashMap();
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        ((p162n1.b) obj).getClass();
    }
}
