package androidx.compose.material;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.O0;
import com.google.android.gms.internal.measurement.M1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.Executor;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.Z;

/* JADX INFO: compiled from: Switch.kt */
/* JADX INFO: loaded from: classes.dex */
public final class T {
    /* JADX WARN: Multi-variable type inference failed */
    public static C1041q a(long j, long j10, float f10, InterfaceC1084f interfaceC1084f, int i10) {
        O0 o10 = ColorsKt.f11693a;
        long j11 = ((androidx.compose.ui.graphics.H) ((C1034j) interfaceC1084f.x(o10)).f11892d.getValue()).f13506a;
        long jH = (i10 & 8) != 0 ? ((C1034j) interfaceC1084f.x(o10)).h() : j;
        long jE = (i10 & 16) != 0 ? ((C1034j) interfaceC1084f.x(o10)).e() : j10;
        float f11 = (i10 & 32) != 0 ? 0.38f : f10;
        androidx.compose.runtime.C c10 = ContentColorKt.f11715a;
        long j12 = ((androidx.compose.ui.graphics.H) interfaceC1084f.x(c10)).f13506a;
        if (((C1034j) interfaceC1084f.x(o10)).i()) {
            Q3.d.D(j12);
        } else {
            Q3.d.D(j12);
        }
        long jI = Q3.d.i(androidx.compose.ui.graphics.H.b(0.38f, j11), ((C1034j) interfaceC1084f.x(o10)).h());
        long j13 = ((androidx.compose.ui.graphics.H) interfaceC1084f.x(c10)).f13506a;
        if (((C1034j) interfaceC1084f.x(o10)).i()) {
            Q3.d.D(j13);
        } else {
            Q3.d.D(j13);
        }
        long jI2 = Q3.d.i(androidx.compose.ui.graphics.H.b(0.38f, j11), ((C1034j) interfaceC1084f.x(o10)).h());
        long j14 = ((androidx.compose.ui.graphics.H) interfaceC1084f.x(c10)).f13506a;
        if (((C1034j) interfaceC1084f.x(o10)).i()) {
            Q3.d.D(j14);
        } else {
            Q3.d.D(j14);
        }
        long jI3 = Q3.d.i(androidx.compose.ui.graphics.H.b(0.38f, jH), ((C1034j) interfaceC1084f.x(o10)).h());
        long j15 = ((androidx.compose.ui.graphics.H) interfaceC1084f.x(c10)).f13506a;
        if (((C1034j) interfaceC1084f.x(o10)).i()) {
            Q3.d.D(j15);
        } else {
            Q3.d.D(j15);
        }
        return new C1041q(j11, androidx.compose.ui.graphics.H.b(0.54f, j11), jH, androidx.compose.ui.graphics.H.b(f11, jE), jI, androidx.compose.ui.graphics.H.b(0.54f, jI2), jI3, androidx.compose.ui.graphics.H.b(f11, Q3.d.i(androidx.compose.ui.graphics.H.b(0.38f, jE), ((C1034j) interfaceC1084f.x(o10)).h())));
    }

    public static final int b(float f10) {
        return ((int) (f10 >= 0.0f ? Math.ceil(f10) : Math.floor(f10))) * (-1);
    }

