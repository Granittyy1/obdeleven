package androidx.compose.foundation.interaction;

import Ia.p;
import androidx.compose.runtime.X;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.flow.InterfaceC2687d;
import kotlinx.coroutines.flow.v;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: FocusInteraction.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.interaction.FocusInteractionKt$collectIsFocusedAsState$1$1", f = "FocusInteraction.kt", l = {R.styleable.AppCompatTheme_editTextBackground}, m = "invokeSuspend")
final class FocusInteractionKt$collectIsFocusedAsState$1$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ X<Boolean> $isFocused;
    final /* synthetic */ j $this_collectIsFocusedAsState;
    int label;

    /* JADX INFO: compiled from: FocusInteraction.kt */
    public static final class a<T> implements InterfaceC2687d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f10067b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ X<Boolean> f10068c;

        public a(X x10, ArrayList arrayList) {
            this.f10067b = arrayList;
            this.f10068c = x10;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2687d
        public final Object emit(Object obj, kotlin.coroutines.c cVar) {
            i iVar = (i) obj;
            boolean z10 = iVar instanceof d;
            ArrayList arrayList = this.f10067b;
            if (z10) {
                arrayList.add(iVar);
            } else if (iVar instanceof e) {
                arrayList.remove(((e) iVar).f10071a);
            }
            this.f10068c.setValue(Boolean.valueOf(!arrayList.isEmpty()));
            return r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusInteractionKt$collectIsFocusedAsState$1$1(j jVar, X<Boolean> x10, kotlin.coroutines.c<? super FocusInteractionKt$collectIsFocusedAsState$1$1> cVar) {
        super(2, cVar);
        this.$this_collectIsFocusedAsState = jVar;
        this.$isFocused = x10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new FocusInteractionKt$collectIsFocusedAsState$1$1(this.$this_collectIsFocusedAsState, this.$isFocused, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((FocusInteractionKt$collectIsFocusedAsState$1$1) create(a10, cVar)).invokeSuspend(r.f47939a);
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
            return r.f47939a;
        }
        kotlin.b.b(obj);
        ArrayList arrayList = new ArrayList();
        v vVarB = this.$this_collectIsFocusedAsState.b();
        a aVar = new a(this.$isFocused, arrayList);
        this.label = 1;
        vVarB.collect(aVar, this);
        return coroutineSingletons;
    }
}
