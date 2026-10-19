package R4;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: R4.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0755b extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SoftReference f5266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static SoftReference f5267b;

    public abstract int a(Context context, C0754a c0754a);

    public final int c(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            b(extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        ExecutorService executorService;
        if (intent == null) {
            return;
        }
        final boolean zIsOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        synchronized (AbstractC0755b.class) {
            try {
                SoftReference softReference = f5266a;
                ExecutorService executorServiceUnconfigurableExecutorService = softReference != null ? (ExecutorService) softReference.get() : null;
                if (executorServiceUnconfigurableExecutorService == null) {
                    executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new Z4.a("firebase-iid-executor")));
                    f5266a = new SoftReference(executorServiceUnconfigurableExecutorService);
                }
                executorService = executorServiceUnconfigurableExecutorService;
            } catch (Throwable th) {
                throw th;
            }
        }
        executorService.execute(new Runnable() { // from class: R4.o
            @Override // java.lang.Runnable
            public final void run() {
                Executor executorUnconfigurableExecutorService;
                int iC;
                AbstractC0755b abstractC0755b = this.f5290b;
                Intent intent2 = intent;
                final Context context2 = context;
                boolean z10 = zIsOrderedBroadcast;
                BroadcastReceiver.PendingResult pendingResult = pendingResultGoAsync;
                abstractC0755b.getClass();
                try {
                    Parcelable parcelableExtra = intent2.getParcelableExtra("wrapped_intent");
                    Intent intent3 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent3 != null) {
                        iC = abstractC0755b.c(context2, intent3);
                    } else if (intent2.getExtras() == null) {
                        iC = 500;
                    } else {
                        final C0754a c0754a = new C0754a(intent2);
                        final CountDownLatch countDownLatch = new CountDownLatch(1);
                        synchronized (AbstractC0755b.class) {
                            try {
                                SoftReference softReference2 = AbstractC0755b.f5267b;
                                executorUnconfigurableExecutorService = softReference2 != null ? (Executor) softReference2.get() : null;
                                if (executorUnconfigurableExecutorService == null) {
                                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new Z4.a("pscm-ack-executor"));
                                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                                    executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                    AbstractC0755b.f5267b = new SoftReference(executorUnconfigurableExecutorService);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        executorUnconfigurableExecutorService.execute(new Runnable() { // from class: R4.n
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i10;
                                p191p5.B b10;
                                C0754a c0754a2 = c0754a;
                                Intent intent4 = c0754a2.f5265b;
                                String stringExtra = intent4.getStringExtra("google.message_id");
                                if (stringExtra == null) {
                                    stringExtra = intent4.getStringExtra("message_id");
                                }
                                if (TextUtils.isEmpty(stringExtra)) {
                                    b10 = p191p5.j.e(null);
                                } else {
                                    Bundle bundle = new Bundle();
                                    Intent intent5 = c0754a2.f5265b;
                                    String stringExtra2 = intent5.getStringExtra("google.message_id");
                                    if (stringExtra2 == null) {
                                        stringExtra2 = intent5.getStringExtra("message_id");
                                    }
                                    bundle.putString("google.message_id", stringExtra2);
                                    Intent intent6 = c0754a2.f5265b;
                                    Integer numValueOf = intent6.hasExtra("google.product_id") ? Integer.valueOf(intent6.getIntExtra("google.product_id", 0)) : null;
                                    if (numValueOf != null) {
                                        bundle.putInt("google.product_id", numValueOf.intValue());
                                    }
                                    bundle.putBoolean("supports_message_handled", true);
                                    A a10 = A.a(context2);
                                    synchronized (a10) {
                                        i10 = a10.f5257d;
                                        a10.f5257d = i10 + 1;
                                    }
                                    b10 = a10.b(new x(i10, 2, bundle));
                                }
                                b10.b(m.f5286b, new D3.l(2, countDownLatch));
                            }
                        });
                        int iA = abstractC0755b.a(context2, c0754a);
                        try {
                            countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
                        } catch (InterruptedException e10) {
                            "Message ack failed: ".concat(e10.toString());
                        }
                        iC = iA;
                    }
                    if (z10 && pendingResult != null) {
                        pendingResult.setResultCode(iC);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                } catch (Throwable th3) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th3;
                }
            }
        });
    }

    public void b(Bundle bundle) {
    }
}
