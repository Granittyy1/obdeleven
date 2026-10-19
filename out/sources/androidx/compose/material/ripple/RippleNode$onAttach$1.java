package androidx.compose.material.ripple;

import androidx.compose.ui.node.C1192m;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.flow.InterfaceC2687d;
import kotlinx.coroutines.flow.v;
import p293xa.r;

/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.material.ripple.RippleNode$onAttach$1", f = "Ripple.kt", l = {364}, m = "invokeSuspend")
public final class RippleNode$onAttach$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RippleNode this$0;

    /* JADX INFO: compiled from: Ripple.kt */
    public static final class a<T> implements InterfaceC2687d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RippleNode f11966b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ A f11967c;

        public a(RippleNode rippleNode, A a10) {
            this.f11966b = rippleNode;
            this.f11967c = a10;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Ia.a, kotlin.jvm.internal.Lambda] */
        @Override // kotlinx.coroutines.flow.InterfaceC2687d
        public final Object emit(Object obj, kotlin.coroutines.c cVar) {
            androidx.compose.foundation.interaction.i iVar = (androidx.compose.foundation.interaction.i) obj;
            boolean z10 = iVar instanceof androidx.compose.foundation.interaction.m;
            RippleNode rippleNode = this.f11966b;
            if (!z10) {
                StateLayer stateLayer = rippleNode.f11961u;
                if (stateLayer == null) {
                    stateLayer = new StateLayer(rippleNode.f11957q, rippleNode.f11960t);
                    C1192m.a(rippleNode);
                    rippleNode.f11961u = stateLayer;
                }
                stateLayer.b(iVar, this.f11967c);
            } else if (rippleNode.f11964x) {
                rippleNode.Q1((androidx.compose.foundation.interaction.m) iVar);
            } else {
                rippleNode.f11965y.g(iVar);
            }
            return r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleNode$onAttach$1(RippleNode rippleNode, kotlin.coroutines.c<? super RippleNode$onAttach$1> cVar) {
        super(2, cVar);
        this.this$0 = rippleNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        RippleNode$onAttach$1 rippleNode$onAttach$1 = new RippleNode$onAttach$1(this.this$0, cVar);
        rippleNode$onAttach$1.L$0 = obj;
        return rippleNode$onAttach$1;
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((RippleNode$onAttach$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return r.f47939a;
        }
        kotlin.b.b(obj);
        A a10 = (A) this.L$0;
        v vVarB = this.this$0.f11956p.b();
        a aVar = new a(this.this$0, a10);
        this.label = 1;
        vVarB.collect(aVar, this);
        return coroutineSingletons;
    }
}
