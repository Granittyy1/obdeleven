package T4;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class w0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0772e f6010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f6011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0 f6012d;

    public w0(x0 x0Var, C0772e c0772e, String str) {
        this.f6010b = c0772e;
        this.f6011c = str;
        Objects.requireNonNull(x0Var);
        this.f6012d = x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x0 x0Var = this.f6012d;
        int i10 = x0Var.f6016b;
        C0772e c0772e = this.f6010b;
        if (i10 > 0) {
            Bundle bundle = x0Var.f6017c;
            c0772e.d(bundle != null ? bundle.getBundle(this.f6011c) : null);
        }
        if (x0Var.f6016b >= 2) {
            c0772e.g();
        }
        if (x0Var.f6016b >= 3) {
            c0772e.e();
        }
        if (x0Var.f6016b >= 4) {
            c0772e.h();
        }
    }
}
