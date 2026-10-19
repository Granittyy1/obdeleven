package B6;

import A6.Q;
import A6.f0;
import android.util.JsonReader;
import androidx.compose.ui.text.font.s;
import androidx.core.view.C1293h;
import androidx.datastore.preferences.protobuf.CodedOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListMap;
import p114j1.j;
import p311z4.f;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements e.a, f, p191p5.e, p183oa.b, com.google.gson.internal.f, j.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1593b;

    public static int c(int i10, int i11, int i12, int i13) {
        return CodedOutputStream.w(i10) + i11 + i12 + i13;
    }

    public static String d(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String e(StringBuilder sb2, Object obj, char c10) {
        sb2.append(obj);
        sb2.append(c10);
        return sb2.toString();
    }

    public static void f(StringBuilder sb2, String str, String str2, String str3) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
    }

    @Override // p183oa.b
    public void a(Object obj) {
        ((Throwable) obj).getMessage();
    }

    @Override // p311z4.f
    public Object apply(Object obj) {
        E6.a.f3086b.getClass();
        return e.f1594a.a((f0) obj).getBytes(Charset.forName("UTF-8"));
    }

    @Override // B6.e.a
    public Object b(JsonReader jsonReader) throws IOException {
        int i10 = 1;
        jsonReader.beginObject();
        String strNextString = null;
        Integer numValueOf = null;
        List listD = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    listD = e.d(jsonReader, new C1293h(i10));
                    if (listD == null) {
                        throw new NullPointerException("Null frames");
                    }
                    break;
                    break;
                case "name":
                    strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null name");
                    }
                    break;
                    break;
                case "importance":
                    numValueOf = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        String strB = strNextString == null ? " name" : "";
        if (numValueOf == null) {
            strB = strB.concat(" importance");
        }
        if (listD == null) {
            strB = s.b(strB, " frames");
        }
        if (strB.isEmpty()) {
            return new Q(numValueOf.intValue(), strNextString, listD);
        }
        throw new IllegalStateException("Missing required properties:".concat(strB));
    }

    @Override // com.google.gson.internal.f
    public Object i() {
        return new ConcurrentSkipListMap();
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        p162n1.b bVar = (p162n1.b) obj;
        switch (this.f1593b) {
            case 8:
                bVar.getClass();
                break;
            default:
                bVar.getClass();
                break;
        }
    }

    @Override // p191p5.e
    public void onSuccess(Object obj) {
        Q3.d.C();
    }
}
