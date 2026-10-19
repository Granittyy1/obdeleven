package bo.app;

import com.braze.events.IEventSubscriber;
import com.braze.events.InAppMessageEvent;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class E0 implements IEventSubscriber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20656b;

    public /* synthetic */ E0(int i10, Object obj) {
        this.f20655a = i10;
        this.f20656b = obj;
    }

    @Override // com.braze.events.IEventSubscriber
    public final void trigger(Object obj) {
        switch (this.f20655a) {
            case 0:
                r4.a((r4) this.f20656b, (s4) obj);
                break;
            default:
                BrazeInAppMessageManager.createInAppMessageEventSubscriber$lambda$8((BrazeInAppMessageManager) this.f20656b, (InAppMessageEvent) obj);
                break;
        }
    }
}
