package androidx.compose.ui.focus;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: FocusTransactions.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CustomDestinationResult {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CustomDestinationResult f13406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final CustomDestinationResult f13407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final CustomDestinationResult f13408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ CustomDestinationResult[] f13409e;

    static {
        CustomDestinationResult customDestinationResult = new CustomDestinationResult("None", 0);
        f13406b = customDestinationResult;
        CustomDestinationResult customDestinationResult2 = new CustomDestinationResult("Cancelled", 1);
        f13407c = customDestinationResult2;
        CustomDestinationResult customDestinationResult3 = new CustomDestinationResult("Redirected", 2);
        f13408d = customDestinationResult3;
        CustomDestinationResult[] customDestinationResultArr = {customDestinationResult, customDestinationResult2, customDestinationResult3, new CustomDestinationResult("RedirectCancelled", 3)};
        f13409e = customDestinationResultArr;
        kotlin.enums.a.a(customDestinationResultArr);
    }

    public CustomDestinationResult() {
        throw null;
    }

    public static CustomDestinationResult valueOf(String str) {
        return (CustomDestinationResult) Enum.valueOf(CustomDestinationResult.class, str);
    }

    public static CustomDestinationResult[] values() {
        return (CustomDestinationResult[]) f13409e.clone();
    }
}
