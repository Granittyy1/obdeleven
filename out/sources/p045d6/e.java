package p045d6;

import android.os.RemoteException;
import android.util.Log;
import p057e6.g;
import p057e6.h;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p191p5.h f34572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f34573d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, p191p5.h hVar, p191p5.h hVar2) {
        super(hVar);
        this.f34573d = gVar;
        this.f34572c = hVar2;
    }

    @Override // p057e6.h
    public final void a() {
        p191p5.h hVar = this.f34572c;
        g gVar = this.f34573d;
        try {
            gVar.f34578a.f34769m.u(gVar.f34579b, h.a(), new f(gVar, hVar));
        } catch (RemoteException e10) {
            g gVar2 = g.f34577c;
            Object[] objArr = {gVar.f34579b};
            gVar2.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", g.b(gVar2.f34745a, "error requesting in-app review for %s", objArr), e10);
            }
            hVar.c(new RuntimeException(e10));
        }
    }
}
