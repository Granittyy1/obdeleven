package p184ob;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import p172nb.b;
import p293xa.r;

/* JADX INFO: compiled from: TaskQueue.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f45254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f45256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f45257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f45258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f45259f;

    public c(d taskRunner, String name) {
        i.e(taskRunner, "taskRunner");
        i.e(name, "name");
        this.f45254a = taskRunner;
        this.f45255b = name;
        this.f45258e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = b.f45026a;
        synchronized (this.f45254a) {
            try {
                if (b()) {
                    this.f45254a.d(this);
                }
                r rVar = r.f47939a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        a aVar = this.f45257d;
        if (aVar != null && aVar.f45250b) {
            this.f45259f = true;
        }
        ArrayList arrayList = this.f45258e;
        boolean z10 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f45250b) {
                a aVar2 = (a) arrayList.get(size);
                if (d.f45261i.isLoggable(Level.FINE)) {
                    h.c(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z10 = true;
            }
        }
        return z10;
    }

    public final void c(a task, long j) {
        i.e(task, "task");
        synchronized (this.f45254a) {
            if (!this.f45256c) {
                if (e(task, j, false)) {
                    this.f45254a.d(this);
                }
                r rVar = r.f47939a;
            } else if (task.f45250b) {
                if (d.f45261i.isLoggable(Level.FINE)) {
                    h.c(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (d.f45261i.isLoggable(Level.FINE)) {
                    h.c(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean e(a task, long j, boolean z10) {
        i.e(task, "task");
        c cVar = task.f45251c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            task.f45251c = this;
        }
        d.a aVar = this.f45254a.f45262a;
        long jNanoTime = System.nanoTime();
        long j10 = jNanoTime + j;
        ArrayList arrayList = this.f45258e;
        int iIndexOf = arrayList.indexOf(task);
        if (iIndexOf != -1) {
            if (task.f45252d <= j10) {
                if (d.f45261i.isLoggable(Level.FINE)) {
                    h.c(task, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(iIndexOf);
        }
        task.f45252d = j10;
        if (d.f45261i.isLoggable(Level.FINE)) {
            h.c(task, this, z10 ? "run again after ".concat(h.e(j10 - jNanoTime)) : "scheduled after ".concat(h.e(j10 - jNanoTime)));
        }
        Iterator it = arrayList.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((a) it.next()).f45252d - jNanoTime > j) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = arrayList.size();
        }
        arrayList.add(size, task);
        return size == 0;
    }

    public final void f() {
        byte[] bArr = b.f45026a;
        synchronized (this.f45254a) {
            try {
                this.f45256c = true;
                if (b()) {
                    this.f45254a.d(this);
                }
                r rVar = r.f47939a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        return this.f45255b;
    }
}
