package com.google.android.gms.internal.play_billing;

import com.braze.Constants;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1995p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2003s f26235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f26237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f26238d;

    public C1995p(AbstractC2003s abstractC2003s) {
        if (abstractC2003s == null) {
            throw new NullPointerException("ticker");
        }
        this.f26235a = abstractC2003s;
    }

    public final void a() {
        if (this.f26236b) {
            throw new IllegalStateException("This stopwatch is already running.");
        }
        this.f26236b = true;
        this.f26238d = this.f26235a.a();
    }

    public final String toString() {
        String str;
        long jA = this.f26236b ? (this.f26235a.a() - this.f26238d) + this.f26237c : this.f26237c;
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(jA, timeUnit2) <= 0) {
            timeUnit = TimeUnit.HOURS;
            if (timeUnit.convert(jA, timeUnit2) <= 0) {
                timeUnit = TimeUnit.MINUTES;
                if (timeUnit.convert(jA, timeUnit2) <= 0) {
                    timeUnit = TimeUnit.SECONDS;
                    if (timeUnit.convert(jA, timeUnit2) <= 0) {
                        timeUnit = TimeUnit.MILLISECONDS;
                        if (timeUnit.convert(jA, timeUnit2) <= 0) {
                            timeUnit = TimeUnit.MICROSECONDS;
                            if (timeUnit.convert(jA, timeUnit2) <= 0) {
                                timeUnit = timeUnit2;
                            }
                        }
                    }
                }
            }
        }
        String str2 = String.format(Locale.ROOT, "%.4g", Double.valueOf(jA / timeUnit2.convert(1L, timeUnit)));
        switch (C1992o.f26230a[timeUnit.ordinal()]) {
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
        return O.a.f(str2, " ", str);
    }
}
