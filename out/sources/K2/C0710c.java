package K2;

import android.os.Handler;
import android.os.Looper;
import kotlinx.coroutines.C2693i;

/* JADX INFO: renamed from: K2.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DefaultRunnableScheduler.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0710c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4190a;

    public C0710c(C2693i c2693i) {
        this.f4190a = c2693i;
    }

    public void a(Runnable runnable) {
        ((Handler) this.f4190a).removeCallbacks(runnable);
    }

    public void b(com.android.billingclient.api.a billingResult, String str) {
        kotlin.jvm.internal.i.e(billingResult, "billingResult");
        kotlin.jvm.internal.i.e(str, "<anonymous parameter 1>");
        ((C2693i) this.f4190a).resumeWith(billingResult);
    }

    public void c(Runnable runnable, long j) {
        ((Handler) this.f4190a).postDelayed(runnable, j);
    }

    public C0710c() {
        this.f4190a = p271w0.f.a(Looper.getMainLooper());
    }
}
