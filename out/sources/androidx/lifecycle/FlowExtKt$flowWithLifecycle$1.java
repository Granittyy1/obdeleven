package androidx.lifecycle;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.InterfaceC2687d;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: FlowExt.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", l = {R.styleable.AppCompatTheme_popupWindowStyle}, m = "invokeSuspend")
final class FlowExtKt$flowWithLifecycle$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.channels.n<Object>, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Lifecycle $lifecycle;
    final /* synthetic */ Lifecycle.State $minActiveState;
    final /* synthetic */ InterfaceC2686c<Object> $this_flowWithLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: FlowExt.kt */
    @Aa.c(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", l = {R.styleable.AppCompatTheme_popupWindowStyle}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ kotlinx.coroutines.channels.n<Object> $$this$callbackFlow;
        final /* synthetic */ InterfaceC2686c<Object> $this_flowWithLifecycle;
        int label;

        /* JADX INFO: renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1$a */
        /* JADX INFO: compiled from: FlowExt.kt */
        public static final class a<T> implements InterfaceC2687d {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.channels.n<T> f17727b;

            /* JADX WARN: Multi-variable type inference failed */
            public a(kotlinx.coroutines.channels.n<? super T> nVar) {
                this.f17727b = nVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC2687d
            public final Object emit(T t8, kotlin.coroutines.c<? super p293xa.r> cVar) {
                Object objT = this.f17727b.t(t8, cVar);
                return objT == CoroutineSingletons.f43038b ? objT : p293xa.r.f47939a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC2686c<Object> interfaceC2686c, kotlinx.coroutines.channels.n<Object> nVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$this_flowWithLifecycle = interfaceC2686c;
            this.$$this$callbackFlow = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.$this_flowWithLifecycle, this.$$this$callbackFlow, cVar);
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                InterfaceC2686c<Object> interfaceC2686c = this.$this_flowWithLifecycle;
                a aVar = new a(this.$$this$callbackFlow);
                this.label = 1;
                if (interfaceC2686c.collect(aVar, this) == coroutineSingletons) {
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
    public FlowExtKt$flowWithLifecycle$1(Lifecycle lifecycle, Lifecycle.State state, InterfaceC2686c<Object> interfaceC2686c, kotlin.coroutines.c<? super FlowExtKt$flowWithLifecycle$1> cVar) {
        super(2, cVar);
        this.$lifecycle = lifecycle;
        this.$minActiveState = state;
        this.$this_flowWithLifecycle = interfaceC2686c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        FlowExtKt$flowWithLifecycle$1 flowExtKt$flowWithLifecycle$1 = new FlowExtKt$flowWithLifecycle$1(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, cVar);
        flowExtKt$flowWithLifecycle$1.L$0 = obj;
        return flowExtKt$flowWithLifecycle$1;
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.channels.n<Object> nVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((FlowExtKt$flowWithLifecycle$1) create(nVar, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objD;
        kotlinx.coroutines.channels.n nVar;
        Object obj2 = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            kotlinx.coroutines.channels.n nVar2 = (kotlinx.coroutines.channels.n) this.L$0;
            Lifecycle lifecycle = this.$lifecycle;
            Lifecycle.State state = this.$minActiveState;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_flowWithLifecycle, nVar2, null);
            this.L$0 = nVar2;
            this.label = 1;
            if (state == Lifecycle.State.f17750c) {
                throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
            }
            if (lifecycle.b() == Lifecycle.State.f17749b || (objD = kotlinx.coroutines.B.d(new RepeatOnLifecycleKt$repeatOnLifecycle$3(lifecycle, state, anonymousClass1, null), this)) != obj2) {
                objD = p293xa.r.f47939a;
            }
            if (objD == obj2) {
                return obj2;
            }
            nVar = nVar2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = (kotlinx.coroutines.channels.n) this.L$0;
            kotlin.b.b(obj);
        }
        nVar.a(null);
        return p293xa.r.f47939a;
    }
}
