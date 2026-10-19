package Z6;

import com.google.android.gms.internal.measurement.C1787c0;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: InflaterModule_ProvidesBannerMessageFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class q implements p268va.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7954b;

    public /* synthetic */ q(int i10, Object obj) {
        this.f7953a = i10;
        this.f7954b = obj;
    }

    @Override // p268va.a
    public final Object get() {
        switch (this.f7953a) {
            case 0:
                p083g7.h hVar = ((o) this.f7954b).f7948a;
                p006a5.a.b(hVar);
                return hVar;
            default:
                Executor executor = ((p046d7.o) this.f7954b).f34598B.get();
                C1787c0.e(executor);
                return executor;
        }
    }
}
