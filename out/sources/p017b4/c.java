package p017b4;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import org.json.JSONObject;

/* JADX INFO: compiled from: MetadataRule.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final CopyOnWriteArraySet f20551d = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<String> f20554c;

    /* JADX INFO: compiled from: MetadataRule.kt */
    public static final class a {
        public static void a(JSONObject jSONObject) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String key = itKeys.next();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(key);
                if (jSONObjectOptJSONObject != null) {
                    String k10 = jSONObjectOptJSONObject.optString("k");
                    String v10 = jSONObjectOptJSONObject.optString("v");
                    i.d(k10, "k");
                    if (k10.length() != 0) {
                        CopyOnWriteArraySet copyOnWriteArraySet = c.f20551d;
                        i.d(key, "key");
                        List listE0 = n.e0(k10, new String[]{","}, 0, 6);
                        i.d(v10, "v");
                        copyOnWriteArraySet.add(new c(key, v10, listE0));
                    }
                }
            }
        }
    }

    public c() {
        throw null;
    }

    public c(String str, String str2, List list) {
        this.f20552a = str;
        this.f20553b = str2;
        this.f20554c = list;
    }
}
