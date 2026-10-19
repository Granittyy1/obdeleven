package p152m1;

import android.media.MediaCodec;
import p114j1.A;

/* JADX INFO: compiled from: CryptoInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f44552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f44553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f44555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f44556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f44559h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f44560i;
    public final a j;

    /* JADX INFO: compiled from: CryptoInfo.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f44561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaCodec.CryptoInfo.Pattern f44562b = new MediaCodec.CryptoInfo.Pattern(0, 0);

        public a(MediaCodec.CryptoInfo cryptoInfo) {
            this.f44561a = cryptoInfo;
        }
    }

    public b() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f44560i = cryptoInfo;
        this.j = A.f40996a >= 24 ? new a(cryptoInfo) : null;
    }
}
