package kotlinx.coroutines.selects;

import Ia.q;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.I;
import p131k5.RunnableC2578w1;
import p293xa.r;

/* JADX INFO: compiled from: OnTimeout.kt */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class OnTimeout$selectClause$1 extends FunctionReferenceImpl implements q<a, e<?>, Object, r> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final OnTimeout$selectClause$1 f43557b = new OnTimeout$selectClause$1();

    public OnTimeout$selectClause$1() {
        super(3, a.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // Ia.q
    public final r invoke(a aVar, e<?> eVar, Object obj) {
        a aVar2 = aVar;
        e<?> eVar2 = eVar;
        long j = aVar2.f43570a;
        if (j <= 0) {
            eVar2.e(r.f47939a);
        } else {
            RunnableC2578w1 runnableC2578w1 = new RunnableC2578w1(eVar2, aVar2);
            i.c(eVar2, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            kotlin.coroutines.e context = eVar2.getContext();
            eVar2.b(I.c(context).m0(j, runnableC2578w1, context));
        }
        return r.f47939a;
    }
}
