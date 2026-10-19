package bo.app;

import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class w6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w6 f22152a = new w6();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f22153b = BrazeLogger.getBrazeLogTag((Class<?>) w6.class);

    public static final class a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f22154b = new a();

        public a() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Templated message Json was null. Not de-serializing templated message.";
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22155b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.f22155b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Q8.d.a(new StringBuilder("Received templated message Json with unknown type: "), this.f22155b, ". Not parsing.");
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f22156b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(JSONObject jSONObject) {
            super(0);
            this.f22156b = jSONObject;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Encountered exception processing templated message: " + this.f22156b;
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f22157b = new d();

        public d() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Received null or blank trigger condition Json. Not parsing.";
        }
    }

    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22158b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.f22158b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Q8.d.a(new StringBuilder("Received triggered condition Json with unknown type: "), this.f22158b, ". Not parsing.");
        }
    }

    public static final class f extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22159b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.f22159b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Received unknown trigger type: " + this.f22159b;
        }
    }

    public static final class g extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f22160b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(JSONObject jSONObject) {
            super(0);
            this.f22160b = jSONObject;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to deserialize triggered action Json: " + this.f22160b;
        }
    }

    public static final class h extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f22161b = new h();

        public h() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Triggered actions Json array was null. Not de-serializing triggered actions.";
        }
    }

    public static final class i extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONArray f22162b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(JSONArray jSONArray) {
            super(0);
            this.f22162b = jSONArray;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to deserialize triggered actions Json array: " + this.f22162b;
        }
    }

    private w6() {
    }

    public final IInAppMessage a(JSONObject jSONObject, c2 brazeManager) {
        kotlin.jvm.internal.i.e(brazeManager, "brazeManager");
        try {
            if (jSONObject == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f22153b, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) a.f22154b, 6, (Object) null);
                return null;
            }
            String string = jSONObject.getString("type");
            if (!kotlin.jvm.internal.i.a(string, "inapp")) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f22153b, BrazeLogger.Priority.W, (Throwable) null, (Ia.a) new b(string), 4, (Object) null);
                return null;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            if (jSONObject2 == null) {
                return null;
            }
            return com.braze.support.h.a(jSONObject2, brazeManager);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(f22153b, BrazeLogger.Priority.W, (Throwable) e10, (Ia.a<String>) new c(jSONObject));
            return null;
        }
    }

    public final c3 b(JSONObject actionJson, c2 brazeManager) {
        kotlin.jvm.internal.i.e(actionJson, "actionJson");
        kotlin.jvm.internal.i.e(brazeManager, "brazeManager");
        try {
            String string = actionJson.getString("type");
            if (kotlin.jvm.internal.i.a(string, "inapp")) {
                return new i3(actionJson, brazeManager);
            }
            if (kotlin.jvm.internal.i.a(string, "templated_iam")) {
                return new i6(actionJson, brazeManager);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new f(string), 2, (Object) null);
            return null;
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(f22153b, BrazeLogger.Priority.W, (Throwable) e10, (Ia.a<String>) new g(actionJson));
        }
    }

    public final List a(JSONArray jSONArray, c2 brazeManager) {
        kotlin.jvm.internal.i.e(brazeManager, "brazeManager");
        try {
            if (jSONArray == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f22153b, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) h.f22161b, 6, (Object) null);
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject actionJson = jSONArray.getJSONObject(i10);
                kotlin.jvm.internal.i.d(actionJson, "actionJson");
                c3 c3VarB = b(actionJson, brazeManager);
                if (c3VarB != null) {
                    arrayList.add(c3VarB);
                }
            }
            return arrayList;
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(f22153b, BrazeLogger.Priority.W, (Throwable) e10, (Ia.a<String>) new i(jSONArray));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x00ce  */
    public final List a(JSONArray triggerConditionsJson) throws JSONException {
        kotlin.jvm.internal.i.e(triggerConditionsJson, "triggerConditionsJson");
        ArrayList arrayList = new ArrayList();
        int length = triggerConditionsJson.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObjectOptJSONObject = triggerConditionsJson.optJSONObject(i10);
            if (jSONObjectOptJSONObject == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f22153b, BrazeLogger.Priority.W, (Throwable) null, (Ia.a) d.f22157b, 4, (Object) null);
            } else {
                String string = jSONObjectOptJSONObject.getString("type");
                if (string != null) {
                    switch (string) {
                        case "purchase_property":
                            arrayList.add(new i4(jSONObjectOptJSONObject));
                            break;
                        case "open":
                            arrayList.add(new x3());
                            break;
                        case "test":
                            arrayList.add(new j6());
                            break;
                        case "custom_event_property":
                            arrayList.add(new C1460c0(jSONObjectOptJSONObject));
                            break;
                        case "custom_event":
                            arrayList.add(new C1456a0(jSONObjectOptJSONObject));
                            break;
                        case "iam_click":
                            arrayList.add(new e3(jSONObjectOptJSONObject));
                            break;
                        case "purchase":
                            arrayList.add(new g4(jSONObjectOptJSONObject));
                            break;
                        case "push_click":
                            arrayList.add(new k4(jSONObjectOptJSONObject));
                            break;
                        default:
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f22153b, BrazeLogger.Priority.W, (Throwable) null, (Ia.a) new e(string), 4, (Object) null);
                            break;
                    }
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f22153b, BrazeLogger.Priority.W, (Throwable) null, (Ia.a) new e(string), 4, (Object) null);
                }
            }
        }
        return arrayList;
    }
}
