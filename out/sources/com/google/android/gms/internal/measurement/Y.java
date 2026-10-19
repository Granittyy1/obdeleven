package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1101n0;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.saveable.SaveableStateHolderImpl;
import androidx.compose.ui.layout.InterfaceC1166l;
import androidx.lifecycle.InterfaceC1369l;
import androidx.navigation.compose.C1408a;
import androidx.navigation.compose.C1424q;
import com.google.android.gms.internal.measurement.Y;
import com.parse.ParseCloud;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C2708s;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.SharingCommand;
import me.zhanghai.android.materialprogressbar.R;
import p141l2.C2749t;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class Y implements G6.b, kotlinx.coroutines.flow.z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f25639b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25640a;

    public /* synthetic */ Y(int i10) {
        this.f25640a = i10;
    }

    public static final void c(C2749t c2749t, SaveableStateHolderImpl saveableStateHolderImpl, ComposableLambdaImpl composableLambdaImpl, InterfaceC1084f interfaceC1084f, int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(233973821);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.k(c2749t) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.k(saveableStateHolderImpl) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c1086gP.k(composableLambdaImpl) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c1086gP.s()) {
            c1086gP.w();
        } else {
            CompositionLocalKt.b(new C1101n0[]{p027c1.b.f22275a.b(c2749t), Z0.b.f7676a.b(c2749t), p260v2.a.f47628a.b(c2749t)}, androidx.compose.runtime.internal.a.b(1808964477, new androidx.navigation.compose.t(saveableStateHolderImpl, composableLambdaImpl), c1086gP), c1086gP, 56);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C1424q(c2749t, saveableStateHolderImpl, composableLambdaImpl, i10, 0);
        }
    }

    public static final void d(final SaveableStateHolderImpl saveableStateHolderImpl, final ComposableLambdaImpl composableLambdaImpl, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(832919318);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.k(saveableStateHolderImpl) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.k(composableLambdaImpl) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c1086gP.s()) {
            c1086gP.w();
        } else {
            Object objF = c1086gP.f();
            if (objF == InterfaceC1084f.a.f12980a) {
                objF = new androidx.navigation.compose.r(0);
                c1086gP.E(objF);
            }
            Ia.l lVar = (Ia.l) objF;
            androidx.lifecycle.c0 c0VarA = p027c1.b.a(c1086gP);
            if (c0VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            kotlin.jvm.internal.c cVarA = kotlin.jvm.internal.l.a(C1408a.class);
            p014b1.c cVar = new p014b1.c();
            cVar.a(kotlin.jvm.internal.l.a(C1408a.class), lVar);
            C1408a c1408a = (C1408a) p027c1.c.a(cVarA, c0VarA, null, cVar.b(), c0VarA instanceof InterfaceC1369l ? ((InterfaceC1369l) c0VarA).getDefaultViewModelCreationExtras() : p014b1.a.C0207a.f20498b, c1086gP);
            p137kb.b bVar = new p137kb.b();
            bVar.f42919a = new WeakReference(saveableStateHolderImpl);
            c1408a.f19149c = bVar;
            saveableStateHolderImpl.d(c1408a.f19148b, composableLambdaImpl, c1086gP, ((i11 << 6) & 896) | (i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: androidx.navigation.compose.s
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = L4.b.l(i10 | 1);
                    ComposableLambdaImpl composableLambdaImpl2 = composableLambdaImpl;
                    Y.d(saveableStateHolderImpl, composableLambdaImpl2, (InterfaceC1084f) obj, iL);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static androidx.collection.Y e(androidx.collection.Y y10) {
        androidx.collection.Y y11 = new androidx.collection.Y();
        for (int i10 = 0; i10 < y10.f(); i10++) {
            y11.e(y10.d(i10), ((p109i8.b) y10.g(i10)).a());
        }
        return y11;
    }

    public static final Oa.c f(p011ab.e eVar) {
        kotlin.jvm.internal.i.e(eVar, "<this>");
        if (eVar instanceof p011ab.b) {
            return ((p011ab.b) eVar).f8090b;
        }
        if (eVar instanceof p037cb.t0) {
            return f(((p037cb.t0) eVar).f22655a);
        }
        return null;
    }

    public static final androidx.compose.foundation.layout.Q g(InterfaceC1166l interfaceC1166l) {
        Object objQ = interfaceC1166l.q();
        if (objQ instanceof androidx.compose.foundation.layout.Q) {
            return (androidx.compose.foundation.layout.Q) objQ;
        }
        return null;
    }

    public static final float h(androidx.compose.foundation.layout.Q q10) {
        if (q10 != null) {
            return q10.f10199a;
        }
        return 0.0f;
    }

    public static final long i(float f10, long j) {
        return (Float.isNaN(f10) || f10 >= 1.0f) ? j : androidx.compose.ui.graphics.H.b(androidx.compose.ui.graphics.H.d(j) * f10, j);
    }

    public static long j(p114j1.r rVar, int i10, int i11) {
        rVar.G(i10);
        if (rVar.a() < 5) {
            return -9223372036854775807L;
        }
        int iH = rVar.h();
        if ((8388608 & iH) != 0 || ((2096896 & iH) >> 8) != i11 || (iH & 32) == 0 || rVar.u() < 7 || rVar.a() < 7 || (rVar.u() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        rVar.f(bArr, 0, 6);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
    }

    public static com.voltasit.obdeleven.ui.dialogs.R0 k(BaseFragment baseFragment, int i10, String str) {
        String string = baseFragment.getString(com.voltasit.obdeleven.R.string.common_attention);
        Bundle bundle = new Bundle();
        if (!(baseFragment instanceof DialogCallback)) {
            throw new UnsupportedOperationException("Specified fragment must implement DialogCallback interface");
        }
        bundle.putString("key_title", string);
        bundle.putString("key_tag", str);
        bundle.putString("key_description", baseFragment.getString(i10));
        com.voltasit.obdeleven.ui.dialogs.R0 r10 = new com.voltasit.obdeleven.ui.dialogs.R0();
        r10.setArguments(bundle);
        r10.f32261r = baseFragment.getFragmentManager();
        r10.setTargetFragment(baseFragment, 0);
        r10.A();
        return r10;
    }

    public static final Object l(kotlinx.coroutines.internal.u uVar, kotlinx.coroutines.internal.u uVar2, Ia.p pVar) {
        Object c2708s;
        Object objD0;
        try {
            kotlin.jvm.internal.o.d(2, pVar);
            c2708s = pVar.invoke(uVar2, uVar);
        } catch (Throwable th) {
            c2708s = new C2708s(th, false);
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (c2708s == coroutineSingletons || (objD0 = uVar.d0(c2708s)) == kotlinx.coroutines.o0.f43518b) {
            return coroutineSingletons;
        }
        if (objD0 instanceof C2708s) {
            throw ((C2708s) objD0).f43531a;
        }
        return kotlinx.coroutines.o0.a(objD0);
    }

    public static Task m(String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("vin", str);
        map.put("selectedVehicleModificationId", str2);
        map.put("deviceId", str3);
        map.put("auto", Boolean.TRUE);
        return ParseCloud.callFunctionInBackground("submitVehicleV3", map);
    }

    public static final void n() {
        throw new UnsupportedOperationException();
    }

    public static String o(zzij zzijVar) {
        StringBuilder sb2 = new StringBuilder(zzijVar.B());
        for (int i10 = 0; i10 < zzijVar.B(); i10++) {
            byte bD = zzijVar.d(i10);
            if (bD == 34) {
                sb2.append("\\\"");
            } else if (bD == 39) {
                sb2.append("\\'");
            } else if (bD != 92) {
                switch (bD) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bD < 32 || bD > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bD >>> 6) & 3) + 48));
                            sb2.append((char) (((bD >>> 3) & 7) + 48));
                            sb2.append((char) ((bD & 7) + 48));
                        } else {
                            sb2.append((char) bD);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    @Override // G6.b
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        int i10;
        HashMap map = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i12];
            Integer num = (Integer) map.get(stackTraceElement);
            if (num == null) {
                stackTraceElementArr2[i13] = stackTraceElementArr[i12];
                i13++;
                i11 = 1;
                i10 = i12;
                break;
                break;
            }
            int iIntValue = num.intValue();
            int i14 = i12 - iIntValue;
            if (i12 + i14 <= stackTraceElementArr.length) {
                int i15 = 0;
                while (true) {
                    if (i15 >= i14) {
                        int iIntValue2 = i12 - num.intValue();
                        if (i11 < 10) {
                            System.arraycopy(stackTraceElementArr, i12, stackTraceElementArr2, i13, iIntValue2);
                            i13 += iIntValue2;
                            i11++;
                        }
                        i10 = (iIntValue2 - 1) + i12;
                        break;
                    }
                    if (!stackTraceElementArr[iIntValue + i15].equals(stackTraceElementArr[i12 + i15])) {
                        stackTraceElementArr2[i13] = stackTraceElementArr[i12];
                        i13++;
                        i11 = 1;
                        i10 = i12;
                        break;
                        break;
                    }
                    i15++;
                }
            } else {
                stackTraceElementArr2[i13] = stackTraceElementArr[i12];
                i13++;
                i11 = 1;
                i10 = i12;
                break;
            }
            map.put(stackTraceElement, Integer.valueOf(i12));
            i12 = i10 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i13];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i13);
        return i13 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }

    @Override // kotlinx.coroutines.flow.z
    public InterfaceC2686c b(kotlinx.coroutines.flow.A a10) {
        return new kotlinx.coroutines.flow.f(SharingCommand.f43354b);
    }

    public String toString() {
        switch (this.f25640a) {
            case 14:
                return "SharingStarted.Eagerly";
            default:
                return super.toString();
        }
    }
}
