package androidx.compose.animation.core;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.animation.core.SeekableTransitionState$snapTo$2", f = "Transition.kt", l = {457}, m = "invokeSuspend")
public final class SeekableTransitionState$snapTo$2 extends SuspendLambda implements Ia.l<kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ S $targetState;
    final /* synthetic */ Transition<S> $transition;
    int label;
    final /* synthetic */ SeekableTransitionState<S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$snapTo$2(SeekableTransitionState<S> seekableTransitionState, S s10, Transition<S> transition, kotlin.coroutines.c<? super SeekableTransitionState$snapTo$2> cVar) {
        super(1, cVar);
        this.this$0 = seekableTransitionState;
        this.$targetState = s10;
        this.$transition = transition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(kotlin.coroutines.c<?> cVar) {
        return new SeekableTransitionState$snapTo$2(this.this$0, this.$targetState, this.$transition, cVar);
    }

    @Override // Ia.l
    public final Object invoke(kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((SeekableTransitionState$snapTo$2) create(cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float f10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            SeekableTransitionState<S> seekableTransitionState = this.this$0;
            C0909i c0909i = SeekableTransitionState.f9403r;
            seekableTransitionState.m();
            SeekableTransitionState<S> seekableTransitionState2 = this.this$0;
            seekableTransitionState2.f9414l = Long.MIN_VALUE;
            seekableTransitionState2.p(0.0f);
            S s10 = this.$targetState;
            if (kotlin.jvm.internal.i.a(s10, this.this$0.f9406c.getValue())) {
                f10 = -4.0f;
            } else {
                f10 = kotlin.jvm.internal.i.a(s10, this.this$0.f9405b.getValue()) ? -5.0f : -3.0f;
            }
            this.$transition.p(this.$targetState);
            this.$transition.n(0L);
            this.this$0.f9405b.setValue(this.$targetState);
            this.this$0.p(0.0f);
            this.this$0.c(this.$targetState);
            this.$transition.j(f10);
            if (f10 == -3.0f) {
                SeekableTransitionState<S> seekableTransitionState3 = this.this$0;
                this.label = 1;
                if (SeekableTransitionState.j(seekableTransitionState3, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        this.$transition.i();
        return p293xa.r.f47939a;
    }
}
