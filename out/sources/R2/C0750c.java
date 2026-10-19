package R2;

import K2.K;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* JADX INFO: renamed from: R2.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CancelWorkRunnable.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0750c extends AbstractRunnableC0751d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ K f5223c;

    public C0750c(K k10) {
        this.f5223c = k10;
    }

    @Override // R2.AbstractRunnableC0751d
    public final void b() {
        K k10 = this.f5223c;
        WorkDatabase workDatabase = k10.f4146c;
        workDatabase.c();
        try {
            Iterator it = workDatabase.t().b().iterator();
            while (it.hasNext()) {
                AbstractRunnableC0751d.a(k10, (String) it.next());
            }
            workDatabase.m();
        } finally {
            workDatabase.j();
        }
    }
}
