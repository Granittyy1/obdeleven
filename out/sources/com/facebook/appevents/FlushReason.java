package com.facebook.appevents;

import java.util.Arrays;
import kotlin.jvm.internal.i;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: FlushReason.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FlushReason {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FlushReason f24780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FlushReason f24781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final FlushReason f24782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final FlushReason f24783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ FlushReason[] f24784f;

    static {
        FlushReason flushReason = new FlushReason("EXPLICIT", 0);
        f24780b = flushReason;
        FlushReason flushReason2 = new FlushReason("TIMER", 1);
        f24781c = flushReason2;
        FlushReason flushReason3 = new FlushReason("SESSION_CHANGE", 2);
        FlushReason flushReason4 = new FlushReason("PERSISTED_EVENTS", 3);
        FlushReason flushReason5 = new FlushReason("EVENT_THRESHOLD", 4);
        f24782d = flushReason5;
        FlushReason flushReason6 = new FlushReason("EAGER_FLUSHING_EVENT", 5);
        f24783e = flushReason6;
        f24784f = new FlushReason[]{flushReason, flushReason2, flushReason3, flushReason4, flushReason5, flushReason6};
    }

    public FlushReason() {
        throw null;
    }

    public static FlushReason valueOf(String value) {
        i.e(value, "value");
        return (FlushReason) Enum.valueOf(FlushReason.class, value);
    }

    public static FlushReason[] values() {
        return (FlushReason[]) Arrays.copyOf(f24784f, 6);
    }
}
