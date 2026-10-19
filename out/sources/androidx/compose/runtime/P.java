package androidx.compose.runtime;

/* JADX INFO: compiled from: MonotonicFrameClock.kt */
/* JADX INFO: loaded from: classes.dex */
public final class P {
    public static final O a(kotlin.coroutines.e eVar) {
        O o10 = (O) eVar.get(O.a.f12884b);
        if (o10 != null) {
            return o10;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }
}
