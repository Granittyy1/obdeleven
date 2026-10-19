package androidx.compose.material3.internal;

import android.text.format.DateFormat;
import java.time.ZoneId;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: compiled from: CalendarModel.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    public static final String a(long j, String str, Locale locale, LinkedHashMap linkedHashMap) {
        String str2 = "S:" + str + locale.toLanguageTag();
        Object bestDateTimePattern = linkedHashMap.get(str2);
        if (bestDateTimePattern == null) {
            bestDateTimePattern = DateFormat.getBestDateTimePattern(locale, str);
            linkedHashMap.put(str2, bestDateTimePattern);
        }
        String string = bestDateTimePattern.toString();
        ZoneId zoneId = l.f12547d;
        return l.a.a(j, string, locale, linkedHashMap);
    }
}
