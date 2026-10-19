package com.facebook;

import java.util.Arrays;

/* JADX INFO: compiled from: AccessTokenSource.kt */
/* JADX INFO: loaded from: classes.dex */
public enum AccessTokenSource {
    /* JADX INFO: Fake field, exist only in values array */
    EF0(false),
    f24729b(true),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(true),
    f24730c(true),
    f24731d(true),
    f24732e(true),
    /* JADX INFO: Fake field, exist only in values array */
    EF7(true),
    /* JADX INFO: Fake field, exist only in values array */
    EF8(true),
    f24733f(true),
    f24734g(true),
    f24735h(true),
    f24736i(true);

    private final boolean canExtendToken;

    AccessTokenSource(boolean z10) {
        this.canExtendToken = z10;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static AccessTokenSource[] valuesCustom() {
        return (AccessTokenSource[]) Arrays.copyOf(values(), 12);
    }

    public final boolean a() {
        return this.canExtendToken;
    }
}
