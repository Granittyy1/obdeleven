package io.intercom.android.sdk.survey.block;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.BlockAttachment;

/* JADX INFO: compiled from: AttachmentBlock.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$AttachmentBlockKt {
    public static final ComposableSingletons$AttachmentBlockKt INSTANCE = new ComposableSingletons$AttachmentBlockKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f233lambda1 = new ComposableLambdaImpl(false, -27709551, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.survey.block.ComposableSingletons$AttachmentBlockKt$lambda-1$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            Block blockBuild = new Block.Builder().withAttachments(M1.k(new BlockAttachment.Builder().withName("Attachment Name.type").build())).build();
            kotlin.jvm.internal.i.d(blockBuild, "build(...)");
            AttachmentBlockKt.AttachmentBlock(null, new BlockRenderData(blockBuild, null, null, null, null, 30, null), false, interfaceC1084f, 448, 1);
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m380getLambda1$intercom_sdk_base_release() {
        return f233lambda1;
    }
}
