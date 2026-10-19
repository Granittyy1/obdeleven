package R2;

import K2.K;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* JADX INFO: renamed from: R2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CancelWorkRunnable.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0749b extends AbstractRunnableC0751d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ K f5221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UUID f5222d;

    public C0749b(K k10, UUID uuid) {
        this.f5221c = k10;
        this.f5222d = uuid;
    }

    @Override // R2.AbstractRunnableC0751d
    public final void b() {
        K k10 = this.f5221c;
        WorkDatabase workDatabase = k10.f4146c;
        workDatabase.c();
        try {
            AbstractRunnableC0751d.a(k10, this.f5222d.toString());
            workDatabase.m();
            workDatabase.j();
            K2.w.b(k10.f4145b, k10.f4146c, k10.f4148e);
        } catch (Throwable th) {
            workDatabase.j();
            throw th;
        }
    }
}
