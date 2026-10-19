package Wb;

import Zb.c;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: AbstractDescriptorBox.java */
/* JADX INFO: loaded from: classes2.dex */
public class a extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final cc.b f7093k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f7094l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f7095m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f7096n;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Ub.b f7097i;
    public ByteBuffer j;

    static {
        Ab.a aVar = new Ab.a(a.class, "AbstractDescriptorBox.java");
        aVar.e(aVar.d("getData", "org.mp4parser.boxes.iso14496.part14.AbstractDescriptorBox", "", "", "java.nio.ByteBuffer"));
        f7094l = aVar.e(aVar.d("setData", "org.mp4parser.boxes.iso14496.part14.AbstractDescriptorBox", "java.nio.ByteBuffer", "data", "void"));
        f7095m = aVar.e(aVar.d("getDescriptor", "org.mp4parser.boxes.iso14496.part14.AbstractDescriptorBox", "", "", "org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor"));
        f7096n = aVar.e(aVar.d("setDescriptor", "org.mp4parser.boxes.iso14496.part14.AbstractDescriptorBox", "org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor", "descriptor", "void"));
        aVar.e(aVar.d("getDescriptorAsString", "org.mp4parser.boxes.iso14496.part14.AbstractDescriptorBox", "", "", "java.lang.String"));
        f7093k = cc.c.c(a.class.getName());
    }

    @Override // Zb.c, Zb.a
    public void a(ByteBuffer byteBuffer) {
        e(byteBuffer);
        this.j.rewind();
        byteBuffer.put(this.j);
    }

    @Override // Zb.a
    public long b() {
        return this.j.limit() + 4;
    }
}
