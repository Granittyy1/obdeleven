package com.voltasit.obdeleven.presentation.main;

import G8.u;
import Ia.p;
import androidx.lifecycle.C;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.usecases.m;
import com.voltasit.obdeleven.presentation.controlunitlist.ControlUnitListFragment;
import com.voltasit.obdeleven.presentation.models.UserInteractionState;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: MainViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.main.MainViewModel$onFullScanDone$1", f = "MainViewModel.kt", l = {549}, m = "invokeSuspend")
final class MainViewModel$onFullScanDone$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ MainViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$onFullScanDone$1(MainViewModel mainViewModel, kotlin.coroutines.c<? super MainViewModel$onFullScanDone$1> cVar) {
        super(2, cVar);
        this.this$0 = mainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new MainViewModel$onFullScanDone$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((MainViewModel$onFullScanDone$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            m mVar = this.this$0.f32525A;
            this.label = 1;
            mVar.getClass();
            obj = mVar.f30863c.h(false, this);
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
            List list = (List) ((C8.a.b) aVar).f2463a;
            MainViewModel mainViewModel = this.this$0;
            mainViewModel.f32547L = false;
            C<Boolean> c10 = mainViewModel.f32611w0;
            Boolean bool = Boolean.FALSE;
            c10.j(bool);
            this.this$0.f32615y0.j(bool);
            this.this$0.f32573Y.j(UserInteractionState.f32649b);
            List<p109i8.e> listD = this.this$0.f32604s0.d();
            int size = listD != null ? listD.size() : 0;
            MainViewModel mainViewModel2 = this.this$0;
            int i11 = mainViewModel2.f32543J;
            C<U8.c> c11 = mainViewModel2.f32608u0;
            if (i11 == 0) {
                c11.j(U8.c.a(mainViewModel2.c(), this.this$0.f32595o.a(R.string.viw_main_no_faulty_units, new Object[0]), -1, null, false, new u(size, list.size()), 20));
            } else {
                c11.j(U8.c.a(mainViewModel2.c(), String.format(Locale.US, "%d %s", Arrays.copyOf(new Object[]{new Integer(size), this.this$0.f32595o.a(R.string.common_faulty_cus, new Object[0])}, 2)), -65536, this.this$0.f32595o.a(R.string.view_main_hold_to_clear, new Object[0]), false, new u(size, list.size()), 16));
            }
            MainViewModel mainViewModel3 = this.this$0;
            mainViewModel3.f32528B0.j(Boolean.valueOf((mainViewModel3.f32601r.H() && (this.this$0.f32597p.f34233d instanceof ControlUnitListFragment)) ? false : true));
            C<Boolean> c12 = this.this$0.f32577a0;
            Boolean bool2 = Boolean.TRUE;
            c12.j(bool2);
            this.this$0.f32565U.j(bool2);
            this.this$0.f32569W.j(bool);
            this.this$0.f32599q.a();
        } else if (aVar instanceof C8.a.C0024a) {
            this.this$0.f32537G.d(((C8.a.C0024a) aVar).f2462a, false);
        }
        return r.f47939a;
    }
}
