package bo.app;

import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.ui.contentcards.ContentCardsFragment;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class X implements IEventSubscriber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20679b;

    public /* synthetic */ X(int i10, Object obj) {
        this.f20678a = i10;
        this.f20679b = obj;
    }

    @Override // com.braze.events.IEventSubscriber
    public final void trigger(Object obj) {
        switch (this.f20678a) {
            case 0:
                C1474l.a((C1474l) this.f20679b, (u5) obj);
                break;
            default:
                ContentCardsFragment.onResume$lambda$0((ContentCardsFragment) this.f20679b, (ContentCardsUpdatedEvent) obj);
                break;
        }
    }
}
