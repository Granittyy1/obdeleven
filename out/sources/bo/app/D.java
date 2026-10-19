package bo.app;

import com.braze.events.IEventSubscriber;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class D implements IEventSubscriber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20651b;

    public /* synthetic */ D(int i10, Object obj) {
        this.f20650a = i10;
        this.f20651b = obj;
    }

    @Override // com.braze.events.IEventSubscriber
    public final void trigger(Object obj) {
        switch (this.f20650a) {
            case 0:
                C1466f0.a((C1466f0) this.f20651b, (z5) obj);
                break;
            default:
                u6.a((u6) this.f20651b, (p6) obj);
                break;
        }
    }
}
