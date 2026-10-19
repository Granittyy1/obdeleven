package androidx.compose.runtime;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.InterfaceC2687d;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: SnapshotFlow.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1", f = "SnapshotFlow.kt", l = {R.styleable.AppCompatTheme_dropdownListPreferredItemHeight, R.styleable.AppCompatTheme_editTextBackground}, m = "invokeSuspend")
final class SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1 extends SuspendLambda implements Ia.p<InterfaceC1095k0<Object>, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ kotlin.coroutines.e $context;
    final /* synthetic */ InterfaceC2686c<Object> $this_collectAsState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: SnapshotFlow.kt */
    @Aa.c(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1$2", f = "SnapshotFlow.kt", l = {R.styleable.AppCompatTheme_editTextBackground}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ InterfaceC1095k0<Object> $$this$produceState;
        final /* synthetic */ InterfaceC2686c<Object> $this_collectAsState;
        int label;

        /* JADX INFO: renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1$2$a */
        /* JADX INFO: compiled from: SnapshotFlow.kt */
        public static final class a<T> implements InterfaceC2687d {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC1095k0<Object> f12922b;

            public a(InterfaceC1095k0<Object> interfaceC1095k0) {
                this.f12922b = interfaceC1095k0;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC2687d
            public final Object emit(T t8, kotlin.coroutines.c<? super p293xa.r> cVar) {
                this.f12922b.setValue(t8);
                return p293xa.r.f47939a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterfaceC2686c<Object> interfaceC2686c, InterfaceC1095k0<Object> interfaceC1095k0, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$this_collectAsState = interfaceC2686c;
            this.$$this$produceState = interfaceC1095k0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass2(this.$this_collectAsState, this.$$this$produceState, cVar);
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
                InterfaceC2686c<Object> interfaceC2686c = this.$this_collectAsState;
                a aVar = new a(this.$$this$produceState);
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

    /* JADX INFO: compiled from: SnapshotFlow.kt */
    public static final class a<T> implements InterfaceC2687d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1095k0<Object> f12923b;

        public a(InterfaceC1095k0<Object> interfaceC1095k0) {
            this.f12923b = interfaceC1095k0;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2687d
        public final Object emit(T t8, kotlin.coroutines.c<? super p293xa.r> cVar) {
            this.f12923b.setValue(t8);
            return p293xa.r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1(kotlin.coroutines.e eVar, InterfaceC2686c<Object> interfaceC2686c, kotlin.coroutines.c<? super SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1> cVar) {
        super(2, cVar);
        this.$context = eVar;
        this.$this_collectAsState = interfaceC2686c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1 snapshotStateKt__SnapshotFlowKt$collectAsState$1$1 = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1(this.$context, this.$this_collectAsState, cVar);
        snapshotStateKt__SnapshotFlowKt$collectAsState$1$1.L$0 = obj;
        return snapshotStateKt__SnapshotFlowKt$collectAsState$1$1;
    }

    @Override // Ia.p
    public final Object invoke(InterfaceC1095k0<Object> interfaceC1095k0, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1) create(interfaceC1095k0, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            InterfaceC1095k0 interfaceC1095k0 = (InterfaceC1095k0) this.L$0;
            if (kotlin.jvm.internal.i.a(this.$context, EmptyCoroutineContext.f43032b)) {
                InterfaceC2686c<Object> interfaceC2686c = this.$this_collectAsState;
                a aVar = new a(interfaceC1095k0);
                this.label = 1;
                if (interfaceC2686c.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                kotlin.coroutines.e eVar = this.$context;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_collectAsState, interfaceC1095k0, null);
                this.label = 2;
                if (C2680e.f(eVar, anonymousClass2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return p293xa.r.f47939a;
    }
}
