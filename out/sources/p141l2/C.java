package p141l2;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import androidx.collection.Y;
import androidx.collection.a0;
import io.intercom.android.sdk.m5.conversation.ui.U;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.m;
import kotlin.collections.q;
import kotlin.collections.y;
import kotlin.jvm.internal.i;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.g;
import kotlin.text.Regex;
import kotlin.text.n;
import p163n2.e;
import p163n2.k;
import p271w0.c;

/* JADX INFO: compiled from: NavDestination.android.kt */
/* JADX INFO: loaded from: classes.dex */
public class C {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f44217f = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f44219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public E f44220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Y<C2747q> f44221e;

    /* JADX INFO: compiled from: NavDestination.android.kt */
    public static final class a {
        public static String a(String str) {
            return str != null ? "android-app://androidx.navigation/".concat(str) : "";
        }

        public static String b(e context, int i10) {
            i.e(context, "context");
            if (i10 <= 16777215) {
                return String.valueOf(i10);
            }
            try {
                Context context2 = context.f44769a;
                i.b(context2);
                String resourceName = context2.getResources().getResourceName(i10);
                i.b(resourceName);
                return resourceName;
            } catch (Resources.NotFoundException unused) {
                return String.valueOf(i10);
            }
        }

        public static g c(C c10) {
            i.e(c10, "<this>");
            return SequencesKt__SequencesKt.z(c10, new U(5));
        }
    }

    /* JADX INFO: compiled from: NavDestination.android.kt */
    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C f44222b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bundle f44223c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f44224d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f44225e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f44226f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f44227g;

