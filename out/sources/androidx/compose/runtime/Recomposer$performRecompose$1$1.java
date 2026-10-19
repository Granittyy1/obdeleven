package androidx.compose.runtime;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
final class Recomposer$performRecompose$1$1 extends Lambda implements Ia.a<p293xa.r> {
    final /* synthetic */ InterfaceC1115w $composition;
    final /* synthetic */ androidx.collection.L<Object> $modifiedValues;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$performRecompose$1$1(androidx.collection.L<Object> l10, InterfaceC1115w interfaceC1115w) {
        super(0);
        this.$modifiedValues = l10;
        this.$composition = interfaceC1115w;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[LOOP:0: B:5:0x000f->B:15:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[EDGE_INSN: B:19:0x0047->B:16:0x0047 BREAK  A[LOOP:0: B:5:0x000f->B:15:0x0044], SYNTHETIC] */
    @Override // Ia.a
    public final p293xa.r invoke() {
        androidx.collection.L<Object> l10 = this.$modifiedValues;
        InterfaceC1115w interfaceC1115w = this.$composition;
        Object[] objArr = l10.f9123b;
        long[] jArr = l10.f9122a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j = jArr[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j) < 128) {
                            interfaceC1115w.n(objArr[(i10 << 3) + i12]);
                        }
                        j >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return p293xa.r.f47939a;
    }
}
