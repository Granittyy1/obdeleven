package androidx.compose.ui.graphics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: compiled from: Brush.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    /* JADX INFO: compiled from: Brush.kt */
    public static final class a {
        public static Z a(List list, float f10, float f11, int i10) {
            return new Z(list, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((i10 & 2) != 0 ? 0.0f : f10)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((i10 & 4) != 0 ? Float.POSITIVE_INFINITY : f11)) & 4294967295L), 0);
        }

        public static Z b(Pair[] pairArr) {
            Pair[] pairArr2 = (Pair[]) Arrays.copyOf(pairArr, pairArr.length);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L);
            ArrayList arrayList = new ArrayList(pairArr2.length);
            for (Pair pair : pairArr2) {
                arrayList.add(new H(((H) pair.d()).f13506a));
            }
            ArrayList arrayList2 = new ArrayList(pairArr2.length);
            for (Pair pair2 : pairArr2) {
                arrayList2.add(Float.valueOf(((Number) pair2.c()).floatValue()));
            }
            return new Z(arrayList, arrayList2, jFloatToRawIntBits, jFloatToRawIntBits2, 0);
        }
    }

    public abstract void a(float f10, long j, d0 d0Var);
}
