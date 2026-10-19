package A8;

import com.voltasit.obdeleven.domain.models.oca.OcaCategory;
import com.voltasit.obdeleven.domain.models.oca.OcaTestState;

/* JADX INFO: compiled from: OcaMapper.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class l {
    public static I8.a a(p304y9.t input) {
        OcaCategory ocaCategory;
        OcaTestState ocaTestState;
        kotlin.jvm.internal.i.e(input, "input");
        OcaTestState.f30569b.getClass();
        OcaTestState[] ocaTestStateArrValues = OcaTestState.values();
        int length = ocaTestStateArrValues.length;
        int i10 = 0;
        while (true) {
            ocaCategory = null;
            if (i10 >= length) {
                ocaTestState = null;
                break;
            }
            ocaTestState = ocaTestStateArrValues[i10];
            if (ocaTestState.a() == input.f48634k) {
                break;
            }
            i10++;
        }
        OcaTestState ocaTestState2 = ocaTestState == null ? OcaTestState.UNKNOWN : ocaTestState;
        OcaCategory.f30564b.getClass();
        String string = input.f48635l;
        kotlin.jvm.internal.i.e(string, "string");
        for (OcaCategory ocaCategory2 : OcaCategory.values()) {
            if (kotlin.jvm.internal.i.a(ocaCategory2.a(), string)) {
                ocaCategory = ocaCategory2;
                break;
            }
        }
        return new I8.a(input.f48625a, input.f48626b, input.f48627c, input.f48628d, input.f48629e, input.f48630f, input.f48631g, input.f48632h, input.f48633i, input.j, ocaTestState2, ocaCategory == null ? OcaCategory.ADJUSTMENT : ocaCategory, input.f48636m, input.f48637n, input.f48638o);
    }
}
