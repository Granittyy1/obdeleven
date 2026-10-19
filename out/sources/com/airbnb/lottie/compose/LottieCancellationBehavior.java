package com.airbnb.lottie.compose;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: LottieCancellationBehavior.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LottieCancellationBehavior {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LottieCancellationBehavior f23356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ LottieCancellationBehavior[] f23357c;

    static {
        LottieCancellationBehavior lottieCancellationBehavior = new LottieCancellationBehavior("Immediately", 0);
        f23356b = lottieCancellationBehavior;
        f23357c = new LottieCancellationBehavior[]{lottieCancellationBehavior, new LottieCancellationBehavior("OnIterationFinish", 1)};
    }

    public LottieCancellationBehavior() {
        throw null;
    }

    public static LottieCancellationBehavior valueOf(String str) {
        return (LottieCancellationBehavior) Enum.valueOf(LottieCancellationBehavior.class, str);
    }

    public static LottieCancellationBehavior[] values() {
        return (LottieCancellationBehavior[]) f23357c.clone();
    }
}
