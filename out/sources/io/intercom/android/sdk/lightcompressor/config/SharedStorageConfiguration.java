package io.intercom.android.sdk.lightcompressor.config;

import B7.b;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: Configuration.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SharedStorageConfiguration {
    private SaveLocation saveAt;
    private String subFolderName;

    /* JADX WARN: Multi-variable type inference failed */
    public SharedStorageConfiguration() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SharedStorageConfiguration copy$default(SharedStorageConfiguration sharedStorageConfiguration, SaveLocation saveLocation, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            saveLocation = sharedStorageConfiguration.saveAt;
        }
        if ((i10 & 2) != 0) {
            str = sharedStorageConfiguration.subFolderName;
        }
        return sharedStorageConfiguration.copy(saveLocation, str);
    }

    public final SaveLocation component1() {
        return this.saveAt;
    }

    public final String component2() {
        return this.subFolderName;
    }

    public final SharedStorageConfiguration copy(SaveLocation saveLocation, String str) {
        return new SharedStorageConfiguration(saveLocation, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedStorageConfiguration)) {
            return false;
        }
        SharedStorageConfiguration sharedStorageConfiguration = (SharedStorageConfiguration) obj;
        return this.saveAt == sharedStorageConfiguration.saveAt && i.a(this.subFolderName, sharedStorageConfiguration.subFolderName);
    }

    public final SaveLocation getSaveAt() {
        return this.saveAt;
    }

    public final String getSubFolderName() {
        return this.subFolderName;
    }

    public int hashCode() {
        SaveLocation saveLocation = this.saveAt;
        int iHashCode = (saveLocation == null ? 0 : saveLocation.hashCode()) * 31;
        String str = this.subFolderName;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setSaveAt(SaveLocation saveLocation) {
        this.saveAt = saveLocation;
    }

    public final void setSubFolderName(String str) {
        this.subFolderName = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SharedStorageConfiguration(saveAt=");
        sb2.append(this.saveAt);
        sb2.append(", subFolderName=");
        return b.g(sb2, this.subFolderName, ')');
    }

    public SharedStorageConfiguration(SaveLocation saveLocation, String str) {
        this.saveAt = saveLocation;
        this.subFolderName = str;
    }

    public /* synthetic */ SharedStorageConfiguration(SaveLocation saveLocation, String str, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : saveLocation, (i10 & 2) != 0 ? null : str);
    }
}
