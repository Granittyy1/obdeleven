package com.voltasit.obdeleven.presentation.controlUnit.faults;

import Aa.c;
import G8.D;
import Ia.p;
import com.obdeleven.service.model.ControlUnit;
import com.voltasit.obdeleven.domain.usecases.user.GetUserDetailsUC;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: FaultsViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.presentation.controlUnit.faults.FaultsViewModel$setupFaults$1", f = "FaultsViewModel.kt", l = {R.styleable.AppCompatTheme_homeAsUpIndicator}, m = "invokeSuspend")
final class FaultsViewModel$setupFaults$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaultsViewModel$setupFaults$1(b bVar, kotlin.coroutines.c<? super FaultsViewModel$setupFaults$1> cVar) {
        super(2, cVar);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new FaultsViewModel$setupFaults$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((FaultsViewModel$setupFaults$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            this.this$0.f32113b.j(PreloaderState.c.f32642a);
            GetUserDetailsUC getUserDetailsUC = this.this$0.f31600p;
            this.label = 1;
            obj = getUserDetailsUC.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        C8.a aVar = (C8.a) obj;
        if (aVar instanceof C8.a.b) {
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            ref$BooleanRef.element = true;
            ControlUnit controlUnit = this.this$0.f31610z;
            if (controlUnit == null) {
                i.m("controlUnit");
                throw null;
            }
            String objectId = controlUnit.f29320b.getObjectId();
            if (objectId != null) {
                ref$BooleanRef.element = this.this$0.f31601q.k(objectId);
            }
            this.this$0.f31597A = ((D) ((C8.a.b) aVar).f2463a).f3410a.c();
            b bVar = this.this$0;
            boolean z10 = bVar.f31597A && !ref$BooleanRef.element;
            ControlUnit controlUnit2 = bVar.f31610z;
            if (controlUnit2 == null) {
                i.m("controlUnit");
                throw null;
            }
            if ((!controlUnit2.q().isEmpty() || this.this$0.f31598B) && !z10) {
                this.this$0.f31603s.j(r.f47939a);
            } else {
                this.this$0.f31605u.j(r.f47939a);
            }
        } else {
            if (!(aVar instanceof C8.a.C0024a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.this$0.f31608x.j(r.f47939a);
        }
        r rVar = r.f47939a;
        Na.i iVar = E8.a.f3126a;
        this.this$0.f32113b.j(PreloaderState.d.f32643a);
        return rVar;
    }
}
