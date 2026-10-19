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
import p270w.f;
import p270w.g;

/* JADX INFO: compiled from: CutAvatarWithIndicatorShape.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CutAvatarWithIndicatorShape implements l0 {
    public static final int $stable = 0;
    private final float indicatorSize;
    private final l0 shape;

    /* JADX INFO: compiled from: CutAvatarWithIndicatorShape.kt */
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

    public /* synthetic */ CutAvatarWithIndicatorShape(l0 l0Var, float f10, e eVar) {
        this(l0Var, f10);
    }

    /* JADX INFO: renamed from: getOffset-XPhi94U, reason: not valid java name */
    private final long m346getOffsetXPhi94U(long j, float f10, float f11, float f12, LayoutDirection layoutDirection) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        int i10 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i10 == 1) {
            jFloatToRawIntBits = Float.floatToRawIntBits((Float.intBitsToFloat((int) (j >> 32)) - f10) + f11);
            iFloatToRawIntBits = Float.floatToRawIntBits(f12);
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f - f11);
            iFloatToRawIntBits = Float.floatToRawIntBits(f12);
        }
        return (jFloatToRawIntBits << 32) | (((long) iFloatToRawIntBits) & 4294967295L);
    }

    @Override // androidx.compose.ui.graphics.l0
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public b0 mo0createOutlinePq9zytI(long j, LayoutDirection layoutDirection, c density) {
        i.e(layoutDirection, "layoutDirection");
        i.e(density, "density");
        float f10 = 2;
        float fT0 = density.T0(f10);
        float fT1 = (f10 * fT0) + density.T0(this.indicatorSize);
        f fVar = g.f47680a;
        C1144u c1144uA = C1146w.a();
        c0.a(c1144uA, this.shape.mo0createOutlinePq9zytI(j, layoutDirection, density));
        C1144u c1144uA2 = C1146w.a();
        c0.a(c1144uA2, fVar.mo0createOutlinePq9zytI((((long) Float.floatToRawIntBits(fT1)) << 32) | (((long) Float.floatToRawIntBits(fT1)) & 4294967295L), layoutDirection, density));
        C1144u c1144uA3 = C1146w.a();
        c1144uA3.s(c1144uA2, m346getOffsetXPhi94U(j, fT1, fT0, (Float.intBitsToFloat((int) (j & 4294967295L)) - fT1) + fT0, layoutDirection));
        C1144u c1144uA4 = C1146w.a();
        c1144uA4.p(c1144uA, c1144uA3, 0);
        return new b0.a(c1144uA4);
    }

    private CutAvatarWithIndicatorShape(l0 shape, float f10) {
        i.e(shape, "shape");
        this.shape = shape;
        this.indicatorSize = f10;
    }
}
