package com.google.firebase.perf.v1;

import com.google.protobuf.C2078u;

/* JADX INFO: loaded from: classes3.dex */
public enum ApplicationProcessState implements C2078u.a {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);

    private final int value;

    public static final class a implements C2078u.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28515a = new a();

        @Override // com.google.protobuf.C2078u.b
        public final boolean a(int i10) {
            ApplicationProcessState applicationProcessState;
            if (i10 == 0) {
                applicationProcessState = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
            } else if (i10 == 1) {
                applicationProcessState = ApplicationProcessState.FOREGROUND;
            } else if (i10 != 2) {
                applicationProcessState = i10 != 3 ? null : ApplicationProcessState.FOREGROUND_BACKGROUND;
            } else {
                applicationProcessState = ApplicationProcessState.BACKGROUND;
            }
            return applicationProcessState != null;
        }
    }

    ApplicationProcessState(int i10) {
        this.value = i10;
    }

    @Override // com.google.protobuf.C2078u.a
    public final int a() {
        return this.value;
    }
}
