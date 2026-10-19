package io.intercom.android.sdk.m5.conversation.states;

import androidx.compose.animation.D;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.models.Part;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ConversationClientState.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class PendingMessage {
    public static final int $stable = 8;
    private final FailedImageUploadData failedImageUploadData;
    private final boolean isFailed;
    private final Part part;

    /* JADX INFO: compiled from: ConversationClientState.kt */
    public static final class FailedImageUploadData {
        public static final int $stable = 8;
        private final String clientAssignedUUID;
        private final MediaData.Media imageData;

        public FailedImageUploadData(String clientAssignedUUID, MediaData.Media imageData) {
            i.e(clientAssignedUUID, "clientAssignedUUID");
            i.e(imageData, "imageData");
            this.clientAssignedUUID = clientAssignedUUID;
            this.imageData = imageData;
        }

        public static /* synthetic */ FailedImageUploadData copy$default(FailedImageUploadData failedImageUploadData, String str, MediaData.Media media, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = failedImageUploadData.clientAssignedUUID;
            }
            if ((i10 & 2) != 0) {
                media = failedImageUploadData.imageData;
            }
            return failedImageUploadData.copy(str, media);
        }

        public final String component1() {
            return this.clientAssignedUUID;
        }

        public final MediaData.Media component2() {
            return this.imageData;
        }

        public final FailedImageUploadData copy(String clientAssignedUUID, MediaData.Media imageData) {
            i.e(clientAssignedUUID, "clientAssignedUUID");
            i.e(imageData, "imageData");
            return new FailedImageUploadData(clientAssignedUUID, imageData);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FailedImageUploadData)) {
                return false;
            }
            FailedImageUploadData failedImageUploadData = (FailedImageUploadData) obj;
            return i.a(this.clientAssignedUUID, failedImageUploadData.clientAssignedUUID) && i.a(this.imageData, failedImageUploadData.imageData);
        }

        public final String getClientAssignedUUID() {
            return this.clientAssignedUUID;
        }

        public final MediaData.Media getImageData() {
            return this.imageData;
        }

        public int hashCode() {
            return this.imageData.hashCode() + (this.clientAssignedUUID.hashCode() * 31);
        }

        public String toString() {
            return "FailedImageUploadData(clientAssignedUUID=" + this.clientAssignedUUID + ", imageData=" + this.imageData + ')';
        }
    }

    public PendingMessage(Part part, boolean z10, FailedImageUploadData failedImageUploadData) {
        i.e(part, "part");
        this.part = part;
        this.isFailed = z10;
        this.failedImageUploadData = failedImageUploadData;
    }

    public static /* synthetic */ PendingMessage copy$default(PendingMessage pendingMessage, Part part, boolean z10, FailedImageUploadData failedImageUploadData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            part = pendingMessage.part;
        }
        if ((i10 & 2) != 0) {
            z10 = pendingMessage.isFailed;
        }
        if ((i10 & 4) != 0) {
            failedImageUploadData = pendingMessage.failedImageUploadData;
        }
        return pendingMessage.copy(part, z10, failedImageUploadData);
    }

    public final Part component1() {
        return this.part;
    }

    public final boolean component2() {
        return this.isFailed;
    }

    public final FailedImageUploadData component3() {
        return this.failedImageUploadData;
    }

    public final PendingMessage copy(Part part, boolean z10, FailedImageUploadData failedImageUploadData) {
        i.e(part, "part");
        return new PendingMessage(part, z10, failedImageUploadData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PendingMessage)) {
            return false;
        }
        PendingMessage pendingMessage = (PendingMessage) obj;
        return i.a(this.part, pendingMessage.part) && this.isFailed == pendingMessage.isFailed && i.a(this.failedImageUploadData, pendingMessage.failedImageUploadData);
    }

    public final FailedImageUploadData getFailedImageUploadData() {
        return this.failedImageUploadData;
    }

    public final Part getPart() {
        return this.part;
    }

    public int hashCode() {
        int iB = D.b(this.part.hashCode() * 31, 31, this.isFailed);
        FailedImageUploadData failedImageUploadData = this.failedImageUploadData;
        return iB + (failedImageUploadData == null ? 0 : failedImageUploadData.hashCode());
    }

    public final boolean isFailed() {
        return this.isFailed;
    }

    public String toString() {
        return "PendingMessage(part=" + this.part + ", isFailed=" + this.isFailed + ", failedImageUploadData=" + this.failedImageUploadData + ')';
    }

    public /* synthetic */ PendingMessage(Part part, boolean z10, FailedImageUploadData failedImageUploadData, int i10, e eVar) {
        this(part, z10, (i10 & 4) != 0 ? null : failedImageUploadData);
    }
}
