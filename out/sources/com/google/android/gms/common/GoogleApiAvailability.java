package com.google.android.gms.common;

import S4.C0764f;
import S4.DialogFragmentC0761c;
import S4.k;
import S4.l;
import T4.InterfaceC0773f;
import U4.AbstractDialogInterfaceOnClickListenerC0813v;
import U4.C0804l;
import U4.C0810s;
import U4.C0811t;
import U4.C0812u;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import androidx.core.app.r;
import androidx.core.app.t;
import androidx.core.app.v;
import androidx.core.graphics.drawable.IconCompat;
import androidx.fragment.app.ActivityC1347l;
import androidx.fragment.app.y;
import com.braze.Constants;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import e5.d;
import e5.e;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {d.class, e.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
public class GoogleApiAvailability extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f25296c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final GoogleApiAvailability f25297d = new GoogleApiAvailability();

    public static AlertDialog d(Activity activity, int i10, AbstractDialogInterfaceOnClickListenerC0813v abstractDialogInterfaceOnClickListenerC0813v, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(C0810s.b(activity, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (i10 == 1) {
            string = resources.getString(com.voltasit.obdeleven.R.string.common_google_play_services_install_button);
        } else if (i10 != 2) {
            string = i10 != 3 ? resources.getString(R.string.ok) : resources.getString(com.voltasit.obdeleven.R.string.common_google_play_services_enable_button);
        } else {
            string = resources.getString(com.voltasit.obdeleven.R.string.common_google_play_services_update_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, abstractDialogInterfaceOnClickListenerC0813v);
        }
        String strC = C0810s.c(activity, i10);
        if (strC != null) {
            builder.setTitle(strC);
        }
        new IllegalArgumentException();
        return builder.create();
    }

    public static void e(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof ActivityC1347l) {
                y supportFragmentManager = ((ActivityC1347l) activity).getSupportFragmentManager();
                k kVar = new k();
                C0804l.i(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                kVar.f5546r = alertDialog;
                if (onCancelListener != null) {
                    kVar.f5547s = onCancelListener;
                }
                kVar.v(supportFragmentManager, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        DialogFragmentC0761c dialogFragmentC0761c = new DialogFragmentC0761c();
        C0804l.i(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        dialogFragmentC0761c.f5531b = alertDialog;
        if (onCancelListener != null) {
            dialogFragmentC0761c.f5532c = onCancelListener;
        }
        dialogFragmentC0761c.show(fragmentManager, str);
    }

    @ResultIgnorabilityUnspecified
    public final void c(GoogleApiActivity googleApiActivity, int i10, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogD = d(googleApiActivity, i10, new C0811t(super.a(googleApiActivity, Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, i10), googleApiActivity), googleApiActivity2);
        if (alertDialogD == null) {
            return;
        }
        e(googleApiActivity, alertDialogD, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void f(Context context, int i10, PendingIntent pendingIntent) {
        int i11;
        new IllegalArgumentException();
        if (i10 == 18) {
            new l(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            return;
        }
        String strE = i10 == 6 ? C0810s.e(context, "common_google_play_services_resolution_required_title") : C0810s.c(context, i10);
        if (strE == null) {
            strE = context.getResources().getString(com.voltasit.obdeleven.R.string.common_google_play_services_notification_ticker);
        }
        String strD = (i10 == 6 || i10 == 19) ? C0810s.d(context, "common_google_play_services_resolution_required_text", C0810s.a(context)) : C0810s.b(context, i10);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        C0804l.h(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        v vVar = new v(context, null);
        vVar.f16810p = true;
        vVar.d(16, true);
        vVar.f16800e = v.b(strE);
        t tVar = new t();
        tVar.f16786a = v.b(strD);
        vVar.g(tVar);
        PackageManager packageManager = context.getPackageManager();
        if (p019b6.d.f20563b == null) {
            p019b6.d.f20563b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (p019b6.d.f20563b.booleanValue()) {
            vVar.f16793C.icon = context.getApplicationInfo().icon;
            vVar.j = 2;
            if (p019b6.d.d(context)) {
                vVar.f16797b.add(new r(IconCompat.e(null, "", 2131230945), resources.getString(com.voltasit.obdeleven.R.string.common_open_on_phone), pendingIntent, new Bundle(), null, null, true, true, false));
            } else {
                vVar.f16802g = pendingIntent;
            }
        } else {
            vVar.f16793C.icon = R.drawable.stat_sys_warning;
            vVar.f16793C.tickerText = v.b(resources.getString(com.voltasit.obdeleven.R.string.common_google_play_services_notification_ticker));
            vVar.f16793C.when = System.currentTimeMillis();
            vVar.f16802g = pendingIntent;
            vVar.f16801f = v.b(strD);
        }
        synchronized (f25296c) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(com.voltasit.obdeleven.R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        vVar.f16818x = "com.google.android.gms.availability";
        Notification notificationA = vVar.a();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            C0764f.f5539a.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, notificationA);
    }

    @ResultIgnorabilityUnspecified
    public final void g(Activity activity, InterfaceC0773f interfaceC0773f, int i10, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogD = d(activity, i10, new C0812u(super.a(activity, Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, i10), interfaceC0773f), onCancelListener);
        if (alertDialogD == null) {
            return;
        }
        e(activity, alertDialogD, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
