package kotlinx.datetime.format;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import kotlinx.datetime.DateTimeFormatException;

/* JADX INFO: compiled from: LocalDateFormat.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class p implements InterfaceC2720e, kotlinx.datetime.internal.format.parser.c<p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f43828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f43829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f43830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f43831d;

    public p() {
        this(null, null, null, null);
    }

    @Override // kotlinx.datetime.internal.format.parser.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final p d() {
        return new p(this.f43828a, this.f43829b, this.f43830c, this.f43831d);
    }

    public final Ua.e b() {
        Integer num = this.f43828a;
        LocalDateFormatKt.a(num, "year");
        int iIntValue = num.intValue();
        Integer num2 = this.f43829b;
        LocalDateFormatKt.a(num2, "monthNumber");
        int iIntValue2 = num2.intValue();
        Integer num3 = this.f43830c;
        LocalDateFormatKt.a(num3, "dayOfMonth");
        try {
            LocalDate localDateOf = LocalDate.of(iIntValue, iIntValue2, num3.intValue());
            kotlin.jvm.internal.i.b(localDateOf);
            Ua.e eVar = new Ua.e(localDateOf);
            Integer num4 = this.f43831d;
            if (num4 != null) {
                int iIntValue3 = num4.intValue();
                DayOfWeek dayOfWeek = localDateOf.getDayOfWeek();
                kotlin.jvm.internal.i.d(dayOfWeek, "getDayOfWeek(...)");
                if (iIntValue3 != dayOfWeek.ordinal() + 1) {
                    StringBuilder sb2 = new StringBuilder("Can not create a LocalDate from the given input: the day of week is ");
                    if (1 > iIntValue3 || iIntValue3 >= 8) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    sb2.append(Ua.b.f6574a.get(iIntValue3 - 1));
                    sb2.append(" but the date is ");
                    sb2.append(eVar);
                    sb2.append(", which is a ");
                    DayOfWeek dayOfWeek2 = localDateOf.getDayOfWeek();
                    kotlin.jvm.internal.i.d(dayOfWeek2, "getDayOfWeek(...)");
                    sb2.append(dayOfWeek2);
                    throw new DateTimeFormatException(sb2.toString());
                }
            }
            return eVar;
        } catch (DateTimeException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (kotlin.jvm.internal.i.a(this.f43828a, pVar.f43828a) && kotlin.jvm.internal.i.a(this.f43829b, pVar.f43829b) && kotlin.jvm.internal.i.a(this.f43830c, pVar.f43830c) && kotlin.jvm.internal.i.a(this.f43831d, pVar.f43831d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f43828a;
        int iHashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f43829b;
        int iHashCode2 = ((num2 != null ? num2.hashCode() : 0) * 31) + iHashCode;
        Integer num3 = this.f43830c;
        int iHashCode3 = ((num3 != null ? num3.hashCode() : 0) * 31) + iHashCode2;
        Integer num4 = this.f43831d;
        return ((num4 != null ? num4.hashCode() : 0) * 31) + iHashCode3;
    }

    @Override // kotlinx.datetime.format.InterfaceC2720e
    public final void i(Integer num) {
        this.f43829b = num;
    }

    @Override // kotlinx.datetime.format.InterfaceC2720e
    public final Integer l() {
        return this.f43828a;
    }

    @Override // kotlinx.datetime.format.InterfaceC2720e
    public final void m(Integer num) {
        this.f43830c = num;
    }

    @Override // kotlinx.datetime.format.InterfaceC2720e
    public final Integer p() {
        return this.f43831d;
    }

    @Override // kotlinx.datetime.format.InterfaceC2720e
    public final void q(Integer num) {
        this.f43828a = num;
    }

    @Override // kotlinx.datetime.format.InterfaceC2720e
    public final Integer s() {
        return this.f43830c;
    }

    @Override // kotlinx.datetime.format.InterfaceC2720e
    public final Integer t() {
        return this.f43829b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        Object obj = this.f43828a;
        if (obj == null) {
            obj = "??";
        }
        sb2.append(obj);
        sb2.append('-');
        Object obj2 = this.f43829b;
        if (obj2 == null) {
            obj2 = "??";
        }
        sb2.append(obj2);
        sb2.append('-');
        Object obj3 = this.f43830c;
        if (obj3 == null) {
            obj3 = "??";
        }
        sb2.append(obj3);
        sb2.append(" (day of week is ");
        Integer num = this.f43831d;
        return B6.c.e(sb2, num != null ? num : "??", ')');
    }

    @Override // kotlinx.datetime.format.InterfaceC2720e
    public final void v(Integer num) {
        this.f43831d = num;
    }

    public p(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f43828a = num;
        this.f43829b = num2;
        this.f43830c = num3;
        this.f43831d = num4;
    }
}
