package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.enums.Gender;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.models.outgoing.AttributionData;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.StringUtils;
import com.braze.support.ValidationUtils;
import io.intercom.android.sdk.models.AttributeType;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class e7 extends AbstractC1455a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f20922g = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n2 f20923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l5 f20924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SharedPreferences f20925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SharedPreferences f20926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f20927f;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f20928b = new b();

        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "No push token available to add to attributes object.";
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f20929b = new c();

        public c() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Couldn't add push token to outbound json";
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f20930b = new d();

        public d() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Could not create custom attributes json object from preferences";
        }
    }

    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f20931b = new e();

        public e() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to add merged custom attributes back to user object.";
        }
    }

    public static final class f extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f20932b = new f();

        public f() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Push token cache cleared.";
        }
    }

    public static final class g extends Lambda implements Ia.l {
        public g() {
            super(1);
        }

        public final void a(String it) {
            kotlin.jvm.internal.i.e(it, "it");
            e7.this.c("user_id", it);
        }

        @Override // Ia.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return p293xa.r.f47939a;
        }
    }

    public static final class h extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f20934b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(0);
            this.f20934b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to load user object json from prefs with json string: " + this.f20934b;
        }
    }

    public static final class i extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f20935b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONObject f20936c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, JSONObject jSONObject) {
            super(0);
            this.f20935b = str;
            this.f20936c = jSONObject;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to write to user object json from prefs with key: [" + this.f20935b + "] value: [" + this.f20936c + "] ";
        }
    }

    public static final class j extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j f20937b = new j();

        public j() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "SDK is disabled. Not writing to user cache.";
        }
    }

    public static final class k extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f20938b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f20939c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, Object obj) {
            super(0);
            this.f20938b = str;
            this.f20939c = obj;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Could not write to custom attributes json object with key: [");
            sb2.append(this.f20938b);
            sb2.append("] value: [");
            return B6.c.e(sb2, this.f20939c, ']');
        }
    }

    public static final class l extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f20940b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f20941c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, Object obj) {
            super(0);
            this.f20940b = str;
            this.f20941c = obj;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Failed to write to user object json from prefs with key: [");
            sb2.append(this.f20940b);
            sb2.append("] value: [");
            return B6.c.e(sb2, this.f20941c, ']');
        }
    }

    public /* synthetic */ e7(Context context, n2 n2Var, l5 l5Var, String str, String str2, int i10, kotlin.jvm.internal.e eVar) {
        this(context, n2Var, l5Var, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : str2);
    }

    private final JSONObject e() {
        JSONObject jSONObjectF = f();
        if (jSONObjectF.has("custom")) {
            try {
                JSONObject jSONObject = jSONObjectF.getJSONObject("custom");
                kotlin.jvm.internal.i.d(jSONObject, "userObjectFromCache.getJ…OM_ATTRIBUTES_OBJECT_KEY)");
                return jSONObject;
            } catch (JSONException e10) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, d.f20930b);
            }
        }
        return new JSONObject();
    }

    public final synchronized boolean c(String str) {
        return c("email", str);
    }

    public final JSONObject f() {
        String string = this.f20925d.getString("user_cache_attributes_object", null);
        if (string == null) {
            return new JSONObject();
        }
        try {
            return new JSONObject(string);
        } catch (JSONException e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new h(string));
            return new JSONObject();
        }
    }

    public final synchronized void g(String str) {
        c("last_name", str);
    }

    public final synchronized boolean h(String str) {
        return c(AttributeType.PHONE, str);
    }

    public final synchronized void i(String str) {
        this.f20927f = str;
        c("user_id", str);
    }

    public final synchronized boolean j(String key) {
        kotlin.jvm.internal.i.e(key, "key");
        return b(ValidationUtils.ensureBrazeFieldLength(key), JSONObject.NULL);
    }

    public e7(Context context, n2 pushRegistrationDataProvider, l5 sdkEnablementProvider, String str, String str2) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(pushRegistrationDataProvider, "pushRegistrationDataProvider");
        kotlin.jvm.internal.i.e(sdkEnablementProvider, "sdkEnablementProvider");
        this.f20923b = pushRegistrationDataProvider;
        this.f20924c = sdkEnablementProvider;
        this.f20927f = str;
        String cacheFileSuffix = StringUtils.getCacheFileSuffix(context, str, str2);
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.storage.user_cache.v3" + cacheFileSuffix, 0);
        kotlin.jvm.internal.i.d(sharedPreferences, "context.getSharedPrefere…xt.MODE_PRIVATE\n        )");
        this.f20925d = sharedPreferences;
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("com.braze.storage.user_cache.push_token_store" + cacheFileSuffix, 0);
        kotlin.jvm.internal.i.d(sharedPreferences2, "context.getSharedPrefere…xt.MODE_PRIVATE\n        )");
        this.f20926e = sharedPreferences2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean c(String str, Object obj) {
        Object obj2;
        JSONObject jSONObjectF = f();
        if (obj == null) {
            try {
                obj2 = JSONObject.NULL;
            } catch (JSONException e10) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new l(str, obj));
                return false;
            }
        } else {
            obj2 = obj;
        }
        jSONObjectF.put(str, obj2);
        return b(jSONObjectF);
    }

    public final synchronized void a(Gender gender) {
        String strForJsonPut;
        if (gender != null) {
            try {
                strForJsonPut = gender.forJsonPut();
            } catch (Throwable th) {
                throw th;
            }
        } else {
            strForJsonPut = null;
        }
        c("gender", strForJsonPut);
    }

    public final synchronized boolean b(String dateString) {
        kotlin.jvm.internal.i.e(dateString, "dateString");
        return c("dob", dateString);
    }

    public final synchronized void d(String str) {
        c("first_name", str);
    }

    public final synchronized void g() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, f.f20932b, 2, (Object) null);
        this.f20926e.edit().clear().apply();
    }

    @Override // bo.app.AbstractC1455a
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public c4 d() {
        StringUtils.ifNonEmpty(this.f20927f, new g());
        JSONObject jSONObjectF = f();
        a(jSONObjectF);
        this.f20925d.edit().clear().apply();
        return new c4(jSONObjectF);
    }

    public final synchronized void a(String str) {
        c("country", str);
    }

    public final synchronized void b(NotificationSubscriptionType notificationSubscriptionType) {
        String strForJsonPut;
        if (notificationSubscriptionType != null) {
            try {
                strForJsonPut = notificationSubscriptionType.forJsonPut();
            } catch (Throwable th) {
                throw th;
            }
        } else {
            strForJsonPut = null;
        }
        c("push_subscribe", strForJsonPut);
    }

    public final synchronized void a(NotificationSubscriptionType notificationSubscriptionType) {
        String strForJsonPut;
        if (notificationSubscriptionType != null) {
            try {
                strForJsonPut = notificationSubscriptionType.forJsonPut();
            } catch (Throwable th) {
                throw th;
            }
        } else {
            strForJsonPut = null;
        }
        c("email_subscribe", strForJsonPut);
    }

    public final synchronized void a(AttributionData attributionData) {
        JSONObject jSONObjectForJsonPut;
        if (attributionData != null) {
            try {
                jSONObjectForJsonPut = attributionData.forJsonPut();
            } catch (Throwable th) {
                throw th;
            }
        } else {
            jSONObjectForJsonPut = null;
        }
        a("ab_install_attribution", jSONObjectForJsonPut);
    }

    public final synchronized void f(String str) {
        c("language", str);
    }

    private final boolean b(JSONObject jSONObject) {
        if (this.f20924c.a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, j.f20937b, 2, (Object) null);
            return false;
        }
        this.f20925d.edit().putString("user_cache_attributes_object", jSONObject.toString()).apply();
        return true;
    }

    public final synchronized boolean a(String key, Object value) {
        kotlin.jvm.internal.i.e(key, "key");
        kotlin.jvm.internal.i.e(value, "value");
        return b(key, value);
    }

    public final synchronized void e(String str) {
        c("home_city", str);
    }

    public final void a(JSONObject outboundJson) {
        kotlin.jvm.internal.i.e(outboundJson, "outboundJson");
        try {
            String strA = this.f20923b.a();
            if (strA == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, b.f20928b, 3, (Object) null);
            } else {
                if (strA.equals(this.f20926e.getString("push_token", null))) {
                    return;
                }
                outboundJson.put("push_token", strA);
            }
        } catch (JSONException e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, c.f20929b);
        }
    }

    public final boolean b(String key, Object obj) {
        Object obj2;
        kotlin.jvm.internal.i.e(key, "key");
        JSONObject jSONObjectE = e();
        if (obj == null) {
            try {
                obj2 = JSONObject.NULL;
            } catch (JSONException e10) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new k(key, obj));
                return false;
            }
        } else {
            obj2 = obj;
        }
        jSONObjectE.put(key, obj2);
        return c("custom", jSONObjectE);
    }

    @Override // bo.app.AbstractC1455a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(c4 outboundObject, boolean z10) {
        kotlin.jvm.internal.i.e(outboundObject, "outboundObject");
        JSONObject jSONObjectV = outboundObject.v();
        if (z10) {
            if (jSONObjectV.has("push_token")) {
                this.f20926e.edit().putString("push_token", jSONObjectV.optString("push_token")).apply();
                return;
            }
            return;
        }
        JSONObject jSONObjectF = f();
        JSONObject jSONObjectPlus = JsonUtils.plus(jSONObjectV, jSONObjectF);
        jSONObjectPlus.remove("push_token");
        JSONObject jSONObjectOptJSONObject = jSONObjectF.optJSONObject("custom");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectV.optJSONObject("custom");
        try {
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject2 != null) {
                jSONObjectPlus.put("custom", JsonUtils.plus(jSONObjectOptJSONObject2, jSONObjectOptJSONObject));
            } else if (jSONObjectOptJSONObject != null) {
                jSONObjectPlus.put("custom", jSONObjectOptJSONObject);
            } else {
                if (jSONObjectOptJSONObject2 != null) {
                    jSONObjectPlus.put("custom", jSONObjectOptJSONObject2);
                }
                this.f20925d.edit().putString("user_cache_attributes_object", jSONObjectPlus.toString()).apply();
            }
        } catch (JSONException e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, e.f20931b);
        }
        this.f20925d.edit().putString("user_cache_attributes_object", jSONObjectPlus.toString()).apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean] */
    public final boolean a(String key, JSONObject jSONObject) {
        kotlin.jvm.internal.i.e(key, "key");
        JSONObject jSONObjectF = f();
        try {
            if (jSONObject == null) {
                jSONObjectF.put(key, JSONObject.NULL);
            } else {
                JSONObject jSONObjectOptJSONObject = jSONObjectF.optJSONObject(key);
                if (jSONObjectOptJSONObject != null) {
                    jSONObjectF.put(key, JsonUtils.plus(jSONObjectOptJSONObject, jSONObject));
                } else {
                    jSONObjectF.put(key, jSONObject);
                }
            }
            key = b(jSONObjectF);
            return key;
        } catch (JSONException e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new i(key, jSONObject));
            return false;
        }
    }
}
