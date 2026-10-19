package androidx.media3.ui;

/* JADX INFO: compiled from: TimeBar.java */
/* JADX INFO: loaded from: classes.dex */
public interface f {

    /* JADX INFO: compiled from: TimeBar.java */
    public interface a {
        void H(long j, boolean z10);

        void k(long j);

        void s(long j);
    }

    void a(long[] jArr, boolean[] zArr, int i10);

    void b(c.b bVar);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j);

    void setDuration(long j);

    void setEnabled(boolean z10);

    void setPosition(long j);
}
