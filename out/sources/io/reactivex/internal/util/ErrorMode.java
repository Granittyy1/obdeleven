package io.reactivex.internal.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ErrorMode {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ErrorMode f40972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ErrorMode[] f40973c;

    static {
        ErrorMode errorMode = new ErrorMode("IMMEDIATE", 0);
        f40972b = errorMode;
        f40973c = new ErrorMode[]{errorMode, new ErrorMode("BOUNDARY", 1), new ErrorMode("END", 2)};
    }

    public ErrorMode() {
        throw null;
    }

    public static ErrorMode valueOf(String str) {
        return (ErrorMode) Enum.valueOf(ErrorMode.class, str);
    }

    public static ErrorMode[] values() {
        return (ErrorMode[]) f40973c.clone();
    }
}
