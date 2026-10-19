package androidx.activity.compose;

import Ia.p;
import Ia.q;
import androidx.activity.C0845b;
import androidx.activity.y;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.A;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.InterfaceC2687d;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: PredictiveBackHandler.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.activity.compose.OnBackInstance$job$1", f = "PredictiveBackHandler.kt", l = {R.styleable.AppCompatTheme_windowFixedHeightMinor}, m = "invokeSuspend")
final class OnBackInstance$job$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ y $callback;
    final /* synthetic */ p<InterfaceC2686c<C0845b>, kotlin.coroutines.c<? super r>, Object> $onBack;
    Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX INFO: renamed from: androidx.activity.compose.OnBackInstance$job$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: PredictiveBackHandler.kt */
    @Aa.c(c = "androidx.activity.compose.OnBackInstance$job$1$1", f = "PredictiveBackHandler.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements q<InterfaceC2687d<? super C0845b>, Throwable, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ Ref$BooleanRef $completed;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref$BooleanRef ref$BooleanRef, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(3, cVar);
            this.$completed = ref$BooleanRef;
        }

        @Override // Ia.q
        public final Object invoke(InterfaceC2687d<? super C0845b> interfaceC2687d, Throwable th, kotlin.coroutines.c<? super r> cVar) {
            return new AnonymousClass1(this.$completed, cVar).invokeSuspend(r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            this.$completed.element = true;
            return r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnBackInstance$job$1(y yVar, p<? super InterfaceC2686c<C0845b>, ? super kotlin.coroutines.c<? super r>, ? extends Object> pVar, f fVar, kotlin.coroutines.c<? super OnBackInstance$job$1> cVar) {
        super(2, cVar);
        this.$callback = yVar;
        this.$onBack = pVar;
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new OnBackInstance$job$1(this.$callback, this.$onBack, this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((OnBackInstance$job$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$BooleanRef ref$BooleanRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            if (this.$callback.f8270a) {
                Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                p<InterfaceC2686c<C0845b>, kotlin.coroutines.c<? super r>, Object> pVar = this.$onBack;
                FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(C2688e.f(this.this$0.f8218b), new AnonymousClass1(ref$BooleanRef2, null));
                this.L$0 = ref$BooleanRef2;
                this.label = 1;
                if (pVar.invoke(flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ref$BooleanRef = ref$BooleanRef2;
            }
            return r.f47939a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ref$BooleanRef = (Ref$BooleanRef) this.L$0;
        kotlin.b.b(obj);
        if (!ref$BooleanRef.element) {
            throw new IllegalStateException("You must collect the progress flow");
        }
        return r.f47939a;
    }
}
