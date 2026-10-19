package com.google.android.datatransport.runtime.firebase.transport;

import O6.b;

/* JADX INFO: loaded from: classes.dex */
public final class LogEventDropped {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Reason f25264b;

    public enum Reason implements b {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        private final int number_;

        Reason(int i10) {
            this.number_ = i10;
        }

        @Override // O6.b
        public final int a() {
            return this.number_;
        }
    }

    public LogEventDropped(long j, Reason reason) {
        this.f25263a = j;
        this.f25264b = reason;
    }
}
