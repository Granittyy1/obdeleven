package R2;

import android.app.Application;

/* JADX INFO: renamed from: R2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ProcessUtils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0748a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0748a f5220a = new C0748a();

    public final String a() {
        String processName = Application.getProcessName();
        kotlin.jvm.internal.i.d(processName, "getProcessName()");
        return processName;
    }
}
