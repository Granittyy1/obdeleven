package io.intercom.android.sdk.lightcompressor.config;

import B7.b;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: Configuration.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AppSpecificStorageConfiguration {
    private String subFolderName;

    /* JADX WARN: Multi-variable type inference failed */
    public AppSpecificStorageConfiguration() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AppSpecificStorageConfiguration copy$default(AppSpecificStorageConfiguration appSpecificStorageConfiguration, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = appSpecificStorageConfiguration.subFolderName;
        }
        return appSpecificStorageConfiguration.copy(str);
    }

    public final String component1() {
        return this.subFolderName;
    }

    public final AppSpecificStorageConfiguration copy(String str) {
        return new AppSpecificStorageConfiguration(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppSpecificStorageConfiguration) && i.a(this.subFolderName, ((AppSpecificStorageConfiguration) obj).subFolderName);
    }

    public final String getSubFolderName() {
        return this.subFolderName;
    }

    public int hashCode() {
        String str = this.subFolderName;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setSubFolderName(String str) {
        this.subFolderName = str;
    }

    public String toString() {
        return b.g(new StringBuilder("AppSpecificStorageConfiguration(subFolderName="), this.subFolderName, ')');
    }

    public AppSpecificStorageConfiguration(String str) {
        this.subFolderName = str;
    }

    public /* synthetic */ AppSpecificStorageConfiguration(String str, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : str);
    }
}
