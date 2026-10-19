package com.google.common.base;

import A8.p;
import com.braze.Constants;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Stopwatch.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f27807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f27808b;

    /* JADX INFO: compiled from: Stopwatch.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27809a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f27809a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27809a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27809a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27809a[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27809a[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27809a[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27809a[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public final long a(TimeUnit timeUnit) {
        return timeUnit.convert(this.f27807a ? System.nanoTime() - this.f27808b : 0L, TimeUnit.NANOSECONDS);
    }

    public final void b() {
        p.p("This stopwatch is already running.", !this.f27807a);
        this.f27807a = true;
        this.f27808b = System.nanoTime();
    }

    public final String toString() {
        String str;
        long jNanoTime = this.f27807a ? System.nanoTime() - this.f27808b : 0L;
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
            timeUnit = TimeUnit.HOURS;
            if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                timeUnit = TimeUnit.MINUTES;
                if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                    timeUnit = TimeUnit.SECONDS;
                    if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                        timeUnit = TimeUnit.MILLISECONDS;
                        if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                            timeUnit = TimeUnit.MICROSECONDS;
                            if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                                timeUnit = timeUnit2;
                            }
                        }
                    }
                }
            }
        }
        double dConvert = jNanoTime / timeUnit2.convert(1L, timeUnit);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(Locale.ROOT, "%.4g", Double.valueOf(dConvert)));
        sb2.append(" ");
        switch (a.f27809a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY;
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE;
                break;
            default:
                throw new AssertionError();
        }
        sb2.append(str);
        return sb2.toString();
    }
}
