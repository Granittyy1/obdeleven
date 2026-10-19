package kotlinx.datetime.format;

import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* JADX INFO: compiled from: DateTimeComponents.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DateTimeComponents {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f43643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Oa.l<Object>[] f43644b;

    /* JADX INFO: compiled from: DateTimeComponents.kt */
    public static final class Formats {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2722g f43645a;

        static {
            DateTimeComponents.f43643a.getClass();
            DateTimeComponents$Formats$ISO_DATE_TIME_OFFSET$1 block = DateTimeComponents$Formats$ISO_DATE_TIME_OFFSET$1.f43646h;
            kotlin.jvm.internal.i.e(block, "block");
            C2722g.a aVar = new C2722g.a(new kotlinx.datetime.internal.format.d());
            block.invoke(aVar);
            f43645a = new C2722g(InterfaceC2717b.a.c(aVar));
            DateTimeComponents$Formats$RFC_1123$1 block2 = DateTimeComponents$Formats$RFC_1123$1.f43652h;
            kotlin.jvm.internal.i.e(block2, "block");
            C2722g.a aVar2 = new C2722g.a(new kotlinx.datetime.internal.format.d());
            block2.invoke(aVar2);
            new C2722g(InterfaceC2717b.a.c(aVar2));
        }
    }

    /* JADX INFO: compiled from: DateTimeComponents.kt */
    public static final class a {
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(DateTimeComponents.class, "monthNumber", "getMonthNumber()Ljava/lang/Integer;", 0);
        kotlin.jvm.internal.l.f43062a.getClass();
        f43644b = new Oa.l[]{mutablePropertyReference1Impl, new MutablePropertyReference1Impl(DateTimeComponents.class, "dayOfMonth", "getDayOfMonth()Ljava/lang/Integer;", 0), new MutablePropertyReference1Impl(DateTimeComponents.class, "hour", "getHour()Ljava/lang/Integer;", 0), new MutablePropertyReference1Impl(DateTimeComponents.class, "hourOfAmPm", "getHourOfAmPm()Ljava/lang/Integer;", 0), new MutablePropertyReference1Impl(DateTimeComponents.class, "minute", "getMinute()Ljava/lang/Integer;", 0), new MutablePropertyReference1Impl(DateTimeComponents.class, "second", "getSecond()Ljava/lang/Integer;", 0), new MutablePropertyReference1Impl(DateTimeComponents.class, "offsetHours", "getOffsetHours()Ljava/lang/Integer;", 0), new MutablePropertyReference1Impl(DateTimeComponents.class, "offsetMinutesOfHour", "getOffsetMinutesOfHour()Ljava/lang/Integer;", 0), new MutablePropertyReference1Impl(DateTimeComponents.class, "offsetSecondsOfMinute", "getOffsetSecondsOfMinute()Ljava/lang/Integer;", 0)};
        f43643a = new a();
    }

    public DateTimeComponents() {
        this(new C2721f(0));
    }

    public DateTimeComponents(C2721f contents) {
        kotlin.jvm.internal.i.e(contents, "contents");
        p pVar = contents.f43813a;
        new DateTimeComponents$monthNumber$2(pVar, p.class, "monthNumber", "getMonthNumber()Ljava/lang/Integer;", 0);
        new DateTimeComponents$dayOfMonth$2(pVar, p.class, "dayOfMonth", "getDayOfMonth()Ljava/lang/Integer;", 0);
        r rVar = contents.f43814b;
        new DateTimeComponents$hour$2(rVar, r.class, "hour", "getHour()Ljava/lang/Integer;", 0);
        new DateTimeComponents$hourOfAmPm$2(rVar, r.class, "hourOfAmPm", "getHourOfAmPm()Ljava/lang/Integer;", 0);
        new DateTimeComponents$minute$2(rVar, r.class, "minute", "getMinute()Ljava/lang/Integer;", 0);
        new DateTimeComponents$second$2(rVar, r.class, "second", "getSecond()Ljava/lang/Integer;", 0);
        s sVar = contents.f43815c;
        new DateTimeComponents$offsetHours$2(sVar, s.class, "totalHoursAbs", "getTotalHoursAbs()Ljava/lang/Integer;", 0);
        new DateTimeComponents$offsetMinutesOfHour$2(sVar, s.class, "minutesOfHour", "getMinutesOfHour()Ljava/lang/Integer;", 0);
        new DateTimeComponents$offsetSecondsOfMinute$2(sVar, s.class, "secondsOfMinute", "getSecondsOfMinute()Ljava/lang/Integer;", 0);
    }
}
