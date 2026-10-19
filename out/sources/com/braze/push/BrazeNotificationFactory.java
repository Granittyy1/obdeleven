package com.braze.push;

import Ia.a;
import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import androidx.core.app.v;
import com.braze.IBrazeNotificationFactory;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: BrazeNotificationFactory.kt */
/* JADX INFO: loaded from: classes.dex */
public class BrazeNotificationFactory implements IBrazeNotificationFactory {
    public static final Companion Companion = new Companion(null);
    private static final BrazeNotificationFactory internalInstance = new BrazeNotificationFactory();

    /* JADX INFO: compiled from: BrazeNotificationFactory.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final BrazeNotificationFactory getInstance() {
            return BrazeNotificationFactory.internalInstance;
        }

        public final v populateNotificationBuilder(final BrazeNotificationPayload payload) {
            i.e(payload, "payload");
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.V, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationFactory$Companion$populateNotificationBuilder$1
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Using BrazeNotificationPayload: " + payload;
                }
            }, 2, (Object) null);
            Context context = payload.getContext();
            if (context == null) {
                BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationFactory$Companion$populateNotificationBuilder$2
                    @Override // Ia.a
                    public final String invoke() {
                        return "BrazeNotificationPayload has null context. Not creating notification";
                    }
                }, 3, (Object) null);
                return null;
            }
            BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
            if (configurationProvider == null) {
                BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationFactory$Companion$populateNotificationBuilder$3
                    @Override // Ia.a
                    public final String invoke() {
                        return "BrazeNotificationPayload has null app configuration provider. Not creating notification";
                    }
                }, 3, (Object) null);
                return null;
            }
            Bundle notificationExtras = payload.getNotificationExtras();
            BrazeNotificationUtils.prefetchBitmapsIfNewlyReceivedStoryPush(payload);
            v vVar = new v(context, BrazeNotificationUtils.getOrCreateNotificationChannelId(payload));
            vVar.d(16, true);
            BrazeNotificationUtils.setTitleIfPresent(vVar, payload);
            BrazeNotificationUtils.setContentIfPresent(vVar, payload);
            BrazeNotificationUtils.setTickerIfPresent(vVar, payload);
            BrazeNotificationUtils.setSetShowWhen(vVar, payload);
            BrazeNotificationUtils.setContentIntentIfPresent(context, vVar, notificationExtras);
            BrazeNotificationUtils.setDeleteIntent(context, vVar, notificationExtras);
            BrazeNotificationUtils.setSmallIcon(configurationProvider, vVar);
            BrazeNotificationUtils.setLargeIconIfPresentAndSupported(vVar, payload);
            BrazeNotificationUtils.setSoundIfPresentAndSupported(vVar, payload);
            BrazeNotificationUtils.setSummaryTextIfPresentAndSupported(vVar, payload);
            BrazeNotificationUtils.setPriorityIfPresentAndSupported(vVar, payload);
            BrazeNotificationStyleFactory.Companion.setStyleIfSupported(vVar, payload);
            BrazeNotificationActionUtils.addNotificationActions(vVar, payload);
            BrazeNotificationUtils.setAccentColorIfPresentAndSupported(vVar, payload);
            BrazeNotificationUtils.setCategoryIfPresentAndSupported(vVar, payload);
            BrazeNotificationUtils.setVisibilityIfPresentAndSupported(vVar, payload);
            BrazeNotificationUtils.setPublicVersionIfPresentAndSupported(vVar, payload);
            BrazeNotificationUtils.setNotificationBadgeNumberIfPresent(vVar, payload);
            return vVar;
        }

        private Companion() {
        }

        public static /* synthetic */ void getInstance$annotations() {
        }
    }

    public static final BrazeNotificationFactory getInstance() {
        return Companion.getInstance();
    }

    public static final v populateNotificationBuilder(BrazeNotificationPayload brazeNotificationPayload) {
        return Companion.populateNotificationBuilder(brazeNotificationPayload);
    }

    @Override // com.braze.IBrazeNotificationFactory
    public Notification createNotification(BrazeNotificationPayload payload) {
        i.e(payload, "payload");
        v vVarPopulateNotificationBuilder = Companion.populateNotificationBuilder(payload);
        if (vVarPopulateNotificationBuilder != null) {
            return vVarPopulateNotificationBuilder.a();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationFactory.createNotification.1
            @Override // Ia.a
            public final String invoke() {
                return "Notification could not be built. Returning null as created notification";
            }
        }, 2, (Object) null);
        return null;
    }

    public final v populateNotificationBuilder(BrazeConfigurationProvider brazeConfigurationProvider, Context context, Bundle bundle, Bundle bundle2) {
        return Companion.populateNotificationBuilder(new BrazeNotificationPayload(bundle, bundle2, context, brazeConfigurationProvider));
    }

    public final Notification createNotification(BrazeConfigurationProvider brazeConfigurationProvider, Context context, Bundle bundle, Bundle bundle2) {
        return createNotification(new BrazeNotificationPayload(bundle, bundle2, context, brazeConfigurationProvider));
    }
}
