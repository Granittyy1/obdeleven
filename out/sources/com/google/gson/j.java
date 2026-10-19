package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: compiled from: JsonPrimitive.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Serializable f28986b;

    public j(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f28986b = bool;
    }

    public static boolean v(j jVar) {
        Serializable serializable = jVar.f28986b;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.google.gson.g
    public final String e() {
        Serializable serializable = this.f28986b;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return s().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        Serializable serializable = this.f28986b;
        Serializable serializable2 = jVar.f28986b;
        if (serializable == null) {
            return serializable2 == null;
        }
        if (v(this) && v(jVar)) {
            if ((serializable instanceof BigInteger) || (serializable2 instanceof BigInteger)) {
                return g().equals(jVar.g());
            }
            return s().longValue() == jVar.s().longValue();
        }
        if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
            return serializable.equals(serializable2);
        }
        if ((serializable instanceof BigDecimal) && (serializable2 instanceof BigDecimal)) {
            return (serializable instanceof BigDecimal ? (BigDecimal) serializable : com.google.gson.internal.e.b(e())).compareTo(serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : com.google.gson.internal.e.b(jVar.e())) == 0;
        }
        double dQ = q();
        double dQ2 = jVar.q();
        if (dQ != dQ2) {
            return Double.isNaN(dQ) && Double.isNaN(dQ2);
        }
        return true;
    }

    public final BigInteger g() {
        Serializable serializable = this.f28986b;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (v(this)) {
            return BigInteger.valueOf(s().longValue());
        }
        String strE = e();
        com.google.gson.internal.e.a(strE);
        return new BigInteger(strE);
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f28986b;
        if (serializable == null) {
            return 31;
        }
        if (v(this)) {
            jDoubleToLongBits = s().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(s().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final boolean k() {
        Serializable serializable = this.f28986b;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(e());
    }

    public final double q() {
        return this.f28986b instanceof Number ? s().doubleValue() : Double.parseDouble(e());
    }

    public final Number s() {
        Serializable serializable = this.f28986b;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new LazilyParsedNumber((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public j(Number number) {
        Objects.requireNonNull(number);
        this.f28986b = number;
    }

    public j(String str) {
        Objects.requireNonNull(str);
        this.f28986b = str;
    }
}
