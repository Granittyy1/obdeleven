package Vb;

import com.google.android.gms.internal.measurement.M1;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: HandlerBox.java */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends Zb.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Map<String, String> f6884l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6885m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6886n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6887o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6888p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6889q;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f6890i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f6891k;

    static {
        Ab.a aVar = new Ab.a(g.class, "HandlerBox.java");
        f6885m = aVar.e(aVar.d("getHandlerType", "org.mp4parser.boxes.iso14496.part12.HandlerBox", "", "", "java.lang.String"));
        f6886n = aVar.e(aVar.d("setHandlerType", "org.mp4parser.boxes.iso14496.part12.HandlerBox", "java.lang.String", "handlerType", "void"));
        f6887o = aVar.e(aVar.d("getName", "org.mp4parser.boxes.iso14496.part12.HandlerBox", "", "", "java.lang.String"));
        f6888p = aVar.e(aVar.d("setName", "org.mp4parser.boxes.iso14496.part12.HandlerBox", "java.lang.String", "name", "void"));
        aVar.e(aVar.d("getHumanReadableTrackType", "org.mp4parser.boxes.iso14496.part12.HandlerBox", "", "", "java.lang.String"));
        f6889q = aVar.e(aVar.d("toString", "org.mp4parser.boxes.iso14496.part12.HandlerBox", "", "", "java.lang.String"));
        HashMap map = new HashMap();
        map.put("odsm", "ObjectDescriptorStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("crsm", "ClockReferenceStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("sdsm", "SceneDescriptionStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("m7sm", "MPEG7Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("ocsm", "ObjectContentInfoStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("ipsm", "IPMP Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("mjsm", "MPEG-J Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("mdir", "Apple Meta Data iTunes Reader");
        map.put("mp7b", "MPEG-7 binary XML");
        map.put("mp7t", "MPEG-7 XML");
        map.put("vide", "Video Track");
        map.put("soun", "Sound Track");
        map.put("hint", "Hint Track");
        map.put("appl", "Apple specific");
        map.put("meta", "Timed Metadata track - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        f6884l = Collections.unmodifiableMap(map);
    }

    public g() {
        super("hdlr");
        this.j = null;
        this.f6891k = true;
    }

    @Override // Zb.c, Zb.a
    public final void a(ByteBuffer byteBuffer) {
        e(byteBuffer);
        byteBuffer.putInt((int) 0);
        byteBuffer.put(Tb.c.i(this.f6890i));
        byteBuffer.putInt((int) 0);
        byteBuffer.putInt((int) 0);
        byteBuffer.putInt((int) 0);
        String str = this.j;
        if (str != null) {
            byteBuffer.put(M1.e(str));
        }
        if (this.f6891k) {
            byteBuffer.put((byte) 0);
        }
    }

    @Override // Zb.a
    public final long b() {
        return this.f6891k ? M1.m(this.j) + 25 : M1.m(this.j) + 24;
    }

    public final String toString() {
        Ab.b bVarB = Ab.a.b(f6889q, this, this);
        Zb.e.a();
        Zb.e.b(bVarB);
        StringBuilder sb2 = new StringBuilder("HandlerBox[handlerType=");
        Ab.b bVarB2 = Ab.a.b(f6885m, this, this);
        Zb.e.a();
        Zb.e.b(bVarB2);
        sb2.append(this.f6890i);
        sb2.append(";name=");
        Ab.b bVarB3 = Ab.a.b(f6887o, this, this);
        Zb.e.a();
        Zb.e.b(bVarB3);
        return Q8.d.a(sb2, this.j, "]");
    }
}
