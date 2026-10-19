package androidx.compose.material;

import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.flow.InterfaceC2687d;

/* JADX INFO: compiled from: FloatingActionButton.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2$1", f = "FloatingActionButton.kt", l = {282}, m = "invokeSuspend")
final class DefaultFloatingActionButtonElevation$elevation$2$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ D $animatable;
    final /* synthetic */ androidx.compose.foundation.interaction.j $interactionSource;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: compiled from: FloatingActionButton.kt */
    public static final class a<T> implements InterfaceC2687d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f11725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.A f11726c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ D f11727d;

        public a(ArrayList arrayList, kotlinx.coroutines.A a10, D d10) {
            this.f11725b = arrayList;
            this.f11726c = a10;
            this.f11727d = d10;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2687d
        public final Object emit(Object obj, kotlin.coroutines.c cVar) {
            androidx.compose.foundation.interaction.i iVar = (androidx.compose.foundation.interaction.i) obj;
            boolean z10 = iVar instanceof androidx.compose.foundation.interaction.g;
            ArrayList arrayList = this.f11725b;
            if (z10) {
                arrayList.add(iVar);
            } else if (iVar instanceof androidx.compose.foundation.interaction.h) {
                arrayList.remove(((androidx.compose.foundation.interaction.h) iVar).f10072a);
            } else if (iVar instanceof androidx.compose.foundation.interaction.d) {
                arrayList.add(iVar);
            } else if (iVar instanceof androidx.compose.foundation.interaction.e) {
                arrayList.remove(((androidx.compose.foundation.interaction.e) iVar).f10071a);
            } else if (iVar instanceof androidx.compose.foundation.interaction.m.b) {
                arrayList.add(iVar);
            } else if (iVar instanceof androidx.compose.foundation.interaction.m.c) {
                arrayList.remove(((androidx.compose.foundation.interaction.m.c) iVar).f10076a);
            } else if (iVar instanceof androidx.compose.foundation.interaction.m.a) {
                arrayList.remove(((androidx.compose.foundation.interaction.m.a) iVar).f10074a);
            }
            C2680e.c(this.f11726c, null, null, new DefaultFloatingActionButtonElevation$elevation$2$1$1$1(this.f11727d, (androidx.compose.foundation.interaction.i) kotlin.collections.q.W(arrayList), null), 3);
            return p293xa.r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFloatingActionButtonElevation$elevation$2$1(androidx.compose.foundation.interaction.j jVar, D d10, kotlin.coroutines.c<? super DefaultFloatingActionButtonElevation$elevation$2$1> cVar) {
        super(2, cVar);
        this.$interactionSource = jVar;
        this.$animatable = d10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        DefaultFloatingActionButtonElevation$elevation$2$1 defaultFloatingActionButtonElevation$elevation$2$1 = new DefaultFloatingActionButtonElevation$elevation$2$1(this.$interactionSource, this.$animatable, cVar);
        defaultFloatingActionButtonElevation$elevation$2$1.L$0 = obj;
        return defaultFloatingActionButtonElevation$elevation$2$1;
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((DefaultFloatingActionButtonElevation$elevation$2$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
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
        kotlinx.coroutines.A a10 = (kotlinx.coroutines.A) this.L$0;
        ArrayList arrayList = new ArrayList();
        kotlinx.coroutines.flow.v vVarB = this.$interactionSource.b();
        a aVar = new a(arrayList, a10, this.$animatable);
        this.label = 1;
        vVarB.collect(aVar, this);
        return coroutineSingletons;
    }
}
