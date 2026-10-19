package H4;

import C4.j;
import C4.l;
import C4.x;
import D4.k;
import I4.u;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p311z4.i;

/* JADX INFO: compiled from: DefaultScheduler.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f3716f = Logger.getLogger(x.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f3717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f3718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D4.d f3719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J4.d f3720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final K4.a f3721e;

    public c(Executor executor, D4.d dVar, u uVar, J4.d dVar2, K4.a aVar) {
        this.f3718b = executor;
        this.f3719c = dVar;
        this.f3717a = uVar;
        this.f3720d = dVar2;
        this.f3721e = aVar;
    }

    @Override // H4.e
    public final void a(final l lVar, final j jVar, final i iVar) {
        this.f3718b.execute(new Runnable() { // from class: H4.a
            @Override // java.lang.Runnable
            public final void run() {
                final l lVar2 = lVar;
                String str = lVar2.f2380a;
                i iVar2 = iVar;
                j jVar2 = jVar;
                final c cVar = this.f3709b;
                cVar.getClass();
                Logger logger = c.f3716f;
                try {
                    k kVar = cVar.f3719c.get(str);
                    if (kVar == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        iVar2.b(new IllegalArgumentException(str2));
                    } else {
                        final j jVarB = kVar.b(jVar2);
                        cVar.f3721e.b(new K4.a.InterfaceC0060a() { // from class: H4.b
                            @Override // K4.a.InterfaceC0060a
                            public final Object k() {
                                c cVar2 = cVar;
                                J4.d dVar = cVar2.f3720d;
                                l lVar3 = lVar2;
                                dVar.a0(lVar3, jVarB);
                                cVar2.f3717a.a(lVar3, 1);
                                return null;
                            }
                        });
                        iVar2.b(null);
                    }
                } catch (Exception e10) {
                    logger.warning("Error scheduling event " + e10.getMessage());
                    iVar2.b(e10);
                }
            }
        });
    }
}
