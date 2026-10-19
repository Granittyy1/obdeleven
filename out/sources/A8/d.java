package A8;

import G8.B;
import G8.C0704f;
import p304y9.C2828g;
import p304y9.G;

/* JADX INFO: compiled from: ControlUnitBaseMapper.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:20:0x0045  */
    public final C0704f a(C2828g input) {
        short s10;
        p293xa.p pVar;
        kotlin.jvm.internal.i.e(input, "input");
        G g10 = input.f48571l;
        B bA = g10 != null ? v.a(g10) : new B("", kotlin.collections.y.p());
        p304y9.m mVar = input.f48561a;
        String str = mVar != null ? mVar.f48602b : null;
        String str2 = str == null ? "" : str;
        String str3 = input.f48563c;
        if (str3 != null) {
            p293xa.k kVarM = F8.a.m(16, str3);
            if (kVarM != null) {
                int i10 = kVarM.f47926b;
                if (Integer.compareUnsigned(i10, 65535) > 0) {
                    pVar = null;
                } else {
                    pVar = new p293xa.p((short) i10);
                }
            } else {
                pVar = null;
            }
            if (pVar == null) {
                kotlin.text.l.x(str3);
                throw null;
            }
            s10 = pVar.f47935b;
        } else {
            s10 = 0;
        }
        short s11 = s10;
        String str4 = input.f48564d;
        String str5 = str4 == null ? "" : str4;
        String str6 = input.f48565e;
        String str7 = str6 == null ? "" : str6;
        String str8 = input.f48566f;
        String str9 = str8 == null ? "" : str8;
        String str10 = input.f48567g;
        String str11 = str10 == null ? "" : str10;
        String str12 = input.f48568h;
        String str13 = str12 == null ? "" : str12;
        String str14 = input.f48569i;
        String str15 = str14 == null ? "" : str14;
        String str16 = input.j;
        String str17 = str16 == null ? "" : str16;
        String str18 = input.f48570k;
        return new C0704f(input.f48562b, str2, s11, str5, str7, str9, str11, str13, str15, str17, str18 == null ? "" : str18, bA);
    }
}
