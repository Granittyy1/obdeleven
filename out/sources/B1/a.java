package B1;

import A1.p;
import A1.t;
import Z3.q;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.InterfaceC1309y;
import androidx.core.view.n0;
import com.facebook.internal.FeatureManager;
import com.google.android.gms.internal.play_billing.AbstractC2001r0;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import com.voltas.crop.CropImageActivity;
import p114j1.j;
import p228s6.d;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements t, FeatureManager.a, d, j.a, InterfaceC1309y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1436b;

    public /* synthetic */ a(int i10) {
        this.f1436b = i10;
    }

    public static int a(int i10, int i11, int i12) {
        return AbstractC2001r0.r(i10) + i11 + i12;
    }

    public static int b(String str, int i10, int i11) {
        return (str.hashCode() + i10) * i11;
    }

    public static String h(Uri uri, String str) {
        return str + uri;
    }

    @Override // A1.t
    public p[] c() {
        return new p[]{new b()};
    }

    @Override // com.facebook.internal.FeatureManager.a
    public void e(boolean z10) {
        if (z10) {
            p017b4.b bVar = p017b4.b.f20549a;
            try {
                q.c().execute(new p017b4.a(0));
            } catch (Exception unused) {
                q qVar = q.f7852a;
            }
        }
    }

    @Override // p228s6.d
    public Object f(p228s6.q qVar) {
        return FirebaseSessionsRegistrar.m11getComponents$lambda2(qVar);
    }

    @Override // androidx.core.view.InterfaceC1309y
    public n0 g(View view, n0 n0Var) {
        int i10 = CropImageActivity.f29564r;
        p222s0.b bVarG = n0Var.f16948a.g(135);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.topMargin = bVarG.f46852b;
        marginLayoutParams.leftMargin = bVarG.f46851a;
        marginLayoutParams.bottomMargin = bVarG.f46854d;
        marginLayoutParams.rightMargin = bVarG.f46853c;
        view.setLayoutParams(marginLayoutParams);
        return n0.f16947b;
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        p162n1.b bVar = (p162n1.b) obj;
        switch (this.f1436b) {
            case 6:
                bVar.getClass();
                break;
            default:
                bVar.getClass();
                break;
        }
    }
}
