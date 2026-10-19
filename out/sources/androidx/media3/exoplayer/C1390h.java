package androidx.media3.exoplayer;

import java.util.Locale;

/* JADX INFO: renamed from: androidx.media3.exoplayer.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DecoderCounters.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1390h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18404f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18405g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18406h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18407i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f18408k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f18409l;

    public final String toString() {
        int i10 = this.f18399a;
        int i11 = this.f18400b;
        int i12 = this.f18401c;
        int i13 = this.f18402d;
        int i14 = this.f18403e;
        int i15 = this.f18404f;
        int i16 = this.f18405g;
        int i17 = this.f18406h;
        int i18 = this.f18407i;
        int i19 = this.j;
        long j = this.f18408k;
        int i20 = this.f18409l;
        int i21 = p114j1.A.f40996a;
        Locale locale = Locale.US;
        StringBuilder sbA = B6.a.a("DecoderCounters {\n decoderInits=", ",\n decoderReleases=", "\n queuedInputBuffers=", i10, i11);
        sbA.append(i12);
        sbA.append("\n skippedInputBuffers=");
        sbA.append(i13);
        sbA.append("\n renderedOutputBuffers=");
        sbA.append(i14);
        sbA.append("\n skippedOutputBuffers=");
        sbA.append(i15);
        sbA.append("\n droppedBuffers=");
        sbA.append(i16);
        sbA.append("\n droppedInputBuffers=");
        sbA.append(i17);
        sbA.append("\n maxConsecutiveDroppedBuffers=");
        sbA.append(i18);
        sbA.append("\n droppedToKeyframeEvents=");
        sbA.append(i19);
        sbA.append("\n totalVideoFrameProcessingOffsetUs=");
        sbA.append(j);
        sbA.append("\n videoFrameProcessingOffsetCount=");
        sbA.append(i20);
        sbA.append("\n}");
        return sbA.toString();
    }
}
