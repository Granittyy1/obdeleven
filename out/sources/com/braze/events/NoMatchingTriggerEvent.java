package com.braze.events;

import B7.b;
import kotlin.jvm.internal.i;

/* JADX INFO: loaded from: classes.dex */
public final class NoMatchingTriggerEvent {
    private final String sourceEventType;

    public NoMatchingTriggerEvent(String sourceEventType) {
        i.e(sourceEventType, "sourceEventType");
        this.sourceEventType = sourceEventType;
    }

    public static /* synthetic */ NoMatchingTriggerEvent copy$default(NoMatchingTriggerEvent noMatchingTriggerEvent, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = noMatchingTriggerEvent.sourceEventType;
        }
        return noMatchingTriggerEvent.copy(str);
    }

    public final String component1() {
        return this.sourceEventType;
    }

    public final NoMatchingTriggerEvent copy(String sourceEventType) {
        i.e(sourceEventType, "sourceEventType");
        return new NoMatchingTriggerEvent(sourceEventType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NoMatchingTriggerEvent) && i.a(this.sourceEventType, ((NoMatchingTriggerEvent) obj).sourceEventType);
    }

    public final String getSourceEventType() {
        return this.sourceEventType;
    }

    public int hashCode() {
        return this.sourceEventType.hashCode();
    }

    public String toString() {
        return b.g(new StringBuilder("NoMatchingTriggerEvent(sourceEventType="), this.sourceEventType, ')');
    }
}
