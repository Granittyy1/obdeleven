package com.braze.push;

import Ia.a;
import Q8.d;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.collection.C0873a;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.ReflectionUtils;
import com.google.firebase.messaging.F;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: BrazeFirebaseMessagingService.kt */
/* JADX INFO: loaded from: classes.dex */
public class BrazeFirebaseMessagingService extends FirebaseMessagingService {
    private static final String CONTEXT_ATTACH_METHOD = "attachBaseContext";
    public static final Companion Companion = new Companion(null);
    private static final String FCM_SERVICE_OMR_METHOD = "onMessageReceived";

    /* JADX INFO: compiled from: BrazeFirebaseMessagingService.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final boolean handleBrazeRemoteMessage(Context context, final F remoteMessage) {
            i.e(context, "context");
            i.e(remoteMessage, "remoteMessage");
            if (!isBrazePushNotification(remoteMessage)) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.Priority priority = BrazeLogger.Priority.I;
                BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$handleBrazeRemoteMessage$1
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final String invoke() {
                        return "Remote message did not originate from Braze. Not consuming remote message: " + remoteMessage;
                    }
                }, 2, (Object) null);
                BrazeConfigurationProvider configurationProvider = BrazeInternal.INSTANCE.getConfigurationProvider(context);
                if (!configurationProvider.isFallbackFirebaseMessagingServiceEnabled()) {
                    BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$handleBrazeRemoteMessage$4
                        @Override // Ia.a
                        public final String invoke() {
                            return "FallbackFirebaseMessagingService is not enabled";
                        }
                    }, 3, (Object) null);
                    return false;
                }
                final String fallbackFirebaseMessagingServiceClasspath = configurationProvider.getFallbackFirebaseMessagingServiceClasspath();
                if (fallbackFirebaseMessagingServiceClasspath == null) {
                    BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$handleBrazeRemoteMessage$3
                        @Override // Ia.a
                        public final String invoke() {
                            return "Fallback FCM service enabled but classpath is null. Not routing to any fallback service.";
                        }
                    }, 3, (Object) null);
                    return false;
                }
                BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$handleBrazeRemoteMessage$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final String invoke() {
                        return "Fallback FCM service enabled. Attempting to use fallback class at " + fallbackFirebaseMessagingServiceClasspath;
                    }
                }, 2, (Object) null);
                invokeFallbackFirebaseService$android_sdk_ui_release(fallbackFirebaseMessagingServiceClasspath, remoteMessage, context);
                return false;
            }
            final Map<String, String> mapE = remoteMessage.e();
            i.d(mapE, "remoteMessage.data");
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$handleBrazeRemoteMessage$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Got remote message from FCM: " + mapE;
                }
            }, 2, (Object) null);
            Intent intent = new Intent(BrazePushReceiver.FIREBASE_MESSAGING_SERVICE_ROUTING_ACTION);
            Bundle bundle = new Bundle();
            for (Map.Entry entry : ((C0873a) mapE).entrySet()) {
                final String str = (String) entry.getKey();
                final String str2 = (String) entry.getValue();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$handleBrazeRemoteMessage$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final String invoke() {
                        return "Adding bundle item from FCM remote data with key: " + str + " and value: " + str2;
                    }
                }, 2, (Object) null);
                bundle.putString(str, str2);
            }
            intent.putExtras(bundle);
            BrazePushReceiver.Companion.handleReceivedIntent$default(BrazePushReceiver.Companion, context, intent, false, 4, null);
            return true;
        }

        public final void invokeFallbackFirebaseService$android_sdk_ui_release(final String classpath, F remoteMessage, Context context) {
            i.e(classpath, "classpath");
            i.e(remoteMessage, "remoteMessage");
            i.e(context, "context");
            ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
            Object objConstructObjectQuietly$default = ReflectionUtils.constructObjectQuietly$default(reflectionUtils, classpath, null, null, 6, null);
            if (objConstructObjectQuietly$default == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$invokeFallbackFirebaseService$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final String invoke() {
                        return d.a(new StringBuilder("Fallback firebase messaging service "), classpath, " could not be constructed. Not routing fallback RemoteMessage.");
                    }
                }, 3, (Object) null);
                return;
            }
            Method declaredMethodQuietly = reflectionUtils.getDeclaredMethodQuietly(classpath, BrazeFirebaseMessagingService.CONTEXT_ATTACH_METHOD, Context.class);
            if (declaredMethodQuietly == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$invokeFallbackFirebaseService$4
                    @Override // Ia.a
                    public final String invoke() {
                        return "Could not find attachBaseContext. Not doing anything.";
                    }
                }, 3, (Object) null);
                return;
            }
            declaredMethodQuietly.setAccessible(true);
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$invokeFallbackFirebaseService$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return d.a(new StringBuilder("Attempting to call "), classpath, " attachBaseContext");
                }
            }, 3, (Object) null);
            if (!ReflectionUtils.invokeMethodQuietly(objConstructObjectQuietly$default, declaredMethodQuietly, context).c().booleanValue()) {
                BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$invokeFallbackFirebaseService$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final String invoke() {
                        return d.a(new StringBuilder("Failure invoking "), classpath, ".attachBaseContext. Not doing anything.");
                    }
                }, 3, (Object) null);
                return;
            }
            Method methodQuietly = ReflectionUtils.getMethodQuietly(classpath, BrazeFirebaseMessagingService.FCM_SERVICE_OMR_METHOD, (Class<?>[]) new Class[]{F.class});
            if (methodQuietly == null) {
                BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$invokeFallbackFirebaseService$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final String invoke() {
                        return d.a(new StringBuilder("Fallback firebase messaging service method "), classpath, ".onMessageReceived could not be retrieved. Not routing fallback RemoteMessage.");
                    }
                }, 3, (Object) null);
            } else {
                BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$invokeFallbackFirebaseService$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final String invoke() {
                        return d.a(new StringBuilder("Attempting to invoke firebase messaging fallback service "), classpath, ".onMessageReceived");
                    }
                }, 3, (Object) null);
                ReflectionUtils.invokeMethodQuietly(objConstructObjectQuietly$default, methodQuietly, remoteMessage).c().booleanValue();
            }
        }

        public final boolean isBrazePushNotification(F remoteMessage) {
            i.e(remoteMessage, "remoteMessage");
            Map<String, String> mapE = remoteMessage.e();
            i.d(mapE, "remoteMessage.data");
            return "true".equals(((C0873a) mapE).get(Constants.BRAZE_PUSH_BRAZE_KEY));
        }

        private Companion() {
        }
    }

    public static final boolean handleBrazeRemoteMessage(Context context, F f10) {
        return Companion.handleBrazeRemoteMessage(context, f10);
    }

    public static final boolean isBrazePushNotification(F f10) {
        return Companion.isBrazePushNotification(f10);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(F remoteMessage) {
        i.e(remoteMessage, "remoteMessage");
        super.onMessageReceived(remoteMessage);
        Companion.handleBrazeRemoteMessage(this, remoteMessage);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(final String newToken) {
        i.e(newToken, "newToken");
        super.onNewToken(newToken);
        BrazeInternal.applyPendingRuntimeConfiguration(this);
        BrazeConfigurationProvider configurationProvider = BrazeInternal.INSTANCE.getConfigurationProvider(this);
        Braze.Companion companion = Braze.Companion;
        String configuredApiKey = companion.getConfiguredApiKey(configurationProvider);
        if (configuredApiKey == null || configuredApiKey.length() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeFirebaseMessagingService.onNewToken.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "No configured API key, not registering token in onNewToken. Token: " + newToken;
                }
            }, 2, (Object) null);
        } else if (!configurationProvider.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeFirebaseMessagingService.onNewToken.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Automatic FirebaseMessagingService.OnNewToken() registration disabled, not registering token: " + newToken;
                }
            }, 2, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeFirebaseMessagingService.onNewToken.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Registering Firebase push token in onNewToken. Token: " + newToken;
                }
            }, 2, (Object) null);
            companion.getInstance(this).setRegisteredPushToken(newToken);
        }
    }
}
