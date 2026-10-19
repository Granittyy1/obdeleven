package p005a4;

import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.PersistedEvents;
import java.util.ArrayList;
import p100i.f;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8026d;

    public /* synthetic */ i(Object obj, int i10, Object obj2) {
        this.f8024b = i10;
        this.f8025c = obj;
        this.f8026d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        switch (this.f8024b) {
            case 0:
                AccessTokenAppIdPair accessTokenAppIdPair = (AccessTokenAppIdPair) this.f8025c;
                u uVar = (u) this.f8026d;
                int i10 = k.f8033a;
                synchronized (k.class) {
                    PersistedEvents persistedEventsA = d.a();
                    synchronized (uVar) {
                        arrayList = uVar.f8046c;
                        uVar.f8046c = new ArrayList();
                    }
                    persistedEventsA.a(accessTokenAppIdPair, arrayList);
                    d.b(persistedEventsA);
                }
                return;
            case 1:
                Runnable runnable = (Runnable) this.f8026d;
                f.c cVar = (f.c) this.f8025c;
                cVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    cVar.a();
                }
            default:
                Runnable runnable2 = (Runnable) this.f8025c;
                p240t6.i iVar = p240t6.i.this;
                try {
                    runnable2.run();
                    iVar.k(null);
                    return;
                } catch (Exception e10) {
                    iVar.l(e10);
                    return;
                }
        }
    }
}
