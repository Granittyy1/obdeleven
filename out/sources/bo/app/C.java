package bo.app;

import com.braze.events.IEventSubscriber;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C implements IEventSubscriber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20648b;

    public /* synthetic */ C(int i10, Object obj) {
        this.f20647a = i10;
        this.f20648b = obj;
    }

    @Override // com.braze.events.IEventSubscriber
    public final void trigger(Object obj) {
        switch (this.f20647a) {
            case 0:
                C1466f0.a((C1466f0) this.f20648b, (x5) obj);
                break;
            default:
                u0.a((u0) this.f20648b, (v0) obj);
                break;
        }
    }
}
