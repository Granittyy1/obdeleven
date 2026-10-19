package com.afollestad.materialdialogs;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class StackingBehavior {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final StackingBehavior f23257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final StackingBehavior f23258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final StackingBehavior f23259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ StackingBehavior[] f23260e;

    static {
        StackingBehavior stackingBehavior = new StackingBehavior("ALWAYS", 0);
        f23257b = stackingBehavior;
        StackingBehavior stackingBehavior2 = new StackingBehavior("ADAPTIVE", 1);
        f23258c = stackingBehavior2;
        StackingBehavior stackingBehavior3 = new StackingBehavior("NEVER", 2);
        f23259d = stackingBehavior3;
        f23260e = new StackingBehavior[]{stackingBehavior, stackingBehavior2, stackingBehavior3};
    }

    public StackingBehavior() {
        throw null;
    }

    public static StackingBehavior valueOf(String str) {
        return (StackingBehavior) Enum.valueOf(StackingBehavior.class, str);
    }

    public static StackingBehavior[] values() {
        return (StackingBehavior[]) f23260e.clone();
    }
}
