package p083g7;

import android.text.TextUtils;
import com.google.firebase.inappmessaging.a;
import com.google.firebase.inappmessaging.c;
import com.google.firebase.inappmessaging.g;

/* JADX INFO: compiled from: ProtoMarshallerClient.java */
/* JADX INFO: loaded from: classes3.dex */
public final class k {
    public static a.C0372a a(a aVar) {
        a.C0372a c0372a = new a.C0372a();
        if (!TextUtils.isEmpty(aVar.G())) {
            String strG = aVar.G();
            if (!TextUtils.isEmpty(strG)) {
                c0372a.f35606a = strG;
            }
        }
        return c0372a;
    }

    public static a b(a aVar, c cVar) {
        a.C0372a c0372aA = a(aVar);
        if (!cVar.equals(c.H())) {
            n nVar = null;
            String strG = !TextUtils.isEmpty(cVar.G()) ? cVar.G() : null;
            if (cVar.J()) {
                g gVarI = cVar.I();
                String strI = !TextUtils.isEmpty(gVarI.I()) ? gVarI.I() : null;
                String strH = TextUtils.isEmpty(gVarI.H()) ? null : gVarI.H();
                if (TextUtils.isEmpty(strH)) {
                    throw new IllegalArgumentException("Text model must have a color");
                }
                nVar = new n(strI, strH);
            }
            if (TextUtils.isEmpty(strG)) {
                throw new IllegalArgumentException("Button model must have a color");
            }
            if (nVar == null) {
                throw new IllegalArgumentException("Button model must have text");
            }
            c0372aA.f35607b = new d(nVar, strG);
        }
        return new a(c0372aA.f35606a, c0372aA.f35607b);
    }

    public static n c(g gVar) {
        String strH = !TextUtils.isEmpty(gVar.H()) ? gVar.H() : null;
        String strI = TextUtils.isEmpty(gVar.I()) ? null : gVar.I();
        if (TextUtils.isEmpty(strH)) {
            throw new IllegalArgumentException("Text model must have a color");
        }
        return new n(strI, strH);
    }
}
