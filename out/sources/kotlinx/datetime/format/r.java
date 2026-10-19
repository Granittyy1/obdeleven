package kotlinx.datetime.format;

import java.time.DateTimeException;
import java.time.LocalTime;
import kotlinx.datetime.DateTimeFormatException;

/* JADX INFO: compiled from: LocalTimeFormat.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class r implements C, kotlinx.datetime.internal.format.parser.c<r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f43834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f43835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AmPmMarker f43836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f43837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer f43838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f43839f;

    public r() {
        this(0);
    }

    @Override // kotlinx.datetime.format.C
    public final void A(Integer num) {
        this.f43838e = num;
    }

    @Override // kotlinx.datetime.format.C
    public final Integer a() {
        return this.f43837d;
    }

    @Override // kotlinx.datetime.format.C
    public final Integer b() {
        return this.f43834a;
    }

    @Override // kotlinx.datetime.format.C
    public final void c(AmPmMarker amPmMarker) {
        this.f43836c = amPmMarker;
    }

    @Override // kotlinx.datetime.format.C
    public final AmPmMarker e() {
        return this.f43836c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (kotlin.jvm.internal.i.a(this.f43834a, rVar.f43834a) && kotlin.jvm.internal.i.a(this.f43835b, rVar.f43835b) && this.f43836c == rVar.f43836c && kotlin.jvm.internal.i.a(this.f43837d, rVar.f43837d) && kotlin.jvm.internal.i.a(this.f43838e, rVar.f43838e) && kotlin.jvm.internal.i.a(this.f43839f, rVar.f43839f)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.datetime.internal.format.parser.c
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final r d() {
        return new r(this.f43834a, this.f43835b, this.f43836c, this.f43837d, this.f43838e, this.f43839f);
    }

    @Override // kotlinx.datetime.format.C
    public final void g(Va.a aVar) {
        this.f43839f = aVar != null ? Integer.valueOf(aVar.a(9)) : null;
    }

    @Override // kotlinx.datetime.format.C
    public final void h(Integer num) {
        this.f43835b = num;
    }

    public final int hashCode() {
        Integer num = this.f43834a;
        int iIntValue = (num != null ? num.intValue() : 0) * 31;
        Integer num2 = this.f43835b;
        int iIntValue2 = ((num2 != null ? num2.intValue() : 0) * 31) + iIntValue;
        AmPmMarker amPmMarker = this.f43836c;
        int iHashCode = ((amPmMarker != null ? amPmMarker.hashCode() : 0) * 31) + iIntValue2;
        Integer num3 = this.f43837d;
        int iIntValue3 = ((num3 != null ? num3.intValue() : 0) * 31) + iHashCode;
        Integer num4 = this.f43838e;
        int iIntValue4 = ((num4 != null ? num4.intValue() : 0) * 31) + iIntValue3;
        Integer num5 = this.f43839f;
        return iIntValue4 + (num5 != null ? num5.intValue() : 0);
    }

    public final Ua.g i() {
        int iIntValue;
        int iIntValue2;
        Integer num = this.f43834a;
        if (num != null) {
            iIntValue = num.intValue();
            Integer num2 = this.f43835b;
            if (num2 != null && ((iIntValue + 11) % 12) + 1 != (iIntValue2 = num2.intValue())) {
                throw new IllegalArgumentException(A8.f.d(iIntValue, iIntValue2, "Inconsistent hour and hour-of-am-pm: hour is ", ", but hour-of-am-pm is ").toString());
            }
            AmPmMarker amPmMarker = this.f43836c;
            if (amPmMarker != null) {
                if ((amPmMarker == AmPmMarker.f43631c) != (iIntValue >= 12)) {
                    throw new IllegalArgumentException(("Inconsistent hour and the AM/PM marker: hour is " + iIntValue + ", but the AM/PM marker is " + amPmMarker).toString());
                }
            }
        } else {
            Integer num3 = this.f43835b;
            Integer numValueOf = null;
            if (num3 != null) {
                int iIntValue3 = num3.intValue();
                AmPmMarker amPmMarker2 = this.f43836c;
                if (amPmMarker2 != null) {
                    if (iIntValue3 == 12) {
                        iIntValue3 = 0;
                    }
                    numValueOf = Integer.valueOf(iIntValue3 + (amPmMarker2 != AmPmMarker.f43631c ? 0 : 12));
                }
            }
            if (numValueOf == null) {
                throw new DateTimeFormatException("Incomplete time: missing hour");
            }
            iIntValue = numValueOf.intValue();
        }
        Integer num4 = this.f43837d;
        LocalDateFormatKt.a(num4, "minute");
        int iIntValue4 = num4.intValue();
        Integer num5 = this.f43838e;
        int iIntValue5 = num5 != null ? num5.intValue() : 0;
        Integer num6 = this.f43839f;
        try {
            LocalTime localTimeOf = LocalTime.of(iIntValue, iIntValue4, iIntValue5, num6 != null ? num6.intValue() : 0);
            kotlin.jvm.internal.i.b(localTimeOf);
            return new Ua.g(localTimeOf);
        } catch (DateTimeException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // kotlinx.datetime.format.C
    public final void k(Integer num) {
        this.f43837d = num;
    }

    @Override // kotlinx.datetime.format.C
    public final Va.a n() {
        Integer num = this.f43839f;
        if (num != null) {
            return new Va.a(num.intValue(), 9);
        }
        return null;
    }

    @Override // kotlinx.datetime.format.C
    public final Integer o() {
        return this.f43835b;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    public final String toString() {
        String strW;
        StringBuilder sb2 = new StringBuilder();
        Object obj = this.f43834a;
        if (obj == null) {
            obj = "??";
        }
        sb2.append(obj);
        sb2.append(':');
        Object obj2 = this.f43837d;
        if (obj2 == null) {
            obj2 = "??";
        }
        sb2.append(obj2);
        sb2.append(':');
        Integer num = this.f43838e;
        sb2.append(num != null ? num : "??");
        sb2.append('.');
        Integer num2 = this.f43839f;
        if (num2 != null) {
            String strValueOf = String.valueOf(num2.intValue());
            strW = kotlin.text.n.W(9 - strValueOf.length(), strValueOf);
            if (strW == null) {
                strW = "???";
            }
        } else {
            strW = "???";
        }
        sb2.append(strW);
        return sb2.toString();
    }

    @Override // kotlinx.datetime.format.C
    public final void u(Integer num) {
        this.f43834a = num;
    }

    @Override // kotlinx.datetime.format.C
    public final Integer y() {
        return this.f43838e;
    }

    public /* synthetic */ r(int i10) {
        this(null, null, null, null, null, null);
    }

    public r(Integer num, Integer num2, AmPmMarker amPmMarker, Integer num3, Integer num4, Integer num5) {
        this.f43834a = num;
        this.f43835b = num2;
        this.f43836c = amPmMarker;
        this.f43837d = num3;
        this.f43838e = num4;
        this.f43839f = num5;
    }
}
