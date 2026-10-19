package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Priority {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Priority f25231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Priority f25232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Priority f25233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Priority[] f25234e;

    static {
        Priority priority = new Priority("DEFAULT", 0);
        f25231b = priority;
        Priority priority2 = new Priority("VERY_LOW", 1);
        f25232c = priority2;
        Priority priority3 = new Priority("HIGHEST", 2);
        f25233d = priority3;
        f25234e = new Priority[]{priority, priority2, priority3};
    }

    public Priority() {
        throw null;
    }

    public static Priority valueOf(String str) {
        return (Priority) Enum.valueOf(Priority.class, str);
    }

    public static Priority[] values() {
        return (Priority[]) f25234e.clone();
    }
}
