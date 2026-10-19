package p033c7;

import Q3.d;
import io.reactivex.internal.operators.flowable.FlowableCreate;
import io.reactivex.internal.operators.flowable.FlowablePublish;
import io.reactivex.internal.util.b;
import p123ja.e;
import p123ja.f;

/* JADX INFO: renamed from: c7.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AnalyticsEventsManager.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1489b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p192p6.a f22423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlowablePublish f22424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p192p6.a.InterfaceC0518a f22425c;

    /* JADX INFO: renamed from: c7.b$a */
    /* JADX INFO: compiled from: AnalyticsEventsManager.java */
    public class a implements f<String> {
        public a() {
        }

        @Override // p123ja.f
        public final void d(e<String> eVar) {
            d.B();
            C1489b c1489b = C1489b.this;
            p192p6.a aVar = c1489b.f22423a;
            C1507u c1507u = new C1507u();
            c1507u.f22507a = eVar;
            c1489b.f22425c = aVar.f("fiam", c1507u);
        }
    }

    public C1489b(p192p6.a aVar) {
        this.f22423a = aVar;
        a aVar2 = new a();
        int i10 = p123ja.d.f41194b;
        FlowablePublish flowablePublishC = new FlowableCreate(aVar2).c();
        this.f22424b = flowablePublishC;
        flowablePublishC.f(new b());
    }
}
