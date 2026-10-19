package com.facebook;

import java.util.Arrays;
import kotlin.jvm.internal.i;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: LoggingBehavior.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LoggingBehavior {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LoggingBehavior f24774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LoggingBehavior f24775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LoggingBehavior f24776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final LoggingBehavior f24777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ LoggingBehavior[] f24778f;

    static {
        LoggingBehavior loggingBehavior = new LoggingBehavior("REQUESTS", 0);
        f24774b = loggingBehavior;
        LoggingBehavior loggingBehavior2 = new LoggingBehavior("INCLUDE_ACCESS_TOKENS", 1);
        LoggingBehavior loggingBehavior3 = new LoggingBehavior("INCLUDE_RAW_RESPONSES", 2);
        f24775c = loggingBehavior3;
        LoggingBehavior loggingBehavior4 = new LoggingBehavior("CACHE", 3);
        LoggingBehavior loggingBehavior5 = new LoggingBehavior("APP_EVENTS", 4);
        f24776d = loggingBehavior5;
        LoggingBehavior loggingBehavior6 = new LoggingBehavior("DEVELOPER_ERRORS", 5);
        f24777e = loggingBehavior6;
        f24778f = new LoggingBehavior[]{loggingBehavior, loggingBehavior2, loggingBehavior3, loggingBehavior4, loggingBehavior5, loggingBehavior6, new LoggingBehavior("GRAPH_API_DEBUG_WARNING", 6), new LoggingBehavior("GRAPH_API_DEBUG_INFO", 7)};
    }

    public LoggingBehavior() {
        throw null;
    }

    public static LoggingBehavior valueOf(String value) {
        i.e(value, "value");
        return (LoggingBehavior) Enum.valueOf(LoggingBehavior.class, value);
    }

    public static LoggingBehavior[] values() {
        return (LoggingBehavior[]) Arrays.copyOf(f24778f, 8);
    }
}
