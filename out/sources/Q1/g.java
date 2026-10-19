package Q1;

import p005a4.o;
import p114j1.r;

/* JADX INFO: compiled from: TimeSignalCommand.java */
/* JADX INFO: loaded from: classes.dex */
public final class g extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4996b;

    public g(long j, long j10) {
        this.f4995a = j;
        this.f4996b = j10;
    }

    public static long d(long j, r rVar) {
        long jU = rVar.u();
        if ((128 & jU) != 0) {
            return 8589934591L & ((((jU & 1) << 32) | rVar.w()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // Q1.b
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb2.append(this.f4995a);
        sb2.append(", playbackPositionUs= ");
        return o.d(this.f4996b, " }", sb2);
    }
}
