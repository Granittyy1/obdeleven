package androidx.compose.runtime;

/* JADX INFO: renamed from: androidx.compose.runtime.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1080d implements kotlin.coroutines.e.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f12952b = new a();

    /* JADX INFO: renamed from: androidx.compose.runtime.d$a */
    /* JADX INFO: compiled from: Effects.kt */
    public static final class a implements kotlin.coroutines.e.b<C1080d> {
    }

    @Override // kotlin.coroutines.e
    public final <R> R fold(R r10, Ia.p<? super R, ? super kotlin.coroutines.e.a, ? extends R> pVar) {
        return (R) kotlin.coroutines.e.a.C0479a.a(this, r10, pVar);
    }

    @Override // kotlin.coroutines.e
    public final <E extends kotlin.coroutines.e.a> E get(kotlin.coroutines.e.b<E> bVar) {
        return (E) kotlin.coroutines.e.a.C0479a.b(this, bVar);
    }

    @Override // kotlin.coroutines.e.a
    public final kotlin.coroutines.e.b<?> getKey() {
        return f12952b;
    }

    @Override // kotlin.coroutines.e
    public final kotlin.coroutines.e minusKey(kotlin.coroutines.e.b<?> bVar) {
        return kotlin.coroutines.e.a.C0479a.c(this, bVar);
    }

    @Override // kotlin.coroutines.e
    public final kotlin.coroutines.e plus(kotlin.coroutines.e eVar) {
        return kotlin.coroutines.e.a.C0479a.d(this, eVar);
    }
}
