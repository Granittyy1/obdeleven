package Q8;

import A1.p;
import A1.t;
import U1.l;
import android.content.Context;
import androidx.compose.ui.graphics.colorspace.j;
import java.util.List;
import p114j1.k;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements com.google.common.base.c, j, t, j1.j.a {
    public static String a(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static String b(StringBuilder sb2, List list, char c10) {
        sb2.append(list);
        sb2.append(c10);
        return sb2.toString();
    }

    public static void e(String str, String str2) {
        k.f(str + str2);
    }

    public static void f(StringBuilder sb2, String str, Context context, int i10, String str2) {
        sb2.append(str);
        sb2.append(context.getString(i10));
        sb2.append(str2);
    }

    @Override // com.google.common.base.c
    public Object apply(Object obj) {
        return (l) obj;
    }

    @Override // A1.t
    public p[] c() {
        return new p[]{new p103i2.a()};
    }

    @Override // androidx.compose.ui.graphics.colorspace.j
    public double g(double d10) {
        double d11;
        double dPow = d10 < 0.0d ? -d10 : d10;
        if (dPow >= 0.0031308049535603718d) {
            dPow = Math.pow(dPow, 0.4166666666666667d) - 0.05213270142180095d;
            d11 = 0.9478672985781991d;
        } else {
            d11 = 0.07739938080495357d;
        }
        return Math.copySign(dPow / d11, d10);
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        ((p162n1.b) obj).getClass();
    }
}
