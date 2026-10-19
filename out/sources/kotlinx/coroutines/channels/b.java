package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: BroadcastChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D3.l f43268a = new D3.l(4, "NO_ELEMENT");

    @p293xa.d
    public static final <E> a<E> a(int i10) {
        if (i10 == -2) {
            d.f43287n0.getClass();
            return new BroadcastChannelImpl(d.a.f43289b);
        }
        if (i10 == -1) {
            return new j();
        }
        if (i10 == 0) {
            throw new IllegalArgumentException("Unsupported 0 capacity for BroadcastChannel");
        }
        if (i10 != Integer.MAX_VALUE) {
            return new BroadcastChannelImpl(i10);
        }
        throw new IllegalArgumentException("Unsupported UNLIMITED capacity for BroadcastChannel");
    }
}
