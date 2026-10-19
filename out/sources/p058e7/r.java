package p058e7;

import T6.b;
import android.app.Application;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureBuffer;
import io.reactivex.internal.operators.flowable.FlowablePublish;
import io.reactivex.internal.operators.flowable.f;
import p033c7.C1508v;
import p123ja.d;
import p171na.a;

/* JADX INFO: compiled from: ForegroundFlowableModule_ProvidesAppForegroundEventStreamFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements b<a<String>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f34816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p268va.a<Application> f34817b;

    public r(q qVar, p268va.a<Application> aVar) {
        this.f34816a = qVar;
        this.f34817b = aVar;
    }

    @Override // p268va.a
    public final Object get() {
        Application application = this.f34817b.get();
        this.f34816a.getClass();
        C1508v c1508v = new C1508v();
        p256ua.a<String> aVar = c1508v.f22512f;
        aVar.getClass();
        f fVar = new f(aVar);
        int i10 = d.f41194b;
        Q3.d.L(i10, "bufferSize");
        FlowablePublish flowablePublishC = new FlowableOnBackpressureBuffer(fVar, i10).c();
        flowablePublishC.f(new io.reactivex.internal.util.b());
        application.registerActivityLifecycleCallbacks(c1508v);
        return flowablePublishC;
    }
}
