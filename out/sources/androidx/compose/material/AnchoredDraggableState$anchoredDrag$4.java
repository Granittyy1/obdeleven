package androidx.compose.material;

import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", l = {574}, m = "invokeSuspend")
final class AnchoredDraggableState$anchoredDrag$4 extends SuspendLambda implements Ia.l<kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Ia.r<InterfaceC1025a, InterfaceC1044u<Object>, Object, kotlin.coroutines.c<? super p293xa.r>, Object> $block;
    final /* synthetic */ Object $targetValue;
    int label;
    final /* synthetic */ AnchoredDraggableState<Object> this$0;

    /* JADX INFO: renamed from: androidx.compose.material.AnchoredDraggableState$anchoredDrag$4$2, reason: invalid class name */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @Aa.c(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", l = {576}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements Ia.p<Pair<? extends InterfaceC1044u<Object>, Object>, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ Ia.r<InterfaceC1025a, InterfaceC1044u<Object>, Object, kotlin.coroutines.c<? super p293xa.r>, Object> $block;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AnchoredDraggableState<Object> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Ia.r<? super InterfaceC1025a, ? super InterfaceC1044u<Object>, Object, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> rVar, AnchoredDraggableState<Object> anchoredDraggableState, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$block = rVar;
            this.this$0 = anchoredDraggableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // Ia.p
        public final Object invoke(Pair<? extends InterfaceC1044u<Object>, Object> pair, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass2) create(pair, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                Pair pair = (Pair) this.L$0;
                InterfaceC1044u<Object> interfaceC1044u = (InterfaceC1044u) pair.a();
                Object objB = pair.b();
                Ia.r<InterfaceC1025a, InterfaceC1044u<Object>, Object, kotlin.coroutines.c<? super p293xa.r>, Object> rVar = this.$block;
                C1027c c1027c = this.this$0.f11680n;
                this.label = 1;
                if (rVar.invoke(c1027c, interfaceC1044u, objB, this) == coroutineSingletons) {
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
    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableState$anchoredDrag$4(AnchoredDraggableState<Object> anchoredDraggableState, Object obj, Ia.r<? super InterfaceC1025a, ? super InterfaceC1044u<Object>, Object, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> rVar, kotlin.coroutines.c<? super AnchoredDraggableState$anchoredDrag$4> cVar) {
        super(1, cVar);
        this.this$0 = anchoredDraggableState;
        this.$targetValue = obj;
        this.$block = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(kotlin.coroutines.c<?> cVar) {
        return new AnchoredDraggableState$anchoredDrag$4(this.this$0, this.$targetValue, this.$block, cVar);
    }

    @Override // Ia.l
    public final Object invoke(kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((AnchoredDraggableState$anchoredDrag$4) create(cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            this.this$0.g(this.$targetValue);
            final AnchoredDraggableState<Object> anchoredDraggableState = this.this$0;
            Ia.a<Pair<? extends InterfaceC1044u<Object>, Object>> aVar = new Ia.a<Pair<? extends InterfaceC1044u<Object>, Object>>() { // from class: androidx.compose.material.AnchoredDraggableState$anchoredDrag$4.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final Pair<? extends InterfaceC1044u<Object>, Object> invoke() {
                    return new Pair<>(anchoredDraggableState.d(), anchoredDraggableState.f11675h.getValue());
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
