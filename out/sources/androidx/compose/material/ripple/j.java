package androidx.compose.material.ripple;

import com.google.android.gms.internal.measurement.InterfaceC1884q;
import com.google.android.gms.internal.measurement.K;
import com.google.android.gms.internal.measurement.Y1;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: RippleContainer.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j implements K {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Serializable f12004c;

    public j(Y1 y10, String str) {
        this.f12003b = y10;
        this.f12004c = str;
    }

    @Override // com.google.android.gms.internal.measurement.K
    public Y1 b(InterfaceC1884q interfaceC1884q) {
        String str = (String) this.f12004c;
        Y1 y10 = (Y1) this.f12003b;
        y10.e(str, interfaceC1884q);
        return y10;
    }

    public j(int i10) {
        switch (i10) {
            case 2:
                this.f12003b = new AtomicInteger();
                this.f12004c = new AtomicInteger();
                break;
            default:
                this.f12003b = new LinkedHashMap();
                this.f12004c = new LinkedHashMap();
                break;
        }
    }
}
