package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: kotlinx.coroutines.k0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes2.dex */
public class C2700k0 extends JobSupport implements InterfaceC2707q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f43511d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2700k0(InterfaceC2694i0 interfaceC2694i0) {
        super(true);
        boolean z10 = true;
        Z(interfaceC2694i0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = JobSupport.f43185c;
        InterfaceC2703m interfaceC2703m = (InterfaceC2703m) atomicReferenceFieldUpdater.get(this);
        C2704n c2704n = interfaceC2703m instanceof C2704n ? (C2704n) interfaceC2703m : null;
        if (c2704n == null) {
            z10 = false;
            break;
        }
        JobSupport jobSupportK = c2704n.k();
        while (!jobSupportK.Q()) {
            InterfaceC2703m interfaceC2703m2 = (InterfaceC2703m) atomicReferenceFieldUpdater.get(jobSupportK);
            C2704n c2704n2 = interfaceC2703m2 instanceof C2704n ? (C2704n) interfaceC2703m2 : null;
            if (c2704n2 == null) {
                z10 = false;
                break;
            }
            jobSupportK = c2704n2.k();
        }
        this.f43511d = z10;
    }

    @Override // kotlinx.coroutines.JobSupport
    public final boolean Q() {
        return this.f43511d;
    }

    @Override // kotlinx.coroutines.JobSupport
    public final boolean T() {
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC2707q
    public final boolean b() {
        return c0(p293xa.r.f47939a);
    }

    @Override // kotlinx.coroutines.InterfaceC2707q
    public final boolean h(Throwable th) {
        return c0(new C2708s(th, false));
    }
}
