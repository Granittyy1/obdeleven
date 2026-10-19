package Vb;

import D2.V;
import com.braze.models.inappmessage.InAppMessageBase;
import java.nio.ByteBuffer;
import java.util.Date;

/* JADX INFO: compiled from: MediaHeaderBox.java */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends Zb.c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final cc.b f6893n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6894o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6895p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6896q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6897r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6898s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6899t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6900u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6901v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6902w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6903x;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Date f6904i;
    public final Date j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f6905k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f6906l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f6907m;

    static {
        Ab.a aVar = new Ab.a(j.class, "MediaHeaderBox.java");
        f6894o = aVar.e(aVar.d("getCreationTime", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "", "", "java.util.Date"));
        f6895p = aVar.e(aVar.d("setCreationTime", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "java.util.Date", "creationTime", "void"));
        f6903x = aVar.e(aVar.d("toString", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "", "", "java.lang.String"));
        f6896q = aVar.e(aVar.d("getModificationTime", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "", "", "java.util.Date"));
        aVar.e(aVar.d("setModificationTime", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "java.util.Date", "modificationTime", "void"));
        f6897r = aVar.e(aVar.d("getTimescale", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "", "", "long"));
        f6898s = aVar.e(aVar.d("setTimescale", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "long", "timescale", "void"));
        f6899t = aVar.e(aVar.d("getDuration", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "", "", "long"));
        f6900u = aVar.e(aVar.d("setDuration", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "long", InAppMessageBase.DURATION, "void"));
        f6901v = aVar.e(aVar.d("getLanguage", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "", "", "java.lang.String"));
        f6902w = aVar.e(aVar.d("setLanguage", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "java.lang.String", "language", "void"));
        f6893n = cc.c.b(j.class);
    }

    public j() {
        super("mdhd");
        this.f6904i = new Date();
        this.j = new Date();
        this.f6907m = "eng";
    }

    @Override // Zb.c, Zb.a
    public final void a(ByteBuffer byteBuffer) {
        e(byteBuffer);
        if (this.f7976e == 1) {
            byteBuffer.putLong(V.g(this.f6904i));
            byteBuffer.putLong(V.g(this.j));
            byteBuffer.putInt((int) this.f6905k);
            byteBuffer.putLong(this.f6906l);
        } else {
            byteBuffer.putInt((int) V.g(this.f6904i));
            byteBuffer.putInt((int) V.g(this.j));
            byteBuffer.putInt((int) this.f6905k);
            byteBuffer.putInt((int) this.f6906l);
        }
        String str = this.f6907m;
        if (str.getBytes().length != 3) {
            throw new IllegalArgumentException(androidx.compose.foundation.gestures.d.b("\"", str, "\" language string isn't exactly 3 characters long!"));
        }
        int i10 = 0;
        for (int i11 = 0; i11 < 3; i11++) {
            i10 += (str.getBytes()[i11] - 96) << ((2 - i11) * 5);
        }
        C6.b.i(i10, byteBuffer);
        C6.b.i(0, byteBuffer);
    }

    @Override // Zb.a
    public final long b() {
        return (this.f7976e == 1 ? 32L : 20L) + 4;
    }

    public final String toString() {
        Ab.b bVarB = Ab.a.b(f6903x, this, this);
        Zb.e.a();
        Zb.e.b(bVarB);
        StringBuilder sb2 = new StringBuilder("MediaHeaderBox[creationTime=");
        Ab.b bVarB2 = Ab.a.b(f6894o, this, this);
        Zb.e.a();
        Zb.e.b(bVarB2);
        sb2.append(this.f6904i);
        sb2.append(";modificationTime=");
        Ab.b bVarB3 = Ab.a.b(f6896q, this, this);
        Zb.e.a();
        Zb.e.b(bVarB3);
        sb2.append(this.j);
        sb2.append(";timescale=");
        Ab.b bVarB4 = Ab.a.b(f6897r, this, this);
        Zb.e.a();
        Zb.e.b(bVarB4);
        sb2.append(this.f6905k);
        sb2.append(";duration=");
        Ab.b bVarB5 = Ab.a.b(f6899t, this, this);
        Zb.e.a();
        Zb.e.b(bVarB5);
        sb2.append(this.f6906l);
        sb2.append(";language=");
        Ab.b bVarB6 = Ab.a.b(f6901v, this, this);
        Zb.e.a();
        Zb.e.b(bVarB6);
        return Q8.d.a(sb2, this.f6907m, "]");
    }
}
