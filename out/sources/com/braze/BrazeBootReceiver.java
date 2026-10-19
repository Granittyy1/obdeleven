package com.braze;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import bo.app.C1473k;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: loaded from: classes.dex */
public class BrazeBootReceiver extends BroadcastReceiver {
    private static final String BOOT_COMPLETE_ACTION = "android.intent.action.BOOT_COMPLETED";
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Intent f23888b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Intent intent) {
            super(0);
            this.f23888b = intent;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Received broadcast message. Message: " + this.f23888b;
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f23889b = new c();

        public c() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Boot complete intent received. Initializing.";
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Intent f23890b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Intent intent) {
            super(0);
            this.f23890b = intent;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Unknown intent " + this.f23890b + " received. Doing nothing.";
        }
    }

    public final boolean handleIncomingIntent(Context context, Intent intent) {
        i.e(context, "context");
        i.e(intent, "intent");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.I;
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new b(intent), 2, (Object) null);
        if (!BOOT_COMPLETE_ACTION.equals(intent.getAction())) {
            BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, new d(intent), 2, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, c.f23889b, 2, (Object) null);
        new C1473k().a(context);
        Braze.Companion.getInstance(context);
        return true;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        i.e(context, "context");
        i.e(intent, "intent");
        handleIncomingIntent(context, intent);
    }
}
