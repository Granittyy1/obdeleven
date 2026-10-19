package io.intercom.android.sdk.m5.push;

import io.intercom.android.sdk.models.AttributeType;
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
public /* synthetic */ class IntercomPushData$ConversationPushData$MessageData$Text$$serializer implements D<IntercomPushData.ConversationPushData.MessageData.Text> {
    public static final int $stable;
    public static final IntercomPushData$ConversationPushData$MessageData$Text$$serializer INSTANCE;
    private static final e descriptor;

    static {
        IntercomPushData$ConversationPushData$MessageData$Text$$serializer intercomPushData$ConversationPushData$MessageData$Text$$serializer = new IntercomPushData$ConversationPushData$MessageData$Text$$serializer();
        INSTANCE = intercomPushData$ConversationPushData$MessageData$Text$$serializer;
        $stable = 8;
        C1536l0 c1536l0 = new C1536l0(AttributeType.TEXT, intercomPushData$ConversationPushData$MessageData$Text$$serializer, 1);
        c1536l0.k("message", false);
        descriptor = c1536l0;
    }

    private IntercomPushData$ConversationPushData$MessageData$Text$$serializer() {
    }

    @Override // p037cb.D
    public final Ya.b<?>[] childSerializers() {
        return new Ya.b[]{y0.f22677a};
    }

    @Override // Ya.a
    public final IntercomPushData.ConversationPushData.MessageData.Text deserialize(p024bb.c decoder) {
        i.e(decoder, "decoder");
        e eVar = descriptor;
        p024bb.a aVarA = decoder.a(eVar);
        boolean z10 = true;
        int i10 = 0;
        String strJ = null;
        while (z10) {
            int iO = aVarA.o(eVar);
            if (iO == -1) {
                z10 = false;
            } else {
                if (iO != 0) {
                    throw new UnknownFieldException(iO);
                }
                strJ = aVarA.j(eVar, 0);
                i10 = 1;
            }
        }
        aVarA.c(eVar);
        return new IntercomPushData.ConversationPushData.MessageData.Text(i10, strJ, null);
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return descriptor;
    }

    @Override // Ya.l
    public final void serialize(p024bb.d encoder, IntercomPushData.ConversationPushData.MessageData.Text value) {
        i.e(encoder, "encoder");
        i.e(value, "value");
        e eVar = descriptor;
        p024bb.b bVarA = encoder.a(eVar);
        bVarA.p(eVar, 0, value.message);
        bVarA.c(eVar);
    }

    @Override // p037cb.D
    public Ya.b<?>[] typeParametersSerializers() {
        return C1538m0.f22638a;
    }
}
