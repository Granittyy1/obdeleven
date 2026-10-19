package kotlinx.coroutines;

/* JADX INFO: renamed from: kotlinx.coroutines.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2714y {
    public static final void a(kotlin.coroutines.e eVar, Throwable th) {
        try {
            InterfaceC2713x interfaceC2713x = (InterfaceC2713x) eVar.get(InterfaceC2713x.a.f43616b);
            if (interfaceC2713x != null) {
                interfaceC2713x.handleException(eVar, th);
            } else {
                S4.o.k(eVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                D2.V.e(runtimeException, th);
                th = runtimeException;
            }
            S4.o.k(eVar, th);
        }
    }
}
