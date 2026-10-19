package io.intercom.android.sdk.m5.helpcenter.states;

import B7.b;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: CollectionsUiEffects.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class CollectionsUiEffects {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: CollectionsUiEffects.kt */
    public static final class NavigateToCollectionContent extends CollectionsUiEffects {
        public static final int $stable = 0;
        private final String collectionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToCollectionContent(String collectionId) {
            super(null);
            i.e(collectionId, "collectionId");
            this.collectionId = collectionId;
        }

        public static /* synthetic */ NavigateToCollectionContent copy$default(NavigateToCollectionContent navigateToCollectionContent, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = navigateToCollectionContent.collectionId;
            }
            return navigateToCollectionContent.copy(str);
        }

        public final String component1() {
            return this.collectionId;
        }

        public final NavigateToCollectionContent copy(String collectionId) {
            i.e(collectionId, "collectionId");
            return new NavigateToCollectionContent(collectionId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NavigateToCollectionContent) && i.a(this.collectionId, ((NavigateToCollectionContent) obj).collectionId);
        }

        public final String getCollectionId() {
            return this.collectionId;
        }

        public int hashCode() {
            return this.collectionId.hashCode();
        }

        public String toString() {
            return b.g(new StringBuilder("NavigateToCollectionContent(collectionId="), this.collectionId, ')');
        }
    }

    public /* synthetic */ CollectionsUiEffects(e eVar) {
        this();
    }

    private CollectionsUiEffects() {
    }
}
