package p093h4;

import X8.a;
import Z3.I;
import Z3.q;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.util.Base64;
import com.braze.Constants;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.FlushReason;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.i;
import p005a4.j;
import p005a4.n;
import p165n4.l;

/* JADX INFO: compiled from: SessionLogger.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f36169a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f36170b = k.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long[] f36171c = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    public static final void a(Context context, String str, String str2) {
        String string;
        String string2;
        i.e(context, "context");
        Bundle bundle = new Bundle();
        bundle.putString("fb_mobile_launch_source", "Unclassified");
        f36169a.getClass();
        String str3 = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            String strK = i.k(packageManager.getPackageInfo(context.getPackageName(), 0).versionName, "PCKGCHKSUM;");
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            string = sharedPreferences.getString(strK, null);
            if (string == null || string.length() != 32) {
                String strB = i.b(context);
                if (strB == null) {
                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
                    i.d(applicationInfo, "pm.getApplicationInfo(context.packageName, 0)");
                    strB = i.a(applicationInfo.sourceDir);
                }
                sharedPreferences.edit().putString(strK, strB).apply();
                str3 = strB;
                string = str3;
            }
        } catch (Exception unused) {
        }
        bundle.putString("fb_mobile_pckg_fp", string);
        try {
            Signature[] signatures = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            StringBuilder sb2 = new StringBuilder();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            i.d(signatures, "signatures");
            int length = signatures.length;
            int i10 = 0;
            while (i10 < length) {
                Signature signature = signatures[i10];
                i10++;
                messageDigest.update(signature.toByteArray());
                sb2.append(Base64.encodeToString(messageDigest.digest(), 0));
                sb2.append(":");
            }
            if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            string2 = sb2.toString();
            i.d(string2, "sb.toString()");
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused2) {
            string2 = "";
        }
        bundle.putString("fb_mobile_app_cert_hash", string2);
        n nVar = new n(str, str2);
        q qVar = q.f7852a;
        if (I.a()) {
            nVar.a("fb_mobile_activate_app", null, bundle, false, e.b());
        }
        synchronized (n.f8035d) {
        }
        String str4 = j.f8027a;
        j.f8030d.execute(new a(1, FlushReason.f24780b));
    }

    public static final void b(String str, j jVar, String str2) {
        String string;
        Long l10;
        if (jVar == null) {
            return;
        }
        Long l11 = jVar.f36167e;
        if (l11 == null) {
            l11 = 0L;
        }
        long jLongValue = l11.longValue();
        String str3 = f36170b;
        LoggingBehavior loggingBehavior = LoggingBehavior.f24776d;
        k kVar = f36169a;
        if (jLongValue < 0) {
            kVar.getClass();
            l.a aVar = l.f44910c;
            i.b(str3);
            l.a.a(loggingBehavior, str3, "Clock skew detected");
            jLongValue = 0;
        }
        Long l12 = jVar.f36163a;
        long jLongValue2 = (l12 == null || (l10 = jVar.f36164b) == null) ? 0L : l10.longValue() - l12.longValue();
        if (jLongValue2 < 0) {
            kVar.getClass();
            l.a aVar2 = l.f44910c;
            i.b(str3);
            l.a.a(loggingBehavior, str3, "Clock skew detected");
            jLongValue2 = 0;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("fb_mobile_app_interruptions", jVar.f36166d);
        Locale locale = Locale.ROOT;
        int i10 = 0;
        while (true) {
            long[] jArr = f36171c;
            if (i10 >= jArr.length || jArr[i10] >= jLongValue) {
                break;
            } else {
                i10++;
            }
        }
        bundle.putString("fb_mobile_time_between_sessions", String.format(locale, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1)));
        l lVar = jVar.f36168f;
        String str4 = "Unclassified";
        if (lVar != null && (string = lVar.toString()) != null) {
            str4 = string;
        }
        bundle.putString("fb_mobile_launch_source", str4);
        Long l13 = jVar.f36164b;
        bundle.putLong("_logTime", (l13 != null ? l13.longValue() : 0L) / ((long) Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS));
        n nVar = new n(str, str2);
        double d10 = jLongValue2 / 1000;
        q qVar = q.f7852a;
        if (I.a()) {
            nVar.a("fb_mobile_deactivate_app", Double.valueOf(d10), bundle, false, e.b());
        }
    }
}
