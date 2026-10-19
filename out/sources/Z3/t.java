package Z3;

import android.util.Pair;
import androidx.media3.exoplayer.C1390h;
import androidx.media3.exoplayer.K;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7893d;

    public /* synthetic */ t(Object obj, int i10, Object obj2) {
        this.f7891b = i10;
        this.f7892c = obj;
        this.f7893d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f7893d;
        Object obj2 = this.f7892c;
        switch (this.f7891b) {
            case 0:
                w requests = (w) obj;
                kotlin.jvm.internal.i.e(requests, "$requests");
                for (Pair pair : (ArrayList) obj2) {
                    r.b bVar = (r.b) pair.first;
                    Object obj3 = pair.second;
                    kotlin.jvm.internal.i.d(obj3, "pair.second");
                    bVar.b((x) obj3);
                }
                Iterator it = requests.f7901e.iterator();
                while (it.hasNext()) {
                    ((w.a) it.next()).a(requests);
                }
                break;
            default:
                p297y1.x xVar = (p297y1.x) obj2;
                xVar.getClass();
                int i10 = p114j1.A.f40996a;
                K k10 = K.this;
                k10.getClass();
                k10.f18039s.J((C1390h) obj);
                break;
        }
    }
}
