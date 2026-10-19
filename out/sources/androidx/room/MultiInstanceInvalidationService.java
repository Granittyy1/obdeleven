package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: MultiInstanceInvalidationService.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f20057c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f20058d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f20059e = new a();

    /* JADX INFO: compiled from: MultiInstanceInvalidationService.kt */
    public static final class a extends g {
        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }
    }

    /* JADX INFO: compiled from: MultiInstanceInvalidationService.kt */
    public static final class b extends RemoteCallbackList<f> {
        public b() {
        }

        @Override // android.os.RemoteCallbackList
        public final void onCallbackDied(IInterface iInterface, Object cookie) {
            f callback = (f) iInterface;
            kotlin.jvm.internal.i.e(callback, "callback");
            kotlin.jvm.internal.i.e(cookie, "cookie");
            MultiInstanceInvalidationService.this.f20057c.remove((Integer) cookie);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        kotlin.jvm.internal.i.e(intent, "intent");
        return this.f20059e;
    }
}
