package K2;

import B8.AbstractC0629h;
import Q2.V;
import androidx.work.impl.WorkDatabase;
import com.voltasit.obdeleven.ui.dialogs.C2177w0;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: K2.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC0723p implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4203b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4206e;

    public /* synthetic */ CallableC0723p(r rVar, ArrayList arrayList, String str) {
        this.f4205d = rVar;
        this.f4204c = arrayList;
        this.f4206e = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f4203b) {
            case 0:
                WorkDatabase workDatabase = ((r) this.f4205d).f4216e;
                V vU = workDatabase.u();
                String str = (String) this.f4206e;
                this.f4204c.addAll(vU.c(str));
                return workDatabase.t().t(str);
            default:
                p170n9.i this$0 = (p170n9.i) this.f4205d;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                C2177w0 c2177w0 = (C2177w0) this.f4206e;
                ArrayList arrayList = this.f4204c;
                if (this$0.y()) {
                    return p293xa.r.f47939a;
                }
                c2177w0.y();
                p122j9.a aVar = this$0.f31590m;
                kotlin.jvm.internal.i.b(aVar);
                boolean z10 = this$0.R().f31597A;
                aVar.f41158b.addAll(arrayList);
                aVar.f41162f = z10;
                aVar.notifyDataSetChanged();
                AbstractC0629h abstractC0629hQ = this$0.Q();
                p122j9.a aVar2 = this$0.f31590m;
                kotlin.jvm.internal.i.b(aVar2);
                abstractC0629hQ.f1927r.setVisibility(aVar2.f41158b.size() == 0 ? 0 : 8);
                return p293xa.r.f47939a;
        }
    }

    public /* synthetic */ CallableC0723p(p170n9.i iVar, C2177w0 c2177w0, ArrayList arrayList) {
        this.f4205d = iVar;
        this.f4206e = c2177w0;
        this.f4204c = arrayList;
    }
}
