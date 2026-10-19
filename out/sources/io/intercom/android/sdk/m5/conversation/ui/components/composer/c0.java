package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.lifecycle.InterfaceC1376t;
import io.intercom.android.sdk.m5.conversation.ui.components.row.QuickRepliesKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.QuickReply;
import java.util.List;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c0 implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f38696d;

    public /* synthetic */ c0(Object obj, int i10, Object obj2) {
        this.f38694b = i10;
        this.f38695c = obj;
        this.f38696d = obj2;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f38694b) {
            case 0:
                return VoiceInputLayoutKt.VoiceInputLayout_Denoh9s$lambda$6((InterfaceC1376t) this.f38695c, (SpeechRecognizerState) this.f38696d, (androidx.compose.runtime.B) obj);
            default:
                return QuickRepliesKt.ComposerSuggestions$lambda$9((List) this.f38695c, (Ia.l) this.f38696d, (QuickReply) obj);
        }
    }
}
