package com.bumptech.glide;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Priority {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Priority f24457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Priority f24458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Priority[] f24459d;

    /* JADX INFO: Fake field, exist only in values array */
    Priority EF0;

    static {
        Priority priority = new Priority("IMMEDIATE", 0);
        Priority priority2 = new Priority("HIGH", 1);
        Priority priority3 = new Priority("NORMAL", 2);
        f24457b = priority3;
        Priority priority4 = new Priority("LOW", 3);
        f24458c = priority4;
        f24459d = new Priority[]{priority, priority2, priority3, priority4};
    }

    public Priority() {
        throw null;
    }

    public static Priority valueOf(String str) {
        return (Priority) Enum.valueOf(Priority.class, str);
    }

    public static Priority[] values() {
        return (Priority[]) f24459d.clone();
    }
}
