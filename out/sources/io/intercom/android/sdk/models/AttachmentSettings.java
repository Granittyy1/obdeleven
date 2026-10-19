package io.intercom.android.sdk.models;

import C4.a;
import I7.b;
import androidx.compose.animation.D;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: AttachmentSettings.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AttachmentSettings {

    @b("conversation_camera_enabled")
    private final boolean cameraEnabled;

    @b("conversation_files_enabled")
    private final boolean filesEnabled;

    @b("conversation_gifs_enabled")
    private final boolean gifsEnabled;

    @b("conversation_media_enabled")
    private final boolean mediaEnabled;

    @b("file_upload_extension_trusted_list")
    private final Set<String> trustedFileExtensions;

    @b("upload_size_limit")
    private final long uploadSizeLimit;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final long DEFAULT_UPLOAD_SIZE_LIMIT = 104857600;
    private static final AttachmentSettings DEFAULT = new AttachmentSettings(true, true, true, true, EmptySet.f42985b, DEFAULT_UPLOAD_SIZE_LIMIT);

    /* JADX INFO: compiled from: AttachmentSettings.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final AttachmentSettings getDEFAULT() {
            return AttachmentSettings.DEFAULT;
        }

        private Companion() {
        }
    }

    public AttachmentSettings(boolean z10, boolean z11, boolean z12, boolean z13, Set<String> trustedFileExtensions, long j) {
        i.e(trustedFileExtensions, "trustedFileExtensions");
        this.cameraEnabled = z10;
        this.mediaEnabled = z11;
        this.filesEnabled = z12;
        this.gifsEnabled = z13;
        this.trustedFileExtensions = trustedFileExtensions;
        this.uploadSizeLimit = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AttachmentSettings copy$default(AttachmentSettings attachmentSettings, boolean z10, boolean z11, boolean z12, boolean z13, Set set, long j, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = attachmentSettings.cameraEnabled;
        }
        if ((i10 & 2) != 0) {
            z11 = attachmentSettings.mediaEnabled;
        }
        boolean z14 = z11;
        if ((i10 & 4) != 0) {
            z12 = attachmentSettings.filesEnabled;
        }
        boolean z15 = z12;
        if ((i10 & 8) != 0) {
            z13 = attachmentSettings.gifsEnabled;
        }
        boolean z16 = z13;
        if ((i10 & 16) != 0) {
            set = attachmentSettings.trustedFileExtensions;
        }
        Set set2 = set;
        if ((i10 & 32) != 0) {
            j = attachmentSettings.uploadSizeLimit;
        }
        return attachmentSettings.copy(z10, z14, z15, z16, set2, j);
    }

    public final boolean component1() {
        return this.cameraEnabled;
    }

    public final boolean component2() {
        return this.mediaEnabled;
    }

    public final boolean component3() {
        return this.filesEnabled;
    }

    public final boolean component4() {
        return this.gifsEnabled;
    }

    public final Set<String> component5() {
        return this.trustedFileExtensions;
    }

    public final long component6() {
        return this.uploadSizeLimit;
    }

    public final AttachmentSettings copy(boolean z10, boolean z11, boolean z12, boolean z13, Set<String> trustedFileExtensions, long j) {
        i.e(trustedFileExtensions, "trustedFileExtensions");
        return new AttachmentSettings(z10, z11, z12, z13, trustedFileExtensions, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachmentSettings)) {
            return false;
        }
        AttachmentSettings attachmentSettings = (AttachmentSettings) obj;
        return this.cameraEnabled == attachmentSettings.cameraEnabled && this.mediaEnabled == attachmentSettings.mediaEnabled && this.filesEnabled == attachmentSettings.filesEnabled && this.gifsEnabled == attachmentSettings.gifsEnabled && i.a(this.trustedFileExtensions, attachmentSettings.trustedFileExtensions) && this.uploadSizeLimit == attachmentSettings.uploadSizeLimit;
    }

    public final boolean getCameraEnabled() {
        return this.cameraEnabled;
    }

    public final boolean getFilesEnabled() {
        return this.filesEnabled;
    }

    public final boolean getGifsEnabled() {
        return this.gifsEnabled;
    }

    public final boolean getMediaEnabled() {
        return this.mediaEnabled;
    }

    public final Set<String> getTrustedFileExtensions() {
        return this.trustedFileExtensions;
    }

    public final long getUploadSizeLimit() {
        return this.uploadSizeLimit;
    }

    public final String getUploadSizeLimitMB() {
        return String.valueOf(this.uploadSizeLimit / ((long) 1048576));
    }

    public int hashCode() {
        return Long.hashCode(this.uploadSizeLimit) + ((this.trustedFileExtensions.hashCode() + D.b(D.b(D.b(Boolean.hashCode(this.cameraEnabled) * 31, 31, this.mediaEnabled), 31, this.filesEnabled), 31, this.gifsEnabled)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AttachmentSettings(cameraEnabled=");
        sb2.append(this.cameraEnabled);
        sb2.append(", mediaEnabled=");
        sb2.append(this.mediaEnabled);
        sb2.append(", filesEnabled=");
        sb2.append(this.filesEnabled);
        sb2.append(", gifsEnabled=");
        sb2.append(this.gifsEnabled);
        sb2.append(", trustedFileExtensions=");
        sb2.append(this.trustedFileExtensions);
        sb2.append(", uploadSizeLimit=");
        return a.h(sb2, this.uploadSizeLimit, ')');
    }
}
