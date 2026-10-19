package io.intercom.android.sdk.ui.component;

/* JADX INFO: compiled from: MediaPickerButton.kt */
/* JADX INFO: loaded from: classes.dex */
public enum MediaType {
    ImageOnly,
    VideOnly,
    DocumentOnly,
    ImageAndVideo,
    All;

    private static final /* synthetic */ Ba.a $ENTRIES = kotlin.enums.a.a(values());

    public static Ba.a<MediaType> getEntries() {
        return $ENTRIES;
    }
}
