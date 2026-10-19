package X1;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: compiled from: CuesWithTiming.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableList<p102i1.a> f7141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f7144d;

    public c(long j, long j10, List list) {
        this.f7141a = ImmutableList.G(list);
        this.f7142b = j;
        this.f7143c = j10;
        long j11 = -9223372036854775807L;
        if (j != -9223372036854775807L && j10 != -9223372036854775807L) {
            j11 = j + j10;
        }
        this.f7144d = j11;
    }
}
