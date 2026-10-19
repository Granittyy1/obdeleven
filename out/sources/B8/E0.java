package B8;

import com.facebook.internal.FeatureManager;
import com.google.android.material.textfield.TextInputLayout;
import io.intercom.android.sdk.utilities.commons.TimeProvider;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class E0 implements TimeProvider, TextInputLayout.e, FeatureManager.a, p183oa.a, A1.t, j1.j.a, androidx.media3.exoplayer.mediacodec.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1659b;

    public /* synthetic */ E0(int i10) {
        this.f1659b = i10;
    }

    public static T3.a a(int i10) {
        return new T3.d().e(i10);
    }

    public static void b(float f10, androidx.compose.ui.platform.T0 t8, String str) {
        t8.b(new p013b0.f(f10), str);
    }

    @Override // A1.t
    public A1.p[] c() {
        return new A1.p[]{new p091h2.y()};
    }

    @Override // io.intercom.android.sdk.utilities.commons.TimeProvider
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // com.facebook.internal.FeatureManager.a
    public void e(boolean z10) {
        if (z10) {
            Z3.q.f7864n = true;
        }
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        p162n1.b bVar = (p162n1.b) obj;
        switch (this.f1659b) {
            case 7:
                bVar.getClass();
                break;
            default:
                bVar.getClass();
                break;
        }
    }

    @Override // p183oa.a
    public void run() {
        Q3.d.B();
    }
}
