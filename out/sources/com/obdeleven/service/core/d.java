package com.obdeleven.service.core;

import com.obdeleven.service.exception.CommandException;
import com.parse.boltsinternal.Task;
import com.parse.boltsinternal.TaskCompletionSource;

/* JADX INFO: compiled from: Command.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f29240f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Task<Void> f29241g = Task.forResult(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource<T> f29242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Task<T> f29243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f29244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f29245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d<T>.a f29246e;

    /* JADX INFO: compiled from: Command.java */
    public class a extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f29247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f29248c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f29249d;

        public a(long j) {
            this.f29247b = j;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            this.f29249d = System.currentTimeMillis();
            while (this.f29248c) {
                if (System.currentTimeMillis() - this.f29249d >= this.f29247b) {
                    d.this.f();
                    return;
                }
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public d(String str, boolean z10) {
        this(5000L, str, z10);
    }

    public final Task<T> a() {
        Task<T> task;
        synchronized (f29240f) {
            task = (Task<T>) f29241g.continueWithTask(new p022b9.a(1, this));
            f29241g = task.makeVoid();
        }
        return task;
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return false;
    }

    public void d(byte[] bArr) {
        d<T>.a aVar = this.f29246e;
        synchronized (aVar) {
            aVar.f29249d = System.currentTimeMillis();
        }
        e(bArr);
    }

    public abstract void e(byte[] bArr);

    public void f() {
        O.e.j("BLUETOOTH", "TIME_OUT");
        g(new CommandException(-1));
    }

    public final void g(CommandException commandException) {
        d<T>.a aVar = this.f29246e;
        synchronized (aVar) {
            aVar.f29248c = false;
        }
        if (this.f29243b.isCompleted()) {
            return;
        }
        this.f29242a.setError(commandException);
    }

    public final void h(T t8) {
        d<T>.a aVar = this.f29246e;
        synchronized (aVar) {
            aVar.f29248c = false;
        }
        if (this.f29243b.isCompleted()) {
            return;
        }
        this.f29242a.setResult(t8);
    }

    public final String toString() {
        return this.f29244c;
    }

    public d(long j, String str, boolean z10) {
        TaskCompletionSource<T> taskCompletionSource = new TaskCompletionSource<>();
        this.f29242a = taskCompletionSource;
        this.f29243b = taskCompletionSource.getTask();
        this.f29244c = str;
        this.f29245d = z10;
        this.f29246e = new a(j);
    }
}
