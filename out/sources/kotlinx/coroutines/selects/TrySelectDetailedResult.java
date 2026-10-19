package kotlinx.coroutines.selects;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TrySelectDetailedResult {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TrySelectDetailedResult f43565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TrySelectDetailedResult f43566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final TrySelectDetailedResult f43567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final TrySelectDetailedResult f43568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ TrySelectDetailedResult[] f43569f;

    static {
        TrySelectDetailedResult trySelectDetailedResult = new TrySelectDetailedResult("SUCCESSFUL", 0);
        f43565b = trySelectDetailedResult;
        TrySelectDetailedResult trySelectDetailedResult2 = new TrySelectDetailedResult("REREGISTER", 1);
        f43566c = trySelectDetailedResult2;
        TrySelectDetailedResult trySelectDetailedResult3 = new TrySelectDetailedResult("CANCELLED", 2);
        f43567d = trySelectDetailedResult3;
        TrySelectDetailedResult trySelectDetailedResult4 = new TrySelectDetailedResult("ALREADY_SELECTED", 3);
        f43568e = trySelectDetailedResult4;
        TrySelectDetailedResult[] trySelectDetailedResultArr = {trySelectDetailedResult, trySelectDetailedResult2, trySelectDetailedResult3, trySelectDetailedResult4};
        f43569f = trySelectDetailedResultArr;
        kotlin.enums.a.a(trySelectDetailedResultArr);
    }

    public TrySelectDetailedResult() {
        throw null;
    }

    public static TrySelectDetailedResult valueOf(String str) {
        return (TrySelectDetailedResult) Enum.valueOf(TrySelectDetailedResult.class, str);
    }

    public static TrySelectDetailedResult[] values() {
        return (TrySelectDetailedResult[]) f43569f.clone();
    }
}
