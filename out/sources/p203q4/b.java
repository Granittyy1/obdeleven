package p203q4;

import D2.V;
import Z3.q;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.os.Process;
import com.braze.Constants;
import com.facebook.internal.instrument.InstrumentData;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.i;
import kotlin.text.m;
import org.json.JSONArray;

/* JADX INFO: compiled from: ANRDetector.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f46091a = Process.myUid();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ScheduledExecutorService f46092b = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f46093c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f46094d = new a();

    /* JADX WARN: Code duplicated, block: B:28:0x0095  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e6 A[Catch: NameNotFoundException -> 0x00e8, TRY_LEAVE, TryCatch #0 {NameNotFoundException -> 0x00e8, blocks: (B:36:0x00db, B:39:0x00e6), top: B:47:0x00db }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x000e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x012d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x012d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x012d A[SYNTHETIC] */
    public static final void a(ActivityManager activityManager) {
        StackTraceElement[] stackTrace;
        String methodName;
        String methodName2;
        String methodName3;
        InstrumentData instrumentData;
        String str;
        PackageInfo packageInfo;
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
        if (processesInErrorState == null) {
            return;
        }
        for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
            if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == f46091a) {
                Thread thread = Looper.getMainLooper().getThread();
                i.d(thread, "getMainLooper().thread");
                StackTraceElement[] stackTrace2 = thread.getStackTrace();
                JSONArray jSONArray = new JSONArray();
                i.d(stackTrace2, "stackTrace");
                int length = stackTrace2.length;
                int i10 = 0;
                while (i10 < length) {
                    StackTraceElement stackTraceElement = stackTrace2[i10];
                    i10++;
                    jSONArray.put(stackTraceElement.toString());
                }
                String string = jSONArray.toString();
                if (!i.a(string, f46093c) && (stackTrace = thread.getStackTrace()) != null) {
                    int length2 = stackTrace.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length2) {
                            StackTraceElement element = stackTrace[i11];
                            i.d(element, "element");
                            if (V.n(element)) {
                                String className = element.getClassName();
                                i.d(className, "element.className");
                                if (m.I(className, "com.facebook.appevents.codeless", false)) {
                                    methodName = element.getMethodName();
                                    i.d(methodName, "element.methodName");
                                    if (m.I(methodName, "onClick", false)) {
                                        continue;
                                    } else {
                                        methodName2 = element.getMethodName();
                                        i.d(methodName2, "element.methodName");
                                        if (m.I(methodName2, "onItemClick", false)) {
                                            continue;
                                        } else {
                                            methodName3 = element.getMethodName();
                                            i.d(methodName3, "element.methodName");
                                            if (!m.I(methodName3, "onTouch", false)) {
                                                f46093c = string;
                                                String str2 = processErrorStateInfo.shortMsg;
                                                instrumentData = new InstrumentData();
                                                instrumentData.f25025b = InstrumentData.Type.f25033d;
                                                Context contextA = q.a();
                                                str = null;
                                                packageInfo = contextA.getPackageManager().getPackageInfo(contextA.getPackageName(), 0);
                                                if (packageInfo == null) {
                                                    str = packageInfo.versionName;
                                                }
                                                instrumentData.f25027d = str;
                                                instrumentData.f25028e = str2;
                                                instrumentData.f25029f = string;
                                                Long lValueOf = Long.valueOf(System.currentTimeMillis() / ((long) Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS));
                                                instrumentData.f25030g = lValueOf;
                                                StringBuffer stringBuffer = new StringBuffer("anr_log_");
                                                stringBuffer.append(String.valueOf(lValueOf));
                                                stringBuffer.append(".json");
                                                String string2 = stringBuffer.toString();
                                                i.d(string2, "StringBuffer()\n            .append(InstrumentUtility.ANR_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
                                                instrumentData.f25024a = string2;
                                                if (!instrumentData.a()) {
                                                    V.u(instrumentData.f25024a, instrumentData.toString());
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    String className2 = element.getClassName();
                                    i.d(className2, "element.className");
                                    if (m.I(className2, "com.facebook.appevents.suggestedevents", false)) {
                                        methodName = element.getMethodName();
                                        i.d(methodName, "element.methodName");
                                        if (m.I(methodName, "onClick", false)) {
                                            methodName2 = element.getMethodName();
                                            i.d(methodName2, "element.methodName");
                                            if (m.I(methodName2, "onItemClick", false)) {
                                                methodName3 = element.getMethodName();
                                                i.d(methodName3, "element.methodName");
                                                if (!m.I(methodName3, "onTouch", false)) {
                                                }
                                            } else {
                                                continue;
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                    f46093c = string;
                                    String str3 = processErrorStateInfo.shortMsg;
                                    instrumentData = new InstrumentData();
                                    instrumentData.f25025b = InstrumentData.Type.f25033d;
                                    Context contextA2 = q.a();
                                    str = null;
                                    try {
                                        packageInfo = contextA2.getPackageManager().getPackageInfo(contextA2.getPackageName(), 0);
                                        if (packageInfo == null) {
                                            str = packageInfo.versionName;
                                        }
                                    } catch (PackageManager.NameNotFoundException unused) {
                                    }
                                    instrumentData.f25027d = str;
                                    instrumentData.f25028e = str3;
                                    instrumentData.f25029f = string;
                                    Long lValueOf2 = Long.valueOf(System.currentTimeMillis() / ((long) Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS));
                                    instrumentData.f25030g = lValueOf2;
                                    StringBuffer stringBuffer2 = new StringBuffer("anr_log_");
                                    stringBuffer2.append(String.valueOf(lValueOf2));
                                    stringBuffer2.append(".json");
                                    String string3 = stringBuffer2.toString();
                                    i.d(string3, "StringBuffer()\n            .append(InstrumentUtility.ANR_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
                                    instrumentData.f25024a = string3;
                                    if (!instrumentData.a()) {
                                        V.u(instrumentData.f25024a, instrumentData.toString());
                                    }
                                }
                            }
                            i11++;
                        }
                    }
                }
            }
        }
    }
}
