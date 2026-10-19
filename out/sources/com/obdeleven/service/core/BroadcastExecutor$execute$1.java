package com.obdeleven.service.core;

import Ia.p;
import com.parse.boltsinternal.Task;
import com.parse.boltsinternal.TaskCompletionSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.collections.q;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: BroadcastExecutor.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.obdeleven.service.core.BroadcastExecutor$execute$1", f = "BroadcastExecutor.kt", l = {16, 22}, m = "invokeSuspend")
final class BroadcastExecutor$execute$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ TaskCompletionSource<List<Short>> $tcs;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastExecutor$execute$1(TaskCompletionSource<List<Short>> taskCompletionSource, kotlin.coroutines.c<? super BroadcastExecutor$execute$1> cVar) {
        super(2, cVar);
        this.$tcs = taskCompletionSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new BroadcastExecutor$execute$1(this.$tcs, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((BroadcastExecutor$execute$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        List list2;
        Iterable iterable;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        try {
            try {
                if (i10 == 0) {
                    kotlin.b.b(obj);
                    Z7.c cVar = new Z7.c(Z7.c.f7959i);
                    cVar.f7960h = new ArrayList();
                    Task<List<Short>> taskA = cVar.a();
                    this.label = 1;
                    obj = O3.d.s(taskA, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        list2 = (List) this.L$0;
                        try {
                            kotlin.b.b(obj);
                            iterable = (Set) obj;
                        } catch (Exception unused) {
                            iterable = EmptySet.f42985b;
                        }
                        TaskCompletionSource<List<Short>> taskCompletionSource = this.$tcs;
                        i.b(list2);
                        i.b(iterable);
                        taskCompletionSource.setResult(q.o0(q.r0(q.c0(list2, iterable))));
                        return r.f47939a;
                    }
                    kotlin.b.b(obj);
                }
                Task<Set<? extends Short>> taskA2 = new Z7.b().a();
                this.L$0 = list;
                this.label = 2;
                Object objS = O3.d.s(taskA2, this);
                if (objS == coroutineSingletons) {
                    return coroutineSingletons;
                }
                list2 = list;
                obj = objS;
                iterable = (Set) obj;
                TaskCompletionSource<List<Short>> taskCompletionSource2 = this.$tcs;
                i.b(list2);
                i.b(iterable);
                taskCompletionSource2.setResult(q.o0(q.r0(q.c0(list2, iterable))));
                return r.f47939a;
            } catch (Exception unused2) {
                list2 = list;
                iterable = EmptySet.f42985b;
            }
            list = (List) obj;
        } catch (Exception e10) {
            this.$tcs.setError(e10);
            return r.f47939a;
        }
    }
}
