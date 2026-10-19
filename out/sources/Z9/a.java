package Z9;

import io.ktor.util.date.Month;
import io.ktor.util.date.WeekDay;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: DateJvm.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeZone f7961a = TimeZone.getTimeZone("GMT");

    public static final b a(Long l10) {
        Calendar calendar = Calendar.getInstance(f7961a, Locale.ROOT);
        i.b(calendar);
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        int i10 = calendar.get(16) + calendar.get(15);
        return new b(calendar.get(13), calendar.get(12), calendar.get(11), WeekDay.values()[(calendar.get(7) + 5) % 7], calendar.get(5), calendar.get(6), Month.values()[calendar.get(2)], calendar.get(1), calendar.getTimeInMillis() + ((long) i10));
    }
}
