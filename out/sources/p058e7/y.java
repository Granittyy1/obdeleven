package p058e7;

import T6.b;
import Y1.d;
import io.reactivex.internal.operators.flowable.FlowableCreate;
import io.reactivex.internal.operators.flowable.FlowablePublish;
import p171na.a;

/* JADX INFO: compiled from: ProgrammaticContextualTriggerFlowableModule_ProvidesProgramaticContextualTriggerStreamFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class y implements b<a<String>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f34826a;

    public y(x xVar) {
        this.f34826a = xVar;
    }

    @Override // p268va.a
    public final Object get() {
        d dVar = new d(8, this.f34826a);
        int i10 = p123ja.d.f41194b;
        FlowablePublish flowablePublishC = new FlowableCreate(dVar).c();
        flowablePublishC.f(new io.reactivex.internal.util.b());
        return flowablePublishC;
    }
}
