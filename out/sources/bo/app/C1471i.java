package bo.app;

import com.braze.Constants;
import com.braze.models.FeatureFlag;
import com.braze.models.IBrazeLocation;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.models.inappmessage.MessageButton;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: bo.app.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1471i implements a2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f21202h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final /* synthetic */ Oa.l[] f21203i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j1 f21204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JSONObject f21205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f21206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f21207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j3 f21208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j3 f21209g;

    /* JADX INFO: renamed from: bo.app.i$a */
    public static final class a {

        /* JADX INFO: renamed from: bo.app.i$a$a, reason: collision with other inner class name */
        public static final class C0218a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f21210b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f21211c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0218a(String str, String str2) {
                super(0);
                this.f21210b = str;
                this.f21211c = str2;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a2 invoke() throws JSONException {
                JSONObject eventData = new JSONObject().put("key", this.f21210b).put("value", this.f21211c);
                j1 j1Var = j1.ADD_TO_CUSTOM_ATTRIBUTE_ARRAY;
                kotlin.jvm.internal.i.d(eventData, "eventData");
                return new C1471i(j1Var, eventData, 0.0d, (String) null, 12, (kotlin.jvm.internal.e) null);
            }
        }

        /* JADX INFO: renamed from: bo.app.i$a$a0 */
        public static final class a0 extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f21212b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a0(long j) {
                super(0);
                this.f21212b = j;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a2 invoke() throws JSONException {
                JSONObject eventData = new JSONObject().put(Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, this.f21212b);
                j1 j1Var = j1.SESSION_END;
                kotlin.jvm.internal.i.d(eventData, "eventData");
                return new C1471i(j1Var, eventData, 0.0d, (String) null, 12, (kotlin.jvm.internal.e) null);
            }
        }

        /* JADX INFO: renamed from: bo.app.i$a$b */
        public static final class b extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f21213b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f21214c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, String str2) {
                super(0);
                this.f21213b = str;
                this.f21214c = str2;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a2 invoke() throws JSONException {
                JSONObject jSONObject = new JSONObject(this.f21213b);
                String eventTypeString = jSONObject.getString("name");
                j1.a aVar = j1.f21360c;
                kotlin.jvm.internal.i.d(eventTypeString, "eventTypeString");
                j1 j1VarA = aVar.a(eventTypeString);
                JSONObject data = jSONObject.getJSONObject("data");
                double d10 = jSONObject.getDouble("time");
                String optionalString = JsonUtils.getOptionalString(jSONObject, "user_id");
                String optionalString2 = JsonUtils.getOptionalString(jSONObject, "session_id");
                kotlin.jvm.internal.i.d(data, "data");
                return new C1471i(j1VarA, data, d10, this.f21214c, optionalString, optionalString2);
            }
        }

        /* JADX INFO: renamed from: bo.app.i$a$b0 */
        public static final class b0 extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ v5 f21215b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b0(v5 v5Var) {
                super(0);
                this.f21215b = v5Var;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a2 invoke() {
                C1471i c1471i = new C1471i(j1.SESSION_START, (JSONObject) null, 0.0d, (String) null, 14, (kotlin.jvm.internal.e) null);
                c1471i.a(this.f21215b);
                return c1471i;
            }
        }

        /* JADX INFO: renamed from: bo.app.i$a$c */
        public static final class c extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f21216b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str) {
                super(0);
                this.f21216b = str;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a2 invoke() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(this.f21216b);
                jSONObject.put("ids", jSONArray);
                return new C1471i(j1.CONTENT_CARDS_CLICK, jSONObject, 0.0d, (String) null, 12, (kotlin.jvm.internal.e) null);
            }
        }

        /* JADX INFO: renamed from: bo.app.i$a$c0 */
        public static final class c0 extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f21217b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String[] f21218c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c0(String str, String[] strArr) {
                super(0);
                this.f21217b = str;
                this.f21218c = strArr;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a2 invoke() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", this.f21217b);
                String[] strArr = this.f21218c;
                if (strArr == null) {
                    jSONObject.put("value", JSONObject.NULL);
                } else {
                    jSONObject.put("value", JsonUtils.constructJsonArray(strArr));
                }
                return new C1471i(j1.SET_CUSTOM_ATTRIBUTE_ARRAY, jSONObject, 0.0d, (String) null, 12, (kotlin.jvm.internal.e) null);
            }
        }

        /* JADX INFO: renamed from: bo.app.i$a$d */
        public static final class d extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f21219b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str) {
                super(0);
                this.f21219b = str;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a2 invoke() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(this.f21219b);
                jSONObject.put("ids", jSONArray);
                return new C1471i(j1.CONTENT_CARDS_CONTROL_IMPRESSION, jSONObject, 0.0d, (String) null, 12, (kotlin.jvm.internal.e) null);
            }
        }

        /* JADX INFO: renamed from: bo.app.i$a$d0 */
        public static final class d0 extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f21220b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ e6 f21221c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d0(String str, e6 e6Var) {
                super(0);
                this.f21220b = str;
                this.f21221c = e6Var;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a2 invoke() throws JSONException {
                JSONObject eventData = new JSONObject().put("group_id", this.f21220b).put("status", this.f21221c.forJsonPut());
                j1 j1Var = j1.SUBSCRIPTION_GROUP_UPDATE;
                kotlin.jvm.internal.i.d(eventData, "eventData");
                return new C1471i(j1Var, eventData, 0.0d, (String) null, 12, (kotlin.jvm.internal.e) null);
            }
        }

        /* JADX INFO: renamed from: bo.app.i$a$e */
        public static final class e extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f21222b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(String str) {
                super(0);
                this.f21222b = str;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a2 invoke() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(this.f21222b);
                jSONObject.put("ids", jSONArray);
                return new C1471i(j1.CONTENT_CARDS_DISMISS, jSONObject, 0.0d, (String) null, 12, (kotlin.jvm.internal.e) null);
            }
        }

        /* JADX INFO: renamed from: bo.app.i$a$e0 */
        public static final class e0 extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f21223b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f21224c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e0(String str, String str2) {
                super(0);
                this.f21223b = str;
                this.f21224c = str2;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a2 invoke() throws JSONException {
                JSONObject eventData = new JSONObject().put(Constants.BRAZE_PUSH_CONTENT_KEY, this.f21223b).put("l", this.f21224c);
                j1 j1Var = j1.USER_ALIAS;
                kotlin.jvm.internal.i.d(eventData, "eventData");
                return new C1471i(j1Var, eventData, 0.0d, (String) null, 12, (kotlin.jvm.internal.e) null);
            }
        }

        /* JADX INFO: renamed from: bo.app.i$a$f */
        public static final class f extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f21225b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(String str) {
                super(0);
                this.f21225b = str;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a2 invoke() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(this.f21225b);
                jSONObject.put("ids", jSONArray);
                return new C1471i(j1.CONTENT_CARDS_IMPRESSION, jSONObject, 0.0d, (String) null, 12, (kotlin.jvm.internal.e) null);
            }
        }

        /* JADX INFO: renamed from: bo.app.i$a$f0 */
        public static final class f0 extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final f0 f21226b = new f0();

            public f0() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Failed to create event";
            }
        }

        /* JADX INFO: renamed from: bo.app.i$a$g */
        public static final class g extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f21227b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ BrazeProperties f21228c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(String str, BrazeProperties brazeProperties) {
                super(0);
                this.f21227b = str;
                this.f21228c = brazeProperties;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a2 invoke() throws JSONException {
                JSONObject eventData = new JSONObject().put(Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID, this.f21227b);
                BrazeProperties brazeProperties = this.f21228c;
                if (brazeProperties != null && brazeProperties.getSize() > 0) {
                    eventData.put(Constants.BRAZE_PUSH_PRIORITY_KEY, this.f21228c.forJsonPut());
                }
                j1 j1Var = j1.CUSTOM_EVENT;
                kotlin.jvm.internal.i.d(eventData, "eventData");
                return new C1471i(j1Var, eventData, 0.0d, (String) null, 12, (kotlin.jvm.internal.e) null);
            }
        }

        /* JADX INFO: renamed from: bo.app.i$a$h */
        public static final class h extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Throwable f21229b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ v5 f21230c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f21231d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(Throwable th, v5 v5Var, boolean z10) {
                super(0);
                this.f21229b = th;
                this.f21230c = v5Var;
                this.f21231d = z10;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a2 invoke() throws JSONException {
                String str;
                StringBuilder sb2 = new StringBuilder("\n                original_sdk_version: 30.0.0\n                exception_class: ");
                sb2.append(this.f21229b.getClass().getName());
                sb2.append("\n                available_cpus: ");
                sb2.append(Runtime.getRuntime().availableProcessors());
                sb2.append("\n                ");
                v5 v5Var = this.f21230c;
                if (v5Var != null) {
                    str = "session_id: " + v5Var;
                } else {
                    str = null;
                }
                sb2.append(str);
                sb2.append("\n                ");
                sb2.append(C1471i.f21202h.a(this.f21229b));
                sb2.append("\n            ");
                JSONObject eventData = new JSONObject().put("e", kotlin.text.i.v(sb2.toString()));
                if (!this.f21231d) {
                    eventData.put("nop", true);
                }
                j1 j1Var = j1.INTERNAL_ERROR;
                kotlin.jvm.internal.i.d(eventData, "eventData");
                return new C1471i(j1Var, eventData, 0.0d, (String) null, 12, (kotlin.jvm.internal.e) null);
            }
        }

        /* JADX INFO: renamed from: bo.app.i$a$i, reason: collision with other inner class name */
        public static final class C0219i extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ FeatureFlag f21232b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0219i(FeatureFlag featureFlag) {
                super(0);
                this.f21232b = featureFlag;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a2 invoke() throws JSONException {
                JSONObject eventData = new JSONObject().put("fid", this.f21232b.getId()).put(FeatureFlag.TRACKING_STRING, this.f21232b.getTrackingString$android_sdk_base_release());
                j1 j1Var = j1.FEATURE_FLAG_IMPRESSION_EVENT;
                kotlin.jvm.internal.i.d(eventData, "eventData");
                return new C1471i(j1Var, eventData, 0.0d, (String) null, 12, (kotlin.jvm.internal.e) null);
            }
        }

        /* JADX INFO: renamed from: bo.app.i$a$j */
        public static final class j extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f21233b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(String str) {
                super(0);
                this.f21233b = str;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a2 invoke() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(this.f21233b);
                jSONObject.put("ids", jSONArray);
                return new C1471i(j1.NEWS_FEED_CARD_CLICK, jSONObject, 0.0d, (String) null, 12, (kotlin.jvm.internal.e) null);
            }
        }

        /* JADX INFO: renamed from: bo.app.i$a$k */
        public static final class k extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f21234b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(String str) {
                super(0);
                this.f21234b = str;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a2 invoke() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(this.f21234b);
                jSONObject.put("ids", jSONArray);
                return new C1471i(j1.NEWS_FEED_CARD_IMPRESSION, jSONObject, 0.0d, (String) null, 12, (kotlin.jvm.internal.e) null);
            }
        }

        /* JADX INFO: renamed from: bo.app.i$a$l */
        public static final class l extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f21235b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f21236c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public l(String str, String str2) {
                super(0);
                this.f21235b = str;
                this.f21236c = str2;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a2 invoke() throws JSONException {
                JSONObject eventData = new JSONObject().put("geo_id", this.f21235b).put("event_type", this.f21236c);
                j1 j1Var = j1.GEOFENCE;
                kotlin.jvm.internal.i.d(eventData, "eventData");
                return new C1471i(j1Var, eventData, 0.0d, (String) null, 12, (kotlin.jvm.internal.e) null);
            }
        }

        /* JADX INFO: renamed from: bo.app.i$a$m */
        public static final class m extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f21237b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f21238c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public m(String str, String str2) {
                super(0);
                this.f21237b = str;
                this.f21238c = str2;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a2 invoke() {
                return new C1471i(j1.INAPP_MESSAGE_BUTTON_CLICK, C1471i.f21202h.h(this.f21237b, this.f21238c), 0.0d, (String) null, 12, (kotlin.jvm.internal.e) null);
            }
        }

        /* JADX INFO: renamed from: bo.app.i$a$n */
        public static final class n extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f21239b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ MessageButton f21240c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public n(String str, MessageButton messageButton) {
                super(0);
                this.f21239b = str;
                this.f21240c = messageButton;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a2 invoke() {
                return new C1471i(j1.INAPP_MESSAGE_BUTTON_CLICK, C1471i.f21202h.h(this.f21239b, this.f21240c.getStringId()), 0.0d, (String) null, 12, (kotlin.jvm.internal.e) null);
            }
        }

        /* JADX INFO: renamed from: bo.app.i$a$o */
        public static final class o extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f21241b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public o(String str) {
                super(0);
                this.f21241b = str;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a2 invoke() {
                return new C1471i(j1.INAPP_MESSAGE_CLICK, a.a(C1471i.f21202h, this.f21241b, (String) null, 2, (Object) null), 0.0d, (String) null, 12, (kotlin.jvm.internal.e) null);
            }
        }

        /* JADX INFO: renamed from: bo.app.i$a$p */
        public static final class p extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f21242b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public p(String str) {
                super(0);
                this.f21242b = str;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a2 invoke() {
                return new C1471i(j1.INAPP_MESSAGE_CONTROL_IMPRESSION, a.a(C1471i.f21202h, this.f21242b, (String) null, 2, (Object) null), 0.0d, (String) null, 12, (kotlin.jvm.internal.e) null);
            }
        }

        /* JADX INFO: renamed from: bo.app.i$a$q */
        public static final class q extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f21243b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public q(String str) {
                super(0);
                this.f21243b = str;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a2 invoke() {
                return new C1471i(j1.INAPP_MESSAGE_IMPRESSION, a.a(C1471i.f21202h, this.f21243b, (String) null, 2, (Object) null), 0.0d, (String) null, 12, (kotlin.jvm.internal.e) null);
            }
        }

        /* JADX INFO: renamed from: bo.app.i$a$r */
        public static final class r extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f21244b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f21245c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public r(String str, int i10) {
                super(0);
                this.f21244b = str;
                this.f21245c = i10;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a2 invoke() throws JSONException {
                JSONObject eventData = new JSONObject().put("key", this.f21244b).put("value", this.f21245c);
                j1 j1Var = j1.INCREMENT;
                kotlin.jvm.internal.i.d(eventData, "eventData");
                return new C1471i(j1Var, eventData, 0.0d, (String) null, 12, (kotlin.jvm.internal.e) null);
            }
        }

        /* JADX INFO: renamed from: bo.app.i$a$s */
        public static final class s extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f21246b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public s(String str) {
                super(0);
                this.f21246b = str;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a2 invoke() throws JSONException {
                JSONObject eventData = new JSONObject().put(Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID, this.f21246b);
                j1 j1Var = j1.INTERNAL;
                kotlin.jvm.internal.i.d(eventData, "eventData");
                return new C1471i(j1Var, eventData, 0.0d, (String) null, 12, (kotlin.jvm.internal.e) null);
            }
        }

        /* JADX INFO: renamed from: bo.app.i$a$t */
        public static final class t extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f21247b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ double f21248c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ double f21249d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public t(String str, double d10, double d11) {
                super(0);
                this.f21247b = str;
                this.f21248c = d10;
                this.f21249d = d11;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a2 invoke() throws JSONException {
                JSONObject eventData = new JSONObject().put("key", this.f21247b).put(IBrazeLocation.LATITUDE, this.f21248c).put(IBrazeLocation.LONGITUDE, this.f21249d);
                j1 j1Var = j1.LOCATION_CUSTOM_ATTRIBUTE_ADD;
                kotlin.jvm.internal.i.d(eventData, "eventData");
                return new C1471i(j1Var, eventData, 0.0d, (String) null, 12, (kotlin.jvm.internal.e) null);
            }
        }

        /* JADX INFO: renamed from: bo.app.i$a$u */
        public static final class u extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f21250b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public u(String str) {
                super(0);
                this.f21250b = str;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a2 invoke() throws JSONException {
                JSONObject eventData = new JSONObject().put("key", this.f21250b);
                j1 j1Var = j1.LOCATION_CUSTOM_ATTRIBUTE_REMOVE;
                kotlin.jvm.internal.i.d(eventData, "eventData");
                return new C1471i(j1Var, eventData, 0.0d, (String) null, 12, (kotlin.jvm.internal.e) null);
            }
        }

        /* JADX INFO: renamed from: bo.app.i$a$v */
        public static final class v extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ IBrazeLocation f21251b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public v(IBrazeLocation iBrazeLocation) {
                super(0);
                this.f21251b = iBrazeLocation;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a2 invoke() {
                return new C1471i(j1.LOCATION_RECORDED, this.f21251b.forJsonPut(), 0.0d, (String) null, 12, (kotlin.jvm.internal.e) null);
            }
        }

        /* JADX INFO: renamed from: bo.app.i$a$w */
        public static final class w extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f21252b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ JSONObject f21253c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public w(String str, JSONObject jSONObject) {
                super(0);
                this.f21252b = str;
                this.f21253c = jSONObject;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a2 invoke() throws JSONException {
                JSONObject eventData = new JSONObject().put("key", this.f21252b).put("value", this.f21253c);
                j1 j1Var = j1.NESTED_CUSTOM_ATTRIBUTE_MERGE;
                kotlin.jvm.internal.i.d(eventData, "eventData");
                return new C1471i(j1Var, eventData, 0.0d, (String) null, 12, (kotlin.jvm.internal.e) null);
            }
        }

        /* JADX INFO: renamed from: bo.app.i$a$x */
        public static final class x extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BrazeProperties f21254b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f21255c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f21256d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ BigDecimal f21257e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f21258f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public x(BrazeProperties brazeProperties, String str, String str2, BigDecimal bigDecimal, int i10) {
                super(0);
                this.f21254b = brazeProperties;
                this.f21255c = str;
                this.f21256d = str2;
                this.f21257e = bigDecimal;
                this.f21258f = i10;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a2 invoke() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                String str = this.f21255c;
                String str2 = this.f21256d;
                BigDecimal bigDecimal = this.f21257e;
                int i10 = this.f21258f;
                jSONObject.put("pid", str);
                jSONObject.put("c", str2);
                jSONObject.put(Constants.BRAZE_PUSH_PRIORITY_KEY, v3.a(bigDecimal).doubleValue());
                jSONObject.put("q", i10);
                BrazeProperties brazeProperties = this.f21254b;
                if (brazeProperties != null && brazeProperties.getSize() > 0) {
                    jSONObject.put("pr", this.f21254b.forJsonPut());
                }
                return new C1471i(j1.PURCHASE, jSONObject, 0.0d, (String) null, 12, (kotlin.jvm.internal.e) null);
            }
        }

        /* JADX INFO: renamed from: bo.app.i$a$y */
        public static final class y extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f21259b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f21260c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public y(String str, String str2) {
                super(0);
                this.f21259b = str;
                this.f21260c = str2;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a2 invoke() throws JSONException {
                JSONObject eventData = new JSONObject().put(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY, this.f21259b).put(Constants.BRAZE_PUSH_CONTENT_KEY, this.f21260c);
                j1 j1Var = j1.PUSH_STORY_PAGE_CLICK;
                kotlin.jvm.internal.i.d(eventData, "eventData");
                return new C1471i(j1Var, eventData, 0.0d, (String) null, 12, (kotlin.jvm.internal.e) null);
            }
        }

        /* JADX INFO: renamed from: bo.app.i$a$z */
        public static final class z extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f21261b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f21262c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public z(String str, String str2) {
                super(0);
                this.f21261b = str;
                this.f21262c = str2;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a2 invoke() throws JSONException {
                JSONObject eventData = new JSONObject().put("key", this.f21261b).put("value", this.f21262c);
                j1 j1Var = j1.REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY;
                kotlin.jvm.internal.i.d(eventData, "eventData");
                return new C1471i(j1Var, eventData, 0.0d, (String) null, 12, (kotlin.jvm.internal.e) null);
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final a2 a(String eventName, BrazeProperties brazeProperties) {
            kotlin.jvm.internal.i.e(eventName, "eventName");
            return a(new g(eventName, brazeProperties));
        }

        public final a2 b(String cardId) {
            kotlin.jvm.internal.i.e(cardId, "cardId");
            return a(new d(cardId));
        }

        public final a2 c(String cardId) {
            kotlin.jvm.internal.i.e(cardId, "cardId");
            return a(new e(cardId));
        }

        public final a2 d(String cardId) {
            kotlin.jvm.internal.i.e(cardId, "cardId");
            return a(new f(cardId));
        }

        public final a2 e(String cardId) {
            kotlin.jvm.internal.i.e(cardId, "cardId");
            return a(new j(cardId));
        }

        public final a2 f(String cardId) {
            kotlin.jvm.internal.i.e(cardId, "cardId");
            return a(new k(cardId));
        }

        public final a2 g(String alias, String label) {
            kotlin.jvm.internal.i.e(alias, "alias");
            kotlin.jvm.internal.i.e(label, "label");
            return a(new e0(alias, label));
        }

        public final a2 h(String triggerId) {
            kotlin.jvm.internal.i.e(triggerId, "triggerId");
            return a(new p(triggerId));
        }

        public final a2 i(String triggerId) {
            kotlin.jvm.internal.i.e(triggerId, "triggerId");
            return a(new q(triggerId));
        }

        public final a2 j(String name) {
            kotlin.jvm.internal.i.e(name, "name");
            return a(new s(name));
        }

        public final a2 k(String str) {
            return a(new u(str));
        }

        private a() {
        }

        public final a2 a(String productId, String currencyCode, BigDecimal price, int i10, BrazeProperties brazeProperties) {
            kotlin.jvm.internal.i.e(productId, "productId");
            kotlin.jvm.internal.i.e(currencyCode, "currencyCode");
            kotlin.jvm.internal.i.e(price, "price");
            return a(new x(brazeProperties, productId, currencyCode, price, i10));
        }

        public final a2 b(String serializedEvent, String uniqueIdentifier) {
            kotlin.jvm.internal.i.e(serializedEvent, "serializedEvent");
            kotlin.jvm.internal.i.e(uniqueIdentifier, "uniqueIdentifier");
            return a(new b(serializedEvent, uniqueIdentifier));
        }

        public final a2 c(String id, String eventType) {
            kotlin.jvm.internal.i.e(id, "id");
            kotlin.jvm.internal.i.e(eventType, "eventType");
            return a(new l(id, eventType));
        }

        public final a2 d(String triggerId, String buttonId) {
            kotlin.jvm.internal.i.e(triggerId, "triggerId");
            kotlin.jvm.internal.i.e(buttonId, "buttonId");
            return a(new m(triggerId, buttonId));
        }

        public final a2 e(String campaignId, String pageId) {
            kotlin.jvm.internal.i.e(campaignId, "campaignId");
            kotlin.jvm.internal.i.e(pageId, "pageId");
            return a(new y(campaignId, pageId));
        }

        public final a2 f(String key, String value) {
            kotlin.jvm.internal.i.e(key, "key");
            kotlin.jvm.internal.i.e(value, "value");
            return a(new z(key, value));
        }

        public final a2 g(String triggerId) {
            kotlin.jvm.internal.i.e(triggerId, "triggerId");
            return a(new o(triggerId));
        }

        public final JSONObject h(String str, String str2) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            if (str != null && str.length() != 0) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(str);
                jSONObject.put("trigger_ids", jSONArray);
            }
            if (str2 != null && str2.length() != 0) {
                jSONObject.put("bid", str2);
            }
            return jSONObject;
        }

        public final a2 a(IBrazeLocation location) {
            kotlin.jvm.internal.i.e(location, "location");
            return a(new v(location));
        }

        public final a2 a(Throwable throwable, v5 v5Var, boolean z10) {
            kotlin.jvm.internal.i.e(throwable, "throwable");
            return a(new h(throwable, v5Var, z10));
        }

        public final a2 a(String cardId) {
            kotlin.jvm.internal.i.e(cardId, "cardId");
            return a(new c(cardId));
        }

        public final a2 a(String triggerId, MessageButton messageButton) {
            kotlin.jvm.internal.i.e(triggerId, "triggerId");
            kotlin.jvm.internal.i.e(messageButton, "messageButton");
            return a(new n(triggerId, messageButton));
        }

        public final a2 a() {
            return j("feed_displayed");
        }

        public final a2 a(FeatureFlag ff) {
            kotlin.jvm.internal.i.e(ff, "ff");
            return a(new C0219i(ff));
        }

        public final a2 a(String customUserAttributeKey, int i10) {
            kotlin.jvm.internal.i.e(customUserAttributeKey, "customUserAttributeKey");
            return a(new r(customUserAttributeKey, i10));
        }

        public final a2 a(String key, String value) {
            kotlin.jvm.internal.i.e(key, "key");
            kotlin.jvm.internal.i.e(value, "value");
            return a(new C0218a(key, value));
        }

        public final a2 a(String key, String[] strArr) {
            kotlin.jvm.internal.i.e(key, "key");
            return a(new c0(key, strArr));
        }

        public final a2 a(v5 sessionId) {
            kotlin.jvm.internal.i.e(sessionId, "sessionId");
            return a(new b0(sessionId));
        }

        public final a2 a(long j10) {
            return a(new a0(j10));
        }

        public final a2 a(String key, double d10, double d11) {
            kotlin.jvm.internal.i.e(key, "key");
            return a(new t(key, d10, d11));
        }

        public final a2 a(String key, JSONObject json) {
            kotlin.jvm.internal.i.e(key, "key");
            kotlin.jvm.internal.i.e(json, "json");
            return a(new w(key, json));
        }

        public final a2 a(String subscriptionGroupId, e6 subscriptionGroupStatus) {
            kotlin.jvm.internal.i.e(subscriptionGroupId, "subscriptionGroupId");
            kotlin.jvm.internal.i.e(subscriptionGroupStatus, "subscriptionGroupStatus");
            return a(new d0(subscriptionGroupId, subscriptionGroupStatus));
        }

        public final String a(Throwable throwable) {
            kotlin.jvm.internal.i.e(throwable, "throwable");
            StringWriter stringWriter = new StringWriter();
            throwable.printStackTrace(new PrintWriter(stringWriter));
            String string = stringWriter.toString();
            kotlin.jvm.internal.i.d(string, "result.toString()");
            return kotlin.text.o.t0(InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS, string);
        }

        public static /* synthetic */ JSONObject a(a aVar, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            return aVar.h(str, str2);
        }

        private final a2 a(Ia.a aVar) {
            try {
                return (a2) aVar.invoke();
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, f0.f21226b);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: bo.app.i$b */
    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f21263b = new b();

        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Caught exception creating Braze event json";
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(C1471i.class, "userId", "getUserId()Ljava/lang/String;", 0);
        kotlin.jvm.internal.l.f43062a.getClass();
        f21203i = new Oa.l[]{mutablePropertyReference1Impl, new MutablePropertyReference1Impl(C1471i.class, "sessionId", "getSessionId()Lcom/braze/models/SessionId;", 0)};
        f21202h = new a(null);
    }

    public C1471i(j1 type, JSONObject data, double d10, String uniqueIdentifier) {
        kotlin.jvm.internal.i.e(type, "type");
        kotlin.jvm.internal.i.e(data, "data");
        kotlin.jvm.internal.i.e(uniqueIdentifier, "uniqueIdentifier");
        this.f21204b = type;
        this.f21205c = data;
        this.f21206d = d10;
        this.f21207e = uniqueIdentifier;
        this.f21208f = new j3();
        this.f21209g = new j3();
        if (type == j1.UNKNOWN) {
            throw new IllegalArgumentException("Event type cannot be unknown.");
        }
    }

    @Override // bo.app.a2
    public final j1 a() {
        return this.f21204b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        return kotlin.jvm.internal.i.a(t(), ((C1471i) obj).t());
    }

    public int hashCode() {
        return t().hashCode();
    }

    @Override // bo.app.a2
    public boolean m() {
        return this.f21204b == j1.INTERNAL_ERROR && q().optBoolean("nop", false);
    }

    @Override // bo.app.a2
    public JSONObject q() {
        return this.f21205c;
    }

    @Override // bo.app.a2
    public final v5 s() {
        return (v5) this.f21209g.getValue(this, f21203i[1]);
    }

    @Override // bo.app.a2
    public String t() {
        return this.f21207e;
    }

    public String toString() {
        return f();
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.f21204b.forJsonPut());
            jSONObject.put("data", q());
            jSONObject.put("time", v());
            String strW = w();
            if (strW != null && strW.length() != 0) {
                jSONObject.put("user_id", w());
            }
            v5 v5VarS = s();
            if (v5VarS != null) {
                jSONObject.put("session_id", v5VarS.forJsonPut());
            }
        } catch (JSONException e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, b.f21263b);
        }
        return jSONObject;
    }

    public double v() {
        return this.f21206d;
    }

    public final String w() {
        return (String) this.f21208f.getValue(this, f21203i[0]);
    }

    @Override // bo.app.a2
    public final void a(String str) {
        this.f21208f.setValue(this, f21203i[0], str);
    }

    @Override // bo.app.a2
    public final void a(v5 v5Var) {
        this.f21209g.setValue(this, f21203i[1], v5Var);
    }

    public /* synthetic */ C1471i(j1 j1Var, JSONObject jSONObject, double d10, String str, int i10, kotlin.jvm.internal.e eVar) {
        this(j1Var, (i10 & 2) != 0 ? new JSONObject() : jSONObject, (i10 & 4) != 0 ? DateTimeUtils.nowInSecondsPrecise() : d10, (i10 & 8) != 0 ? androidx.compose.animation.D.c("randomUUID().toString()") : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1471i(j1 eventType, JSONObject eventData, double d10, String uniqueIdentifier, String str, String str2) {
        this(eventType, eventData, d10, uniqueIdentifier);
        kotlin.jvm.internal.i.e(eventType, "eventType");
        kotlin.jvm.internal.i.e(eventData, "eventData");
        kotlin.jvm.internal.i.e(uniqueIdentifier, "uniqueIdentifier");
        a(str);
        a(str2 != null ? v5.f22077d.a(str2) : null);
    }
}
