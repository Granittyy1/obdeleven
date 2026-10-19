package coil.decode;

import android.content.Context;
import android.graphics.ImageDecoder;
import androidx.compose.runtime.X;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputButtonKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.AskedAboutRowKt;
import java.io.IOException;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import p318zb.InterfaceC2841h;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22907d;

    public /* synthetic */ t(Object obj, int i10, Object obj2) {
        this.f22905b = i10;
        this.f22906c = obj;
        this.f22907d = obj2;
    }

    @Override // Ia.a
    public final Object invoke() throws IOException {
        switch (this.f22905b) {
            case 0:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.f22907d;
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ImageDecoderDecoder imageDecoderDecoder = (ImageDecoderDecoder) this.f22906c;
                x a10 = imageDecoderDecoder.f22864a;
                if (imageDecoderDecoder.f22866c) {
                    InterfaceC2841h interfaceC2841hI = a10.i();
                    if (interfaceC2841hI.c0(0L, k.f22891b) || interfaceC2841hI.c0(0L, k.f22890a)) {
                        a10 = new A(p318zb.v.b(new j(a10.i())), new y(0, imageDecoderDecoder.f22865b.f23098a), null);
                    }
                }
                try {
                    return ImageDecoder.decodeDrawable(imageDecoderDecoder.a(a10), new ImageDecoderDecoder.b(ref$ObjectRef, imageDecoderDecoder, ref$BooleanRef));
                } finally {
                    ImageDecoder imageDecoderA = q.a(ref$ObjectRef.element);
                    if (imageDecoderA != null) {
                        imageDecoderA.close();
                    }
                    a10.close();
                }
            case 1:
                return CameraInputButtonKt.CameraInputButton$lambda$11((Context) this.f22906c, (X) this.f22907d);
            default:
                return AskedAboutRowKt.AskedAboutRow$lambda$2$lambda$1$lambda$0((Context) this.f22906c, (Block) this.f22907d);
        }
    }
}
