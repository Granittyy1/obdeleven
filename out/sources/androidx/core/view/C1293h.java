package androidx.core.view;

import android.util.JsonReader;
import android.view.View;
import androidx.compose.ui.text.C1260a;
import p091h2.C2203c;

/* JADX INFO: renamed from: androidx.core.view.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1293h implements B6.e.a, A1.t, androidx.compose.ui.text.input.E, p183oa.d, InterfaceC1309y, j1.j.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16932b;

    public /* synthetic */ C1293h(int i10) {
        this.f16932b = i10;
    }

    public static int f(float f10, float f11, float f12) {
        return Math.round((f10 + f11) * f12);
    }

    public static String h(String str, String str2, String str3, int i10, int i11) {
        return str + i10 + str2 + i11 + str3;
    }

    @Override // p183oa.d
    public boolean a(Object obj) {
        return !((Boolean) obj).booleanValue();
    }

    @Override // B6.e.a
    public Object b(JsonReader jsonReader) {
        return B6.e.a(jsonReader);
    }

    @Override // A1.t
    public A1.p[] c() {
        switch (this.f16932b) {
            case 2:
                return new A1.p[]{new G1.a()};
            default:
                return new A1.p[]{new C2203c()};
        }
    }

    @Override // androidx.compose.ui.text.input.E
    public androidx.compose.ui.text.input.D e(C1260a c1260a) {
        return new androidx.compose.ui.text.input.D(c1260a, androidx.compose.ui.text.input.r.a.f15560a);
    }

    @Override // androidx.core.view.InterfaceC1309y
    public n0 g(View v10, n0 n0Var) {
        kotlin.jvm.internal.i.e(v10, "v");
        n0.k kVar = n0Var.f16948a;
        p222s0.b bVarG = kVar.g(7);
        kotlin.jvm.internal.i.d(bVarG, "getInsets(...)");
        p222s0.b bVarG2 = kVar.g(128);
        kotlin.jvm.internal.i.d(bVarG2, "getInsets(...)");
        v10.setPadding(Math.max(bVarG.f46851a, bVarG2.f46851a), Math.max(bVarG.f46852b, bVarG2.f46852b), Math.max(bVarG.f46853c, bVarG2.f46853c), Math.max(bVarG.f46854d, bVarG2.f46854d));
        return n0Var;
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        p162n1.b bVar = (p162n1.b) obj;
        switch (this.f16932b) {
            case 9:
                bVar.getClass();
                break;
            default:
                bVar.getClass();
                break;
        }
    }
}
