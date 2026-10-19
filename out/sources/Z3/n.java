package Z3;

import android.util.Log;
import com.facebook.internal.FeatureManager;
import java.util.ArrayList;
import p091h2.C2205e;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements FeatureManager.a, p183oa.b, A1.t, j1.j.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7850b;

    public /* synthetic */ n(int i10) {
        this.f7850b = i10;
    }

    public static float b(float f10, float f11, float f12, float f13) {
        return ((f10 - f11) * f12) + f13;
    }

    public static Object f(int i10, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i10);
    }

    @Override // p183oa.b
    public void a(Object obj) {
        Log.e("FIAM.Headless", "Impression store write failure");
    }

    @Override // A1.t
    public A1.p[] c() {
        return new A1.p[]{new C2205e()};
    }

    @Override // com.facebook.internal.FeatureManager.a
    public void e(boolean z10) {
        if (z10 && I.a()) {
            FeatureManager featureManager = FeatureManager.f24975a;
            FeatureManager.a(new J4.n(9), FeatureManager.Feature.CrashReport);
            FeatureManager.a(new O.a(), FeatureManager.Feature.ErrorReport);
            FeatureManager.a(new C4.a(10), FeatureManager.Feature.AnrReport);
        }
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        p162n1.b bVar = (p162n1.b) obj;
        switch (this.f7850b) {
            case 5:
                bVar.getClass();
                break;
            default:
                bVar.getClass();
                break;
        }
    }
}
