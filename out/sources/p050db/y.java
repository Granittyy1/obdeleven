package p050db;

import Ia.l;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.SpeechRecognizerState;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.VoiceInputLayoutKt;
import io.intercom.android.sdk.m5.navigation.MessagesDestinationKt;
import io.intercom.android.sdk.m5.navigation.TicketsDestinationKt;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlinx.serialization.json.internal.B;
import p141l2.C2748s;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f34698b;

    public /* synthetic */ y(int i10) {
        this.f34698b = i10;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f34698b) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                i.e(entry, "<destruct>");
                String str = (String) entry.getKey();
                h hVar = (h) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                B.a(sb2, str);
                sb2.append(':');
                sb2.append(hVar);
                String string = sb2.toString();
                i.d(string, "toString(...)");
                return string;
            case 1:
                return VoiceInputLayoutKt.rememberSpeechRecognizerState$lambda$17((SpeechRecognizerState.SpeechState) obj);
            case 2:
                return MessagesDestinationKt.messagesDestination$lambda$0((C2748s) obj);
            default:
                return TicketsDestinationKt.ticketsDestination$lambda$1((C2748s) obj);
        }
    }
}
