package io.intercom.android.sdk.m5.conversation.states;

import Z3.o;
import androidx.compose.animation.D;
import io.intercom.android.sdk.ui.component.MediaPickerButtonKt;
import java.util.Set;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import p293xa.d;

/* JADX INFO: compiled from: ConversationUiState.kt */
/* JADX INFO: loaded from: classes3.dex */
@d
public final class InputTypeState {
    private final boolean cameraInputEnabled;
    private final boolean fileInputEnabled;
    private final boolean gifInputEnabled;
    private final boolean mediaInputEnabled;
    private final Set<String> trustedFileExtensions;
    private final boolean voiceInputEnabled;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final InputTypeState DEFAULT = new InputTypeState(true, true, true, true, MediaPickerButtonKt.getDefaultTrustedFileExtensions(), false, 32, null);

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final InputTypeState getDEFAULT() {
            return InputTypeState.DEFAULT;
        }

        private Companion() {
        }
    }

    public InputTypeState(boolean z10, boolean z11, boolean z12, boolean z13, Set<String> trustedFileExtensions, boolean z14) {
        i.e(trustedFileExtensions, "trustedFileExtensions");
        this.mediaInputEnabled = z10;
        this.gifInputEnabled = z11;
        this.cameraInputEnabled = z12;
        this.fileInputEnabled = z13;
        this.trustedFileExtensions = trustedFileExtensions;
        this.voiceInputEnabled = z14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InputTypeState copy$default(InputTypeState inputTypeState, boolean z10, boolean z11, boolean z12, boolean z13, Set set, boolean z14, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = inputTypeState.mediaInputEnabled;
        }
        if ((i10 & 2) != 0) {
            z11 = inputTypeState.gifInputEnabled;
        }
        boolean z15 = z11;
        if ((i10 & 4) != 0) {
            z12 = inputTypeState.cameraInputEnabled;
        }
        boolean z16 = z12;
        if ((i10 & 8) != 0) {
            z13 = inputTypeState.fileInputEnabled;
        }
        boolean z17 = z13;
        if ((i10 & 16) != 0) {
            set = inputTypeState.trustedFileExtensions;
        }
        Set set2 = set;
        if ((i10 & 32) != 0) {
            z14 = inputTypeState.voiceInputEnabled;
        }
        return inputTypeState.copy(z10, z15, z16, z17, set2, z14);
    }

    public final boolean component1() {
        return this.mediaInputEnabled;
    }

    public final boolean component2() {
        return this.gifInputEnabled;
    }

    public final boolean component3() {
        return this.cameraInputEnabled;
    }

    public final boolean component4() {
        return this.fileInputEnabled;
    }

    public final Set<String> component5() {
        return this.trustedFileExtensions;
    }

    public final boolean component6() {
        return this.voiceInputEnabled;
    }

    public final InputTypeState copy(boolean z10, boolean z11, boolean z12, boolean z13, Set<String> trustedFileExtensions, boolean z14) {
        i.e(trustedFileExtensions, "trustedFileExtensions");
        return new InputTypeState(z10, z11, z12, z13, trustedFileExtensions, z14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputTypeState)) {
            return false;
        }
        InputTypeState inputTypeState = (InputTypeState) obj;
        return this.mediaInputEnabled == inputTypeState.mediaInputEnabled && this.gifInputEnabled == inputTypeState.gifInputEnabled && this.cameraInputEnabled == inputTypeState.cameraInputEnabled && this.fileInputEnabled == inputTypeState.fileInputEnabled && i.a(this.trustedFileExtensions, inputTypeState.trustedFileExtensions) && this.voiceInputEnabled == inputTypeState.voiceInputEnabled;
    }

    public final boolean getCameraInputEnabled() {
        return this.cameraInputEnabled;
    }

    public final boolean getFileInputEnabled() {
        return this.fileInputEnabled;
    }

    public final boolean getGifInputEnabled() {
        return this.gifInputEnabled;
    }

    public final boolean getMediaInputEnabled() {
        return this.mediaInputEnabled;
    }

    public final Set<String> getTrustedFileExtensions() {
        return this.trustedFileExtensions;
    }

    public final boolean getVoiceInputEnabled() {
        return this.voiceInputEnabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.voiceInputEnabled) + ((this.trustedFileExtensions.hashCode() + D.b(D.b(D.b(Boolean.hashCode(this.mediaInputEnabled) * 31, 31, this.gifInputEnabled), 31, this.cameraInputEnabled), 31, this.fileInputEnabled)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("InputTypeState(mediaInputEnabled=");
        sb2.append(this.mediaInputEnabled);
        sb2.append(", gifInputEnabled=");
        sb2.append(this.gifInputEnabled);
        sb2.append(", cameraInputEnabled=");
        sb2.append(this.cameraInputEnabled);
        sb2.append(", fileInputEnabled=");
        sb2.append(this.fileInputEnabled);
        sb2.append(", trustedFileExtensions=");
        sb2.append(this.trustedFileExtensions);
        sb2.append(", voiceInputEnabled=");
        return o.d(sb2, this.voiceInputEnabled, ')');
    }

    public /* synthetic */ InputTypeState(boolean z10, boolean z11, boolean z12, boolean z13, Set set, boolean z14, int i10, e eVar) {
        this(z10, z11, z12, z13, set, (i10 & 32) != 0 ? false : z14);
    }
}
