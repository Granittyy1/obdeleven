package bo.app;

import com.braze.Constants;
import com.braze.models.IPutIntoJson;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public enum j1 implements IPutIntoJson {
    LOCATION_RECORDED("lr"),
    CUSTOM_EVENT("ce"),
    PURCHASE(Constants.BRAZE_PUSH_PRIORITY_KEY),
    PUSH_STORY_PAGE_CLICK("cic"),
    PUSH_CLICKED("pc"),
    PUSH_ACTION_BUTTON_CLICKED("ca"),
    INTERNAL("i"),
    INTERNAL_ERROR("ie"),
    NEWS_FEED_CARD_IMPRESSION("ci"),
    NEWS_FEED_CARD_CLICK("cc"),
    GEOFENCE("g"),
    CONTENT_CARDS_CLICK("ccc"),
    CONTENT_CARDS_IMPRESSION("cci"),
    CONTENT_CARDS_CONTROL_IMPRESSION("ccic"),
    CONTENT_CARDS_DISMISS("ccd"),
    INCREMENT("inc"),
    ADD_TO_CUSTOM_ATTRIBUTE_ARRAY("add"),
    REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY("rem"),
    SET_CUSTOM_ATTRIBUTE_ARRAY("set"),
    INAPP_MESSAGE_IMPRESSION("si"),
    INAPP_MESSAGE_CONTROL_IMPRESSION("iec"),
    INAPP_MESSAGE_CLICK("sc"),
    INAPP_MESSAGE_BUTTON_CLICK("sbc"),
    USER_ALIAS("uae"),
    SESSION_START("ss"),
    SESSION_END("se"),
    TEST_TYPE("tt"),
    LOCATION_CUSTOM_ATTRIBUTE_ADD("lcaa"),
    LOCATION_CUSTOM_ATTRIBUTE_REMOVE("lcar"),
    NESTED_CUSTOM_ATTRIBUTE_MERGE("ncam"),
    SUBSCRIPTION_GROUP_UPDATE("sgu"),
    FEATURE_FLAG_IMPRESSION_EVENT("ffi"),
    PUSH_DELIVERY_EVENT("pde"),
    UNKNOWN("");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f21360c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f21361d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21383b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final j1 a(String value) {
            kotlin.jvm.internal.i.e(value, "value");
            Object obj = j1.f21361d.get(value);
            if (obj == null) {
                obj = j1.UNKNOWN;
            }
            return (j1) obj;
        }

        private a() {
        }
    }

    static {
        j1[] j1VarArrValues = values();
        int iN = kotlin.collections.x.n(j1VarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iN >= 16 ? iN : 16);
        for (j1 j1Var : j1VarArrValues) {
            linkedHashMap.put(j1Var.f21383b, j1Var);
        }
        f21361d = linkedHashMap;
    }

    j1(String str) {
        this.f21383b = str;
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public String forJsonPut() {
        return this.f21383b;
    }
}
