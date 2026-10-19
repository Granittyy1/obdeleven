package androidx.lifecycle;

import com.google.android.gms.internal.measurement.M1;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.B0;
import kotlinx.coroutines.C2680e;

/* JADX INFO: renamed from: androidx.lifecycle.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LifecycleOwner.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1377u {
    public static final C1373p a(InterfaceC1376t interfaceC1376t) {
        C1373p c1373p;
        Lifecycle lifecycle = interfaceC1376t.getLifecycle();
        kotlin.jvm.internal.i.e(lifecycle, "<this>");
        loop0: while (true) {
            p005a4.t tVar = lifecycle.f17747a;
            c1373p = (C1373p) ((AtomicReference) tVar.f8043a).get();
            if (c1373p != null) {
                break;
            }
            B0 b0A = M1.a();
            Sa.b bVar = kotlinx.coroutines.N.f43198a;
            c1373p = new C1373p(lifecycle, kotlin.coroutines.e.a.C0479a.d(b0A, kotlinx.coroutines.internal.q.f43500a.d1()));
            AtomicReference atomicReference = (AtomicReference) tVar.f8043a;
            do {
                if (atomicReference.compareAndSet(null, c1373p)) {
                    Sa.b bVar2 = kotlinx.coroutines.N.f43198a;
                    C2680e.c(c1373p, kotlinx.coroutines.internal.q.f43500a.d1(), null, new LifecycleCoroutineScopeImpl$register$1(c1373p, null), 2);
                    break loop0;
                }
            } while (atomicReference.get() == null);
        }
        return c1373p;
    }
}
