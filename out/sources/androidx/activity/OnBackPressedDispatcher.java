package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Lifecycle;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f8183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlin.collections.i<y> f8184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y f8185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f8186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f8187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8188f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8189g;

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    public static final class a {
        public static void a(Object dispatcher, Object callback) {
            kotlin.jvm.internal.i.e(dispatcher, "dispatcher");
            kotlin.jvm.internal.i.e(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(0, (OnBackInvokedCallback) callback);
        }

        public static void b(Object dispatcher, Object callback) {
            kotlin.jvm.internal.i.e(dispatcher, "dispatcher");
            kotlin.jvm.internal.i.e(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    public static final class b {
    }

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    public final class c implements androidx.lifecycle.r, InterfaceC0846c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Lifecycle f8190b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final y f8191c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public d f8192d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ OnBackPressedDispatcher f8193e;

        public c(OnBackPressedDispatcher onBackPressedDispatcher, Lifecycle lifecycle, y onBackPressedCallback) {
            kotlin.jvm.internal.i.e(onBackPressedCallback, "onBackPressedCallback");
            this.f8193e = onBackPressedDispatcher;
            this.f8190b = lifecycle;
            this.f8191c = onBackPressedCallback;
            lifecycle.a(this);
        }

        @Override // androidx.activity.InterfaceC0846c
        public final void cancel() {
            this.f8190b.c(this);
            this.f8191c.f8271b.remove(this);
            d dVar = this.f8192d;
            if (dVar != null) {
                dVar.cancel();
            }
            this.f8192d = null;
        }

        @Override // androidx.lifecycle.r
        public final void h(InterfaceC1376t interfaceC1376t, Lifecycle.Event event) {
            if (event != Lifecycle.Event.ON_START) {
                if (event != Lifecycle.Event.ON_STOP) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        cancel();
                        return;
                    }
                    return;
                } else {
                    d dVar = this.f8192d;
                    if (dVar != null) {
                        dVar.cancel();
                        return;
                    }
                    return;
                }
            }
            OnBackPressedDispatcher onBackPressedDispatcher = this.f8193e;
            y onBackPressedCallback = this.f8191c;
            onBackPressedDispatcher.getClass();
            kotlin.jvm.internal.i.e(onBackPressedCallback, "onBackPressedCallback");
            onBackPressedDispatcher.f8184b.addLast(onBackPressedCallback);
            d dVar2 = new d(onBackPressedDispatcher, onBackPressedCallback);
            onBackPressedCallback.f8271b.add(dVar2);
            onBackPressedDispatcher.e();
            onBackPressedCallback.f8272c = new OnBackPressedDispatcher$addCancellableCallback$1(0, onBackPressedDispatcher, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
            this.f8192d = dVar2;
        }
    }

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    public final class d implements InterfaceC0846c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final y f8194b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ OnBackPressedDispatcher f8195c;

        public d(OnBackPressedDispatcher onBackPressedDispatcher, y onBackPressedCallback) {
            kotlin.jvm.internal.i.e(onBackPressedCallback, "onBackPressedCallback");
            this.f8195c = onBackPressedDispatcher;
            this.f8194b = onBackPressedCallback;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [Ia.a, kotlin.jvm.internal.FunctionReferenceImpl] */
        @Override // androidx.activity.InterfaceC0846c
        public final void cancel() {
            OnBackPressedDispatcher onBackPressedDispatcher = this.f8195c;
            kotlin.collections.i<y> iVar = onBackPressedDispatcher.f8184b;
            y yVar = this.f8194b;
            iVar.remove(yVar);
            if (kotlin.jvm.internal.i.a(onBackPressedDispatcher.f8185c, yVar)) {
                yVar.a();
                onBackPressedDispatcher.f8185c = null;
            }
            yVar.f8271b.remove(this);
            ?? r10 = yVar.f8272c;
            if (r10 != 0) {
                r10.invoke();
            }
            yVar.f8272c = null;
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        OnBackInvokedCallback a10;
        this.f8183a = runnable;
        this.f8184b = new kotlin.collections.i<>();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            if (i10 >= 34) {
                a10 = new A(new Ia.l<C0845b, p293xa.r>() { // from class: androidx.activity.OnBackPressedDispatcher.1
                    @Override // Ia.l
                    public final p293xa.r invoke(C0845b c0845b) {
                        y yVarPrevious;
                        C0845b backEvent = c0845b;
                        kotlin.jvm.internal.i.e(backEvent, "backEvent");
                        OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                        kotlin.collections.i<y> iVar = onBackPressedDispatcher.f8184b;
                        ListIterator<y> listIterator = iVar.listIterator(iVar.size());
                        do {
                            if (!listIterator.hasPrevious()) {
                                yVarPrevious = null;
                                break;
                            }
                            yVarPrevious = listIterator.previous();
                        } while (!yVarPrevious.f8270a);
                        y yVar = yVarPrevious;
                        if (onBackPressedDispatcher.f8185c != null) {
                            onBackPressedDispatcher.b();
                        }
                        onBackPressedDispatcher.f8185c = yVar;
                        if (yVar != null) {
                            yVar.d(backEvent);
                        }
                        return p293xa.r.f47939a;
                    }
                }, new Ia.l<C0845b, p293xa.r>() { // from class: androidx.activity.OnBackPressedDispatcher.2
                    @Override // Ia.l
                    public final p293xa.r invoke(C0845b c0845b) {
                        y yVarPrevious;
                        C0845b backEvent = c0845b;
                        kotlin.jvm.internal.i.e(backEvent, "backEvent");
                        OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                        y yVar = onBackPressedDispatcher.f8185c;
                        if (yVar == null) {
                            kotlin.collections.i<y> iVar = onBackPressedDispatcher.f8184b;
                            ListIterator<y> listIterator = iVar.listIterator(iVar.size());
                            do {
                                if (!listIterator.hasPrevious()) {
                                    yVarPrevious = null;
                                    break;
                                }
                                yVarPrevious = listIterator.previous();
                            } while (!yVarPrevious.f8270a);
                            yVar = yVarPrevious;
                        }
                        if (yVar != null) {
                            yVar.c(backEvent);
                        }
                        return p293xa.r.f47939a;
                    }
                }, new Ia.a<p293xa.r>() { // from class: androidx.activity.OnBackPressedDispatcher.3
                    @Override // Ia.a
                    public final p293xa.r invoke() {
                        OnBackPressedDispatcher.this.c();
                        return p293xa.r.f47939a;
                    }
                }, new Ia.a<p293xa.r>() { // from class: androidx.activity.OnBackPressedDispatcher.4
                    @Override // Ia.a
                    public final p293xa.r invoke() {
                        OnBackPressedDispatcher.this.b();
                        return p293xa.r.f47939a;
                    }
                });
            } else {
                final Ia.a<p293xa.r> aVar = new Ia.a<p293xa.r>() { // from class: androidx.activity.OnBackPressedDispatcher.5
                    @Override // Ia.a
                    public final p293xa.r invoke() {
                        OnBackPressedDispatcher.this.c();
                        return p293xa.r.f47939a;
                    }
                };
                a10 = new OnBackInvokedCallback() { // from class: androidx.activity.z
                    public final void onBackInvoked() {
                        aVar.invoke();
                    }
                };
            }
            this.f8186d = a10;
        }
    }

    public final void a(InterfaceC1376t owner, y onBackPressedCallback) {
        kotlin.jvm.internal.i.e(owner, "owner");
        kotlin.jvm.internal.i.e(onBackPressedCallback, "onBackPressedCallback");
        Lifecycle lifecycle = owner.getLifecycle();
        if (lifecycle.b() == Lifecycle.State.f17749b) {
            return;
        }
        onBackPressedCallback.f8271b.add(new c(this, lifecycle, onBackPressedCallback));
        e();
        onBackPressedCallback.f8272c = new OnBackPressedDispatcher$addCallback$1(0, this, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
    }

    public final void b() {
        y yVarPrevious;
        y yVar = this.f8185c;
        if (yVar == null) {
            kotlin.collections.i<y> iVar = this.f8184b;
            ListIterator<y> listIterator = iVar.listIterator(iVar.size());
            do {
                if (!listIterator.hasPrevious()) {
                    yVarPrevious = null;
                    break;
                }
                yVarPrevious = listIterator.previous();
            } while (!yVarPrevious.f8270a);
            yVar = yVarPrevious;
        }
        this.f8185c = null;
        if (yVar != null) {
            yVar.a();
        }
    }

    public final void c() {
        y yVarPrevious;
        y yVar = this.f8185c;
        if (yVar == null) {
            kotlin.collections.i<y> iVar = this.f8184b;
            ListIterator<y> listIterator = iVar.listIterator(iVar.e());
            do {
                if (!listIterator.hasPrevious()) {
                    yVarPrevious = null;
                    break;
                }
                yVarPrevious = listIterator.previous();
            } while (!yVarPrevious.f8270a);
            yVar = yVarPrevious;
        }
        this.f8185c = null;
        if (yVar != null) {
            yVar.b();
            return;
        }
        Runnable runnable = this.f8183a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void d(boolean z10) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f8187e;
        OnBackInvokedCallback onBackInvokedCallback = this.f8186d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z10 && !this.f8188f) {
            a.a(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f8188f = true;
        } else {
            if (z10 || !this.f8188f) {
                return;
            }
            a.b(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f8188f = false;
        }
    }

    public final void e() {
        boolean z10 = this.f8189g;
        boolean z11 = false;
        kotlin.collections.i<y> iVar = this.f8184b;
        if (iVar == null || !iVar.isEmpty()) {
            Iterator<y> it = iVar.iterator();
            while (it.hasNext()) {
                if (it.next().f8270a) {
                    z11 = true;
                    break;
                }
            }
        }
        this.f8189g = z11;
        if (z11 == z10 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z11);
    }

    public OnBackPressedDispatcher() {
        this(null);
    }
}
