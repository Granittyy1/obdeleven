package p114j1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import p241t7.b;

/* JADX INFO: compiled from: SystemHandlerWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public final class u implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f41068b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f41069a;

    /* JADX INFO: compiled from: SystemHandlerWrapper.java */
    public static final class a implements g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Message f41070a;

        public final void a() {
            this.f41070a = null;
            ArrayList arrayList = u.f41068b;
            synchronized (arrayList) {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            }
        }

        public final void b() {
            Message message = this.f41070a;
            message.getClass();
            message.sendToTarget();
            a();
        }
    }

    public u(Handler handler) {
        this.f41069a = handler;
    }

    public static a m() {
        a aVar;
        ArrayList arrayList = f41068b;
        synchronized (arrayList) {
            try {
                aVar = arrayList.isEmpty() ? new a() : (a) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    @Override // p114j1.g
    public final boolean a(g.a aVar) {
        a aVar2 = (a) aVar;
        Message message = aVar2.f41070a;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = this.f41069a.sendMessageAtFrontOfQueue(message);
        aVar2.a();
        return zSendMessageAtFrontOfQueue;
    }

    @Override // p114j1.g
    public final boolean b() {
        return this.f41069a.hasMessages(1);
    }

    @Override // p114j1.g
    public final a c(int i10, int i11, int i12) {
        a aVarM = m();
        aVarM.f41070a = this.f41069a.obtainMessage(i10, i11, i12);
        return aVarM;
    }

    @Override // p114j1.g
    public final a d(Object obj) {
        a aVarM = m();
        aVarM.f41070a = this.f41069a.obtainMessage(31, 0, 0, obj);
        return aVarM;
    }

    @Override // p114j1.g
    public final boolean e(Runnable runnable) {
        return this.f41069a.post(runnable);
    }

    @Override // p114j1.g
    public final a f(int i10) {
        a aVarM = m();
        aVarM.f41070a = this.f41069a.obtainMessage(i10);
        return aVarM;
    }

    @Override // p114j1.g
    public final void g() {
        this.f41069a.removeCallbacksAndMessages(null);
    }

    @Override // p114j1.g
    public final boolean h(long j) {
        return this.f41069a.sendEmptyMessageAtTime(2, j);
    }

    @Override // p114j1.g
    public final boolean i(int i10) {
        return this.f41069a.sendEmptyMessage(i10);
    }

    @Override // p114j1.g
    public final void j(int i10) {
        b.e(i10 != 0);
        this.f41069a.removeMessages(i10);
    }

    @Override // p114j1.g
    public final a k(int i10, Object obj) {
        a aVarM = m();
        aVarM.f41070a = this.f41069a.obtainMessage(i10, obj);
        return aVarM;
    }

    @Override // p114j1.g
    public final Looper l() {
        return this.f41069a.getLooper();
    }
}
