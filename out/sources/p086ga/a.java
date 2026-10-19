package p086ga;

import io.ktor.utils.io.pool.DefaultPool;

/* JADX INFO: compiled from: ByteArrayPool.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0373a f35672a = new C0373a(128);

    /* JADX INFO: renamed from: ga.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ByteArrayPool.kt */
    public static final class C0373a extends DefaultPool<byte[]> {
        @Override // io.ktor.utils.io.pool.DefaultPool
        public final byte[] j() {
            return new byte[4096];
        }
    }
}
