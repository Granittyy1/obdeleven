package androidx.navigation.compose;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.saveable.SaveableStateHolderImpl;
import com.google.android.gms.internal.measurement.Y;

/* JADX INFO: compiled from: NavBackStackEntryProvider.kt */
/* JADX INFO: loaded from: classes.dex */
public final class t implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SaveableStateHolderImpl f19201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ComposableLambdaImpl f19202c;

    public t(SaveableStateHolderImpl saveableStateHolderImpl, ComposableLambdaImpl composableLambdaImpl) {
        this.f19201b = saveableStateHolderImpl;
        this.f19202c = composableLambdaImpl;
    }

    @Override // Ia.p
    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
        InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
        if ((num.intValue() & 3) == 2 && interfaceC1084f2.s()) {
            interfaceC1084f2.w();
        } else {
            Y.d(this.f19201b, this.f19202c, interfaceC1084f2, 0);
        }
        return p293xa.r.f47939a;
    }
}
