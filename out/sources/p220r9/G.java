package p220r9;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.net.Uri;
import androidx.core.app.v;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import java.util.Locale;

/* JADX INFO: compiled from: NotificationUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public final class G {
    public static void a(Context context, boolean z10) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager == null) {
            return;
        }
        Locale locale = Locale.US;
        Uri uri = Uri.parse("android.resource://" + context.getPackageName() + "/2131886080");
        v vVar = new v(context, "obdeleven_notification_channel_01");
        vVar.j = 0;
        vVar.d(16, true);
        vVar.f16793C.icon = 2131231411;
        vVar.f16800e = v.b(context.getString(R.string.common_device_alert));
        vVar.f16801f = v.b(context.getString(R.string.common_device_left_in_car));
        vVar.f(uri);
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(5).build();
        NotificationChannel notificationChannel = new NotificationChannel("obdeleven_notification_channel_01", context.getString(R.string.common_device_alert), 4);
        notificationChannel.setDescription(context.getString(R.string.common_device_left_in_car));
        notificationChannel.setSound(uri, audioAttributesBuild);
        notificationManager.createNotificationChannel(notificationChannel);
        vVar.f16818x = "obdeleven_notification_channel_01";
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setFlags(603979776);
        vVar.f16802g = PendingIntent.getActivity(context, 0, intent, 201326592);
        Notification notificationA = vVar.a();
        if (z10) {
            notificationA.flags |= 4;
        }
        notificationManager.notify(1, notificationA);
    }
}
