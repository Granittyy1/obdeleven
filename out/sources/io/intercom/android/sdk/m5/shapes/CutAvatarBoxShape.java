package io.intercom.android.sdk.m5.shapes;

import androidx.compose.ui.graphics.C1144u;
import androidx.compose.ui.graphics.C1146w;
import androidx.compose.ui.graphics.b0;
import androidx.compose.ui.graphics.c0;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.m;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import p013b0.c;
import p013b0.f;
import p293xa.r;

/* JADX INFO: compiled from: CutAvatarBoxShape.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CutAvatarBoxShape implements l0 {
    public static final int $stable = 0;
    private final float cut;
    private final List<Pair<f, f>> cutsOffsets;
    private final l0 shape;

    /* JADX INFO: compiled from: CutAvatarBoxShape.kt */
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

    public /* synthetic */ CutAvatarBoxShape(l0 l0Var, float f10, List list, e eVar) {
        this(l0Var, f10, list);
    }

    /* JADX INFO: renamed from: getOffset-Rc2DDho, reason: not valid java name */
    private final long m345getOffsetRc2DDho(float f10, float f11, float f12, LayoutDirection layoutDirection) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        int i10 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i10 == 1) {
            float f13 = f12 - f10;
            jFloatToRawIntBits = Float.floatToRawIntBits(f11 - f10);
            iFloatToRawIntBits = Float.floatToRawIntBits(f13);
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            float f14 = f12 - f10;
            jFloatToRawIntBits = Float.floatToRawIntBits((-f11) - f10);
            iFloatToRawIntBits = Float.floatToRawIntBits(f14);
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
        c0.a(c1144uA, this.shape.mo0createOutlinePq9zytI(j, layoutDirection, density));
        C1144u c1144uA2 = C1146w.a();
        l0 l0Var = this.shape;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + fT0;
        c0.a(c1144uA2, l0Var.mo0createOutlinePq9zytI((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + fT0)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), layoutDirection, density));
        C1144u c1144uA3 = C1146w.a();
        List<Pair<f, f>> list = this.cutsOffsets;
        ArrayList arrayList = new ArrayList(m.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            c1144uA3.s(c1144uA2, m345getOffsetRc2DDho(fT0 / 2, density.T0(((f) pair.a()).f20481b), density.T0(((f) pair.b()).f20481b), layoutDirection));
            arrayList.add(r.f47939a);
        }
        C1144u c1144uA4 = C1146w.a();
        c1144uA4.p(c1144uA, c1144uA3, 0);
        return new b0.a(c1144uA4);
    }

    private CutAvatarBoxShape(l0 shape, float f10, List<Pair<f, f>> cutsOffsets) {
        i.e(shape, "shape");
        i.e(cutsOffsets, "cutsOffsets");
        this.shape = shape;
        this.cut = f10;
        this.cutsOffsets = cutsOffsets;
    }
}
