package androidx.navigation.compose;

import android.view.Window;
import androidx.compose.runtime.X;
import io.intercom.android.sdk.m5.home.ui.HomeScreenKt;
import p141l2.C2749t;

/* JADX INFO: renamed from: androidx.navigation.compose.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1414g implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f19168d;

    public /* synthetic */ C1414g(Object obj, int i10, Object obj2) {
        this.f19166b = i10;
        this.f19167c = obj;
        this.f19168d = obj2;
    }

    @Override // Ia.a
    public final Object invoke() {
        switch (this.f19166b) {
            case 0:
                ((C1423p) this.f19167c).e((C2749t) this.f19168d, false);
                return p293xa.r.f47939a;
            default:
                return HomeScreenKt.HomeScreen$lambda$2$lambda$1((Window) this.f19167c, (X) this.f19168d);
        }
    }
}
