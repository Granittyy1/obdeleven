package bo.app;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public interface d2 extends p2 {

    public enum a {
        CONTENT_CARD_SYNC,
        FEATURE_FLAG_SYNC,
        V3_DATA,
        TEMPLATE_REQUEST,
        PUSH_DELIVERY_EVENTS,
        GEOFENCE_REFRESH,
        GEOFENCE_REPORT,
        PUSH_REDELIVER,
        DUST_CONFIG
    }

    String a();

    void a(i0 i0Var);

    void a(Long l10);

    void a(String str);

    void a(Map map);

    i0 b();

    void b(String str);

    void c(String str);

    boolean c();

    JSONObject d();

    void d(String str);

    a e();

    void e(String str);

    Long g();

    String h();
}
