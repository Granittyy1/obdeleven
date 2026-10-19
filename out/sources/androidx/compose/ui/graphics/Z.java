package androidx.compose.ui.graphics;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: Brush.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Z extends j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<H> f13533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f13534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f13535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f13536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f13537g;

    public Z() {
        throw null;
    }

    public Z(List list, ArrayList arrayList, long j, long j10, int i10) {
        this.f13533c = list;
        this.f13534d = arrayList;
        this.f13535e = j;
        this.f13536f = j10;
        this.f13537g = i10;
    }

    @Override // androidx.compose.ui.graphics.j0
    public final Shader b(long j) {
        long j10 = this.f13535e;
        int i10 = (int) (j10 >> 32);
        if (Float.intBitsToFloat(i10) == Float.POSITIVE_INFINITY) {
            i10 = (int) (j >> 32);
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i10);
        int i11 = (int) (j10 & 4294967295L);
        if (Float.intBitsToFloat(i11) == Float.POSITIVE_INFINITY) {
            i11 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat(i11);
        long j11 = this.f13536f;
        int i12 = (int) (j11 >> 32);
        if (Float.intBitsToFloat(i12) == Float.POSITIVE_INFINITY) {
            i12 = (int) (j >> 32);
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i12);
        int i13 = (int) (j11 & 4294967295L);
        if (Float.intBitsToFloat(i13) == Float.POSITIVE_INFINITY) {
            i13 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat(i13);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L);
        ArrayList arrayList = this.f13534d;
        List<H> list = this.f13533c;
        C1147x.a(arrayList, list);
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L));
        int size = list.size();
        int[] iArr = new int[size];
        for (int i14 = 0; i14 < size; i14++) {
            iArr[i14] = Q3.d.K(list.get(i14).f13506a);
        }
        return new LinearGradient(fIntBitsToFloat5, fIntBitsToFloat6, fIntBitsToFloat7, fIntBitsToFloat8, iArr, arrayList != null ? kotlin.collections.q.m0(arrayList) : null, C1148y.a(this.f13537g));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z10 = (Z) obj;
        return kotlin.jvm.internal.i.a(this.f13533c, z10.f13533c) && kotlin.jvm.internal.i.a(this.f13534d, z10.f13534d) && I.d.b(this.f13535e, z10.f13535e) && I.d.b(this.f13536f, z10.f13536f) && p0.a(this.f13537g, z10.f13537g);
    }

    public final int hashCode() {
        int iHashCode = this.f13533c.hashCode() * 31;
        ArrayList arrayList = this.f13534d;
        return Integer.hashCode(this.f13537g) + C4.b.c(this.f13536f, C4.b.c(this.f13535e, (iHashCode + (arrayList != null ? arrayList.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        String str;
        long j = this.f13535e;
        String str2 = "";
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) I.d.i(j)) + ", ";
        } else {
            str = "";
        }
        long j10 = this.f13536f;
        if (((((j10 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) I.d.i(j10)) + ", ";
        }
        return "LinearGradient(colors=" + this.f13533c + ", stops=" + this.f13534d + ", " + str + str2 + "tileMode=" + ((Object) p0.b(this.f13537g)) + ')';
    }
}
