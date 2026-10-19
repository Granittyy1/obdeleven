package Vb;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: VideoMediaHeaderBox.java */
/* JADX INFO: loaded from: classes2.dex */
public final class z extends a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6984k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6985l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6986m;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f6987i;
    public final int[] j;

    static {
        Ab.a aVar = new Ab.a(z.class, "VideoMediaHeaderBox.java");
        f6984k = aVar.e(aVar.d("getGraphicsmode", "org.mp4parser.boxes.iso14496.part12.VideoMediaHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setGraphicsmode", "org.mp4parser.boxes.iso14496.part12.VideoMediaHeaderBox", "int", "graphicsmode", "void"));
        f6985l = aVar.e(aVar.d("getOpcolor", "org.mp4parser.boxes.iso14496.part12.VideoMediaHeaderBox", "", "", "[I"));
        aVar.e(aVar.d("setOpcolor", "org.mp4parser.boxes.iso14496.part12.VideoMediaHeaderBox", "[I", "opcolor", "void"));
        f6986m = aVar.e(aVar.d("toString", "org.mp4parser.boxes.iso14496.part12.VideoMediaHeaderBox", "", "", "java.lang.String"));
    }

    public z() {
        super("vmhd");
        this.f6987i = 0;
        this.j = new int[3];
        this.f7977f = 1;
    }

    @Override // Zb.c, Zb.a
    public final void a(ByteBuffer byteBuffer) {
        e(byteBuffer);
        C6.b.i(this.f6987i, byteBuffer);
        for (int i10 : this.j) {
            C6.b.i(i10, byteBuffer);
        }
    }

    @Override // Zb.a
    public final long b() {
        return 12L;
    }

    public final String toString() {
        Ab.b bVarB = Ab.a.b(f6986m, this, this);
        Zb.e.a();
        Zb.e.b(bVarB);
        StringBuilder sb2 = new StringBuilder("VideoMediaHeaderBox[graphicsmode=");
        Ab.b bVarB2 = Ab.a.b(f6984k, this, this);
        Zb.e.a();
        Zb.e.b(bVarB2);
        sb2.append(this.f6987i);
        sb2.append(";opcolor0=");
        Ab.b bVarB3 = Ab.a.b(f6985l, this, this);
        Zb.e.a();
        Zb.e.b(bVarB3);
        sb2.append(this.j[0]);
        sb2.append(";opcolor1=");
        Ab.b bVarB4 = Ab.a.b(f6985l, this, this);
        Zb.e.a();
        Zb.e.b(bVarB4);
        sb2.append(this.j[1]);
        sb2.append(";opcolor2=");
        Ab.b bVarB5 = Ab.a.b(f6985l, this, this);
        Zb.e.a();
        Zb.e.b(bVarB5);
        return p005a4.q.c(sb2, this.j[2], "]");
    }
}
