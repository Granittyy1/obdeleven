package io.grpc.internal;

import io.grpc.ChannelLogger;
import io.grpc.InternalChannelz$ChannelTrace$Event;
import java.text.MessageFormat;
import java.util.Collection;
import java.util.logging.Level;

/* JADX INFO: renamed from: io.grpc.internal.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ChannelLoggerImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2228k extends ChannelLogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2230l f37564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R0.a f37565b;

    public C2228k(C2230l c2230l, R0.a aVar) {
        this.f37564a = c2230l;
        A8.p.j(aVar, "time");
        this.f37565b = aVar;
    }

    public static Level d(ChannelLogger.ChannelLogLevel channelLogLevel) {
        int iOrdinal = channelLogLevel.ordinal();
        if (iOrdinal != 1) {
            return (iOrdinal == 2 || iOrdinal == 3) ? Level.FINE : Level.FINEST;
        }
        return Level.FINER;
    }

    @Override // io.grpc.ChannelLogger
    public final void a(ChannelLogger.ChannelLogLevel channelLogLevel, String str) {
        InternalChannelz$ChannelTrace$Event.Severity severity;
        C2230l c2230l = this.f37564a;
        D9.r rVar = c2230l.f37572b;
        Level levelD = d(channelLogLevel);
        if (C2230l.f37570d.isLoggable(levelD)) {
            C2230l.a(rVar, levelD, str);
        }
        if (!c(channelLogLevel) || channelLogLevel == ChannelLogger.ChannelLogLevel.f36862b) {
            return;
        }
        int iOrdinal = channelLogLevel.ordinal();
        if (iOrdinal != 2) {
            severity = iOrdinal != 3 ? InternalChannelz$ChannelTrace$Event.Severity.f36878b : InternalChannelz$ChannelTrace$Event.Severity.f36880d;
        } else {
            severity = InternalChannelz$ChannelTrace$Event.Severity.f36879c;
        }
        InternalChannelz$ChannelTrace$Event.Severity severity2 = severity;
        long jA = this.f37565b.a();
        A8.p.j(str, "description");
        InternalChannelz$ChannelTrace$Event internalChannelz$ChannelTrace$Event = new InternalChannelz$ChannelTrace$Event(str, severity2, jA, null);
        synchronized (c2230l.f37571a) {
            Collection<InternalChannelz$ChannelTrace$Event> collection = c2230l.f37573c;
            if (collection != null) {
                ((ChannelTracer$1) collection).add(internalChannelz$ChannelTrace$Event);
            }
        }
    }

    @Override // io.grpc.ChannelLogger
    public final void b(ChannelLogger.ChannelLogLevel channelLogLevel, String str, Object... objArr) {
        a(channelLogLevel, (c(channelLogLevel) || C2230l.f37570d.isLoggable(d(channelLogLevel))) ? MessageFormat.format(str, objArr) : null);
    }

    public final boolean c(ChannelLogger.ChannelLogLevel channelLogLevel) {
        boolean z10;
        if (channelLogLevel == ChannelLogger.ChannelLogLevel.f36862b) {
            return false;
        }
        C2230l c2230l = this.f37564a;
        synchronized (c2230l.f37571a) {
            z10 = c2230l.f37573c != null;
        }
        return z10;
    }
}
