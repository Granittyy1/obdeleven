package io.grpc.internal;

import io.grpc.ChannelLogger;
import io.grpc.InternalChannelz$ChannelTrace$Event;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* JADX INFO: renamed from: io.grpc.internal.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ChannelTracer.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2230l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f37570d = Logger.getLogger(ChannelLogger.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f37571a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D9.r f37572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Collection<InternalChannelz$ChannelTrace$Event> f37573c;

    public C2230l(D9.r rVar, long j, String str) {
        A8.p.j(str, "description");
        this.f37572b = rVar;
        this.f37573c = null;
        String strConcat = str.concat(" created");
        InternalChannelz$ChannelTrace$Event.Severity severity = InternalChannelz$ChannelTrace$Event.Severity.f36878b;
        A8.p.j(strConcat, "description");
        b(new InternalChannelz$ChannelTrace$Event(strConcat, severity, j, null));
    }

    public static void a(D9.r rVar, Level level, String str) {
        Logger logger = f37570d;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + rVar + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    public final void b(InternalChannelz$ChannelTrace$Event internalChannelz$ChannelTrace$Event) {
        Level level;
        int iOrdinal = internalChannelz$ChannelTrace$Event.f36875b.ordinal();
        if (iOrdinal != 2) {
            level = iOrdinal != 3 ? Level.FINEST : Level.FINE;
        } else {
            level = Level.FINER;
        }
        synchronized (this.f37571a) {
            Collection<InternalChannelz$ChannelTrace$Event> collection = this.f37573c;
            if (collection != null) {
                ((ChannelTracer$1) collection).add(internalChannelz$ChannelTrace$Event);
            }
        }
        a(this.f37572b, level, internalChannelz$ChannelTrace$Event.f36874a);
    }
}
