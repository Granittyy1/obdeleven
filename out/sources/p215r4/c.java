package p215r4;

import D2.V;
import Na.h;
import Na.l;
import Z3.I;
import Z3.r;
import Z3.x;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.braze.Constants;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.InstrumentData;
import com.google.android.gms.internal.measurement.Y;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.q;
import kotlin.jvm.internal.i;
import kotlin.text.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p165n4.s;
import p190p4.b;

/* JADX INFO: compiled from: CrashHandler.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f46338b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static c f46339c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f46340a;

    /* JADX INFO: compiled from: CrashHandler.kt */
    public static final class a {
        public static void a() {
            File[] fileArrListFiles;
            if (s.w()) {
                return;
            }
            File fileL = V.l();
            if (fileL == null) {
                fileArrListFiles = new File[0];
            } else {
                fileArrListFiles = fileL.listFiles(new b());
                if (fileArrListFiles == null) {
                    fileArrListFiles = new File[0];
                }
            }
            ArrayList arrayList = new ArrayList(fileArrListFiles.length);
            for (File file : fileArrListFiles) {
                arrayList.add(InstrumentData.a.a(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((InstrumentData) obj).a()) {
                    arrayList2.add(obj);
                }
            }
            final List listH0 = q.h0(arrayList2, new p215r4.a());
            JSONArray jSONArray = new JSONArray();
            h it = l.J(0, Math.min(listH0.size(), 5)).iterator();
            while (it.f4692d) {
                jSONArray.put(listH0.get(it.a()));
            }
            V.p("crash_reports", jSONArray, new r.b() { // from class: r4.b
                @Override // Z3.r.b
                public final void b(x xVar) {
                    List list = listH0;
                    try {
                        if (xVar.f7905c == null) {
                            JSONObject jSONObject = xVar.f7906d;
                            if (i.a(jSONObject == null ? null : Boolean.valueOf(jSONObject.getBoolean("success")), Boolean.TRUE)) {
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    V.i(((InstrumentData) it2.next()).f25024a);
                                }
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
            });
        }
    }

    public c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f46340a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread t8, Throwable e10) {
        String str;
        HashMap map;
        FeatureManager.Feature feature;
        i.e(t8, "t");
        i.e(e10, "e");
        Throwable th = null;
        loop0: for (Throwable cause = e10; cause != null && cause != th; cause = cause.getCause()) {
            StackTraceElement[] stackTrace = cause.getStackTrace();
            i.d(stackTrace, "t.stackTrace");
            int length = stackTrace.length;
            int i10 = 0;
            while (i10 < length) {
                StackTraceElement element = stackTrace[i10];
                i10++;
                i.d(element, "element");
                if (V.n(element)) {
                    if (Y.f25639b) {
                        HashSet hashSet = new HashSet();
                        StackTraceElement[] stackTrace2 = e10.getStackTrace();
                        i.d(stackTrace2, "e.stackTrace");
                        for (StackTraceElement stackTraceElement : stackTrace2) {
                            FeatureManager featureManager = FeatureManager.f24975a;
                            String className = stackTraceElement.getClassName();
                            i.d(className, "it.className");
                            synchronized (FeatureManager.f24975a) {
                                map = FeatureManager.f24976b;
                                if (map.isEmpty()) {
                                    map.put(FeatureManager.Feature.AAM, new String[]{"com.facebook.appevents.aam."});
                                    map.put(FeatureManager.Feature.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
                                    map.put(FeatureManager.Feature.CloudBridge, new String[]{"com.facebook.appevents.cloudbridge."});
                                    map.put(FeatureManager.Feature.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
                                    map.put(FeatureManager.Feature.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
                                    map.put(FeatureManager.Feature.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
                                    map.put(FeatureManager.Feature.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
                                    map.put(FeatureManager.Feature.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
                                    map.put(FeatureManager.Feature.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
                                    map.put(FeatureManager.Feature.ProtectedMode, new String[]{"com.facebook.appevents.integrity.ProtectedModeManager"});
                                    map.put(FeatureManager.Feature.MACARuleMatching, new String[]{"com.facebook.appevents.integrity.MACARuleMatchingManager"});
                                    map.put(FeatureManager.Feature.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
                                    map.put(FeatureManager.Feature.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
                                    map.put(FeatureManager.Feature.IapLogging, new String[]{"com.facebook.appevents.iap."});
                                    map.put(FeatureManager.Feature.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
                                }
                            }
                            Iterator it = map.entrySet().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    feature = FeatureManager.Feature.Unknown;
                                    break;
                                }
                                Map.Entry entry = (Map.Entry) it.next();
                                feature = (FeatureManager.Feature) entry.getKey();
                                String[] strArr = (String[]) entry.getValue();
                                int length2 = strArr.length;
                                int i11 = 0;
                                while (i11 < length2) {
                                    String str2 = strArr[i11];
                                    i11++;
                                    if (m.I(className, str2, false)) {
                                        break;
                                    }
                                }
                            }
                            if (feature != FeatureManager.Feature.Unknown) {
                                FeatureManager featureManager2 = FeatureManager.f24975a;
                                i.e(feature, "feature");
                                Z3.q.a().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString(i.k(feature, "FBSDKFeature"), "16.2.0").apply();
                                hashSet.add(feature.toString());
                            }
                        }
                        Z3.q qVar = Z3.q.f7852a;
                        if (I.a() && !hashSet.isEmpty()) {
                            JSONArray jSONArray = new JSONArray((Collection) hashSet);
                            InstrumentData instrumentData = new InstrumentData();
                            instrumentData.f25025b = InstrumentData.Type.f25032c;
                            Long lValueOf = Long.valueOf(System.currentTimeMillis() / ((long) Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS));
                            instrumentData.f25030g = lValueOf;
                            instrumentData.f25026c = jSONArray;
                            StringBuffer stringBuffer = new StringBuffer("analysis_log_");
                            stringBuffer.append(String.valueOf(lValueOf));
                            stringBuffer.append(".json");
                            String string = stringBuffer.toString();
                            i.d(string, "StringBuffer()\n            .append(InstrumentUtility.ANALYSIS_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
                            instrumentData.f25024a = string;
                            if (instrumentData.a()) {
                                V.u(instrumentData.f25024a, instrumentData.toString());
                            }
                        }
                    }
                    InstrumentData.Type type = InstrumentData.Type.f25034e;
                    InstrumentData instrumentData2 = new InstrumentData();
                    instrumentData2.f25025b = type;
                    Context contextA = Z3.q.a();
                    try {
                        PackageInfo packageInfo = contextA.getPackageManager().getPackageInfo(contextA.getPackageName(), 0);
                        str = packageInfo == null ? null : packageInfo.versionName;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    instrumentData2.f25027d = str;
                    instrumentData2.f25028e = e10.getCause() == null ? e10.toString() : String.valueOf(e10.getCause());
                    JSONArray jSONArray2 = new JSONArray();
                    Throwable th2 = null;
                    for (Throwable cause2 = e10; cause2 != null && cause2 != th2; cause2 = cause2.getCause()) {
                        StackTraceElement[] stackTrace3 = cause2.getStackTrace();
                        i.d(stackTrace3, "t.stackTrace");
                        int length3 = stackTrace3.length;
                        int i12 = 0;
                        while (i12 < length3) {
                            StackTraceElement stackTraceElement2 = stackTrace3[i12];
                            i12++;
                            jSONArray2.put(stackTraceElement2.toString());
                        }
                        th2 = cause2;
                    }
                    instrumentData2.f25029f = jSONArray2.toString();
                    Long lValueOf2 = Long.valueOf(System.currentTimeMillis() / ((long) Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS));
                    instrumentData2.f25030g = lValueOf2;
                    StringBuffer stringBuffer2 = new StringBuffer("crash_log_");
                    stringBuffer2.append(String.valueOf(lValueOf2));
                    stringBuffer2.append(".json");
                    String string2 = stringBuffer2.toString();
                    i.d(string2, "StringBuffer().append(t.logPrefix).append(timestamp.toString()).append(\".json\").toString()");
                    instrumentData2.f25024a = string2;
                    if (!instrumentData2.a()) {
                        break loop0;
                    }
                    V.u(instrumentData2.f25024a, instrumentData2.toString());
                    break loop0;
                }
            }
            th = cause;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f46340a;
        if (uncaughtExceptionHandler == null) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(t8, e10);
    }
}
