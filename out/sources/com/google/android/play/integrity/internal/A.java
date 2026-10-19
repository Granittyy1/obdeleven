package com.google.android.play.integrity.internal;

import android.os.RemoteException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class A extends w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f27717c;

    public A(d dVar) {
        Objects.requireNonNull(dVar);
        this.f27717c = dVar;
    }

    @Override // com.google.android.play.integrity.internal.w
    public final void b() {
        d dVar = this.f27717c;
        synchronized (dVar.f27740f) {
            try {
                if (dVar.f27744k.get() > 0 && dVar.f27744k.decrementAndGet() > 0) {
                    dVar.f27736b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                if (dVar.f27746m != null) {
                    dVar.f27736b.b("Unbind from service.", new Object[0]);
                    dVar.f27735a.unbindService(dVar.f27745l);
                    dVar.f27741g = false;
                    dVar.f27746m = null;
                    dVar.f27745l = null;
                }
                HashSet hashSet = dVar.f27739e;
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((p191p5.h) it.next()).c(new RemoteException(String.valueOf(dVar.f27737c).concat(" : Binder has died.")));
                }
                hashSet.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
