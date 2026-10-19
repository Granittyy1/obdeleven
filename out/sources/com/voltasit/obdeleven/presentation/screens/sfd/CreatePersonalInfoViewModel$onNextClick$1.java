package com.voltasit.obdeleven.presentation.screens.sfd;

import Aa.c;
import G8.G;
import Ia.p;
import androidx.compose.runtime.C1085f0;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.usecases.user.B;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import com.voltasit.sharednetwork.domain.exceptions.HttpException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: CreatePersonalInfoViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.presentation.screens.sfd.CreatePersonalInfoViewModel$onNextClick$1", f = "CreatePersonalInfoViewModel.kt", l = {149}, m = "invokeSuspend")
final class CreatePersonalInfoViewModel$onNextClick$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ CreatePersonalInfoViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatePersonalInfoViewModel$onNextClick$1(CreatePersonalInfoViewModel createPersonalInfoViewModel, kotlin.coroutines.c<? super CreatePersonalInfoViewModel$onNextClick$1> cVar) {
        super(2, cVar);
        this.this$0 = createPersonalInfoViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new CreatePersonalInfoViewModel$onNextClick$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((CreatePersonalInfoViewModel$onNextClick$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        Object objA;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            b.b(obj);
            C1085f0 c1085f0 = this.this$0.f32998B;
            G g10 = ((a) c1085f0.getValue()).f33037a;
            a aVar = (a) c1085f0.getValue();
            if (n.S(g10.f3417a)) {
                numValueOf = Integer.valueOf(R.string.common_this_field_is_required);
                z10 = true;
            } else {
                z10 = false;
                numValueOf = null;
            }
            if (n.S(g10.f3418b)) {
                numValueOf2 = Integer.valueOf(R.string.common_this_field_is_required);
                z10 = true;
            } else {
                numValueOf2 = null;
            }
            if (n.S(g10.f3421e)) {
                z10 = true;
                numValueOf3 = Integer.valueOf(R.string.common_this_field_is_required);
            } else {
                numValueOf3 = null;
            }
            c1085f0.setValue(a.a(aVar, null, null, false, false, numValueOf, numValueOf2, numValueOf3, false, false, false, false, false, false, false, false, 65327));
            if (z10) {
                return r.f47939a;
            }
            G g11 = ((a) this.this$0.f32998B.getValue()).f33037a;
            String email = this.this$0.f33004r.L().getEmail();
            i.d(email, "getEmail(...)");
            G gA = G.a(g11, null, null, email, null, null, null, null, null, 2043);
            this.this$0.f32113b.j(PreloaderState.c.f32642a);
            B b10 = this.this$0.f33001o;
            this.label = 1;
            objA = b10.a(gA, this);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            objA = obj;
        }
        C8.a aVar2 = (C8.a) objA;
        if (aVar2 instanceof C8.a.b) {
            this.this$0.f33010x.f(r.f47939a);
        } else if (aVar2 instanceof C8.a.C0024a) {
            C8.a.C0024a c0024a = (C8.a.C0024a) aVar2;
            Throwable th = c0024a.f2462a;
            HttpException httpException = th instanceof HttpException ? (HttpException) th : null;
            if (i.a(httpException != null ? httpException.getMessage() : null, "Bad phone number")) {
                C1085f0 c1085f1 = this.this$0.f32998B;
                c1085f1.setValue(a.a((a) c1085f1.getValue(), null, null, false, false, null, null, new Integer(R.string.common_incorrect_phone_number), false, false, false, false, false, false, false, false, 65407));
            } else {
                B7.b.h(R.string.common_check_network_connection, this.this$0.f32119h);
            }
            this.this$0.f33002p.d(c0024a.f2462a, false);
        }
        this.this$0.f32113b.j(PreloaderState.d.f32643a);
        return r.f47939a;
    }
}
