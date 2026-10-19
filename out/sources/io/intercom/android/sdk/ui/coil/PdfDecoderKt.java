package io.intercom.android.sdk.ui.coil;

import Ia.a;
import Z2.e;
import coil.size.Scale;
import com.braze.support.BrazeLogger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: PdfDecoder.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PdfDecoderKt {

    /* JADX INFO: compiled from: PdfDecoder.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Scale.values().length];
            try {
                Scale scale = Scale.f23143b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Scale scale2 = Scale.f23143b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final int heightPx(e eVar, Scale scale, a<Integer> aVar) {
        return i.a(eVar, e.f7731c) ? aVar.invoke().intValue() : toPx(eVar.f7733b, scale);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int toPx(Z2.a aVar, Scale scale) {
        if (aVar instanceof Z2.a.C0110a) {
            return ((Z2.a.C0110a) aVar).f7725a;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[scale.ordinal()];
        if (i10 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i10 == 2) {
            return BrazeLogger.SUPPRESS;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final int widthPx(e eVar, Scale scale, a<Integer> aVar) {
        return i.a(eVar, e.f7731c) ? aVar.invoke().intValue() : toPx(eVar.f7732a, scale);
    }
}
