package io.intercom.android.sdk.tickets.create.ui;

import androidx.compose.foundation.layout.W;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.block.BlockRenderData;

/* JADX INFO: compiled from: CreateTicketCard.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$CreateTicketCardKt {
    public static final ComposableSingletons$CreateTicketCardKt INSTANCE = new ComposableSingletons$CreateTicketCardKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f303lambda1 = new ComposableLambdaImpl(false, -1627499370, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.tickets.create.ui.ComposableSingletons$CreateTicketCardKt$lambda-1$1
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
            androidx.compose.ui.h hVarD = W.d(androidx.compose.ui.h.a.f13984b, 1.0f);
            Block block = CreateTicketCardKt.sampleBlock;
            kotlin.jvm.internal.i.d(block, "access$getSampleBlock$p(...)");
            CreateTicketCardKt.CreateTicketCard(hVarD, new BlockRenderData(block, null, null, null, null, 30, null), true, null, interfaceC1084f, 454, 8);
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f304lambda2 = new ComposableLambdaImpl(false, -1398017791, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.tickets.create.ui.ComposableSingletons$CreateTicketCardKt$lambda-2$1
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
            androidx.compose.ui.h hVarD = W.d(androidx.compose.ui.h.a.f13984b, 1.0f);
            Block block = CreateTicketCardKt.sampleBlock;
            kotlin.jvm.internal.i.d(block, "access$getSampleBlock$p(...)");
            CreateTicketCardKt.CreateTicketCard(hVarD, new BlockRenderData(block, null, null, null, null, 30, null), false, null, interfaceC1084f, 454, 8);
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m482getLambda1$intercom_sdk_base_release() {
        return f303lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m483getLambda2$intercom_sdk_base_release() {
        return f304lambda2;
    }
}
