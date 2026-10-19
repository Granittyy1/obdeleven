package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.InterfaceC1095k0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.N0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC2687d;

/* JADX INFO: compiled from: AnimatedVisibility.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1", f = "AnimatedVisibility.kt", l = {739}, m = "invokeSuspend")
final class AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 extends SuspendLambda implements Ia.p<InterfaceC1095k0<Boolean>, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Transition<EnterExitState> $childTransition;
    final /* synthetic */ N0<Ia.p<EnterExitState, EnterExitState, Boolean>> $shouldDisposeBlockUpdated$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: compiled from: AnimatedVisibility.kt */
    public static final class a<T> implements InterfaceC2687d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1095k0<Boolean> f9255b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Transition<EnterExitState> f9256c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ N0<Ia.p<EnterExitState, EnterExitState, Boolean>> f9257d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC1095k0<Boolean> interfaceC1095k0, Transition<EnterExitState> transition, N0<? extends Ia.p<? super EnterExitState, ? super EnterExitState, Boolean>> n10) {
            this.f9255b = interfaceC1095k0;
            this.f9256c = transition;
            this.f9257d = n10;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2687d
        public final Object emit(Object obj, kotlin.coroutines.c cVar) {
            boolean zBooleanValue;
            if (((Boolean) obj).booleanValue()) {
                Ia.p value = this.f9257d.getValue();
                Transition<EnterExitState> transition = this.f9256c;
                zBooleanValue = ((Boolean) value.invoke(transition.f9429a.a(), transition.f9432d.getValue())).booleanValue();
            } else {
                zBooleanValue = false;
            }
            this.f9255b.setValue(Boolean.valueOf(zBooleanValue));
            return p293xa.r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(Transition<EnterExitState> transition, N0<? extends Ia.p<? super EnterExitState, ? super EnterExitState, Boolean>> n10, kotlin.coroutines.c<? super AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1> cVar) {
        super(2, cVar);
        this.$childTransition = transition;
        this.$shouldDisposeBlockUpdated$delegate = n10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 = new AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(this.$childTransition, this.$shouldDisposeBlockUpdated$delegate, cVar);
        animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1.L$0 = obj;
        return animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1;
    }

    @Override // Ia.p
    public final Object invoke(InterfaceC1095k0<Boolean> interfaceC1095k0, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1) create(interfaceC1095k0, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            InterfaceC1095k0 interfaceC1095k0 = (InterfaceC1095k0) this.L$0;
            final Transition<EnterExitState> transition = this.$childTransition;
            kotlinx.coroutines.flow.t tVarJ = J0.j(new Ia.a<Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final Boolean invoke() {
                    Transition<EnterExitState> transition2 = transition;
                    EnterExitState enterExitStateA = transition2.f9429a.a();
                    EnterExitState enterExitState = EnterExitState.f9278d;
                    return Boolean.valueOf(enterExitStateA == enterExitState && transition2.f9432d.getValue() == enterExitState);
                }
            });
            a aVar = new a(interfaceC1095k0, this.$childTransition, this.$shouldDisposeBlockUpdated$delegate);
            this.label = 1;
            if (tVarJ.collect(aVar, this) == coroutineSingletons) {
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
