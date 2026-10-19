package Wb;

import Zb.e;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: ESDescriptorBox.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f7098o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f7099p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f7100q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f7101r;

    static {
        Ab.a aVar = new Ab.a(b.class, "ESDescriptorBox.java");
        f7098o = aVar.e(aVar.d("getEsDescriptor", "org.mp4parser.boxes.iso14496.part14.ESDescriptorBox", "", "", "org.mp4parser.boxes.iso14496.part1.objectdescriptors.ESDescriptor"));
        f7099p = aVar.e(aVar.d("setEsDescriptor", "org.mp4parser.boxes.iso14496.part14.ESDescriptorBox", "org.mp4parser.boxes.iso14496.part1.objectdescriptors.ESDescriptor", "esDescriptor", "void"));
        f7100q = aVar.e(aVar.d("equals", "org.mp4parser.boxes.iso14496.part14.ESDescriptorBox", "java.lang.Object", "o", "boolean"));
        f7101r = aVar.e(aVar.d("hashCode", "org.mp4parser.boxes.iso14496.part14.ESDescriptorBox", "", "", "int"));
    }

    public b() {
        super("esds");
    }

    @Override // Wb.a, Zb.c, Zb.a
    public final void a(ByteBuffer byteBuffer) {
        e(byteBuffer);
        Ab.b bVarB = Ab.a.b(f7098o, this, this);
        e.a();
        e.b(bVarB);
        Ab.b bVarB2 = Ab.a.b(a.f7095m, this, this);
        e.a();
        e.b(bVarB2);
        Ub.e eVar = (Ub.e) this.f7097i;
        if (eVar != null) {
            byteBuffer.put((ByteBuffer) eVar.k().rewind());
        } else {
            byteBuffer.put(this.j.duplicate());
        }
    }

    @Override // Wb.a, Zb.a
    public final long b() {
        Ab.b bVarB = Ab.a.b(f7098o, this, this);
        e.a();
        e.b(bVarB);
        Ab.b bVarB2 = Ab.a.b(a.f7095m, this, this);
        e.a();
        e.b(bVarB2);
        Ub.e eVar = (Ub.e) this.f7097i;
        return (eVar != null ? eVar.h() : this.j.remaining()) + 4;
    }

    public final boolean equals(Object obj) {
        Ab.b bVarC = Ab.a.c(f7100q, this, this, obj);
        e.a();
        e.b(bVarC);
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        ByteBuffer byteBuffer = this.j;
        ByteBuffer byteBuffer2 = ((b) obj).j;
        return byteBuffer == null ? byteBuffer2 == null : byteBuffer.equals(byteBuffer2);
    }

    public final int hashCode() {
        Ab.b bVarB = Ab.a.b(f7101r, this, this);
        e.a();
        e.b(bVarB);
        ByteBuffer byteBuffer = this.j;
        if (byteBuffer != null) {
            return byteBuffer.hashCode();
        }
        return 0;
    }
}
