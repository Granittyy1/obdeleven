package com.voltasit.obdeleven.data.providers;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: LoggerImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements J8.p {
    @Override // J8.p
    public final void a(String str) {
        boolean zEquals;
        final p313z6.n nVar = p252u6.e.a().f47436a.f48304g.f28085d;
        nVar.getClass();
        String strA = p313z6.d.a(1024, str);
        synchronized (nVar.f48898g) {
            try {
                String reference = nVar.f48898g.getReference();
                if (strA == null) {
                    zEquals = reference == null;
                } else {
                    zEquals = strA.equals(reference);
                }
                if (zEquals) {
                    return;
                }
                nVar.f48898g.set(strA, true);
                nVar.f48893b.a(new Callable() { // from class: z6.m
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws Throwable {
                        boolean z10;
                        String reference2;
                        n nVar2 = nVar;
                        synchronized (nVar2.f48898g) {
                            try {
                                z10 = false;
                                if (nVar2.f48898g.isMarked()) {
                                    reference2 = nVar2.f48898g.getReference();
                                    nVar2.f48898g.set(reference2, false);
                                    z10 = true;
                                } else {
                                    reference2 = null;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z10) {
                            nVar2.f48892a.i(nVar2.f48894c, reference2);
                        }
                        return null;
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J8.p
    public final void b(String str, String message) {
        kotlin.jvm.internal.i.e(message, "message");
        O.e.D(str, message);
    }

    @Override // J8.p
    public final void c(String str, String message) {
        kotlin.jvm.internal.i.e(message, "message");
        O.e.l(str, message);
    }

    @Override // J8.p
    public final void d(Throwable throwable, boolean z10) {
        kotlin.jvm.internal.i.e(throwable, "throwable");
        O.e.m(throwable);
        if (z10) {
            p252u6.e.a().b(throwable);
        }
    }

    @Override // J8.p
    public final void e(String str, String message) {
        kotlin.jvm.internal.i.e(message, "message");
        O.e.j(str, message);
    }

    @Override // J8.p
    public final void f(String str, String message) {
        kotlin.jvm.internal.i.e(message, "message");
        O.e.s(str, message);
    }
}
