package com.facebook.appevents;

import java.util.Arrays;
import kotlin.jvm.internal.i;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: FlushResult.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FlushResult {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FlushResult f24785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FlushResult f24786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final FlushResult f24787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ FlushResult[] f24788e;

    static {
        FlushResult flushResult = new FlushResult("SUCCESS", 0);
        f24785b = flushResult;
        FlushResult flushResult2 = new FlushResult("SERVER_ERROR", 1);
        f24786c = flushResult2;
        FlushResult flushResult3 = new FlushResult("NO_CONNECTIVITY", 2);
        f24787d = flushResult3;
        f24788e = new FlushResult[]{flushResult, flushResult2, flushResult3, new FlushResult("UNKNOWN_ERROR", 3)};
    }

    public FlushResult() {
        throw null;
    }

    public static FlushResult valueOf(String value) {
        i.e(value, "value");
        return (FlushResult) Enum.valueOf(FlushResult.class, value);
    }

    public static FlushResult[] values() {
        return (FlushResult[]) Arrays.copyOf(f24788e, 4);
    }
}
