package com.google.android.gms.common;

import S4.C0764f;
import S4.j;
import U4.C0804l;
import U4.K;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.braze.Constants;
import com.voltasit.obdeleven.R;
import java.util.concurrent.atomic.AtomicBoolean;
import p006a5.c;
import p019b6.d;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f25298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f25299b;

    static {
        AtomicBoolean atomicBoolean = C0764f.f5539a;
        f25298a = 12451000;
        f25299b = new a();
    }

    public Intent a(Context context, String str, int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && d.d(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb2 = new StringBuilder("gcore_");
        sb2.append(f25298a);
        sb2.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        sb2.append("-");
        if (context != null) {
            sb2.append(context.getPackageName());
        }
        sb2.append("-");
        if (context != null) {
            try {
                sb2.append(c.a(context).b(0, context.getPackageName()).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb2.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x019a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x0144  */
    /* JADX WARN: Code duplicated, block: B:80:0x0161  */
    /* JADX WARN: Code duplicated, block: B:82:0x0166  */
    /* JADX WARN: Code duplicated, block: B:83:0x0168  */
    /* JADX WARN: Code duplicated, block: B:86:0x016d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0171  */
    /* JADX WARN: Code duplicated, block: B:89:0x0196  */
    /* JADX WARN: Code duplicated, block: B:98:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b9  */
    /* JADX WARN: Instruction removed from duplicated block: B:80:0x0161, please report this as an issue */
    public int b(Context context, int i10) {
        boolean z10;
        PackageInfo packageInfo;
        int i11;
        int i12;
        ApplicationInfo applicationInfo;
        AtomicBoolean atomicBoolean = C0764f.f5539a;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        boolean zB = true;
        if (!"com.google.android.gms".equals(context.getPackageName()) && !C0764f.f5542d.get()) {
            synchronized (K.f6358a) {
                try {
                    if (!K.f6359b) {
                        K.f6359b = true;
                        try {
                            Bundle bundle = c.a(context).a(128, context.getPackageName()).metaData;
                            if (bundle != null) {
                                bundle.getString("com.google.app.id");
                                K.f6360c = bundle.getInt("com.google.android.gms.version");
                            }
                        } catch (PackageManager.NameNotFoundException e10) {
                            Log.wtf("MetadataValueReader", "This should never happen.", e10);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i13 = K.f6360c;
            if (i13 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i13 != 12451000) {
                int i14 = f25298a;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i14).length() + me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_textAppearanceListItemSecondary + String.valueOf(i13).length() + 194);
                sb2.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                sb2.append(i14);
                sb2.append(" but found ");
                sb2.append(i13);
                sb2.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new GooglePlayServicesIncorrectManifestValueException(i13, sb2.toString());
            }
        }
        if (d.d(context)) {
            z10 = false;
        } else {
            if (d.f20565d == null) {
                d.f20565d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
            }
            if (d.f20565d.booleanValue()) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        C0804l.b(i10 >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        int i15 = 9;
        if (z10) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", Build.VERSION.SDK_INT >= 28 ? 134225984 : 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing.");
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
            j.a(context);
            if (!j.c(packageInfo2, true)) {
                String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid.");
            } else if (z10) {
                C0804l.h(packageInfo);
                if (!j.c(packageInfo, true)) {
                    String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid.");
                } else if (z10 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    i11 = packageInfo2.versionCode;
                    if (i11 == -1) {
                        i12 = -1;
                    } else {
                        i12 = i11 / Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS;
                    }
                    if (i12 < (i10 != -1 ? i10 / Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS : -1)) {
                        new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i10).length() + 11 + String.valueOf(i11).length());
                        i15 = 2;
                    } else {
                        applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            try {
                                applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                            } catch (PackageManager.NameNotFoundException e11) {
                                Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e11);
                                i15 = 1;
                            }
                        }
                        if (applicationInfo.enabled) {
                            i15 = 0;
                        } else {
                            i15 = 3;
                        }
                    }
                } else {
                    String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services.");
                }
            } else if (z10) {
                i11 = packageInfo2.versionCode;
                if (i11 == -1) {
                    i12 = -1;
                } else {
                    i12 = i11 / Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS;
                }
                if (i12 < (i10 != -1 ? i10 / Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS : -1)) {
                    new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i10).length() + 11 + String.valueOf(i11).length());
                    i15 = 2;
                } else {
                    applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    }
                    if (applicationInfo.enabled) {
                        i15 = 3;
                    } else {
                        i15 = 0;
                    }
                }
            } else {
                i11 = packageInfo2.versionCode;
                if (i11 == -1) {
                    i12 = -1;
                } else {
                    i12 = i11 / Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS;
                }
                if (i12 < (i10 != -1 ? i10 / Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS : -1)) {
                    new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i10).length() + 11 + String.valueOf(i11).length());
                    i15 = 2;
                } else {
                    applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    }
                    if (applicationInfo.enabled) {
                        i15 = 3;
                    } else {
                        i15 = 0;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            String.valueOf(packageName).concat(" requires Google Play services, but they are missing.");
        }
        if (i15 != 18) {
            zB = i15 == 1 ? C0764f.b(context) : false;
        }
        if (zB) {
            return 18;
        }
        return i15;
    }
}
