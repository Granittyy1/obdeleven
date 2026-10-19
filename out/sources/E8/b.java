package E8;

import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.exceptions.NoNetworkException;
import kotlin.jvm.internal.i;
import p220r9.J;
import p293xa.d;

/* JADX INFO: compiled from: ThrowableExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    @d
    public static final int a(Throwable th) {
        i.e(th, "<this>");
        return th.equals(NoNetworkException.f30412b) ? R.string.common_check_network_try_again : J.f(th);
    }
}
