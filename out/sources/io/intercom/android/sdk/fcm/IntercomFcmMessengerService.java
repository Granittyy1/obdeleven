package io.intercom.android.sdk.fcm;

import android.app.Application;
import android.text.TextUtils;
import androidx.media3.exoplayer.C1402u;
import com.google.firebase.messaging.F;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.push.IntercomPushClient;
import p191p5.g;

/* JADX INFO: loaded from: classes3.dex */
public class IntercomFcmMessengerService extends FirebaseMessagingService {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f38077b = 0;
    private static final IntercomPushClient pushClient = new IntercomPushClient();
    private static final Twig twig = LumberMill.getLogger();

    public static void initialize(Application application) {
        FirebaseMessaging.getInstance().getToken().c(new C1402u(application));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initialize$0(Application application, g gVar) {
        if (!gVar.o()) {
            twig.w("Fetching FCM registration token failed", gVar.j());
            return;
        }
        String str = (String) gVar.k();
        twig.internal("FCM registration token fetched: " + str);
        pushClient.sendTokenToIntercom(application, str);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(F f10) {
        twig.d("Intercom push received: " + f10.e(), new Object[0]);
        pushClient.handlePush(getApplication(), f10.e());
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        if (TextUtils.isEmpty(str)) {
            twig.e("Intercom push registration failed. Please make sure you have added a google-services.json file", new Object[0]);
        } else {
            pushClient.sendTokenToIntercom(getApplication(), str);
        }
    }
}
