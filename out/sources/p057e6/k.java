package p057e6;

import com.google.android.play.core.review.internal.zzu;
import java.util.ArrayList;
import p045d6.e;
import p191p5.h;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f34750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f34751d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q qVar, h hVar, e eVar) {
        super(hVar);
        this.f34751d = qVar;
        this.f34750c = eVar;
    }

    @Override // p057e6.h
    public final void a() {
        q qVar = this.f34751d;
        e eVar = qVar.f34769m;
        ArrayList<h> arrayList = qVar.f34761d;
        e eVar2 = this.f34750c;
        g gVar = qVar.f34759b;
        if (eVar != null || qVar.f34764g) {
            if (!qVar.f34764g) {
                eVar2.run();
                return;
            } else {
                gVar.a("Waiting to bind to the service.", new Object[0]);
                arrayList.add(eVar2);
                return;
            }
        }
        gVar.a("Initiate binding to the service.", new Object[0]);
        arrayList.add(eVar2);
        p pVar = new p(qVar);
        qVar.f34768l = pVar;
        qVar.f34764g = true;
        if (qVar.f34758a.bindService(qVar.f34765h, pVar, 1)) {
            return;
        }
        gVar.a("Failed to bind to the service.", new Object[0]);
        qVar.f34764g = false;
        for (h hVar : arrayList) {
            zzu zzuVar = new zzu();
            h hVar2 = hVar.f34746b;
            if (hVar2 != null) {
                hVar2.c(zzuVar);
            }
        }
        arrayList.clear();
    }
}
