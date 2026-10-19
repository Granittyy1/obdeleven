package La;

import kotlin.random.Random;

/* JADX INFO: compiled from: PlatformRandom.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends Random {
    @Override // kotlin.random.Random
    public final int a(int i10) {
        return ((-i10) >> 31) & (h().nextInt() >>> (32 - i10));
    }

    @Override // kotlin.random.Random
    public final int b() {
        return h().nextInt();
    }

    @Override // kotlin.random.Random
    public final int c(int i10) {
        return h().nextInt(i10);
    }

    @Override // kotlin.random.Random
    public final long e() {
        return h().nextLong();
    }

    public abstract java.util.Random h();
}
