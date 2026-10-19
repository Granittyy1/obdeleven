package Sa;

import kotlinx.coroutines.C;

/* JADX INFO: compiled from: Tasks.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Runnable f5712d;

    public h(Runnable runnable, long j, g gVar) {
        super(j, gVar);
        this.f5712d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f5712d.run();
        } finally {
            this.f5710c.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f5712d;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(C.l(runnable));
        sb2.append(", ");
        sb2.append(this.f5709b);
        sb2.append(", ");
        sb2.append(this.f5710c);
        sb2.append(']');
        return sb2.toString();
    }
}
