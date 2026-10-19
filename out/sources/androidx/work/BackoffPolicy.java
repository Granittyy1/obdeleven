package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: BackoffPolicy.kt */
/* JADX INFO: loaded from: classes.dex */
public final class BackoffPolicy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BackoffPolicy f20287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final BackoffPolicy f20288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ BackoffPolicy[] f20289d;

    static {
        BackoffPolicy backoffPolicy = new BackoffPolicy("EXPONENTIAL", 0);
        f20287b = backoffPolicy;
        BackoffPolicy backoffPolicy2 = new BackoffPolicy("LINEAR", 1);
        f20288c = backoffPolicy2;
        f20289d = new BackoffPolicy[]{backoffPolicy, backoffPolicy2};
    }

    public BackoffPolicy() {
        throw null;
    }

    public static BackoffPolicy valueOf(String str) {
        return (BackoffPolicy) Enum.valueOf(BackoffPolicy.class, str);
    }

    public static BackoffPolicy[] values() {
        return (BackoffPolicy[]) f20289d.clone();
    }
}
