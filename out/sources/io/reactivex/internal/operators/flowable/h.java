package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.ScalarSubscription;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: FlowableScalarXMap.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: compiled from: FlowableScalarXMap.java */
    public static final class a<T, R> extends p123ja.d<R> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T f40763c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final p183oa.c<? super T, ? extends bc.a<? extends R>> f40764d;

        public a(T t8, p183oa.c<? super T, ? extends bc.a<? extends R>> cVar) {
            this.f40763c = t8;
            this.f40764d = cVar;
        }

        @Override // p123ja.d
        public final void e(p123ja.g gVar) {
            try {
                bc.a<? extends R> aVarApply = this.f40764d.apply(this.f40763c);
                Q3.d.I(aVarApply, "The mapper returned a null Publisher");
                bc.a<? extends R> aVar = aVarApply;
                if (!(aVar instanceof Callable)) {
                    aVar.a(gVar);
                    return;
                }
                try {
                    Object objCall = ((Callable) aVar).call();
                    if (objCall == null) {
                        EmptySubscription.a(gVar);
                    } else {
                        gVar.e(new ScalarSubscription(gVar, objCall));
                    }
                } catch (Throwable th) {
                    Fa.d.g(th);
                    EmptySubscription.b(th, gVar);
                }
            } catch (Throwable th2) {
                EmptySubscription.b(th2, gVar);
            }
        }
    }

    public static boolean a(bc.a aVar, p123ja.g gVar, p183oa.c cVar) {
        if (!(aVar instanceof Callable)) {
            return false;
        }
        try {
            Object objCall = ((Callable) aVar).call();
            if (objCall == null) {
                EmptySubscription.a(gVar);
                return true;
            }
            try {
                Object objApply = cVar.apply(objCall);
                Q3.d.I(objApply, "The mapper returned a null Publisher");
                bc.a aVar2 = (bc.a) objApply;
                if (aVar2 instanceof Callable) {
                    try {
                        Object objCall2 = ((Callable) aVar2).call();
                        if (objCall2 == null) {
                            EmptySubscription.a(gVar);
                            return true;
                        }
                        gVar.e(new ScalarSubscription(gVar, objCall2));
                    } catch (Throwable th) {
                        Fa.d.g(th);
                        EmptySubscription.b(th, gVar);
                        return true;
                    }
                } else {
                    aVar2.a(gVar);
                }
                return true;
            } catch (Throwable th2) {
                Fa.d.g(th2);
                EmptySubscription.b(th2, gVar);
                return true;
            }
        } catch (Throwable th3) {
            Fa.d.g(th3);
            EmptySubscription.b(th3, gVar);
            return true;
        }
    }
}
