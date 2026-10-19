package p100i;

import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.C0874b;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import p005a4.i;
import p271w0.g;

/* JADX INFO: compiled from: AppCompatDelegate.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f36284b = new c(new d());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f36285c = -100;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static g f36286d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static g f36287e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Boolean f36288f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f36289g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0874b<WeakReference<f>> f36290h = new C0874b<>(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f36291i = new Object();
    public static final Object j = new Object();

    /* JADX INFO: compiled from: AppCompatDelegate.java */
    public static class a {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* JADX INFO: compiled from: AppCompatDelegate.java */
    public static class b {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    /* JADX INFO: compiled from: AppCompatDelegate.java */
    public static class c implements Executor {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f36292b = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayDeque f36293c = new ArrayDeque();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final d f36294d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Runnable f36295e;

        public c(d dVar) {
            this.f36294d = dVar;
        }

        public final void a() {
            synchronized (this.f36292b) {
                try {
                    Runnable runnable = (Runnable) this.f36293c.poll();
                    this.f36295e = runnable;
                    if (runnable != null) {
                        this.f36294d.execute(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            synchronized (this.f36292b) {
                try {
                    this.f36293c.add(new i(this, 1, runnable));
                    if (this.f36295e == null) {
                        a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: compiled from: AppCompatDelegate.java */
    public static class d implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    public static boolean m(Context context) {
        if (f36288f == null) {
            try {
                int i10 = p.f36403b;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) p.class), p.a.a() | 128).metaData;
                if (bundle != null) {
                    f36288f = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f36288f = Boolean.FALSE;
            }
        }
        return f36288f.booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void u(g gVar) {
        synchronized (f36291i) {
            try {
                C0874b<WeakReference<f>> c0874b = f36290h;
                c0874b.getClass();
                C0874b.a aVar = new C0874b.a();
                while (aVar.hasNext()) {
                    f fVar = (f) ((WeakReference) aVar.next()).get();
                    if (fVar == gVar || fVar == null) {
                        aVar.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void B(CharSequence charSequence);

    public abstract p138l.a C(p138l.a.InterfaceC0502a interfaceC0502a);

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public abstract <T extends View> T e(int i10);

    public Context f() {
        return null;
    }

    public abstract g.b g();

    public int h() {
        return -100;
    }

    public abstract MenuInflater i();

    public abstract p100i.a j();

    public abstract void k();

    public abstract void l();

    public abstract void n(Configuration configuration);

    public abstract void o();

    public abstract void p();

    public abstract void q();

    public abstract void r();

    public abstract void s();

    public abstract void t();

    public abstract boolean v(int i10);

    public abstract void w(int i10);

    public abstract void x(View view);

    public abstract void y(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void z(Toolbar toolbar);

    public void A(int i10) {
    }

    public Context d(Context context) {
        return context;
    }
}
