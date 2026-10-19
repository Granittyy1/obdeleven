package kotlinx.serialization.json.internal;

import java.util.ArrayList;
import java.util.Arrays;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import p037cb.AbstractC1515b;
import p037cb.C1549v;
import p050db.AbstractC2184a;

/* JADX INFO: compiled from: StreamingJsonDecoder.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class w extends C.g implements p050db.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC2184a f44016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WriteMode f44017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z f44018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p062eb.b f44019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44020g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f44021h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p050db.f f44022i;
    public final JsonElementMarker j;

    /* JADX INFO: compiled from: StreamingJsonDecoder.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f44023a;
    }

    public w(AbstractC2184a json, WriteMode writeMode, z zVar, p011ab.e descriptor, a aVar) {
        kotlin.jvm.internal.i.e(json, "json");
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        this.f44016c = json;
        this.f44017d = writeMode;
        this.f44018e = zVar;
        this.f44019f = json.f34643b;
        this.f44020g = -1;
        this.f44021h = aVar;
        p050db.f fVar = json.f34642a;
        this.f44022i = fVar;
        this.j = fVar.f34672f ? null : new JsonElementMarker(descriptor);
    }

    @Override // C.g, p024bb.c
    public final byte C() {
        z zVar = this.f44018e;
        long jH = zVar.h();
        byte b10 = (byte) jH;
        if (jH == b10) {
            return b10;
        }
        z.n(zVar, "Failed to parse byte for input '" + jH + '\'', 0, null, 6);
        throw null;
    }

    @Override // C.g, p024bb.c
    public final short D() {
        z zVar = this.f44018e;
        long jH = zVar.h();
        short s10 = (short) jH;
        if (jH == s10) {
            return s10;
        }
        z.n(zVar, "Failed to parse short for input '" + jH + '\'', 0, null, 6);
        throw null;
    }

    @Override // C.g, p024bb.c
    public final float E() {
        z zVar = this.f44018e;
        String strJ = zVar.j();
        try {
            float f10 = Float.parseFloat(strJ);
            if (this.f44016c.f34642a.f34676k || !(Float.isInfinite(f10) || Float.isNaN(f10))) {
                return f10;
            }
            O.e.A(zVar, Float.valueOf(f10));
            throw null;
        } catch (IllegalArgumentException unused) {
            z.n(zVar, p005a4.o.c('\'', "Failed to parse type 'float' for input '", strJ), 0, null, 6);
            throw null;
        }
    }

    @Override // C.g, p024bb.c
    public final double H() {
        z zVar = this.f44018e;
        String strJ = zVar.j();
        try {
            double d10 = Double.parseDouble(strJ);
            if (this.f44016c.f34642a.f34676k || !(Double.isInfinite(d10) || Double.isNaN(d10))) {
                return d10;
            }
            O.e.A(zVar, Double.valueOf(d10));
            throw null;
        } catch (IllegalArgumentException unused) {
            z.n(zVar, p005a4.o.c('\'', "Failed to parse type 'double' for input '", strJ), 0, null, 6);
            throw null;
        }
    }

    @Override // C.g, p024bb.c
    public final p024bb.a a(p011ab.e descriptor) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        AbstractC2184a abstractC2184a = this.f44016c;
        WriteMode writeModeB = C.b(descriptor, abstractC2184a);
        z zVar = this.f44018e;
        n nVar = zVar.f44035b;
        int i10 = nVar.f43997c + 1;
        nVar.f43997c = i10;
        Object[] objArr = nVar.f43995a;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i11);
            kotlin.jvm.internal.i.d(objArrCopyOf, "copyOf(...)");
            nVar.f43995a = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(nVar.f43996b, i11);
            kotlin.jvm.internal.i.d(iArrCopyOf, "copyOf(...)");
            nVar.f43996b = iArrCopyOf;
        }
        nVar.f43995a[i10] = descriptor;
        zVar.g(writeModeB.begin);
        if (zVar.s() == 4) {
            z.n(zVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        int iOrdinal = writeModeB.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return new w(this.f44016c, writeModeB, zVar, descriptor, this.f44021h);
        }
        if (this.f44017d == writeModeB && abstractC2184a.f34642a.f34672f) {
            return this;
        }
        return new w(this.f44016c, writeModeB, zVar, descriptor, this.f44021h);
    }

    @Override // p024bb.a
    public final C.g b() {
        return this.f44019f;
    }

    @Override // C.g, p024bb.a
    public final void c(p011ab.e descriptor) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        AbstractC2184a abstractC2184a = this.f44016c;
        if (abstractC2184a.f34642a.f34668b && descriptor.f() == 0) {
            while (o(descriptor) != -1) {
            }
        }
        z zVar = this.f44018e;
        if (zVar.w() && !abstractC2184a.f34642a.f34679n) {
            O.e.u(zVar, "");
            throw null;
        }
        zVar.g(this.f44017d.end);
        n nVar = zVar.f44035b;
        int i10 = nVar.f43997c;
        int[] iArr = nVar.f43996b;
        if (iArr[i10] == -2) {
            iArr[i10] = -1;
            nVar.f43997c = i10 - 1;
        }
        int i11 = nVar.f43997c;
        if (i11 != -1) {
            nVar.f43997c = i11 - 1;
        }
    }

    @Override // C.g, p024bb.a
    public final <T> T e(p011ab.e descriptor, int i10, Ya.a<? extends T> deserializer, T t8) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        kotlin.jvm.internal.i.e(deserializer, "deserializer");
        boolean z10 = this.f44017d == WriteMode.MAP && (i10 & 1) == 0;
        n nVar = this.f44018e.f44035b;
        if (z10) {
            int[] iArr = nVar.f43996b;
            int i11 = nVar.f43997c;
            if (iArr[i11] == -2) {
                nVar.f43995a[i11] = n.a.f43998a;
            }
        }
        T t10 = (T) super.e(descriptor, i10, deserializer, t8);
        if (z10) {
            int[] iArr2 = nVar.f43996b;
            int i12 = nVar.f43997c;
            if (iArr2[i12] != -2) {
                int i13 = i12 + 1;
                nVar.f43997c = i13;
                Object[] objArr = nVar.f43995a;
                if (i13 == objArr.length) {
                    int i14 = i13 * 2;
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, i14);
                    kotlin.jvm.internal.i.d(objArrCopyOf, "copyOf(...)");
                    nVar.f43995a = objArrCopyOf;
                    int[] iArrCopyOf = Arrays.copyOf(nVar.f43996b, i14);
                    kotlin.jvm.internal.i.d(iArrCopyOf, "copyOf(...)");
                    nVar.f43996b = iArrCopyOf;
                }
            }
            Object[] objArr2 = nVar.f43995a;
            int i15 = nVar.f43997c;
            objArr2[i15] = t10;
            nVar.f43996b[i15] = -2;
        }
        return t10;
    }

    @Override // C.g, p024bb.c
    public final boolean f() {
        boolean z10;
        boolean z11;
        z zVar = this.f44018e;
        int iV = zVar.v();
        String str = zVar.f44038e;
        if (iV == str.length()) {
            z.n(zVar, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iV) == '\"') {
            iV++;
            z10 = true;
        } else {
            z10 = false;
        }
        int iU = zVar.u(iV);
        if (iU >= str.length() || iU == -1) {
            z.n(zVar, "EOF", 0, null, 6);
            throw null;
        }
        int i10 = iU + 1;
        int iCharAt = str.charAt(iU) | ' ';
        if (iCharAt == 102) {
            zVar.c(i10, "alse");
            z11 = false;
        } else {
            if (iCharAt != 116) {
                z.n(zVar, "Expected valid boolean literal prefix, but had '" + zVar.j() + '\'', 0, null, 6);
                throw null;
            }
            zVar.c(i10, "rue");
            z11 = true;
        }
        if (z10) {
            if (zVar.f44034a == str.length()) {
                z.n(zVar, "EOF", 0, null, 6);
                throw null;
            }
            if (str.charAt(zVar.f44034a) != '\"') {
                z.n(zVar, "Expected closing quotation mark", 0, null, 6);
                throw null;
            }
            zVar.f44034a++;
        }
        return z11;
    }

    @Override // C.g, p024bb.c
    public final char g() {
        z zVar = this.f44018e;
        String strJ = zVar.j();
        if (strJ.length() == 1) {
            return strJ.charAt(0);
        }
        z.n(zVar, p005a4.o.c('\'', "Expected single char, but got '", strJ), 0, null, 6);
        throw null;
    }

    @Override // p050db.g
    public final p050db.h i() {
        return new u(this.f44016c.f34642a, this.f44018e).b();
    }

    @Override // C.g, p024bb.c
    public final int k() {
        z zVar = this.f44018e;
        long jH = zVar.h();
        int i10 = (int) jH;
        if (jH == i10) {
            return i10;
        }
        z.n(zVar, "Failed to parse int for input '" + jH + '\'', 0, null, 6);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x012c  */
    /* JADX WARN: Code duplicated, block: B:46:0x012d  */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x012d, please report this as an issue */
    @Override // C.g, p024bb.c
    public final <T> T m(Ya.a<? extends T> deserializer) {
        String message;
        AbstractC2184a abstractC2184a = this.f44016c;
        z zVar = this.f44018e;
        n nVar = zVar.f44035b;
        kotlin.jvm.internal.i.e(deserializer, "deserializer");
        try {
            if ((deserializer instanceof AbstractC1515b) && !abstractC2184a.f34642a.f34675i) {
                String strA = v.a(((AbstractC1515b) deserializer).getDescriptor(), abstractC2184a);
                String strR = zVar.r(strA, this.f44022i.f34669c);
                String strE = null;
                if (strR != null) {
                    try {
                        Ya.a aVarD = F8.a.d((AbstractC1515b) deserializer, this, strR);
                        a aVar = new a();
                        aVar.f44023a = strA;
                        this.f44021h = aVar;
                        return (T) aVarD.deserialize(this);
                    } catch (SerializationException e10) {
                        String message2 = e10.getMessage();
                        kotlin.jvm.internal.i.b(message2);
                        String strA0 = kotlin.text.n.a0(kotlin.text.n.m0(message2, '\n'), ".");
                        String message3 = e10.getMessage();
                        kotlin.jvm.internal.i.b(message3);
                        z.n(zVar, strA0, 0, kotlin.text.n.j0('\n', message3, ""), 2);
                        throw null;
                    }
                }
                if ((deserializer instanceof AbstractC1515b) && !abstractC2184a.f34642a.f34675i) {
                    String strA2 = v.a(((AbstractC1515b) deserializer).getDescriptor(), abstractC2184a);
                    p050db.h hVarI = i();
                    String strA3 = ((AbstractC1515b) deserializer).getDescriptor().a();
                    if (!(hVarI instanceof p050db.z)) {
                        throw O.e.g("Expected " + kotlin.jvm.internal.l.a(p050db.z.class).a() + ", but had " + kotlin.jvm.internal.l.a(hVarI.getClass()).a() + " as the serialized body of " + strA3 + " at element: " + nVar.a(), hVarI.toString(), -1);
                    }
                    p050db.z zVar2 = (p050db.z) hVarI;
                    p050db.h hVar = (p050db.h) zVar2.get(strA2);
                    if (hVar != null) {
                        p050db.B b10 = p050db.i.b(hVar);
                        if (!(b10 instanceof p050db.w)) {
                            strE = b10.e();
                        }
                    }
                    try {
                        return (T) S4.o.o(abstractC2184a, strA2, zVar2, F8.a.d((AbstractC1515b) deserializer, this, strE));
                    } catch (SerializationException e11) {
                        String message4 = e11.getMessage();
                        kotlin.jvm.internal.i.b(message4);
                        throw O.e.g(message4, zVar2.toString(), -1);
                    }
                }
                return deserializer.deserialize(this);
                message = e.getMessage();
                kotlin.jvm.internal.i.b(message);
                if (kotlin.text.n.J(message, "at path", false)) {
                    throw e;
                }
                throw new MissingFieldException(e.a(), e.getMessage() + " at path: " + nVar.a(), e);
            }
            return deserializer.deserialize(this);
        } catch (MissingFieldException e12) {
            message = e12.getMessage();
            kotlin.jvm.internal.i.b(message);
            if (kotlin.text.n.J(message, "at path", false)) {
                throw e12;
            }
            throw new MissingFieldException(e12.a(), e12.getMessage() + " at path: " + nVar.a(), e12);
        }
    }

    @Override // C.g, p024bb.c
    public final String n() {
        p050db.f fVar = this.f44022i;
        z zVar = this.f44018e;
        return fVar.f34669c ? zVar.k() : zVar.i();
    }

    /* JADX WARN: Code duplicated, block: B:174:0x02b5 A[EDGE_INSN: B:174:0x02b5->B:175:0x02b6 BREAK  A[LOOP:2: B:157:0x024a->B:205:?]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p024bb.a
    public final int o(p011ab.e descriptor) {
        boolean zW;
        boolean z10;
        boolean z11;
        char c10;
        String strT;
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        WriteMode writeMode = this.f44017d;
        int iOrdinal = writeMode.ordinal();
        z zVar = this.f44018e;
        boolean z12 = true;
        int i10 = 0;
        zW = false;
        boolean zW2 = false;
        char c11 = ':';
        AbstractC2184a abstractC2184a = this.f44016c;
        int i11 = -1;
        n nVar = zVar.f44035b;
        if (iOrdinal == 0) {
            boolean zW3 = zVar.w();
            while (true) {
                boolean zB = zVar.b();
                JsonElementMarker jsonElementMarker = this.j;
                if (zB) {
                    p050db.f fVar = this.f44022i;
                    boolean z13 = fVar.f34669c;
                    String strK = z13 ? zVar.k() : zVar.d();
                    zVar.g(c11);
                    int iB = m.b(descriptor, abstractC2184a, strK);
                    if (iB != -3) {
                        if (fVar.f34674h) {
                            boolean zJ = descriptor.j(iB);
                            p011ab.e eVarI = descriptor.i(iB);
                            if (!zJ || eVarI.c() || !zVar.x(z12)) {
                                if (kotlin.jvm.internal.i.a(eVarI.e(), ab.m.b.f8123a) && ((!eVarI.c() || !zVar.x(false)) && (strT = zVar.t(z13)) != null)) {
                                    int iB2 = m.b(eVarI, abstractC2184a, strT);
                                    boolean z14 = !abstractC2184a.f34642a.f34672f && eVarI.c();
                                    if (iB2 == -3 && (zJ || z14)) {
                                        zVar.i();
                                    }
                                }
                            }
                            zW = zVar.w();
                            z10 = false;
                        }
                        if (jsonElementMarker != null) {
                            C1549v c1549v = jsonElementMarker.f43966a;
                            if (iB < 64) {
                                c1549v.f22663c |= 1 << iB;
                            } else {
                                int i12 = (iB >>> 6) - 1;
                                long[] jArr = c1549v.f22664d;
                                jArr[i12] = (1 << (iB & 63)) | jArr[i12];
                            }
                        }
                        i11 = iB;
                    } else {
                        zW = false;
                        z10 = true;
                    }
                    if (z10) {
                        if (!fVar.f34668b) {
                            a aVar = this.f44021h;
                            if (aVar == null || !kotlin.jvm.internal.i.a(aVar.f44023a, strK)) {
                                zVar.m(kotlin.text.n.T(6, zVar.q().subSequence(0, zVar.f44034a).toString(), strK), p005a4.o.c('\'', "Encountered an unknown key '", strK), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                                throw null;
                            }
                            aVar.f44023a = null;
                        }
                        ArrayList arrayList = new ArrayList();
                        byte bS = zVar.s();
                        if (bS == 8 || bS == 6) {
                            while (true) {
                                byte bS2 = zVar.s();
                                z11 = true;
                                if (bS2 != 1) {
                                    c10 = 6;
                                    if (bS2 == 8 || bS2 == 6) {
                                        arrayList.add(Byte.valueOf(bS2));
                                    } else {
                                        String str = zVar.f44038e;
                                        if (bS2 == 9) {
                                            if (((Number) kotlin.collections.q.V(arrayList)).byteValue() != 8) {
                                                throw O.e.g("found ] instead of } at path: " + nVar, str, zVar.f44034a);
                                            }
                                            kotlin.collections.p.E(arrayList);
                                        } else if (bS2 == 7) {
                                            if (((Number) kotlin.collections.q.V(arrayList)).byteValue() != 6) {
                                                throw O.e.g("found } instead of ] at path: " + nVar, str, zVar.f44034a);
                                            }
                                            kotlin.collections.p.E(arrayList);
                                        } else if (bS2 == 10) {
                                            z.n(zVar, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                            throw null;
                                        }
                                        c10 = 6;
                                    }
                                    zVar.e();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                } else if (z13) {
                                    zVar.j();
                                } else {
                                    zVar.d();
                                }
                            }
                        } else {
                            zVar.j();
                            z11 = true;
                            c10 = 6;
                        }
                        zW3 = zVar.w();
                        z12 = z11;
                    } else {
                        zW3 = zW;
                        z12 = true;
                    }
                    c11 = ':';
                } else {
                    if (zW3 && !abstractC2184a.f34642a.f34679n) {
                        O.e.v(zVar);
                        throw null;
                    }
                    if (jsonElementMarker == null) {
                        i11 = -1;
                        break;
                    }
                    C1549v c1549v2 = jsonElementMarker.f43966a;
                    p011ab.e eVar = c1549v2.f22661a;
                    int iF = eVar.f();
                    while (true) {
                        long j = c1549v2.f22663c;
                        long j10 = -1;
                        Ia.p<p011ab.e, Integer, Boolean> pVar = c1549v2.f22662b;
                        if (j == -1) {
                            if (iF <= 64) {
                                i11 = -1;
                                break;
                            }
                            long[] jArr2 = c1549v2.f22664d;
                            int length = jArr2.length;
                            loop3: while (true) {
                                if (i10 >= length) {
                                    i11 = -1;
                                    break;
                                }
                                int i13 = i10 + 1;
                                int i14 = i13 * 64;
                                long j11 = jArr2[i10];
                                while (true) {
                                    if (j11 != j10) {
                                        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j11);
                                        j11 |= 1 << iNumberOfTrailingZeros;
                                        int i15 = iNumberOfTrailingZeros + i14;
                                        if (((Boolean) ((JsonElementMarker$origin$1) pVar).invoke(eVar, Integer.valueOf(i15))).booleanValue()) {
                                            jArr2[i10] = j11;
                                            i11 = i15;
                                            break;
                                        }
                                        j10 = -1;
                                    } else {
                                        jArr2[i10] = j11;
                                        i10 = i13;
                                        j10 = -1;
                                    }
                                }
                            }
                        } else {
                            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j);
                            c1549v2.f22663c |= 1 << iNumberOfTrailingZeros2;
                            if (((Boolean) ((JsonElementMarker$origin$1) pVar).invoke(eVar, Integer.valueOf(iNumberOfTrailingZeros2))).booleanValue()) {
                                i11 = iNumberOfTrailingZeros2;
                                break;
                            }
                        }
                    }
                }
            }
        } else if (iOrdinal != 2) {
            boolean zW4 = zVar.w();
            if (zVar.b()) {
                int i16 = this.f44020g;
                if (i16 != -1 && !zW4) {
                    z.n(zVar, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i11 = i16 + 1;
                this.f44020g = i11;
            } else if (zW4 && !abstractC2184a.f34642a.f34679n) {
                O.e.u(zVar, "array");
                throw null;
            }
        } else {
            int i17 = this.f44020g;
            Object[] objArr = i17 % 2 != 0;
            if (objArr != true) {
                zVar.g(':');
            } else if (i17 != -1) {
                zW2 = zVar.w();
            }
            if (zVar.b()) {
                if (objArr != false) {
                    if (this.f44020g == -1) {
                        int i18 = zVar.f44034a;
                        if (zW2) {
                            z.n(zVar, "Unexpected leading comma", i18, null, 4);
                            throw null;
                        }
                    } else {
                        int i19 = zVar.f44034a;
                        if (!zW2) {
                            z.n(zVar, "Expected comma after the key-value pair", i19, null, 4);
                            throw null;
                        }
                    }
                }
                i11 = this.f44020g + 1;
                this.f44020g = i11;
            } else if (zW2 && !abstractC2184a.f34642a.f34679n) {
                O.e.v(zVar);
                throw null;
            }
        }
        if (writeMode != WriteMode.MAP) {
            nVar.f43996b[nVar.f43997c] = i11;
        }
        return i11;
    }

    @Override // C.g, p024bb.c
    public final p024bb.c r(p011ab.e descriptor) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        return y.a(descriptor) ? new k(this.f44018e, this.f44016c) : this;
    }

    @Override // C.g, p024bb.c
    public final long s() {
        return this.f44018e.h();
    }

    @Override // C.g, p024bb.c
    public final boolean t() {
        JsonElementMarker jsonElementMarker = this.j;
        return ((jsonElementMarker != null ? jsonElementMarker.f43967b : false) || this.f44018e.x(true)) ? false : true;
    }

    @Override // C.g, p024bb.c
    public final int w(p011ab.e enumDescriptor) {
        kotlin.jvm.internal.i.e(enumDescriptor, "enumDescriptor");
        return m.c(enumDescriptor, this.f44016c, n(), " at path ".concat(this.f44018e.f44035b.a()));
    }
}
