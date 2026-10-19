package com.braze.support;

import android.os.Build;
import android.os.SystemClock;
import com.braze.enums.BrazeDateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.collections.k;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class DateTimeUtils {
    private static final long MINIMUM_NETWORK_TIME = 1691768838316L;
    private static final long MSECS_IN_SEC = 1000;
    private static final TimeZone UTC_TIME_ZONE = TimeZone.getTimeZone("UTC");
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("DateTimeUtils");

    public static final class a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f24287b = new a();

        public a() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Error reading date and time from network. Using system time instead.";
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24288b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.f24288b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Q8.d.a(new StringBuilder("Exception parsing date "), this.f24288b, ". Returning null");
        }
    }

    public static final Date createDate(int i10, int i11, int i12) {
        return createDate$default(i10, i11, i12, 0, 0, 0, 56, null);
    }

    public static /* synthetic */ Date createDate$default(int i10, int i11, int i12, int i13, int i14, int i15, int i16, Object obj) {
        return createDate(i10, i11, i12, (i16 & 8) != 0 ? 0 : i13, (i16 & 16) != 0 ? 0 : i14, (i16 & 32) != 0 ? 0 : i15);
    }

    public static final String formatDate(Date date, BrazeDateFormat dateFormat) {
        kotlin.jvm.internal.i.e(date, "<this>");
        kotlin.jvm.internal.i.e(dateFormat, "dateFormat");
        return formatDate$default(date, dateFormat, null, 2, null);
    }

    public static /* synthetic */ String formatDate$default(Date date, BrazeDateFormat brazeDateFormat, TimeZone UTC_TIME_ZONE2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            UTC_TIME_ZONE2 = UTC_TIME_ZONE;
            kotlin.jvm.internal.i.d(UTC_TIME_ZONE2, "UTC_TIME_ZONE");
        }
        return formatDate(date, brazeDateFormat, UTC_TIME_ZONE2);
    }

    public static final String formatDateFromMillis(long j, BrazeDateFormat dateFormat, TimeZone timeZone) {
        kotlin.jvm.internal.i.e(dateFormat, "dateFormat");
        kotlin.jvm.internal.i.e(timeZone, "timeZone");
        return formatDate(new Date(j), dateFormat, timeZone);
    }

    public static /* synthetic */ String formatDateFromMillis$default(long j, BrazeDateFormat brazeDateFormat, TimeZone timeZone, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            brazeDateFormat = BrazeDateFormat.ANDROID_LOGCAT;
        }
        if ((i10 & 2) != 0) {
            timeZone = TimeZone.getDefault();
            kotlin.jvm.internal.i.d(timeZone, "getDefault()");
        }
        return formatDateFromMillis(j, brazeDateFormat, timeZone);
    }

    public static final String formatDateNow(BrazeDateFormat dateFormat) {
        kotlin.jvm.internal.i.e(dateFormat, "dateFormat");
        Date dateCreateDate = createDate(nowInSeconds());
        TimeZone timeZone = TimeZone.getDefault();
        kotlin.jvm.internal.i.d(timeZone, "getDefault()");
        return formatDate(dateCreateDate, dateFormat, timeZone);
    }

    public static final long getTimeFromEpochInSeconds(Date date) {
        kotlin.jvm.internal.i.e(date, "<this>");
        return TimeUnit.MILLISECONDS.toSeconds(date.getTime());
    }

    public static final boolean isValidTimeZone(String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        String[] availableIDs = TimeZone.getAvailableIDs();
        kotlin.jvm.internal.i.d(availableIDs, "getAvailableIDs()");
        return k.M(str, availableIDs);
    }

    public static final long nowInMilliseconds() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            if (Build.VERSION.SDK_INT < 33) {
                return jCurrentTimeMillis;
            }
            long jMillis = SystemClock.currentNetworkTimeClock().millis();
            return jMillis < MINIMUM_NETWORK_TIME ? jCurrentTimeMillis : jMillis;
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) e10, (Ia.a<String>) a.f24287b);
            return jCurrentTimeMillis;
        }
    }

    public static final long nowInSeconds() {
        return TimeUnit.MILLISECONDS.toSeconds(nowInMilliseconds());
    }

    public static final double nowInSecondsPrecise() {
        return nowInMilliseconds() / 1000.0d;
    }

    public static final Date parseDate(String str, BrazeDateFormat dateFormat) throws Exception {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(dateFormat, "dateFormat");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat.getFormat(), Locale.US);
        simpleDateFormat.setTimeZone(UTC_TIME_ZONE);
        try {
            Date date = simpleDateFormat.parse(str);
            kotlin.jvm.internal.i.b(date);
            return date;
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) e10, (Ia.a<String>) new b(str));
            throw e10;
        }
    }

    public static final Date createDate(int i10, int i11, int i12, int i13) {
        return createDate$default(i10, i11, i12, i13, 0, 0, 48, null);
    }

    public static final String formatDate(Date date, BrazeDateFormat dateFormat, TimeZone timeZone) {
        kotlin.jvm.internal.i.e(date, "<this>");
        kotlin.jvm.internal.i.e(dateFormat, "dateFormat");
        kotlin.jvm.internal.i.e(timeZone, "timeZone");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat.getFormat(), Locale.US);
        simpleDateFormat.setTimeZone(timeZone);
        String str = simpleDateFormat.format(date);
        kotlin.jvm.internal.i.d(str, "simpleDateFormat.format(this)");
        return str;
    }

    public static final Date createDate(int i10, int i11, int i12, int i13, int i14) {
        return createDate$default(i10, i11, i12, i13, i14, 0, 32, null);
    }

    public static final Date createDate(int i10, int i11, int i12, int i13, int i14, int i15) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(i10, i11, i12, i13, i14, i15);
        gregorianCalendar.setTimeZone(UTC_TIME_ZONE);
        Date time = gregorianCalendar.getTime();
        kotlin.jvm.internal.i.d(time, "calendar.time");
        return time;
    }

    public static final Date createDate(long j) {
        return new Date(j * MSECS_IN_SEC);
    }
}
