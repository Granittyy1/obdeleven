package androidx.compose.material;

import androidx.compose.runtime.J0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.flow.InterfaceC2687d;

/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.material.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", l = {722}, m = "invokeSuspend")
final class AnchoredDraggableKt$restartable$2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Ia.p<Object, kotlin.coroutines.c<? super p293xa.r>, Object> $block;
    final /* synthetic */ Ia.a<Object> $inputs;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.material.AnchoredDraggableKt$restartable$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    public static final class AnonymousClass1<T> implements InterfaceC2687d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef<InterfaceC2694i0> f11665b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.A f11666c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Ia.p<Object, kotlin.coroutines.c<? super p293xa.r>, Object> f11667d;

        /* JADX INFO: renamed from: androidx.compose.material.AnchoredDraggableKt$restartable$2$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: AnchoredDraggable.kt */
        @Aa.c(c = "androidx.compose.material.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", l = {729}, m = "invokeSuspend")
        public static final class AnonymousClass2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
            final /* synthetic */ kotlinx.coroutines.A $$this$coroutineScope;
            final /* synthetic */ Ia.p<Object, kotlin.coroutines.c<? super p293xa.r>, Object> $block;
            final /* synthetic */ Object $latestInputs;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(Ia.p<Object, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> pVar, Object obj, kotlinx.coroutines.A a10, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
                super(2, cVar);
                this.$block = pVar;
                this.$latestInputs = obj;
                this.$$this$coroutineScope = a10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                return new AnonymousClass2(this.$block, this.$latestInputs, this.$$this$coroutineScope, cVar);
            }

            @Override // Ia.p
            public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                return ((AnonymousClass2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.b.b(obj);
                    Ia.p<Object, kotlin.coroutines.c<? super p293xa.r>, Object> pVar = this.$block;
                    Object obj2 = this.$latestInputs;
                    this.label = 1;
                    if (pVar.invoke(obj2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                kotlinx.coroutines.B.c(this.$$this$coroutineScope, new AnchoredDragFinishedSignal());
                return p293xa.r.f47939a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Ref$ObjectRef<InterfaceC2694i0> ref$ObjectRef, kotlinx.coroutines.A a10, Ia.p<Object, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> pVar) {
            this.f11665b = ref$ObjectRef;
            this.f11666c = a10;
            this.f11667d = pVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC2687d
        public final Object emit(Object obj, kotlin.coroutines.c<? super p293xa.r> cVar) {
            AnchoredDraggableKt$restartable$2$1$emit$1 anchoredDraggableKt$restartable$2$1$emit$1;
            AnonymousClass1<T> anonymousClass1;
            if (cVar instanceof AnchoredDraggableKt$restartable$2$1$emit$1) {
                anchoredDraggableKt$restartable$2$1$emit$1 = (AnchoredDraggableKt$restartable$2$1$emit$1) cVar;
                int i10 = anchoredDraggableKt$restartable$2$1$emit$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    anchoredDraggableKt$restartable$2$1$emit$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    anchoredDraggableKt$restartable$2$1$emit$1 = new AnchoredDraggableKt$restartable$2$1$emit$1(this, cVar);
                }
            } else {
                anchoredDraggableKt$restartable$2$1$emit$1 = new AnchoredDraggableKt$restartable$2$1$emit$1(this, cVar);
            }
            Object obj2 = anchoredDraggableKt$restartable$2$1$emit$1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i11 = anchoredDraggableKt$restartable$2$1$emit$1.label;
            if (i11 == 0) {
                kotlin.b.b(obj2);
                InterfaceC2694i0 interfaceC2694i0 = this.f11665b.element;
                if (interfaceC2694i0 != null) {
                    interfaceC2694i0.i(new AnchoredDragFinishedSignal());
                    anchoredDraggableKt$restartable$2$1$emit$1.L$0 = this;
                    anchoredDraggableKt$restartable$2$1$emit$1.L$1 = obj;
                    anchoredDraggableKt$restartable$2$1$emit$1.L$2 = interfaceC2694i0;
                    anchoredDraggableKt$restartable$2$1$emit$1.label = 1;
                    if (interfaceC2694i0.C(anchoredDraggableKt$restartable$2$1$emit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                anonymousClass1 = this;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = anchoredDraggableKt$restartable$2$1$emit$1.L$1;
                anonymousClass1 = (AnonymousClass1) anchoredDraggableKt$restartable$2$1$emit$1.L$0;
                kotlin.b.b(obj2);
            }
            Ref$ObjectRef<InterfaceC2694i0> ref$ObjectRef = anonymousClass1.f11665b;
            CoroutineStart coroutineStart = CoroutineStart.f43169e;
            Ia.p<Object, kotlin.coroutines.c<? super p293xa.r>, Object> pVar = anonymousClass1.f11667d;
            kotlinx.coroutines.A a10 = anonymousClass1.f11666c;
            ref$ObjectRef.element = (T) C2680e.c(a10, null, coroutineStart, new AnonymousClass2(pVar, obj, a10, null), 1);
            return p293xa.r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableKt$restartable$2(Ia.a<Object> aVar, Ia.p<Object, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> pVar, kotlin.coroutines.c<? super AnchoredDraggableKt$restartable$2> cVar) {
        super(2, cVar);
        this.$inputs = aVar;
        this.$block = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        AnchoredDraggableKt$restartable$2 anchoredDraggableKt$restartable$2 = new AnchoredDraggableKt$restartable$2(this.$inputs, this.$block, cVar);
        anchoredDraggableKt$restartable$2.L$0 = obj;
        return anchoredDraggableKt$restartable$2;
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((AnchoredDraggableKt$restartable$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            kotlinx.coroutines.A a10 = (kotlinx.coroutines.A) this.L$0;
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            kotlinx.coroutines.flow.t tVarJ = J0.j(this.$inputs);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(ref$ObjectRef, a10, this.$block);
            this.label = 1;
            if (tVarJ.collect(anonymousClass1, this) == coroutineSingletons) {
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
