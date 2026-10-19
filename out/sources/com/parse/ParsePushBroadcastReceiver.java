package com.parse;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.app.t;
import androidx.core.app.v;
import java.util.Locale;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ParsePushBroadcastReceiver extends BroadcastReceiver {
    public void createNotificationChannel(Context context, NotificationChannel notificationChannel) {
        ((NotificationManager) context.getSystemService("notification")).createNotificationChannel(notificationChannel);
    }

    public Class<? extends Activity> getActivity(Context context, Intent intent) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            return null;
        }
        try {
            return Class.forName(launchIntentForPackage.getComponent().getClassName());
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public Intent getContentIntent(Bundle bundle, String str) {
        Intent intent = new Intent("com.parse.push.intent.OPEN");
        intent.putExtras(bundle);
        intent.setPackage(str);
        return intent;
    }

    public Intent getDeleteIntent(Bundle bundle, String str) {
        Intent intent = new Intent("com.parse.push.intent.DELETE");
        intent.putExtras(bundle);
        intent.setPackage(str);
        return intent;
    }

    public Bitmap getLargeIcon(Context context, Intent intent) {
        return null;
    }

    public v getNotification(Context context, Intent intent) {
        JSONObject pushData = getPushData(intent);
        if (pushData == null) {
            return null;
        }
        if (!pushData.has("alert") && !pushData.has("title")) {
            return null;
        }
        String strOptString = pushData.optString("title", ManifestInfo.getDisplayName(context));
        String strOptString2 = pushData.optString("alert", "Notification received.");
        Locale.getDefault();
        Bundle extras = intent.getExtras();
        Random random = new Random();
        int iNextInt = random.nextInt();
        int iNextInt2 = random.nextInt();
        String packageName = context.getPackageName();
        Intent contentIntent = getContentIntent(extras, packageName);
        Intent deleteIntent = getDeleteIntent(extras, packageName);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, iNextInt, contentIntent, 134217728);
        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, iNextInt2, deleteIntent, 134217728);
        NotificationChannel notificationChannel = getNotificationChannel(context, intent);
        createNotificationChannel(context, notificationChannel);
        v vVar = new v(context, notificationChannel.getId());
        vVar.f16800e = v.b(strOptString);
        vVar.f16801f = v.b(strOptString2);
        vVar.f16793C.tickerText = v.b(strOptString + ": " + strOptString2);
        vVar.f16793C.icon = getSmallIconId(context, intent);
        vVar.e(getLargeIcon(context, intent));
        vVar.f16802g = broadcast;
        vVar.f16793C.deleteIntent = broadcast2;
        vVar.d(16, true);
        vVar.c(-1);
        if (strOptString2 != null && strOptString2.length() > 38) {
            t tVar = new t();
            tVar.f16786a = v.b(strOptString2);
            vVar.g(tVar);
        }
        return vVar;
    }

    public NotificationChannel getNotificationChannel(Context context, Intent intent) {
        return new NotificationChannel("parse_push", "Push notifications", 3);
    }

    public JSONObject getPushData(Intent intent) {
        try {
            return new JSONObject(intent.getStringExtra("com.parse.Data"));
        } catch (JSONException e10) {
            PLog.e("com.parse.ParsePushReceiver", "Unexpected JSONException when receiving push data: ", e10);
            return null;
        }
    }

    public int getSmallIconId(Context context, Intent intent) {
        Bundle applicationMetadata = ManifestInfo.getApplicationMetadata(context);
        int i10 = applicationMetadata != null ? applicationMetadata.getInt("com.parse.push.notification_icon") : 0;
        return i10 != 0 ? i10 : ManifestInfo.getIconId();
    }

    public void onPushOpen(Context context, Intent intent) {
        ParseAnalytics.trackAppOpenedInBackground(intent);
        String strOptString = null;
        try {
            strOptString = new JSONObject(intent.getStringExtra("com.parse.Data")).optString("uri", null);
        } catch (JSONException e10) {
            PLog.e("com.parse.ParsePushReceiver", "Unexpected JSONException when receiving push data: ", e10);
        }
        Class<? extends Activity> activity = getActivity(context, intent);
        Intent intent2 = strOptString != null ? new Intent("android.intent.action.VIEW", Uri.parse(strOptString)) : new Intent(context, activity);
        intent2.putExtras(intent.getExtras());
        TaskStackBuilderHelper.startActivities(context, activity, intent2);
    }

    public void onPushReceive(Context context, Intent intent) {
        JSONObject jSONObject;
        String stringExtra = intent.getStringExtra("com.parse.Data");
        if (stringExtra == null) {
            PLog.e("com.parse.ParsePushReceiver", "Can not get push data from intent.");
            return;
        }
        PLog.v("com.parse.ParsePushReceiver", "Received push data: ".concat(stringExtra));
        try {
            jSONObject = new JSONObject(stringExtra);
        } catch (JSONException e10) {
            PLog.e("com.parse.ParsePushReceiver", "Unexpected JSONException when receiving push data: ", e10);
            jSONObject = null;
        }
        String strOptString = jSONObject != null ? jSONObject.optString("action", null) : null;
        if (strOptString != null) {
            Bundle extras = intent.getExtras();
            Intent intent2 = new Intent();
            intent2.putExtras(extras);
            intent2.setAction(strOptString);
            intent2.setPackage(context.getPackageName());
            context.sendBroadcast(intent2);
        }
        v notification = getNotification(context, intent);
        Notification notificationA = notification != null ? notification.a() : null;
        if (notificationA != null) {
            ParseNotificationManager.getInstance().showNotification(context, notificationA);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            switch (action) {
                case "com.parse.push.intent.DELETE":
                    onPushDismiss(context, intent);
                    break;
                case "com.parse.push.intent.RECEIVE":
                    onPushReceive(context, intent);
                    break;
                case "com.parse.push.intent.OPEN":
                    onPushOpen(context, intent);
                    break;
            }
        }
    }

    public void onPushDismiss(Context context, Intent intent) {
    }
}
