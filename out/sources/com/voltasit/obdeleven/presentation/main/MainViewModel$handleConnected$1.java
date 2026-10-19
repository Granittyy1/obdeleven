package com.voltasit.obdeleven.presentation.main;

import G8.u;
import Ia.p;
import androidx.lifecycle.C;
import com.obdeleven.service.model.fault.Fault;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.usecases.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: MainViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.main.MainViewModel$handleConnected$1", f = "MainViewModel.kt", l = {360}, m = "invokeSuspend")
public final class MainViewModel$handleConnected$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ MainViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$handleConnected$1(MainViewModel mainViewModel, kotlin.coroutines.c<? super MainViewModel$handleConnected$1> cVar) {
        super(2, cVar);
        this.this$0 = mainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new MainViewModel$handleConnected$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((MainViewModel$handleConnected$1) create(a10, cVar)).invokeSuspend(r.f47939a);
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
            MainViewModel mainViewModel = this.this$0;
            mainViewModel.f32537G.e("MainViewModel", "handleConnectedSuccess()");
            List<p109i8.e> list = (List) ((C8.a.b) aVar).f2463a;
            ArrayList arrayList = new ArrayList();
            for (p109i8.e eVar : list) {
                if (eVar.h()) {
                    arrayList.add(eVar);
                    ArrayList arrayListQ = eVar.q();
                    Iterator it = arrayListQ.iterator();
                    while (it.hasNext()) {
                        if (((Fault) it.next()).f29438i == 3) {
                            mainViewModel.f32541I++;
                        }
                    }
                    mainViewModel.f32543J = arrayListQ.size() + mainViewModel.f32543J;
                    mainViewModel.n(eVar.n().shortValue());
                }
            }
            mainViewModel.f32604s0.j(arrayList);
            C<Integer> c10 = mainViewModel.f32596o0;
            int i11 = mainViewModel.f32543J;
            c10.j(Integer.valueOf(i11 == 0 ? 50 : 100 - ((mainViewModel.f32541I * 100) / i11)));
            mainViewModel.f32589i0.j(String.valueOf(mainViewModel.f32543J));
            boolean zIsEmpty = arrayList.isEmpty();
            C<U8.c> c11 = mainViewModel.f32608u0;
            J8.d dVar = mainViewModel.f32595o;
            if (zIsEmpty) {
                c11.j(U8.c.a(mainViewModel.c(), dVar.a(R.string.viw_main_no_faulty_units, new Object[0]), -1, "", false, new u(arrayList.size(), list.size()), 16));
            } else {
                c11.j(U8.c.a(mainViewModel.c(), String.format(Locale.US, "%d %s", Arrays.copyOf(new Object[]{Integer.valueOf(arrayList.size()), dVar.a(R.string.common_faulty_cus, new Object[0])}, 2)), -65536, dVar.a(R.string.view_main_hold_to_clear, new Object[0]), false, new u(arrayList.size(), list.size()), 16));
            }
        } else {
            if (!(aVar instanceof C8.a.C0024a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.this$0.f32537G.d(((C8.a.C0024a) aVar).f2462a, false);
        }
        r rVar = r.f47939a;
        Na.i iVar = E8.a.f3126a;
        return rVar;
    }
}
