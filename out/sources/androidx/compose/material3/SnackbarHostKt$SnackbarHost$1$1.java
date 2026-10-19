package androidx.compose.material3;

import androidx.compose.ui.platform.InterfaceC1218f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.material3.SnackbarHostKt$SnackbarHost$1$1", f = "SnackbarHost.kt", l = {232}, m = "invokeSuspend")
public final class SnackbarHostKt$SnackbarHost$1$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ InterfaceC1218f $accessibilityManager;
    final /* synthetic */ f0 $currentSnackbarData;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$SnackbarHost$1$1(f0 f0Var, InterfaceC1218f interfaceC1218f, kotlin.coroutines.c<? super SnackbarHostKt$SnackbarHost$1$1> cVar) {
        super(2, cVar);
        this.$currentSnackbarData = f0Var;
        this.$accessibilityManager = interfaceC1218f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SnackbarHostKt$SnackbarHost$1$1(this.$currentSnackbarData, this.$accessibilityManager, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((SnackbarHostKt$SnackbarHost$1$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long jA;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            f0 f0Var = this.$currentSnackbarData;
            if (f0Var != null) {
                SnackbarDuration snackbarDurationC = f0Var.b().c();
                boolean z10 = this.$currentSnackbarData.b().b() != null;
                InterfaceC1218f interfaceC1218f = this.$accessibilityManager;
                int iOrdinal = snackbarDurationC.ordinal();
                if (iOrdinal == 0) {
                    jA = 4000;
                } else if (iOrdinal == 1) {
                    jA = 10000;
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jA = Long.MAX_VALUE;
                }
                if (interfaceC1218f != null) {
                    jA = interfaceC1218f.a(jA, z10);
                }
                this.label = 1;
                if (kotlinx.coroutines.I.b(jA, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return p293xa.r.f47939a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        this.$currentSnackbarData.dismiss();
        return p293xa.r.f47939a;
    }
}
