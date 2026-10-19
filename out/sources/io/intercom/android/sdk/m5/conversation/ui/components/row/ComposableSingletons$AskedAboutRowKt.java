package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.blocks.lib.models.Author;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.models.Part;

/* JADX INFO: compiled from: AskedAboutRow.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$AskedAboutRowKt {
    public static final ComposableSingletons$AskedAboutRowKt INSTANCE = new ComposableSingletons$AskedAboutRowKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f126lambda1 = new ComposableLambdaImpl(false, 92020354, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$AskedAboutRowKt$lambda-1$1
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
            Part partBuild = new Part.Builder().withBlocks(M1.k(new Block.Builder().withArticleId("123").withTitle("Article Title Goes Here").withAuthor(new Author.Builder().withName("Namey McNameface").withAvatar("https://www.google.com").build()))).build();
            kotlin.jvm.internal.i.d(partBuild, "build(...)");
            AskedAboutRowKt.AskedAboutRow(null, partBuild, interfaceC1084f, 64, 1);
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f127lambda2 = new ComposableLambdaImpl(false, 851703911, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$AskedAboutRowKt$lambda-2$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                SurfaceKt.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$AskedAboutRowKt.INSTANCE.m212getLambda1$intercom_sdk_base_release(), interfaceC1084f, 12582912, 127);
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m212getLambda1$intercom_sdk_base_release() {
        return f126lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m213getLambda2$intercom_sdk_base_release() {
        return f127lambda2;
    }
}
