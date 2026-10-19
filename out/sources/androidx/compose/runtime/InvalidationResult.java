package androidx.compose.runtime;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class InvalidationResult {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InvalidationResult f12852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final InvalidationResult f12853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final InvalidationResult f12854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final InvalidationResult f12855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ InvalidationResult[] f12856f;

    static {
        InvalidationResult invalidationResult = new InvalidationResult("IGNORED", 0);
        f12852b = invalidationResult;
        InvalidationResult invalidationResult2 = new InvalidationResult("SCHEDULED", 1);
        f12853c = invalidationResult2;
        InvalidationResult invalidationResult3 = new InvalidationResult("DEFERRED", 2);
        f12854d = invalidationResult3;
        InvalidationResult invalidationResult4 = new InvalidationResult("IMMINENT", 3);
        f12855e = invalidationResult4;
        InvalidationResult[] invalidationResultArr = {invalidationResult, invalidationResult2, invalidationResult3, invalidationResult4};
        f12856f = invalidationResultArr;
        kotlin.enums.a.a(invalidationResultArr);
    }

    public InvalidationResult() {
        throw null;
    }

    public static InvalidationResult valueOf(String str) {
        return (InvalidationResult) Enum.valueOf(InvalidationResult.class, str);
    }

    public static InvalidationResult[] values() {
        return (InvalidationResult[]) f12856f.clone();
    }
}
