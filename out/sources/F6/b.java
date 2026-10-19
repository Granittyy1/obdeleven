package F6;

import org.json.JSONObject;

/* JADX INFO: compiled from: DefaultSettingsJsonTransform.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements g {
    public static d b(H3.c cVar) {
        return new d(System.currentTimeMillis() + ((long) 3600000), new d.b(8), new d.a(true, false, false), 10.0d, 1.2d, 60);
    }

    @Override // F6.g
    public final d a(H3.c cVar, JSONObject jSONObject) {
        return b(cVar);
    }
}
