package com.facebook.internal;

import Z3.q;
import Z3.r;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.braze.Constants;
import com.google.firebase.messaging.U;
import com.voltasit.obdeleven.ui.activity.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.l;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import org.json.JSONArray;
import org.json.JSONObject;
import p043d4.b;
import p165n4.f;
import p165n4.j;
import p165n4.s;

/* JADX INFO: compiled from: FetchedAppSettingsManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FetchedAppSettingsManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FetchedAppSettingsManager f25006a = new FetchedAppSettingsManager();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f25007b = l.s("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting", "protected_mode_rules");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f25008c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReference<FetchAppSettingState> f25009d = new AtomicReference<>(FetchAppSettingState.f25012b);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ConcurrentLinkedQueue<a> f25010e = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f25011f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: FetchedAppSettingsManager.kt */
    public static final class FetchAppSettingState {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FetchAppSettingState f25012b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FetchAppSettingState f25013c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FetchAppSettingState f25014d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FetchAppSettingState f25015e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ FetchAppSettingState[] f25016f;

        static {
            FetchAppSettingState fetchAppSettingState = new FetchAppSettingState("NOT_LOADED", 0);
            f25012b = fetchAppSettingState;
            FetchAppSettingState fetchAppSettingState2 = new FetchAppSettingState("LOADING", 1);
            f25013c = fetchAppSettingState2;
            FetchAppSettingState fetchAppSettingState3 = new FetchAppSettingState("SUCCESS", 2);
            f25014d = fetchAppSettingState3;
            FetchAppSettingState fetchAppSettingState4 = new FetchAppSettingState("ERROR", 3);
            f25015e = fetchAppSettingState4;
            f25016f = new FetchAppSettingState[]{fetchAppSettingState, fetchAppSettingState2, fetchAppSettingState3, fetchAppSettingState4};
        }

        public FetchAppSettingState() {
            throw null;
        }

        public static FetchAppSettingState valueOf(String value) {
            i.e(value, "value");
            return (FetchAppSettingState) Enum.valueOf(FetchAppSettingState.class, value);
        }

        public static FetchAppSettingState[] values() {
            return (FetchAppSettingState[]) Arrays.copyOf(f25016f, 4);
        }
    }

    /* JADX INFO: compiled from: FetchedAppSettingsManager.kt */
    public interface a {
        void onSuccess();
    }

    public static JSONObject a() {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f25007b);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        String str = r.j;
        r rVarG = r.c.g(null, "app", null);
        rVarG.f7881i = true;
        rVarG.f7876d = bundle;
        JSONObject jSONObject = rVarG.c().f7906d;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public static final j b(String str) {
        return (j) f25008c.get(str);
    }

    public static final void c() {
        Context contextA = q.a();
        String strB = q.b();
        boolean zY = s.y(strB);
        FetchAppSettingState fetchAppSettingState = FetchAppSettingState.f25015e;
        AtomicReference<FetchAppSettingState> atomicReference = f25009d;
        FetchedAppSettingsManager fetchedAppSettingsManager = f25006a;
        if (zY) {
            atomicReference.set(fetchAppSettingState);
            fetchedAppSettingsManager.e();
            return;
        }
        if (f25008c.containsKey(strB)) {
            atomicReference.set(FetchAppSettingState.f25014d);
            fetchedAppSettingsManager.e();
            return;
        }
        FetchAppSettingState fetchAppSettingState2 = FetchAppSettingState.f25012b;
        FetchAppSettingState fetchAppSettingState3 = FetchAppSettingState.f25013c;
        while (!atomicReference.compareAndSet(fetchAppSettingState2, fetchAppSettingState3)) {
            if (atomicReference.get() != fetchAppSettingState2) {
                while (!atomicReference.compareAndSet(fetchAppSettingState, fetchAppSettingState3)) {
                    if (atomicReference.get() != fetchAppSettingState) {
                        fetchedAppSettingsManager.e();
                        return;
                    }
                }
                break;
            }
        }
        q.c().execute(new com.braze.ui.a(contextA, String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{strB}, 1)), strB, 1));
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0169  */
    /* JADX WARN: Code duplicated, block: B:92:0x01fa  */
    public static j d(String applicationId, JSONObject jSONObject) {
        HashMap map;
        HashMap map2;
        HashMap map3;
        String str;
        String str2;
        String str3;
        f fVar;
        String strOptString;
        JSONArray jSONArray;
        j.a aVar;
        JSONArray jSONArrayOptJSONArray;
        int length;
        String str4;
        boolean z10;
        int i10;
        i.e(applicationId, "applicationId");
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("android_sdk_error_categories");
        f.a aVar2 = f.f44880d;
        String str5 = "name";
        if (jSONArrayOptJSONArray2 == null) {
            fVar = null;
        } else {
            int length2 = jSONArrayOptJSONArray2.length();
            if (length2 > 0) {
                int i11 = 0;
                HashMap mapC = null;
                HashMap mapC2 = null;
                HashMap mapC3 = null;
                String strOptString2 = null;
                String strOptString3 = null;
                String strOptString4 = null;
                while (true) {
                    int i12 = i11 + 1;
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray2.optJSONObject(i11);
                    if (jSONObjectOptJSONObject == null || (strOptString = jSONObjectOptJSONObject.optString("name")) == null) {
                        jSONArray = jSONArrayOptJSONArray2;
                    } else {
                        jSONArray = jSONArrayOptJSONArray2;
                        if (strOptString.equalsIgnoreCase("other")) {
                            strOptString2 = jSONObjectOptJSONObject.optString("recovery_message", null);
                            mapC = f.a.c(jSONObjectOptJSONObject);
                        } else if (strOptString.equalsIgnoreCase("transient")) {
                            strOptString3 = jSONObjectOptJSONObject.optString("recovery_message", null);
                            mapC2 = f.a.c(jSONObjectOptJSONObject);
                        } else if (strOptString.equalsIgnoreCase("login_recoverable")) {
                            strOptString4 = jSONObjectOptJSONObject.optString("recovery_message", null);
                            mapC3 = f.a.c(jSONObjectOptJSONObject);
                        }
                    }
                    if (i12 >= length2) {
                        break;
                    }
                    i11 = i12;
                    jSONArrayOptJSONArray2 = jSONArray;
                }
                map = mapC;
                map2 = mapC2;
                map3 = mapC3;
                str = strOptString2;
                str2 = strOptString3;
                str3 = strOptString4;
            } else {
                map = null;
                map2 = null;
                map3 = null;
                str = null;
                str2 = null;
                str3 = null;
            }
            fVar = new f(map, map2, map3, str, str2, str3);
        }
        if (fVar == null) {
            fVar = aVar2.a();
        }
        f fVar2 = fVar;
        int iOptInt = jSONObject.optInt("app_events_feature_bitmask", 0);
        boolean z11 = (iOptInt & 8) != 0;
        boolean z12 = (iOptInt & 16) != 0;
        boolean z13 = (iOptInt & 32) != 0;
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("auto_event_mapping_android");
        if (jSONArrayOptJSONArray3 != null) {
            aVar = null;
            if (i.a(null, Boolean.TRUE)) {
                b bVar = b.f34559a;
                b.a("OnReceiveMapping", jSONArrayOptJSONArray3.toString());
            }
        } else {
            aVar = null;
        }
        boolean zOptBoolean = jSONObject.optBoolean("supports_implicit_sdk_logging", false);
        String strOptString5 = jSONObject.optString("gdpv4_nux_content", "");
        i.d(strOptString5, "settingsJSON.optString(APP_SETTING_NUX_CONTENT, \"\")");
        jSONObject.optBoolean("gdpv4_nux_enabled", false);
        int iOptInt2 = jSONObject.optInt("app_events_session_timeout", 60);
        EnumSet<SmartLoginOption> enumSet = SmartLoginOption.f25018b;
        long jOptLong = jSONObject.optLong("seamless_login");
        EnumSet result = EnumSet.noneOf(SmartLoginOption.class);
        for (SmartLoginOption smartLoginOption : SmartLoginOption.f25018b) {
            if ((smartLoginOption.a() & jOptLong) != 0) {
                result.add(smartLoginOption);
            }
        }
        i.d(result, "result");
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("android_dialog_configs");
        HashMap map4 = new HashMap();
        if (jSONObjectOptJSONObject2 != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("data")) != null && (length = jSONArrayOptJSONArray.length()) > 0) {
            int i13 = 0;
            while (true) {
                int i14 = i13 + 1;
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i13);
                i.d(jSONObjectOptJSONObject3, "dialogConfigData.optJSONObject(i)");
                String dialogNameWithFeature = jSONObjectOptJSONObject3.optString(str5);
                if (s.y(dialogNameWithFeature)) {
                    jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                    str4 = str5;
                    z10 = true;
                } else {
                    i.d(dialogNameWithFeature, "dialogNameWithFeature");
                    int i15 = 0;
                    List listE0 = n.e0(dialogNameWithFeature, new String[]{"|"}, 0, 6);
                    if (listE0.size() != 2) {
                        jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                        str4 = str5;
                        z10 = true;
                    } else {
                        String str6 = (String) kotlin.collections.q.O(listE0);
                        String str7 = (String) kotlin.collections.q.V(listE0);
                        if (s.y(str6) || s.y(str7)) {
                            jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                            str4 = str5;
                            z10 = true;
                            aVar = null;
                        } else {
                            String strOptString6 = jSONObjectOptJSONObject3.optString(Constants.BRAZE_WEBVIEW_URL_EXTRA);
                            if (!s.y(strOptString6)) {
                                Uri.parse(strOptString6);
                            }
                            JSONArray jSONArrayOptJSONArray4 = jSONObjectOptJSONObject3.optJSONArray("versions");
                            if (jSONArrayOptJSONArray4 != null) {
                                int length3 = jSONArrayOptJSONArray4.length();
                                int[] iArr = new int[length3];
                                if (length3 > 0) {
                                    z10 = true;
                                    while (true) {
                                        int i16 = i15 + 1;
                                        str4 = str5;
                                        int iOptInt3 = jSONArrayOptJSONArray4.optInt(i15, -1);
                                        if (iOptInt3 == -1) {
                                            String versionString = jSONArrayOptJSONArray4.optString(i15);
                                            if (!s.y(versionString)) {
                                                try {
                                                    i.d(versionString, "versionString");
                                                    i10 = Integer.parseInt(versionString);
                                                } catch (NumberFormatException unused) {
                                                    q qVar = q.f7852a;
                                                    i10 = -1;
                                                }
                                                iOptInt3 = i10;
                                            }
                                        }
                                        iArr[i15] = iOptInt3;
                                        if (i16 >= length3) {
                                            break;
                                        }
                                        i15 = i16;
                                        str5 = str4;
                                    }
                                } else {
                                    str4 = str5;
                                    z10 = true;
                                }
                            } else {
                                str4 = str5;
                                z10 = true;
                            }
                            aVar = new j.a(str6, str7);
                        }
                    }
                }
                if (aVar != null) {
                    String str8 = aVar.f44908a;
                    Map map5 = (Map) map4.get(str8);
                    if (map5 == null) {
                        map5 = new HashMap();
                        map4.put(str8, map5);
                    }
                    map5.put(aVar.f44909b, aVar);
                }
                if (i14 >= length) {
                    break;
                }
                aVar = null;
                i13 = i14;
                jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                str5 = str4;
            }
        }
        String strOptString7 = jSONObject.optString("smart_login_bookmark_icon_url");
        i.d(strOptString7, "settingsJSON.optString(SMART_LOGIN_BOOKMARK_ICON_URL)");
        String strOptString8 = jSONObject.optString("smart_login_menu_icon_url");
        i.d(strOptString8, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
        String strOptString9 = jSONObject.optString("sdk_update_message");
        i.d(strOptString9, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
        String strOptString10 = jSONObject.optString("aam_rules");
        String strOptString11 = jSONObject.optString("suggested_events_setting");
        String strOptString12 = jSONObject.optString("restrictive_data_filter_params");
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("protected_mode_rules");
        JSONArray jSONArrayOptJSONArray5 = jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optJSONArray("standard_params") : null;
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("protected_mode_rules");
        j jVar = new j(zOptBoolean, strOptString5, iOptInt2, result, map4, z11, fVar2, strOptString7, strOptString8, z12, z13, jSONArrayOptJSONArray3, strOptString9, strOptString10, strOptString11, strOptString12, jSONArrayOptJSONArray5, jSONObjectOptJSONObject5 != null ? jSONObjectOptJSONObject5.optJSONArray("maca_rules") : null);
        f25008c.put(applicationId, jVar);
        return jVar;
    }

    public static final j f(String applicationId, boolean z10) {
        i.e(applicationId, "applicationId");
        if (!z10) {
            ConcurrentHashMap concurrentHashMap = f25008c;
            if (concurrentHashMap.containsKey(applicationId)) {
                return (j) concurrentHashMap.get(applicationId);
            }
        }
        FetchedAppSettingsManager fetchedAppSettingsManager = f25006a;
        fetchedAppSettingsManager.getClass();
        j jVarD = d(applicationId, a());
        if (applicationId.equals(q.b())) {
            f25009d.set(FetchAppSettingState.f25014d);
            fetchedAppSettingsManager.e();
        }
        return jVarD;
    }

    public final synchronized void e() {
        FetchAppSettingState fetchAppSettingState = f25009d.get();
        if (FetchAppSettingState.f25012b != fetchAppSettingState && FetchAppSettingState.f25013c != fetchAppSettingState) {
            j jVar = (j) f25008c.get(q.b());
            Handler handler = new Handler(Looper.getMainLooper());
            if (FetchAppSettingState.f25015e == fetchAppSettingState) {
                while (true) {
                    ConcurrentLinkedQueue<a> concurrentLinkedQueue = f25010e;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    } else {
                        handler.post(new o(2, concurrentLinkedQueue.poll()));
                    }
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue<a> concurrentLinkedQueue2 = f25010e;
                    if (concurrentLinkedQueue2.isEmpty()) {
                        return;
                    } else {
                        handler.post(new U(concurrentLinkedQueue2.poll(), jVar));
                    }
                }
            }
        }
    }
}
