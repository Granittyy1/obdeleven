package androidx.compose.material;

import androidx.compose.runtime.J0;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.X;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C2688e;

/* JADX INFO: compiled from: Switch.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.material.SwitchKt$Switch$1$1", f = "Switch.kt", l = {130}, m = "invokeSuspend")
public final class SwitchKt$Switch$1$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ AnchoredDraggableState<Boolean> $anchoredDraggableState;
    final /* synthetic */ N0<Boolean> $currentChecked$delegate;
    final /* synthetic */ N0<Ia.l<Boolean, p293xa.r>> $currentOnCheckedChange$delegate;
    final /* synthetic */ X<Boolean> $forceAnimationCheck$delegate;
    int label;

    /* JADX INFO: renamed from: androidx.compose.material.SwitchKt$Switch$1$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: Switch.kt */
    @Aa.c(c = "androidx.compose.material.SwitchKt$Switch$1$1$2", f = "Switch.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements Ia.p<Boolean, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ N0<Boolean> $currentChecked$delegate;
        final /* synthetic */ N0<Ia.l<Boolean, p293xa.r>> $currentOnCheckedChange$delegate;
        final /* synthetic */ X<Boolean> $forceAnimationCheck$delegate;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(N0<Boolean> n10, N0<? extends Ia.l<? super Boolean, p293xa.r>> n11, X<Boolean> x10, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$currentChecked$delegate = n10;
            this.$currentOnCheckedChange$delegate = n11;
            this.$forceAnimationCheck$delegate = x10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$currentChecked$delegate, this.$currentOnCheckedChange$delegate, this.$forceAnimationCheck$delegate, cVar);
            anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        @Override // Ia.p
        public final Object invoke(Boolean bool, kotlin.coroutines.c<? super p293xa.r> cVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((AnonymousClass2) create(bool2, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            boolean z10 = this.Z$0;
            N0<Boolean> n10 = this.$currentChecked$delegate;
            float f10 = SwitchKt.f11821a;
            if (n10.getValue().booleanValue() != z10) {
                Ia.l<Boolean, p293xa.r> value = this.$currentOnCheckedChange$delegate.getValue();
                if (value != null) {
                    value.invoke(Boolean.valueOf(z10));
                }
                X<Boolean> x10 = this.$forceAnimationCheck$delegate;
                x10.setValue(Boolean.valueOf(!x10.getValue().booleanValue()));
            }
            return p293xa.r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwitchKt$Switch$1$1(AnchoredDraggableState<Boolean> anchoredDraggableState, N0<Boolean> n10, N0<? extends Ia.l<? super Boolean, p293xa.r>> n11, X<Boolean> x10, kotlin.coroutines.c<? super SwitchKt$Switch$1$1> cVar) {
        super(2, cVar);
        this.$anchoredDraggableState = anchoredDraggableState;
        this.$currentChecked$delegate = n10;
        this.$currentOnCheckedChange$delegate = n11;
        this.$forceAnimationCheck$delegate = x10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SwitchKt$Switch$1$1(this.$anchoredDraggableState, this.$currentChecked$delegate, this.$currentOnCheckedChange$delegate, this.$forceAnimationCheck$delegate, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((SwitchKt$Switch$1$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            final AnchoredDraggableState<Boolean> anchoredDraggableState = this.$anchoredDraggableState;
            kotlinx.coroutines.flow.t tVarJ = J0.j(new Ia.a<Boolean>() { // from class: androidx.compose.material.SwitchKt$Switch$1$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ia.a
                public final Boolean invoke() {
                    return (Boolean) anchoredDraggableState.f11674g.getValue();
                }
            });
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$currentChecked$delegate, this.$currentOnCheckedChange$delegate, this.$forceAnimationCheck$delegate, null);
            this.label = 1;
            if (C2688e.e(tVarJ, anonymousClass2, this) == coroutineSingletons) {
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
