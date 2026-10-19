package io.intercom.android.sdk.m5.push;

import com.braze.Constants;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import kotlin.jvm.internal.i;
import kotlinx.serialization.UnknownFieldException;
import p011ab.e;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p037cb.y0;

/* JADX INFO: compiled from: IntercomPushData.kt */
/* JADX INFO: loaded from: classes3.dex */
@p293xa.d
public /* synthetic */ class IntercomPushData$ConversationPushData$MessageData$Image$$serializer implements D<IntercomPushData.ConversationPushData.MessageData.Image> {
    public static final int $stable;
    public static final IntercomPushData$ConversationPushData$MessageData$Image$$serializer INSTANCE;
    private static final e descriptor;

    static {
        IntercomPushData$ConversationPushData$MessageData$Image$$serializer intercomPushData$ConversationPushData$MessageData$Image$$serializer = new IntercomPushData$ConversationPushData$MessageData$Image$$serializer();
        INSTANCE = intercomPushData$ConversationPushData$MessageData$Image$$serializer;
        $stable = 8;
        C1536l0 c1536l0 = new C1536l0(AppearanceType.IMAGE, intercomPushData$ConversationPushData$MessageData$Image$$serializer, 2);
        c1536l0.k("title", false);
        c1536l0.k(Constants.BRAZE_WEBVIEW_URL_EXTRA, false);
        descriptor = c1536l0;
    }

    private IntercomPushData$ConversationPushData$MessageData$Image$$serializer() {
    }

    @Override // p037cb.D
    public final Ya.b<?>[] childSerializers() {
        y0 y0Var = y0.f22677a;
        return new Ya.b[]{y0Var, y0Var};
    }

    @Override // Ya.a
    public final IntercomPushData.ConversationPushData.MessageData.Image deserialize(p024bb.c decoder) {
        i.e(decoder, "decoder");
        e eVar = descriptor;
        p024bb.a aVarA = decoder.a(eVar);
        boolean z10 = true;
        int i10 = 0;
        String strJ = null;
        String strJ2 = null;
        while (z10) {
            int iO = aVarA.o(eVar);
            if (iO == -1) {
                z10 = false;
            } else if (iO == 0) {
                strJ = aVarA.j(eVar, 0);
                i10 |= 1;
            } else {
                if (iO != 1) {
                    throw new UnknownFieldException(iO);
                }
                strJ2 = aVarA.j(eVar, 1);
                i10 |= 2;
            }
        }
        aVarA.c(eVar);
        return new IntercomPushData.ConversationPushData.MessageData.Image(i10, strJ, strJ2, null);
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return descriptor;
    }

    @Override // Ya.l
    public final void serialize(p024bb.d encoder, IntercomPushData.ConversationPushData.MessageData.Image value) {
        i.e(encoder, "encoder");
        i.e(value, "value");
        e eVar = descriptor;
        p024bb.b bVarA = encoder.a(eVar);
        IntercomPushData.ConversationPushData.MessageData.Image.write$Self$intercom_sdk_base_release(value, bVarA, eVar);
        bVarA.c(eVar);
    }

    @Override // p037cb.D
    public Ya.b<?>[] typeParametersSerializers() {
        return C1538m0.f22638a;
    }
}
