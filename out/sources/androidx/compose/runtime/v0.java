package androidx.compose.runtime;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.C2700k0;
import kotlinx.coroutines.C2702l0;
import kotlinx.coroutines.InterfaceC2694i0;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements kotlinx.coroutines.A, t0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1080d f13250f = new C1080d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlin.coroutines.e f13251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EmptyCoroutineContext f13252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v0 f13253d = this;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile kotlin.coroutines.e f13254e;

    public v0(kotlin.coroutines.e eVar, EmptyCoroutineContext emptyCoroutineContext) {
        this.f13251b = eVar;
        this.f13252c = emptyCoroutineContext;
    }

    public final void a() {
        synchronized (this.f13253d) {
            try {
                kotlin.coroutines.e eVar = this.f13254e;
                if (eVar == null) {
                    this.f13254e = f13250f;
                } else {
                    C2702l0.b(eVar, new ForgottenCoroutineScopeException());
                }
                p293xa.r rVar = p293xa.r.f47939a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.t0
    public final void b() {
        a();
    }

    @Override // androidx.compose.runtime.t0
    public final void c() {
        a();
    }

    @Override // kotlinx.coroutines.A
    public final kotlin.coroutines.e getCoroutineContext() {
        kotlin.coroutines.e eVarPlus;
        kotlin.coroutines.e eVar = this.f13254e;
        if (eVar == null || eVar == f13250f) {
            synchronized (this.f13253d) {
                try {
                    eVarPlus = this.f13254e;
                    if (eVarPlus == null) {
                        kotlin.coroutines.e eVar2 = this.f13251b;
                        eVarPlus = eVar2.plus(new C2700k0((InterfaceC2694i0) eVar2.get(InterfaceC2694i0.b.f43449b))).plus(this.f13252c);
                    } else if (eVarPlus == f13250f) {
                        kotlin.coroutines.e eVar3 = this.f13251b;
                        C2700k0 c2700k0 = new C2700k0((InterfaceC2694i0) eVar3.get(InterfaceC2694i0.b.f43449b));
                        c2700k0.E(new ForgottenCoroutineScopeException());
                        eVarPlus = eVar3.plus(c2700k0).plus(this.f13252c);
                    }
                    this.f13254e = eVarPlus;
                    p293xa.r rVar = p293xa.r.f47939a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            eVar = eVarPlus;
        }
        kotlin.jvm.internal.i.b(eVar);
        return eVar;
    }

    @Override // androidx.compose.runtime.t0
    public final void d() {
    }
}
