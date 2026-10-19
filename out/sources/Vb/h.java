package Vb;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: HintMediaHeaderBox.java */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6892i;

    static {
        Ab.a aVar = new Ab.a(h.class, "HintMediaHeaderBox.java");
        aVar.e(aVar.d("getMaxPduSize", "org.mp4parser.boxes.iso14496.part12.HintMediaHeaderBox", "", "", "int"));
        aVar.e(aVar.d("getAvgPduSize", "org.mp4parser.boxes.iso14496.part12.HintMediaHeaderBox", "", "", "int"));
        aVar.e(aVar.d("getMaxBitrate", "org.mp4parser.boxes.iso14496.part12.HintMediaHeaderBox", "", "", "long"));
        aVar.e(aVar.d("getAvgBitrate", "org.mp4parser.boxes.iso14496.part12.HintMediaHeaderBox", "", "", "long"));
        f6892i = aVar.e(aVar.d("toString", "org.mp4parser.boxes.iso14496.part12.HintMediaHeaderBox", "", "", "java.lang.String"));
    }

    public h() {
        super("hmhd");
    }

    @Override // Zb.c, Zb.a
    public final void a(ByteBuffer byteBuffer) {
        e(byteBuffer);
        C6.b.i(0, byteBuffer);
        C6.b.i(0, byteBuffer);
        byteBuffer.putInt((int) 0);
        byteBuffer.putInt((int) 0);
        byteBuffer.putInt((int) 0);
    }

    @Override // Zb.a
    public final long b() {
        return 20L;
    }

    public final String toString() {
        Ab.b bVarB = Ab.a.b(f6892i, this, this);
        Zb.e.a();
        Zb.e.b(bVarB);
        StringBuilder sb2 = new StringBuilder("HintMediaHeaderBox{maxPduSize=");
        sb2.append(0);
        sb2.append(", avgPduSize=");
        sb2.append(0);
        sb2.append(", maxBitrate=");
        sb2.append(0L);
        sb2.append(", avgBitrate=");
        return C4.a.h(sb2, 0L, '}');
    }
}
