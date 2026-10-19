package p196pa;

import Fa.d;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.schedulers.ScheduledRunnable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: compiled from: ListCompositeDisposable.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements p148la.b, a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinkedList f45936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f45937c;

    @Override // p196pa.a
    public final boolean a(p148la.b bVar) {
        if (this.f45937c) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f45937c) {
                    return false;
                }
                LinkedList linkedList = this.f45936b;
                if (linkedList != null && linkedList.remove(bVar)) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p196pa.a
    public final boolean b(p148la.b bVar) {
        if (!this.f45937c) {
            synchronized (this) {
                try {
                    if (!this.f45937c) {
                        LinkedList linkedList = this.f45936b;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f45936b = linkedList;
                        }
                        linkedList.add(bVar);
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        bVar.dispose();
        return false;
    }

    @Override // p196pa.a
    public final boolean c(p148la.b bVar) {
        if (!a(bVar)) {
            return false;
        }
        ((ScheduledRunnable) bVar).dispose();
        return true;
    }

    @Override // p148la.b
    public final boolean d() {
        return this.f45937c;
    }

    @Override // p148la.b
    public final void dispose() {
        if (this.f45937c) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f45937c) {
                    return;
                }
                this.f45937c = true;
                LinkedList linkedList = this.f45936b;
                ArrayList arrayList = null;
                this.f45936b = null;
                if (linkedList == null) {
                    return;
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    try {
                        ((p148la.b) it.next()).dispose();
                    } catch (Throwable th) {
                        d.g(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
                if (arrayList != null) {
                    if (arrayList.size() != 1) {
                        throw new CompositeException(arrayList);
                    }
                    throw ExceptionHelper.c((Throwable) arrayList.get(0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
