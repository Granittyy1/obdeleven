package io.intercom.android.sdk.m5.shapes;

import androidx.compose.ui.graphics.C1144u;
import androidx.compose.ui.graphics.C1146w;
import androidx.compose.ui.graphics.b0;
import androidx.compose.ui.graphics.c0;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import p013b0.c;
import p270w.g;

/* JADX INFO: compiled from: CutIconWithIndicatorShape.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CutIconWithIndicatorShape implements l0 {
    public static final int $stable = 0;
    private final float indicatorSize;

    /* JADX INFO: compiled from: CutIconWithIndicatorShape.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                LayoutDirection layoutDirection = LayoutDirection.f15717b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LayoutDirection layoutDirection2 = LayoutDirection.f15717b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ CutIconWithIndicatorShape(float f10, e eVar) {
        this(f10);
    }

    /* JADX INFO: renamed from: getOffset-P-0qjgQ, reason: not valid java name */
    private final long m347getOffsetP0qjgQ(float f10, float f11, LayoutDirection layoutDirection) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        int i10 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i10 == 1) {
            jFloatToRawIntBits = Float.floatToRawIntBits(f10 - f11);
            iFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            iFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
        }
        return (jFloatToRawIntBits << 32) | (((long) iFloatToRawIntBits) & 4294967295L);
    }

    @Override // androidx.compose.ui.graphics.l0
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public b0 mo0createOutlinePq9zytI(long j, LayoutDirection layoutDirection, c density) {
        i.e(layoutDirection, "layoutDirection");
        i.e(density, "density");
        float fT0 = density.T0(this.indicatorSize);
        C1144u c1144uA = C1146w.a();
        c0.a(c1144uA, new b0.b(p111ia.c.a(0L, j)));
        C1144u c1144uA2 = C1146w.a();
        c0.a(c1144uA2, g.f47680a.mo0createOutlinePq9zytI((((long) Float.floatToRawIntBits(fT0)) << 32) | (((long) Float.floatToRawIntBits(fT0)) & 4294967295L), layoutDirection, density));
        C1144u c1144uA3 = C1146w.a();
        c1144uA3.s(c1144uA2, m347getOffsetP0qjgQ(Float.intBitsToFloat((int) (j >> 32)), fT0, layoutDirection));
        C1144u c1144uA4 = C1146w.a();
        c1144uA4.p(c1144uA, c1144uA3, 0);
        return new b0.a(c1144uA4);
    }

    private CutIconWithIndicatorShape(float f10) {
        this.indicatorSize = f10;
    }

    public CutIconWithIndicatorShape(float f10, int i10, e eVar) {
        this((i10 & 1) != 0 ? 8 : f10, null);
    }
}
