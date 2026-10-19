package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SubscribedSharedFlow<T> implements u<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f43364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ia.p<InterfaceC2687d<? super T>, kotlin.coroutines.c<? super p293xa.r>, Object> f43365c;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1, reason: invalid class name */
    /* JADX INFO: compiled from: Share.kt */
    @Aa.c(c = "kotlinx.coroutines.flow.SubscribedSharedFlow", f = "Share.kt", l = {405}, m = "collect")
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SubscribedSharedFlow<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SubscribedSharedFlow<T> subscribedSharedFlow, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(cVar);
            this.this$0 = subscribedSharedFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            this.this$0.collect(null, this);
            return CoroutineSingletons.f43038b;
        }
    }

    public SubscribedSharedFlow(v vVar, Ia.p pVar) {
        this.f43364b = vVar;
        this.f43365c = pVar;
    }

    @Override // kotlinx.coroutines.flow.u
    public final List<T> a() {
        return this.f43364b.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC2686c
    public final Object collect(InterfaceC2687d<? super T> interfaceC2687d, kotlin.coroutines.c<?> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(this, cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(this, cVar);
        }
        Object obj = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = anonymousClass1.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            throw new KotlinNothingValueException();
        }
        kotlin.b.b(obj);
        D d10 = new D(this.f43365c, interfaceC2687d);
        anonymousClass1.label = 1;
        this.f43364b.collect(d10, anonymousClass1);
        return coroutineSingletons;
    }
}
