package androidx.compose.animation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: AnimatedVisibility.kt */
/* JADX INFO: loaded from: classes.dex */
public final class EnterExitState {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnterExitState f9276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnterExitState f9277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnterExitState f9278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnterExitState[] f9279e;

    static {
        EnterExitState enterExitState = new EnterExitState("PreEnter", 0);
        f9276b = enterExitState;
        EnterExitState enterExitState2 = new EnterExitState("Visible", 1);
        f9277c = enterExitState2;
        EnterExitState enterExitState3 = new EnterExitState("PostExit", 2);
        f9278d = enterExitState3;
        EnterExitState[] enterExitStateArr = {enterExitState, enterExitState2, enterExitState3};
        f9279e = enterExitStateArr;
        kotlin.enums.a.a(enterExitStateArr);
    }

    public EnterExitState() {
        throw null;
    }

    public static EnterExitState valueOf(String str) {
        return (EnterExitState) Enum.valueOf(EnterExitState.class, str);
    }

    public static EnterExitState[] values() {
        return (EnterExitState[]) f9279e.clone();
    }
}
