package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2033a extends w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IBinder f27718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f27719d;

    public C2033a(c cVar, IBinder iBinder) {
        this.f27718c = iBinder;
        Objects.requireNonNull(cVar);
        this.f27719d = cVar;
    }

    @Override // com.google.android.play.integrity.internal.w
    public final void b() {
        s qVar;
        d dVar = this.f27719d.f27733b;
        dVar.f27742h.getClass();
        int i10 = r.f27759c;
        IBinder iBinder = this.f27718c;
        if (iBinder == null) {
            qVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
            qVar = iInterfaceQueryLocalInterface instanceof s ? (s) iInterfaceQueryLocalInterface : new q(iBinder);
        }
        dVar.f27746m = qVar;
        v vVar = dVar.f27736b;
        vVar.b("linkToDeath", new Object[0]);
        try {
            dVar.f27746m.asBinder().linkToDeath(dVar.j, 0);
        } catch (RemoteException e10) {
            vVar.a(e10, "linkToDeath failed", new Object[0]);
        }
        dVar.f27741g = false;
        ArrayList arrayList = dVar.f27738d;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        arrayList.clear();
    }
}
