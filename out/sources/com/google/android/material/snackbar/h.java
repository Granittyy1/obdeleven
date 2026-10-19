package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: SnackbarManager.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static h f27441e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f27442a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f27443b = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f27444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f27445d;

    /* JADX INFO: compiled from: SnackbarManager.java */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            h hVar = h.this;
            c cVar = (c) message.obj;
            synchronized (hVar.f27442a) {
                try {
                    if (hVar.f27444c == cVar || hVar.f27445d == cVar) {
                        hVar.a(cVar, 2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: SnackbarManager.java */
    public interface b {
        void a();

        void b(int i10);
    }

    /* JADX INFO: compiled from: SnackbarManager.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<b> f27447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f27448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f27449c;

        public c(int i10, BaseTransientBottomBar.c cVar) {
            this.f27447a = new WeakReference<>(cVar);
            this.f27448b = i10;
        }
    }

    public static h b() {
        if (f27441e == null) {
            f27441e = new h();
        }
        return f27441e;
    }

    public final boolean a(c cVar, int i10) {
        b bVar = cVar.f27447a.get();
        if (bVar == null) {
            return false;
        }
        this.f27443b.removeCallbacksAndMessages(cVar);
        bVar.b(i10);
        return true;
    }

    public final boolean c(b bVar) {
        c cVar = this.f27444c;
        return (cVar == null || bVar == null || cVar.f27447a.get() != bVar) ? false : true;
    }

    public final void d(BaseTransientBottomBar.c cVar) {
        synchronized (this.f27442a) {
            try {
                if (c(cVar)) {
                    c cVar2 = this.f27444c;
                    if (!cVar2.f27449c) {
                        cVar2.f27449c = true;
                        this.f27443b.removeCallbacksAndMessages(cVar2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(BaseTransientBottomBar.c cVar) {
        synchronized (this.f27442a) {
            try {
                if (c(cVar)) {
                    c cVar2 = this.f27444c;
                    if (cVar2.f27449c) {
                        cVar2.f27449c = false;
                        f(cVar2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(c cVar) {
        int i10 = cVar.f27448b;
        if (i10 == -2) {
            return;
        }
        if (i10 <= 0) {
            i10 = i10 == -1 ? 1500 : 2750;
        }
        Handler handler = this.f27443b;
        handler.removeCallbacksAndMessages(cVar);
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i10);
    }
}
