package Z6;

import android.view.LayoutInflater;
import com.google.android.gms.internal.measurement.C1787c0;

/* JADX INFO: compiled from: InflaterModule_ProvidesInflaterserviceFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements p268va.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7956b;

    public /* synthetic */ r(int i10, Object obj) {
        this.f7955a = i10;
        this.f7956b = obj;
    }

    @Override // p268va.a
    public final Object get() {
        switch (this.f7955a) {
            case 0:
                LayoutInflater layoutInflater = (LayoutInflater) ((o) this.f7956b).f7950c.getSystemService("layout_inflater");
                p006a5.a.b(layoutInflater);
                return layoutInflater;
            case 1:
                p171na.a<String> aVar = ((p046d7.o) this.f7956b).f34610l.get();
                C1787c0.e(aVar);
                return aVar;
            default:
                p144l6.e eVar = ((p229s7.a) this.f7956b).f46988a;
                p111ia.c.d(eVar);
                return eVar;
        }
    }
}
