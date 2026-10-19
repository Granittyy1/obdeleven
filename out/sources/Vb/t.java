package Vb;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: StaticChunkOffsetBox.java */
/* JADX INFO: loaded from: classes2.dex */
public final class t extends b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6941k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6942l;
    public long[] j;

    static {
        Ab.a aVar = new Ab.a(t.class, "StaticChunkOffsetBox.java");
        f6941k = aVar.e(aVar.d("getChunkOffsets", "org.mp4parser.boxes.iso14496.part12.StaticChunkOffsetBox", "", "", "[J"));
        f6942l = aVar.e(aVar.d("setChunkOffsets", "org.mp4parser.boxes.iso14496.part12.StaticChunkOffsetBox", "[J", "chunkOffsets", "void"));
    }

    public t() {
        super("stco");
        this.j = new long[0];
    }

    @Override // Zb.c, Zb.a
    public final void a(ByteBuffer byteBuffer) {
        e(byteBuffer);
        byteBuffer.putInt(this.j.length);
        for (long j : this.j) {
            byteBuffer.putInt((int) j);
        }
    }

    @Override // Zb.a
    public final long b() {
        return (this.j.length * 4) + 8;
    }

    @Override // Vb.b
    public final long[] f() {
        Ab.b bVarB = Ab.a.b(f6941k, this, this);
        Zb.e.a();
        Zb.e.b(bVarB);
        return this.j;
    }
}
