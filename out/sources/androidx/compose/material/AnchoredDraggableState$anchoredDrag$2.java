package androidx.compose.material;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", l = {526}, m = "invokeSuspend")
final class AnchoredDraggableState$anchoredDrag$2 extends SuspendLambda implements Ia.l<kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Ia.q<InterfaceC1025a, InterfaceC1044u<Object>, kotlin.coroutines.c<? super p293xa.r>, Object> $block;
    int label;
    final /* synthetic */ AnchoredDraggableState<Object> this$0;

    /* JADX INFO: renamed from: androidx.compose.material.AnchoredDraggableState$anchoredDrag$2$2, reason: invalid class name */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @Aa.c(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", l = {527}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements Ia.p<InterfaceC1044u<Object>, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ Ia.q<InterfaceC1025a, InterfaceC1044u<Object>, kotlin.coroutines.c<? super p293xa.r>, Object> $block;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AnchoredDraggableState<Object> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Ia.q<? super InterfaceC1025a, ? super InterfaceC1044u<Object>, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> qVar, AnchoredDraggableState<Object> anchoredDraggableState, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$block = qVar;
            this.this$0 = anchoredDraggableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // Ia.p
        public final Object invoke(InterfaceC1044u<Object> interfaceC1044u, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass2) create(interfaceC1044u, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                InterfaceC1044u<Object> interfaceC1044u = (InterfaceC1044u) this.L$0;
                Ia.q<InterfaceC1025a, InterfaceC1044u<Object>, kotlin.coroutines.c<? super p293xa.r>, Object> qVar = this.$block;
                C1027c c1027c = this.this$0.f11680n;
                this.label = 1;
                if (qVar.invoke(c1027c, interfaceC1044u, this) == coroutineSingletons) {
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
    public AnchoredDraggableState$anchoredDrag$2(Ia.q qVar, AnchoredDraggableState anchoredDraggableState, kotlin.coroutines.c cVar) {
        super(1, cVar);
        this.this$0 = anchoredDraggableState;
        this.$block = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(kotlin.coroutines.c<?> cVar) {
        return new AnchoredDraggableState$anchoredDrag$2(this.$block, this.this$0, cVar);
    }

    @Override // Ia.l
    public final Object invoke(kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((AnchoredDraggableState$anchoredDrag$2) create(cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            final AnchoredDraggableState<Object> anchoredDraggableState = this.this$0;
            Ia.a<InterfaceC1044u<Object>> aVar = new Ia.a<InterfaceC1044u<Object>>() { // from class: androidx.compose.material.AnchoredDraggableState$anchoredDrag$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final InterfaceC1044u<Object> invoke() {
                    return anchoredDraggableState.d();
                }
            };
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, null);
            this.label = 1;
            if (C1026b.a(aVar, anonymousClass2, this) == coroutineSingletons) {
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
