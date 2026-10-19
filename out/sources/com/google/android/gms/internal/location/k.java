package com.google.android.gms.internal.location;

import com.braze.Constants;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@21.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final StringBuilder f25380a;

    static {
        Locale locale = Locale.ROOT;
        new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        f25380a = new StringBuilder(33);
    }

    public static void a(long j, StringBuilder sb2) {
        if (j == 0) {
            sb2.append("0s");
            return;
        }
        sb2.ensureCapacity(sb2.length() + 27);
        boolean z10 = false;
        if (j < 0) {
            sb2.append("-");
            if (j != Long.MIN_VALUE) {
                j = -j;
            } else {
                j = Long.MAX_VALUE;
                z10 = true;
            }
        }
        if (j >= 86400000) {
            sb2.append(j / 86400000);
            sb2.append(Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE);
            j %= 86400000;
        }
        if (true == z10) {
            j = 25975808;
        }
        if (j >= 3600000) {
            sb2.append(j / 3600000);
            sb2.append("h");
            j %= 3600000;
        }
        if (j >= 60000) {
            sb2.append(j / 60000);
            sb2.append("m");
            j %= 60000;
        }
        if (j >= 1000) {
            sb2.append(j / 1000);
            sb2.append(Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY);
            j %= 1000;
        }
        if (j > 0) {
            sb2.append(j);
            sb2.append("ms");
        }
    }
}
