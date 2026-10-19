package com.braze.models;

import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class FeatureFlag implements IPutIntoJson<JSONObject> {
    public static final a Companion = new a(null);
    public static final String ENABLED = "enabled";
    public static final String ID = "id";
    public static final String PROPERTIES = "properties";
    public static final String PROPERTIES_TYPE = "type";
    public static final String PROPERTIES_TYPE_BOOLEAN = "boolean";
    public static final String PROPERTIES_TYPE_NUMBER = "number";
    public static final String PROPERTIES_TYPE_STRING = "string";
    public static final String PROPERTIES_VALUE = "value";
    public static final String TRACKING_STRING = "fts";
    private final boolean enabled;
    private final String id;
    private final JSONObject properties;
    private final String trackingString;

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FeatureFlag f24149c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, FeatureFlag featureFlag) {
            super(0);
            this.f24148b = str;
            this.f24149c = featureFlag;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Key " + this.f24148b + " does not exist in properties " + this.f24149c.getProperties() + '.';
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f24150b = new c();

        public c() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Caught exception creating FeatureFlag Json.";
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24151b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f24152c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Object obj) {
            super(0);
            this.f24151b = str;
            this.f24152c = obj;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Property is not of type ");
            sb2.append(this.f24151b);
            sb2.append(". It is ");
            return B6.c.e(sb2, this.f24152c, '.');
        }
    }

    public FeatureFlag(String id, boolean z10, JSONObject properties, String str) {
        i.e(id, "id");
        i.e(properties, "properties");
        this.id = id;
        this.enabled = z10;
        this.properties = properties;
        this.trackingString = str;
    }

    public final FeatureFlag deepcopy$android_sdk_base_release() {
        return new FeatureFlag(this.id, this.enabled, JsonUtils.deepcopy(this.properties), this.trackingString);
    }

    public final boolean doesKeyExist$android_sdk_base_release(String key) {
        i.e(key, "key");
        if (this.properties.has(key)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new b(key, this), 2, (Object) null);
        return false;
    }

    public final Boolean getBooleanProperty(String key) throws JSONException {
        i.e(key, "key");
        Object value$android_sdk_base_release = getValue$android_sdk_base_release(key, "boolean");
        if (value$android_sdk_base_release instanceof Boolean) {
            return (Boolean) value$android_sdk_base_release;
        }
        return null;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getId() {
        return this.id;
    }

    public final Number getNumberProperty(String key) throws JSONException {
        i.e(key, "key");
        Object value$android_sdk_base_release = getValue$android_sdk_base_release(key, "number");
        if (value$android_sdk_base_release instanceof Number) {
            return (Number) value$android_sdk_base_release;
        }
        return null;
    }

    public final JSONObject getProperties() {
        return this.properties;
    }

    public final String getStringProperty(String key) throws JSONException {
        i.e(key, "key");
        Object value$android_sdk_base_release = getValue$android_sdk_base_release(key, PROPERTIES_TYPE_STRING);
        if (value$android_sdk_base_release instanceof String) {
            return (String) value$android_sdk_base_release;
        }
        return null;
    }

    public final String getTrackingString$android_sdk_base_release() {
        return this.trackingString;
    }

    public final Object getValue$android_sdk_base_release(String key, String expectedPropertyType) throws JSONException {
        i.e(key, "key");
        i.e(expectedPropertyType, "expectedPropertyType");
        if (!doesKeyExist$android_sdk_base_release(key)) {
            return null;
        }
        Object obj = this.properties.get(key);
        i.c(obj, "null cannot be cast to non-null type org.json.JSONObject");
        JSONObject jSONObject = (JSONObject) obj;
        Object obj2 = jSONObject.get("type");
        if (i.a(obj2, expectedPropertyType)) {
            return jSONObject.get("value");
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new d(expectedPropertyType, obj2), 2, (Object) null);
        return null;
    }

    @Override // com.braze.models.IPutIntoJson
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.id);
            jSONObject.put(ENABLED, this.enabled);
            jSONObject.put(PROPERTIES, this.properties);
            jSONObject.put(TRACKING_STRING, this.trackingString);
        } catch (JSONException e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, c.f24150b);
        }
        return jSONObject;
    }

    public /* synthetic */ FeatureFlag(String str, boolean z10, JSONObject jSONObject, String str2, int i10, e eVar) {
        this(str, z10, jSONObject, (i10 & 8) != 0 ? null : str2);
    }
}
