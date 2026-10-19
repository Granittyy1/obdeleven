package androidx.datastore.core;

import Ia.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p293xa.r;

/* JADX INFO: compiled from: SingleProcessDataStore.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.datastore.core.SingleProcessDataStore$actor$3", f = "SingleProcessDataStore.kt", l = {239, 242}, m = "invokeSuspend")
final class SingleProcessDataStore$actor$3 extends SuspendLambda implements p<j.a<Object>, kotlin.coroutines.c<? super r>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ j<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$actor$3(j<Object> jVar, kotlin.coroutines.c<? super SingleProcessDataStore$actor$3> cVar) {
        super(2, cVar);
        this.this$0 = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        SingleProcessDataStore$actor$3 singleProcessDataStore$actor$3 = new SingleProcessDataStore$actor$3(this.this$0, cVar);
        singleProcessDataStore$actor$3.L$0 = obj;
        return singleProcessDataStore$actor$3;
    }

    @Override // Ia.p
    public final Object invoke(j.a<Object> aVar, kotlin.coroutines.c<? super r> cVar) {
        return ((SingleProcessDataStore$actor$3) create(aVar, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objF;
        Object obj2 = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            j.a aVar = (j.a) this.L$0;
            if (aVar instanceof j.a.C0177a) {
                j<Object> jVar = this.this$0;
                j.a.C0177a c0177a = (j.a.C0177a) aVar;
                this.label = 1;
                l lVar = (l) jVar.f17053g.getValue();
                if (lVar instanceof b) {
                    objF = r.f47939a;
                } else if (lVar instanceof i) {
                    if (lVar != c0177a.f17056a || (objF = jVar.f(this)) != obj2) {
                        objF = r.f47939a;
                    }
                } else if (kotlin.jvm.internal.i.a(lVar, m.f17066a)) {
                    objF = jVar.f(this);
                    if (objF != obj2) {
                        objF = r.f47939a;
                    }
                } else {
                    if (lVar instanceof g) {
                        throw new IllegalStateException("Can't read in final state.");
                    }
                    objF = r.f47939a;
                }
                if (objF == obj2) {
                    return obj2;
                }
            } else if (aVar instanceof j.a.b) {
                this.label = 2;
                if (j.b(this.this$0, (j.a.b) aVar, this) == obj2) {
                    return obj2;
                }
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return r.f47939a;
    }
}
