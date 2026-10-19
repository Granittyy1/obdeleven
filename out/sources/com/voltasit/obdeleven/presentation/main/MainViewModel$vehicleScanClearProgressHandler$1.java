package com.voltasit.obdeleven.presentation.main;

import G8.I;
import Ia.p;
import androidx.lifecycle.C;
import com.obdeleven.service.model.fault.Fault;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.q;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;
import kotlinx.coroutines.q0;
import p293xa.r;

/* JADX INFO: compiled from: MainViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.main.MainViewModel$vehicleScanClearProgressHandler$1", f = "MainViewModel.kt", l = {192}, m = "invokeSuspend")
public final class MainViewModel$vehicleScanClearProgressHandler$1 extends SuspendLambda implements p<I, kotlin.coroutines.c<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MainViewModel this$0;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.main.MainViewModel$vehicleScanClearProgressHandler$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: MainViewModel.kt */
    @Aa.c(c = "com.voltasit.obdeleven.presentation.main.MainViewModel$vehicleScanClearProgressHandler$1$1", f = "MainViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super Boolean>, Object> {
        final /* synthetic */ I $progress;
        int label;
        final /* synthetic */ MainViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(I i10, MainViewModel mainViewModel, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$progress = i10;
            this.this$0 = mainViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.$progress, this.this$0, cVar);
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super Boolean> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            I i10 = this.$progress;
            if (i10 instanceof I.a) {
                this.this$0.k();
                z10 = this.this$0.f32545K;
            } else if (i10 instanceof I.c) {
                MainViewModel mainViewModel = this.this$0;
                I.c cVar = (I.c) i10;
                List<p109i8.e> list = cVar.f3437a;
                p109i8.e eVar = cVar.f3438b;
                mainViewModel.f32608u0.j(U8.c.a(mainViewModel.c(), null, 0, (list.indexOf(eVar) + 1) + "/" + list.size(), false, null, 59));
                mainViewModel.f32591k0.j(eVar.t());
                mainViewModel.f32593m0.j(eVar.x(mainViewModel.f32601r.Q().b()));
                z10 = this.this$0.f32545K;
            } else {
                if (!(i10 instanceof I.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                MainViewModel mainViewModel2 = this.this$0;
                p109i8.e eVar2 = ((I.b) i10).f3436b;
                mainViewModel2.getClass();
                if (eVar2.h()) {
                    C<List<p109i8.e>> c10 = mainViewModel2.f32604s0;
                    List<p109i8.e> listD = c10.d();
                    ArrayList arrayListP0 = listD != null ? q.p0(listD) : new ArrayList();
                    arrayListP0.add(eVar2);
                    c10.j(arrayListP0);
                    ArrayList arrayListQ = eVar2.q();
                    Iterator it = arrayListQ.iterator();
                    while (it.hasNext()) {
                        if (((Fault) it.next()).f29438i == 3) {
                            mainViewModel2.f32541I++;
                        }
                    }
                    int size = arrayListQ.size() + mainViewModel2.f32543J;
                    mainViewModel2.f32543J = size;
                    mainViewModel2.f32596o0.j(Integer.valueOf(size == 0 ? 50 : 100 - ((mainViewModel2.f32541I * 100) / size)));
                    mainViewModel2.f32589i0.j(String.valueOf(mainViewModel2.f32543J));
                    mainViewModel2.n(eVar2.n().shortValue());
                }
                z10 = this.this$0.f32545K;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$vehicleScanClearProgressHandler$1(MainViewModel mainViewModel, kotlin.coroutines.c<? super MainViewModel$vehicleScanClearProgressHandler$1> cVar) {
        super(2, cVar);
        this.this$0 = mainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        MainViewModel$vehicleScanClearProgressHandler$1 mainViewModel$vehicleScanClearProgressHandler$1 = new MainViewModel$vehicleScanClearProgressHandler$1(this.this$0, cVar);
        mainViewModel$vehicleScanClearProgressHandler$1.L$0 = obj;
        return mainViewModel$vehicleScanClearProgressHandler$1;
    }

    @Override // Ia.p
    public final Object invoke(I i10, kotlin.coroutines.c<? super Boolean> cVar) {
        return ((MainViewModel$vehicleScanClearProgressHandler$1) create(i10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            I i11 = (I) this.L$0;
            Sa.b bVar = N.f43198a;
            q0 q0Var = kotlinx.coroutines.internal.q.f43500a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(i11, this.this$0, null);
            this.label = 1;
            obj = C2680e.f(q0Var, anonymousClass1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return obj;
    }
}
