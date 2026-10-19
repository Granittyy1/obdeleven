package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SnackbarDuration {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SnackbarDuration f12308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SnackbarDuration f12309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ SnackbarDuration[] f12310d;

    /* JADX INFO: Fake field, exist only in values array */
    SnackbarDuration EF0;

    static {
        SnackbarDuration snackbarDuration = new SnackbarDuration("Short", 0);
        SnackbarDuration snackbarDuration2 = new SnackbarDuration("Long", 1);
        f12308b = snackbarDuration2;
        SnackbarDuration snackbarDuration3 = new SnackbarDuration("Indefinite", 2);
        f12309c = snackbarDuration3;
        f12310d = new SnackbarDuration[]{snackbarDuration, snackbarDuration2, snackbarDuration3};
    }

    public SnackbarDuration() {
        throw null;
    }

    public static SnackbarDuration valueOf(String str) {
        return (SnackbarDuration) Enum.valueOf(SnackbarDuration.class, str);
    }

    public static SnackbarDuration[] values() {
        return (SnackbarDuration[]) f12310d.clone();
    }
}
