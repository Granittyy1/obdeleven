package S1;

import A1.C0574i;
import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: DefaultEbmlReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f5348a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque<C0076a> f5349b = new ArrayDeque<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f5350c = new d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b.a f5351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f5354g;

    /* JADX INFO: renamed from: S1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DefaultEbmlReader.java */
    public static final class C0076a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f5356b;

        public C0076a(int i10, long j) {
            this.f5355a = i10;
            this.f5356b = j;
        }
    }

    public final long a(C0574i c0574i, int i10) throws IOException {
        byte[] bArr = this.f5348a;
        c0574i.a(bArr, 0, i10, false);
        long j = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j = (j << 8) | ((long) (bArr[i11] & 255));
        }
        return j;
    }
}
