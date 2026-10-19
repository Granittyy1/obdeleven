package p005a4;

import D2.V;
import N7.e;
import Q3.d;
import Z3.r;
import android.view.View;
import androidx.core.view.InterfaceC1309y;
import androidx.core.view.n0;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.cloudbridge.a;
import com.facebook.internal.FeatureManager;
import java.util.Locale;
import kotlin.jvm.internal.i;
import org.json.JSONException;
import p114j1.j;
import p165n4.l;
import p183oa.b;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements FeatureManager.a, b, InterfaceC1309y, j.a {
    public static int b(int i10, int i11, int i12) {
        return (Integer.hashCode(i10) + i11) * i12;
    }

    public static String c(StringBuilder sb2, int i10, String str) {
        sb2.append(i10);
        sb2.append(str);
        return sb2.toString();
    }

    @Override // p183oa.b
    public void a(Object obj) {
        Locale locale = Locale.US;
        ((e) obj).K().size();
        d.C();
    }

    @Override // com.facebook.internal.FeatureManager.a
    public void e(boolean z10) {
        if (z10) {
            String str = com.facebook.appevents.cloudbridge.b.f24906b;
            LoggingBehavior loggingBehavior = LoggingBehavior.f24776d;
            try {
                r rVar = new r(null, i.k("/cloudbridge_settings", Z3.q.b()), null, HttpMethod.f24771b, new a(), 32);
                l.a aVar = l.f44910c;
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                l.a.b(loggingBehavior, str, " \n\nCreating Graph Request: \n=============\n%s\n\n ", rVar);
                rVar.d();
            } catch (JSONException e10) {
                l.a aVar2 = l.f44910c;
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                l.a.b(loggingBehavior, str, " \n\nGraph Request Exception: \n=============\n%s\n\n ", V.t(e10));
            }
        }
    }

    @Override // androidx.core.view.InterfaceC1309y
    public n0 g(View v10, n0 n0Var) {
        i.e(v10, "v");
        n0.k kVar = n0Var.f16948a;
        p222s0.b bVarG = kVar.g(7);
        i.d(bVarG, "getInsets(...)");
        p222s0.b bVarG2 = kVar.g(128);
        i.d(bVarG2, "getInsets(...)");
        v10.setPadding(Math.max(bVarG.f46851a, bVarG2.f46851a), Math.max(bVarG.f46852b, bVarG2.f46852b), Math.max(bVarG.f46853c, bVarG2.f46853c), Math.max(bVarG.f46854d, bVarG2.f46854d));
        return n0Var;
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        ((p162n1.b) obj).getClass();
    }
}
