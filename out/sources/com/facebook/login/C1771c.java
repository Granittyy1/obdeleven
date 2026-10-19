package com.facebook.login;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: com.facebook.login.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CustomTabPrefetchHelper.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1771c extends p198q.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static q.c.a f25107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static androidx.compose.runtime.internal.f f25108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ReentrantLock f25109d = new ReentrantLock();

    /* JADX INFO: renamed from: com.facebook.login.c$a */
    /* JADX INFO: compiled from: CustomTabPrefetchHelper.kt */
    public static final class a {
        public static void a(Uri uri) {
            b();
            C1771c.f25109d.lock();
            androidx.compose.runtime.internal.f fVar = C1771c.f25108c;
            if (fVar != null) {
                try {
                    ((p012b.b) fVar.f13064a).J((p198q.b) fVar.f13065b, uri);
                } catch (RemoteException unused) {
                }
            }
            C1771c.f25109d.unlock();
        }

        public static void b() {
            q.c.a aVar;
            C1771c.f25109d.lock();
            if (C1771c.f25108c == null && (aVar = C1771c.f25107b) != null) {
                p012b.b bVar = (p012b.b) aVar.f5028a;
                p198q.b bVar2 = new p198q.b();
                bVar2.attachInterface(bVar2, "android.support.customtabs.ICustomTabsCallback");
                new Handler(Looper.getMainLooper());
                androidx.compose.runtime.internal.f fVar = null;
                try {
                    if (bVar.s(bVar2)) {
                        fVar = new androidx.compose.runtime.internal.f(bVar, bVar2, (ComponentName) aVar.f5029b);
                    }
                } catch (RemoteException unused) {
                }
                C1771c.f25108c = fVar;
            }
            C1771c.f25109d.unlock();
        }
    }

    @Override // p198q.c
    public final void a(ComponentName name, q.c.a aVar) {
        kotlin.jvm.internal.i.e(name, "name");
        try {
            ((p012b.b) aVar.f5028a).X();
        } catch (RemoteException unused) {
        }
        f25107b = aVar;
        a.b();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        kotlin.jvm.internal.i.e(componentName, "componentName");
    }
}
