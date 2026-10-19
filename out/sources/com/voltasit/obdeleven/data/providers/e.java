package com.voltasit.obdeleven.data.providers;

import java.time.Clock;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import kotlinx.datetime.DateTimeArithmeticException;

/* JADX INFO: compiled from: DateProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements J8.f {
    @Override // J8.f
    public final String a(long j) {
        Ua.d.Companion.getClass();
        Instant instantOfEpochMilli = Instant.ofEpochMilli(j);
        kotlin.jvm.internal.i.d(instantOfEpochMilli, "ofEpochMilli(...)");
        Ua.d dVar = new Ua.d(instantOfEpochMilli);
        Ua.h.Companion.getClass();
        LocalDate localDate = F8.a.k(dVar, Ua.h.f6583b).f6580b.toLocalDate();
        kotlin.jvm.internal.i.d(localDate, "toLocalDate(...)");
        return new Ua.e(localDate).toString();
    }

    @Override // J8.f
    public final long b() {
        return System.currentTimeMillis();
    }

    @Override // J8.f
    public final Ua.d c() {
        Ua.d.Companion.getClass();
        Instant instant = Clock.systemUTC().instant();
        kotlin.jvm.internal.i.d(instant, "instant(...)");
        return new Ua.d(instant);
    }

    @Override // J8.f
    public final long d(String str) {
        long epochMilli;
        try {
            Instant instant = Ua.d.a.a(Ua.d.Companion, str).f6577b;
            try {
                epochMilli = instant.toEpochMilli();
            } catch (ArithmeticException unused) {
                epochMilli = instant.isAfter(Instant.EPOCH) ? Long.MAX_VALUE : Long.MIN_VALUE;
            }
            return epochMilli;
        } catch (IllegalArgumentException unused2) {
            return 0L;
        }
    }

    @Override // J8.f
    public final long e(long j) throws Exception {
        Ua.d.Companion.getClass();
        Instant instantOfEpochMilli = Instant.ofEpochMilli(j);
        kotlin.jvm.internal.i.d(instantOfEpochMilli, "ofEpochMilli(...)");
        Ua.d dVar = new Ua.d(instantOfEpochMilli);
        Ua.a.Companion.getClass();
        Ua.a.d unit = Ua.a.f6568a;
        Ua.h.Companion.getClass();
        Ua.c timeZone = Ua.h.f6583b;
        kotlin.jvm.internal.i.e(unit, "unit");
        kotlin.jvm.internal.i.e(timeZone, "timeZone");
        long j10 = 1;
        try {
            try {
                ZonedDateTime zonedDateTimeAtZone = instantOfEpochMilli.atZone(timeZone.f6584a);
                kotlin.jvm.internal.i.b(zonedDateTimeAtZone);
                Instant instant = zonedDateTimeAtZone.plusMonths(Math.multiplyExact(j10, unit.f6570b)).toInstant();
                new Ua.d(instant);
                try {
                    return instant.toEpochMilli();
                } catch (ArithmeticException unused) {
                    return instant.isAfter(Instant.EPOCH) ? Long.MAX_VALUE : Long.MIN_VALUE;
                }
            } catch (Exception e10) {
                if (!(e10 instanceof DateTimeException) && !(e10 instanceof ArithmeticException)) {
                    throw e10;
                }
                String message = "Instant " + dVar + " cannot be represented as local date when adding 1 " + unit + " to it";
                kotlin.jvm.internal.i.e(message, "message");
                throw new DateTimeArithmeticException(message, e10);
            }
        } catch (DateTimeException e11) {
            throw new DateTimeArithmeticException(e11);
        }
    }
}
