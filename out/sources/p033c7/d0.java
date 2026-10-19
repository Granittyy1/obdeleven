package p033c7;

import android.view.View;
import androidx.core.view.InterfaceC1309y;
import androidx.core.view.n0;
import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper;
import p083g7.m;
import p096h7.a;
import p096h7.b;
import p183oa.d;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d0 implements d, InterfaceC1309y, a.InterfaceC0377a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22437c;

    public /* synthetic */ d0(Object obj, Object obj2) {
        this.f22436b = obj;
        this.f22437c = obj2;
    }

    @Override // p183oa.d
    public boolean a(Object obj) {
        Y y10 = (Y) obj;
        long jA = ((e0) this.f22436b).f22441b.a() - y10.L();
        m mVar = (m) this.f22437c;
        return jA > mVar.c() || y10.M() < mVar.a();
    }

    @Override // p096h7.a.InterfaceC0377a
    public void d(b bVar) {
        ((a.InterfaceC0377a) this.f22436b).d(bVar);
        ((a.InterfaceC0377a) this.f22437c).d(bVar);
    }

    @Override // androidx.core.view.InterfaceC1309y
    public n0 g(View view, n0 n0Var) {
        return DefaultInAppMessageViewWrapper.addInAppMessageViewToViewGroup$lambda$0((View) this.f22436b, (DefaultInAppMessageViewWrapper) this.f22437c, view, n0Var);
    }
}
