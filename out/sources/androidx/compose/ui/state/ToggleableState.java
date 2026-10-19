package androidx.compose.ui.state;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: ToggleableState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ToggleableState {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ToggleableState f15273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ToggleableState f15274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ToggleableState[] f15275d;

    static {
        ToggleableState toggleableState = new ToggleableState("On", 0);
        f15273b = toggleableState;
        ToggleableState toggleableState2 = new ToggleableState("Off", 1);
        f15274c = toggleableState2;
        ToggleableState[] toggleableStateArr = {toggleableState, toggleableState2, new ToggleableState("Indeterminate", 2)};
        f15275d = toggleableStateArr;
        a.a(toggleableStateArr);
    }

    public ToggleableState() {
        throw null;
    }

    public static ToggleableState valueOf(String str) {
        return (ToggleableState) Enum.valueOf(ToggleableState.class, str);
    }

    public static ToggleableState[] values() {
        return (ToggleableState[]) f15275d.clone();
    }
}
