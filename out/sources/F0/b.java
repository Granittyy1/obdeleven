package F0;

import androidx.compose.ui.graphics.colorspace.j;
import androidx.compose.ui.graphics.colorspace.t;
import com.afollestad.materialdialogs.MaterialDialog;
import com.google.firebase.messaging.V;
import com.voltasit.obdeleven.ui.dialogs.B;
import io.intercom.android.sdk.activities.IntercomSheetActivity;
import p033c7.A;
import p123ja.h;
import p191p5.g;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements j, p183oa.b, p191p5.c, MaterialDialog.e, p063f.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3181b;

    public /* synthetic */ b(Object obj) {
        this.f3181b = obj;
    }

    @Override // p183oa.b
    public void a(Object obj) {
        A a10 = (A) this.f3181b;
        a10.getClass();
        a10.f22340b = h.b((N7.b) obj);
    }

    @Override // p063f.b
    public void b(Object obj) {
        ((IntercomSheetActivity) this.f3181b).lambda$onCreate$0((p063f.a) obj);
    }

    @Override // com.afollestad.materialdialogs.MaterialDialog.e
    public void c(MaterialDialog materialDialog) {
        ((B) this.f3181b).a();
    }

    @Override // p191p5.c
    public void e(g gVar) {
        ((V.a) this.f3181b).f28343b.d(null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.j
    public double g(double d10) {
        t tVar = (t) this.f3181b;
        return d10 >= tVar.f13620e ? Math.pow((tVar.f13617b * d10) + tVar.f13618c, tVar.f13616a) : d10 * tVar.f13619d;
    }
}
