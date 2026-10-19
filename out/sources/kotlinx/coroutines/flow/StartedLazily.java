package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class StartedLazily implements z {
    @Override // kotlinx.coroutines.flow.z
    public final InterfaceC2686c<SharingCommand> b(A<Integer> a10) {
        return new t(new StartedLazily$command$1(a10, null));
    }

    public final String toString() {
        return "SharingStarted.Lazily";
    }
}
