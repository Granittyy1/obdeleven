package io.ktor.util;

/* JADX INFO: compiled from: PlatformUtils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f40546a;

    static {
        String property = System.getProperty("io.ktor.development");
        boolean z10 = false;
        if (property != null && Boolean.parseBoolean(property)) {
            z10 = true;
        }
        f40546a = z10;
    }
}
