package bo.app;

import android.app.Activity;
import com.braze.models.IBrazeLocation;

/* JADX INFO: loaded from: classes.dex */
public interface c2 {
    static /* synthetic */ void a(c2 c2Var, long j, long j10, int i10, boolean z10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestContentCardsSync");
        }
        c2Var.a(j, j10, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? false : z10);
    }

    String a();

    void a(long j);

    void a(long j, long j10, int i10, boolean z10);

    void a(b4.a aVar);

    void a(i6 i6Var, x2 x2Var);

    void a(x2 x2Var);

    void a(IBrazeLocation iBrazeLocation);

    void a(String str);

    void a(Throwable th);

    void a(boolean z10);

    boolean a(a2 a2Var);

    void b(a2 a2Var);

    void b(String str);

    void b(Throwable th);

    void b(boolean z10);

    boolean b();

    void c(boolean z10);

    boolean c();

    void closeSession(Activity activity);

    void d();

    void e();

    void f();

    void g();

    void h();

    void openSession(Activity activity);

    void refreshFeatureFlags();

    static /* synthetic */ void a(c2 c2Var, long j, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: performPushDeliveryFlush");
        }
        if ((i10 & 1) != 0) {
            j = 0;
        }
        c2Var.a(j);
    }
}
