package io.intercom.android.sdk.m5.conversation.states;

import B7.b;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ConversationUiEffect.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ConversationUiEffect {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: ConversationUiEffect.kt */
    public static final class ShowUploadSizeLimitDialog extends ConversationUiEffect {
        public static final int $stable = 0;
        private final String uploadSizeLimitMB;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowUploadSizeLimitDialog(String uploadSizeLimitMB) {
            super(null);
            i.e(uploadSizeLimitMB, "uploadSizeLimitMB");
            this.uploadSizeLimitMB = uploadSizeLimitMB;
        }

        public static /* synthetic */ ShowUploadSizeLimitDialog copy$default(ShowUploadSizeLimitDialog showUploadSizeLimitDialog, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = showUploadSizeLimitDialog.uploadSizeLimitMB;
            }
            return showUploadSizeLimitDialog.copy(str);
        }

        public final String component1() {
            return this.uploadSizeLimitMB;
        }

        public final ShowUploadSizeLimitDialog copy(String uploadSizeLimitMB) {
            i.e(uploadSizeLimitMB, "uploadSizeLimitMB");
            return new ShowUploadSizeLimitDialog(uploadSizeLimitMB);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowUploadSizeLimitDialog) && i.a(this.uploadSizeLimitMB, ((ShowUploadSizeLimitDialog) obj).uploadSizeLimitMB);
        }

        public final String getUploadSizeLimitMB() {
            return this.uploadSizeLimitMB;
        }

        public int hashCode() {
            return this.uploadSizeLimitMB.hashCode();
        }

        public String toString() {
            return b.g(new StringBuilder("ShowUploadSizeLimitDialog(uploadSizeLimitMB="), this.uploadSizeLimitMB, ')');
        }
    }

    public /* synthetic */ ConversationUiEffect(e eVar) {
        this();
    }

    private ConversationUiEffect() {
    }
}
