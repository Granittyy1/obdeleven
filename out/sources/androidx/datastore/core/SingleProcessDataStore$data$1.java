package androidx.datastore.core;

import Ia.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1;
import kotlinx.coroutines.flow.InterfaceC2687d;
import kotlinx.coroutines.flow.StateFlowImpl;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: SingleProcessDataStore.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.datastore.core.SingleProcessDataStore$data$1", f = "SingleProcessDataStore.kt", l = {R.styleable.AppCompatTheme_windowActionBar}, m = "invokeSuspend")
final class SingleProcessDataStore$data$1 extends SuspendLambda implements p<InterfaceC2687d<Object>, kotlin.coroutines.c<? super r>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ j<Object> this$0;

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$data$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    @Aa.c(c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", f = "SingleProcessDataStore.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<l<Object>, kotlin.coroutines.c<? super Boolean>, Object> {
        final /* synthetic */ l<Object> $currentDownStreamFlowState;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(l<Object> lVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$currentDownStreamFlowState = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentDownStreamFlowState, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // Ia.p
        public final Object invoke(l<Object> lVar, kotlin.coroutines.c<? super Boolean> cVar) {
            return ((AnonymousClass1) create(lVar, cVar)).invokeSuspend(r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            l<Object> lVar = (l) this.L$0;
            l<Object> lVar2 = this.$currentDownStreamFlowState;
            boolean z10 = false;
            if (!(lVar2 instanceof b) && !(lVar2 instanceof g) && lVar == lVar2) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$data$1(j<Object> jVar, kotlin.coroutines.c<? super SingleProcessDataStore$data$1> cVar) {
        super(2, cVar);
        this.this$0 = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        SingleProcessDataStore$data$1 singleProcessDataStore$data$1 = new SingleProcessDataStore$data$1(this.this$0, cVar);
        singleProcessDataStore$data$1.L$0 = obj;
        return singleProcessDataStore$data$1;
    }

    @Override // Ia.p
    public final Object invoke(InterfaceC2687d<Object> interfaceC2687d, kotlin.coroutines.c<? super r> cVar) {
        return ((SingleProcessDataStore$data$1) create(interfaceC2687d, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return r.f47939a;
        }
        kotlin.b.b(obj);
        InterfaceC2687d interfaceC2687d = (InterfaceC2687d) this.L$0;
        l lVar = (l) this.this$0.f17053g.getValue();
        if (!(lVar instanceof b)) {
            this.this$0.f17055i.a(new j.a.C0177a(lVar));
        }
        StateFlowImpl stateFlowImpl = this.this$0.f17053g;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(lVar, null);
        this.label = 1;
        if (interfaceC2687d instanceof E) {
            throw ((E) interfaceC2687d).f43315b;
        }
        stateFlowImpl.collect(new FlowKt__LimitKt$dropWhile$1$1(new Ref$BooleanRef(), new SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2(interfaceC2687d), anonymousClass1), this);
        return coroutineSingletons;
    }
}
