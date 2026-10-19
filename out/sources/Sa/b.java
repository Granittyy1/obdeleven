package Sa;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f5706d;

    static {
        int i10 = i.f5715c;
        int i11 = i.f5716d;
        f5706d = new b(i.f5713a, i10, i.f5717e, i11);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.AbstractC2712w
    public final String toString() {
        return "Dispatchers.Default";
    }
}
