package A8;

import A6.F;
import android.util.Base64;
import android.util.JsonReader;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.voltasit.obdeleven.core.DatabaseLanguage;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements B6.e.a, androidx.compose.ui.graphics.colorspace.j, p183oa.b, com.google.gson.internal.f, j1.j.a, r1.l.a, com.google.common.base.c, p114j1.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f979b;

    public /* synthetic */ f(int i10) {
        this.f979b = i10;
    }

    public static int c(int i10, int i11, int i12, int i13) {
        return ((i10 * i11) / i12) + i13;
    }

    public static String d(int i10, int i11, String str, String str2) {
        return str + i10 + str2 + i11;
    }

    public static StringBuilder e(int i10, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i10);
        sb2.append(str2);
        return sb2;
    }

    public static void f(DatabaseLanguage databaseLanguage, String str, LinkedHashMap linkedHashMap, String str2) {
        String strB = databaseLanguage.b();
        kotlin.jvm.internal.i.d(strB, str);
        linkedHashMap.put(strB, str2);
    }

    @Override // p183oa.b
    public void a(Object obj) {
        switch (this.f979b) {
            case 6:
                ((Throwable) obj).getMessage();
                break;
            default:
                ((ExecutorService) obj).shutdown();
                break;
        }
    }

    @Override // com.google.common.base.c
    public Object apply(Object obj) {
        switch (this.f979b) {
            case 10:
                return ImmutableList.G(Lists.b(((androidx.media3.exoplayer.source.g) obj).n().f47103b, new J4.i(10)));
            default:
                return Long.valueOf(((X1.c) obj).f7143c);
        }
    }

    @Override // B6.e.a
    public Object b(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        byte[] bArrDecode = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("filename")) {
                strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    throw new NullPointerException("Null filename");
                }
            } else if (strNextName.equals("contents")) {
                bArrDecode = Base64.decode(jsonReader.nextString(), 2);
                if (bArrDecode == null) {
                    throw new NullPointerException("Null contents");
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        String strConcat = strNextString == null ? " filename" : "";
        if (bArrDecode == null) {
            strConcat = strConcat.concat(" contents");
        }
        if (strConcat.isEmpty()) {
            return new F(strNextString, bArrDecode);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    @Override // androidx.compose.ui.graphics.colorspace.j
    public double g(double d10) {
        float[] fArr = androidx.compose.ui.graphics.colorspace.f.f13567a;
        return androidx.compose.ui.graphics.colorspace.f.d(androidx.compose.ui.graphics.colorspace.f.f13570d, d10);
    }

    @Override // com.google.gson.internal.f
    public Object i() {
        return new TreeMap();
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        ((p162n1.b) obj).getClass();
    }
}
