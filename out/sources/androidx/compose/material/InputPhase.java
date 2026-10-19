package androidx.compose.material;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: TextFieldImpl.kt */
/* JADX INFO: loaded from: classes.dex */
final class InputPhase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InputPhase f11758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final InputPhase f11759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final InputPhase f11760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ InputPhase[] f11761e;

    static {
        InputPhase inputPhase = new InputPhase("Focused", 0);
        f11758b = inputPhase;
        InputPhase inputPhase2 = new InputPhase("UnfocusedEmpty", 1);
        f11759c = inputPhase2;
        InputPhase inputPhase3 = new InputPhase("UnfocusedNotEmpty", 2);
        f11760d = inputPhase3;
        InputPhase[] inputPhaseArr = {inputPhase, inputPhase2, inputPhase3};
        f11761e = inputPhaseArr;
        kotlin.enums.a.a(inputPhaseArr);
    }

    public InputPhase() {
        throw null;
    }

    public static InputPhase valueOf(String str) {
        return (InputPhase) Enum.valueOf(InputPhase.class, str);
    }

    public static InputPhase[] values() {
        return (InputPhase[]) f11761e.clone();
    }
}
