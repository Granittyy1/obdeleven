package androidx.compose.runtime;

import androidx.collection.ScatterSet;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.snapshots.SnapshotKt;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2693i;
import kotlinx.coroutines.C2702l0;
import kotlinx.coroutines.InterfaceC2691h;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.flow.StateFlowImpl;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", l = {1072}, m = "invokeSuspend")
final class Recomposer$recompositionRunner$2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Ia.q<kotlinx.coroutines.A, O, kotlin.coroutines.c<? super p293xa.r>, Object> $block;
    final /* synthetic */ O $parentFrameClock;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2$3, reason: invalid class name */
    /* JADX INFO: compiled from: Recomposer.kt */
    @Aa.c(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$3", f = "Recomposer.kt", l = {1072}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ Ia.q<kotlinx.coroutines.A, O, kotlin.coroutines.c<? super p293xa.r>, Object> $block;
        final /* synthetic */ O $parentFrameClock;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Ia.q<? super kotlinx.coroutines.A, ? super O, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> qVar, O o10, kotlin.coroutines.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.$block = qVar;
            this.$parentFrameClock = o10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$block, this.$parentFrameClock, cVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass3) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                kotlinx.coroutines.A a10 = (kotlinx.coroutines.A) this.L$0;
                Ia.q<kotlinx.coroutines.A, O, kotlin.coroutines.c<? super p293xa.r>, Object> qVar = this.$block;
                O o10 = this.$parentFrameClock;
                this.label = 1;
                if (qVar.invoke(a10, o10, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return p293xa.r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Recomposer$recompositionRunner$2(Recomposer recomposer, Ia.q<? super kotlinx.coroutines.A, ? super O, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> qVar, O o10, kotlin.coroutines.c<? super Recomposer$recompositionRunner$2> cVar) {
        super(2, cVar);
        this.this$0 = recomposer;
        this.$block = qVar;
        this.$parentFrameClock = o10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        Recomposer$recompositionRunner$2 recomposer$recompositionRunner$2 = new Recomposer$recompositionRunner$2(this.this$0, this.$block, this.$parentFrameClock, cVar);
        recomposer$recompositionRunner$2.L$0 = obj;
        return recomposer$recompositionRunner$2;
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((Recomposer$recompositionRunner$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x00d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x00fa A[EDGE_INSN: B:107:0x00fa->B:58:0x00fa BREAK  A[LOOP:0: B:54:0x00e6->B:109:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x0132 A[EDGE_INSN: B:110:0x0132->B:80:0x0132 BREAK  A[LOOP:1: B:75:0x011d->B:112:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d7 A[Catch: all -> 0x00da, TryCatch #4 {all -> 0x00da, blocks: (B:46:0x00d3, B:48:0x00d7, B:51:0x00dc), top: B:102:0x00d3 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:69:0x010e A[Catch: all -> 0x0111, TryCatch #0 {all -> 0x0111, blocks: (B:67:0x010a, B:69:0x010e, B:72:0x0113), top: B:95:0x010a }] */
    /* JADX WARN: Code duplicated, block: B:77:0x012b  */
    /* JADX WARN: Code duplicated, block: B:95:0x010a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        StateFlowImpl stateFlowImpl;
        D.c cVar;
        F.b bVarP;
        InterfaceC2694i0 interfaceC2694i0;
        Throwable th;
        androidx.compose.runtime.snapshots.d dVar;
        List<InterfaceC1115w> listA;
        Recomposer recomposer;
        Recomposer.c cVar2;
        StateFlowImpl stateFlowImpl2;
        D.c cVar3;
        F.b bVarT;
        Recomposer recomposer2;
        Recomposer.c cVar4;
        StateFlowImpl stateFlowImpl3;
        D.c cVar5;
        F.b bVarT2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = (androidx.compose.runtime.snapshots.d) this.L$1;
            interfaceC2694i0 = (InterfaceC2694i0) this.L$0;
            try {
                kotlin.b.b(obj);
                dVar.dispose();
                recomposer2 = this.this$0;
                synchronized (recomposer2.f12892b) {
                    try {
                        if (recomposer2.f12893c == interfaceC2694i0) {
                            recomposer2.f12893c = null;
                        }
                        recomposer2.x();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                StateFlowImpl stateFlowImpl4 = Recomposer.f12889x;
                cVar4 = this.this$0.f12912w;
                do {
                    stateFlowImpl3 = Recomposer.f12889x;
                    cVar5 = (D.c) stateFlowImpl3.getValue();
                    bVarT2 = cVar5.t(cVar4);
                    if (cVar5 != bVarT2) {
                        break;
                    }
                } while (!stateFlowImpl3.d(cVar5, bVarT2));
                return p293xa.r.f47939a;
            } catch (Throwable th3) {
                th = th3;
                dVar.dispose();
                recomposer = this.this$0;
                synchronized (recomposer.f12892b) {
                    try {
                        if (recomposer.f12893c == interfaceC2694i0) {
                            recomposer.f12893c = null;
                        }
                        recomposer.x();
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                StateFlowImpl stateFlowImpl5 = Recomposer.f12889x;
                cVar2 = this.this$0.f12912w;
                do {
                    stateFlowImpl2 = Recomposer.f12889x;
                    cVar3 = (D.c) stateFlowImpl2.getValue();
                    bVarT = cVar3.t(cVar2);
                    if (cVar3 != bVarT) {
                        break;
                    }
                } while (!stateFlowImpl2.d(cVar3, bVarT));
                throw th;
            }
        }
        kotlin.b.b(obj);
        InterfaceC2694i0 interfaceC2694i0F = C2702l0.f(((kotlinx.coroutines.A) this.L$0).getCoroutineContext());
        Recomposer recomposer3 = this.this$0;
        synchronized (recomposer3.f12892b) {
            Throwable th5 = recomposer3.f12894d;
            if (th5 != null) {
                throw th5;
            }
            if (((Recomposer.State) recomposer3.f12909t.getValue()).compareTo(Recomposer.State.f12914c) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (recomposer3.f12893c != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            recomposer3.f12893c = interfaceC2694i0F;
            recomposer3.x();
        }
        final Recomposer recomposer4 = this.this$0;
        Ia.p<Set<? extends Object>, androidx.compose.runtime.snapshots.g, p293xa.r> pVar = new Ia.p<Set<? extends Object>, androidx.compose.runtime.snapshots.g, p293xa.r>() { // from class: androidx.compose.runtime.Recomposer$recompositionRunner$2$unregisterApplyObserver$1
            {
                super(2);
            }

            /* JADX WARN: Code duplicated, block: B:27:0x0077 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:28:0x0079 A[Catch: all -> 0x006c, LOOP:0: B:11:0x0034->B:28:0x0079, LOOP_END, TryCatch #0 {all -> 0x006c, blocks: (B:4:0x000f, B:6:0x001f, B:8:0x0026, B:11:0x0034, B:13:0x0044, B:15:0x0050, B:17:0x0059, B:19:0x0062, B:24:0x006e, B:25:0x0071, B:28:0x0079, B:38:0x009e, B:29:0x007c, B:30:0x0082, B:32:0x0088, B:34:0x0090, B:37:0x009a), top: B:48:0x000f }] */
            /* JADX WARN: Code duplicated, block: B:51:0x009e A[EDGE_INSN: B:51:0x009e->B:38:0x009e BREAK  A[LOOP:0: B:11:0x0034->B:28:0x0079], SYNTHETIC] */
            @Override // Ia.p
            public final p293xa.r invoke(Set<? extends Object> set, androidx.compose.runtime.snapshots.g gVar) {
                InterfaceC2691h<p293xa.r> interfaceC2691hX;
                Set<? extends Object> set2 = set;
                Recomposer recomposer5 = recomposer4;
                synchronized (recomposer5.f12892b) {
                    try {
                        if (((Recomposer.State) recomposer5.f12909t.getValue()).compareTo(Recomposer.State.f12917f) >= 0) {
                            androidx.collection.L<Object> l10 = recomposer5.f12897g;
                            if (set2 instanceof ScatterSetWrapper) {
                                ScatterSet<T> scatterSet = ((ScatterSetWrapper) set2).f12940b;
                                Object[] objArr = scatterSet.f9123b;
                                long[] jArr = scatterSet.f9122a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i11 = 0;
                                    while (true) {
                                        long j = jArr[i11];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                            if (i11 != length) {
                                                break;
                                                break;
                                            }
                                            i11++;
                                        } else {
                                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                                            for (int i13 = 0; i13 < i12; i13++) {
                                                if ((255 & j) < 128) {
                                                    Object obj2 = objArr[(i11 << 3) + i13];
                                                    if (!(obj2 instanceof androidx.compose.runtime.snapshots.p) || ((androidx.compose.runtime.snapshots.p) obj2).y(1)) {
                                                        l10.d(obj2);
                                                    }
                                                }
                                                j >>= 8;
                                            }
                                            if (i12 != 8) {
                                                break;
                                            }
                                            if (i11 != length) {
                                                break;
                                            }
                                            i11++;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj3 : set2) {
                                    if (!(obj3 instanceof androidx.compose.runtime.snapshots.p) || ((androidx.compose.runtime.snapshots.p) obj3).y(1)) {
                                        l10.d(obj3);
                                    }
                                }
                            }
                            interfaceC2691hX = recomposer5.x();
                        } else {
                            interfaceC2691hX = null;
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
                if (interfaceC2691hX != null) {
                    ((C2693i) interfaceC2691hX).resumeWith(p293xa.r.f47939a);
                }
                return p293xa.r.f47939a;
            }
        };
        SnapshotKt.f(SnapshotKt.f13152a);
        synchronized (SnapshotKt.f13154c) {
            SnapshotKt.f13159h = kotlin.collections.q.d0((Collection) SnapshotKt.f13159h, pVar);
            p293xa.r rVar = p293xa.r.f47939a;
        }
        androidx.compose.runtime.snapshots.f fVar = new androidx.compose.runtime.snapshots.f(pVar);
        StateFlowImpl stateFlowImpl6 = Recomposer.f12889x;
        Recomposer.c cVar6 = this.this$0.f12912w;
        do {
            stateFlowImpl = Recomposer.f12889x;
            cVar = (D.c) stateFlowImpl.getValue();
            bVarP = cVar.p(cVar6);
            if (cVar == bVarP) {
                break;
            }
        } while (!stateFlowImpl.d(cVar, bVarP));
        try {
            Recomposer recomposer5 = this.this$0;
            synchronized (recomposer5.f12892b) {
                listA = recomposer5.A();
            }
            int size = listA.size();
            for (int i11 = 0; i11 < size; i11++) {
                listA.get(i11).v();
            }
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$block, this.$parentFrameClock, null);
            this.L$0 = interfaceC2694i0F;
            this.L$1 = fVar;
            this.label = 1;
            if (kotlinx.coroutines.B.d(anonymousClass3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            interfaceC2694i0 = interfaceC2694i0F;
            dVar = fVar;
            dVar.dispose();
            recomposer2 = this.this$0;
            synchronized (recomposer2.f12892b) {
                if (recomposer2.f12893c == interfaceC2694i0) {
                    recomposer2.f12893c = null;
                }
                recomposer2.x();
                StateFlowImpl stateFlowImpl7 = Recomposer.f12889x;
                cVar4 = this.this$0.f12912w;
                do {
                    stateFlowImpl3 = Recomposer.f12889x;
                    cVar5 = (D.c) stateFlowImpl3.getValue();
                    bVarT2 = cVar5.t(cVar4);
                    if (cVar5 != bVarT2) {
                        break;
                        break;
                    }
                } while (!stateFlowImpl3.d(cVar5, bVarT2));
                return p293xa.r.f47939a;
            }
        } catch (Throwable th6) {
            interfaceC2694i0 = interfaceC2694i0F;
            th = th6;
            dVar = fVar;
            dVar.dispose();
            recomposer = this.this$0;
            synchronized (recomposer.f12892b) {
                if (recomposer.f12893c == interfaceC2694i0) {
                    recomposer.f12893c = null;
                }
                recomposer.x();
                StateFlowImpl stateFlowImpl8 = Recomposer.f12889x;
                cVar2 = this.this$0.f12912w;
                do {
                    stateFlowImpl2 = Recomposer.f12889x;
                    cVar3 = (D.c) stateFlowImpl2.getValue();
                    bVarT = cVar3.t(cVar2);
                    if (cVar3 != bVarT) {
                        break;
                        break;
                    }
                } while (!stateFlowImpl2.d(cVar3, bVarT));
                throw th;
            }
        }
    }
}
