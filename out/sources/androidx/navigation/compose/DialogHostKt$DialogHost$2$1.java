package androidx.navigation.compose;

import androidx.compose.runtime.N0;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p141l2.C2749t;

/* JADX INFO: compiled from: DialogHost.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.navigation.compose.DialogHostKt$DialogHost$2$1", f = "DialogHost.kt", l = {}, m = "invokeSuspend")
public final class DialogHostKt$DialogHost$2$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ C1423p $dialogNavigator;
    final /* synthetic */ SnapshotStateList<C2749t> $dialogsToDispose;
    final /* synthetic */ N0<Set<C2749t>> $transitionInProgress$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DialogHostKt$DialogHost$2$1(N0<? extends Set<C2749t>> n10, C1423p c1423p, SnapshotStateList<C2749t> snapshotStateList, kotlin.coroutines.c<? super DialogHostKt$DialogHost$2$1> cVar) {
        super(2, cVar);
        this.$transitionInProgress$delegate = n10;
        this.$dialogNavigator = c1423p;
        this.$dialogsToDispose = snapshotStateList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new DialogHostKt$DialogHost$2$1(this.$transitionInProgress$delegate, this.$dialogNavigator, this.$dialogsToDispose, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((DialogHostKt$DialogHost$2$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        Set<C2749t> value = this.$transitionInProgress$delegate.getValue();
        C1423p c1423p = this.$dialogNavigator;
        SnapshotStateList<C2749t> snapshotStateList = this.$dialogsToDispose;
        for (C2749t c2749t : value) {
            if (!((List) c1423p.b().f44278e.f43418b.getValue()).contains(c2749t) && !snapshotStateList.contains(c2749t)) {
                c1423p.b().b(c2749t);
            }
        }
        return p293xa.r.f47939a;
    }
}
