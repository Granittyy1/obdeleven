package p252u6;

import com.google.firebase.crashlytics.internal.common.a;
import p302y6.C2818n;
import p302y6.CallableC2815k;
import p302y6.E;
import p302y6.x;

/* JADX INFO: compiled from: FirebaseCrashlytics.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f47436a;

    public e(E e10) {
        this.f47436a = e10;
    }

    public static e a() {
        e eVar = (e) p144l6.e.c().b(e.class);
        if (eVar != null) {
            return eVar;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public final void b(Throwable th) {
        if (th == null) {
            return;
        }
        a aVar = this.f47436a.f48304g;
        Thread threadCurrentThread = Thread.currentThread();
        aVar.getClass();
        x xVar = new x(aVar, System.currentTimeMillis(), th, threadCurrentThread);
        C2818n c2818n = aVar.f28086e;
        c2818n.getClass();
        c2818n.a(new CallableC2815k(xVar));
    }
}
