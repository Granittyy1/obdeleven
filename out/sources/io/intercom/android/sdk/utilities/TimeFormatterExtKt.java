package io.intercom.android.sdk.utilities;

import android.content.Context;
import android.text.format.DateFormat;
import com.braze.Constants;
import io.intercom.android.sdk.R;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import kotlin.text.m;

/* JADX INFO: compiled from: TimeFormatterExt.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TimeFormatterExtKt {
    public static final String formattedDateForDayDivider(long j, Context context) {
        i.e(context, "context");
        if (j <= 0) {
            return "";
        }
        Date date = new Date(j * ((long) Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS));
        Locale localeCompat = UtilsKt.getLocaleCompat(context);
        String str = new SimpleDateFormat(DateFormat.getBestDateTimePattern(localeCompat, "MMMM d"), localeCompat).format(date);
        i.d(str, "format(...)");
        return str;
    }

    public static final String formattedDateFromLong(long j, Context context) {
        i.e(context, "context");
        return j <= 0 ? "" : getFormattedTime(context, new Date(j * ((long) Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS)));
    }

    private static final long getDifferenceInDays(Date date) {
        return TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - date.getTime());
    }

    private static final long getDifferenceInHours(Date date) {
        return TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis() - date.getTime());
    }

    private static final long getDifferenceInMinutes(Date date) {
        return TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - date.getTime());
    }

    private static final String getFormattedTime(Context context, Date date) {
        long differenceInMinutes = getDifferenceInMinutes(date);
        long differenceInHours = getDifferenceInHours(date);
        long differenceInDays = getDifferenceInDays(date);
        long j = differenceInDays / ((long) 7);
        if (j > 0) {
            return Phrase.from(context, R.string.intercom_time_week_ago).put("delta", String.valueOf(j)).format().toString();
        }
        if (differenceInDays > 0) {
            return Phrase.from(context, R.string.intercom_time_day_ago).put("delta", String.valueOf(differenceInDays)).format().toString();
        }
        if (differenceInHours > 0) {
            return Phrase.from(context, R.string.intercom_time_hour_ago).put("delta", String.valueOf(differenceInHours)).format().toString();
        }
        return differenceInMinutes >= 1 ? Phrase.from(context, R.string.intercom_time_minute_ago).put("delta", String.valueOf(differenceInMinutes)).format().toString() : context.getText(R.string.intercom_time_just_now).toString();
    }

    public static final String toHourOfDay(long j) {
        return toHourOfDayApi26$default(j, null, 1, null);
    }

    public static final String toHourOfDayApi26(long j, ZoneId zoneId) {
        i.e(zoneId, "zoneId");
        ZonedDateTime zonedDateTimeOfInstant = ZonedDateTime.ofInstant(Instant.ofEpochMilli(j * ((long) Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS)), zoneId);
        String str = DateTimeFormatter.ofPattern("h:mm a", Locale.ENGLISH).format(zonedDateTimeOfInstant);
        if (zonedDateTimeOfInstant.getHour() == 0) {
            i.b(str);
            return m.G(str, "12:00", "00:00");
        }
        i.b(str);
        return str;
    }

    public static /* synthetic */ String toHourOfDayApi26$default(long j, ZoneId zoneId, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return toHourOfDayApi26(j, zoneId);
    }

    public static final String toHourOfDayPreApi26(long j, TimeZone timeZone) {
        i.e(timeZone, "timeZone");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("h:mm a", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(timeZone);
        long j10 = j * ((long) Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS);
        String str = simpleDateFormat.format(Long.valueOf(j10));
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(j10);
        if (calendar.get(11) == 0) {
            i.b(str);
            return m.G(str, "12:00", "00:00");
        }
        i.b(str);
        return str;
    }

    public static /* synthetic */ String toHourOfDayPreApi26$default(long j, TimeZone timeZone, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            timeZone = TimeZone.getDefault();
        }
        return toHourOfDayPreApi26(j, timeZone);
    }

    public static final String toISOFormat(long j) {
        return toISOFormatApi26(j);
    }

    public static final String toISOFormatApi26(long j) {
        String str = DateTimeFormatter.ISO_INSTANT.format(Instant.ofEpochMilli(j * ((long) Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS)));
        i.d(str, "format(...)");
        return str;
    }

    public static final String toISOFormatPreApi26(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String str = simpleDateFormat.format(Long.valueOf(j * ((long) Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS)));
        i.d(str, "format(...)");
        return str;
    }
}
