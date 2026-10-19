package X8;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.fragment.app.E;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import com.voltasit.obdeleven.presentation.SfdViewModel;
import com.voltasit.obdeleven.ui.dialogs.DialogC2146g0;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p033c7.C1489b;
import p033c7.Z;
import p033c7.e0;
import p255u9.F;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements E, p183oa.b, com.google.gson.internal.f, DialogC2146g0.d, i8.i.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7400c;

    public /* synthetic */ m(int i10, Object obj) {
        this.f7399b = i10;
        this.f7400c = obj;
    }

    @Override // p183oa.b
    public void a(Object obj) {
        switch (this.f7399b) {
            case 2:
                C1489b c1489b = (C1489b) this.f7400c;
                c1489b.getClass();
                HashSet hashSet = new HashSet();
                Iterator<E> it = ((N7.e) obj).K().iterator();
                while (it.hasNext()) {
                    for (S6.f fVar : ((CampaignProto$ThickContent) it.next()).M()) {
                        if (!TextUtils.isEmpty(fVar.G().H())) {
                            hashSet.add(fVar.G().H());
                        }
                    }
                }
                if (hashSet.size() > 50) {
                    Q3.d.C();
                }
                hashSet.toString();
                Q3.d.B();
                c1489b.f22425c.a(hashSet);
                break;
            default:
                e0 e0Var = (e0) this.f7400c;
                e0Var.getClass();
                e0Var.f22442c = p123ja.h.b((Z) obj);
                break;
        }
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.DialogC2146g0.c
    public void c(F f10) {
        com.voltasit.obdeleven.ui.module.l lVar = (com.voltasit.obdeleven.ui.module.l) this.f7400c;
        lVar.getClass();
        p255u9.E eB = p255u9.E.b(f10);
        p195p9.d dVar = new p195p9.d();
        dVar.R(eB, false, true);
        lVar.r().n(dVar, null);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, xa.g] */
    @Override // androidx.fragment.app.E
    public void h(Bundle bundle, String str) {
        s sVar = (s) this.f7400c;
        ((SfdViewModel) sVar.f7411D.getValue()).d(sVar.f7416q.f29320b.getControlUnitBase().getObjectId(), sVar.f7416q.n().shortValue());
    }

    @Override // com.google.gson.internal.f
    public Object i() {
        return ((com.google.gson.d) this.f7400c).a();
    }

    @Override // i8.i.a
    public void l(List list) {
        p182o9.c cVar = (p182o9.c) this.f7400c;
        cVar.f45243x.e(list);
        new Handler().post(new K5.q(4, cVar));
    }

    public /* synthetic */ m(com.google.gson.d dVar, Type type) {
        this.f7399b = 4;
        this.f7400c = dVar;
    }
}
