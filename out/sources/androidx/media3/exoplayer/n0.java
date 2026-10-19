package androidx.media3.exoplayer;

/* JADX INFO: compiled from: RendererCapabilities.java */
/* JADX INFO: loaded from: classes.dex */
public interface n0 {

    /* JADX INFO: compiled from: RendererCapabilities.java */
    public interface a {
    }

    static int i(int i10) {
        return i10 & 384;
    }

    static boolean j(int i10, boolean z10) {
        int i11 = i10 & 7;
        return i11 == 4 || (z10 && i11 == 3);
    }

    static int m(int i10) {
        return i10 & 64;
    }

    static int n(int i10, int i11, int i12, int i13) {
        return i10 | i11 | i12 | 128 | i13;
    }

    int c(p078g1.n nVar) throws ExoPlaybackException;

    String getName();

    int u() throws ExoPlaybackException;
}
