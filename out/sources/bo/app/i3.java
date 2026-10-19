package bo.app;

import android.content.Context;
import com.braze.enums.inappmessage.MessageType;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class i3 extends a7 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f21305l = new c(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final IInAppMessage f21306i;
    private final JSONObject j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final c2 f21307k;

    public static final class a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f21308b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JSONObject jSONObject) {
            super(0);
            this.f21308b = jSONObject;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Attempting to parse in-app message triggered action with JSON: " + JsonUtils.getPrettyPrintedString(this.f21308b);
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f21309b = new b();

        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to parse in-app message triggered action.";
        }
    }

    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.e eVar) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21310a;

        static {
            int[] iArr = new int[MessageType.values().length];
            try {
                iArr[MessageType.HTML_FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageType.FULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageType.MODAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageType.SLIDEUP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MessageType.HTML.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f21310a = iArr;
        }
    }

    public static final class e extends Lambda implements Ia.a {
        public e() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Attempting to publish in-app message after delay of " + i3.this.n().o() + " seconds.";
        }
    }

    public static final class f extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x2 f21312b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(x2 x2Var) {
            super(0);
            this.f21312b = x2Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cannot perform triggered action for " + this.f21312b + " due to in-app message json being null";
        }
    }

    public static final class g extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x2 f21313b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(x2 x2Var) {
            super(0);
            this.f21313b = x2Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cannot perform triggered action for " + this.f21313b + " due to deserialized in-app message being null";
        }
    }

    public static final class h extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f21314b = new h();

        public h() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Caught exception while performing triggered action.";
        }
    }

    public static final class i extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final i f21315b = new i();

        public i() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "In-app message has no remote assets for prefetch. Returning empty list.";
        }
    }

    public static final class j extends Lambda implements Ia.a {
        public j() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Failed to return remote paths to assets for type: ");
            IInAppMessage iInAppMessage = i3.this.f21306i;
            sb2.append(iInAppMessage != null ? iInAppMessage.getMessageType() : null);
            return sb2.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(JSONObject json, c2 brazeManager) throws JSONException {
        super(json);
        kotlin.jvm.internal.i.e(json, "json");
        kotlin.jvm.internal.i.e(brazeManager, "brazeManager");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.V, (Throwable) null, new a(json), 2, (Object) null);
        JSONObject inAppMessageObject = json.getJSONObject("data");
        this.f21307k = brazeManager;
        this.j = inAppMessageObject;
        kotlin.jvm.internal.i.d(inAppMessageObject, "inAppMessageObject");
        IInAppMessage iInAppMessageA = com.braze.support.h.a(inAppMessageObject, brazeManager);
        this.f21306i = iInAppMessageA;
        if (iInAppMessageA != null) {
            return;
        }
        BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, b.f21309b, 2, (Object) null);
        throw new IllegalArgumentException("Failed to parse in-app message triggered action with JSON: " + JsonUtils.getPrettyPrintedString(json));
    }

    @Override // bo.app.c3
    public List l() {
        ArrayList arrayList = new ArrayList();
        IInAppMessage iInAppMessage = this.f21306i;
        List<String> remoteAssetPathsForPrefetch = iInAppMessage != null ? iInAppMessage.getRemoteAssetPathsForPrefetch() : null;
        if (remoteAssetPathsForPrefetch == null || remoteAssetPathsForPrefetch.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, i.f21315b, 3, (Object) null);
            return arrayList;
        }
        IInAppMessage iInAppMessage2 = this.f21306i;
        MessageType messageType = iInAppMessage2 != null ? iInAppMessage2.getMessageType() : null;
        int i10 = messageType == null ? -1 : d.f21310a[messageType.ordinal()];
        if (i10 == 1) {
            arrayList.add(new w4(x4.ZIP, remoteAssetPathsForPrefetch.get(0)));
        } else if (i10 == 2 || i10 == 3 || i10 == 4) {
            arrayList.add(new w4(x4.IMAGE, remoteAssetPathsForPrefetch.get(0)));
        } else if (i10 != 5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new j(), 2, (Object) null);
        } else {
            Iterator<String> it = remoteAssetPathsForPrefetch.iterator();
            while (it.hasNext()) {
                arrayList.add(new w4(x4.FILE, it.next()));
            }
        }
        return arrayList;
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: u */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObjectForJsonPut = super.forJsonPut();
            if (jSONObjectForJsonPut == null) {
                return null;
            }
            IInAppMessage iInAppMessage = this.f21306i;
            jSONObjectForJsonPut.put("data", iInAppMessage != null ? iInAppMessage.forJsonPut() : null);
            jSONObjectForJsonPut.put("type", "inapp");
            return jSONObjectForJsonPut;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // bo.app.c3
    public void a(Context context, k2 internalEventPublisher, x2 triggerEvent, long j10) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(internalEventPublisher, "internalEventPublisher");
        kotlin.jvm.internal.i.e(triggerEvent, "triggerEvent");
        try {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new e(), 3, (Object) null);
            JSONObject jSONObject = this.j;
            if (jSONObject == null) {
                BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, new f(triggerEvent), 2, (Object) null);
                return;
            }
            IInAppMessage iInAppMessageA = com.braze.support.h.a(jSONObject, this.f21307k);
            if (kotlin.jvm.internal.i.a(triggerEvent.d(), k6.f21426e) && iInAppMessageA != null) {
                iInAppMessageA.setTestSend(true);
            }
            if (iInAppMessageA == null) {
                BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, new g(triggerEvent), 2, (Object) null);
                return;
            }
            iInAppMessageA.setLocalPrefetchedAssetPaths(y());
            iInAppMessageA.setExpirationTimestamp(j10);
            internalEventPublisher.a(new g3(triggerEvent, this, iInAppMessageA, this.f21307k.a()), g3.class);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, h.f21314b);
        }
    }
}
