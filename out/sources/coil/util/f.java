package coil.util;

import coil.size.Scale;
import com.braze.support.BrazeLogger;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final int a(Z2.a aVar, Scale scale) {
        if (aVar instanceof Z2.a.C0110a) {
            return ((Z2.a.C0110a) aVar).f7725a;
        }
        int iOrdinal = scale.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return BrazeLogger.SUPPRESS;
        }
        throw new NoWhenBranchMatchedException();
    }
}
