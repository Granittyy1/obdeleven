package Vb;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: SampleSizeBox.java */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends Zb.c {
    public static final /* synthetic */ Ab.b.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6930k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6931l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6932m;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long[] f6933i;

    static {
        Ab.a aVar = new Ab.a(p.class, "SampleSizeBox.java");
        j = aVar.e(aVar.d("getSampleSize", "org.mp4parser.boxes.iso14496.part12.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("setSampleSize", "org.mp4parser.boxes.iso14496.part12.SampleSizeBox", "long", "sampleSize", "void"));
        aVar.e(aVar.d("getSampleSizeAtIndex", "org.mp4parser.boxes.iso14496.part12.SampleSizeBox", "int", "index", "long"));
        f6930k = aVar.e(aVar.d("getSampleCount", "org.mp4parser.boxes.iso14496.part12.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("getSampleSizes", "org.mp4parser.boxes.iso14496.part12.SampleSizeBox", "", "", "[J"));
        f6931l = aVar.e(aVar.d("setSampleSizes", "org.mp4parser.boxes.iso14496.part12.SampleSizeBox", "[J", "sampleSizes", "void"));
        f6932m = aVar.e(aVar.d("toString", "org.mp4parser.boxes.iso14496.part12.SampleSizeBox", "", "", "java.lang.String"));
    }

    public p() {
        super("stsz");
        this.f6933i = new long[0];
    }

    @Override // Zb.c, Zb.a
    public final void a(ByteBuffer byteBuffer) {
        e(byteBuffer);
        byteBuffer.putInt((int) 0);
        if (0 != 0) {
            byteBuffer.putInt(0);
            return;
        }
        byteBuffer.putInt(this.f6933i.length);
        for (long j10 : this.f6933i) {
            byteBuffer.putInt((int) j10);
        }
    }

    @Override // Zb.a
    public final long b() {
        return (0 == 0 ? this.f6933i.length * 4 : 0) + 12;
    }

    public final String toString() {
        Ab.b bVarB = Ab.a.b(f6932m, this, this);
        Zb.e.a();
        Zb.e.b(bVarB);
        StringBuilder sb2 = new StringBuilder("SampleSizeBox[sampleSize=");
        Ab.b bVarB2 = Ab.a.b(j, this, this);
        Zb.e.a();
        Zb.e.b(bVarB2);
        sb2.append(0L);
        sb2.append(";sampleCount=");
        Ab.b bVarB3 = Ab.a.b(f6930k, this, this);
        Zb.e.a();
        Zb.e.b(bVarB3);
        return p005a4.o.d(0 > 0 ? 0 : this.f6933i.length, "]", sb2);
    }
}
