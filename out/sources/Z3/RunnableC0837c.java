package Z3;

import androidx.media3.exoplayer.K;
import com.google.firebase.messaging.RunnableC2056t;
import p114j1.C2480b;

/* JADX INFO: renamed from: Z3.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0837c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7797c;

    public /* synthetic */ RunnableC0837c(int i10, Object obj) {
        this.f7796b = i10;
        this.f7797c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f7797c;
        switch (this.f7796b) {
            case 0:
                ((C0841g) obj).a();
                break;
            case 1:
                K k10 = (K) obj;
                k10.getClass();
                int i10 = p114j1.A.f40996a;
                Integer numValueOf = Integer.valueOf(p090h1.d.a(k10.f18021e).generateAudioSessionId());
                C2480b<Integer> c2480b = k10.f17993F;
                c2480b.getClass();
                c2480b.f41007b.e(new RunnableC2056t(c2480b, 2, numValueOf));
                break;
            case 2:
                com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.q qVar = (com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.q) obj;
                if (!qVar.y()) {
                    qVar.f31839J.setRefreshing(false);
                    qVar.U(true);
                    new com.voltasit.obdeleven.presentation.dialogs.f().J(qVar);
                    break;
                }
                break;
            case 3:
                Runnable onContinue = (Runnable) obj;
                kotlin.jvm.internal.i.e(onContinue, "$onContinue");
                onContinue.run();
                break;
            default:
                p128k2.j jVar = (p128k2.j) obj;
                jVar.f41508l.start();
                jVar.e(jVar.f41517u, 2000L);
                break;
        }
    }
}
