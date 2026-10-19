package Xb;

import Ub.c;
import Zb.e;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: AvcConfigurationBox.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends Zb.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f7448f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f7449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f7450h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f7451i;
    public static final /* synthetic */ Ab.b.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f7452k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f7453l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f7454m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f7455n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f7456o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f7457p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f7458q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f7459r;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f7460e;

    static {
        Ab.a aVar = new Ab.a(a.class, "AvcConfigurationBox.java");
        aVar.e(aVar.d("getConfigurationVersion", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f7448f = aVar.e(aVar.d("setConfigurationVersion", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "configurationVersion", "void"));
        aVar.e(aVar.d("getSequenceParameterSets", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        f7452k = aVar.e(aVar.d("setSequenceParameterSets", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "void"));
        aVar.e(aVar.d("getPictureParameterSets", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        f7453l = aVar.e(aVar.d("setPictureParameterSets", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "void"));
        aVar.e(aVar.d("getChromaFormat", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f7454m = aVar.e(aVar.d("setChromaFormat", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "chromaFormat", "void"));
        aVar.e(aVar.d("getBitDepthLumaMinus8", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f7455n = aVar.e(aVar.d("setBitDepthLumaMinus8", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "bitDepthLumaMinus8", "void"));
        aVar.e(aVar.d("getBitDepthChromaMinus8", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f7456o = aVar.e(aVar.d("setBitDepthChromaMinus8", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "bitDepthChromaMinus8", "void"));
        aVar.e(aVar.d("getAvcProfileIndication", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getSequenceParameterSetExts", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        aVar.e(aVar.d("setSequenceParameterSetExts", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "void"));
        aVar.e(aVar.d("hasExts", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "boolean"));
        aVar.e(aVar.d("setHasExts", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "boolean", "hasExts", "void"));
        f7457p = aVar.e(aVar.d("getContentSize", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "long"));
        f7458q = aVar.e(aVar.d("getContent", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "void"));
        aVar.e(aVar.d("getavcDecoderConfigurationRecord", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "org.mp4parser.boxes.iso14496.part15.AvcDecoderConfigurationRecord"));
        f7459r = aVar.e(aVar.d("toString", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "java.lang.String"));
        f7449g = aVar.e(aVar.d("setAvcProfileIndication", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "avcProfileIndication", "void"));
        aVar.e(aVar.d("getProfileCompatibility", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f7450h = aVar.e(aVar.d("setProfileCompatibility", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "profileCompatibility", "void"));
        aVar.e(aVar.d("getAvcLevelIndication", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f7451i = aVar.e(aVar.d("setAvcLevelIndication", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "avcLevelIndication", "void"));
        aVar.e(aVar.d("getLengthSizeMinusOne", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        j = aVar.e(aVar.d("setLengthSizeMinusOne", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "lengthSizeMinusOne", "void"));
    }

    public a() {
        super("avcC");
        b bVar = new b();
        bVar.f7466f = new ArrayList();
        bVar.f7467g = new ArrayList();
        bVar.f7468h = true;
        bVar.f7469i = 1;
        bVar.j = 0;
        bVar.f7470k = 0;
        bVar.f7471l = new ArrayList();
        bVar.f7472m = 63;
        bVar.f7473n = 7;
        bVar.f7474o = 31;
        bVar.f7475p = 31;
        bVar.f7476q = 31;
        this.f7460e = bVar;
    }

    @Override // Zb.a
    public final void a(ByteBuffer byteBuffer) {
        Ab.b bVarC = Ab.a.c(f7458q, this, this, byteBuffer);
        e.a();
        e.b(bVarC);
        b bVar = this.f7460e;
        C6.b.k(bVar.f7461a, byteBuffer);
        byteBuffer.put((byte) (bVar.f7462b & 255));
        byteBuffer.put((byte) (bVar.f7463c & 255));
        byteBuffer.put((byte) (bVar.f7464d & 255));
        c cVar = new c(byteBuffer);
        cVar.a(bVar.f7472m, 6);
        cVar.a(bVar.f7465e, 2);
        cVar.a(bVar.f7473n, 3);
        cVar.a(bVar.f7466f.size(), 5);
        for (ByteBuffer byteBuffer2 : bVar.f7466f) {
            C6.b.i(byteBuffer2.limit(), byteBuffer);
            byteBuffer.put((ByteBuffer) byteBuffer2.rewind());
        }
        byteBuffer.put((byte) (bVar.f7467g.size() & 255));
        for (ByteBuffer byteBuffer3 : bVar.f7467g) {
            C6.b.i(byteBuffer3.limit(), byteBuffer);
            byteBuffer.put((ByteBuffer) byteBuffer3.rewind());
        }
        if (bVar.f7468h) {
            int i10 = bVar.f7462b;
            if (i10 == 100 || i10 == 110 || i10 == 122 || i10 == 144) {
                c cVar2 = new c(byteBuffer);
                cVar2.a(bVar.f7474o, 6);
                cVar2.a(bVar.f7469i, 2);
                cVar2.a(bVar.f7475p, 5);
                cVar2.a(bVar.j, 3);
                cVar2.a(bVar.f7476q, 5);
                cVar2.a(bVar.f7470k, 3);
                for (ByteBuffer byteBuffer4 : bVar.f7471l) {
                    C6.b.i(byteBuffer4.limit(), byteBuffer);
                    byteBuffer.put((ByteBuffer) byteBuffer4.reset());
                }
            }
        }
    }

    @Override // Zb.a
    public final long b() {
        int i10;
        Ab.b bVarB = Ab.a.b(f7457p, this, this);
        e.a();
        e.b(bVarB);
        b bVar = this.f7460e;
        Iterator it = bVar.f7466f.iterator();
        long jLimit = 6;
        while (it.hasNext()) {
            jLimit = jLimit + 2 + ((long) ((ByteBuffer) it.next()).limit());
        }
        long jLimit2 = jLimit + 1;
        Iterator it2 = bVar.f7467g.iterator();
        while (it2.hasNext()) {
            jLimit2 = jLimit2 + 2 + ((long) ((ByteBuffer) it2.next()).limit());
        }
        if (bVar.f7468h && ((i10 = bVar.f7462b) == 100 || i10 == 110 || i10 == 122 || i10 == 144)) {
            jLimit2 += 4;
            Iterator it3 = bVar.f7471l.iterator();
            while (it3.hasNext()) {
                jLimit2 = jLimit2 + 2 + ((long) ((ByteBuffer) it3.next()).limit());
            }
        }
        return jLimit2;
    }

    public final void c(int i10) {
        Ab.b bVarC = Ab.a.c(f7451i, this, this, Integer.valueOf(i10));
        e.a();
        e.b(bVarC);
        this.f7460e.f7464d = i10;
    }

    public final String toString() {
        Ab.b bVarB = Ab.a.b(f7459r, this, this);
        e.a();
        e.b(bVarB);
        return "AvcConfigurationBox{avcDecoderConfigurationRecord=" + this.f7460e + '}';
    }
}
