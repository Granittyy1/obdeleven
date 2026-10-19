package com.braze.push;

import Ia.a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.braze.Constants;
import com.braze.support.BrazeLogger;
import com.braze.support.BundleUtils;
import java.util.Map;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: BrazeHuaweiPushHandler.kt */
/* JADX INFO: loaded from: classes.dex */
public final class BrazeHuaweiPushHandler {
    public static final BrazeHuaweiPushHandler INSTANCE = new BrazeHuaweiPushHandler();

    private BrazeHuaweiPushHandler() {
    }

    public static final boolean handleHmsRemoteMessageData(Context context, final Map<String, String> map) {
        i.e(context, "context");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeHuaweiPushHandler brazeHuaweiPushHandler = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, brazeHuaweiPushHandler, BrazeLogger.Priority.V, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeHuaweiPushHandler.handleHmsRemoteMessageData.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final String invoke() {
                return "Handling Huawei remote message: " + map;
            }
        }, 2, (Object) null);
        if (map == null || map.isEmpty()) {
            BrazeLogger.brazelog$default(brazeLogger, brazeHuaweiPushHandler, BrazeLogger.Priority.W, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeHuaweiPushHandler.handleHmsRemoteMessageData.2
                @Override // Ia.a
                public final String invoke() {
                    return "Remote message data was null. Remote message did not originate from Braze.";
                }
            }, 2, (Object) null);
            return false;
        }
        final Bundle bundle = BundleUtils.toBundle(map);
        if (!bundle.containsKey(Constants.BRAZE_PUSH_BRAZE_KEY) || !"true".equals(bundle.getString(Constants.BRAZE_PUSH_BRAZE_KEY))) {
            BrazeLogger.brazelog$default(brazeLogger, brazeHuaweiPushHandler, BrazeLogger.Priority.I, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeHuaweiPushHandler.handleHmsRemoteMessageData.3
                @Override // Ia.a
                public final String invoke() {
                    return "Remote message did not originate from Braze. Not consuming remote message";
                }
            }, 2, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(brazeLogger, brazeHuaweiPushHandler, BrazeLogger.Priority.I, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeHuaweiPushHandler.handleHmsRemoteMessageData.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final String invoke() {
                return "Got remote message from Huawei: " + bundle;
            }
        }, 2, (Object) null);
        Intent intent = new Intent(BrazePushReceiver.HMS_PUSH_SERVICE_ROUTING_ACTION);
        intent.putExtras(bundle);
        BrazePushReceiver.Companion.handleReceivedIntent$default(BrazePushReceiver.Companion, context, intent, false, 4, null);
        return true;
    }
}
