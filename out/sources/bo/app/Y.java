package bo.app;

import com.braze.events.IEventSubscriber;
import com.braze.events.SdkDataWipeEvent;
import com.braze.ui.contentcards.ContentCardsFragment;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Y implements IEventSubscriber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20681b;

    public /* synthetic */ Y(int i10, Object obj) {
        this.f20680a = i10;
        this.f20681b = obj;
    }

    @Override // com.braze.events.IEventSubscriber
    public final void trigger(Object obj) {
        switch (this.f20680a) {
            case 0:
                m1.a((m1) this.f20681b, (a5) obj);
                break;
            default:
                ContentCardsFragment.onResume$lambda$2((ContentCardsFragment) this.f20681b, (SdkDataWipeEvent) obj);
                break;
        }
    }
}
