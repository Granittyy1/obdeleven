package androidx.lifecycle;

import android.os.Handler;

/* JADX INFO: compiled from: ServiceLifecycleDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1378v f17784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f17785b = new Handler();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f17786c;

    /* JADX INFO: compiled from: ServiceLifecycleDispatcher.kt */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C1378v f17787b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Lifecycle.Event f17788c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f17789d;

        public a(C1378v registry, Lifecycle.Event event) {
            kotlin.jvm.internal.i.e(registry, "registry");
            kotlin.jvm.internal.i.e(event, "event");
            this.f17787b = registry;
            this.f17788c = event;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f17789d) {
                return;
            }
            this.f17787b.f(this.f17788c);
            this.f17789d = true;
        }
    }

    public U(ServiceC1380x serviceC1380x) {
        this.f17784a = new C1378v(serviceC1380x);
    }

    public final void a(Lifecycle.Event event) {
        a aVar = this.f17786c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.f17784a, event);
        this.f17786c = aVar2;
        this.f17785b.postAtFrontOfQueue(aVar2);
    }
}
