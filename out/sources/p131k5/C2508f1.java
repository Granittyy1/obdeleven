package p131k5;

import U4.C0804l;
import android.os.Process;
import androidx.compose.ui.text.font.s;
import java.util.AbstractQueue;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: renamed from: k5.f1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2508f1 extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f42162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractQueue f42163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f42164d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2493c1 f42165e;

    /* JADX WARN: Multi-variable type inference failed */
    public C2508f1(C2493c1 c2493c1, String str, BlockingQueue<C2513g1<?>> blockingQueue) {
        this.f42165e = c2493c1;
        C0804l.h(blockingQueue);
        this.f42162b = new Object();
        this.f42163c = (AbstractQueue) blockingQueue;
        setName(str);
    }

    public final void a(InterruptedException interruptedException) {
        B0 b0D = this.f42165e.d();
        b0D.f41715i.b(interruptedException, s.b(getName(), " was interrupted"));
    }

    public final void b() {
        synchronized (this.f42165e.f42116i) {
            try {
                if (!this.f42164d) {
                    this.f42165e.j.release();
                    this.f42165e.f42116i.notifyAll();
                    C2493c1 c2493c1 = this.f42165e;
                    if (this == c2493c1.f42110c) {
                        c2493c1.f42110c = null;
                    } else if (this == c2493c1.f42111d) {
                        c2493c1.f42111d = null;
                    } else {
                        c2493c1.d().f41712f.c("Current scheduler thread is neither worker nor network");
                    }
                    this.f42164d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z10 = false;
        while (!z10) {
            try {
                this.f42165e.j.acquire();
                z10 = true;
            } catch (InterruptedException e10) {
                a(e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                C2513g1 c2513g1 = (C2513g1) this.f42163c.poll();
                if (c2513g1 != null) {
                    Process.setThreadPriority(c2513g1.f42177c ? threadPriority : 10);
                    c2513g1.run();
                } else {
                    synchronized (this.f42162b) {
                        if (this.f42163c.peek() == null) {
                            this.f42165e.getClass();
                            try {
                                this.f42162b.wait(30000L);
                            } catch (InterruptedException e11) {
                                a(e11);
                            }
                        }
                    }
                    synchronized (this.f42165e.f42116i) {
                        if (this.f42163c.peek() == null) {
                            b();
                            b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            b();
            throw th;
        }
    }
}
