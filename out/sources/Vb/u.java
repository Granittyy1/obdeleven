package Vb;

/* JADX INFO: compiled from: SubtitleMediaHeaderBox.java */
/* JADX INFO: loaded from: classes2.dex */
public final class u extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6943i;

    static {
        Ab.a aVar = new Ab.a(u.class, "SubtitleMediaHeaderBox.java");
        f6943i = aVar.e(aVar.d("toString", "org.mp4parser.boxes.iso14496.part12.SubtitleMediaHeaderBox", "", "", "java.lang.String"));
    }

    public u() {
        super("sthd");
    }

    @Override // Zb.a
    public final long b() {
        return 4L;
    }

    public final String toString() {
        Ab.b bVarB = Ab.a.b(f6943i, this, this);
        Zb.e.a();
        Zb.e.b(bVarB);
        return "SubtitleMediaHeaderBox";
    }
}
