package kotlinx.serialization.json.internal;

import p050db.AbstractC2184a;

/* JADX INFO: compiled from: StreamingJsonDecoder.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends C.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f43990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p062eb.b f43991d;

    public k(z zVar, AbstractC2184a json) {
        kotlin.jvm.internal.i.e(json, "json");
        this.f43990c = zVar;
        this.f43991d = json.f34643b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // C.g, p024bb.c
    public final byte C() {
        p293xa.i iVar;
        z zVar = this.f43990c;
        String strJ = zVar.j();
        try {
            kotlin.jvm.internal.i.e(strJ, "<this>");
            p293xa.k kVarM = F8.a.m(10, strJ);
            if (kVarM != null) {
                int i10 = kVarM.f47926b;
                if (Integer.compareUnsigned(i10, 255) > 0) {
                    iVar = null;
                } else {
                    iVar = new p293xa.i((byte) i10);
                }
            } else {
                iVar = null;
            }
            if (iVar != null) {
                return iVar.f47922b;
            }
            kotlin.text.l.x(strJ);
            throw null;
        } catch (IllegalArgumentException unused) {
            z.n(zVar, p005a4.o.c('\'', "Failed to parse type 'UByte' for input '", strJ), 0, null, 6);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    @Override // C.g, p024bb.c
    public final short D() {
        p293xa.p pVar;
        z zVar = this.f43990c;
        String strJ = zVar.j();
        try {
            kotlin.jvm.internal.i.e(strJ, "<this>");
            p293xa.k kVarM = F8.a.m(10, strJ);
            if (kVarM != null) {
                int i10 = kVarM.f47926b;
                if (Integer.compareUnsigned(i10, 65535) > 0) {
                    pVar = null;
                } else {
                    pVar = new p293xa.p((short) i10);
                }
            } else {
                pVar = null;
            }
            if (pVar != null) {
                return pVar.f47935b;
            }
            kotlin.text.l.x(strJ);
            throw null;
        } catch (IllegalArgumentException unused) {
            z.n(zVar, p005a4.o.c('\'', "Failed to parse type 'UShort' for input '", strJ), 0, null, 6);
            throw null;
        }
    }

    @Override // p024bb.a
    public final C.g b() {
        return this.f43991d;
    }

    @Override // C.g, p024bb.c
    public final int k() {
        z zVar = this.f43990c;
        String strJ = zVar.j();
        try {
            kotlin.jvm.internal.i.e(strJ, "<this>");
            p293xa.k kVarM = F8.a.m(10, strJ);
            if (kVarM != null) {
                return kVarM.f47926b;
            }
            kotlin.text.l.x(strJ);
            throw null;
        } catch (IllegalArgumentException unused) {
            z.n(zVar, p005a4.o.c('\'', "Failed to parse type 'UInt' for input '", strJ), 0, null, 6);
            throw null;
        }
    }

    @Override // p024bb.a
    public final int o(p011ab.e descriptor) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // C.g, p024bb.c
    public final long s() {
        z zVar = this.f43990c;
        String strJ = zVar.j();
        try {
            kotlin.jvm.internal.i.e(strJ, "<this>");
            p293xa.m mVarN = F8.a.n(strJ);
            if (mVarN != null) {
                return mVarN.f47930b;
            }
            kotlin.text.l.x(strJ);
            throw null;
        } catch (IllegalArgumentException unused) {
            z.n(zVar, p005a4.o.c('\'', "Failed to parse type 'ULong' for input '", strJ), 0, null, 6);
            throw null;
        }
    }
}
