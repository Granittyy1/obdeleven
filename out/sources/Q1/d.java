package Q1;

import java.util.Collections;
import java.util.List;
import p005a4.o;

/* JADX INFO: compiled from: SpliceInsertCommand.java */
/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<a> f4992c;

    /* JADX INFO: compiled from: SpliceInsertCommand.java */
    public static final class a {
    }

    public d(long j, long j10, List list) {
        this.f4990a = j;
        this.f4991b = j10;
        this.f4992c = Collections.unmodifiableList(list);
    }

    @Override // Q1.b
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f4990a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return o.d(this.f4991b, " }", sb2);
    }
}
