package Z3;

import android.os.Bundle;
import com.facebook.internal.FeatureManager;
import io.intercom.android.sdk.Injector;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements FeatureManager.a, j1.j.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7851b;

    public /* synthetic */ o() {
        this.f7851b = 0;
    }

    public static Bundle a(String str, int i10, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        bundle.putInt(str3, i10);
        return bundle;
    }

    public static Object b() {
        return Injector.get().getAppConfigProvider().get();
    }

    public static String c(int i10, int i11, int i12) {
        return Integer.toString((i10 * i11) / i12);
    }

    public static String d(StringBuilder sb2, boolean z10, char c10) {
        sb2.append(z10);
        sb2.append(c10);
        return sb2.toString();
    }

    @Override // com.facebook.internal.FeatureManager.a
    public void e(boolean z10) {
        if (z10) {
            q.f7865o = true;
        }
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        p162n1.b bVar = (p162n1.b) obj;
        switch (this.f7851b) {
            case 5:
                bVar.getClass();
                break;
            default:
                bVar.getClass();
                break;
        }
    }
}
