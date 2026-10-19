package androidx.compose.animation.core;

import androidx.compose.runtime.C1085f0;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: compiled from: Animatable.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = {305}, m = "invokeSuspend")
final class Animatable$runAnimation$2 extends SuspendLambda implements Ia.l<kotlin.coroutines.c<? super C0904d<Object, AbstractC0913m>>, Object> {
    final /* synthetic */ InterfaceC0903c<Object, AbstractC0913m> $animation;
    final /* synthetic */ Ia.l<Animatable<Object, AbstractC0913m>, p293xa.r> $block;
    final /* synthetic */ Object $initialVelocity;
    final /* synthetic */ long $startTime;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ Animatable<Object, AbstractC0913m> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Animatable$runAnimation$2(Animatable<Object, AbstractC0913m> animatable, Object obj, InterfaceC0903c<Object, AbstractC0913m> interfaceC0903c, long j, Ia.l<? super Animatable<Object, AbstractC0913m>, p293xa.r> lVar, kotlin.coroutines.c<? super Animatable$runAnimation$2> cVar) {
        super(1, cVar);
        this.this$0 = animatable;
        this.$initialVelocity = obj;
        this.$animation = interfaceC0903c;
        this.$startTime = j;
        this.$block = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(kotlin.coroutines.c<?> cVar) {
        return new Animatable$runAnimation$2(this.this$0, this.$initialVelocity, this.$animation, this.$startTime, this.$block, cVar);
    }

    @Override // Ia.l
    public final Object invoke(kotlin.coroutines.c<? super C0904d<Object, AbstractC0913m>> cVar) {
        return ((Animatable$runAnimation$2) create(cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$BooleanRef ref$BooleanRef;
        C0908h c0908h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        try {
            if (i10 == 0) {
                kotlin.b.b(obj);
                Animatable<Object, AbstractC0913m> animatable = this.this$0;
                animatable.f9338c.f9545d = (V) animatable.f9336a.a().invoke(this.$initialVelocity);
                this.this$0.f9340e.setValue(this.$animation.g());
                this.this$0.f9339d.setValue(Boolean.TRUE);
                C0908h<Object, V> c0908h2 = this.this$0.f9338c;
                final C0908h c0908h3 = new C0908h(c0908h2.f9543b, c0908h2.f9544c.getValue(), Q3.d.k(c0908h2.f9545d), c0908h2.f9546e, Long.MIN_VALUE, c0908h2.f9548g);
                final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                InterfaceC0903c<Object, AbstractC0913m> interfaceC0903c = this.$animation;
                long j = this.$startTime;
                final Animatable<Object, AbstractC0913m> animatable2 = this.this$0;
                final Ia.l<Animatable<Object, AbstractC0913m>, p293xa.r> lVar = this.$block;
                Ia.l<C0905e<Object, AbstractC0913m>, p293xa.r> lVar2 = new Ia.l<C0905e<Object, AbstractC0913m>, p293xa.r>() { // from class: androidx.compose.animation.core.Animatable$runAnimation$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(C0905e<Object, AbstractC0913m> c0905e) {
                        C0905e<Object, AbstractC0913m> c0905e2 = c0905e;
                        T.i(c0905e2, animatable2.f9338c);
                        Animatable<Object, AbstractC0913m> animatable3 = animatable2;
                        C1085f0 c1085f0 = c0905e2.f9535e;
                        Object objA = Animatable.a(animatable3, c1085f0.getValue());
                        if (kotlin.jvm.internal.i.a(objA, c1085f0.getValue())) {
                            Ia.l<Animatable<Object, AbstractC0913m>, p293xa.r> lVar3 = lVar;
                            if (lVar3 != null) {
                                lVar3.invoke(animatable2);
                            }
                        } else {
                            animatable2.f9338c.f9544c.setValue(objA);
                            c0908h3.f9544c.setValue(objA);
                            Ia.l<Animatable<Object, AbstractC0913m>, p293xa.r> lVar4 = lVar;
                            if (lVar4 != null) {
                                lVar4.invoke(animatable2);
                            }
                            c0905e2.a();
                            ref$BooleanRef2.element = true;
                        }
                        return p293xa.r.f47939a;
                    }
                };
                this.L$0 = c0908h3;
                this.L$1 = ref$BooleanRef2;
                this.label = 1;
                if (T.b(c0908h3, interfaceC0903c, j, lVar2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ref$BooleanRef = ref$BooleanRef2;
                c0908h = c0908h3;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ref$BooleanRef = (Ref$BooleanRef) this.L$1;
                c0908h = (C0908h) this.L$0;
                kotlin.b.b(obj);
            }
            AnimationEndReason animationEndReason = ref$BooleanRef.element ? AnimationEndReason.f9346b : AnimationEndReason.f9347c;
            Animatable.b(this.this$0);
            return new C0904d(c0908h, animationEndReason);
        } catch (CancellationException e10) {
            Animatable.b(this.this$0);
            throw e10;
        }
    }
}
