package p005a4;

import D2.V;
import Ia.p;
import U5.d;
import Z3.q;
import Z3.r;
import Z3.x;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.NotificationManagerCompat;
import androidx.media3.exoplayer.O;
import com.facebook.FacebookRequestError;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.FlushReason;
import com.facebook.appevents.FlushResult;
import com.facebook.appevents.PersistedEvents;
import com.facebook.appevents.cloudbridge.b;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import com.facebook.internal.FetchedAppSettingsManager;
import com.google.android.gms.internal.measurement.M1;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import kotlin.Pair;
import kotlin.UninitializedPropertyAccessException;
import kotlin.collections.EmptyList;
import kotlin.collections.y;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlin.text.n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p065f1.a;
import p165n4.l;
import p165n4.s;

/* JADX INFO: compiled from: AppEventQueue.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f8027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f8028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile c f8029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ScheduledExecutorService f8030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static ScheduledFuture<?> f8031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f8032f;

    static {
        new j();
        f8027a = j.class.getName();
        f8028b = 100;
        f8029c = new c();
        f8030d = Executors.newSingleThreadScheduledExecutor();
        f8032f = new e();
    }

    public static final void a(FlushReason flushReason) {
        PersistedEvents persistedEventsA = d.a();
        c cVar = f8029c;
        synchronized (cVar) {
            for (Map.Entry<AccessTokenAppIdPair, List<AppEvent>> entry : persistedEventsA.b()) {
                u uVarB = cVar.b(entry.getKey());
                if (uVarB != null) {
                    Iterator<AppEvent> it = entry.getValue().iterator();
                    while (it.hasNext()) {
                        uVarB.a(it.next());
                    }
                }
            }
        }
        try {
            s sVarB = b(flushReason, f8029c);
            if (sVarB != null) {
                Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", sVarB.f8041a);
                intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", sVarB.f8042b);
                a.a(q.a()).c(intent);
            }
        } catch (Exception unused) {
        }
    }

    public static final s b(FlushReason flushReason, c appEventCollection) {
        JSONObject jSONObject;
        int length;
        i.e(appEventCollection, "appEventCollection");
        final s sVar = new s();
        sVar.f8042b = FlushResult.f24785b;
        boolean zF = q.f(q.a());
        ArrayList arrayList = new ArrayList();
        Iterator it = appEventCollection.d().iterator();
        while (true) {
            final r rVar = null;
            if (!it.hasNext()) {
                if (arrayList.isEmpty()) {
                    return null;
                }
                l.a aVar = l.f44910c;
                LoggingBehavior loggingBehavior = LoggingBehavior.f24776d;
                String TAG = f8027a;
                i.d(TAG, "TAG");
                l.a.b(loggingBehavior, TAG, "Flushing %d events due to %s.", Integer.valueOf(sVar.f8041a), flushReason.toString());
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((r) it2.next()).c();
                }
                return sVar;
            }
            final AccessTokenAppIdPair accessTokenAppIdPair = (AccessTokenAppIdPair) it.next();
            final u uVarA = appEventCollection.a(accessTokenAppIdPair);
            if (uVarA == null) {
                throw new IllegalStateException("Required value was null.");
            }
            String strB = accessTokenAppIdPair.b();
            p165n4.j jVarF = FetchedAppSettingsManager.f(strB, false);
            String str = r.j;
            final r rVarI = r.c.i(null, String.format("%s/activities", Arrays.copyOf(new Object[]{strB}, 1)), null, null);
            rVarI.f7881i = true;
            Bundle bundle = rVarI.f7876d;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("access_token", accessTokenAppIdPair.a());
            synchronized (n.f8035d) {
            }
            m mVar = new m();
            if (!q.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false)) {
                p249u3.a aVar2 = new p249u3.a(q.a());
                try {
                    aVar2.b(new d(aVar2, mVar));
                } catch (Exception unused) {
                }
            }
            String string = q.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
            if (string != null) {
                bundle.putString("install_referrer", string);
            }
            rVarI.f7876d = bundle;
            boolean z10 = jVarF != null ? jVarF.f44895a : false;
            Context contextA = q.a();
            synchronized (uVarA) {
                try {
                    int i10 = uVarA.f8048e;
                    p056e4.a aVar3 = p056e4.a.f34730a;
                    p056e4.a.a(uVarA.f8046c);
                    uVarA.f8047d.addAll(uVarA.f8046c);
                    uVarA.f8046c.clear();
                    JSONArray jSONArray = new JSONArray();
                    for (AppEvent appEvent : uVarA.f8047d) {
                        if (!appEvent.d()) {
                            i.k(appEvent, "Event with invalid checksum: ");
                            q qVar = q.f7852a;
                        } else if (z10 || !appEvent.e()) {
                            jSONArray.put(appEvent.b());
                        }
                    }
                    if (jSONArray.length() == 0) {
                        length = 0;
                    } else {
                        p293xa.r rVar2 = p293xa.r.f47939a;
                        try {
                            HashMap map = AppEventsLoggerUtility.f24941a;
                            jSONObject = AppEventsLoggerUtility.a(AppEventsLoggerUtility.GraphAPIActivityType.f24943c, uVarA.f8044a, uVarA.f8045b, zF, contextA);
                            if (uVarA.f8048e > 0) {
                                jSONObject.put("num_skipped_events", i10);
                            }
                        } catch (JSONException unused2) {
                            jSONObject = new JSONObject();
                        }
                        rVarI.f7875c = jSONObject;
                        Bundle bundle2 = rVarI.f7876d;
                        String string2 = jSONArray.toString();
                        i.d(string2, "events.toString()");
                        bundle2.putString("custom_events", string2);
                        rVarI.f7877e = string2;
                        rVarI.f7876d = bundle2;
                        length = jSONArray.length();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (length != 0) {
                sVar.f8041a += length;
                rVarI.j(new r.b(rVarI, uVarA, sVar) { // from class: a4.g

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ u f8022b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ s f8023c;

                    {
                        this.f8022b = uVarA;
                        this.f8023c = sVar;
                    }

                    @Override // Z3.r.b
                    public final void b(x xVar) {
                        FlushResult flushResult;
                        AccessTokenAppIdPair accessTokenAppIdPair2 = this.f8021a;
                        u uVar = this.f8022b;
                        s sVar2 = this.f8023c;
                        FacebookRequestError facebookRequestError = xVar.f7905c;
                        FlushResult flushResult2 = FlushResult.f24785b;
                        if (facebookRequestError == null) {
                            flushResult = flushResult2;
                        } else if (facebookRequestError.f24760c == -1) {
                            flushResult = FlushResult.f24787d;
                        } else {
                            String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{xVar.toString(), facebookRequestError.toString()}, 2));
                            flushResult = FlushResult.f24786c;
                        }
                        q qVar2 = q.f7852a;
                        synchronized (q.f7853b) {
                        }
                        boolean z11 = facebookRequestError != null;
                        synchronized (uVar) {
                            if (z11) {
                                try {
                                    uVar.f8046c.addAll(uVar.f8047d);
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            uVar.f8047d.clear();
                            uVar.f8048e = 0;
                        }
                        FlushResult flushResult3 = FlushResult.f24787d;
                        if (flushResult == flushResult3) {
                            q.c().execute(new i(accessTokenAppIdPair2, 0, uVar));
                        }
                        if (flushResult == flushResult2 || sVar2.f8042b == flushResult3) {
                            return;
                        }
                        sVar2.f8042b = flushResult;
                    }
                });
                rVar = rVarI;
            }
            if (rVar != null) {
                arrayList.add(rVar);
                b.f24905a.getClass();
                if (b.f24907c) {
                    HashSet<Integer> hashSet = com.facebook.appevents.cloudbridge.d.f24909a;
                    s.F(new Runnable() { // from class: com.facebook.appevents.cloudbridge.c
                        /* JADX WARN: Code duplicated, block: B:200:0x0467  */
                        /* JADX WARN: Code duplicated, block: B:202:0x0483  */
                        /* JADX WARN: Code duplicated, block: B:205:0x04bd  */
                        /* JADX WARN: Code duplicated, block: B:206:0x04c0  */
                        /* JADX WARN: Code duplicated, block: B:209:0x04ee  */
                        /* JADX WARN: Code duplicated, block: B:212:0x0543 A[Catch: IOException -> 0x056d, UnknownHostException -> 0x0570, TryCatch #9 {UnknownHostException -> 0x0570, IOException -> 0x056d, blocks: (B:210:0x0532, B:212:0x0543, B:223:0x0573, B:225:0x057d, B:229:0x058b, B:231:0x05c8, B:239:0x05e6, B:244:0x05ed, B:245:0x05f0, B:246:0x05f1, B:215:0x0551, B:216:0x0557, B:218:0x055d, B:247:0x061a, B:248:0x0621), top: B:277:0x0532 }] */
                        /* JADX WARN: Code duplicated, block: B:214:0x0550  */
                        /* JADX WARN: Code duplicated, block: B:215:0x0551 A[Catch: IOException -> 0x056d, UnknownHostException -> 0x0570, TryCatch #9 {UnknownHostException -> 0x0570, IOException -> 0x056d, blocks: (B:210:0x0532, B:212:0x0543, B:223:0x0573, B:225:0x057d, B:229:0x058b, B:231:0x05c8, B:239:0x05e6, B:244:0x05ed, B:245:0x05f0, B:246:0x05f1, B:215:0x0551, B:216:0x0557, B:218:0x055d, B:247:0x061a, B:248:0x0621), top: B:277:0x0532 }] */
                        /* JADX WARN: Code duplicated, block: B:218:0x055d A[Catch: IOException -> 0x056d, UnknownHostException -> 0x0570, LOOP:3: B:216:0x0557->B:218:0x055d, LOOP_END, TryCatch #9 {UnknownHostException -> 0x0570, IOException -> 0x056d, blocks: (B:210:0x0532, B:212:0x0543, B:223:0x0573, B:225:0x057d, B:229:0x058b, B:231:0x05c8, B:239:0x05e6, B:244:0x05ed, B:245:0x05f0, B:246:0x05f1, B:215:0x0551, B:216:0x0557, B:218:0x055d, B:247:0x061a, B:248:0x0621), top: B:277:0x0532 }] */
                        /* JADX WARN: Code duplicated, block: B:231:0x05c8 A[Catch: IOException -> 0x056d, UnknownHostException -> 0x0570, TRY_LEAVE, TryCatch #9 {UnknownHostException -> 0x0570, IOException -> 0x056d, blocks: (B:210:0x0532, B:212:0x0543, B:223:0x0573, B:225:0x057d, B:229:0x058b, B:231:0x05c8, B:239:0x05e6, B:244:0x05ed, B:245:0x05f0, B:246:0x05f1, B:215:0x0551, B:216:0x0557, B:218:0x055d, B:247:0x061a, B:248:0x0621), top: B:277:0x0532 }] */
                        /* JADX WARN: Code duplicated, block: B:234:0x05dc A[Catch: all -> 0x05e0, LOOP:2: B:265:0x05d6->B:234:0x05dc, LOOP_END, TryCatch #0 {all -> 0x05e0, blocks: (B:232:0x05d6, B:234:0x05dc, B:237:0x05e3), top: B:265:0x05d6 }] */
                        /* JADX WARN: Code duplicated, block: B:247:0x061a A[Catch: IOException -> 0x056d, UnknownHostException -> 0x0570, TryCatch #9 {UnknownHostException -> 0x0570, IOException -> 0x056d, blocks: (B:210:0x0532, B:212:0x0543, B:223:0x0573, B:225:0x057d, B:229:0x058b, B:231:0x05c8, B:239:0x05e6, B:244:0x05ed, B:245:0x05f0, B:246:0x05f1, B:215:0x0551, B:216:0x0557, B:218:0x055d, B:247:0x061a, B:248:0x0621), top: B:277:0x0532 }] */
                        /* JADX WARN: Code duplicated, block: B:251:0x064e  */
                        /* JADX WARN: Code duplicated, block: B:280:0x05e3 A[EDGE_INSN: B:280:0x05e3->B:237:0x05e3 BREAK  A[LOOP:2: B:265:0x05d6->B:234:0x05dc], SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:318:? A[RETURN, SYNTHETIC] */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r0v130, types: [java.util.List] */
                        /* JADX WARN: Type inference failed for: r0v132, types: [java.util.ArrayList] */
                        /* JADX WARN: Type inference failed for: r0v14 */
                        /* JADX WARN: Type inference failed for: r0v15 */
                        /* JADX WARN: Type inference failed for: r2v2 */
                        /* JADX WARN: Type inference failed for: r2v3, types: [com.facebook.LoggingBehavior] */
                        /* JADX WARN: Type inference failed for: r2v49, types: [java.lang.Object, java.util.Map] */
                        /* JADX WARN: Type inference failed for: r2v58, types: [java.lang.Object, java.util.Map] */
                        /* JADX WARN: Type inference failed for: r2v73 */
                        /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object, java.util.Map] */
                        /* JADX WARN: Type inference failed for: r7v26 */
                        /* JADX WARN: Type inference failed for: r7v4 */
                        /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.String] */
                        @Override // java.lang.Runnable
                        public final void run() throws JSONException {
                            ?? r10;
                            ?? r11;
                            String str2;
                            r rVar3;
                            LoggingBehavior loggingBehavior2;
                            String str3;
                            String str4;
                            String str5;
                            ?? K10;
                            int iMax;
                            List listB;
                            Na.i iVar;
                            boolean z11;
                            final List listO0;
                            LinkedHashMap linkedHashMap;
                            d.a aVar4;
                            String str6;
                            String string3;
                            Map mapO;
                            p<String, Integer, p293xa.r> pVar;
                            URLConnection uRLConnection;
                            HttpURLConnection httpURLConnection;
                            String str7;
                            Set<String> setKeySet;
                            StringBuilder sb2;
                            BufferedReader bufferedReader;
                            String line;
                            AppEventUserAndAppDataField appEventUserAndAppDataField;
                            String str8;
                            LinkedHashMap linkedHashMap2;
                            AppEventsConversionsAPITransformer.DataProcessingParameterName dataProcessingParameterName;
                            ArrayList arrayList2;
                            Iterator it3;
                            ConversionsAPISection conversionsAPISection;
                            CustomEventField customEventField;
                            String str9 = "POST";
                            r rVar4 = rVar;
                            String str10 = rVar4.f7874b;
                            List listE0 = str10 == null ? null : n.e0(str10, new String[]{"/"}, 0, 6);
                            LoggingBehavior loggingBehavior3 = LoggingBehavior.f24777e;
                            String str11 = "CAPITransformerWebRequests";
                            if (listE0 == null || listE0.size() != 2) {
                                l.a aVar5 = l.f44910c;
                                l.a.b(loggingBehavior3, "CAPITransformerWebRequests", "\n GraphPathComponents Error when logging: \n%s", rVar4);
                                return;
                            }
                            try {
                                d.a aVar6 = d.f24911c;
                                String str12 = "credentials";
                                try {
                                    if (aVar6 == null) {
                                        i.m("credentials");
                                        throw null;
                                    }
                                    String str13 = aVar6.f24915b;
                                    if (aVar6 == null) {
                                        i.m("credentials");
                                        throw null;
                                    }
                                    String str14 = str13 + "/capi/" + aVar6.f24914a + "/events";
                                    JSONObject jSONObject2 = rVar4.f7875c;
                                    LoggingBehavior loggingBehavior4 = LoggingBehavior.f24776d;
                                    if (jSONObject2 != null) {
                                        LinkedHashMap linkedHashMapY = y.y(s.h(jSONObject2));
                                        String str15 = rVar4.f7877e;
                                        if (str15 == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                        }
                                        linkedHashMapY.put("custom_events", str15);
                                        StringBuilder sb3 = new StringBuilder();
                                        for (String str16 : linkedHashMapY.keySet()) {
                                            sb3.append(str16);
                                            sb3.append(" : ");
                                            sb3.append(linkedHashMapY.get(str16));
                                            sb3.append(System.getProperty("line.separator"));
                                        }
                                        l.a aVar7 = l.f44910c;
                                        l.a.b(loggingBehavior4, "CAPITransformerWebRequests", "\nGraph Request data: \n\n%s \n\n", sb3);
                                        Object obj = AppEventsConversionsAPITransformer.f24811a;
                                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                        ArrayList<Map> arrayList3 = new ArrayList();
                                        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                                        Object obj2 = linkedHashMapY.get(OtherEventConstants.EVENT.a());
                                        AppEventType.a aVar8 = AppEventType.f24789b;
                                        if (obj2 == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                        }
                                        String str17 = (String) obj2;
                                        aVar8.getClass();
                                        AppEventType appEventType = str17.equals("MOBILE_APP_INSTALL") ? AppEventType.f24790c : str17.equals("CUSTOM_APP_EVENTS") ? AppEventType.f24791d : AppEventType.f24792e;
                                        if (appEventType != AppEventType.f24792e) {
                                            str9 = "POST";
                                            loggingBehavior3 = loggingBehavior3;
                                            for (Map.Entry entry : linkedHashMapY.entrySet()) {
                                                String str18 = str12;
                                                String rawValue = (String) entry.getKey();
                                                LoggingBehavior loggingBehavior5 = loggingBehavior3;
                                                Object value = entry.getValue();
                                                String str19 = str9;
                                                String str20 = "rawValue";
                                                i.e(rawValue, "rawValue");
                                                AppEventUserAndAppDataField[] appEventUserAndAppDataFieldArrValuesCustom = AppEventUserAndAppDataField.valuesCustom();
                                                String str21 = str11;
                                                int length2 = appEventUserAndAppDataFieldArrValuesCustom.length;
                                                r rVar5 = rVar4;
                                                int i11 = 0;
                                                while (true) {
                                                    if (i11 >= length2) {
                                                        appEventUserAndAppDataField = null;
                                                        break;
                                                    }
                                                    AppEventUserAndAppDataField appEventUserAndAppDataField2 = appEventUserAndAppDataFieldArrValuesCustom[i11];
                                                    AppEventUserAndAppDataField[] appEventUserAndAppDataFieldArr = appEventUserAndAppDataFieldArrValuesCustom;
                                                    if (i.a(appEventUserAndAppDataField2.a(), rawValue)) {
                                                        appEventUserAndAppDataField = appEventUserAndAppDataField2;
                                                        break;
                                                    } else {
                                                        i11++;
                                                        appEventUserAndAppDataFieldArrValuesCustom = appEventUserAndAppDataFieldArr;
                                                    }
                                                }
                                                if (appEventUserAndAppDataField != null) {
                                                    i.e(value, "value");
                                                    ?? r12 = AppEventsConversionsAPITransformer.f24811a;
                                                    AppEventsConversionsAPITransformer.b bVar = (AppEventsConversionsAPITransformer.b) r12.get(appEventUserAndAppDataField);
                                                    if (bVar == null) {
                                                        str8 = str14;
                                                    } else {
                                                        int iOrdinal = bVar.f24823a.ordinal();
                                                        if (iOrdinal != 0) {
                                                            str8 = str14;
                                                            if (iOrdinal == 1) {
                                                                AppEventsConversionsAPITransformer.b bVar2 = (AppEventsConversionsAPITransformer.b) r12.get(appEventUserAndAppDataField);
                                                                ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField = bVar2 == null ? null : bVar2.f24824b;
                                                                if (conversionsAPIUserAndAppDataField != null) {
                                                                    linkedHashMap4.put(conversionsAPIUserAndAppDataField.a(), value);
                                                                }
                                                            }
                                                        } else {
                                                            str8 = str14;
                                                            if (appEventUserAndAppDataField == AppEventUserAndAppDataField.USER_DATA) {
                                                                try {
                                                                    linkedHashMap3.putAll(s.h(new JSONObject((String) value)));
                                                                } catch (JSONException e10) {
                                                                    l.a aVar9 = l.f44910c;
                                                                    l.a.b(loggingBehavior4, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", value, e10);
                                                                }
                                                            } else {
                                                                AppEventsConversionsAPITransformer.b bVar3 = (AppEventsConversionsAPITransformer.b) r12.get(appEventUserAndAppDataField);
                                                                ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField2 = bVar3 == null ? null : bVar3.f24824b;
                                                                if (conversionsAPIUserAndAppDataField2 != null) {
                                                                    linkedHashMap3.put(conversionsAPIUserAndAppDataField2.a(), value);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    linkedHashMap3 = linkedHashMap3;
                                                    linkedHashMap2 = linkedHashMap4;
                                                    linkedHashMapY = linkedHashMapY;
                                                } else {
                                                    str8 = str14;
                                                    boolean zEquals = rawValue.equals(ConversionsAPISection.CUSTOM_EVENTS.a());
                                                    boolean z12 = value instanceof String;
                                                    linkedHashMap2 = linkedHashMap4;
                                                    if (appEventType == AppEventType.f24791d && zEquals && z12) {
                                                        String appEvents = (String) value;
                                                        i.e(appEvents, "appEvents");
                                                        ArrayList arrayList4 = new ArrayList();
                                                        try {
                                                            Iterator it4 = s.g(new JSONArray(appEvents)).iterator();
                                                            while (it4.hasNext()) {
                                                                arrayList4.add(s.h(new JSONObject((String) it4.next())));
                                                            }
                                                            if (arrayList4.isEmpty()) {
                                                                arrayList2 = null;
                                                            } else {
                                                                arrayList2 = new ArrayList();
                                                                Iterator it5 = arrayList4.iterator();
                                                                while (it5.hasNext()) {
                                                                    Map map2 = (Map) it5.next();
                                                                    LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                                                                    LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                                                                    Iterator it6 = map2.keySet().iterator();
                                                                    while (true) {
                                                                        boolean zHasNext = it6.hasNext();
                                                                        it3 = it5;
                                                                        conversionsAPISection = ConversionsAPISection.CUSTOM_DATA;
                                                                        if (zHasNext) {
                                                                            String str22 = (String) it6.next();
                                                                            i.e(str22, str20);
                                                                            String str23 = str20;
                                                                            CustomEventField[] customEventFieldArrValuesCustom = CustomEventField.valuesCustom();
                                                                            LinkedHashMap linkedHashMap8 = linkedHashMap3;
                                                                            int length3 = customEventFieldArrValuesCustom.length;
                                                                            LinkedHashMap linkedHashMap9 = linkedHashMapY;
                                                                            int i12 = 0;
                                                                            while (true) {
                                                                                if (i12 >= length3) {
                                                                                    customEventField = null;
                                                                                    break;
                                                                                }
                                                                                CustomEventField customEventField2 = customEventFieldArrValuesCustom[i12];
                                                                                CustomEventField[] customEventFieldArr = customEventFieldArrValuesCustom;
                                                                                if (i.a(customEventField2.a(), str22)) {
                                                                                    customEventField = customEventField2;
                                                                                    break;
                                                                                } else {
                                                                                    i12++;
                                                                                    customEventFieldArrValuesCustom = customEventFieldArr;
                                                                                }
                                                                            }
                                                                            AppEventsConversionsAPITransformer.a aVar10 = (AppEventsConversionsAPITransformer.a) AppEventsConversionsAPITransformer.f24812b.get(customEventField);
                                                                            if (customEventField != null && aVar10 != null) {
                                                                                ConversionsAPICustomEventField conversionsAPICustomEventField = aVar10.f24822b;
                                                                                ConversionsAPISection conversionsAPISection2 = aVar10.f24821a;
                                                                                if (conversionsAPISection2 == null) {
                                                                                    try {
                                                                                        String strA = conversionsAPICustomEventField.a();
                                                                                        if (customEventField == CustomEventField.EVENT_NAME && ((String) map2.get(str22)) != null) {
                                                                                            Object obj3 = map2.get(str22);
                                                                                            if (obj3 == null) {
                                                                                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                                                                            }
                                                                                            String strA2 = (String) obj3;
                                                                                            ?? r13 = AppEventsConversionsAPITransformer.f24813c;
                                                                                            if (r13.containsKey(strA2)) {
                                                                                                ConversionsAPIEventName conversionsAPIEventName = (ConversionsAPIEventName) r13.get(strA2);
                                                                                                strA2 = conversionsAPIEventName == null ? "" : conversionsAPIEventName.a();
                                                                                            }
                                                                                            linkedHashMap7.put(strA, strA2);
                                                                                        } else if (customEventField == CustomEventField.EVENT_TIME && ((Integer) map2.get(str22)) != null) {
                                                                                            Object obj4 = map2.get(str22);
                                                                                            if (obj4 == null) {
                                                                                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                                                                            }
                                                                                            Object objA = AppEventsConversionsAPITransformer.a(obj4, str22);
                                                                                            if (objA == null) {
                                                                                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                                                                            }
                                                                                            linkedHashMap7.put(strA, objA);
                                                                                        }
                                                                                    } catch (ClassCastException e11) {
                                                                                        l.a aVar11 = l.f44910c;
                                                                                        l.a.b(loggingBehavior4, "AppEventsConversionsAPITransformer", "\n transformEvents ClassCastException: \n %s ", V.t(e11));
                                                                                    }
                                                                                } else if (conversionsAPISection2 == conversionsAPISection) {
                                                                                    String strA3 = conversionsAPICustomEventField.a();
                                                                                    Object obj5 = map2.get(str22);
                                                                                    if (obj5 == null) {
                                                                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                                                                    }
                                                                                    Object objA2 = AppEventsConversionsAPITransformer.a(obj5, str22);
                                                                                    if (objA2 == null) {
                                                                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                                                                    }
                                                                                    linkedHashMap6.put(strA3, objA2);
                                                                                } else {
                                                                                    continue;
                                                                                }
                                                                            }
                                                                            it5 = it3;
                                                                            str20 = str23;
                                                                            linkedHashMap3 = linkedHashMap8;
                                                                            linkedHashMapY = linkedHashMap9;
                                                                        }
                                                                    }
                                                                    String str24 = str20;
                                                                    LinkedHashMap linkedHashMap10 = linkedHashMap3;
                                                                    LinkedHashMap linkedHashMap11 = linkedHashMapY;
                                                                    if (!linkedHashMap6.isEmpty()) {
                                                                        linkedHashMap7.put(conversionsAPISection.a(), linkedHashMap6);
                                                                    }
                                                                    arrayList2.add(linkedHashMap7);
                                                                    it5 = it3;
                                                                    str20 = str24;
                                                                    linkedHashMap3 = linkedHashMap10;
                                                                    linkedHashMapY = linkedHashMap11;
                                                                }
                                                                linkedHashMap3 = linkedHashMap3;
                                                                linkedHashMapY = linkedHashMapY;
                                                            }
                                                        } catch (JSONException e12) {
                                                            l.a aVar12 = l.f44910c;
                                                            l.a.b(loggingBehavior4, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", appEvents, e12);
                                                        }
                                                        if (arrayList2 != null) {
                                                            arrayList3.addAll(arrayList2);
                                                        }
                                                    } else {
                                                        linkedHashMap3 = linkedHashMap3;
                                                        linkedHashMapY = linkedHashMapY;
                                                        AppEventsConversionsAPITransformer.DataProcessingParameterName[] dataProcessingParameterNameArrValuesCustom = AppEventsConversionsAPITransformer.DataProcessingParameterName.valuesCustom();
                                                        int length4 = dataProcessingParameterNameArrValuesCustom.length;
                                                        int i13 = 0;
                                                        while (true) {
                                                            if (i13 >= length4) {
                                                                dataProcessingParameterName = null;
                                                                break;
                                                            }
                                                            dataProcessingParameterName = dataProcessingParameterNameArrValuesCustom[i13];
                                                            if (i.a(dataProcessingParameterName.a(), rawValue)) {
                                                                break;
                                                            } else {
                                                                i13++;
                                                            }
                                                        }
                                                        if (dataProcessingParameterName != null) {
                                                            linkedHashMap5.put(rawValue, value);
                                                        }
                                                    }
                                                }
                                                loggingBehavior3 = loggingBehavior5;
                                                str12 = str18;
                                                str9 = str19;
                                                str11 = str21;
                                                rVar4 = rVar5;
                                                str14 = str8;
                                                linkedHashMap4 = linkedHashMap2;
                                                linkedHashMap3 = linkedHashMap3;
                                                linkedHashMapY = linkedHashMapY;
                                            }
                                        }
                                        str2 = str9;
                                        rVar3 = rVar4;
                                        LinkedHashMap linkedHashMap12 = linkedHashMap3;
                                        loggingBehavior2 = loggingBehavior3;
                                        str3 = str11;
                                        LinkedHashMap linkedHashMap13 = linkedHashMap4;
                                        str4 = str12;
                                        str5 = str14;
                                        LinkedHashMap linkedHashMap14 = linkedHashMapY;
                                        loggingBehavior2 = loggingBehavior2;
                                        str2 = str2;
                                        if (appEventType != AppEventType.f24792e) {
                                            Object obj6 = linkedHashMap14.get(OtherEventConstants.INSTALL_EVENT_TIME.a());
                                            LinkedHashMap linkedHashMap15 = new LinkedHashMap();
                                            linkedHashMap15.put(OtherEventConstants.ACTION_SOURCE.a(), OtherEventConstants.APP.a());
                                            linkedHashMap15.put(ConversionsAPISection.USER_DATA.a(), linkedHashMap12);
                                            linkedHashMap15.put(ConversionsAPISection.APP_DATA.a(), linkedHashMap13);
                                            linkedHashMap15.putAll(linkedHashMap5);
                                            int iOrdinal2 = appEventType.ordinal();
                                            if (iOrdinal2 != 0) {
                                                if (iOrdinal2 == 1 && !arrayList3.isEmpty()) {
                                                    loggingBehavior2 = loggingBehavior2;
                                                    str2 = str2;
                                                    loggingBehavior2 = loggingBehavior2;
                                                    str2 = str2;
                                                    loggingBehavior2 = loggingBehavior2;
                                                    str2 = str2;
                                                    K10 = new ArrayList();
                                                    for (Map map3 : arrayList3) {
                                                        LinkedHashMap linkedHashMap16 = new LinkedHashMap();
                                                        linkedHashMap16.putAll(linkedHashMap15);
                                                        linkedHashMap16.putAll(map3);
                                                        K10.add(linkedHashMap16);
                                                    }
                                                }
                                            } else if (obj6 != null) {
                                                LinkedHashMap linkedHashMap17 = new LinkedHashMap();
                                                linkedHashMap17.putAll(linkedHashMap15);
                                                linkedHashMap17.put(ConversionsAPICustomEventField.EVENT_NAME.a(), OtherEventConstants.MOBILE_APP_INSTALL.a());
                                                linkedHashMap17.put(ConversionsAPICustomEventField.EVENT_TIME.a(), obj6);
                                                K10 = M1.k(linkedHashMap17);
                                            }
                                        }
                                        if (K10 == 0) {
                                            return;
                                        }
                                        d.b().addAll((Collection) K10);
                                        iMax = Math.max(0, d.b().size() + NotificationManagerCompat.IMPORTANCE_UNSPECIFIED);
                                        if (iMax > 0) {
                                            List<Map<String, Object>> listB2 = o.b(kotlin.collections.q.K(d.b(), iMax));
                                            i.e(listB2, "<set-?>");
                                            d.f24912d = listB2;
                                        }
                                        int iMin = Math.min(d.b().size(), 10);
                                        listB = d.b();
                                        z11 = true;
                                        iVar = new Na.i(0, iMin - 1, 1);
                                        if (iVar.isEmpty()) {
                                            listO0 = EmptyList.f42983b;
                                        } else {
                                            listO0 = kotlin.collections.q.o0(listB.subList(0, iVar.f4688c + 1));
                                        }
                                        d.b().subList(0, iMin).clear();
                                        JSONArray jSONArray2 = new JSONArray((Collection) listO0);
                                        linkedHashMap = new LinkedHashMap();
                                        linkedHashMap.put("data", jSONArray2);
                                        aVar4 = d.f24911c;
                                        if (aVar4 != null) {
                                            i.m(str4);
                                            throw null;
                                        }
                                        linkedHashMap.put("accessKey", aVar4.f24916c);
                                        JSONObject jSONObject3 = new JSONObject(linkedHashMap);
                                        l.a aVar13 = l.f44910c;
                                        String string4 = jSONObject3.toString(2);
                                        i.d(string4, "jsonBodyStr.toString(2)");
                                        String urlStr = str5;
                                        str6 = str3;
                                        l.a.b(loggingBehavior4, str6, "\nTransformed_CAPI_JSON:\nURL: %s\nFROM=========\n%s\n>>>>>>TO>>>>>>\n%s\n=============\n", urlStr, rVar3, string4);
                                        string3 = jSONObject3.toString();
                                        mapO = kotlin.collections.x.o(new Pair("Content-Type", "application/json"));
                                        pVar = new p<String, Integer, p293xa.r>() { // from class: com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // Ia.p
                                            public final p293xa.r invoke(String str25, Integer num) {
                                                s.F(new O(num, 1, listO0));
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        i.e(urlStr, "urlStr");
                                        try {
                                            uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(urlStr).openConnection());
                                            if (uRLConnection != null) {
                                                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
                                            }
                                            httpURLConnection = (HttpURLConnection) uRLConnection;
                                            str7 = str2;
                                            httpURLConnection.setRequestMethod(str7);
                                            setKeySet = mapO.keySet();
                                            if (setKeySet == null) {
                                                for (String str25 : setKeySet) {
                                                    httpURLConnection.setRequestProperty(str25, (String) mapO.get(str25));
                                                }
                                            }
                                            if (!httpURLConnection.getRequestMethod().equals(str7) && !httpURLConnection.getRequestMethod().equals("PUT")) {
                                                z11 = false;
                                            }
                                            httpURLConnection.setDoOutput(z11);
                                            httpURLConnection.setConnectTimeout(60000);
                                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream, "UTF-8"));
                                            bufferedWriter.write(string3);
                                            bufferedWriter.flush();
                                            bufferedWriter.close();
                                            bufferedOutputStream.close();
                                            sb2 = new StringBuilder();
                                            if (d.f24909a.contains(Integer.valueOf(httpURLConnection.getResponseCode()))) {
                                                bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                                                while (true) {
                                                    try {
                                                        line = bufferedReader.readLine();
                                                        if (line != null) {
                                                            break;
                                                        } else {
                                                            sb2.append(line);
                                                        }
                                                    } catch (Throwable th2) {
                                                        try {
                                                            throw th2;
                                                        } catch (Throwable th3) {
                                                            p241t7.b.n(bufferedReader, th2);
                                                            throw th3;
                                                        }
                                                    }
                                                }
                                                p293xa.r rVar6 = p293xa.r.f47939a;
                                                p241t7.b.n(bufferedReader, null);
                                            }
                                            String string5 = sb2.toString();
                                            i.d(string5, "connResponseSB.toString()");
                                            l.a aVar14 = l.f44910c;
                                            l.a.b(loggingBehavior4, str6, "\nResponse Received: \n%s\n%s", string5, Integer.valueOf(httpURLConnection.getResponseCode()));
                                            pVar.invoke(string5, Integer.valueOf(httpURLConnection.getResponseCode()));
                                            return;
                                        } catch (UnknownHostException e13) {
                                            l.a aVar15 = l.f44910c;
                                            l.a.b(loggingBehavior4, str6, "Connection failed, retrying: \n%s", e13.toString());
                                            pVar.invoke(null, 503);
                                            return;
                                        } catch (IOException e14) {
                                            l.a aVar16 = l.f44910c;
                                            l.a.b(loggingBehavior2, str6, "Send to server failed: \n%s", e14.toString());
                                            return;
                                        }
                                    }
                                    str2 = "POST";
                                    rVar3 = rVar4;
                                    loggingBehavior2 = loggingBehavior3;
                                    str3 = "CAPITransformerWebRequests";
                                    str4 = "credentials";
                                    str5 = str14;
                                    loggingBehavior2 = loggingBehavior2;
                                    str2 = str2;
                                    loggingBehavior2 = loggingBehavior2;
                                    str2 = str2;
                                    loggingBehavior2 = loggingBehavior2;
                                    str2 = str2;
                                    loggingBehavior2 = loggingBehavior2;
                                    str2 = str2;
                                    loggingBehavior2 = loggingBehavior2;
                                    str2 = str2;
                                    K10 = 0;
                                    if (K10 == 0) {
                                        return;
                                    }
                                    d.b().addAll((Collection) K10);
                                    iMax = Math.max(0, d.b().size() + NotificationManagerCompat.IMPORTANCE_UNSPECIFIED);
                                    if (iMax > 0) {
                                        List<Map<String, Object>> listB3 = o.b(kotlin.collections.q.K(d.b(), iMax));
                                        i.e(listB3, "<set-?>");
                                        d.f24912d = listB3;
                                    }
                                    int iMin2 = Math.min(d.b().size(), 10);
                                    listB = d.b();
                                    z11 = true;
                                    iVar = new Na.i(0, iMin2 - 1, 1);
                                    if (iVar.isEmpty()) {
                                        listO0 = EmptyList.f42983b;
                                    } else {
                                        listO0 = kotlin.collections.q.o0(listB.subList(0, iVar.f4688c + 1));
                                    }
                                    d.b().subList(0, iMin2).clear();
                                    JSONArray jSONArray3 = new JSONArray((Collection) listO0);
                                    linkedHashMap = new LinkedHashMap();
                                    linkedHashMap.put("data", jSONArray3);
                                    aVar4 = d.f24911c;
                                    if (aVar4 != null) {
                                        i.m(str4);
                                        throw null;
                                    }
                                    linkedHashMap.put("accessKey", aVar4.f24916c);
                                    JSONObject jSONObject4 = new JSONObject(linkedHashMap);
                                    l.a aVar17 = l.f44910c;
                                    String string6 = jSONObject4.toString(2);
                                    i.d(string6, "jsonBodyStr.toString(2)");
                                    String urlStr2 = str5;
                                    str6 = str3;
                                    l.a.b(loggingBehavior4, str6, "\nTransformed_CAPI_JSON:\nURL: %s\nFROM=========\n%s\n>>>>>>TO>>>>>>\n%s\n=============\n", urlStr2, rVar3, string6);
                                    string3 = jSONObject4.toString();
                                    mapO = kotlin.collections.x.o(new Pair("Content-Type", "application/json"));
                                    pVar = new p<String, Integer, p293xa.r>() { // from class: com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // Ia.p
                                        public final p293xa.r invoke(String str26, Integer num) {
                                            s.F(new O(num, 1, listO0));
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    i.e(urlStr2, "urlStr");
                                    uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(urlStr2).openConnection());
                                    if (uRLConnection != null) {
                                        throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
                                    }
                                    httpURLConnection = (HttpURLConnection) uRLConnection;
                                    str7 = str2;
                                    httpURLConnection.setRequestMethod(str7);
                                    setKeySet = mapO.keySet();
                                    if (setKeySet == null) {
                                        while (r9.hasNext()) {
                                            httpURLConnection.setRequestProperty(str25, (String) mapO.get(str25));
                                        }
                                    }
                                    if (!httpURLConnection.getRequestMethod().equals(str7)) {
                                        z11 = false;
                                    }
                                    httpURLConnection.setDoOutput(z11);
                                    httpURLConnection.setConnectTimeout(60000);
                                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                    BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream2, "UTF-8"));
                                    bufferedWriter2.write(string3);
                                    bufferedWriter2.flush();
                                    bufferedWriter2.close();
                                    bufferedOutputStream2.close();
                                    sb2 = new StringBuilder();
                                    if (d.f24909a.contains(Integer.valueOf(httpURLConnection.getResponseCode()))) {
                                        bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                                        while (true) {
                                            line = bufferedReader.readLine();
                                            if (line != null) {
                                                break;
                                                break;
                                            }
                                            sb2.append(line);
                                        }
                                        p293xa.r rVar7 = p293xa.r.f47939a;
                                        p241t7.b.n(bufferedReader, null);
                                    }
                                    String string7 = sb2.toString();
                                    i.d(string7, "connResponseSB.toString()");
                                    l.a aVar18 = l.f44910c;
                                    l.a.b(loggingBehavior4, str6, "\nResponse Received: \n%s\n%s", string7, Integer.valueOf(httpURLConnection.getResponseCode()));
                                    pVar.invoke(string7, Integer.valueOf(httpURLConnection.getResponseCode()));
                                    return;
                                } catch (UninitializedPropertyAccessException e15) {
                                    e = e15;
                                    r10 = "POST";
                                    r11 = loggingBehavior3;
                                }
                            } catch (UninitializedPropertyAccessException e16) {
                                e = e16;
                                r10 = loggingBehavior3;
                                r11 = "CAPITransformerWebRequests";
                            }
                            l.a aVar19 = l.f44910c;
                            l.a.b(r10, r11, "\n Credentials not initialized Error when logging: \n%s", e);
                        }
                    });
                }
            }
        }
    }
}
