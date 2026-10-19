package androidx.compose.ui.input.pointer.util;

import Na.l;
import com.braze.Constants;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.C;

/* JADX INFO: compiled from: VelocityTracker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class VelocityTracker1D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Strategy f14136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final P.a[] f14138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f14140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f14141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f14142h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: VelocityTracker.kt */
    public static final class Strategy {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Strategy f14143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Strategy f14144c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Strategy[] f14145d;

        static {
            Strategy strategy = new Strategy("Lsq2", 0);
            f14143b = strategy;
            Strategy strategy2 = new Strategy("Impulse", 1);
            f14144c = strategy2;
            Strategy[] strategyArr = {strategy, strategy2};
            f14145d = strategyArr;
            kotlin.enums.a.a(strategyArr);
        }

        public Strategy() {
            throw null;
        }

        public static Strategy valueOf(String str) {
            return (Strategy) Enum.valueOf(Strategy.class, str);
        }

        public static Strategy[] values() {
            return (Strategy[]) f14145d.clone();
        }
    }

    public VelocityTracker1D(boolean z10, Strategy strategy) {
        int i10;
        this.f14135a = z10;
        this.f14136b = strategy;
        if (z10 && strategy.equals(Strategy.f14143b)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int iOrdinal = strategy.ordinal();
        if (iOrdinal == 0) {
            i10 = 3;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i10 = 2;
        }
        this.f14137c = i10;
        this.f14138d = new P.a[20];
        this.f14140f = new float[20];
        this.f14141g = new float[20];
        this.f14142h = new float[3];
    }

    public final void a(float f10, long j) {
        int i10 = (this.f14139e + 1) % 20;
        this.f14139e = i10;
        P.a[] aVarArr = this.f14138d;
        P.a aVar = aVarArr[i10];
        if (aVar != null) {
            aVar.f4879a = j;
            aVar.f4880b = f10;
        } else {
            P.a aVar2 = new P.a();
            aVar2.f4879a = j;
            aVar2.f4880b = f10;
            aVarArr[i10] = aVar2;
        }
    }

    public final float b(float f10) {
        Strategy strategy;
        float[] fArr;
        float[] fArr2;
        boolean z10;
        float f11;
        float fSignum;
        float f12 = 0.0f;
        if (f10 <= 0.0f) {
            R.a.b("maximumVelocity should be a positive value. You specified=" + f10);
        }
        int i10 = this.f14139e;
        P.a[] aVarArr = this.f14138d;
        P.a aVar = aVarArr[i10];
        if (aVar == null) {
            f11 = 0.0f;
        } else {
            int i11 = 0;
            P.a aVar2 = aVar;
            do {
                P.a aVar3 = aVarArr[i10];
                boolean z11 = this.f14135a;
                strategy = this.f14136b;
                fArr = this.f14140f;
                fArr2 = this.f14141g;
                if (aVar3 == null) {
                    z10 = z11;
                    break;
                }
                long j = aVar.f4879a;
                int i12 = i10;
                long j10 = aVar3.f4879a;
                float f13 = j - j10;
                z10 = z11;
                float fAbs = Math.abs(j10 - aVar2.f4879a);
                aVar2 = (strategy == Strategy.f14143b || z10) ? aVar3 : aVar;
                if (f13 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i11] = aVar3.f4880b;
                fArr2[i11] = -f13;
                i10 = (i12 == 0 ? 20 : i12) - 1;
                i11++;
            } while (i11 < 20);
            if (i11 >= this.f14137c) {
                int iOrdinal = strategy.ordinal();
                if (iOrdinal == 0) {
                    try {
                        float[] fArr3 = this.f14142h;
                        C.t(fArr2, fArr, i11, fArr3);
                        fSignum = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        fSignum = 0.0f;
                    }
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i13 = i11 - 1;
                    float f14 = fArr2[i13];
                    int i14 = i13;
                    float fAbs2 = 0.0f;
                    while (i14 > 0) {
                        int i15 = i14 - 1;
                        float f15 = fArr2[i15];
                        if (f14 != f15) {
                            float f16 = (z10 ? -fArr[i15] : fArr[i14] - fArr[i15]) / (f14 - f15);
                            fAbs2 += Math.abs(f16) * (f16 - (Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2))));
                            if (i14 == i13) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i14--;
                        f14 = f15;
                    }
                    fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2));
                }
                f12 = fSignum * Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS;
            } else {
                f12 = 0.0f;
            }
            f11 = 0.0f;
        }
        if (f12 == f11 || Float.isNaN(f12)) {
            return f11;
        }
        return f12 > f11 ? l.z(f12, f10) : l.x(f12, -f10);
    }

    public /* synthetic */ VelocityTracker1D() {
        this(false, Strategy.f14143b);
    }

    public VelocityTracker1D(int i10) {
        this(true, Strategy.f14144c);
    }
}
