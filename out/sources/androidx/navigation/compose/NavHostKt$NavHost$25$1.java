package androidx.navigation.compose;

import androidx.activity.C0845b;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.U;
import androidx.compose.runtime.X;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.InterfaceC2687d;
import p141l2.C2749t;

/* JADX INFO: compiled from: NavHost.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.navigation.compose.NavHostKt$NavHost$25$1", f = "NavHost.kt", l = {523}, m = "invokeSuspend")
final class NavHostKt$NavHost$25$1 extends SuspendLambda implements Ia.p<InterfaceC2686c<? extends C0845b>, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ C1412e $composeNavigator;
    final /* synthetic */ N0<List<C2749t>> $currentBackStack$delegate;
    final /* synthetic */ X<Boolean> $inPredictiveBack$delegate;
    final /* synthetic */ U $progress$delegate;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: compiled from: NavHost.kt */
    public static final class a<T> implements InterfaceC2687d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N0<List<C2749t>> f19139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ X<Boolean> f19140c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ U f19141d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(N0<? extends List<C2749t>> n10, X<Boolean> x10, U u10) {
            this.f19139b = n10;
            this.f19140c = x10;
            this.f19141d = u10;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2687d
        public final Object emit(Object obj, kotlin.coroutines.c cVar) {
            C0845b c0845b = (C0845b) obj;
            if (this.f19139b.getValue().size() > 1) {
                this.f19140c.setValue(Boolean.TRUE);
                this.f19141d.f(c0845b.f8201c);
            }
            return p293xa.r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavHostKt$NavHost$25$1(C1412e c1412e, N0<? extends List<C2749t>> n10, U u10, X<Boolean> x10, kotlin.coroutines.c<? super NavHostKt$NavHost$25$1> cVar) {
        super(2, cVar);
        this.$composeNavigator = c1412e;
        this.$currentBackStack$delegate = n10;
        this.$progress$delegate = u10;
        this.$inPredictiveBack$delegate = x10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        NavHostKt$NavHost$25$1 navHostKt$NavHost$25$1 = new NavHostKt$NavHost$25$1(this.$composeNavigator, this.$currentBackStack$delegate, this.$progress$delegate, this.$inPredictiveBack$delegate, cVar);
        navHostKt$NavHost$25$1.L$0 = obj;
        return navHostKt$NavHost$25$1;
    }

    @Override // Ia.p
    public final Object invoke(InterfaceC2686c<? extends C0845b> interfaceC2686c, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((NavHostKt$NavHost$25$1) create(interfaceC2686c, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C2749t c2749t;
        C2749t c2749t2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        try {
            if (i10 == 0) {
                kotlin.b.b(obj);
                InterfaceC2686c interfaceC2686c = (InterfaceC2686c) this.L$0;
                if (this.$currentBackStack$delegate.getValue().size() > 1) {
                    this.$progress$delegate.f(0.0f);
                    c2749t = (C2749t) kotlin.collections.q.W(this.$currentBackStack$delegate.getValue());
                    C1412e c1412e = this.$composeNavigator;
                    kotlin.jvm.internal.i.b(c2749t);
                    c1412e.b().e(c2749t);
                    this.$composeNavigator.b().e(this.$currentBackStack$delegate.getValue().get(this.$currentBackStack$delegate.getValue().size() - 2));
                } else {
                    c2749t = null;
                }
                a aVar = new a(this.$currentBackStack$delegate, this.$inPredictiveBack$delegate, this.$progress$delegate);
                this.L$0 = c2749t;
                this.label = 1;
                if (interfaceC2686c.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                c2749t2 = c2749t;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c2749t2 = (C2749t) this.L$0;
                kotlin.b.b(obj);
            }
            if (this.$currentBackStack$delegate.getValue().size() > 1) {
                this.$inPredictiveBack$delegate.setValue(Boolean.FALSE);
                C1412e c1412e2 = this.$composeNavigator;
                kotlin.jvm.internal.i.b(c2749t2);
                c1412e2.e(c2749t2, false);
            }
        } catch (CancellationException unused) {
            if (this.$currentBackStack$delegate.getValue().size() > 1) {
                this.$inPredictiveBack$delegate.setValue(Boolean.FALSE);
            }
        }
        return p293xa.r.f47939a;
    }
}
