package com.facebook.login;

import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: CodeChallengeMethod.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CodeChallengeMethod {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CodeChallengeMethod f25047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final CodeChallengeMethod f25048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ CodeChallengeMethod[] f25049d;

    static {
        CodeChallengeMethod codeChallengeMethod = new CodeChallengeMethod("S256", 0);
        f25047b = codeChallengeMethod;
        CodeChallengeMethod codeChallengeMethod2 = new CodeChallengeMethod("PLAIN", 1);
        f25048c = codeChallengeMethod2;
        f25049d = new CodeChallengeMethod[]{codeChallengeMethod, codeChallengeMethod2};
    }

    public CodeChallengeMethod() {
        throw null;
    }

    public static CodeChallengeMethod valueOf(String value) {
        kotlin.jvm.internal.i.e(value, "value");
        return (CodeChallengeMethod) Enum.valueOf(CodeChallengeMethod.class, value);
    }

    public static CodeChallengeMethod[] values() {
        return (CodeChallengeMethod[]) Arrays.copyOf(f25049d, 2);
    }
}
