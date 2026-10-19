package com.google.firebase.perf.v1;

import com.google.protobuf.C2078u;

/* JADX INFO: loaded from: classes3.dex */
public enum SessionVerbosity implements C2078u.a {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);

    private final int value;

    public static final class a implements C2078u.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28535a = new a();

        @Override // com.google.protobuf.C2078u.b
        public final boolean a(int i10) {
            SessionVerbosity sessionVerbosity;
            if (i10 != 0) {
                sessionVerbosity = i10 != 1 ? null : SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS;
            } else {
                sessionVerbosity = SessionVerbosity.SESSION_VERBOSITY_NONE;
            }
            return sessionVerbosity != null;
        }
    }

    SessionVerbosity(int i10) {
        this.value = i10;
    }

    @Override // com.google.protobuf.C2078u.a
    public final int a() {
        return this.value;
    }
}
