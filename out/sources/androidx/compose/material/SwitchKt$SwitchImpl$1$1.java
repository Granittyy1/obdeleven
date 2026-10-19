package androidx.compose.material;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC2687d;

/* JADX INFO: compiled from: Switch.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.material.SwitchKt$SwitchImpl$1$1", f = "Switch.kt", l = {225}, m = "invokeSuspend")
public final class SwitchKt$SwitchImpl$1$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ androidx.compose.foundation.interaction.j $interactionSource;
    final /* synthetic */ SnapshotStateList<androidx.compose.foundation.interaction.i> $interactions;
    int label;

    /* JADX INFO: compiled from: Switch.kt */
    public static final class a<T> implements InterfaceC2687d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SnapshotStateList<androidx.compose.foundation.interaction.i> f11833b;

        public a(SnapshotStateList<androidx.compose.foundation.interaction.i> snapshotStateList) {
            this.f11833b = snapshotStateList;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2687d
        public final Object emit(Object obj, kotlin.coroutines.c cVar) {
            androidx.compose.foundation.interaction.i iVar = (androidx.compose.foundation.interaction.i) obj;
            boolean z10 = iVar instanceof androidx.compose.foundation.interaction.m.b;
            SnapshotStateList<androidx.compose.foundation.interaction.i> snapshotStateList = this.f11833b;
            if (z10) {
                snapshotStateList.add(iVar);
            } else if (iVar instanceof androidx.compose.foundation.interaction.m.c) {
                snapshotStateList.remove(((androidx.compose.foundation.interaction.m.c) iVar).f10076a);
            } else if (iVar instanceof androidx.compose.foundation.interaction.m.a) {
                snapshotStateList.remove(((androidx.compose.foundation.interaction.m.a) iVar).f10074a);
            } else if (iVar instanceof androidx.compose.foundation.interaction.b) {
                snapshotStateList.add(iVar);
            } else if (iVar instanceof androidx.compose.foundation.interaction.c) {
                snapshotStateList.remove(((androidx.compose.foundation.interaction.c) iVar).f10070a);
            } else if (iVar instanceof androidx.compose.foundation.interaction.a) {
                snapshotStateList.remove(((androidx.compose.foundation.interaction.a) iVar).f10069a);
            }
            return p293xa.r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchKt$SwitchImpl$1$1(androidx.compose.foundation.interaction.j jVar, SnapshotStateList<androidx.compose.foundation.interaction.i> snapshotStateList, kotlin.coroutines.c<? super SwitchKt$SwitchImpl$1$1> cVar) {
        super(2, cVar);
        this.$interactionSource = jVar;
        this.$interactions = snapshotStateList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SwitchKt$SwitchImpl$1$1(this.$interactionSource, this.$interactions, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((SwitchKt$SwitchImpl$1$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
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
        kotlinx.coroutines.flow.v vVarB = this.$interactionSource.b();
        a aVar = new a(this.$interactions);
        this.label = 1;
        vVarB.collect(aVar, this);
        return coroutineSingletons;
    }
}
