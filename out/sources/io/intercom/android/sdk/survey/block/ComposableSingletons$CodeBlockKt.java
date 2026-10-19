package io.intercom.android.sdk.survey.block;

import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;

/* JADX INFO: compiled from: CodeBlock.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$CodeBlockKt {
    public static final ComposableSingletons$CodeBlockKt INSTANCE = new ComposableSingletons$CodeBlockKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f234lambda1 = new ComposableLambdaImpl(false, 1197398742, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.survey.block.ComposableSingletons$CodeBlockKt$lambda-1$1
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
            Block blockBuild = new Block.Builder().withText("This is some code").withType(BlockType.CODE.getSerializedName()).build();
            kotlin.jvm.internal.i.d(blockBuild, "build(...)");
            CodeBlockKt.CodeBlock(blockBuild, null, null, interfaceC1084f, 8, 6);
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f235lambda2 = new ComposableLambdaImpl(false, 1026238161, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.survey.block.ComposableSingletons$CodeBlockKt$lambda-2$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                SurfaceKt.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$CodeBlockKt.INSTANCE.m381getLambda1$intercom_sdk_base_release(), interfaceC1084f, 12582912, 127);
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m381getLambda1$intercom_sdk_base_release() {
        return f234lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m382getLambda2$intercom_sdk_base_release() {
        return f235lambda2;
    }
}
