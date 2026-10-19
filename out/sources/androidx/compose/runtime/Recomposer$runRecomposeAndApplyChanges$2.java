package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", l = {580, 591}, m = "invokeSuspend")
public final class Recomposer$runRecomposeAndApplyChanges$2 extends SuspendLambda implements Ia.q<kotlinx.coroutines.A, O, kotlin.coroutines.c<? super p293xa.r>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeAndApplyChanges$2(Recomposer recomposer, kotlin.coroutines.c<? super Recomposer$runRecomposeAndApplyChanges$2> cVar) {
        super(3, cVar);
        this.this$0 = recomposer;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0082  */
    /* JADX WARN: Code duplicated, block: B:24:0x0085 A[Catch: all -> 0x002c, LOOP:1: B:12:0x0042->B:24:0x0085, LOOP_END, TryCatch #0 {all -> 0x002c, blocks: (B:4:0x000d, B:6:0x001d, B:9:0x002f, B:12:0x0042, B:14:0x004d, B:16:0x0059, B:18:0x0063, B:19:0x0073, B:24:0x0085, B:25:0x008d, B:28:0x009a, B:30:0x00a9, B:32:0x00b5, B:34:0x00bf, B:35:0x00c9, B:39:0x00d5, B:40:0x00d8, B:43:0x00e8, B:45:0x00f7, B:47:0x0103, B:49:0x010d, B:50:0x011d, B:56:0x0139, B:57:0x013c), top: B:62:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d5 A[Catch: all -> 0x002c, LOOP:3: B:28:0x009a->B:39:0x00d5, LOOP_END, TryCatch #0 {all -> 0x002c, blocks: (B:4:0x000d, B:6:0x001d, B:9:0x002f, B:12:0x0042, B:14:0x004d, B:16:0x0059, B:18:0x0063, B:19:0x0073, B:24:0x0085, B:25:0x008d, B:28:0x009a, B:30:0x00a9, B:32:0x00b5, B:34:0x00bf, B:35:0x00c9, B:39:0x00d5, B:40:0x00d8, B:43:0x00e8, B:45:0x00f7, B:47:0x0103, B:49:0x010d, B:50:0x011d, B:56:0x0139, B:57:0x013c), top: B:62:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:66:0x008d A[EDGE_INSN: B:66:0x008d->B:25:0x008d BREAK  A[LOOP:1: B:12:0x0042->B:24:0x0085], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d8 A[EDGE_INSN: B:71:0x00d8->B:40:0x00d8 BREAK  A[LOOP:3: B:28:0x009a->B:39:0x00d5], SYNTHETIC] */
    public static final void a(Recomposer recomposer, List list, List list2, List list3, androidx.collection.L l10, androidx.collection.L l11, androidx.collection.L l12, androidx.collection.L l13) {
        synchronized (recomposer.f12892b) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    InterfaceC1115w interfaceC1115w = (InterfaceC1115w) list3.get(i10);
                    interfaceC1115w.r();
                    recomposer.H(interfaceC1115w);
                }
                list3.clear();
                Object[] objArr = l10.f9123b;
                long[] jArr = l10.f9122a;
                int length = jArr.length - 2;
                long j = -9187201950435737472L;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j10 = jArr[i11];
                        int i12 = length;
                        if ((((~j10) << 7) & j10 & j) == j) {
                            length = i12;
                            if (i11 != length) {
                                break;
                                break;
                            } else {
                                i11++;
                                j = -9187201950435737472L;
                            }
                        } else {
                            int i13 = 8 - ((~(i11 - i12)) >>> 31);
                            for (int i14 = 0; i14 < i13; i14++) {
                                if ((j10 & 255) < 128) {
                                    InterfaceC1115w interfaceC1115w2 = (InterfaceC1115w) objArr[(i11 << 3) + i14];
                                    interfaceC1115w2.r();
                                    recomposer.H(interfaceC1115w2);
                                }
                                j10 >>= 8;
                            }
                            if (i13 != 8) {
                                break;
                            }
                            length = i12;
                            if (i11 != length) {
                                break;
                            }
                            i11++;
                            j = -9187201950435737472L;
                        }
                    }
                }
                l10.e();
                Object[] objArr2 = l11.f9123b;
                long[] jArr2 = l11.f9122a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j11 = jArr2[i15];
                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i15 != length2) {
                                break;
                                break;
                            }
                            i15++;
                        } else {
                            int i16 = 8 - ((~(i15 - length2)) >>> 31);
                            for (int i17 = 0; i17 < i16; i17++) {
                                if ((j11 & 255) < 128) {
                                    ((InterfaceC1115w) objArr2[(i15 << 3) + i17]).t();
                                }
                                j11 >>= 8;
                            }
                            if (i16 != 8) {
                                break;
                            } else if (i15 != length2) {
                                break;
                            } else {
                                i15++;
                            }
                        }
                    }
                }
                l11.e();
                l12.e();
                Object[] objArr3 = l13.f9123b;
                long[] jArr3 = l13.f9122a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i18 = 0;
                    while (true) {
                        long j12 = jArr3[i18];
                        if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i19 = 8 - ((~(i18 - length3)) >>> 31);
                            for (int i20 = 0; i20 < i19; i20++) {
                                if ((j12 & 255) < 128) {
                                    InterfaceC1115w interfaceC1115w3 = (InterfaceC1115w) objArr3[(i18 << 3) + i20];
                                    interfaceC1115w3.r();
                                    recomposer.H(interfaceC1115w3);
                                }
                                j12 >>= 8;
                            }
                            if (i19 != 8) {
                                break;
                            }
                        }
                        if (i18 == length3) {
                            break;
                        } else {
                            i18++;
                        }
                    }
                }
                l13.e();
                p293xa.r rVar = p293xa.r.f47939a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void l(List list, Recomposer recomposer) {
        list.clear();
        synchronized (recomposer.f12892b) {
            try {
                ArrayList arrayList = recomposer.j;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.add((T) arrayList.get(i10));
                }
                recomposer.j.clear();
                p293xa.r rVar = p293xa.r.f47939a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Ia.q
    public final Object invoke(kotlinx.coroutines.A a10, O o10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.this$0, cVar);
        recomposer$runRecomposeAndApplyChanges$2.L$0 = o10;
        recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(p293xa.r.f47939a);
        return CoroutineSingletons.f43038b;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x00b7 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:16:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:20:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:21:0x00eb A[Catch: all -> 0x0102, TRY_LEAVE, TryCatch #0 {, blocks: (B:18:0x00e3, B:21:0x00eb), top: B:75:0x00e3 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:33:0x0105  */
    /* JADX WARN: Code duplicated, block: B:35:0x0109 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x010a  */
    /* JADX WARN: Code duplicated, block: B:39:0x011c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0167 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x0168  */
    /* JADX WARN: Code duplicated, block: B:74:0x0232  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0168 -> B:43:0x016e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0232 -> B:71:0x022d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
