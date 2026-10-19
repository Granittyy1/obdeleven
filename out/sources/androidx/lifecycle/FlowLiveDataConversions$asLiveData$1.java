package androidx.lifecycle;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.InterfaceC2687d;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: FlowLiveData.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", l = {R.styleable.AppCompatTheme_listPopupWindowStyle}, m = "invokeSuspend")
final class FlowLiveDataConversions$asLiveData$1 extends SuspendLambda implements Ia.p<A<Object>, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ InterfaceC2686c<Object> $this_asLiveData;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: compiled from: FlowLiveData.kt */
    public static final class a<T> implements InterfaceC2687d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ A<T> f17728b;

        public a(A<T> a10) {
            this.f17728b = a10;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2687d
        public final Object emit(T t8, kotlin.coroutines.c<? super p293xa.r> cVar) {
            Object objEmit = this.f17728b.emit(t8, cVar);
            return objEmit == CoroutineSingletons.f43038b ? objEmit : p293xa.r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLiveDataConversions$asLiveData$1(InterfaceC2686c<Object> interfaceC2686c, kotlin.coroutines.c<? super FlowLiveDataConversions$asLiveData$1> cVar) {
        super(2, cVar);
        this.$this_asLiveData = interfaceC2686c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        FlowLiveDataConversions$asLiveData$1 flowLiveDataConversions$asLiveData$1 = new FlowLiveDataConversions$asLiveData$1(this.$this_asLiveData, cVar);
        flowLiveDataConversions$asLiveData$1.L$0 = obj;
        return flowLiveDataConversions$asLiveData$1;
    }

    @Override // Ia.p
    public final Object invoke(A<Object> a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((FlowLiveDataConversions$asLiveData$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            A a10 = (A) this.L$0;
            InterfaceC2686c<Object> interfaceC2686c = this.$this_asLiveData;
            a aVar = new a(a10);
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
