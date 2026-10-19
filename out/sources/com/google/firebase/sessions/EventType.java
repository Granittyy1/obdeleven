package com.google.firebase.sessions;

/* JADX INFO: compiled from: SessionEvent.kt */
/* JADX INFO: loaded from: classes3.dex */
public enum EventType implements N6.g {
    /* JADX INFO: Fake field, exist only in values array */
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);

    private final int number;

    EventType(int i10) {
        this.number = i10;
    }

    @Override // N6.g
    public final int a() {
        return this.number;
    }
}
