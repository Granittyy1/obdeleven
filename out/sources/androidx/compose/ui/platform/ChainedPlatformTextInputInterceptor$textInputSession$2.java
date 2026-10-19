package androidx.compose.ui.platform;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: PlatformTextInputModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2", f = "PlatformTextInputModifierNode.kt", l = {248}, m = "invokeSuspend")
final class ChainedPlatformTextInputInterceptor$textInputSession$2 extends SuspendLambda implements Ia.p<A0, kotlin.coroutines.c<?>, Object> {
    final /* synthetic */ Ia.p<A0, kotlin.coroutines.c<?>, Object> $session;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ X this$0;

    /* JADX INFO: compiled from: PlatformTextInputModifierNode.kt */
    public static final class a implements A0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ A0 f14831b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ A0 f14832c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f14833d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ X f14834e;

        public a(A0 a10, AtomicReference atomicReference, X x10) {
            this.f14832c = a10;
            this.f14833d = atomicReference;
            this.f14834e = x10;
            this.f14831b = a10;
        }

        @Override // androidx.compose.ui.platform.InterfaceC1258z0
        public final View a() {
            return this.f14831b.a();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // androidx.compose.ui.platform.InterfaceC1258z0
        public final void b(androidx.compose.foundation.text.input.internal.Y y10, ContinuationImpl continuationImpl) {
            ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1 chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1;
            if (continuationImpl instanceof ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1) {
                chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1 = (ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1) continuationImpl;
                int i10 = chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1 = new ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1(this, continuationImpl);
                }
            } else {
                chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1 = new ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1(this, continuationImpl);
            }
            Object obj = chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i11 = chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1.label;
            if (i11 == 0) {
                kotlin.b.b(obj);
                ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3 chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3 = new ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3(this.f14834e, y10, this.f14832c, null);
                chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1.label = 1;
                if (androidx.compose.ui.k.a(this.f14833d, new Ia.l<kotlinx.coroutines.A, p293xa.r>() { // from class: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2
                    @Override // Ia.l
                    public final /* bridge */ /* synthetic */ p293xa.r invoke(kotlinx.coroutines.A a10) {
                        return p293xa.r.f47939a;
                    }
                }, chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3, chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1) == coroutineSingletons) {
                    return;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // kotlinx.coroutines.A
        public final kotlin.coroutines.e getCoroutineContext() {
            return this.f14831b.getCoroutineContext();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChainedPlatformTextInputInterceptor$textInputSession$2(Ia.p<? super A0, ? super kotlin.coroutines.c<?>, ? extends Object> pVar, X x10, kotlin.coroutines.c<? super ChainedPlatformTextInputInterceptor$textInputSession$2> cVar) {
        super(2, cVar);
        this.$session = pVar;
        this.this$0 = x10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        ChainedPlatformTextInputInterceptor$textInputSession$2 chainedPlatformTextInputInterceptor$textInputSession$2 = new ChainedPlatformTextInputInterceptor$textInputSession$2(this.$session, this.this$0, cVar);
        chainedPlatformTextInputInterceptor$textInputSession$2.L$0 = obj;
        return chainedPlatformTextInputInterceptor$textInputSession$2;
    }

    @Override // Ia.p
    public final Object invoke(A0 a10, kotlin.coroutines.c<?> cVar) {
        ((ChainedPlatformTextInputInterceptor$textInputSession$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        return CoroutineSingletons.f43038b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            a aVar = new a((A0) this.L$0, new AtomicReference(null), this.this$0);
            Ia.p<A0, kotlin.coroutines.c<?>, Object> pVar = this.$session;
            this.label = 1;
            if (pVar.invoke(aVar, this) == coroutineSingletons) {
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
