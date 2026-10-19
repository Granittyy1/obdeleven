package p220r9;

import C4.b;
import com.obdeleven.service.odx.OdxFactory$Exception;
import com.obdeleven.service.odx.e;
import com.obdeleven.service.odx.model.COMPUSCALE;
import com.obdeleven.service.odx.model.DATAOBJECTPROP;
import com.obdeleven.service.odx.model.SNREF;
import com.obdeleven.service.odx.model.VT;
import com.obdeleven.service.util.Texttabe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.n;

/* JADX INFO: renamed from: r9.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CompuscaleUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2783o {
    public static String a(COMPUSCALE compuscale, boolean z10) {
        VT vt = compuscale.getCOMPUCONST().getVT();
        String strC = vt.getTI() != null ? Texttabe.c(vt.getTI()) : null;
        if (strC == null) {
            strC = vt.getValue();
        }
        if (!z10) {
            return strC;
        }
        StringBuilder sbF = b.f(strC, " (");
        sbF.append(n.g(compuscale.getLOWERLIMIT().getValue()).toUpperCase());
        sbF.append(")");
        return sbF.toString();
    }

    public static ArrayList<String> b(List<COMPUSCALE> list, boolean z10) {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<COMPUSCALE> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next(), z10));
        }
        return arrayList;
    }

    public static List<COMPUSCALE> c(e eVar, e.g gVar) {
        e.c cVarL;
        if (gVar != null) {
            try {
                cVarL = eVar.l(gVar.f29507a.getKEYDOPREF(), gVar.f29508b);
            } catch (OdxFactory$Exception e10) {
                O.e.m(e10);
                cVarL = null;
            }
            if (cVarL != null) {
                return ((DATAOBJECTPROP) cVarL.f29499a).getCOMPUMETHOD().getCOMPUINTERNALTOPHYS().getCOMPUSCALES().getCOMPUSCALE();
            }
        }
        return null;
    }

    public static e.g d(e eVar, String str) {
        SNREF snref = new SNREF();
        snref.setSHORTNAME(str);
        try {
            return eVar.H(snref);
        } catch (OdxFactory$Exception e10) {
            O.e.m(e10);
            return null;
        }
    }
}
