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

/* JADX INFO: compiled from: OverlappedAvatarShape.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class OverlappedAvatarShape implements l0 {
    public static final int $stable = 0;
    private final l0 currentAvatarShape;
    private final float cut;
    private final l0 previousAvatarShape;

    /* JADX INFO: compiled from: OverlappedAvatarShape.kt */
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

    public /* synthetic */ OverlappedAvatarShape(l0 l0Var, l0 l0Var2, float f10, e eVar) {
        this(l0Var, l0Var2, f10);
    }

    /* JADX INFO: renamed from: getOffset-dBAh8RU, reason: not valid java name */
    private final long m348getOffsetdBAh8RU(float f10, LayoutDirection layoutDirection) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        int i10 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i10 == 1) {
            jFloatToRawIntBits = Float.floatToRawIntBits(f10);
            iFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            jFloatToRawIntBits = Float.floatToRawIntBits(-f10);
            iFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
        }
        return (jFloatToRawIntBits << 32) | (((long) iFloatToRawIntBits) & 4294967295L);
    }

    @Override // androidx.compose.ui.graphics.l0
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public b0 mo0createOutlinePq9zytI(long j, LayoutDirection layoutDirection, c density) {
        i.e(layoutDirection, "layoutDirection");
        i.e(density, "density");
        float fT0 = density.T0(this.cut);
        C1144u c1144uA = C1146w.a();
        c0.a(c1144uA, this.currentAvatarShape.mo0createOutlinePq9zytI(j, layoutDirection, density));
        C1144u c1144uA2 = C1146w.a();
        c0.a(c1144uA2, this.previousAvatarShape.mo0createOutlinePq9zytI(j, layoutDirection, density));
        C1144u c1144uA3 = C1146w.a();
        c1144uA3.s(c1144uA2, m348getOffsetdBAh8RU(fT0 - Float.intBitsToFloat((int) (j >> 32)), layoutDirection));
        C1144u c1144uA4 = C1146w.a();
        c1144uA4.p(c1144uA, c1144uA3, 0);
        return new b0.a(c1144uA4);
    }

    private OverlappedAvatarShape(l0 currentAvatarShape, l0 previousAvatarShape, float f10) {
        i.e(currentAvatarShape, "currentAvatarShape");
        i.e(previousAvatarShape, "previousAvatarShape");
        this.currentAvatarShape = currentAvatarShape;
        this.previousAvatarShape = previousAvatarShape;
        this.cut = f10;
    }

    public /* synthetic */ OverlappedAvatarShape(l0 l0Var, l0 l0Var2, float f10, int i10, e eVar) {
        this(l0Var, (i10 & 2) != 0 ? l0Var : l0Var2, f10, null);
    }
}
