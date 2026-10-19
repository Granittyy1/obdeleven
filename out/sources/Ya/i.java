package Ya;

import android.net.Uri;
import android.os.Bundle;
import androidx.compose.runtime.X;
import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import io.intercom.android.sdk.m5.conversation.ui.components.MediaInputSheetContentKt;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposerInputType;
import io.intercom.android.sdk.m5.home.ui.components.WrapReportingTextKt;
import java.util.Map;
import p293xa.r;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7649c;

    public /* synthetic */ i(int i10, Object obj) {
        this.f7648b = i10;
        this.f7649c = obj;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f7648b) {
            case 0:
                p011ab.a buildSerialDescriptor = (p011ab.a) obj;
                kotlin.jvm.internal.i.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
                for (Map.Entry entry : ((j) this.f7649c).f7654e.entrySet()) {
                    p011ab.a.b(buildSerialDescriptor, (String) entry.getKey(), ((b) entry.getValue()).getDescriptor());
                }
                return r.f47939a;
            case 1:
                return ConversationScreenKt.ConversationScreen$lambda$23((ConversationViewModel) this.f7649c, (ComposerInputType) obj);
            case 2:
                return MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$1$lambda$0((Ia.l) this.f7649c, (Uri) obj);
            case 3:
                return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$3$lambda$2((X) this.f7649c, (J.c) obj);
            default:
                String key = (String) obj;
                kotlin.jvm.internal.i.e(key, "key");
                Bundle source = (Bundle) this.f7649c;
                kotlin.jvm.internal.i.e(source, "source");
                return Boolean.valueOf(!source.containsKey(key));
        }
    }
}
