package p033c7;

import com.afollestad.materialdialogs.MaterialDialog;
import com.facebook.appevents.ml.ModelManager;
import com.google.firebase.inappmessaging.EventType;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.DiagnosticSession;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.core.app.C2096k;
import com.voltasit.obdeleven.presentation.controlUnit.ControlUnitFragment;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import p078g1.m;
import p078g1.v;
import p083g7.h;
import p093h4.g;
import p105i4.b;
import p114j1.j;
import p162n1.f;
import p183oa.a;
import p191p5.e;

/* JADX INFO: renamed from: c7.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1505s implements a, MaterialDialog.c, g.a, j.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22497c;

    public /* synthetic */ C1505s(Object obj, Object obj2) {
        this.f22496b = obj;
        this.f22497c = obj2;
    }

    @Override // h4.g.a
    public void a(File file) {
        ModelManager.a slave = (ModelManager.a) this.f22496b;
        i.e(slave, "$slave");
        i.e(file, "file");
        slave.f24957g = (b) this.f22497c;
        slave.f24956f = file;
        Runnable runnable = slave.f24958h;
        if (runnable == null) {
            return;
        }
        runnable.run();
    }

    @Override // com.afollestad.materialdialogs.MaterialDialog.c
    public void b(MaterialDialog materialDialog, int i10) {
        ArrayList arrayList = (ArrayList) this.f22496b;
        ControlUnitFragment this$0 = (ControlUnitFragment) this.f22497c;
        i.e(this$0, "this$0");
        DiagnosticSession diagnosticSession = (DiagnosticSession) arrayList.get(i10);
        ControlUnit controlUnit = this$0.f31429o;
        i.b(controlUnit);
        controlUnit.A(diagnosticSession.f29361a).continueWith(new C2096k(this$0, 1, diagnosticSession), Task.UI_THREAD_EXECUTOR);
    }

    @Override // j1.j.b
    public void f(Object obj, m mVar) {
        ((p162n1.b) obj).g((v) this.f22497c, new p162n1.b.C0508b(mVar, ((f) this.f22496b).f44686f));
    }

    @Override // p183oa.a
    public void run() {
        C1506t c1506t = (C1506t) this.f22496b;
        final O o10 = c1506t.f22503f;
        o10.getClass();
        final h hVar = c1506t.f22505h;
        if (!hVar.f35628b.f5085b) {
            o10.f22395c.getId().f(o10.f22399g, new e() { // from class: c7.M
                @Override // p191p5.e
                public final void onSuccess(Object obj) {
                    EventType eventType = EventType.CLICK_EVENT_TYPE;
                    O o11 = o10;
                    S6.a.C0079a c0079aA = o11.a(hVar, (String) obj);
                    c0079aA.r();
                    S6.a.I((S6.a) c0079aA.f29047c, eventType);
                    o11.f22393a.a(c0079aA.p().n());
                }
            });
            o10.c(hVar, "fiam_action", true);
        }
        C1501n c1501n = o10.f22398f;
        for (C1501n.a aVar : c1501n.f22472b.values()) {
            aVar.getClass();
            c1501n.f22471a.execute(new RunnableC1499l(aVar, hVar, (p083g7.a) this.f22497c));
        }
    }
}
