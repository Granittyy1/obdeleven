package com.braze.support;

import bo.app.c2;
import bo.app.h3;
import com.braze.enums.inappmessage.MessageType;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.models.inappmessage.InAppMessageControl;
import com.braze.models.inappmessage.InAppMessageFull;
import com.braze.models.inappmessage.InAppMessageHtml;
import com.braze.models.inappmessage.InAppMessageHtmlFull;
import com.braze.models.inappmessage.InAppMessageModal;
import com.braze.models.inappmessage.InAppMessageSlideup;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Lambda;
import kotlin.text.n;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f24389a = BrazeLogger.INSTANCE.getBrazeLogTag("InAppMessageModelUtils");

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24390a;

        static {
            int[] iArr = new int[MessageType.values().length];
            try {
                iArr[MessageType.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageType.MODAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageType.SLIDEUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageType.HTML_FULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MessageType.HTML.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f24390a = iArr;
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f24391b = new b();

        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Deserializing control in-app message.";
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f24392b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(JSONObject jSONObject) {
            super(0);
            this.f24392b = jSONObject;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "In-app message type was unknown for in-app message: " + JsonUtils.getPrettyPrintedString(this.f24392b);
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f24393b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(JSONObject jSONObject) {
            super(0);
            this.f24393b = jSONObject;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Unknown in-app message type. Returning null: " + JsonUtils.getPrettyPrintedString(this.f24393b);
        }
    }

    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f24394b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(JSONObject jSONObject) {
            super(0);
            this.f24394b = jSONObject;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to deserialize the in-app message: " + JsonUtils.getPrettyPrintedString(this.f24394b) + ". Returning null.";
        }
    }

    public static final class f extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f24395b = new f();

        public f() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "In-app message string was blank.";
        }
    }

    public static final class g extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24396b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(0);
            this.f24396b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to deserialize the in-app message string: " + this.f24396b;
        }
    }

    public static final IInAppMessage a(String inAppMessageJsonString, c2 brazeManager) {
        kotlin.jvm.internal.i.e(inAppMessageJsonString, "inAppMessageJsonString");
        kotlin.jvm.internal.i.e(brazeManager, "brazeManager");
        if (n.S(inAppMessageJsonString)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f24389a, BrazeLogger.Priority.I, (Throwable) null, (Ia.a) f.f24395b, 4, (Object) null);
            return null;
        }
        try {
            return a(new JSONObject(inAppMessageJsonString), brazeManager);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(f24389a, BrazeLogger.Priority.E, (Throwable) e10, (Ia.a<String>) new g(inAppMessageJsonString));
            return null;
        }
    }

    public static final JSONArray b(JSONObject inAppMessageJson) {
        JSONObject jSONObjectOptJSONObject;
        kotlin.jvm.internal.i.e(inAppMessageJson, "inAppMessageJson");
        JSONObject jSONObjectOptJSONObject2 = inAppMessageJson.optJSONObject("themes");
        JSONArray jSONArrayOptJSONArray = (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("dark")) == null) ? null : jSONObjectOptJSONObject.optJSONArray("btns");
        return jSONArrayOptJSONArray == null ? new JSONArray() : jSONArrayOptJSONArray;
    }

    public static final boolean c(JSONObject inAppMessageJson) {
        kotlin.jvm.internal.i.e(inAppMessageJson, "inAppMessageJson");
        return inAppMessageJson.optBoolean(InAppMessageBase.IS_CONTROL, false);
    }

    public static final IInAppMessage a(JSONObject inAppMessageJson, c2 brazeManager) {
        MessageType messageType;
        IInAppMessage inAppMessageFull;
        kotlin.jvm.internal.i.e(inAppMessageJson, "inAppMessageJson");
        kotlin.jvm.internal.i.e(brazeManager, "brazeManager");
        try {
            if (c(inAppMessageJson)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f24389a, BrazeLogger.Priority.D, (Throwable) null, (Ia.a) b.f24391b, 4, (Object) null);
                return new InAppMessageControl(inAppMessageJson, brazeManager);
            }
            try {
                com.braze.support.c cVar = com.braze.support.c.f24371a;
                String string = inAppMessageJson.getString("type");
                kotlin.jvm.internal.i.d(string, "jsonObject.getString(key)");
                Locale US = Locale.US;
                kotlin.jvm.internal.i.d(US, "US");
                String upperCase = string.toUpperCase(US);
                kotlin.jvm.internal.i.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
                MessageType[] messageTypeArrValues = MessageType.values();
                int length = messageTypeArrValues.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        messageType = messageTypeArrValues[i10];
                        if (kotlin.jvm.internal.i.a(messageType.name(), upperCase)) {
                            break;
                        }
                        i10++;
                    } else {
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                }
            } catch (Exception unused) {
                messageType = null;
            }
            if (messageType == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f24389a, BrazeLogger.Priority.I, (Throwable) null, (Ia.a) new c(inAppMessageJson), 4, (Object) null);
                return null;
            }
            int i11 = a.f24390a[messageType.ordinal()];
            if (i11 == 1) {
                inAppMessageFull = new InAppMessageFull(inAppMessageJson, brazeManager);
            } else if (i11 == 2) {
                inAppMessageFull = new InAppMessageModal(inAppMessageJson, brazeManager);
            } else if (i11 == 3) {
                inAppMessageFull = new InAppMessageSlideup(inAppMessageJson, brazeManager);
            } else if (i11 == 4) {
                inAppMessageFull = new InAppMessageHtmlFull(inAppMessageJson, brazeManager);
            } else {
                if (i11 != 5) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f24389a, BrazeLogger.Priority.W, (Throwable) null, (Ia.a) new d(inAppMessageJson), 4, (Object) null);
                    return null;
                }
                inAppMessageFull = new InAppMessageHtml(inAppMessageJson, brazeManager);
            }
            return inAppMessageFull;
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(f24389a, BrazeLogger.Priority.E, (Throwable) e10, (Ia.a<String>) new e(inAppMessageJson));
            return null;
        }
    }

    public static final h3 a(JSONObject inAppMessageJson) {
        kotlin.jvm.internal.i.e(inAppMessageJson, "inAppMessageJson");
        JSONObject jSONObjectOptJSONObject = inAppMessageJson.optJSONObject("themes");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject("dark") : null;
        if (jSONObjectOptJSONObject2 != null) {
            return new h3(jSONObjectOptJSONObject2);
        }
        return null;
    }
}
