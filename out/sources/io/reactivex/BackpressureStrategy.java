package io.reactivex;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class BackpressureStrategy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BackpressureStrategy f40658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ BackpressureStrategy[] f40659c;

    /* JADX INFO: Fake field, exist only in values array */
    BackpressureStrategy EF0;

    static {
        BackpressureStrategy backpressureStrategy = new BackpressureStrategy("MISSING", 0);
        BackpressureStrategy backpressureStrategy2 = new BackpressureStrategy("ERROR", 1);
        BackpressureStrategy backpressureStrategy3 = new BackpressureStrategy("BUFFER", 2);
        f40658b = backpressureStrategy3;
        f40659c = new BackpressureStrategy[]{backpressureStrategy, backpressureStrategy2, backpressureStrategy3, new BackpressureStrategy("DROP", 3), new BackpressureStrategy("LATEST", 4)};
    }

    public BackpressureStrategy() {
        throw null;
    }

    public static BackpressureStrategy valueOf(String str) {
        return (BackpressureStrategy) Enum.valueOf(BackpressureStrategy.class, str);
    }

    public static BackpressureStrategy[] values() {
        return (BackpressureStrategy[]) f40659c.clone();
    }
}
