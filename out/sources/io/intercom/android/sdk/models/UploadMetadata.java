package io.intercom.android.sdk.models;

import I7.b;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: UploadMetadata.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class UploadMetadata {
    public static final int $stable = 0;

    @b("safe_app_id")
    private final String safeAppId;

    /* JADX WARN: Multi-variable type inference failed */
    public UploadMetadata() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ UploadMetadata copy$default(UploadMetadata uploadMetadata, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = uploadMetadata.safeAppId;
        }
        return uploadMetadata.copy(str);
    }

    public final String component1() {
        return this.safeAppId;
    }

    public final UploadMetadata copy(String safeAppId) {
        i.e(safeAppId, "safeAppId");
        return new UploadMetadata(safeAppId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UploadMetadata) && i.a(this.safeAppId, ((UploadMetadata) obj).safeAppId);
    }

    public final String getSafeAppId() {
        return this.safeAppId;
    }

    public int hashCode() {
        return this.safeAppId.hashCode();
    }

    public String toString() {
        return B7.b.g(new StringBuilder("UploadMetadata(safeAppId="), this.safeAppId, ')');
    }

    public UploadMetadata(String safeAppId) {
        i.e(safeAppId, "safeAppId");
        this.safeAppId = safeAppId;
    }

    public /* synthetic */ UploadMetadata(String str, int i10, e eVar) {
        this((i10 & 1) != 0 ? "" : str);
    }
}
