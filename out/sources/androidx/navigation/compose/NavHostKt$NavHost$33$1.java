package androidx.navigation.compose;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.N0;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p141l2.C2749t;

/* JADX INFO: compiled from: NavHost.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.navigation.compose.NavHostKt$NavHost$33$1", f = "NavHost.kt", l = {}, m = "invokeSuspend")
final class NavHostKt$NavHost$33$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ C1412e $composeNavigator;
    final /* synthetic */ p141l2.H $navController;
    final /* synthetic */ Transition<C2749t> $transition;
    final /* synthetic */ N0<List<C2749t>> $visibleEntries$delegate;
    final /* synthetic */ androidx.collection.G<String> $zIndices;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavHostKt$NavHost$33$1(Transition<C2749t> transition, p141l2.H h8, androidx.collection.G<String> g10, N0<? extends List<C2749t>> n10, C1412e c1412e, kotlin.coroutines.c<? super NavHostKt$NavHost$33$1> cVar) {
        super(2, cVar);
        this.$transition = transition;
        this.$navController = h8;
        this.$zIndices = g10;
        this.$visibleEntries$delegate = n10;
        this.$composeNavigator = c1412e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new NavHostKt$NavHost$33$1(this.$transition, this.$navController, this.$zIndices, this.$visibleEntries$delegate, this.$composeNavigator, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((NavHostKt$NavHost$33$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x00f1 A[LOOP:1: B:17:0x0072->B:32:0x00f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x00f5 A[EDGE_INSN: B:39:0x00f5->B:33:0x00f5 BREAK  A[LOOP:1: B:17:0x0072->B:32:0x00f1], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        if (kotlin.jvm.internal.i.a(this.$transition.f9429a.a(), this.$transition.f9432d.getValue()) && (this.$navController.f44310b.g() == null || kotlin.jvm.internal.i.a(this.$transition.f9432d.getValue(), this.$navController.f44310b.g()))) {
            List<C2749t> value = this.$visibleEntries$delegate.getValue();
            C1412e c1412e = this.$composeNavigator;
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                c1412e.b().b((C2749t) it.next());
            }
            androidx.collection.G<String> g10 = this.$zIndices;
            Transition<C2749t> transition = this.$transition;
            long[] jArr = g10.f9089a;
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
                        int i12 = 8;
                        int i13 = 8 - ((~(i11 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j & 255) < 128) {
                                int i15 = (i11 << 3) + i14;
                                Object obj2 = g10.f9090b[i15];
                                float f10 = g10.f9091c[i15];
                                if (!kotlin.jvm.internal.i.a((String) obj2, ((C2749t) transition.f9432d.getValue()).f44303g)) {
                                    g10.f9093e--;
                                    long[] jArr2 = g10.f9089a;
                                    int i16 = g10.f9092d;
                                    int i17 = i15 >> 3;
                                    int i18 = (i15 & 7) << 3;
                                    long j10 = (jArr2[i17] & (~(255 << i18))) | (254 << i18);
                                    jArr2[i17] = j10;
                                    jArr2[(((i15 - 7) & i16) + (i16 & 7)) >> 3] = j10;
                                    g10.f9090b[i15] = null;
                                }
                                i10 = 8;
                            } else {
                                i10 = i12;
                            }
                            j >>= i10;
                            i14++;
                            i12 = i10;
                        }
                        if (i13 != i12) {
                            break;
                        }
                        if (i11 != length) {
                            break;
                        }
                        i11++;
                    }
                }
            }
        }
        return p293xa.r.f47939a;
    }
}
