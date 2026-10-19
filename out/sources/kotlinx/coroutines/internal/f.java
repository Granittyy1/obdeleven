package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: Scopes.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements kotlinx.coroutines.A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlin.coroutines.e f43473b;

    public f(kotlin.coroutines.e eVar) {
        this.f43473b = eVar;
    }

    @Override // kotlinx.coroutines.A
    public final kotlin.coroutines.e getCoroutineContext() {
        return this.f43473b;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f43473b + ')';
    }
}
