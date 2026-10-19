package io.grpc;

import io.grpc.internal.U;
import java.util.Arrays;
import kotlinx.coroutines.C;

/* JADX INFO: loaded from: classes3.dex */
public final class InternalChannelz$ChannelTrace$Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Severity f36875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f36876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final U f36877d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Severity {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Severity f36878b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Severity f36879c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Severity f36880d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Severity[] f36881e;

        /* JADX INFO: Fake field, exist only in values array */
        Severity EF0;

        static {
            Severity severity = new Severity("CT_UNKNOWN", 0);
            Severity severity2 = new Severity("CT_INFO", 1);
            f36878b = severity2;
            Severity severity3 = new Severity("CT_WARNING", 2);
            f36879c = severity3;
            Severity severity4 = new Severity("CT_ERROR", 3);
            f36880d = severity4;
            f36881e = new Severity[]{severity, severity2, severity3, severity4};
        }

        public Severity() {
            throw null;
        }

        public static Severity valueOf(String str) {
            return (Severity) Enum.valueOf(Severity.class, str);
        }

        public static Severity[] values() {
            return (Severity[]) f36881e.clone();
        }
    }

    public InternalChannelz$ChannelTrace$Event(String str, Severity severity, long j, U u10) {
        this.f36874a = str;
        this.f36875b = severity;
        this.f36876c = j;
        this.f36877d = u10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InternalChannelz$ChannelTrace$Event)) {
            return false;
        }
        InternalChannelz$ChannelTrace$Event internalChannelz$ChannelTrace$Event = (InternalChannelz$ChannelTrace$Event) obj;
        return C.j(this.f36874a, internalChannelz$ChannelTrace$Event.f36874a) && C.j(this.f36875b, internalChannelz$ChannelTrace$Event.f36875b) && this.f36876c == internalChannelz$ChannelTrace$Event.f36876c && C.j(null, null) && C.j(this.f36877d, internalChannelz$ChannelTrace$Event.f36877d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f36874a, this.f36875b, Long.valueOf(this.f36876c), null, this.f36877d});
    }

    public final String toString() {
        com.google.common.base.d.a aVarB = com.google.common.base.d.b(this);
        aVarB.c(this.f36874a, "description");
        aVarB.c(this.f36875b, "severity");
        aVarB.b(this.f36876c, "timestampNanos");
        aVarB.c(null, "channelRef");
        aVarB.c(this.f36877d, "subchannelRef");
        return aVarB.toString();
    }
}
