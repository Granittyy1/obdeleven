package coil.compose;

import androidx.compose.ui.layout.D;
import androidx.compose.ui.layout.F;
import androidx.compose.ui.layout.H;
import androidx.compose.ui.layout.InterfaceC1175v;
import androidx.compose.ui.layout.Y;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.B;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.InterfaceC2687d;
import kotlinx.coroutines.flow.StateFlowImpl;

/* JADX INFO: compiled from: ConstraintsSizeResolver.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ConstraintsSizeResolver implements Z2.f, InterfaceC1175v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StateFlowImpl f22736b = B.a(new p013b0.a(y.f22839a));

    @Override // androidx.compose.ui.layout.InterfaceC1175v
    public final F B(H h8, D d10, long j) {
        p013b0.a aVar = new p013b0.a(j);
        StateFlowImpl stateFlowImpl = this.f22736b;
        stateFlowImpl.getClass();
        stateFlowImpl.k(null, aVar);
        Y yQ = d10.Q(j);
        return h8.y1(yQ.f14220b, yQ.f14221c, kotlin.collections.y.p(), new p011ab.g(1, yQ));
    }

    @Override // Z2.f
    public final Object e(kotlin.coroutines.c<? super Z2.e> cVar) {
        final StateFlowImpl stateFlowImpl = this.f22736b;
        return C2688e.j(new InterfaceC2686c<Z2.e>() { // from class: coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            public static final class AnonymousClass2<T> implements InterfaceC2687d {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC2687d f22738b;

                /* JADX INFO: renamed from: coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @Aa.c(c = "coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2", f = "ConstraintsSizeResolver.kt", l = {221}, m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(kotlin.coroutines.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2687d interfaceC2687d) {
                    this.f22738b = interfaceC2687d;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC2687d
                public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    Z2.e eVar;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i10 = anonymousClass1.label;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(cVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(cVar);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                    int i11 = anonymousClass1.label;
                    if (i11 == 0) {
                        kotlin.b.b(obj2);
                        long j = ((p013b0.a) obj).f20475a;
                        Z2.c cVar2 = y.f22840b;
                        if (p013b0.a.k(j)) {
                            eVar = null;
                        } else {
                            eVar = new Z2.e(p013b0.a.d(j) ? new Z2.a.C0110a(p013b0.a.h(j)) : Z2.a.b.f7726a, p013b0.a.c(j) ? new Z2.a.C0110a(p013b0.a.g(j)) : Z2.a.b.f7726a);
                        }
                        if (eVar != null) {
                            anonymousClass1.label = 1;
                            if (this.f22738b.emit(eVar, anonymousClass1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.b.b(obj2);
                    }
                    return p293xa.r.f47939a;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC2686c
            public final Object collect(InterfaceC2687d<? super Z2.e> interfaceC2687d, kotlin.coroutines.c cVar2) throws Throwable {
                stateFlowImpl.collect(new AnonymousClass2(interfaceC2687d), cVar2);
                return CoroutineSingletons.f43038b;
            }
        }, (ContinuationImpl) cVar);
    }
}
