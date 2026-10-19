package p033c7;

import com.google.firebase.inappmessaging.DismissType;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayCallbacks;
import p083g7.h;
import p183oa.a;
import p191p5.B;
import p191p5.e;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22495d;

    public /* synthetic */ r(Object obj, int i10, Object obj2) {
        this.f22493b = i10;
        this.f22494c = obj;
        this.f22495d = obj2;
    }

    @Override // p183oa.a
    public final void run() {
        switch (this.f22493b) {
            case 0:
                C1506t c1506t = (C1506t) this.f22494c;
                final O o10 = c1506t.f22503f;
                o10.getClass();
                final h hVar = c1506t.f22505h;
                if (!hVar.f35628b.f5085b) {
                    B id = o10.f22395c.getId();
                    final FirebaseInAppMessagingDisplayCallbacks.InAppMessagingDismissType inAppMessagingDismissType = (FirebaseInAppMessagingDisplayCallbacks.InAppMessagingDismissType) this.f22495d;
                    id.f(o10.f22399g, new e() { // from class: c7.N
                        @Override // p191p5.e
                        public final void onSuccess(Object obj) {
                            O o11 = o10;
                            o11.getClass();
                            DismissType dismissType = (DismissType) O.f22392i.get(inAppMessagingDismissType);
                            S6.a.C0079a c0079aA = o11.a(hVar, (String) obj);
                            c0079aA.r();
                            S6.a.J((S6.a) c0079aA.f29047c, dismissType);
                            o11.f22393a.a(c0079aA.p().n());
                        }
                    });
                    o10.c(hVar, "fiam_dismiss", false);
                }
                C1501n c1501n = o10.f22398f;
                for (final C1501n.b bVar : c1501n.f22473c.values()) {
                    bVar.getClass();
                    c1501n.f22471a.execute(new Runnable(hVar) { // from class: c7.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f22470b.getClass();
                            throw null;
                        }
                    });
                }
                break;
            default:
                e0 e0Var = (e0) this.f22494c;
                e0Var.getClass();
                e0Var.f22442c = p123ja.h.b((Z) this.f22495d);
                break;
        }
    }
}
