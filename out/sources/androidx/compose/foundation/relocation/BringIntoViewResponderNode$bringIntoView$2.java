package androidx.compose.foundation.relocation;

import I.f;
import Ia.p;
import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.ui.layout.InterfaceC1170p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.InterfaceC2694i0;
import p293xa.r;

/* JADX INFO: compiled from: BringIntoViewResponder.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2", f = "BringIntoViewResponder.kt", l = {}, m = "invokeSuspend")
final class BringIntoViewResponderNode$bringIntoView$2 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super InterfaceC2694i0>, Object> {
    final /* synthetic */ Ia.a<f> $boundsProvider;
    final /* synthetic */ InterfaceC1170p $childCoordinates;
    final /* synthetic */ Ia.a<f> $parentRect;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: BringIntoViewResponder.kt */
    @Aa.c(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1", f = "BringIntoViewResponder.kt", l = {183}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ Ia.a<f> $boundsProvider;
        final /* synthetic */ InterfaceC1170p $childCoordinates;
        int label;
        final /* synthetic */ e this$0;

        /* JADX INFO: renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: BringIntoViewResponder.kt */
        public /* synthetic */ class C01331 extends FunctionReferenceImpl implements Ia.a<f> {
            final /* synthetic */ Ia.a<f> $boundsProvider;
            final /* synthetic */ InterfaceC1170p $childCoordinates;
            final /* synthetic */ e this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01331(e eVar, InterfaceC1170p interfaceC1170p, Ia.a<f> aVar) {
                super(0, i.a.class, "localRect", "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                this.this$0 = eVar;
                this.$childCoordinates = interfaceC1170p;
                this.$boundsProvider = aVar;
            }

            @Override // Ia.a
            public final f invoke() {
                return e.Q1(this.this$0, this.$childCoordinates, this.$boundsProvider);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(e eVar, InterfaceC1170p interfaceC1170p, Ia.a<f> aVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = eVar;
            this.$childCoordinates = interfaceC1170p;
            this.$boundsProvider = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.this$0, this.$childCoordinates, this.$boundsProvider, cVar);
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                ContentInViewNode contentInViewNode = this.this$0.f11026p;
                C01331 c01331 = new C01331(this.this$0, this.$childCoordinates, this.$boundsProvider);
                this.label = 1;
                if (contentInViewNode.R1(c01331, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return r.f47939a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$2, reason: invalid class name */
    /* JADX INFO: compiled from: BringIntoViewResponder.kt */
    @Aa.c(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$2", f = "BringIntoViewResponder.kt", l = {191}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ Ia.a<f> $parentRect;
        int label;
        final /* synthetic */ e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(e eVar, Ia.a<f> aVar, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.this$0 = eVar;
            this.$parentRect = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass2(this.this$0, this.$parentRect, cVar);
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass2) create(a10, cVar)).invokeSuspend(r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                e eVar = this.this$0;
                Ia.a<f> aVar = this.$parentRect;
                this.label = 1;
                if (androidx.compose.ui.relocation.b.a(eVar, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewResponderNode$bringIntoView$2(e eVar, InterfaceC1170p interfaceC1170p, Ia.a<f> aVar, Ia.a<f> aVar2, kotlin.coroutines.c<? super BringIntoViewResponderNode$bringIntoView$2> cVar) {
        super(2, cVar);
        this.this$0 = eVar;
        this.$childCoordinates = interfaceC1170p;
        this.$boundsProvider = aVar;
        this.$parentRect = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        BringIntoViewResponderNode$bringIntoView$2 bringIntoViewResponderNode$bringIntoView$2 = new BringIntoViewResponderNode$bringIntoView$2(this.this$0, this.$childCoordinates, this.$boundsProvider, this.$parentRect, cVar);
        bringIntoViewResponderNode$bringIntoView$2.L$0 = obj;
        return bringIntoViewResponderNode$bringIntoView$2;
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super InterfaceC2694i0> cVar) {
        return ((BringIntoViewResponderNode$bringIntoView$2) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        A a10 = (A) this.L$0;
        C2680e.c(a10, null, null, new AnonymousClass1(this.this$0, this.$childCoordinates, this.$boundsProvider, null), 3);
        return C2680e.c(a10, null, null, new AnonymousClass2(this.this$0, this.$parentRect, null), 3);
    }
}
