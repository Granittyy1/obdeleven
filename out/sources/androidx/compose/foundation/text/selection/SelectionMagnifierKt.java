package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.C0910j;
import androidx.compose.animation.core.P;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.e0;

/* JADX INFO: compiled from: SelectionMagnifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SelectionMagnifierKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0910j f11541a = new C0910j(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e0 f11542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f11543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final P<I.d> f11544d;

    static {
        e0 e0Var = VectorConvertersKt.f9477a;
        f11542b = new e0(new Ia.l<I.d, C0910j>() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1
            @Override // Ia.l
            public final C0910j invoke(I.d dVar) {
                long j = dVar.f3754a;
                return (9223372034707292159L & j) != 9205357640488583168L ? new C0910j(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))) : SelectionMagnifierKt.f11541a;
            }
        }, new Ia.l<C0910j, I.d>() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2
            @Override // Ia.l
            public final I.d invoke(C0910j c0910j) {
                C0910j c0910j2 = c0910j;
                float f10 = c0910j2.f9554a;
                float f11 = c0910j2.f9555b;
                return new I.d((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L));
            }
        });
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & 4294967295L);
        f11543c = jFloatToRawIntBits;
        f11544d = new P<>(3, new I.d(jFloatToRawIntBits));
    }
}
