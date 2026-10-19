package androidx.lifecycle;

import com.google.android.gms.internal.measurement.M1;
import kotlin.NotImplementedError;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: compiled from: ViewModel.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D2.V f17794a = new D2.V();

    public static final p040d1.a a(Y y10) {
        p040d1.a aVar;
        kotlin.coroutines.e eVarD1;
        kotlin.jvm.internal.i.e(y10, "<this>");
        synchronized (f17794a) {
            aVar = (p040d1.a) y10.getCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (aVar == null) {
                try {
                    try {
                        Sa.b bVar = kotlinx.coroutines.N.f43198a;
                        eVarD1 = kotlinx.coroutines.internal.q.f43500a.d1();
                    } catch (NotImplementedError unused) {
                        eVarD1 = EmptyCoroutineContext.f43032b;
                    }
                } catch (IllegalStateException unused2) {
                    eVarD1 = EmptyCoroutineContext.f43032b;
                }
                p040d1.a aVar2 = new p040d1.a(eVarD1.plus(M1.a()));
                y10.addCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", aVar2);
                aVar = aVar2;
            }
        }
        return aVar;
    }
}
