package p257ub;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import kotlin.text.o;

/* JADX INFO: compiled from: AndroidLog.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f47505a = new d();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord record) {
        int i10;
        int iMin;
        i.e(record, "record");
        CopyOnWriteArraySet<Logger> copyOnWriteArraySet = c.f47503a;
        String loggerName = record.getLoggerName();
        i.d(loggerName, "record.loggerName");
        int iIntValue = record.getLevel().intValue();
        Level level = Level.INFO;
        if (iIntValue > level.intValue()) {
            i10 = 5;
        } else {
            i10 = record.getLevel().intValue() == level.intValue() ? 4 : 3;
        }
        String message = record.getMessage();
        i.d(message, "record.message");
        Throwable thrown = record.getThrown();
        String strT0 = c.f47504b.get(loggerName);
        if (strT0 == null) {
            strT0 = o.t0(23, loggerName);
        }
        if (Log.isLoggable(strT0, i10)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i11 = 0;
            while (i11 < length) {
                int iP = n.P(message, '\n', i11, false, 4);
                if (iP == -1) {
                    iP = length;
                }
                while (true) {
                    iMin = Math.min(iP, i11 + 4000);
                    String strSubstring = message.substring(i11, iMin);
                    i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i10, strT0, strSubstring);
                    if (iMin >= iP) {
                        break;
                    } else {
                        i11 = iMin;
                    }
                }
                i11 = iMin + 1;
            }
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
