package p302y6;

import A6.N;
import A6.O;
import A6.S;
import A6.U;
import A6.f0;
import G6.a;
import G6.c;
import U1.f;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: CrashlyticsReportDataCapture.java */
/* JADX INFO: loaded from: classes3.dex */
public final class F {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap f48313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f48314g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f48315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f48316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2805a f48317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f48318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.google.firebase.crashlytics.internal.settings.a f48319e;

    static {
        HashMap map = new HashMap();
        f48313f = map;
        f.b(5, map, "armeabi", 6, "armeabi-v7a");
        f.b(9, map, "arm64-v8a", 0, "x86");
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        f48314g = "Crashlytics Android SDK/18.6.3";
    }

    public F(Context context, M m7, C2805a c2805a, a aVar, com.google.firebase.crashlytics.internal.settings.a aVar2) {
        this.f48315a = context;
        this.f48316b = m7;
        this.f48317c = c2805a;
        this.f48318d = aVar;
        this.f48319e = aVar2;
    }

    public static O c(c cVar, int i10) {
        String str = cVar.f3378b;
        int i11 = 0;
        StackTraceElement[] stackTraceElementArr = cVar.f3379c;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        c cVar2 = cVar.f3380d;
        if (i10 >= 8) {
            for (c cVar3 = cVar2; cVar3 != null; cVar3 = cVar3.f3380d) {
                i11++;
            }
        }
        int i12 = i11;
        List listD = d(stackTraceElementArr, 4);
        if (listD != null) {
            return new O(str, cVar.f3377a, listD, (cVar2 == null || i12 != 0) ? null : c(cVar2, i10 + 1), i12);
        }
        throw new NullPointerException("Null frames");
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            S.a aVar = new S.a();
            aVar.f774e = Integer.valueOf(i10);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            aVar.f770a = Long.valueOf(jMax);
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            aVar.f771b = str;
            aVar.f772c = fileName;
            aVar.f773d = Long.valueOf(lineNumber);
            arrayList.add(aVar.a());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final List<f0.e.d.a.b.AbstractC0008a> a() {
        C2805a c2805a = this.f48317c;
        String str = c2805a.f48357e;
        if (str != null) {
            return Collections.singletonList(new N(0L, 0L, str, c2805a.f48354b));
        }
        throw new NullPointerException("Null name");
    }

    public final U b(int i10) {
        boolean z10;
        Float fValueOf;
        Context context = this.f48315a;
        int i11 = 2;
        boolean z11 = false;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                z10 = intExtra != -1 && (intExtra == 2 || intExtra == 5);
                try {
                    int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
                    int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
                    fValueOf = (intExtra2 == -1 || intExtra3 == -1) ? null : Float.valueOf(intExtra2 / intExtra3);
                } catch (IllegalStateException e10) {
                    e = e10;
                    Log.e("FirebaseCrashlytics", "An error occurred getting battery state.", e);
                }
            } else {
                fValueOf = null;
                z10 = false;
            }
        } catch (IllegalStateException e11) {
            e = e11;
            z10 = false;
        }
        Double dValueOf = fValueOf != null ? Double.valueOf(fValueOf.doubleValue()) : null;
        if (!z10 || fValueOf == null) {
            i11 = 1;
        } else if (fValueOf.floatValue() >= 0.99d) {
            i11 = 3;
        }
        if (!CommonUtils.f() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
            z11 = true;
        }
        long jA = CommonUtils.a(context);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        long j = jA - memoryInfo.availMem;
        if (j <= 0) {
            j = 0;
        }
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize = statFs.getBlockSize();
        long blockCount = (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
        U.a aVar = new U.a();
        aVar.f789a = dValueOf;
        aVar.f790b = Integer.valueOf(i11);
        aVar.f791c = Boolean.valueOf(z11);
        aVar.f792d = Integer.valueOf(i10);
        aVar.f793e = Long.valueOf(j);
        aVar.f794f = Long.valueOf(blockCount);
        return aVar.a();
    }
}
