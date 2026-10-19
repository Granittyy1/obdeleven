package Vb;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: FileTypeBox.java */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends Zb.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6879h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6880i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f6881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f6882f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<String> f6883g;

    static {
        Ab.a aVar = new Ab.a(f.class, "FileTypeBox.java");
        f6879h = aVar.e(aVar.d("getMajorBrand", "org.mp4parser.boxes.iso14496.part12.FileTypeBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setMajorBrand", "org.mp4parser.boxes.iso14496.part12.FileTypeBox", "java.lang.String", "majorBrand", "void"));
        f6880i = aVar.e(aVar.d("getMinorVersion", "org.mp4parser.boxes.iso14496.part12.FileTypeBox", "", "", "long"));
        aVar.e(aVar.d("setMinorVersion", "org.mp4parser.boxes.iso14496.part12.FileTypeBox", "long", "minorVersion", "void"));
        aVar.e(aVar.d("getCompatibleBrands", "org.mp4parser.boxes.iso14496.part12.FileTypeBox", "", "", "java.util.List"));
        aVar.e(aVar.d("setCompatibleBrands", "org.mp4parser.boxes.iso14496.part12.FileTypeBox", "java.util.List", "compatibleBrands", "void"));
    }

    public f() {
        super("ftyp");
        this.f6883g = Collections.emptyList();
    }

    @Override // Zb.a
    public final void a(ByteBuffer byteBuffer) {
        byteBuffer.put(Tb.c.i(this.f6881e));
        byteBuffer.putInt((int) this.f6882f);
        Iterator<String> it = this.f6883g.iterator();
        while (it.hasNext()) {
            byteBuffer.put(Tb.c.i(it.next()));
        }
    }

    @Override // Zb.a
    public final long b() {
        return (this.f6883g.size() * 4) + 8;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FileTypeBox[majorBrand=");
        Ab.b bVarB = Ab.a.b(f6879h, this, this);
        Zb.e.a();
        Zb.e.b(bVarB);
        sb2.append(this.f6881e);
        sb2.append(";minorVersion=");
        Ab.b bVarB2 = Ab.a.b(f6880i, this, this);
        Zb.e.a();
        Zb.e.b(bVarB2);
        sb2.append(this.f6882f);
        for (String str : this.f6883g) {
            sb2.append(";compatibleBrand=");
            sb2.append(str);
        }
        sb2.append("]");
        return sb2.toString();
    }
}
