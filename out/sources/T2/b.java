package T2;

import C7.g;
import Q2.C0732i;
import Q2.InterfaceC0733j;
import Q2.InterfaceC0740q;
import Q2.V;
import Q2.z;
import androidx.work.k;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.q;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: DiagnosticsWorker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5799a = 0;

    static {
        i.d(k.d("DiagnosticsWrkr"), "tagWithPrefix(\"DiagnosticsWrkr\")");
    }

    public static final void a(InterfaceC0740q interfaceC0740q, V v10, InterfaceC0733j interfaceC0733j, List list) {
        StringBuilder sb2 = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z zVar = (z) it.next();
            C0732i c0732iB = interfaceC0733j.b(Lb.a.g(zVar));
            Integer numValueOf = c0732iB != null ? Integer.valueOf(c0732iB.f5020c) : null;
            String str = zVar.f5036a;
            String strU = q.U(interfaceC0740q.b(str), ",", null, null, null, 62);
            String strU2 = q.U(v10.c(str), ",", null, null, null, 62);
            StringBuilder sbA = g.a("\n", str, "\t ");
            sbA.append(zVar.f5038c);
            sbA.append("\t ");
            sbA.append(numValueOf);
            sbA.append("\t ");
            sbA.append(zVar.f5037b.name());
            sbA.append("\t ");
            sbA.append(strU);
            sbA.append("\t ");
            sbA.append(strU2);
            sbA.append('\t');
            sb2.append(sbA.toString());
        }
        i.d(sb2.toString(), "StringBuilder().apply(builderAction).toString()");
    }
}
