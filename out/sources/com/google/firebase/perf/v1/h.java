package com.google.firebase.perf.v1;

import com.google.protobuf.AbstractC2061c;
import com.google.protobuf.C2077t;
import com.google.protobuf.C2078u;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC2079v;
import com.google.protobuf.K;
import com.google.protobuf.S;
import com.google.protobuf.W;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PerfSession.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends GeneratedMessageLite<h, b> implements K {
    private static final h DEFAULT_INSTANCE;
    private static volatile S<h> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final InterfaceC2079v<Integer, SessionVerbosity> sessionVerbosity_converter_ = new a();
    private int bitField0_;
    private String sessionId_ = "";
    private C2078u.c sessionVerbosity_ = C2077t.f29197e;

    /* JADX INFO: compiled from: PerfSession.java */
    public class a implements InterfaceC2079v<Integer, SessionVerbosity> {
    }

    /* JADX INFO: compiled from: PerfSession.java */
    public static final class b extends GeneratedMessageLite.a<h, b> implements K {
        public b() {
            super(h.DEFAULT_INSTANCE);
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        GeneratedMessageLite.F(h.class, hVar);
    }

    public static void H(h hVar, String str) {
        hVar.getClass();
        str.getClass();
        hVar.bitField0_ |= 1;
        hVar.sessionId_ = str;
    }

    public static void I(h hVar) {
        SessionVerbosity sessionVerbosity = SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS;
        hVar.getClass();
        List list = hVar.sessionVerbosity_;
        if (!((AbstractC2061c) list).f29134b) {
            int size = list.size();
            int i10 = size == 0 ? 10 : size * 2;
            C2077t c2077t = (C2077t) list;
            if (i10 < c2077t.f29199d) {
                throw new IllegalArgumentException();
            }
            hVar.sessionVerbosity_ = new C2077t(Arrays.copyOf(c2077t.f29198c, i10), c2077t.f29199d);
        }
        ((C2077t) hVar.sessionVerbosity_).e(sessionVerbosity.a());
    }

    public static b L() {
        return DEFAULT_INSTANCE.v();
    }

    public final SessionVerbosity J() {
        SessionVerbosity sessionVerbosity;
        int iK = ((C2077t) this.sessionVerbosity_).k(0);
        SessionVerbosity sessionVerbosity2 = SessionVerbosity.SESSION_VERBOSITY_NONE;
        if (iK != 0) {
            sessionVerbosity = iK != 1 ? null : SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS;
        } else {
            sessionVerbosity = sessionVerbosity2;
        }
        return sessionVerbosity == null ? sessionVerbosity2 : sessionVerbosity;
    }

    public final int K() {
        return this.sessionVerbosity_.size();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object w(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new W(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001e", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", SessionVerbosity.a.f28535a});
            case 3:
                return new h();
            case 4:
                return new b();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                S<h> bVar = PARSER;
                if (bVar == null) {
                    synchronized (h.class) {
                        try {
                            bVar = PARSER;
                            if (bVar == null) {
                                bVar = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                PARSER = bVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return bVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