        public b(C destination, Bundle bundle, boolean z10, int i10, boolean z11, int i11) {
            i.e(destination, "destination");
            this.f44222b = destination;
            this.f44223c = bundle;
            this.f44224d = z10;
            this.f44225e = i10;
            this.f44226f = z11;
            this.f44227g = i11;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compareTo(b other) {
            i.e(other, "other");
            boolean z10 = other.f44224d;
            boolean z11 = this.f44224d;
            if (z11 && !z10) {
                return 1;
            }
            if (!z11 && z10) {
                return -1;
            }
            int i10 = this.f44225e - other.f44225e;
            if (i10 > 0) {
                return 1;
            }
            if (i10 < 0) {
                return -1;
            }
            Bundle bundle = other.f44223c;
            Bundle source = this.f44223c;
            if (source != null && bundle == null) {
                return 1;
            }
            if (source == null && bundle != null) {
                return -1;
            }
            if (source != null) {
                i.e(source, "source");
                int size = source.size();
                i.b(bundle);
                int size2 = size - bundle.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z12 = other.f44226f;
            boolean z13 = this.f44226f;
            if (z13 && !z12) {
                return 1;
            }
            if (z13 || !z12) {
                return this.f44227g - other.f44227g;
            }
            return -1;
        }
    }

    static {
        new LinkedHashMap();
    }

    public C(P<? extends C> navigator) {
        i.e(navigator, "navigator");
        LinkedHashMap linkedHashMap = Q.f44272b;
        this.f44218b = Q.a.a(navigator.getClass());
        this.f44219c = new k(this);
        this.f44221e = new Y<>(0);
    }

    public final Bundle e(Bundle bundle) {
        Object obj;
        LinkedHashMap linkedHashMap = this.f44219c.f44812c;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        y.p();
        Bundle bundleB = c.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String name = (String) entry.getKey();
            r rVar = (r) entry.getValue();
            rVar.getClass();
            i.e(name, "name");
            if (rVar.f44290c && (obj = rVar.f44291d) != null) {
                rVar.f44288a.put(bundleB, name, obj);
            }
        }
        if (bundle != null) {
            bundleB.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String name2 = (String) entry2.getKey();
                r rVar2 = (r) entry2.getValue();
                rVar2.getClass();
                i.e(name2, "name");
                boolean z10 = rVar2.f44289b;
                L<Object> l10 = rVar2.f44288a;
                if (z10 || !bundleB.containsKey(name2) || !p248u2.b.c(bundleB, name2)) {
                    try {
                        l10.get(bundleB, name2);
                    } catch (IllegalStateException unused) {
                    }
                }
                StringBuilder sbA = C7.g.a("Wrong argument type for '", name2, "' in argument savedState. ");
                sbA.append(l10.getName());
                sbA.append(" expected.");
                throw new IllegalArgumentException(sbA.toString().toString());
            }
        }
        return bundleB;
    }

    public boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C)) {
            return false;
        }
        k kVar = this.f44219c;
        ArrayList arrayList = kVar.f44811b;
        C c10 = (C) obj;
        k kVar2 = c10.f44219c;
        boolean zA = i.a(arrayList, kVar2.f44811b);
        Y<C2747q> y10 = this.f44221e;
        int iF = y10.f();
        Y<C2747q> y11 = c10.f44221e;
        if (iF != y11.f()) {
            z10 = false;
            break;
        }
        Iterator it = ((kotlin.sequences.a) SequencesKt__SequencesKt.x(new a0(y10))).iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = true;
                break;
            }
            int iIntValue = ((Number) it.next()).intValue();
            if (!i.a(y10.c(iIntValue), y11.c(iIntValue))) {
                z10 = false;
                break;
            }
        }
        if (q().size() != c10.q().size()) {
            z11 = false;
            break;
        }
        Iterator it2 = q.H(q().entrySet()).f14965b.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z11 = true;
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            if (!c10.q().containsKey(entry.getKey()) || !i.a(c10.q().get(entry.getKey()), entry.getValue())) {
                z11 = false;
                break;
            }
        }
        return kVar.f44813d == kVar2.f44813d && i.a(kVar.f44814e, kVar2.f44814e) && zA && z10 && z11;
    }

    public int hashCode() {
        k kVar = this.f44219c;
        int i10 = kVar.f44813d * 31;
        String str = kVar.f44814e;
        int iHashCode = i10 + (str != null ? str.hashCode() : 0);
        Iterator it = kVar.f44811b.iterator();
        while (it.hasNext()) {
            iHashCode = (((z) it.next()).f44327a.hashCode() + (iHashCode * 31)) * 961;
        }
        Y<C2747q> y10 = this.f44221e;
        i.e(y10, "<this>");
        int i11 = 0;
        while (true) {
            if (!(i11 < y10.f())) {
                break;
            }
            y10.g(i11).getClass();
            iHashCode *= 961;
            i11++;
        }
        for (String str2 : q().keySet()) {
            int iB = B1.a.b(str2, iHashCode * 31, 31);
            r rVar = q().get(str2);
            iHashCode = iB + (rVar != null ? rVar.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    /* JADX WARN: Code duplicated, block: B:15:0x002f  */
    public final int[] k(C c10) {
        kotlin.collections.i iVar = new kotlin.collections.i();
        C c11 = this;
        while (true) {
            E e10 = c11.f44220d;
            E e11 = c10 != null ? c10.f44220d : null;
            k kVar = c11.f44219c;
            if (e11 != null) {
                E e12 = c10.f44220d;
                i.b(e12);
                if (e12.f44235g.a(kVar.f44813d) != c11) {
                    if (e10 != null || e10.f44235g.f44821c != kVar.f44813d) {
                        iVar.addFirst(c11);
                    }
                    if (!i.a(e10, c10) || e10 == null) {
                        break;
                    }
                    c11 = e10;
                } else {
                    iVar.addFirst(c11);
                    break;
                }
            } else {
                if (e10 != null) {
                    iVar.addFirst(c11);
                } else {
                    iVar.addFirst(c11);
                }
                if (!i.a(e10, c10)) {
                    break;
                }
                c11 = e10;
            }
        }
        List listO0 = q.o0(iVar);
        ArrayList arrayList = new ArrayList(m.y(listO0, 10));
        Iterator it = listO0.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((C) it.next()).f44219c.f44813d));
        }
        return q.n0(arrayList);
    }

    public final Map<String, r> q() {
        return y.x(this.f44219c.f44812c);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(0x");
        k kVar = this.f44219c;
        kVar.getClass();
        sb2.append(Integer.toHexString(kVar.f44813d));
        sb2.append(")");
        String str = kVar.f44814e;
        if (str != null && !n.S(str)) {
            sb2.append(" route=");
            sb2.append(kVar.f44814e);
        }
        String string = sb2.toString();
        i.d(string, "toString(...)");
        return string;
    }

    public b v(B b10) {
        boolean zE;
        Regex regex;
        kotlin.text.g gVarD;
        k kVar = this.f44219c;
        kVar.getClass();
        ArrayList<z> arrayList = kVar.f44811b;
        if (arrayList.isEmpty()) {
            return null;
        }
        b bVar = null;
        for (z zVar : arrayList) {
            zVar.getClass();
            p293xa.g gVar = zVar.f44330d;
            Regex regex2 = (Regex) gVar.getValue();
            Uri uri = b10.f44214a;
            if (regex2 == null) {
                zE = true;
            } else if (uri == null) {
                zE = false;
            } else {
                Regex regex3 = (Regex) gVar.getValue();
                i.b(regex3);
                zE = regex3.e(uri.toString());
            }
            if (zE) {
                LinkedHashMap arguments = kVar.f44812c;
                Bundle bundleD = uri != null ? zVar.d(uri, arguments) : null;
                int iB = zVar.b(uri);
                String str = b10.f44215b;
                boolean z10 = str != null && str.equals(null);
                if (bundleD == null) {
                    if (z10) {
                        i.e(arguments, "arguments");
                        y.p();
                        Bundle bundleB = c.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
                        if (uri != null && (regex = (Regex) gVar.getValue()) != null && (gVarD = regex.d(uri.toString())) != null) {
                            zVar.e(gVarD, bundleB, arguments);
                            if (((Boolean) zVar.f44331e.getValue()).booleanValue()) {
                                zVar.f(uri, bundleB, arguments);
                            }
                        }
                        if (C.e.j(arguments, new Ya.i(4, bundleB)).isEmpty()) {
                        }
                    }
                }
                b bVar2 = new b(kVar.f44810a, bundleD, zVar.f44337l, iB, z10, -1);
                if (bVar == null || bVar2.compareTo(bVar) > 0) {
                    bVar = bVar2;
                }
            }
        }
        return bVar;
    }
}
