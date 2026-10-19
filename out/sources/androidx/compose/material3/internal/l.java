package androidx.compose.material3.internal;

import com.braze.Constants;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.format.DecimalStyle;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.text.Regex;

/* JADX INFO: compiled from: CalendarModelImpl.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l extends k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ZoneId f12547d = ZoneId.of("UTC");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f12549c;

    /* JADX INFO: compiled from: CalendarModelImpl.android.kt */
    public static final class a {
        public static String a(long j, String str, Locale locale, LinkedHashMap linkedHashMap) {
            String str2 = "P:" + str + locale.toLanguageTag();
            Object objWithDecimalStyle = linkedHashMap.get(str2);
            if (objWithDecimalStyle == null) {
                objWithDecimalStyle = DateTimeFormatter.ofPattern(str, locale).withDecimalStyle(DecimalStyle.of(locale));
                linkedHashMap.put(str2, objWithDecimalStyle);
            }
            kotlin.jvm.internal.i.c(objWithDecimalStyle, "null cannot be cast to non-null type java.time.format.DateTimeFormatter");
            return Instant.ofEpochMilli(j).atZone(l.f12547d).toLocalDate().format((DateTimeFormatter) objWithDecimalStyle);
        }
    }

    public l(Locale locale) {
        this.f12548b = WeekFields.of(locale).getFirstDayOfWeek().getValue();
        DayOfWeek[] dayOfWeekArrValues = DayOfWeek.values();
        ArrayList arrayList = new ArrayList(dayOfWeekArrValues.length);
        for (DayOfWeek dayOfWeek : dayOfWeekArrValues) {
            arrayList.add(new Pair(dayOfWeek.getDisplayName(TextStyle.FULL, locale), dayOfWeek.getDisplayName(TextStyle.NARROW, locale)));
        }
        this.f12549c = arrayList;
    }

    @Override // androidx.compose.material3.internal.k
    public final String a(long j, String str, Locale locale) {
        return a.a(j, str, locale, this.f12546a);
    }

    @Override // androidx.compose.material3.internal.k
    public final o b(Locale locale) {
        String strA0 = kotlin.text.n.a0(kotlin.text.m.G(new Regex("y{1,4}").f("yyyy", new Regex("M{1,2}").f("MM", new Regex("d{1,2}").f("dd", new Regex("[^dMy/\\-.]").f("", DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.SHORT, null, Chronology.ofLocale(locale), locale))))), "My", "M/y"), ".");
        kotlin.text.g gVarB = Regex.b(new Regex("[/\\-.]"), strA0);
        kotlin.jvm.internal.i.b(gVarB);
        kotlin.text.e eVarK = gVarB.f43153c.k(0);
        kotlin.jvm.internal.i.b(eVarK);
        int i10 = eVarK.f43150b.f4687b;
        String strSubstring = strA0.substring(i10, i10 + 1);
        kotlin.jvm.internal.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new o(strA0, strSubstring.charAt(0));
    }

    @Override // androidx.compose.material3.internal.k
    public final int c() {
        return this.f12548b;
    }

    @Override // androidx.compose.material3.internal.k
    public final n d(int i10, int i11) {
        return l(LocalDate.of(i10, i11, 1));
    }

    @Override // androidx.compose.material3.internal.k
    public final n e(long j) {
        return l(Instant.ofEpochMilli(j).atZone(f12547d).withDayOfMonth(1).toLocalDate());
    }

    @Override // androidx.compose.material3.internal.k
    public final n f(j jVar) {
        return l(LocalDate.of(jVar.f12542b, jVar.f12543c, 1));
    }

    @Override // androidx.compose.material3.internal.k
    public final j g() {
        LocalDate localDateNow = LocalDate.now();
        return new j(localDateNow.getYear(), localDateNow.getMonthValue(), localDateNow.getDayOfMonth(), localDateNow.atTime(LocalTime.MIDNIGHT).atZone(f12547d).toInstant().toEpochMilli());
    }

    @Override // androidx.compose.material3.internal.k
    public final List<Pair<String, String>> h() {
        return this.f12549c;
    }

    @Override // androidx.compose.material3.internal.k
    public final j i(String str, String str2) {
        try {
            LocalDate localDate = LocalDate.parse(str, DateTimeFormatter.ofPattern(str2));
            return new j(localDate.getYear(), localDate.getMonth().getValue(), localDate.getDayOfMonth(), localDate.atTime(LocalTime.MIDNIGHT).atZone(f12547d).toInstant().toEpochMilli());
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    @Override // androidx.compose.material3.internal.k
    public final n j(n nVar, int i10) {
        return i10 <= 0 ? nVar : l(Instant.ofEpochMilli(nVar.f12554e).atZone(f12547d).toLocalDate().plusMonths(i10));
    }

    public final j k(long j) {
        LocalDate localDate = Instant.ofEpochMilli(j).atZone(f12547d).toLocalDate();
        return new j(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth(), localDate.atStartOfDay().toEpochSecond(ZoneOffset.UTC) * ((long) Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS));
    }

    public final n l(LocalDate localDate) {
        int value = localDate.getDayOfWeek().getValue() - this.f12548b;
        if (value < 0) {
            value += 7;
        }
        return new n(localDate.getYear(), localDate.getMonthValue(), localDate.lengthOfMonth(), value, localDate.atTime(LocalTime.MIDNIGHT).atZone(f12547d).toInstant().toEpochMilli());
    }

    public final String toString() {
        return "CalendarModel";
    }
}
