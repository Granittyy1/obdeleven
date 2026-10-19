package io.grpc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class SecurityLevel {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SecurityLevel f36895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SecurityLevel f36896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ SecurityLevel[] f36897d;

    static {
        SecurityLevel securityLevel = new SecurityLevel("NONE", 0);
        f36895b = securityLevel;
        SecurityLevel securityLevel2 = new SecurityLevel("INTEGRITY", 1);
        SecurityLevel securityLevel3 = new SecurityLevel("PRIVACY_AND_INTEGRITY", 2);
        f36896c = securityLevel3;
        f36897d = new SecurityLevel[]{securityLevel, securityLevel2, securityLevel3};
    }

    public SecurityLevel() {
        throw null;
    }

    public static SecurityLevel valueOf(String str) {
        return (SecurityLevel) Enum.valueOf(SecurityLevel.class, str);
    }

    public static SecurityLevel[] values() {
        return (SecurityLevel[]) f36897d.clone();
    }
}
