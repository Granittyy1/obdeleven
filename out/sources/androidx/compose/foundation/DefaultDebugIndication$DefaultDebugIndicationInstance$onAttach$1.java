package androidx.compose.foundation;

import androidx.compose.ui.node.C1192m;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.InterfaceC2687d;

/* JADX INFO: compiled from: Indication.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1", f = "Indication.kt", l = {228}, m = "invokeSuspend")
public final class DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    int label;
    final /* synthetic */ DefaultDebugIndication.DefaultDebugIndicationInstance this$0;

    /* JADX INFO: compiled from: Indication.kt */
    public static final class a<T> implements InterfaceC2687d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Ref$IntRef f9754b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Ref$IntRef f9755c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Ref$IntRef f9756d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ DefaultDebugIndication.DefaultDebugIndicationInstance f9757e;

        public a(Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, Ref$IntRef ref$IntRef3, DefaultDebugIndication.DefaultDebugIndicationInstance defaultDebugIndicationInstance) {
            this.f9754b = ref$IntRef;
            this.f9755c = ref$IntRef2;
            this.f9756d = ref$IntRef3;
            this.f9757e = defaultDebugIndicationInstance;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2687d
        public final Object emit(Object obj, kotlin.coroutines.c cVar) {
            androidx.compose.foundation.interaction.i iVar = (androidx.compose.foundation.interaction.i) obj;
            boolean z10 = iVar instanceof androidx.compose.foundation.interaction.m.b;
            Ref$IntRef ref$IntRef = this.f9756d;
            Ref$IntRef ref$IntRef2 = this.f9755c;
            Ref$IntRef ref$IntRef3 = this.f9754b;
            boolean z11 = true;
            if (z10) {
                ref$IntRef3.element++;
            } else if ((iVar instanceof androidx.compose.foundation.interaction.m.c) || (iVar instanceof androidx.compose.foundation.interaction.m.a)) {
                ref$IntRef3.element--;
            } else if (iVar instanceof androidx.compose.foundation.interaction.g) {
                ref$IntRef2.element++;
            } else if (iVar instanceof androidx.compose.foundation.interaction.h) {
                ref$IntRef2.element--;
            } else if (iVar instanceof androidx.compose.foundation.interaction.d) {
                ref$IntRef.element++;
            } else if (iVar instanceof androidx.compose.foundation.interaction.e) {
                ref$IntRef.element--;
            }
            boolean z12 = false;
            boolean z13 = ref$IntRef3.element > 0;
            boolean z14 = ref$IntRef2.element > 0;
            boolean z15 = ref$IntRef.element > 0;
            DefaultDebugIndication.DefaultDebugIndicationInstance defaultDebugIndicationInstance = this.f9757e;
            if (defaultDebugIndicationInstance.f9751q != z13) {
                defaultDebugIndicationInstance.f9751q = z13;
                z12 = true;
            }
            if (defaultDebugIndicationInstance.f9752r != z14) {
                defaultDebugIndicationInstance.f9752r = z14;
                z12 = true;
            }
            if (defaultDebugIndicationInstance.f9753s != z15) {
                defaultDebugIndicationInstance.f9753s = z15;
            } else {
                z11 = z12;
            }
            if (z11) {
                C1192m.a(defaultDebugIndicationInstance);
            }
            return p293xa.r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(DefaultDebugIndication.DefaultDebugIndicationInstance defaultDebugIndicationInstance, kotlin.coroutines.c<? super DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1> cVar) {
        super(2, cVar);
        this.this$0 = defaultDebugIndicationInstance;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
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
            return p293xa.r.f47939a;
        }
        kotlin.b.b(obj);
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        Ref$IntRef ref$IntRef3 = new Ref$IntRef();
        kotlinx.coroutines.flow.v vVarB = this.this$0.f9750p.b();
        a aVar = new a(ref$IntRef, ref$IntRef2, ref$IntRef3, this.this$0);
        this.label = 1;
        vVarB.collect(aVar, this);
        return coroutineSingletons;
    }
}
