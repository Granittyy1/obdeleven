package com.voltasit.obdeleven.notifications;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import androidx.core.app.v;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.startup.StartupActivity;
import kotlin.jvm.internal.i;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: OfferNotificationManager.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public static void a(NotificationManager notificationManager, MyFirebaseMessagingService myFirebaseMessagingService, String str, String str2, PendingIntent pendingIntent) {
        NotificationChannel notificationChannel = new NotificationChannel("megaOffer", myFirebaseMessagingService.getString(R.string.notification_special_discounts_name), 3);
        notificationChannel.setDescription(myFirebaseMessagingService.getString(R.string.notification_special_discounts_description));
        notificationManager.createNotificationChannel(notificationChannel);
        v vVar = new v(myFirebaseMessagingService, "offerNotification");
        vVar.f16793C.icon = 2131231133;
        vVar.f16800e = v.b(str);
        vVar.f16801f = v.b(str2);
        vVar.f16802g = pendingIntent;
        vVar.f16818x = "megaOffer";
        vVar.d(16, true);
        Notification notificationA = vVar.a();
        i.d(notificationA, "build(...)");
        notificationManager.notify(0, notificationA);
    }

    public static void b(JSONObject jSONObject, MyFirebaseMessagingService myFirebaseMessagingService, NotificationManager notificationManager) throws JSONException {
        String string = jSONObject.getString("title");
        String string2 = jSONObject.getString("message");
        Intent intent = new Intent(myFirebaseMessagingService, (Class<?>) StartupActivity.class);
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.addFlags(268435456);
        PendingIntent activity = PendingIntent.getActivity(myFirebaseMessagingService, 0, intent, 201326592);
        i.b(string);
        i.b(string2);
        a(notificationManager, myFirebaseMessagingService, string, string2, activity);
    }
}
