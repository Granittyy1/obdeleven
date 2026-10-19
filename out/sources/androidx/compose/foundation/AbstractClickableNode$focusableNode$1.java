package androidx.compose.foundation;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.C2680e;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class AbstractClickableNode$focusableNode$1 extends FunctionReferenceImpl implements Ia.l<Boolean, p293xa.r> {
    /* JADX WARN: Code duplicated, block: B:19:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x005e A[LOOP:0: B:10:0x001c->B:20:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0061 A[EDGE_INSN: B:24:0x0061->B:21:0x0061 BREAK  A[LOOP:0: B:10:0x001c->B:20:0x005e], SYNTHETIC] */
    public final void h(boolean z10) {
        AbstractClickableNode abstractClickableNode = (AbstractClickableNode) this.receiver;
        if (z10) {
            abstractClickableNode.W1();
            return;
        }
        androidx.compose.foundation.interaction.k kVar = abstractClickableNode.f9686r;
        androidx.collection.E<androidx.compose.foundation.interaction.m.b> e10 = abstractClickableNode.f9681C;
        if (kVar != null) {
            Object[] objArr = e10.f9201c;
            long[] jArr = e10.f9199a;
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
                                C2680e.c(abstractClickableNode.E1(), null, null, new AbstractClickableNode$onFocusChange$1$1(abstractClickableNode, (androidx.compose.foundation.interaction.m.b) objArr[(i10 << 3) + i12], null), 3);
                            }
                            j >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        } else if (i10 != length) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
        }
        e10.c();
        abstractClickableNode.X1();
    }

    @Override // Ia.l
    public final /* bridge */ /* synthetic */ p293xa.r invoke(Boolean bool) {
        h(bool.booleanValue());
        return p293xa.r.f47939a;
    }
}
