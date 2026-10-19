package p315z8;

import Q8.d;
import p134k8.T1;
import p255u9.D;

/* JADX INFO: compiled from: VehicleModelValueWrapper.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends T1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f48947d;

    public a(c cVar) {
        D d10 = cVar.f48948a;
        this.f48947d = cVar;
        this.f42678a = d10.getInt("startYear") + "...";
        if (d10.getInt("endYear") > 0) {
            this.f42678a += d10.getInt("endYear");
        }
        this.f42679b = "";
        for (d dVar : cVar.f48949b) {
            if (!this.f42679b.isEmpty()) {
                this.f42679b = d.a(new StringBuilder(), this.f42679b, "/");
            }
            this.f42679b += dVar.f48950a;
        }
    }
}
