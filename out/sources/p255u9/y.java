package p255u9;

import org.json.JSONObject;

/* JADX INFO: compiled from: UdsJSON.java */
/* JADX INFO: loaded from: classes3.dex */
public final class y extends JSONObject {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f47483a;

    public y(JSONObject jSONObject) {
        this.f47483a = jSONObject;
    }

    public final int a() {
        return this.f47483a.optInt("channel");
    }

    public final String b() {
        return this.f47483a.optString("data");
    }
}
