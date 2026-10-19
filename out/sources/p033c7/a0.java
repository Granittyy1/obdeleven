package p033c7;

import android.content.Context;
import androidx.compose.foundation.text.B;
import androidx.media3.exoplayer.source.i;
import com.google.android.gms.internal.measurement.Y;
import com.parse.ParseException;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.usecases.device.u;
import com.voltasit.obdeleven.models.SupportedManufacturer;
import com.voltasit.obdeleven.ui.module.l;
import io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable;
import io.reactivex.internal.operators.observable.e;
import io.reactivex.internal.operators.observable.g;
import io.reactivex.internal.operators.observable.h;
import io.reactivex.internal.operators.observable.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p083g7.m;
import p110i9.x;
import p114j1.f;
import p183oa.c;
import p220r9.J;
import p235t1.k;
import p255u9.D;
import p255u9.F;
import p279w9.d;
import p315z8.a;
import p315z8.b;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a0 implements c, d.b, f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22422c;

    public /* synthetic */ a0(Object obj, Object obj2) {
        this.f22421b = obj;
        this.f22422c = obj2;
    }

    @Override // p114j1.f
    public void a(Object obj) {
        i.a aVar = (i.a) this.f22421b;
        ((i) obj).k(aVar.f18703a, aVar.f18704b, (k) this.f22422c);
    }

    @Override // p183oa.c, p311z4.f
    public Object apply(Object obj) {
        Z z10 = (Z) obj;
        e0 e0Var = (e0) this.f22421b;
        e0Var.getClass();
        m mVar = (m) this.f22422c;
        Y yJ = z10.J(mVar.b(), e0Var.b());
        Q3.d.I(yJ, "The item is null");
        return new ObservableFlatMapCompletableCompletable(new h(new j(new e(new g(yJ), new B(e0Var, mVar)), new g(e0Var.b())), new C1504q(z10, mVar)), new b0(e0Var));
    }

    @Override // w9.d.b
    public void g(List list, ParseException parseException) {
        p315z8.d dVar;
        p315z8.c cVar;
        l lVar = (l) this.f22421b;
        if (((SupportedManufacturer) this.f22422c) != lVar.f34134u) {
            return;
        }
        if (parseException != null) {
            Context context = lVar.getContext();
            Objects.requireNonNull(context);
            if (!u.k(context)) {
                Y.k(lVar, R.string.common_check_network, "TryAgainDialog");
                return;
            }
            int iH = J.h(parseException.getCode());
            lVar.f34125l.setVisibility(8);
            lVar.f34127n.setVisibility(8);
            lVar.f34131r.setVisibility(8);
            lVar.f34130q.setVisibility(0);
            lVar.f34130q.setText(iH);
            return;
        }
        if (list.isEmpty() && !u.k(lVar.getContext())) {
            Y.k(lVar, R.string.common_check_network, "TryAgainDialog");
            return;
        }
        x xVar = (x) lVar.f34126m.getAdapter();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            F f10 = (F) it.next();
            D d10 = (D) f10.getParseObject("vehicleBase");
            Iterator it2 = arrayList2.iterator();
            do {
                dVar = null;
                if (!it2.hasNext()) {
                    cVar = null;
                    break;
                }
                cVar = (p315z8.c) it2.next();
            } while (!cVar.f48948a.getObjectId().equals(d10.getObjectId()));
            if (cVar == null) {
                cVar = new p315z8.c(d10);
                arrayList2.add(cVar);
            }
            ArrayList<p315z8.d> arrayList3 = cVar.f48949b;
            for (p315z8.d dVar2 : arrayList3) {
                if (dVar2.f48950a.equals(f10.getString("model"))) {
                    dVar = dVar2;
                    break;
                }
            }
            if (dVar == null) {
                dVar = new p315z8.d(f10.getString("model"));
                arrayList3.add(dVar);
            }
            dVar.f48951b.add(f10);
        }
        Collections.sort(arrayList2, new b());
        Collections.sort(arrayList2, new com.voltasit.obdeleven.ui.module.j());
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList.add(new a((p315z8.c) it3.next()));
        }
        xVar.d(arrayList);
        lVar.f34138y.e(lVar.f34139z);
        lVar.f34133t.setVisibility(0);
        lVar.f34128o.setVisibility(8);
        lVar.f34125l.setVisibility(8);
        lVar.f34131r.setVisibility(0);
        lVar.f34127n.setVisibility(8);
        lVar.f34130q.setVisibility(8);
    }
}
