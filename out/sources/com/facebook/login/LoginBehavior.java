package com.facebook.login;

import java.util.Arrays;

/* JADX INFO: compiled from: LoginBehavior.kt */
/* JADX INFO: loaded from: classes.dex */
public enum LoginBehavior {
    NATIVE_WITH_FALLBACK(true, true, true, false, true, true, true),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_ONLY(true, true, false, false, false, true, true),
    /* JADX INFO: Fake field, exist only in values array */
    KATANA_ONLY(false, true, false, false, false, false, false),
    /* JADX INFO: Fake field, exist only in values array */
    WEB_ONLY(false, false, true, false, true, false, false),
    /* JADX INFO: Fake field, exist only in values array */
    DIALOG_ONLY(false, true, true, false, true, true, true),
    /* JADX INFO: Fake field, exist only in values array */
    DEVICE_AUTH(false, false, false, true, false, false, false);

    private final boolean allowsCustomTabAuth;
    private final boolean allowsDeviceAuth;
    private final boolean allowsFacebookLiteAuth;
    private final boolean allowsGetTokenAuth;
    private final boolean allowsInstagramAppAuth;
    private final boolean allowsKatanaAuth;
    private final boolean allowsWebViewAuth;

    LoginBehavior(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.allowsGetTokenAuth = z10;
        this.allowsKatanaAuth = z11;
        this.allowsWebViewAuth = z12;
        this.allowsDeviceAuth = z13;
        this.allowsCustomTabAuth = z14;
        this.allowsFacebookLiteAuth = z15;
        this.allowsInstagramAppAuth = z16;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static LoginBehavior[] valuesCustom() {
        return (LoginBehavior[]) Arrays.copyOf(values(), 6);
    }

    public final boolean a() {
        return this.allowsCustomTabAuth;
    }

    public final boolean b() {
        return this.allowsDeviceAuth;
    }

    public final boolean c() {
        return this.allowsGetTokenAuth;
    }

    public final boolean d() {
        return this.allowsInstagramAppAuth;
    }

    public final boolean e() {
        return this.allowsKatanaAuth;
    }

    public final boolean f() {
        return this.allowsWebViewAuth;
    }
}
