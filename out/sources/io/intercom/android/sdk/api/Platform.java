package io.intercom.android.sdk.api;

/* JADX INFO: compiled from: PlatformIdentifierUtil.kt */
/* JADX INFO: loaded from: classes3.dex */
public enum Platform {
    Cordova(PlatformIdentifierUtilKt.CORDOVA_HEADER),
    ReactNative(PlatformIdentifierUtilKt.REACT_NATIVE_HEADER),
    Flutter(PlatformIdentifierUtilKt.FLUTTER_HEADER),
    Native(PlatformIdentifierUtilKt.NATIVE_SDK);

    private static final /* synthetic */ Ba.a $ENTRIES = kotlin.enums.a.a(values());
    private final String identifier;

    Platform(String str) {
        this.identifier = str;
    }

    public static Ba.a<Platform> getEntries() {
        return $ENTRIES;
    }

    public final String getIdentifier() {
        return this.identifier;
    }
}
