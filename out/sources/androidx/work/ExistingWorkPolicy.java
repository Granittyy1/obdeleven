package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: ExistingWorkPolicy.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ExistingWorkPolicy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ExistingWorkPolicy f20292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ExistingWorkPolicy f20293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ExistingWorkPolicy f20294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ExistingWorkPolicy[] f20295e;

    /* JADX INFO: Fake field, exist only in values array */
    ExistingWorkPolicy EF0;

    static {
        ExistingWorkPolicy existingWorkPolicy = new ExistingWorkPolicy("REPLACE", 0);
        ExistingWorkPolicy existingWorkPolicy2 = new ExistingWorkPolicy("KEEP", 1);
        f20292b = existingWorkPolicy2;
        ExistingWorkPolicy existingWorkPolicy3 = new ExistingWorkPolicy("APPEND", 2);
        f20293c = existingWorkPolicy3;
        ExistingWorkPolicy existingWorkPolicy4 = new ExistingWorkPolicy("APPEND_OR_REPLACE", 3);
        f20294d = existingWorkPolicy4;
        f20295e = new ExistingWorkPolicy[]{existingWorkPolicy, existingWorkPolicy2, existingWorkPolicy3, existingWorkPolicy4};
    }

    public ExistingWorkPolicy() {
        throw null;
    }

    public static ExistingWorkPolicy valueOf(String str) {
        return (ExistingWorkPolicy) Enum.valueOf(ExistingWorkPolicy.class, str);
    }

    public static ExistingWorkPolicy[] values() {
        return (ExistingWorkPolicy[]) f20295e.clone();
    }
}
