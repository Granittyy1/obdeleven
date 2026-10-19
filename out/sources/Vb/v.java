package Vb;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: SyncSampleBox.java */
/* JADX INFO: loaded from: classes2.dex */
public final class v extends Zb.c {
    public static final /* synthetic */ Ab.b.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6944k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long[] f6945i;

    static {
        Ab.a aVar = new Ab.a(v.class, "SyncSampleBox.java");
        aVar.e(aVar.d("getSampleNumber", "org.mp4parser.boxes.iso14496.part12.SyncSampleBox", "", "", "[J"));
        j = aVar.e(aVar.d("setSampleNumber", "org.mp4parser.boxes.iso14496.part12.SyncSampleBox", "[J", "sampleNumber", "void"));
        f6944k = aVar.e(aVar.d("toString", "org.mp4parser.boxes.iso14496.part12.SyncSampleBox", "", "", "java.lang.String"));
    }

    public v() {
        super("stss");
    }

    @Override // Zb.c, Zb.a
    public final void a(ByteBuffer byteBuffer) {
        e(byteBuffer);
        byteBuffer.putInt(this.f6945i.length);
        for (long j10 : this.f6945i) {
            byteBuffer.putInt((int) j10);
        }
    }

    @Override // Zb.a
    public final long b() {
        return (((long) this.f6945i.length) * 4) + 8;
    }

    public final String toString() {
        Ab.b bVarB = Ab.a.b(f6944k, this, this);
        Zb.e.a();
        Zb.e.b(bVarB);
        return p005a4.q.c(new StringBuilder("SyncSampleBox[entryCount="), this.f6945i.length, "]");
    }
}
