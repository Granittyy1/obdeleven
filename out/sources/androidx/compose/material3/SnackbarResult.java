package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SnackbarResult {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SnackbarResult f12319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SnackbarResult f12320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ SnackbarResult[] f12321d;

    static {
        SnackbarResult snackbarResult = new SnackbarResult("Dismissed", 0);
        f12319b = snackbarResult;
        SnackbarResult snackbarResult2 = new SnackbarResult("ActionPerformed", 1);
        f12320c = snackbarResult2;
        f12321d = new SnackbarResult[]{snackbarResult, snackbarResult2};
    }

    public SnackbarResult() {
        throw null;
    }

    public static SnackbarResult valueOf(String str) {
        return (SnackbarResult) Enum.valueOf(SnackbarResult.class, str);
    }

    public static SnackbarResult[] values() {
        return (SnackbarResult[]) f12321d.clone();
    }
}
