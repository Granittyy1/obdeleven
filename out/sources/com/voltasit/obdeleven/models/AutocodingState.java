package com.voltasit.obdeleven.models;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class AutocodingState {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AutocodingState f31121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AutocodingState f31122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AutocodingState f31123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AutocodingState f31124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AutocodingState[] f31125f;

    static {
        AutocodingState autocodingState = new AutocodingState("READY", 0);
        f31121b = autocodingState;
        AutocodingState autocodingState2 = new AutocodingState("CODING", 1);
        f31122c = autocodingState2;
        AutocodingState autocodingState3 = new AutocodingState("DONE", 2);
        f31123d = autocodingState3;
        AutocodingState autocodingState4 = new AutocodingState("FAILED", 3);
        f31124e = autocodingState4;
        f31125f = new AutocodingState[]{autocodingState, autocodingState2, autocodingState3, autocodingState4};
    }

    public AutocodingState() {
        throw null;
    }

    public static AutocodingState valueOf(String str) {
        return (AutocodingState) Enum.valueOf(AutocodingState.class, str);
    }

    public static AutocodingState[] values() {
        return (AutocodingState[]) f31125f.clone();
    }
}
