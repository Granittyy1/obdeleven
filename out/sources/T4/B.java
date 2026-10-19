package T4;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class B implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5820c;

    public /* synthetic */ B(int i10, Object obj) {
        this.f5819b = i10;
        this.f5820c = obj;
    }

    public abstract void a();

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5819b) {
            case 0:
                C c10 = (C) this.f5820c;
                ReentrantLock reentrantLock = c10.f5822b;
                ReentrantLock reentrantLock2 = c10.f5822b;
                reentrantLock.lock();
                try {
                    try {
                        if (!Thread.interrupted()) {
                            b();
                        }
                        break;
                    } catch (RuntimeException e10) {
                        J j = c10.f5821a.f5871g;
                        j.sendMessage(j.obtainMessage(2, e10));
                    }
                    return;
                } finally {
                    reentrantLock2.unlock();
                }
            default:
                D9.i iVar = (D9.i) this.f5820c;
                iVar.getClass();
                D9.i iVarC = D9.i.a.f2886a.c(iVar);
                if (iVarC == null) {
                    iVarC = D9.i.f2885b;
                }
                try {
                    a();
                    return;
                } finally {
                    iVar.b(iVarC);
                }
        }
    }
}
