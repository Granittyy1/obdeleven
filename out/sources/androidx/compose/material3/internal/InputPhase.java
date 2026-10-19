package androidx.compose.material3.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: TextFieldImpl.kt */
/* JADX INFO: loaded from: classes.dex */
final class InputPhase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InputPhase f12493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final InputPhase f12494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final InputPhase f12495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ InputPhase[] f12496e;

    static {
        InputPhase inputPhase = new InputPhase("Focused", 0);
        f12493b = inputPhase;
        InputPhase inputPhase2 = new InputPhase("UnfocusedEmpty", 1);
        f12494c = inputPhase2;
        InputPhase inputPhase3 = new InputPhase("UnfocusedNotEmpty", 2);
        f12495d = inputPhase3;
        f12496e = new InputPhase[]{inputPhase, inputPhase2, inputPhase3};
    }

    public InputPhase() {
        throw null;
    }

    public static InputPhase valueOf(String str) {
        return (InputPhase) Enum.valueOf(InputPhase.class, str);
    }

    public static InputPhase[] values() {
        return (InputPhase[]) f12496e.clone();
    }
}
