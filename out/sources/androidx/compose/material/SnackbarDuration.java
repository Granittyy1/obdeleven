package androidx.compose.material;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SnackbarDuration {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ SnackbarDuration[] f11809b;

    /* JADX INFO: Fake field, exist only in values array */
    SnackbarDuration EF5;

    static {
        SnackbarDuration[] snackbarDurationArr = {new SnackbarDuration("Short", 0), new SnackbarDuration("Long", 1), new SnackbarDuration("Indefinite", 2)};
        f11809b = snackbarDurationArr;
        kotlin.enums.a.a(snackbarDurationArr);
    }

    public SnackbarDuration() {
        throw null;
    }

    public static SnackbarDuration valueOf(String str) {
        return (SnackbarDuration) Enum.valueOf(SnackbarDuration.class, str);
    }

    public static SnackbarDuration[] values() {
        return (SnackbarDuration[]) f11809b.clone();
    }
}
