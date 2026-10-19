package p057e6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IBinder f34753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f34754d;

    public n(p pVar, IBinder iBinder) {
        this.f34754d = pVar;
        this.f34753c = iBinder;
    }

    @Override // p057e6.h
    public final void a() {
        e cVar;
        p pVar = this.f34754d;
        q qVar = pVar.f34756b;
        int i10 = d.f34744c;
        IBinder iBinder = this.f34753c;
        if (iBinder == null) {
            cVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
            cVar = iInterfaceQueryLocalInterface instanceof e ? (e) iInterfaceQueryLocalInterface : new c(iBinder);
        }
        qVar.f34769m = cVar;
        q qVar2 = pVar.f34756b;
        qVar2.f34759b.a("linkToDeath", new Object[0]);
        try {
            qVar2.f34769m.asBinder().linkToDeath(qVar2.j, 0);
        } catch (RemoteException e10) {
            Object[] objArr = new Object[0];
            g gVar = qVar2.f34759b;
            gVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", g.b(gVar.f34745a, "linkToDeath failed", objArr), e10);
            }
        }
        qVar2.f34764g = false;
        Iterator it = qVar2.f34761d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        qVar2.f34761d.clear();
    }
}