    public static final kotlinx.datetime.internal.format.parser.l c(List list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        EmptyList emptyList = EmptyList.f42983b;
        kotlinx.datetime.internal.format.parser.l lVar = new kotlinx.datetime.internal.format.parser.l(emptyList, emptyList);
        if (!list.isEmpty()) {
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                lVar = d((kotlinx.datetime.internal.format.parser.l) listIterator.previous(), lVar);
            }
        }
        return e(lVar);
    }

    public static final kotlinx.datetime.internal.format.parser.l d(kotlinx.datetime.internal.format.parser.l lVar, kotlinx.datetime.internal.format.parser.l lVar2) {
        boolean zIsEmpty = lVar.f43921b.isEmpty();
        List<kotlinx.datetime.internal.format.parser.k<Output>> list = lVar.f43920a;
        if (zIsEmpty) {
            return new kotlinx.datetime.internal.format.parser.l(kotlin.collections.q.c0(list, lVar2.f43920a), lVar2.f43921b);
        }
        Iterable iterable = lVar.f43921b;
        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(d((kotlinx.datetime.internal.format.parser.l) it.next(), lVar2));
        }
        return new kotlinx.datetime.internal.format.parser.l(list, arrayList);
    }

    public static final kotlinx.datetime.internal.format.parser.l e(kotlinx.datetime.internal.format.parser.l lVar) {
        List listK;
        ArrayList arrayList = new ArrayList();
        Iterator it = lVar.f43920a.iterator();
        ArrayList arrayListP0 = null;
        while (it.hasNext()) {
            kotlinx.datetime.internal.format.parser.k kVar = (kotlinx.datetime.internal.format.parser.k) it.next();
            if (!(kVar instanceof kotlinx.datetime.internal.format.parser.g)) {
                if (arrayListP0 != null) {
                    arrayList.add(new kotlinx.datetime.internal.format.parser.g(arrayListP0));
                    arrayListP0 = null;
                }
                arrayList.add(kVar);
            } else if (arrayListP0 != null) {
                arrayListP0.addAll(((kotlinx.datetime.internal.format.parser.g) kVar).f43912a);
            } else {
                arrayListP0 = kotlin.collections.q.p0(((kotlinx.datetime.internal.format.parser.g) kVar).f43912a);
            }
        }
        Iterable iterable = lVar.f43921b;
        ArrayList<kotlinx.datetime.internal.format.parser.l> arrayList2 = new ArrayList();
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            kotlinx.datetime.internal.format.parser.l lVarE = e((kotlinx.datetime.internal.format.parser.l) it2.next());
            if (lVarE.f43920a.isEmpty()) {
                Collection collectionK = lVarE.f43921b;
                if (collectionK.isEmpty()) {
                    collectionK = M1.k(lVarE);
                }
                listK = (List) collectionK;
            } else {
                listK = M1.k(lVarE);
            }
            kotlin.collections.p.z(arrayList2, listK);
        }
        if (arrayListP0 == null) {
            return new kotlinx.datetime.internal.format.parser.l(arrayList, arrayList2);
        }
        if (!arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                kotlinx.datetime.internal.format.parser.k kVar2 = (kotlinx.datetime.internal.format.parser.k) kotlin.collections.q.P(((kotlinx.datetime.internal.format.parser.l) it3.next()).f43920a);
                if (kVar2 != null && (kVar2 instanceof kotlinx.datetime.internal.format.parser.g)) {
                    ArrayList arrayList3 = new ArrayList(kotlin.collections.m.y(arrayList2, 10));
                    for (kotlinx.datetime.internal.format.parser.l lVar2 : arrayList2) {
                        kotlinx.datetime.internal.format.parser.k kVar3 = (kotlinx.datetime.internal.format.parser.k) kotlin.collections.q.P(lVar2.f43920a);
                        boolean z10 = kVar3 instanceof kotlinx.datetime.internal.format.parser.g;
                        Iterable iterable2 = lVar2.f43920a;
                        List<kotlinx.datetime.internal.format.parser.l<Output>> list = lVar2.f43921b;
                        arrayList3.add(z10 ? new kotlinx.datetime.internal.format.parser.l(kotlin.collections.q.c0(M1.k(new kotlinx.datetime.internal.format.parser.g(kotlin.collections.q.c0(arrayListP0, ((kotlinx.datetime.internal.format.parser.g) kVar3).f43912a))), kotlin.collections.q.K(iterable2, 1)), list) : kVar3 == null ? new kotlinx.datetime.internal.format.parser.l(M1.k(new kotlinx.datetime.internal.format.parser.g(arrayListP0)), list) : new kotlinx.datetime.internal.format.parser.l(kotlin.collections.q.c0(M1.k(new kotlinx.datetime.internal.format.parser.g(arrayListP0)), iterable2), list));
                    }
                    return new kotlinx.datetime.internal.format.parser.l(arrayList, arrayList3);
                }
            }
        }
        arrayList.add(new kotlinx.datetime.internal.format.parser.g(arrayListP0));
        return new kotlinx.datetime.internal.format.parser.l(arrayList, arrayList2);
    }

    public static Object f(int i10) {
        if (i10 < 2 || i10 > 1073741824 || Integer.highestOneBit(i10) != i10) {
            throw new IllegalArgumentException(J4.i.b(i10, "must be power of 2 between 2^1 and 2^30: "));
        }
        if (i10 <= 256) {
            return new byte[i10];
        }
        return i10 <= 65536 ? new short[i10] : new int[i10];
    }

    public static final Z g(Executor executor) {
        boolean z10 = executor instanceof kotlinx.coroutines.M;
        return new Z(executor);
    }

    public static ArrayList h(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof EditText) {
            return arrayList;
        }
        if (!(view instanceof TextView)) {
            Iterator it = p043d4.c.a(view).iterator();
            while (it.hasNext()) {
                arrayList.addAll(h((View) it.next()));
            }
            return arrayList;
        }
        String string = ((TextView) view).getText().toString();
        if (string.length() > 0 && string.length() < 100) {
            String lowerCase = string.toLowerCase();
            kotlin.jvm.internal.i.d(lowerCase, "(this as java.lang.String).toLowerCase()");
            arrayList.add(lowerCase);
        }
        return arrayList;
    }

    public static int i(int i10, int i11, int i12) {
        return (i10 & (~i12)) | (i11 & i12);
    }

    public static final boolean j(ArrayList arrayList, ArrayList arrayList2) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (kotlin.text.n.J(str, (String) it2.next(), false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final long k(p074fa.a aVar) {
        kotlin.jvm.internal.i.e(aVar, "<this>");
        long j = 0;
        do {
            j += (long) (aVar.f34857c - aVar.f34856b);
            aVar = aVar.g();
        } while (aVar != null);
        return j;
    }

    public static int l(Object obj, Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iL = kotlin.jvm.internal.n.l(obj);
        int i11 = iL & i10;
        int iM = m(i11, obj3);
        if (iM == 0) {
            return -1;
        }
        int i12 = ~i10;
        int i13 = iL & i12;
        int i14 = -1;
        while (true) {
            int i15 = iM - 1;
            int i16 = iArr[i15];
            if ((i16 & i12) == i13 && kotlinx.coroutines.C.j(obj, objArr[i15]) && (objArr2 == null || kotlinx.coroutines.C.j(obj2, objArr2[i15]))) {
                int i17 = i16 & i10;
                if (i14 == -1) {
                    n(i11, i17, obj3);
                } else {
                    iArr[i14] = i(iArr[i14], i17, i10);
                }
                return i15;
            }
            int i18 = i16 & i10;
            if (i18 == 0) {
                return -1;
            }
            i14 = i15;
            iM = i18;
        }
    }

    public static int m(int i10, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i10] & 255;
        }
        return obj instanceof short[] ? ((short[]) obj)[i10] & 65535 : ((int[]) obj)[i10];
    }

    public static void n(int i10, int i11, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }

    public static String o(int i10) {
        if (i10 == 100) {
            return "HIGH_ACCURACY";
        }
        if (i10 == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i10 == 104) {
            return "LOW_POWER";
        }
        if (i10 == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }
}
