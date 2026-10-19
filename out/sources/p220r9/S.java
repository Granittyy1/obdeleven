package p220r9;

import P8.c;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import java.util.concurrent.Callable;
import p255u9.z;
import p279w9.b;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class S implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f46438b;

    public /* synthetic */ S(z zVar) {
        this.f46438b = zVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        try {
            UserTrackingUtils.b(this.f46438b, UserTrackingUtils.f34238a);
            return null;
        } catch (Exception e10) {
            b bVar = Application.f29634b;
            c.b(e10);
            return null;
        }
    }
}
