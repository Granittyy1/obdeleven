package B9;

import java.util.List;
import java.util.Map;
import kotlin.collections.l;
import kotlin.jvm.internal.i;
import p304y9.C2826e;

/* JADX INFO: compiled from: RequestBuilder.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static String a(Object obj) {
        if (obj instanceof String) {
            return "\"" + obj + "\"";
        }
        if (obj instanceof C2826e) {
            ((C2826e) obj).getClass();
            return "{\"__type\":\"Pointer\",\"className\":\"null\",\"objectId\":\"null\"}";
        }
        int i10 = 0;
        if (obj instanceof List) {
            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            StringBuilder sb2 = new StringBuilder("[");
            for (Object obj2 : (List) obj) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    l.x();
                    throw null;
                }
                if (i10 != 0) {
                    sb2.append(",");
                }
                sb2.append(a(obj2));
                i10 = i11;
            }
            sb2.append("]");
            String string = sb2.toString();
            i.d(string, "toString(...)");
            return string;
        }
        if (!(obj instanceof Map)) {
            return obj instanceof Boolean ? obj.toString() : "";
        }
        i.c(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        StringBuilder sb3 = new StringBuilder("{");
        boolean z10 = true;
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (!z10) {
                sb3.append(",");
            }
            sb3.append("\"" + str + "\":" + a(value));
            z10 = false;
        }
        sb3.append("}");
        String string2 = sb3.toString();
        i.d(string2, "toString(...)");
        return string2;
    }
}
