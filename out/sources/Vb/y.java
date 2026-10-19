package Vb;

import D2.V;
import com.braze.models.FeatureFlag;
import com.braze.models.inappmessage.InAppMessageBase;
import io.intercom.android.sdk.models.AttributeType;
import java.nio.ByteBuffer;
import java.util.Date;

/* JADX INFO: compiled from: TrackHeaderBox.java */
/* JADX INFO: loaded from: classes2.dex */
public final class y extends Zb.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6950A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6951B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6952C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6953D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6954E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6955F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6956G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6957H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6958I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6959J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6960K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6961L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6962M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6963N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6964O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6965P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6966Q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final cc.b f6967s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6968t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6969u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6970v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6971w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6972x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6973y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6974z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Date f6975i;
    public Date j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f6976k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f6977l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f6978m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f6979n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f6980o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Zb.d f6981p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public double f6982q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public double f6983r;

    static {
        Ab.a aVar = new Ab.a(y.class, "TrackHeaderBox.java");
        f6968t = aVar.e(aVar.d("getCreationTime", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "java.util.Date"));
        f6969u = aVar.e(aVar.d("setCreationTime", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "java.util.Date", "creationTime", "void"));
        f6953D = aVar.e(aVar.d("getAlternateGroup", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "int"));
        f6954E = aVar.e(aVar.d("setAlternateGroup", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "int", "alternateGroup", "void"));
        f6955F = aVar.e(aVar.d("getVolume", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", AttributeType.FLOAT));
        f6956G = aVar.e(aVar.d("setVolume", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", AttributeType.FLOAT, "volume", "void"));
        aVar.e(aVar.d("getMatrix", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "org.mp4parser.support.Matrix"));
        f6957H = aVar.e(aVar.d("setMatrix", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "org.mp4parser.support.Matrix", "matrix", "void"));
        f6958I = aVar.e(aVar.d("getWidth", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "double"));
        f6959J = aVar.e(aVar.d("setWidth", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "double", "width", "void"));
        f6960K = aVar.e(aVar.d("getHeight", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "double"));
        f6961L = aVar.e(aVar.d("setHeight", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "double", "height", "void"));
        f6970v = aVar.e(aVar.d("getModificationTime", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "java.util.Date"));
        f6962M = aVar.e(aVar.d("getContent", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "java.nio.ByteBuffer", "byteBuffer", "void"));
        f6963N = aVar.e(aVar.d("toString", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("isEnabled", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "boolean"));
        f6964O = aVar.e(aVar.d("setEnabled", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "boolean", FeatureFlag.ENABLED, "void"));
        aVar.e(aVar.d("isInMovie", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "boolean"));
        f6965P = aVar.e(aVar.d("setInMovie", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "boolean", "inMovie", "void"));
        aVar.e(aVar.d("isInPreview", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "boolean"));
        f6966Q = aVar.e(aVar.d("setInPreview", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "boolean", "inPreview", "void"));
        aVar.e(aVar.d("isInPoster", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "boolean"));
        aVar.e(aVar.d("setInPoster", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "boolean", "inPoster", "void"));
        f6971w = aVar.e(aVar.d("setModificationTime", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "java.util.Date", "modificationTime", "void"));
        f6972x = aVar.e(aVar.d("getTrackId", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "long"));
        f6973y = aVar.e(aVar.d("setTrackId", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "long", "trackId", "void"));
        f6974z = aVar.e(aVar.d("getDuration", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "long"));
        f6950A = aVar.e(aVar.d("setDuration", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "long", InAppMessageBase.DURATION, "void"));
        f6951B = aVar.e(aVar.d("getLayer", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "int"));
        f6952C = aVar.e(aVar.d("setLayer", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "int", "layer", "void"));
        f6967s = cc.c.b(y.class);
    }

    public y() {
        super("tkhd");
        this.f6975i = new Date(0L);
        this.j = new Date(0L);
        this.f6981p = Zb.d.j;
    }

    @Override // Zb.c, Zb.a
    public final void a(ByteBuffer byteBuffer) {
        Ab.b bVarC = Ab.a.c(f6962M, this, this, byteBuffer);
        Zb.e.a();
        Zb.e.b(bVarC);
        e(byteBuffer);
        if (this.f7976e == 1) {
            byteBuffer.putLong(V.g(this.f6975i));
            byteBuffer.putLong(V.g(this.j));
            byteBuffer.putInt((int) this.f6976k);
            byteBuffer.putInt((int) 0);
            byteBuffer.putLong(this.f6977l);
        } else {
            byteBuffer.putInt((int) V.g(this.f6975i));
            byteBuffer.putInt((int) V.g(this.j));
            byteBuffer.putInt((int) this.f6976k);
            byteBuffer.putInt((int) 0);
            byteBuffer.putInt((int) this.f6977l);
        }
        int i10 = (int) 0;
        byteBuffer.putInt(i10);
        byteBuffer.putInt(i10);
        C6.b.i(this.f6978m, byteBuffer);
        C6.b.i(this.f6979n, byteBuffer);
        C6.b.h(byteBuffer, this.f6980o);
        C6.b.i(0, byteBuffer);
        this.f6981p.a(byteBuffer);
        C6.b.g(byteBuffer, this.f6982q);
        C6.b.g(byteBuffer, this.f6983r);
    }

    @Override // Zb.a
    public final long b() {
        return (this.f7976e == 1 ? 36L : 24L) + 60;
    }

    public final String toString() {
        Ab.b bVarB = Ab.a.b(f6963N, this, this);
        Zb.e.a();
        Zb.e.b(bVarB);
        StringBuilder sb2 = new StringBuilder("TrackHeaderBox[creationTime=");
        Ab.b bVarB2 = Ab.a.b(f6968t, this, this);
        Zb.e.a();
        Zb.e.b(bVarB2);
        sb2.append(this.f6975i);
        sb2.append(";modificationTime=");
        Ab.b bVarB3 = Ab.a.b(f6970v, this, this);
        Zb.e.a();
        Zb.e.b(bVarB3);
        sb2.append(this.j);
        sb2.append(";trackId=");
        Ab.b bVarB4 = Ab.a.b(f6972x, this, this);
        Zb.e.a();
        Zb.e.b(bVarB4);
        sb2.append(this.f6976k);
        sb2.append(";duration=");
        Ab.b bVarB5 = Ab.a.b(f6974z, this, this);
        Zb.e.a();
        Zb.e.b(bVarB5);
        sb2.append(this.f6977l);
        sb2.append(";layer=");
        Ab.b bVarB6 = Ab.a.b(f6951B, this, this);
        Zb.e.a();
        Zb.e.b(bVarB6);
        sb2.append(this.f6978m);
        sb2.append(";alternateGroup=");
        Ab.b bVarB7 = Ab.a.b(f6953D, this, this);
        Zb.e.a();
        Zb.e.b(bVarB7);
        sb2.append(this.f6979n);
        sb2.append(";volume=");
        Ab.b bVarB8 = Ab.a.b(f6955F, this, this);
        Zb.e.a();
        Zb.e.b(bVarB8);
        sb2.append(this.f6980o);
        sb2.append(";matrix=");
        sb2.append(this.f6981p);
        sb2.append(";width=");
        Ab.b bVarB9 = Ab.a.b(f6958I, this, this);
        Zb.e.a();
        Zb.e.b(bVarB9);
        sb2.append(this.f6982q);
        sb2.append(";height=");
        Ab.b bVarB10 = Ab.a.b(f6960K, this, this);
        Zb.e.a();
        Zb.e.b(bVarB10);
        sb2.append(this.f6983r);
        sb2.append("]");
        return sb2.toString();
    }
}
