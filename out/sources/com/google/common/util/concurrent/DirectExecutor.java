package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
final class DirectExecutor implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DirectExecutor f28042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ DirectExecutor[] f28043c;

    static {
        DirectExecutor directExecutor = new DirectExecutor("INSTANCE", 0);
        f28042b = directExecutor;
        f28043c = new DirectExecutor[]{directExecutor};
    }

    public DirectExecutor() {
        throw null;
    }

    public static DirectExecutor valueOf(String str) {
        return (DirectExecutor) Enum.valueOf(DirectExecutor.class, str);
    }

    public static DirectExecutor[] values() {
        return (DirectExecutor[]) f28043c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
