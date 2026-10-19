package p228s6;

import com.google.firebase.perf.session.gauges.GaugeManager;
import java.util.Collections;
import p096h7.b;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46945a;

    public /* synthetic */ e(int i10) {
        this.f46945a = i10;
    }

    @Override // p096h7.b
    public final Object get() {
        switch (this.f46945a) {
            case 0:
                return Collections.emptySet();
            default:
                return GaugeManager.lambda$new$0();
        }
    }
}
