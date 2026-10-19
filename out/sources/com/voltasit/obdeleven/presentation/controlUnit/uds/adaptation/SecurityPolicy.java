package com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: SecurityPolicy.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SecurityPolicy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SecurityPolicy f31891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SecurityPolicy f31892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final SecurityPolicy f31893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ SecurityPolicy[] f31894e;

    static {
        SecurityPolicy securityPolicy = new SecurityPolicy("REQUEST", 0);
        f31891b = securityPolicy;
        SecurityPolicy securityPolicy2 = new SecurityPolicy("REQUEST_LOG", 1);
        f31892c = securityPolicy2;
        SecurityPolicy securityPolicy3 = new SecurityPolicy("WRITE", 2);
        f31893d = securityPolicy3;
        SecurityPolicy[] securityPolicyArr = {securityPolicy, securityPolicy2, securityPolicy3};
        f31894e = securityPolicyArr;
        kotlin.enums.a.a(securityPolicyArr);
    }

    public SecurityPolicy() {
        throw null;
    }

    public static SecurityPolicy valueOf(String str) {
        return (SecurityPolicy) Enum.valueOf(SecurityPolicy.class, str);
    }

    public static SecurityPolicy[] values() {
        return (SecurityPolicy[]) f31894e.clone();
    }
}
