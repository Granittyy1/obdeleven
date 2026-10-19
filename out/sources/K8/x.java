package K8;

import A8.A;
import G8.H;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p255u9.D;
import p255u9.E;
import p255u9.F;

/* JADX INFO: compiled from: VehicleRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface x {
    A a();

    Object b(List<D> list, kotlin.coroutines.c<? super C8.a<? extends List<? extends F>>> cVar);

    Object c(String str, String str2, kotlin.coroutines.c<? super C8.a<? extends List<H>>> cVar);

    Object d(String str, ContinuationImpl continuationImpl);

    void e(E e10);

    Object f(H h8, SuspendLambda suspendLambda);

    void g(E e10, F f10);

    kotlinx.coroutines.channels.a<H> h();

    Object i(String str, ContinuationImpl continuationImpl);

    Object j(ContinuationImpl continuationImpl);

    Object k(String str, kotlin.coroutines.c<? super C8.a<? extends List<? extends Object>>> cVar);

    Object l(int i10, int i11, String str, ContinuationImpl continuationImpl);

    Object m(E e10, ContinuationImpl continuationImpl);
}
