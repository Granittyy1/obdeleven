package bo.app;

import com.braze.events.IEventSubscriber;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class E implements IEventSubscriber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20654b;

    public /* synthetic */ E(int i10, Object obj) {
        this.f20653a = i10;
        this.f20654b = obj;
    }

    @Override // com.braze.events.IEventSubscriber
    public final void trigger(Object obj) {
        switch (this.f20653a) {
            case 0:
                f1.a((f1) this.f20654b, (g3) obj);
                break;
            default:
                u6.a((u6) this.f20654b, (o6) obj);
                break;
        }
    }
}
