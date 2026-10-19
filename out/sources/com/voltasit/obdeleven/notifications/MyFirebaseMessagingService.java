package com.voltasit.obdeleven.notifications;

import O.e;
import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentCallbacks;
import android.content.Intent;
import android.os.Bundle;
import androidx.collection.C0873a;
import androidx.core.app.v;
import com.braze.push.BrazeFirebaseMessagingService;
import com.google.firebase.messaging.F;
import com.parse.ParseUser;
import com.parse.fcm.ParseFirebaseMessagingService;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.data.providers.q;
import com.voltasit.obdeleven.domain.models.NotificationType;
import com.voltasit.obdeleven.domain.usecases.user.C;
import com.voltasit.obdeleven.presentation.notification.NotificationActivity;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import io.intercom.android.sdk.push.IntercomPushClient;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import kotlinx.coroutines.C2673a0;
import kotlinx.coroutines.C2680e;
import org.json.JSONException;
import org.json.JSONObject;
import p255u9.z;
import p293xa.r;

/* JADX INFO: compiled from: MyFirebaseMessagingService.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class MyFirebaseMessagingService extends ParseFirebaseMessagingService {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IntercomPushClient f31198b = new IntercomPushClient();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f31199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f31200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f31201e;

    public MyFirebaseMessagingService() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f42971b;
        this.f31199c = kotlin.a.b(lazyThreadSafetyMode, new Ia.a<q>(this) { // from class: com.voltasit.obdeleven.notifications.MyFirebaseMessagingService$special$$inlined$inject$default$1
            final /* synthetic */ ComponentCallbacks $this_inject;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_inject = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.voltasit.obdeleven.data.providers.q, java.lang.Object] */
            @Override // Ia.a
            public final q invoke() {
                ComponentCallbacks componentCallbacks = this.$this_inject;
                Pb.a aVar = this.$qualifier;
                return Cb.a.i(componentCallbacks).a(this.$parameters, aVar, l.a(q.class));
            }
        });
        this.f31200d = kotlin.a.b(lazyThreadSafetyMode, new Ia.a<c>(this) { // from class: com.voltasit.obdeleven.notifications.MyFirebaseMessagingService$special$$inlined$inject$default$2
            final /* synthetic */ ComponentCallbacks $this_inject;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_inject = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.voltasit.obdeleven.notifications.c, java.lang.Object] */
            @Override // Ia.a
            public final c invoke() {
                ComponentCallbacks componentCallbacks = this.$this_inject;
                Pb.a aVar = this.$qualifier;
                return Cb.a.i(componentCallbacks).a(this.$parameters, aVar, l.a(c.class));
            }
        });
        this.f31201e = kotlin.a.b(lazyThreadSafetyMode, new Ia.a<C>(this) { // from class: com.voltasit.obdeleven.notifications.MyFirebaseMessagingService$special$$inlined$inject$default$3
            final /* synthetic */ ComponentCallbacks $this_inject;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_inject = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.voltasit.obdeleven.domain.usecases.user.C, java.lang.Object] */
            @Override // Ia.a
            public final C invoke() {
                ComponentCallbacks componentCallbacks = this.$this_inject;
                Pb.a aVar = this.$qualifier;
                return Cb.a.i(componentCallbacks).a(this.$parameters, aVar, l.a(C.class));
            }
        });
        e.j("MyFirebaseMessagingService", "MyFirebaseMessagingService()");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static JSONObject c(F f10) {
        String str = (String) ((C0873a) f10.e()).get("data");
        try {
            if (str == null) {
                str = "";
            }
            return new JSONObject(str);
        } catch (JSONException e10) {
            P8.c.b(e10);
            return new JSONObject();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a d(F f10) {
        String str = (String) ((C0873a) f10.e()).get("data");
        if (str != null) {
            try {
                return b.a(new JSONObject(str));
            } catch (JSONException e10) {
                e.m(e10);
                return null;
            }
        }
        Map<String, String> mapE = f10.e();
        i.d(mapE, "getData(...)");
        NotificationType.a aVar = NotificationType.f30491b;
        C0873a c0873a = (C0873a) mapE;
        String str2 = (String) c0873a.get("type");
        if (str2 == null) {
            str2 = "";
        }
        aVar.getClass();
        NotificationType notificationTypeA = NotificationType.a.a(str2);
        String str3 = (String) c0873a.get("title");
        if (str3 == null) {
            str3 = "";
        }
        String str4 = (String) c0873a.get("message");
        if (str4 == null) {
            str4 = "";
        }
        Bundle bundle = new Bundle();
        String str5 = (String) c0873a.get("imageUrl");
        if (str5 == null) {
            str5 = "";
        }
        bundle.putString("content_image_url", str5);
        String str6 = (String) c0873a.get("destinationUrl");
        bundle.putString("content_destination_url", str6 != null ? str6 : "");
        r rVar = r.f47939a;
        return new a(notificationTypeA, str3, str4, bundle);
    }

    public final void e(JSONObject jSONObject) {
        List listS;
        int i10 = z.f47484b;
        if (((z) ParseUser.getCurrentUser()) == null) {
            e.D("MyFirebaseMessagingService", "Unable to show app notification, because no user is set");
            return;
        }
        try {
            listS = kotlin.collections.l.s(jSONObject.getString("vehicleBaseId"), jSONObject.getString("make"));
        } catch (JSONException e10) {
            e.m(e10);
            listS = null;
        }
        if (listS == null) {
            return;
        }
        String str = (String) listS.get(0);
        String str2 = (String) listS.get(1);
        Object systemService = getSystemService("notification");
        i.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        NotificationChannel notificationChannel = new NotificationChannel("newOCA", getString(R.string.app_updated_push_title), 3);
        notificationChannel.setDescription(getString(R.string.app_updated_push_title));
        notificationManager.createNotificationChannel(notificationChannel);
        v vVar = new v(this, "newOCA");
        vVar.j = 0;
        vVar.d(16, true);
        vVar.f16793C.icon = 2131231411;
        vVar.f16800e = v.b(getString(R.string.common_app_updated_push_title));
        vVar.f16801f = v.b(getString(R.string.common_app_updated_push_alert, str2));
        vVar.d(8, true);
        String string = jSONObject.toString();
        i.d(string, "toString(...)");
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        intent.putExtra("pushData", p271w0.c.b(new Pair("com.parse.Data", string)));
        intent.addFlags(268435456);
        intent.addFlags(67108864);
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 201326592);
        i.d(activity, "getActivity(...)");
        vVar.f16802g = activity;
        notificationManager.notify(str.hashCode(), vVar.a());
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        e.j("MyFirebaseMessagingService", "onCreate()");
    }

    @Override // com.google.firebase.messaging.AbstractServiceC2046i, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        e.j("MyFirebaseMessagingService", "onDestroy()");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, xa.g] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, xa.g] */
    @Override // com.parse.fcm.ParseFirebaseMessagingService, com.google.firebase.messaging.FirebaseMessagingService
    public final void onMessageReceived(F remoteMessage) {
        NotificationType notificationTypeA;
        i.e(remoteMessage, "remoteMessage");
        e.s("MyFirebaseMessagingService", "onMessageReceived()");
        Map<String, String> mapE = remoteMessage.e();
        i.d(mapE, "getData(...)");
        IntercomPushClient intercomPushClient = this.f31198b;
        if (intercomPushClient.isIntercomPush(mapE)) {
            Application application = getApplication();
            i.d(application, "getApplication(...)");
            intercomPushClient.handlePush(application, mapE);
            return;
        }
        q qVar = (q) this.f31199c.getValue();
        qVar.getClass();
        if (BrazeFirebaseMessagingService.Companion.handleBrazeRemoteMessage(qVar.f30274a, remoteMessage)) {
            return;
        }
        if (((C0873a) remoteMessage.e()).get("type") != 0) {
            notificationTypeA = NotificationType.MEGA_OFFER;
        } else {
            String str = (String) ((C0873a) remoteMessage.e()).get("data");
            if (str != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    NotificationType.a aVar = NotificationType.f30491b;
                    String string = jSONObject.getString("type");
                    i.d(string, "getString(...)");
                    aVar.getClass();
                    notificationTypeA = NotificationType.a.a(string);
                } catch (JSONException e10) {
                    e.m(e10);
                    notificationTypeA = NotificationType.UNKNOWN;
                }
            } else {
                notificationTypeA = NotificationType.UNKNOWN;
            }
        }
        e.j("MyFirebaseMessagingService", "Notification type: " + notificationTypeA);
        try {
            int iOrdinal = notificationTypeA.ordinal();
            if (iOrdinal != 0) {
                ?? r10 = this.f31200d;
                if (iOrdinal == 1) {
                    a aVarD = d(remoteMessage);
                    if (aVarD != null) {
                        c cVar = (c) r10.getValue();
                        Object systemService = getSystemService("notification");
                        i.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                        cVar.getClass();
                        Intent intent = new Intent(this, (Class<?>) NotificationActivity.class);
                        intent.putExtras(aVarD.f31205d);
                        c.a((NotificationManager) systemService, this, aVarD.f31203b, aVarD.f31204c, PendingIntent.getActivity(this, 0, intent, 1140850688));
                    }
                } else if (iOrdinal != 2) {
                    super.onMessageReceived(remoteMessage);
                } else {
                    JSONObject jSONObjectC = c(remoteMessage);
                    c cVar2 = (c) r10.getValue();
                    Object systemService2 = getSystemService("notification");
                    i.c(systemService2, "null cannot be cast to non-null type android.app.NotificationManager");
                    cVar2.getClass();
                    c.b(jSONObjectC, this, (NotificationManager) systemService2);
                    if (MainActivity.f33531Q) {
                        C2680e.c(C2673a0.f43223b, null, null, new MyFirebaseMessagingService$handleParseMessage$2(this, null), 3);
                    }
                }
            } else {
                e(c(remoteMessage));
            }
        } catch (Throwable th) {
            e.m(th);
        }
    }

    @Override // com.parse.fcm.ParseFirebaseMessagingService, com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(String refreshedToken) {
        i.e(refreshedToken, "refreshedToken");
        Application application = getApplication();
        i.d(application, "getApplication(...)");
        this.f31198b.sendTokenToIntercom(application, refreshedToken);
        super.onNewToken(refreshedToken);
    }
}
