package p191p5;

import U4.C0804l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f45839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f45840c;

    public s(t tVar, g gVar) {
        this.f45840c = tVar;
        this.f45839b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f45840c.f45842c) {
            try {
                d dVar = this.f45840c.f45843d;
                if (dVar != null) {
                    Exception excJ = this.f45839b.j();
                    C0804l.h(excJ);
                    dVar.d(excJ);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
