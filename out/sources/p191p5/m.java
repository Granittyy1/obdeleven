package p191p5;

import com.google.android.gms.tasks.RuntimeExecutionException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f45823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f45824c;

    public m(n nVar, g gVar) {
        this.f45824c = nVar;
        this.f45823b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar = this.f45823b;
        boolean zM = gVar.m();
        n nVar = this.f45824c;
        if (zM) {
            nVar.f45827d.u();
            return;
        }
        try {
            nVar.f45827d.t(nVar.f45826c.i(gVar));
        } catch (RuntimeExecutionException e10) {
            if (e10.getCause() instanceof Exception) {
                nVar.f45827d.s((Exception) e10.getCause());
            } else {
                nVar.f45827d.s(e10);
            }
        } catch (Exception e11) {
            nVar.f45827d.s(e11);
        }
    }
}
