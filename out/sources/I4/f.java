package I4;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.E;
import androidx.media3.exoplayer.h0;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import com.afollestad.materialdialogs.MaterialDialog;
import com.google.firebase.messaging.S;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.basicsettings.UDSBasicSettingsFragment;
import com.voltasit.obdeleven.ui.dialogs.B;
import com.voltasit.obdeleven.ui.dialogs.autocodeprogress.AutocodeProgressDialog;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p078g1.v;
import p134k8.A1;
import p134k8.T1;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements K4.a.InterfaceC0060a, p285x2.c.InterfaceC0549c, androidx.compose.ui.graphics.colorspace.j, j1.j.a, p191p5.d, p191p5.c, E, MaterialDialog.e, i8.i.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3851c;

    public /* synthetic */ f(int i10, Object obj) {
        this.f3850b = i10;
        this.f3851c = obj;
    }

    @Override // p285x2.c.InterfaceC0549c
    public p285x2.c a(x2.c.b bVar) {
        Context context = (Context) this.f3851c;
        x2.c.a callback = bVar.f47887c;
        kotlin.jvm.internal.i.e(callback, "callback");
        String str = bVar.f47886b;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new FrameworkSQLiteOpenHelper(context, str, callback, true, true);
    }

    @Override // com.afollestad.materialdialogs.MaterialDialog.e
    public void c(MaterialDialog materialDialog) {
        B b10 = (B) this.f3851c;
        b10.f33735d.dismiss();
        b10.f33744n.setResult(Boolean.FALSE);
    }

    @Override // p191p5.d
    public void d(Exception exc) {
        p123ja.i iVar = (p123ja.i) this.f3851c;
        iVar.onError(exc);
        iVar.a();
    }

    @Override // p191p5.c
    public void e(p191p5.g gVar) {
        S.b((Intent) this.f3851c);
    }

    @Override // androidx.compose.ui.graphics.colorspace.j
    public double g(double d10) {
        float[] fArr = androidx.compose.ui.graphics.colorspace.f.f13567a;
        return androidx.compose.ui.graphics.colorspace.f.c((androidx.compose.ui.graphics.colorspace.t) this.f3851c, d10);
    }

    @Override // androidx.fragment.app.E
    public void h(Bundle bundle, String str) {
        switch (this.f3850b) {
            case 6:
                UDSBasicSettingsFragment this$0 = (UDSBasicSettingsFragment) this.f3851c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(str, "<anonymous parameter 0>");
                this$0.U().c();
                break;
            default:
                AutocodeProgressDialog this$1 = (AutocodeProgressDialog) this.f3851c;
                kotlin.jvm.internal.i.e(this$1, "this$0");
                kotlin.jvm.internal.i.e(str, "<anonymous parameter 0>");
                this$1.B().e();
                break;
        }
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        switch (this.f3850b) {
            case 3:
                ((v.c) obj).c(((h0) this.f3851c).f18416f);
                break;
            default:
                ((p162n1.b) obj).getClass();
                break;
        }
    }

    @Override // K4.a.InterfaceC0060a
    public Object k() {
        return Integer.valueOf(((J4.d) this.f3851c).d());
    }

    @Override // i8.i.a
    public void l(List list) {
        p073f9.k kVar = (p073f9.k) this.f3851c;
        kVar.w();
        A1 a10 = (A1) list.get(0);
        ArrayList<T1> arrayListA = a10.f42568a.a(a10.f42569b);
        ArrayList arrayList = new ArrayList();
        for (T1 t8 : arrayListA) {
            String str = t8.f42678a;
            if (str == null || str.isEmpty()) {
                Locale locale = Locale.US;
                str = kVar.getString(R.string.common_value) + " " + (arrayListA.indexOf(t8) + 1);
            }
            arrayList.add(str);
        }
        kVar.f35054F.C(arrayList);
    }

    public /* synthetic */ f(n1.b.a aVar, Object obj, long j) {
        this.f3850b = 10;
        this.f3851c = obj;
    }
}
