package androidx.compose.ui.platform;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C2688e;

/* JADX INFO: compiled from: PlatformTextInputModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3", f = "PlatformTextInputModifierNode.kt", l = {237}, m = "invokeSuspend")
final class ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3 extends SuspendLambda implements Ia.p<p293xa.r, kotlin.coroutines.c<?>, Object> {
    final /* synthetic */ A0 $parentSession;
    final /* synthetic */ InterfaceC1254x0 $request;
    int label;
    final /* synthetic */ X this$0;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2, reason: invalid class name */
    /* JADX INFO: compiled from: PlatformTextInputModifierNode.kt */
    @Aa.c(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2", f = "PlatformTextInputModifierNode.kt", l = {238}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements Ia.p<InterfaceC1252w0, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ A0 $parentSession;
        final /* synthetic */ InterfaceC1254x0 $request;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterfaceC1254x0 interfaceC1254x0, A0 a10, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$request = interfaceC1254x0;
            this.$parentSession = a10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$request, this.$parentSession, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // Ia.p
        public final Object invoke(InterfaceC1252w0 interfaceC1252w0, kotlin.coroutines.c<? super p293xa.r> cVar) {
            ((AnonymousClass2) create(interfaceC1252w0, cVar)).invokeSuspend(p293xa.r.f47939a);
            return CoroutineSingletons.f43038b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                InterfaceC1252w0 interfaceC1252w0 = (InterfaceC1252w0) this.L$0;
                this.label = 1;
                if (interfaceC1252w0.a() == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3(X x10, InterfaceC1254x0 interfaceC1254x0, A0 a10, kotlin.coroutines.c<? super ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3> cVar) {
        super(2, cVar);
        this.this$0 = x10;
        this.$request = interfaceC1254x0;
        this.$parentSession = a10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3(this.this$0, this.$request, this.$parentSession, cVar);
    }

    @Override // Ia.p
    public final Object invoke(p293xa.r rVar, kotlin.coroutines.c<?> cVar) {
        ((ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3) create(rVar, cVar)).invokeSuspend(p293xa.r.f47939a);
        return CoroutineSingletons.f43038b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            final X x10 = this.this$0;
            kotlinx.coroutines.flow.t tVarJ = androidx.compose.runtime.J0.j(new Ia.a<InterfaceC1252w0>() { // from class: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3.1
                {
                    super(0);
                }

                @Override // Ia.a
                public final InterfaceC1252w0 invoke() {
                    x10.getClass();
                    throw null;
                }
            });
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$request, this.$parentSession, null);
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
        throw new IllegalStateException("Interceptors flow should never terminate.");
    }
}
