package com.google.firebase.inappmessaging;

import com.google.protobuf.C2078u;

/* JADX INFO: loaded from: classes3.dex */
public enum EventType implements C2078u.a {
    UNKNOWN_EVENT_TYPE(0),
    IMPRESSION_EVENT_TYPE(1),
    CLICK_EVENT_TYPE(2);

    private final int value;

    public static final class a implements C2078u.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28146a = new a();

        @Override // com.google.protobuf.C2078u.b
        public final boolean a(int i10) {
            EventType eventType;
            if (i10 == 0) {
                eventType = EventType.UNKNOWN_EVENT_TYPE;
            } else if (i10 != 1) {
                eventType = i10 != 2 ? null : EventType.CLICK_EVENT_TYPE;
            } else {
                eventType = EventType.IMPRESSION_EVENT_TYPE;
            }
            return eventType != null;
        }
    }

    EventType(int i10) {
        this.value = i10;
    }

    @Override // com.google.protobuf.C2078u.a
    public final int a() {
        return this.value;
    }
}
