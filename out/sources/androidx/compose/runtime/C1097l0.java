package androidx.compose.runtime;

/* JADX INFO: renamed from: androidx.compose.runtime.l0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ProduceState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1097l0<T> implements InterfaceC1095k0<T>, X<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlin.coroutines.e f13073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ X<T> f13074c;

    public C1097l0(X<T> x10, kotlin.coroutines.e eVar) {
        this.f13073b = eVar;
        this.f13074c = x10;
    }

    @Override // kotlinx.coroutines.A
    public final kotlin.coroutines.e getCoroutineContext() {
        return this.f13073b;
    }

    @Override // androidx.compose.runtime.N0
    public final T getValue() {
        return this.f13074c.getValue();
    }

    @Override // androidx.compose.runtime.X
    public final void setValue(T t8) {
        this.f13074c.setValue(t8);
    }
}
