package p141l2;

import Ja.a;
import androidx.collection.Y;
import androidx.collection.b0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.k;
import kotlin.collections.q;
import kotlin.jvm.internal.i;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.text.n;
import p163n2.l;
import p163n2.m;

/* JADX INFO: compiled from: NavGraph.android.kt */
/* JADX INFO: loaded from: classes.dex */
public class E extends C implements Iterable<C>, a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f44234h = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f44235g;

    public E(G g10) {
        super(g10);
        this.f44235g = new m(this);
    }

    public final C.b A(B b10, C lastVisited) {
        i.e(lastVisited, "lastVisited");
        return this.f44235g.d(super.v(b10), b10, true, lastVisited);
    }

    public final C.b B(String route, boolean z10, E lastVisited) {
        C.b bVarB;
        i.e(route, "route");
        i.e(lastVisited, "lastVisited");
        m mVar = this.f44235g;
        mVar.getClass();
        E e10 = mVar.f44819a;
        e10.getClass();
        C.b bVarA = e10.f44219c.a(route);
        ArrayList arrayList = new ArrayList();
        Iterator<C> it = e10.iterator();
        while (true) {
            l lVar = (l) it;
            bVarB = null;
            if (!lVar.hasNext()) {
                break;
            }
            C c10 = (C) lVar.next();
            if (!i.a(c10, lastVisited)) {
                if (c10 instanceof E) {
                    bVarB = ((E) c10).B(route, false, e10);
                } else {
                    c10.getClass();
                    bVarB = c10.f44219c.a(route);
                }
            }
            if (bVarB != null) {
                arrayList.add(bVarB);
            }
        }
        C.b bVar = (C.b) q.X(arrayList);
        E e11 = e10.f44220d;
        if (e11 != null && z10 && !e11.equals(lastVisited)) {
            bVarB = e11.B(route, true, e10);
        }
        return (C.b) q.X(k.O(new C.b[]{bVarA, bVar, bVarB}));
    }

    @Override // p141l2.C
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof E)) {
            return false;
        }
        if (super.equals(obj)) {
            m mVar = this.f44235g;
            int iF = mVar.f44820b.f();
            m mVar2 = ((E) obj).f44235g;
            if (iF == mVar2.f44820b.f() && mVar.f44821c == mVar2.f44821c) {
                Y<C> y10 = mVar.f44820b;
                i.e(y10, "<this>");
                for (C c10 : (kotlin.sequences.a) SequencesKt__SequencesKt.x(new b0(y10))) {
                    if (!c10.equals(mVar2.f44820b.c(c10.f44219c.f44813d))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // p141l2.C
    public final int hashCode() {
        m mVar = this.f44235g;
        int iD = mVar.f44821c;
        Y<C> y10 = mVar.f44820b;
        int iF = y10.f();
        for (int i10 = 0; i10 < iF; i10++) {
            iD = (((iD * 31) + y10.d(i10)) * 31) + y10.g(i10).hashCode();
        }
        return iD;
    }

    @Override // java.lang.Iterable
    public final Iterator<C> iterator() {
        m mVar = this.f44235g;
        mVar.getClass();
        return new l(mVar);
    }

    @Override // p141l2.C
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        m mVar = this.f44235g;
        String str = mVar.f44823e;
        mVar.getClass();
        C cB = (str == null || n.S(str)) ? null : mVar.b(str, true);
        if (cB == null) {
            cB = mVar.a(mVar.f44821c);
        }
        sb2.append(" startDestination=");
        if (cB == null) {
            String str2 = mVar.f44823e;
            if (str2 != null) {
                sb2.append(str2);
            } else {
                String str3 = mVar.f44822d;
                if (str3 != null) {
                    sb2.append(str3);
                } else {
                    sb2.append("0x" + Integer.toHexString(mVar.f44821c));
                }
            }
        } else {
            sb2.append("{");
            sb2.append(cB.toString());
            sb2.append("}");
        }
        String string = sb2.toString();
        i.d(string, "toString(...)");
        return string;
    }

    @Override // p141l2.C
    public final C.b v(B b10) {
        C.b bVarV = super.v(b10);
        m mVar = this.f44235g;
        mVar.getClass();
        return mVar.d(bVarV, b10, false, mVar.f44819a);
    }
}
