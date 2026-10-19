package D7;

import com.parse.SaveCallback;
import com.voltasit.obdeleven.ui.activity.MainActivity;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements p191p5.f, SaveCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2831c;

    public /* synthetic */ d(Object obj, Object obj2) {
        this.f2830b = obj;
        this.f2831c = obj2;
    }

    @Override // p191p5.f
    public p191p5.g c(Object obj) {
        e eVar = (e) this.f2830b;
        com.google.firebase.remoteconfig.internal.b bVar = (com.google.firebase.remoteconfig.internal.b) this.f2831c;
        synchronized (eVar) {
            eVar.f2836c = p191p5.j.e(bVar);
        }
        return p191p5.j.e(bVar);
    }

    @Override // com.parse.ParseCallback1
    public void done(Throwable th) {
        boolean z10 = MainActivity.f33531Q;
        MainActivity this$0 = (MainActivity) this.f2830b;
        kotlin.jvm.internal.i.e(this$0, "this$0");
        this$0.H((com.voltasit.obdeleven.ui.activity.o) this.f2831c);
    }
}
