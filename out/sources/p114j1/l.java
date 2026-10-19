package p114j1;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: LongArrayQueue.java */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f41039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41040d;

    public final long a() {
        int i10 = this.f41038b;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f41039c;
        int i11 = this.f41037a;
        long j = jArr[i11];
        this.f41037a = this.f41040d & (i11 + 1);
        this.f41038b = i10 - 1;
        return j;
    }
}
