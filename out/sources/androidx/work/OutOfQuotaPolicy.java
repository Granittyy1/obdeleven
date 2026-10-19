package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: OutOfQuotaPolicy.kt */
/* JADX INFO: loaded from: classes.dex */
public final class OutOfQuotaPolicy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final OutOfQuotaPolicy f20303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final OutOfQuotaPolicy f20304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ OutOfQuotaPolicy[] f20305d;

    static {
        OutOfQuotaPolicy outOfQuotaPolicy = new OutOfQuotaPolicy("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        f20303b = outOfQuotaPolicy;
        OutOfQuotaPolicy outOfQuotaPolicy2 = new OutOfQuotaPolicy("DROP_WORK_REQUEST", 1);
        f20304c = outOfQuotaPolicy2;
        f20305d = new OutOfQuotaPolicy[]{outOfQuotaPolicy, outOfQuotaPolicy2};
    }

    public OutOfQuotaPolicy() {
        throw null;
    }

    public static OutOfQuotaPolicy valueOf(String str) {
        return (OutOfQuotaPolicy) Enum.valueOf(OutOfQuotaPolicy.class, str);
    }

    public static OutOfQuotaPolicy[] values() {
        return (OutOfQuotaPolicy[]) f20305d.clone();
    }
}
