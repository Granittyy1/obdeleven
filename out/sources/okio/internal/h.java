package okio.internal;

import Ia.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.q;
import kotlin.collections.y;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.i;
import kotlin.text.m;
import kotlin.text.n;
import p293xa.r;
import p318zb.C;
import p318zb.InterfaceC2841h;
import p318zb.z;

/* JADX INFO: compiled from: ZipFiles.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class h {
    public static final LinkedHashMap a(ArrayList arrayList) {
        String str = z.f49122c;
        z zVarA = z.a.a("/", false);
        LinkedHashMap linkedHashMapT = y.t(new Pair(zVarA, new g(zVarA, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532)));
        for (g gVar : q.h0(arrayList, new p020b7.c(2))) {
            if (((g) linkedHashMapT.put(gVar.f45728a, gVar)) == null) {
                while (true) {
                    z zVar = gVar.f45728a;
                    z zVarB = zVar.b();
                    if (zVarB == null) {
                        break;
                    }
                    g gVar2 = (g) linkedHashMapT.get(zVarB);
                    if (gVar2 != null) {
                        gVar2.f45743q.add(zVar);
                        break;
                    }
                    g gVar3 = new g(zVarB, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                    linkedHashMapT.put(zVarB, gVar3);
                    gVar3.f45743q.add(zVar);
                    gVar = gVar3;
                }
            }
        }
        return linkedHashMapT;
    }

    public static final String b(int i10) {
        O.h.c(16);
        String string = Integer.toString(i10, 16);
        i.d(string, "toString(...)");
        return "0x".concat(string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final g c(final C c10) throws IOException {
        int iQ0 = c10.q0();
        if (iQ0 != 33639248) {
            throw new IOException("bad zip: expected " + b(33639248) + " but was " + b(iQ0));
        }
        c10.skip(4L);
        short sB0 = c10.B0();
        int i10 = sB0 & 65535;
        if ((sB0 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + b(i10));
        }
        int iB0 = c10.B0() & 65535;
        int iB1 = c10.B0() & 65535;
        int iB2 = c10.B0() & 65535;
        long jQ0 = ((long) c10.q0()) & 4294967295L;
        final Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.element = ((long) c10.q0()) & 4294967295L;
        final Ref$LongRef ref$LongRef2 = new Ref$LongRef();
        ref$LongRef2.element = ((long) c10.q0()) & 4294967295L;
        int iB3 = c10.B0() & 65535;
        int iB4 = c10.B0() & 65535;
        int iB5 = c10.B0() & 65535;
        c10.skip(8L);
        final Ref$LongRef ref$LongRef3 = new Ref$LongRef();
        ref$LongRef3.element = ((long) c10.q0()) & 4294967295L;
        String strS = c10.s(iB3);
        if (n.K(strS, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j = ref$LongRef2.element == 4294967295L ? 8 : 0L;
        if (ref$LongRef.element == 4294967295L) {
            j += (long) 8;
        }
        if (ref$LongRef3.element == 4294967295L) {
            j += (long) 8;
        }
        final long j10 = j;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        final Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        d(c10, iB4, new p<Integer, Long, r>() { // from class: okio.internal.ZipFilesKt$readCentralDirectoryZipEntry$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // Ia.p
            public final r invoke(Integer num, Long l10) throws IOException {
                int iIntValue = num.intValue();
                long jLongValue = l10.longValue();
                if (iIntValue == 1) {
                    Ref$BooleanRef ref$BooleanRef2 = ref$BooleanRef;
                    if (ref$BooleanRef2.element) {
                        throw new IOException("bad zip: zip64 extra repeated");
                    }
                    ref$BooleanRef2.element = true;
                    if (jLongValue < j10) {
                        throw new IOException("bad zip: zip64 extra too short");
                    }
                    Ref$LongRef ref$LongRef4 = ref$LongRef2;
                    long jF0 = ref$LongRef4.element;
                    if (jF0 == 4294967295L) {
                        jF0 = c10.F0();
                    }
                    ref$LongRef4.element = jF0;
                    Ref$LongRef ref$LongRef5 = ref$LongRef;
                    ref$LongRef5.element = ref$LongRef5.element == 4294967295L ? c10.F0() : 0L;
                    Ref$LongRef ref$LongRef6 = ref$LongRef3;
                    ref$LongRef6.element = ref$LongRef6.element == 4294967295L ? c10.F0() : 0L;
                } else if (iIntValue == 10) {
                    if (jLongValue < 4) {
                        throw new IOException("bad zip: NTFS extra too short");
                    }
                    c10.skip(4L);
                    final InterfaceC2841h interfaceC2841h = c10;
                    int i11 = (int) (jLongValue - 4);
                    final Ref$ObjectRef<Long> ref$ObjectRef4 = ref$ObjectRef;
                    final Ref$ObjectRef<Long> ref$ObjectRef5 = ref$ObjectRef2;
                    final Ref$ObjectRef<Long> ref$ObjectRef6 = ref$ObjectRef3;
                    h.d(interfaceC2841h, i11, new p<Integer, Long, r>() { // from class: okio.internal.ZipFilesKt$readCentralDirectoryZipEntry$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX WARN: Type inference failed for: r6v10, types: [T, java.lang.Long] */
                        /* JADX WARN: Type inference failed for: r6v12, types: [T, java.lang.Long] */
                        /* JADX WARN: Type inference failed for: r6v8, types: [T, java.lang.Long] */
                        @Override // Ia.p
                        public final r invoke(Integer num2, Long l11) throws IOException {
                            int iIntValue2 = num2.intValue();
                            long jLongValue2 = l11.longValue();
                            if (iIntValue2 == 1) {
                                Ref$ObjectRef<Long> ref$ObjectRef7 = ref$ObjectRef4;
                                if (ref$ObjectRef7.element != null) {
                                    throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                                }
                                if (jLongValue2 != 24) {
                                    throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                                }
                                ref$ObjectRef7.element = Long.valueOf(interfaceC2841h.F0());
                                ref$ObjectRef5.element = Long.valueOf(interfaceC2841h.F0());
                                ref$ObjectRef6.element = Long.valueOf(interfaceC2841h.F0());
                            }
                            return r.f47939a;
                        }
                    });
                }
                return r.f47939a;
            }
        });
        if (j10 > 0 && !ref$BooleanRef.element) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String strS2 = c10.s(iB5);
        String str = z.f49122c;
        return new g(z.a.a("/", false).d(strS), m.C(strS, "/", false), strS2, jQ0, ref$LongRef.element, ref$LongRef2.element, iB0, ref$LongRef3.element, iB2, iB1, (Long) ref$ObjectRef.element, (Long) ref$ObjectRef2.element, (Long) ref$ObjectRef3.element, 57344);
    }

    public static final void d(InterfaceC2841h interfaceC2841h, int i10, p<? super Integer, ? super Long, r> pVar) throws IOException {
        long j = i10;
        while (j != 0) {
            if (j < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iB0 = interfaceC2841h.B0() & 65535;
            long jB0 = ((long) interfaceC2841h.B0()) & 65535;
            long j10 = j - ((long) 4);
            if (j10 < jB0) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            interfaceC2841h.N0(jB0);
            long j11 = interfaceC2841h.f().f49074c;
            pVar.invoke(Integer.valueOf(iB0), Long.valueOf(jB0));
            long j12 = (interfaceC2841h.f().f49074c + jB0) - j11;
            if (j12 < 0) {
                throw new IOException(J4.i.b(iB0, "unsupported zip: too many bytes processed for "));
            }
            if (j12 > 0) {
                interfaceC2841h.f().skip(j12);
            }
            j = j10 - jB0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final g e(final C c10, g gVar) throws IOException {
        int iQ0 = c10.q0();
        if (iQ0 != 67324752) {
            throw new IOException("bad zip: expected " + b(67324752) + " but was " + b(iQ0));
        }
        c10.skip(2L);
        short sB0 = c10.B0();
        int i10 = sB0 & 65535;
        if ((sB0 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + b(i10));
        }
        c10.skip(18L);
        long jB0 = ((long) c10.B0()) & 65535;
        int iB0 = c10.B0() & 65535;
        c10.skip(jB0);
        if (gVar == null) {
            c10.skip(iB0);
            return null;
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        final Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        d(c10, iB0, new p<Integer, Long, r>() { // from class: okio.internal.ZipFilesKt$readOrSkipLocalHeader$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX WARN: Type inference failed for: r12v10, types: [T, java.lang.Integer] */
            /* JADX WARN: Type inference failed for: r12v5, types: [T, java.lang.Integer] */
            /* JADX WARN: Type inference failed for: r12v8, types: [T, java.lang.Integer] */
            @Override // Ia.p
            public final r invoke(Integer num, Long l10) throws IOException {
                int iIntValue = num.intValue();
                long jLongValue = l10.longValue();
                if (iIntValue == 21589) {
                    if (jLongValue < 1) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    byte b10 = c10.readByte();
                    boolean z10 = (b10 & 1) == 1;
                    boolean z11 = (b10 & 2) == 2;
                    boolean z12 = (b10 & 4) == 4;
                    InterfaceC2841h interfaceC2841h = c10;
                    long j = z10 ? 5L : 1L;
                    if (z11) {
                        j += 4;
                    }
                    if (z12) {
                        j += 4;
                    }
                    if (jLongValue < j) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z10) {
                        ref$ObjectRef.element = Integer.valueOf(interfaceC2841h.q0());
                    }
                    if (z11) {
                        ref$ObjectRef2.element = Integer.valueOf(c10.q0());
                    }
                    if (z12) {
                        ref$ObjectRef3.element = Integer.valueOf(c10.q0());
                    }
                }
                return r.f47939a;
            }
        });
        return new g(gVar.f45728a, gVar.f45729b, gVar.f45730c, gVar.f45731d, gVar.f45732e, gVar.f45733f, gVar.f45734g, gVar.f45735h, gVar.f45736i, gVar.j, gVar.f45737k, gVar.f45738l, gVar.f45739m, (Integer) ref$ObjectRef.element, (Integer) ref$ObjectRef2.element, (Integer) ref$ObjectRef3.element);
    }
}
