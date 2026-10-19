package com.braze.events;

import kotlin.jvm.internal.i;

/* JADX INFO: loaded from: classes.dex */
public final class SessionStateChangedEvent {
    private final ChangeType eventType;
    private final String sessionId;

    public enum ChangeType {
        SESSION_STARTED,
        SESSION_ENDED
    }

    public SessionStateChangedEvent(String sessionId, ChangeType eventType) {
        i.e(sessionId, "sessionId");
        i.e(eventType, "eventType");
        this.sessionId = sessionId;
        this.eventType = eventType;
    }

    public static /* synthetic */ SessionStateChangedEvent copy$default(SessionStateChangedEvent sessionStateChangedEvent, String str, ChangeType changeType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sessionStateChangedEvent.sessionId;
        }
        if ((i10 & 2) != 0) {
            changeType = sessionStateChangedEvent.eventType;
        }
        return sessionStateChangedEvent.copy(str, changeType);
    }

    public final String component1() {
        return this.sessionId;
    }

    public final ChangeType component2() {
        return this.eventType;
    }

    public final SessionStateChangedEvent copy(String sessionId, ChangeType eventType) {
        i.e(sessionId, "sessionId");
        i.e(eventType, "eventType");
        return new SessionStateChangedEvent(sessionId, eventType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionStateChangedEvent)) {
            return false;
        }
        SessionStateChangedEvent sessionStateChangedEvent = (SessionStateChangedEvent) obj;
        return i.a(this.sessionId, sessionStateChangedEvent.sessionId) && this.eventType == sessionStateChangedEvent.eventType;
    }

    public final ChangeType getEventType() {
        return this.eventType;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return this.eventType.hashCode() + (this.sessionId.hashCode() * 31);
    }

    public String toString() {
        return "SessionStateChangedEvent{sessionId='" + this.sessionId + "', eventType='" + this.eventType + "'}'";
    }
}
