package com.braze.ui.contentcards.managers;

import com.braze.ui.contentcards.listeners.DefaultContentCardsActionListener;
import com.braze.ui.contentcards.listeners.IContentCardsActionListener;
import kotlin.a;
import kotlin.jvm.internal.e;
import p293xa.g;

/* JADX INFO: compiled from: BrazeContentCardsManager.kt */
/* JADX INFO: loaded from: classes.dex */
public class BrazeContentCardsManager {
    public static final Companion Companion = new Companion(null);
    private static final g<BrazeContentCardsManager> instance$delegate = a.a(new Ia.a<BrazeContentCardsManager>() { // from class: com.braze.ui.contentcards.managers.BrazeContentCardsManager$Companion$instance$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // Ia.a
        public final BrazeContentCardsManager invoke() {
            return new BrazeContentCardsManager();
        }
    });
    private IContentCardsActionListener contentCardsActionListener = new DefaultContentCardsActionListener();

    /* JADX INFO: compiled from: BrazeContentCardsManager.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final BrazeContentCardsManager getInstance() {
            return (BrazeContentCardsManager) BrazeContentCardsManager.instance$delegate.getValue();
        }

        private Companion() {
        }

        public static /* synthetic */ void getInstance$annotations() {
        }
    }

    public static final BrazeContentCardsManager getInstance() {
        return Companion.getInstance();
    }

    public final IContentCardsActionListener getContentCardsActionListener() {
        return this.contentCardsActionListener;
    }

    public final void setContentCardsActionListener(IContentCardsActionListener iContentCardsActionListener) {
        if (iContentCardsActionListener == null) {
            iContentCardsActionListener = new DefaultContentCardsActionListener();
        }
        this.contentCardsActionListener = iContentCardsActionListener;
    }
}
