package io.intercom.android.sdk.blocks.lib.models;

import io.intercom.android.sdk.models.carousel.Appearance;

/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_BlockMetadata extends BlockMetadata {
    private final Appearance appearance;
    private final boolean firstObject;
    private final boolean lastObject;

    public AutoValue_BlockMetadata(boolean z10, boolean z11, Appearance appearance) {
        this.firstObject = z10;
        this.lastObject = z11;
        if (appearance == null) {
            throw new NullPointerException("Null appearance");
        }
        this.appearance = appearance;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BlockMetadata)) {
            return false;
        }
        BlockMetadata blockMetadata = (BlockMetadata) obj;
        return this.firstObject == blockMetadata.isFirstObject() && this.lastObject == blockMetadata.isLastObject() && this.appearance.equals(blockMetadata.getAppearance());
    }

    @Override // io.intercom.android.sdk.blocks.lib.models.BlockMetadata
    public Appearance getAppearance() {
        return this.appearance;
    }

    public int hashCode() {
        return (((((this.firstObject ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.lastObject ? 1231 : 1237)) * 1000003) ^ this.appearance.hashCode();
    }

    @Override // io.intercom.android.sdk.blocks.lib.models.BlockMetadata
    public boolean isFirstObject() {
        return this.firstObject;
    }

    @Override // io.intercom.android.sdk.blocks.lib.models.BlockMetadata
    public boolean isLastObject() {
        return this.lastObject;
    }

    public String toString() {
        return "BlockMetadata{firstObject=" + this.firstObject + ", lastObject=" + this.lastObject + ", appearance=" + this.appearance + "}";
    }
}
