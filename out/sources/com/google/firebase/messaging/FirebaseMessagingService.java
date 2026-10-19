package com.google.firebase.messaging;

import R4.C0754a;
import R4.C0756c;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseMessagingService extends AbstractServiceC2046i {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);
    private C0756c rpc;

    private boolean alreadyReceivedMessage(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = recentlyReceivedMessageIds;
        if (queue.contains(str)) {
            Log.isLoggable("FirebaseMessaging", 3);
            return true;
        }
        if (queue.size() >= 10) {
            queue.remove();
        }
        queue.add(str);
        return false;
    }

    private void dispatchMessage(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (J2.l.k(extras)) {
            J2.l lVar = new J2.l(extras);
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new Z4.a("Firebase-Messaging-Network-Io"));
            try {
                if (new C2044g(this, lVar, executorServiceNewSingleThreadExecutor).a()) {
                    executorServiceNewSingleThreadExecutor.shutdown();
                    return;
                } else {
                    executorServiceNewSingleThreadExecutor.shutdown();
                    if (y.d(intent)) {
                        y.c(intent.getExtras(), "_nf");
                    }
                }
            } catch (Throwable th) {
                executorServiceNewSingleThreadExecutor.shutdown();
                throw th;
            }
        }
        onMessageReceived(new F(extras));
    }

    private String getMessageId(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    private C0756c getRpc(Context context) {
        if (this.rpc == null) {
            this.rpc = new C0756c(context.getApplicationContext());
        }
        return this.rpc;
    }

    private void handleMessageIntent(Intent intent) {
        int i10;
        if (!alreadyReceivedMessage(intent.getStringExtra("google.message_id"))) {
            passMessageIntentToSdk(intent);
        }
        C0756c rpc = getRpc(this);
        C0754a c0754a = new C0754a(intent);
        if (rpc.f5272c.a() < 233700000) {
            p191p5.j.d(new IOException("SERVICE_NOT_AVAILABLE"));
            return;
        }
        Bundle bundle = new Bundle();
        Intent intent2 = c0754a.f5265b;
        String stringExtra = intent2.getStringExtra("google.message_id");
        if (stringExtra == null) {
            stringExtra = intent2.getStringExtra("message_id");
        }
        bundle.putString("google.message_id", stringExtra);
        Intent intent3 = c0754a.f5265b;
        Integer numValueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
        if (numValueOf != null) {
            bundle.putInt("google.product_id", numValueOf.intValue());
        }
        R4.A a10 = R4.A.a(rpc.f5271b);
        synchronized (a10) {
            i10 = a10.f5257d;
            a10.f5257d = i10 + 1;
        }
        a10.b(new R4.x(i10, 3, bundle));
    }

    private void passMessageIntentToSdk(Intent intent) {
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        switch (stringExtra) {
            case "deleted_messages":
                onDeletedMessages();
                break;
            case "gcm":
                y.b(intent);
                dispatchMessage(intent);
                break;
            case "send_error":
                onSendError(getMessageId(intent), new SendException(intent.getStringExtra("error")));
                break;
            case "send_event":
                onMessageSent(intent.getStringExtra("google.message_id"));
                break;
        }
    }

    public static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    @Override // com.google.firebase.messaging.AbstractServiceC2046i
    public Intent getStartCommandIntent(Intent intent) {
        return (Intent) I.a().f28284d.poll();
    }

    @Override // com.google.firebase.messaging.AbstractServiceC2046i
    public void handleIntent(Intent intent) {
        String action = intent.getAction();
        if (ACTION_REMOTE_INTENT.equals(action) || ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
            handleMessageIntent(intent);
        } else if (ACTION_NEW_TOKEN.equals(action)) {
            onNewToken(intent.getStringExtra(EXTRA_TOKEN));
        } else {
            intent.getAction();
        }
    }

    public void setRpcForTesting(C0756c c0756c) {
        this.rpc = c0756c;
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(F f10) {
    }

    @Deprecated
    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    @Deprecated
    public void onSendError(String str, Exception exc) {
    }
}
