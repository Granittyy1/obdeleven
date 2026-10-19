package p270w;

import I.g;
import androidx.compose.ui.graphics.b0;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.i;
import p111ia.c;

/* JADX INFO: compiled from: RoundedCornerShape.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f extends a {
    @Override // p270w.a
    public final f a(b bVar, b bVar2, b bVar3, b bVar4) {
        return new f(bVar, bVar2, bVar3, bVar4);
    }

    @Override // p270w.a
    public final b0 c(long j, float f10, float f11, float f12, float f13, LayoutDirection layoutDirection) {
        if (f10 + f11 + f12 + f13 == 0.0f) {
            return new b0.b(c.a(0L, j));
        }
        I.f fVarA = c.a(0L, j);
        LayoutDirection layoutDirection2 = LayoutDirection.f15717b;
        float f14 = layoutDirection == layoutDirection2 ? f10 : f11;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L);
        float f15 = layoutDirection == layoutDirection2 ? f11 : f10;
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L);
        float f16 = layoutDirection == layoutDirection2 ? f12 : f13;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(f16)) & 4294967295L);
        float f17 = layoutDirection == layoutDirection2 ? f13 : f12;
        return new b0.c(new g(fVarA.f3757a, fVarA.f3758b, fVarA.f3759c, fVarA.f3760d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(f17)) << 32) | (((long) Float.floatToRawIntBits(f17)) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!i.a(this.f47673a, fVar.f47673a)) {
            return false;
        }
        if (!i.a(this.f47674b, fVar.f47674b)) {
            return false;
        }
        if (i.a(this.f47675c, fVar.f47675c)) {
            return i.a(this.f47676d, fVar.f47676d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f47676d.hashCode() + ((this.f47675c.hashCode() + ((this.f47674b.hashCode() + (this.f47673a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f47673a + ", topEnd = " + this.f47674b + ", bottomEnd = " + this.f47675c + ", bottomStart = " + this.f47676d + ')';
    }
}
