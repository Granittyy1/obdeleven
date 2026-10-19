package p058e7;

import O.h;
import T6.b;
import com.google.android.gms.internal.measurement.C1787c0;
import io.reactivex.internal.operators.flowable.FlowablePublish;
import p033c7.C1489b;
import p171na.a;

/* JADX INFO: renamed from: e7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AnalyticsEventsModule_ProvidesAnalyticsConnectorEventsFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2187a implements b<a<String>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f34788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p268va.a<C1489b> f34789b;

    public C2187a(h hVar, p268va.a<C1489b> aVar) {
        this.f34788a = hVar;
        this.f34789b = aVar;
    }

    @Override // p268va.a
    public final Object get() {
        C1489b c1489b = this.f34789b.get();
        this.f34788a.getClass();
        FlowablePublish flowablePublish = c1489b.f22424b;
        C1787c0.f(flowablePublish);
        return flowablePublish;
    }
}
