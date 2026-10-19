package p068f4;

import android.graphics.Typeface;
import com.google.firebase.perf.v1.d;
import java.util.ArrayList;
import p211r0.f;
import y7.a;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f34947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f34948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f34949d;

    public /* synthetic */ h(Object obj, int i10, Object obj2) {
        this.f34947b = i10;
        this.f34948c = obj;
        this.f34949d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34947b) {
            case 0:
                i iVar = (i) this.f34948c;
                iVar.a(new ArrayList(iVar.f34972r), (f) this.f34949d);
                break;
            case 1:
                ((f.e) this.f34948c).c((Typeface) this.f34949d);
                break;
            default:
                a aVar = (a) this.f34948c;
                d dVarB = aVar.b((com.google.firebase.perf.util.h) this.f34949d);
                if (dVarB != null) {
                    aVar.f48412a.add(dVarB);
                }
                break;
        }
    }
}
