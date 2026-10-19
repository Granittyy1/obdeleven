package Ub;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: DecoderConfigDescriptor.java */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends b {
    public static final cc.b j = cc.c.b(d.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f6604f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f6605g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f6606h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f6607i = new ArrayList();

    public d() {
        this.f6597b = 4;
    }

    @Override // Ub.b
    public final int f() {
        a aVar = this.f6606h;
        int iH = (aVar == null ? 0 : aVar.h()) + 13 + 0;
        Iterator it = this.f6607i.iterator();
        while (it.hasNext()) {
            iH += ((f) it.next()).h();
        }
        return iH;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DecoderConfigDescriptor{objectTypeIndication=");
        sb2.append(this.f6601c);
        sb2.append(", streamType=");
        sb2.append(this.f6602d);
        sb2.append(", upStream=");
        sb2.append(0);
        sb2.append(", bufferSizeDB=");
        sb2.append(this.f6603e);
        sb2.append(", maxBitRate=");
        sb2.append(this.f6604f);
        sb2.append(", avgBitRate=");
        sb2.append(this.f6605g);
        sb2.append(", decoderSpecificInfo=");
        sb2.append((Object) null);
        sb2.append(", audioSpecificInfo=");
        sb2.append(this.f6606h);
        sb2.append(", configDescriptorDeadBytes=");
        sb2.append(ac.a.a(0, new byte[0]));
        sb2.append(", profileLevelIndicationDescriptors=");
        Object obj = this.f6607i;
        if (obj == null) {
            obj = "null";
        }
        sb2.append(obj);
        sb2.append('}');
        return sb2.toString();
    }
}
