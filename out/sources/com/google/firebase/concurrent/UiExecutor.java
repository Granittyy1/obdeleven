package com.google.firebase.concurrent;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class UiExecutor implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final UiExecutor f28070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Handler f28071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ UiExecutor[] f28072d;

    static {
        UiExecutor uiExecutor = new UiExecutor("INSTANCE", 0);
        f28070b = uiExecutor;
        f28072d = new UiExecutor[]{uiExecutor};
        f28071c = new Handler(Looper.getMainLooper());
    }

    public UiExecutor() {
        throw null;
    }

    public static UiExecutor valueOf(String str) {
        return (UiExecutor) Enum.valueOf(UiExecutor.class, str);
    }

    public static UiExecutor[] values() {
        return (UiExecutor[]) f28072d.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f28071c.post(runnable);
    }
}
