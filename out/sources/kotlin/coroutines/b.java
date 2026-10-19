package kotlin.coroutines;

import Ia.l;
import kotlin.coroutines.e.a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: CoroutineContextImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b<B extends e.a, E extends B> implements e.b<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lambda f43033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e.b<?> f43034c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.e$b<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [Ia.l<? super kotlin.coroutines.e$a, ? extends E extends B>, java.lang.Object] */
    public b(e.b<B> baseKey, l<? super e.a, ? extends E> safeCast) {
        i.e(baseKey, "baseKey");
        i.e(safeCast, "safeCast");
        this.f43033b = (Lambda) safeCast;
        this.f43034c = baseKey instanceof b ? (e.b<B>) ((b) baseKey).f43034c : baseKey;
    }
}
