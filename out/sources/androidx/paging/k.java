package androidx.paging;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: InvalidateCallbackTracker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ia.l<T, p293xa.r> f19362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ia.a<Boolean> f19363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantLock f19364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f19365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f19366e;

    public k(Ia.l callbackInvoker) {
        kotlin.jvm.internal.i.e(callbackInvoker, "callbackInvoker");
        this.f19362a = callbackInvoker;
        this.f19363b = null;
        this.f19364c = new ReentrantLock();
        this.f19365d = new ArrayList();
    }

    public final boolean a() {
        if (this.f19366e) {
            return false;
        }
        ReentrantLock reentrantLock = this.f19364c;
        try {
            reentrantLock.lock();
            if (this.f19366e) {
                reentrantLock.unlock();
                return false;
            }
            this.f19366e = true;
            ArrayList arrayList = this.f19365d;
            List listO0 = kotlin.collections.q.o0(arrayList);
            arrayList.clear();
            reentrantLock.unlock();
            Iterator<T> it = listO0.iterator();
            while (it.hasNext()) {
                ((PagingSource$invalidateCallbackTracker$1) this.f19362a).invoke(it.next());
            }
            return true;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
