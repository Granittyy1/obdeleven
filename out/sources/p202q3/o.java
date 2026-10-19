package p202q3;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import p164n3.c;
import p214r3.f;

/* JADX INFO: compiled from: GradientColorParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class o implements L<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46069a;

    /* JADX WARN: Code duplicated, block: B:38:0x00d3  */
    @Override // p202q3.L
    public final c a(JsonReader jsonReader, float f10) throws IOException {
        int i10;
        int iArgb;
        float f11;
        int iArgb2;
        float f12;
        float fD;
        ArrayList arrayList = new ArrayList();
        int i11 = 1;
        boolean z10 = jsonReader.C() == JsonReader.Token.f23516b;
        if (z10) {
            jsonReader.b();
        }
        while (jsonReader.k()) {
            arrayList.add(Float.valueOf((float) jsonReader.s()));
        }
        int i12 = 4;
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.f46069a = 2;
        }
        if (z10) {
            jsonReader.h();
        }
        if (this.f46069a == -1) {
            this.f46069a = arrayList.size() / 4;
        }
        int i13 = this.f46069a;
        float[] fArr = new float[i13];
        int[] iArr = new int[i13];
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i10 = this.f46069a * i12;
            if (i14 >= i10) {
                break;
            }
            int i17 = i14 / 4;
            double dFloatValue = ((Float) arrayList.get(i14)).floatValue();
            int i18 = i14 % 4;
            if (i18 != 0) {
                if (i18 == i11) {
                    i15 = (int) (dFloatValue * 255.0d);
                } else if (i18 == 2) {
                    i16 = (int) (dFloatValue * 255.0d);
                } else if (i18 == 3) {
                    iArr[i17] = Color.argb(255, i15, i16, (int) (dFloatValue * 255.0d));
                }
            } else if (i17 > 0) {
                float f13 = (float) dFloatValue;
                if (fArr[i17 - 1] >= f13) {
                    fArr[i17] = f13 + 0.01f;
                } else {
                    fArr[i17] = (float) dFloatValue;
                }
            } else {
                fArr[i17] = (float) dFloatValue;
            }
            i14++;
            i11 = 1;
            i12 = 4;
        }
        c cVar = new c(fArr, iArr);
        if (arrayList.size() <= i10) {
            return cVar;
        }
        int size = (arrayList.size() - i10) / 2;
        float[] fArr2 = new float[size];
        float[] fArr3 = new float[size];
        int i19 = 0;
        while (i10 < arrayList.size()) {
            if (i10 % 2 == 0) {
                fArr2[i19] = ((Float) arrayList.get(i10)).floatValue();
            } else {
                fArr3[i19] = ((Float) arrayList.get(i10)).floatValue();
                i19++;
            }
            i10++;
        }
        float[] fArrCopyOf = cVar.f44829a;
        if (fArrCopyOf.length == 0) {
            fArrCopyOf = fArr2;
        } else if (size != 0) {
            int length = fArrCopyOf.length + size;
            float[] fArr4 = new float[length];
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            for (int i23 = 0; i23 < length; i23++) {
                float f14 = i21 < fArrCopyOf.length ? fArrCopyOf[i21] : Float.NaN;
                float f15 = i22 < size ? fArr2[i22] : Float.NaN;
                if (Float.isNaN(f15) || f14 < f15) {
                    fArr4[i23] = f14;
                    i21++;
                } else if (Float.isNaN(f14) || f15 < f14) {
                    fArr4[i23] = f15;
                    i22++;
                } else {
                    fArr4[i23] = f14;
                    i21++;
                    i22++;
                    i20++;
                }
            }
            fArrCopyOf = i20 == 0 ? fArr4 : Arrays.copyOf(fArr4, length - i20);
        }
        int length2 = fArrCopyOf.length;
        int[] iArr2 = new int[length2];
        int i24 = 0;
        while (i24 < length2) {
            float f16 = fArrCopyOf[i24];
            int iBinarySearch = Arrays.binarySearch(fArr, f16);
            int iBinarySearch2 = Arrays.binarySearch(fArr2, f16);
            int[] iArr3 = cVar.f44830b;
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                float f17 = fArr3[iBinarySearch2];
                if (iArr3.length < 2 || f16 == fArr[0]) {
                    iArgb = iArr3[0];
                } else {
                    int i25 = 1;
                    while (true) {
                        if (i25 >= i13) {
                            throw new IllegalArgumentException("Unreachable code.");
                        }
                        f11 = fArr[i25];
                        if (f11 >= f16 || i25 == i13 - 1) {
                            break;
                        }
                        i25++;
                    }
                    int i26 = i25 - 1;
                    float f18 = fArr[i26];
                    float f19 = (f16 - f18) / (f11 - f18);
                    int i27 = iArr3[i25];
                    int i28 = iArr3[i26];
                    iArgb = Color.argb((int) (f17 * 255.0f), D9.o.i(f19, Color.red(i28), Color.red(i27)), D9.o.i(f19, Color.green(i28), Color.green(i27)), D9.o.i(f19, Color.blue(i28), Color.blue(i27)));
                }
                iArr2[i24] = iArgb;
            } else {
                int i29 = iArr3[iBinarySearch];
                if (size < 2 || f16 <= fArr2[0]) {
                    iArgb2 = Color.argb((int) (fArr3[0] * 255.0f), Color.red(i29), Color.green(i29), Color.blue(i29));
                } else {
                    int i30 = 1;
                    while (true) {
                        if (i30 >= size) {
                            throw new IllegalArgumentException("Unreachable code.");
                        }
                        f12 = fArr2[i30];
                        if (f12 >= f16 || i30 == size - 1) {
                            break;
                        }
                        i30++;
                    }
                    if (f12 <= f16) {
                        fD = fArr3[i30];
                    } else {
                        int i31 = i30 - 1;
                        float f20 = fArr2[i31];
                        fD = f.d(fArr3[i31], fArr3[i30], (f16 - f20) / (f12 - f20));
                    }
                    iArgb2 = Color.argb((int) (fD * 255.0f), Color.red(i29), Color.green(i29), Color.blue(i29));
                }
                iArr2[i24] = iArgb2;
                i13 = i13;
            }
            i24++;
            i13 = i13;
        }
        return new c(fArrCopyOf, iArr2);
    }
}
