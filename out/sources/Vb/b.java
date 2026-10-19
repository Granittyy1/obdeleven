package Vb;

/* JADX INFO: compiled from: ChunkOffsetBox.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends Zb.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6877i;

    static {
        Ab.a aVar = new Ab.a(b.class, "ChunkOffsetBox.java");
        f6877i = aVar.e(aVar.d("toString", "org.mp4parser.boxes.iso14496.part12.ChunkOffsetBox", "", "", "java.lang.String"));
    }

    public abstract long[] f();

    public final String toString() {
        Ab.b bVarB = Ab.a.b(f6877i, this, this);
        Zb.e.a();
        Zb.e.b(bVarB);
        StringBuilder sb2 = new StringBuilder(getClass().getSimpleName());
        sb2.append("[entryCount=");
        return p005a4.q.c(sb2, f().length, "]");
    }
}
