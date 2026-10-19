package com.voltasit.obdeleven.domain.models.integrity;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: IntegrityTokenType.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class IntegrityTokenType {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final IntegrityTokenType f30558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ IntegrityTokenType[] f30559c;

    static {
        IntegrityTokenType integrityTokenType = new IntegrityTokenType("PlayIntegrity", 0);
        f30558b = integrityTokenType;
        IntegrityTokenType[] integrityTokenTypeArr = {integrityTokenType};
        f30559c = integrityTokenTypeArr;
        a.a(integrityTokenTypeArr);
    }

    public IntegrityTokenType() {
        throw null;
    }

    public static IntegrityTokenType valueOf(String str) {
        return (IntegrityTokenType) Enum.valueOf(IntegrityTokenType.class, str);
    }

    public static IntegrityTokenType[] values() {
        return (IntegrityTokenType[]) f30559c.clone();
    }
}
