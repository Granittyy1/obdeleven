package androidx.compose.ui;

import Ia.l;
import Ia.p;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2702l0;
import kotlinx.coroutines.InterfaceC2694i0;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: SessionMutex.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2", f = "SessionMutex.kt", l = {R.styleable.AppCompatTheme_dialogCornerRadius, R.styleable.AppCompatTheme_dialogTheme}, m = "invokeSuspend")
final class SessionMutex$withSessionCancellingPrevious$2 extends SuspendLambda implements p<A, kotlin.coroutines.c<Object>, Object> {
    final /* synthetic */ AtomicReference<k.a<Object>> $arg0;
    final /* synthetic */ p<Object, kotlin.coroutines.c<Object>, Object> $session;
    final /* synthetic */ l<A, Object> $sessionInitializer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SessionMutex$withSessionCancellingPrevious$2(l<? super A, Object> lVar, AtomicReference<k.a<Object>> atomicReference, p<Object, ? super kotlin.coroutines.c<Object>, ? extends Object> pVar, kotlin.coroutines.c<? super SessionMutex$withSessionCancellingPrevious$2> cVar) {
        super(2, cVar);
        this.$sessionInitializer = lVar;
        this.$arg0 = atomicReference;
        this.$session = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        SessionMutex$withSessionCancellingPrevious$2 sessionMutex$withSessionCancellingPrevious$2 = new SessionMutex$withSessionCancellingPrevious$2(this.$sessionInitializer, this.$arg0, this.$session, cVar);
        sessionMutex$withSessionCancellingPrevious$2.L$0 = obj;
        return sessionMutex$withSessionCancellingPrevious$2;
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<Object> cVar) {
        return ((SessionMutex$withSessionCancellingPrevious$2) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        k.a<Object> aVar;
        k.a<Object> aVar2;
        AtomicReference<k.a<Object>> atomicReference;
        AtomicReference<k.a<Object>> atomicReference2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        try {
            if (i10 == 0) {
                kotlin.b.b(obj);
                A a10 = (A) this.L$0;
                aVar = new k.a<>(C2702l0.f(a10.getCoroutineContext()), this.$sessionInitializer.invoke(a10));
                k.a<Object> andSet = this.$arg0.getAndSet(aVar);
                if (andSet != null) {
                    InterfaceC2694i0 interfaceC2694i0 = andSet.f14153a;
                    this.L$0 = aVar;
                    this.label = 1;
                    if (C2702l0.c(interfaceC2694i0, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (k.a) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        atomicReference2 = this.$arg0;
                        while (!atomicReference2.compareAndSet(aVar2, null) && atomicReference2.get() == aVar2) {
                        }
                        return obj;
                    } catch (Throwable th) {
                        th = th;
                        atomicReference = this.$arg0;
                        while (!atomicReference.compareAndSet(aVar2, null) && atomicReference.get() == aVar2) {
                        }
                        throw th;
                    }
                }
                aVar = (k.a) this.L$0;
                kotlin.b.b(obj);
            }
            p<Object, kotlin.coroutines.c<Object>, Object> pVar = this.$session;
            Object obj2 = aVar.f14154b;
            this.L$0 = aVar;
            this.label = 2;
            obj = pVar.invoke(obj2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            aVar2 = aVar;
            atomicReference2 = this.$arg0;
            while (!atomicReference2.compareAndSet(aVar2, null)) {
            }
            return obj;
        } catch (Throwable th2) {
            th = th2;
            aVar2 = aVar;
            atomicReference = this.$arg0;
            while (!atomicReference.compareAndSet(aVar2, null)) {
            }
            throw th;
        }
    }
}
