package com.braze.storage;

/* JADX INFO: loaded from: classes.dex */
public interface ICardStorageProvider<T> {
    T getCachedCardsAsEvent();

    void markCardAsClicked(String str);

    void markCardAsDismissed(String str);

    void markCardAsViewed(String str);

    void markCardAsVisuallyRead(String str);
}
