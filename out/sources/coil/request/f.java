package coil.request;

import androidx.lifecycle.InterfaceC1363f;
import androidx.lifecycle.InterfaceC1375s;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: compiled from: GlobalLifecycle.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f extends Lifecycle {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f23037b = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f23038c = new a();

    /* JADX INFO: compiled from: GlobalLifecycle.kt */
    public static final class a implements InterfaceC1376t {
        @Override // androidx.lifecycle.InterfaceC1376t
        public final Lifecycle getLifecycle() {
            return f.f23037b;
        }
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void a(InterfaceC1375s interfaceC1375s) {
        if (!(interfaceC1375s instanceof InterfaceC1363f)) {
            throw new IllegalArgumentException((interfaceC1375s + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        InterfaceC1363f interfaceC1363f = (InterfaceC1363f) interfaceC1375s;
        interfaceC1363f.getClass();
        a owner = f23038c;
        kotlin.jvm.internal.i.e(owner, "owner");
        interfaceC1363f.x(owner);
        interfaceC1363f.c(owner);
    }

    @Override // androidx.lifecycle.Lifecycle
    public final Lifecycle.State b() {
        return Lifecycle.State.f17753f;
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void c(InterfaceC1375s interfaceC1375s) {
    }
}
