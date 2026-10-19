package io.intercom.android.sdk.lightcompressor.video;

import C4.a;

/* JADX INFO: compiled from: Sample.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class Sample {
    private long offset;
    private long size;

    public Sample(long j, long j10) {
        this.offset = j;
        this.size = j10;
    }

    public static /* synthetic */ Sample copy$default(Sample sample, long j, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j = sample.offset;
        }
        if ((i10 & 2) != 0) {
            j10 = sample.size;
        }
        return sample.copy(j, j10);
    }

    public final long component1() {
        return this.offset;
    }

    public final long component2() {
        return this.size;
    }

    public final Sample copy(long j, long j10) {
        return new Sample(j, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sample)) {
            return false;
        }
        Sample sample = (Sample) obj;
        return this.offset == sample.offset && this.size == sample.size;
    }

    public final long getOffset() {
        return this.offset;
    }

    public final long getSize() {
        return this.size;
    }

    public int hashCode() {
        return Long.hashCode(this.size) + (Long.hashCode(this.offset) * 31);
    }

    public final void setOffset(long j) {
        this.offset = j;
    }

    public final void setSize(long j) {
        this.size = j;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Sample(offset=");
        sb2.append(this.offset);
        sb2.append(", size=");
        return a.h(sb2, this.size, ')');
    }
}
