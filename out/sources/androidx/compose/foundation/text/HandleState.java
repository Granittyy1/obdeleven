package androidx.compose.foundation.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: CoreTextField.kt */
/* JADX INFO: loaded from: classes.dex */
public final class HandleState {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HandleState f11117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HandleState f11118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HandleState f11119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ HandleState[] f11120e;

    static {
        HandleState handleState = new HandleState("None", 0);
        f11117b = handleState;
        HandleState handleState2 = new HandleState("Selection", 1);
        f11118c = handleState2;
        HandleState handleState3 = new HandleState("Cursor", 2);
        f11119d = handleState3;
        HandleState[] handleStateArr = {handleState, handleState2, handleState3};
        f11120e = handleStateArr;
        kotlin.enums.a.a(handleStateArr);
    }

    public HandleState() {
        throw null;
    }

    public static HandleState valueOf(String str) {
        return (HandleState) Enum.valueOf(HandleState.class, str);
    }

    public static HandleState[] values() {
        return (HandleState[]) f11120e.clone();
    }
}
