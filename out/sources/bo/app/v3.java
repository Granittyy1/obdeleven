package bo.app;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public abstract class v3 {
    public static final BigDecimal a(BigDecimal bigDecimal) {
        kotlin.jvm.internal.i.e(bigDecimal, "<this>");
        BigDecimal scale = bigDecimal.setScale(2, RoundingMode.HALF_UP);
        kotlin.jvm.internal.i.d(scale, "this.setScale(2, RoundingMode.HALF_UP)");
        return scale;
    }
}
