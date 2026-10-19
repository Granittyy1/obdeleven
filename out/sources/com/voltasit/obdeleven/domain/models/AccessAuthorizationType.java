package com.voltasit.obdeleven.domain.models;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: AccessAuthorizationType.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AccessAuthorizationType {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AccessAuthorizationType f30439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AccessAuthorizationType f30440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AccessAuthorizationType[] f30441d;

    static {
        AccessAuthorizationType accessAuthorizationType = new AccessAuthorizationType("SecurityAccess", 0);
        f30439b = accessAuthorizationType;
        AccessAuthorizationType accessAuthorizationType2 = new AccessAuthorizationType("Sfd", 1);
        f30440c = accessAuthorizationType2;
        AccessAuthorizationType[] accessAuthorizationTypeArr = {accessAuthorizationType, accessAuthorizationType2};
        f30441d = accessAuthorizationTypeArr;
        a.a(accessAuthorizationTypeArr);
    }

    public AccessAuthorizationType() {
        throw null;
    }

    public static AccessAuthorizationType valueOf(String str) {
        return (AccessAuthorizationType) Enum.valueOf(AccessAuthorizationType.class, str);
    }

    public static AccessAuthorizationType[] values() {
        return (AccessAuthorizationType[]) f30441d.clone();
    }
}
