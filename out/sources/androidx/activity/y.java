package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: OnBackPressedCallback.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<InterfaceC0846c> f8271b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FunctionReferenceImpl f8272c;

    public y(boolean z10) {
        this.f8270a = z10;
    }

    public abstract void b();

    public void c(C0845b backEvent) {
        kotlin.jvm.internal.i.e(backEvent, "backEvent");
    }

    public void d(C0845b backEvent) {
        kotlin.jvm.internal.i.e(backEvent, "backEvent");
    }

    public final void e() {
        Iterator<T> it = this.f8271b.iterator();
        while (it.hasNext()) {
            ((InterfaceC0846c) it.next()).cancel();
        }
    }

    public void a() {
    }
}
