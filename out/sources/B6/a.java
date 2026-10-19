package B6;

import A6.C;
import android.util.JsonReader;
import androidx.compose.ui.graphics.colorspace.j;
import androidx.compose.ui.text.font.s;
import com.google.gson.internal.f;
import java.io.IOException;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements e.a, j, p183oa.a, f, j1.j.a, p096h7.a.InterfaceC0377a, com.google.common.base.c {
    public static StringBuilder a(String str, String str2, String str3, int i10, int i11) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i10);
        sb2.append(str2);
        sb2.append(i11);
        sb2.append(str3);
        return sb2;
    }

    public static StringBuilder c(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    @Override // com.google.common.base.c
    public Object apply(Object obj) {
        return Long.valueOf(((X1.c) obj).f7142b);
    }

    @Override // B6.e.a
    public Object b(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        String strNextString3 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "libraryName":
                    strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        throw new NullPointerException("Null libraryName");
                    }
                    break;
                    break;
                case "arch":
                    strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null arch");
                    }
                    break;
                    break;
                case "buildId":
                    strNextString3 = jsonReader.nextString();
                    if (strNextString3 == null) {
                        throw new NullPointerException("Null buildId");
                    }
                    break;
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        String strB = strNextString == null ? " arch" : "";
        if (strNextString2 == null) {
            strB = strB.concat(" libraryName");
        }
        if (strNextString3 == null) {
            strB = s.b(strB, " buildId");
        }
        if (strB.isEmpty()) {
            return new C(strNextString, strNextString2, strNextString3);
        }
        throw new IllegalStateException("Missing required properties:".concat(strB));
    }

    @Override // androidx.compose.ui.graphics.colorspace.j
    public double g(double d10) {
        float[] fArr = androidx.compose.ui.graphics.colorspace.f.f13567a;
        return androidx.compose.ui.graphics.colorspace.f.a(androidx.compose.ui.graphics.colorspace.f.f13569c, d10);
    }

    @Override // com.google.gson.internal.f
    public Object i() {
        return new LinkedHashMap();
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        ((p162n1.b) obj).getClass();
    }

    @Override // p183oa.a
    public void run() {
        Q3.d.B();
    }

    @Override // p096h7.a.InterfaceC0377a
    public void d(p096h7.b bVar) {
    }
}
