package bo.app;

import com.braze.models.cards.Card;
import com.braze.ui.contentcards.handlers.DefaultContentCardsUpdateHandler;
import java.util.Comparator;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class H0 implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20663b;

    public /* synthetic */ H0(int i10) {
        this.f20663b = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f20663b) {
            case 0:
                return v6.a((c3) obj, (c3) obj2);
            default:
                return DefaultContentCardsUpdateHandler.handleCardUpdate$lambda$0((Card) obj, (Card) obj2);
        }
    }
}
