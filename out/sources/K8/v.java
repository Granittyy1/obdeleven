package K8;

import G8.D;
import G8.E;
import G8.H;
import com.voltasit.obdeleven.domain.models.SubscriptionType;
import com.voltasit.obdeleven.domain.models.UserPermission;
import java.io.Serializable;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.StateFlowImpl;
import p255u9.z;

/* JADX INFO: compiled from: UserRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface v {
    StateFlowImpl A();

    kotlinx.coroutines.flow.v B();

    boolean C(UserPermission... userPermissionArr);

    Object D(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl);

    Object E(String str, ContinuationImpl continuationImpl);

    Object F(ContinuationImpl continuationImpl);

    Object G(ContinuationImpl continuationImpl);

    Serializable H(ContinuationImpl continuationImpl);

    Object I(ContinuationImpl continuationImpl);

    Object J(String str, ContinuationImpl continuationImpl);

    D K();

    z L();

    kotlinx.coroutines.flow.v M();

    Object N(kotlin.coroutines.c<? super p293xa.r> cVar);

    kotlinx.coroutines.flow.v O();

    Object P(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl);

    Object d(p316z9.q qVar, ContinuationImpl continuationImpl);

    Object h(ContinuationImpl continuationImpl);

    Object j(String str, ContinuationImpl continuationImpl);

    Object m(String str, ContinuationImpl continuationImpl);

    Object n(String str, ContinuationImpl continuationImpl);

    Object o(String str, String str2, ContinuationImpl continuationImpl);

    Object p(String str, String str2, String str3, String str4, String str5, String str6, String str7, ContinuationImpl continuationImpl);

    Object q(boolean z10, ContinuationImpl continuationImpl);

    Object r(ContinuationImpl continuationImpl);

    Object s(String str, ContinuationImpl continuationImpl);

    Object t(H h8, ContinuationImpl continuationImpl);

    Object u(SubscriptionType subscriptionType, ContinuationImpl continuationImpl);

    Object v(kotlin.coroutines.c<? super C8.a<E>> cVar);

    Object w(List list, ContinuationImpl continuationImpl);

    boolean x();

    kotlinx.coroutines.channels.a<Boolean> y();

    boolean z();
}
