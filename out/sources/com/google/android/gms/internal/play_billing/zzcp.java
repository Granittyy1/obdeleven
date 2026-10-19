package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzcp implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzcp f26343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ zzcp[] f26344c;

    static {
        zzcp zzcpVar = new zzcp("INSTANCE", 0);
        f26343b = zzcpVar;
        f26344c = new zzcp[]{zzcpVar};
    }

    public static zzcp[] values() {
        return (zzcp[]) f26344c.clone();
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
