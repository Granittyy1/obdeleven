package androidx.compose.material3.internal;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", l = {521}, m = "invokeSuspend")
final class AnchoredDraggableState$anchoredDrag$2 extends SuspendLambda implements Ia.l<kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Ia.q<e, q<Object>, kotlin.coroutines.c<? super p293xa.r>, Object> $block;
    int label;
    final /* synthetic */ i<Object> this$0;

    /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2$2, reason: invalid class name */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @Aa.c(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", l = {522}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements Ia.p<q<Object>, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ Ia.q<e, q<Object>, kotlin.coroutines.c<? super p293xa.r>, Object> $block;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ i<Object> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Ia.q<? super e, ? super q<Object>, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> qVar, i<Object> iVar, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$block = qVar;
            this.this$0 = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // Ia.p
        public final Object invoke(q<Object> qVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass2) create(qVar, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                q<Object> qVar = (q) this.L$0;
                Ia.q<e, q<Object>, kotlin.coroutines.c<? super p293xa.r>, Object> qVar2 = this.$block;
                g gVar = this.this$0.f12541n;
                this.label = 1;
                if (qVar2.invoke(gVar, qVar, this) == coroutineSingletons) {
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
    public AnchoredDraggableState$anchoredDrag$2(Ia.q qVar, i iVar, kotlin.coroutines.c cVar) {
        super(1, cVar);
        this.this$0 = iVar;
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
            final i<Object> iVar = this.this$0;
            Ia.a<q<Object>> aVar = new Ia.a<q<Object>>() { // from class: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final q<Object> invoke() {
                    return iVar.e();
                }
            };
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, null);
            this.label = 1;
            if (f.a(aVar, anonymousClass2, this) == coroutineSingletons) {
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
