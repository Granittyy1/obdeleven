package androidx.compose.material;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2680e;

/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1", f = "AnchoredDraggable.kt", l = {}, m = "invokeSuspend")
final class AnchoredDraggableKt$anchoredDraggable$1 extends SuspendLambda implements Ia.q<kotlinx.coroutines.A, Float, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ AnchoredDraggableState<Object> $state;
    /* synthetic */ float F$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @Aa.c(c = "androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1$1", f = "AnchoredDraggable.kt", l = {179}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ AnchoredDraggableState<Object> $state;
        final /* synthetic */ float $velocity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AnchoredDraggableState<Object> anchoredDraggableState, float f10, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$state = anchoredDraggableState;
            this.$velocity = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.$state, this.$velocity, cVar);
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            Object obj2 = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                AnchoredDraggableState<Object> anchoredDraggableState = this.$state;
                float f10 = this.$velocity;
                this.label = 1;
                T value = anchoredDraggableState.f11674g.getValue();
                Object objC = anchoredDraggableState.c(anchoredDraggableState.e(), f10, value);
                if (anchoredDraggableState.f11671d.invoke(objC).booleanValue()) {
                    objB = C1026b.b(anchoredDraggableState, objC, f10, this);
                    if (objB != obj2) {
                        objB = p293xa.r.f47939a;
                    }
                } else {
                    objB = C1026b.b(anchoredDraggableState, value, f10, this);
                    if (objB != obj2) {
                        objB = p293xa.r.f47939a;
                    }
                }
                if (objB == obj2) {
                    return obj2;
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
    public AnchoredDraggableKt$anchoredDraggable$1(AnchoredDraggableState<Object> anchoredDraggableState, kotlin.coroutines.c<? super AnchoredDraggableKt$anchoredDraggable$1> cVar) {
        super(3, cVar);
        this.$state = anchoredDraggableState;
    }

    @Override // Ia.q
    public final Object invoke(kotlinx.coroutines.A a10, Float f10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        float fFloatValue = f10.floatValue();
        AnchoredDraggableKt$anchoredDraggable$1 anchoredDraggableKt$anchoredDraggable$1 = new AnchoredDraggableKt$anchoredDraggable$1(this.$state, cVar);
        anchoredDraggableKt$anchoredDraggable$1.L$0 = a10;
        anchoredDraggableKt$anchoredDraggable$1.F$0 = fFloatValue;
        return anchoredDraggableKt$anchoredDraggable$1.invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        C2680e.c((kotlinx.coroutines.A) this.L$0, null, null, new AnonymousClass1(this.$state, this.F$0, null), 3);
        return p293xa.r.f47939a;
    }
}
