package D7;

import android.content.Context;
import com.google.firebase.perf.session.SessionManager;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2853e;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i10) {
        this.f2850b = i10;
        this.f2851c = obj;
        this.f2852d = obj2;
        this.f2853e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2850b) {
            case 0:
                ((Y4.b) this.f2851c).b((String) this.f2852d, (com.google.firebase.remoteconfig.internal.b) this.f2853e);
                break;
            case 1:
                ((retrofit2.f) this.f2852d).onFailure(retrofit2.i.b.this, (Throwable) this.f2853e);
                break;
            default:
                ((SessionManager) this.f2851c).lambda$setApplicationContext$0((Context) this.f2852d, (p290x7.a) this.f2853e);
                break;
        }
    }
}
