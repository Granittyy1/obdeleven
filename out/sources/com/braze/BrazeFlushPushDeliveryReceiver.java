package com.braze;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: loaded from: classes.dex */
public class BrazeFlushPushDeliveryReceiver extends BroadcastReceiver {
    public static final a Companion = new a(null);
    public static final String FLUSH_BRAZE_PUSH_DELIVERIES_ACTION = "com.braze.FLUSH_PUSH_DELIVERY";

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Intent f23891b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Intent intent) {
            super(0);
            this.f23891b = intent;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "BrazeFlushPushDeliveryReceiver received intent: " + this.f23891b.getAction();
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        i.e(context, "context");
        i.e(intent, "intent");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new b(intent), 3, (Object) null);
        if (i.a(intent.getAction(), FLUSH_BRAZE_PUSH_DELIVERIES_ACTION)) {
            BrazeInternal.INSTANCE.performPushDeliveryFlush(context);
        }
    }
}
