package androidx.compose.material.ripple;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.flow.InterfaceC2687d;
import kotlinx.coroutines.flow.v;
import p293xa.r;

/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1$1", f = "Ripple.kt", l = {207}, m = "invokeSuspend")
final class Ripple$rememberUpdatedInstance$1$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ m $instance;
    final /* synthetic */ androidx.compose.foundation.interaction.j $interactionSource;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: compiled from: Ripple.kt */
    public static final class a<T> implements InterfaceC2687d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f11954b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ A f11955c;

        public a(m mVar, A a10) {
            this.f11954b = mVar;
            this.f11955c = a10;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2687d
        public final Object emit(Object obj, kotlin.coroutines.c cVar) {
            androidx.compose.foundation.interaction.i iVar = (androidx.compose.foundation.interaction.i) obj;
            boolean z10 = iVar instanceof androidx.compose.foundation.interaction.m.b;
            m mVar = this.f11954b;
            if (z10) {
                mVar.e((androidx.compose.foundation.interaction.m.b) iVar);
            } else if (iVar instanceof androidx.compose.foundation.interaction.m.c) {
                androidx.compose.foundation.interaction.m.b bVar = ((androidx.compose.foundation.interaction.m.c) iVar).f10076a;
                mVar.f();
            } else if (iVar instanceof androidx.compose.foundation.interaction.m.a) {
                androidx.compose.foundation.interaction.m.b bVar2 = ((androidx.compose.foundation.interaction.m.a) iVar).f10074a;
                mVar.f();
            } else {
                mVar.f12015c.b(iVar, this.f11955c);
            }
            return r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ripple$rememberUpdatedInstance$1$1(androidx.compose.foundation.interaction.j jVar, m mVar, kotlin.coroutines.c<? super Ripple$rememberUpdatedInstance$1$1> cVar) {
        super(2, cVar);
        this.$interactionSource = jVar;
        this.$instance = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        Ripple$rememberUpdatedInstance$1$1 ripple$rememberUpdatedInstance$1$1 = new Ripple$rememberUpdatedInstance$1$1(this.$interactionSource, this.$instance, cVar);
        ripple$rememberUpdatedInstance$1$1.L$0 = obj;
        return ripple$rememberUpdatedInstance$1$1;
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((Ripple$rememberUpdatedInstance$1$1) create(a10, cVar)).invokeSuspend(r.f47939a);
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
        v vVarB = this.$interactionSource.b();
        a aVar = new a(this.$instance, a10);
        this.label = 1;
        vVarB.collect(aVar, this);
        return coroutineSingletons;
    }
}
