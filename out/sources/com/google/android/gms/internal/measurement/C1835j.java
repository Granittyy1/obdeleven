package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1835j implements InterfaceC1884q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f25775b;

    public C1835j(Double d10) {
        if (d10 == null) {
            this.f25775b = Double.valueOf(Double.NaN);
        } else {
            this.f25775b = d10;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final String A() {
        Double d10 = this.f25775b;
        if (Double.isNaN(d10.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d10.doubleValue())) {
            return d10.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d10.doubleValue());
        BigDecimal bigDecimal = (bigDecimalValueOf.signum() == 0 || bigDecimalValueOf.signum() == 0) ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf.stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String str = decimalFormat.format(bigDecimal);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i10 = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i10 >= 0 || i10 <= -7) && (i10 < 0 || i10 >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final Iterator<InterfaceC1884q> B() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final InterfaceC1884q C(String str, Y1 y10, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new C1897s(A());
        }
        throw new IllegalArgumentException(C4.b.d(A(), ".", str, " is not a function."));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final Boolean b() {
        Double d10 = this.f25775b;
        return Boolean.valueOf((Double.isNaN(d10.doubleValue()) || d10.doubleValue() == 0.0d) ? false : true);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1835j) {
            return this.f25775b.equals(((C1835j) obj).f25775b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25775b.hashCode();
    }

    public final String toString() {
        return A();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final InterfaceC1884q y() {
        return new C1835j(this.f25775b);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final Double z() {
        return this.f25775b;
    }
}
