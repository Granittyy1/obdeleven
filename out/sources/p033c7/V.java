package p033c7;

import T6.b;
import android.app.Application;
import androidx.media3.exoplayer.Q;
import com.google.android.gms.internal.measurement.C1787c0;
import p268va.a;

/* JADX INFO: compiled from: ProviderInstaller_Factory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class V implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f22410b;

    public /* synthetic */ V(int i10, Object obj) {
        this.f22409a = i10;
        this.f22410b = obj;
    }

    @Override // p268va.a
    public final Object get() {
        switch (this.f22409a) {
            case 0:
                return new U((Application) ((a) this.f22410b).get());
            default:
                X x10 = (X) ((Q) this.f22410b).f18135a;
                C1787c0.f(x10);
                return x10;
        }
    }
}
