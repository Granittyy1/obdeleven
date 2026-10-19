package bo.app;

import com.braze.events.IEventSubscriber;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class B implements IEventSubscriber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20645b;

    public /* synthetic */ B(int i10, Object obj) {
        this.f20644a = i10;
        this.f20645b = obj;
    }

    @Override // com.braze.events.IEventSubscriber
    public final void trigger(Object obj) {
        switch (this.f20644a) {
            case 0:
                c5.a((c5) this.f20645b, (u3) obj);
                break;
            default:
                u0.a((u0) this.f20645b, (u3) obj);
                break;
        }
    }
}
