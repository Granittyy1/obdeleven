package Vb;

import D2.V;
import com.braze.models.inappmessage.InAppMessageBase;
import io.intercom.android.sdk.models.AttributeType;
import java.nio.ByteBuffer;
import java.util.Date;

/* JADX INFO: compiled from: MovieHeaderBox.java */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends Zb.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6908A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6909B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6910C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6911D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6912E;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final cc.b f6913q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6914r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6915s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6916t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6917u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6918v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6919w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6920x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6921y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6922z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Date f6923i;
    public Date j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f6924k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f6925l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final double f6926m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f6927n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Zb.d f6928o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f6929p;

    static {
        Ab.a aVar = new Ab.a(m.class, "MovieHeaderBox.java");
        f6914r = aVar.e(aVar.d("getCreationTime", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "java.util.Date"));
        f6915s = aVar.e(aVar.d("setCreationTime", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "java.util.Date", "creationTime", "void"));
        f6908A = aVar.e(aVar.d("getVolume", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", AttributeType.FLOAT));
        aVar.e(aVar.d("setVolume", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", AttributeType.FLOAT, "volume", "void"));
        aVar.e(aVar.d("getMatrix", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "org.mp4parser.support.Matrix"));
        f6909B = aVar.e(aVar.d("setMatrix", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "org.mp4parser.support.Matrix", "matrix", "void"));
        f6910C = aVar.e(aVar.d("getNextTrackId", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "long"));
        f6911D = aVar.e(aVar.d("setNextTrackId", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "long", "nextTrackId", "void"));
        f6912E = aVar.e(aVar.d("toString", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("getPreviewTime", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setPreviewTime", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "int", "previewTime", "void"));
        aVar.e(aVar.d("getPreviewDuration", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "int"));
        f6916t = aVar.e(aVar.d("getModificationTime", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "java.util.Date"));
        aVar.e(aVar.d("setPreviewDuration", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "int", "previewDuration", "void"));
        aVar.e(aVar.d("getPosterTime", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setPosterTime", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "int", "posterTime", "void"));
        aVar.e(aVar.d("getSelectionTime", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setSelectionTime", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "int", "selectionTime", "void"));
        aVar.e(aVar.d("getSelectionDuration", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setSelectionDuration", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "int", "selectionDuration", "void"));
        aVar.e(aVar.d("getCurrentTime", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setCurrentTime", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "int", "currentTime", "void"));
        f6917u = aVar.e(aVar.d("setModificationTime", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "java.util.Date", "modificationTime", "void"));
        f6918v = aVar.e(aVar.d("getTimescale", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "long"));
        f6919w = aVar.e(aVar.d("setTimescale", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "long", "timescale", "void"));
        f6920x = aVar.e(aVar.d("getDuration", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "long"));
        f6921y = aVar.e(aVar.d("setDuration", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "long", InAppMessageBase.DURATION, "void"));
        f6922z = aVar.e(aVar.d("getRate", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "double"));
        aVar.e(aVar.d("setRate", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "double", "rate", "void"));
        f6913q = cc.c.b(m.class);
    }

    public m() {
        super("mvhd");
        this.f6926m = 1.0d;
        this.f6927n = 1.0f;
        this.f6928o = Zb.d.j;
    }

    @Override // Zb.c, Zb.a
    public final void a(ByteBuffer byteBuffer) {
        e(byteBuffer);
        if (this.f7976e == 1) {
            byteBuffer.putLong(V.g(this.f6923i));
            byteBuffer.putLong(V.g(this.j));
            byteBuffer.putInt((int) this.f6924k);
            byteBuffer.putLong(this.f6925l);
        } else {
            byteBuffer.putInt((int) V.g(this.f6923i));
            byteBuffer.putInt((int) V.g(this.j));
            byteBuffer.putInt((int) this.f6924k);
            byteBuffer.putInt((int) this.f6925l);
        }
        C6.b.g(byteBuffer, this.f6926m);
        C6.b.h(byteBuffer, this.f6927n);
        C6.b.i(0, byteBuffer);
        int i10 = (int) 0;
        byteBuffer.putInt(i10);
        byteBuffer.putInt(i10);
        this.f6928o.a(byteBuffer);
        byteBuffer.putInt(0);
        byteBuffer.putInt(0);
        byteBuffer.putInt(0);
        byteBuffer.putInt(0);
        byteBuffer.putInt(0);
        byteBuffer.putInt(0);
        byteBuffer.putInt((int) this.f6929p);
    }

    @Override // Zb.a
    public final long b() {
        return (this.f7976e == 1 ? 32L : 20L) + 80;
    }

    public final String toString() {
        Ab.b bVarB = Ab.a.b(f6912E, this, this);
        Zb.e.a();
        Zb.e.b(bVarB);
        StringBuilder sb2 = new StringBuilder("MovieHeaderBox[creationTime=");
        Ab.b bVarB2 = Ab.a.b(f6914r, this, this);
        Zb.e.a();
        Zb.e.b(bVarB2);
        sb2.append(this.f6923i);
        sb2.append(";modificationTime=");
        Ab.b bVarB3 = Ab.a.b(f6916t, this, this);
        Zb.e.a();
        Zb.e.b(bVarB3);
        sb2.append(this.j);
        sb2.append(";timescale=");
        Ab.b bVarB4 = Ab.a.b(f6918v, this, this);
        Zb.e.a();
        Zb.e.b(bVarB4);
        sb2.append(this.f6924k);
        sb2.append(";duration=");
        Ab.b bVarB5 = Ab.a.b(f6920x, this, this);
        Zb.e.a();
        Zb.e.b(bVarB5);
        sb2.append(this.f6925l);
        sb2.append(";rate=");
        Ab.b bVarB6 = Ab.a.b(f6922z, this, this);
        Zb.e.a();
        Zb.e.b(bVarB6);
        sb2.append(this.f6926m);
        sb2.append(";volume=");
        Ab.b bVarB7 = Ab.a.b(f6908A, this, this);
        Zb.e.a();
        Zb.e.b(bVarB7);
        sb2.append(this.f6927n);
        sb2.append(";matrix=");
        sb2.append(this.f6928o);
        sb2.append(";nextTrackId=");
        Ab.b bVarB8 = Ab.a.b(f6910C, this, this);
        Zb.e.a();
        Zb.e.b(bVarB8);
        return p005a4.o.d(this.f6929p, "]", sb2);
    }
}
