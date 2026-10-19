package com.google.firebase.messaging;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.C0873a;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: TopicsSubscriber.java */
/* JADX INFO: loaded from: classes3.dex */
public final class P {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f28312i = TimeUnit.HOURS.toSeconds(8);
    public static final /* synthetic */ int j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f28313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f28314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f28315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f28316d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f28318f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final N f28320h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0873a f28317e = new C0873a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f28319g = false;

    public P(FirebaseMessaging firebaseMessaging, z zVar, N n10, w wVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f28316d = firebaseMessaging;
        this.f28314b = zVar;
        this.f28320h = n10;
        this.f28315c = wVar;
        this.f28313a = context;
        this.f28318f = scheduledThreadPoolExecutor;
    }

    public static <T> void a(p191p5.g<T> gVar) throws IOException {
        try {
            p191p5.j.b(gVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            e = e10;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e11);
            }
            throw ((RuntimeException) cause);
        } catch (TimeoutException e12) {
            e = e12;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    public final void b(String str) throws IOException {
        String strBlockingGetToken = this.f28316d.blockingGetToken();
        w wVar = this.f28315c;
        wVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(wVar.a(wVar.c(bundle, strBlockingGetToken, "/topics/" + str)));
    }

    public final void c(String str) throws IOException {
        String strBlockingGetToken = this.f28316d.blockingGetToken();
        w wVar = this.f28315c;
        wVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(wVar.a(wVar.c(bundle, strBlockingGetToken, "/topics/" + str)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p191p5.B d(M m7) {
        ArrayDeque arrayDeque;
        N n10 = this.f28320h;
        synchronized (n10) {
            J j10 = n10.f28306a;
            String str = m7.f28304c;
            j10.getClass();
            if (!TextUtils.isEmpty(str) && !str.contains(j10.f28287c)) {
                synchronized (j10.f28288d) {
                    if (j10.f28288d.add(str)) {
                        j10.f28289e.execute(new androidx.compose.material.ripple.k(4, j10));
                    }
                }
            }
        }
        p191p5.h hVar = new p191p5.h();
        synchronized (this.f28317e) {
            try {
                String str2 = m7.f28304c;
                if (this.f28317e.containsKey(str2)) {
                    arrayDeque = (ArrayDeque) this.f28317e.get(str2);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.f28317e.put(str2, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(hVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar.f45811a;
    }

    public final synchronized void e(boolean z10) {
        this.f28319g = z10;
    }

    public final void f() {
        boolean z10;
        if (this.f28320h.a() != null) {
            synchronized (this) {
                z10 = this.f28319g;
            }
            if (z10) {
                return;
            }
            h(0L);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x003d  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean g() throws IOException {
        M mA;
        byte b10;
        while (true) {
            synchronized (this) {
                try {
                    mA = this.f28320h.a();
                    if (mA == null) {
                        Log.isLoggable("FirebaseMessaging", 3);
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                String str = mA.f28303b;
                int iHashCode = str.hashCode();
                if (iHashCode != 83) {
                    if (iHashCode == 85 && str.equals("U")) {
                        b10 = 1;
                    } else {
                        b10 = -1;
                    }
                } else if (str.equals("S")) {
                    b10 = 0;
                } else {
                    b10 = -1;
                }
                String str2 = mA.f28302a;
                if (b10 == 0) {
                    b(str2);
                    Log.isLoggable("FirebaseMessaging", 3);
                } else if (b10 != 1) {
                    Log.isLoggable("FirebaseMessaging", 3);
                } else {
                    c(str2);
                    Log.isLoggable("FirebaseMessaging", 3);
                }
                N n10 = this.f28320h;
                synchronized (n10) {
                    J j10 = n10.f28306a;
                    String str3 = mA.f28304c;
                    synchronized (j10.f28288d) {
                        if (j10.f28288d.remove(str3)) {
                            j10.f28289e.execute(new androidx.compose.material.ripple.k(4, j10));
                        }
                    }
                }
                synchronized (this.f28317e) {
                    try {
                        String str4 = mA.f28304c;
                        if (this.f28317e.containsKey(str4)) {
                            ArrayDeque arrayDeque = (ArrayDeque) this.f28317e.get(str4);
                            p191p5.h hVar = (p191p5.h) arrayDeque.poll();
                            if (hVar != null) {
                                hVar.b(null);
                            }
                            if (arrayDeque.isEmpty()) {
                                this.f28317e.remove(str4);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (IOException e10) {
                if ("SERVICE_NOT_AVAILABLE".equals(e10.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e10.getMessage()) || "TOO_MANY_SUBSCRIBERS".equals(e10.getMessage())) {
                    Log.e("FirebaseMessaging", "Topic operation failed: " + e10.getMessage() + ". Will retry Topic operation.");
                } else {
                    if (e10.getMessage() != null) {
                        throw e10;
                    }
                    Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                }
                return false;
            }
        }
    }

    public final void h(long j10) {
        this.f28318f.schedule(new Q(this, this.f28313a, this.f28314b, Math.min(Math.max(30L, 2 * j10), f28312i)), j10, TimeUnit.SECONDS);
        e(true);
    }
}
