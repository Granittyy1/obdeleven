package bo.app;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class a7 extends y6 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map f20734h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7(JSONObject json) {
        super(json);
        kotlin.jvm.internal.i.e(json, "json");
        this.f20734h = new LinkedHashMap();
    }

    @Override // bo.app.c3
    public void a(Map remoteAssetToLocalAssetPaths) {
        kotlin.jvm.internal.i.e(remoteAssetToLocalAssetPaths, "remoteAssetToLocalAssetPaths");
        this.f20734h = new HashMap(remoteAssetToLocalAssetPaths);
    }

    public Map y() {
        return kotlin.collections.y.x(this.f20734h);
    }
}
