package io.intercom.android.sdk.survey.block;

import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.models.carousel.BlockAlignment;

/* JADX INFO: compiled from: TextBlock.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$TextBlockKt {
    public static final ComposableSingletons$TextBlockKt INSTANCE = new ComposableSingletons$TextBlockKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f240lambda1 = new ComposableLambdaImpl(false, -222161121, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.survey.block.ComposableSingletons$TextBlockKt$lambda-1$1
        private static final Block invoke$lambda$0$buildBlock(String str, String str2) {
            return new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withAlign(str).withText(str2).build();
        }

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
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            androidx.compose.ui.h hVarD = W.d(aVar, 1.0f);
            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f, 0);
            int iF = interfaceC1084f.F();
            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f.z();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f, hVarD);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
            if (interfaceC1084f.u() == null) {
                I.b.k();
                throw null;
            }
            interfaceC1084f.r();
            if (interfaceC1084f.m()) {
                interfaceC1084f.v(aVar2);
            } else {
                interfaceC1084f.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f, c0953mA);
            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f, interfaceC1089h0Z);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
            if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF))) {
                androidx.compose.animation.k.b(iF, interfaceC1084f, iF, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f, hVarC);
            Block blockInvoke$lambda$0$buildBlock = invoke$lambda$0$buildBlock(BlockAlignment.LEFT, "Left");
            kotlin.jvm.internal.i.d(blockInvoke$lambda$0$buildBlock, "invoke$lambda$0$buildBlock(...)");
            TextBlockKt.TextBlock(W.d(aVar, 1.0f), new BlockRenderData(blockInvoke$lambda$0$buildBlock, null, null, null, null, 30, null), null, null, false, null, interfaceC1084f, 70, 60);
            Block blockInvoke$lambda$0$buildBlock2 = invoke$lambda$0$buildBlock("center", "Center");
            kotlin.jvm.internal.i.d(blockInvoke$lambda$0$buildBlock2, "invoke$lambda$0$buildBlock(...)");
            TextBlockKt.TextBlock(W.d(aVar, 1.0f), new BlockRenderData(blockInvoke$lambda$0$buildBlock2, null, null, null, null, 30, null), null, null, false, null, interfaceC1084f, 70, 60);
            Block blockInvoke$lambda$0$buildBlock3 = invoke$lambda$0$buildBlock(BlockAlignment.RIGHT, "Right");
            kotlin.jvm.internal.i.d(blockInvoke$lambda$0$buildBlock3, "invoke$lambda$0$buildBlock(...)");
            TextBlockKt.TextBlock(W.d(aVar, 1.0f), new BlockRenderData(blockInvoke$lambda$0$buildBlock3, null, null, null, null, 30, null), null, null, false, null, interfaceC1084f, 70, 60);
            interfaceC1084f.J();
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f241lambda2 = new ComposableLambdaImpl(false, -895740540, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.survey.block.ComposableSingletons$TextBlockKt$lambda-2$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                SurfaceKt.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$TextBlockKt.INSTANCE.m387getLambda1$intercom_sdk_base_release(), interfaceC1084f, 12582912, 127);
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m387getLambda1$intercom_sdk_base_release() {
        return f240lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m388getLambda2$intercom_sdk_base_release() {
        return f241lambda2;
    }
}
