package kotlinx.coroutines.internal;

import D2.V;
import kotlinx.coroutines.C2714y;

/* JADX INFO: compiled from: OnUndeliveredElement.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class OnUndeliveredElementKt {
    public static final <E> Ia.l<Throwable, p293xa.r> a(final Ia.l<? super E, p293xa.r> lVar, final E e10, final kotlin.coroutines.e eVar) {
        return new Ia.l<Throwable, p293xa.r>() { // from class: kotlinx.coroutines.internal.OnUndeliveredElementKt$bindCancellationFun$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Throwable th) {
                Ia.l<E, p293xa.r> lVar2 = lVar;
                E e11 = e10;
                kotlin.coroutines.e eVar2 = eVar;
                UndeliveredElementException undeliveredElementExceptionB = OnUndeliveredElementKt.b(lVar2, e11, null);
                if (undeliveredElementExceptionB != null) {
                    C2714y.a(eVar2, undeliveredElementExceptionB);
                }
                return p293xa.r.f47939a;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> UndeliveredElementException b(Ia.l<? super E, p293xa.r> lVar, E e10, UndeliveredElementException undeliveredElementException) {
        try {
            lVar.invoke(e10);
        } catch (Throwable th) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th) {
                return new UndeliveredElementException(coil.intercept.a.a(e10, "Exception in undelivered element handler for "), th);
            }
            V.e(undeliveredElementException, th);
        }
        return undeliveredElementException;
    }
}
