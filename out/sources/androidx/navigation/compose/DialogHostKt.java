package androidx.navigation.compose;

import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.X;
import androidx.compose.runtime.saveable.SaveableStateHolderImpl;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.lifecycle.C1378v;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Lifecycle;
import com.google.android.gms.internal.measurement.Y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import p141l2.C2749t;

/* JADX INFO: compiled from: DialogHost.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DialogHostKt {

    /* JADX INFO: compiled from: DialogHost.kt */
    public static final class a implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C2749t f19079b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C1423p f19080c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ SaveableStateHolderImpl f19081d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ SnapshotStateList<C2749t> f19082e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ C1423p.a f19083f;

        public a(C2749t c2749t, C1423p c1423p, SaveableStateHolderImpl saveableStateHolderImpl, SnapshotStateList snapshotStateList, C1423p.a aVar) {
            this.f19079b = c2749t;
            this.f19080c = c1423p;
            this.f19081d = saveableStateHolderImpl;
            this.f19082e = snapshotStateList;
            this.f19083f = aVar;
        }

        @Override // Ia.p
        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
            if ((num.intValue() & 3) == 2 && interfaceC1084f2.s()) {
                interfaceC1084f2.w();
            } else {
                final C2749t c2749t = this.f19079b;
                boolean zK = interfaceC1084f2.k(c2749t);
                final C1423p c1423p = this.f19080c;
                boolean zK2 = zK | interfaceC1084f2.k(c1423p);
                Object objF = interfaceC1084f2.f();
                if (zK2 || objF == InterfaceC1084f.a.f12980a) {
                    final SnapshotStateList<C2749t> snapshotStateList = this.f19082e;
                    objF = new Ia.l() { // from class: androidx.navigation.compose.l
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            SnapshotStateList snapshotStateList2 = snapshotStateList;
                            C2749t c2749t2 = c2749t;
                            snapshotStateList2.add(c2749t2);
                            return new C1421n(snapshotStateList2, c1423p, c2749t2);
                        }
                    };
                    interfaceC1084f2.E(objF);
                }
                androidx.compose.runtime.E.a(c2749t, (Ia.l) objF, interfaceC1084f2);
                Y.c(c2749t, this.f19081d, androidx.compose.runtime.internal.a.b(-497631156, new C1420m(this.f19083f, c2749t), interfaceC1084f2), interfaceC1084f2, 384);
            }
            return p293xa.r.f47939a;
        }
    }

    public static final void a(final C1423p c1423p, InterfaceC1084f interfaceC1084f, final int i10) {
        C1086g c1086gP = interfaceC1084f.p(294589392);
        if ((((i10 & 6) == 0 ? (c1086gP.k(c1423p) ? 4 : 2) | i10 : i10) & 3) == 2 && c1086gP.s()) {
            c1086gP.w();
        } else {
            SaveableStateHolderImpl saveableStateHolderImplA = androidx.compose.runtime.saveable.e.a(c1086gP);
            boolean z10 = false;
            X xA = J0.a(c1423p.b().f44278e, c1086gP, 0);
            List list = (List) xA.getValue();
            boolean zBooleanValue = ((Boolean) c1086gP.x(InspectionModeKt.f14931a)).booleanValue();
            boolean zK = c1086gP.K(list);
            Object objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            Object obj = objF;
            if (zK || objF == c0153a) {
                SnapshotStateList snapshotStateList = new SnapshotStateList();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    C2749t c2749t = (C2749t) obj2;
                    if (zBooleanValue || c2749t.f44305i.j.f17828d.compareTo(Lifecycle.State.f17752e) >= 0) {
                        arrayList.add(obj2);
                    }
                }
                snapshotStateList.addAll(arrayList);
                c1086gP.E(snapshotStateList);
                obj = snapshotStateList;
            }
            SnapshotStateList snapshotStateList2 = (SnapshotStateList) obj;
            b(snapshotStateList2, (List) xA.getValue(), c1086gP, 0);
            X xA2 = J0.a(c1423p.b().f44279f, c1086gP, 0);
            Object objF2 = c1086gP.f();
            if (objF2 == c0153a) {
                objF2 = new SnapshotStateList();
                c1086gP.E(objF2);
            }
            SnapshotStateList snapshotStateList3 = (SnapshotStateList) objF2;
            c1086gP.L(-367418626);
            ListIterator listIterator = snapshotStateList2.listIterator();
            while (true) {
                androidx.compose.runtime.snapshots.n nVar = (androidx.compose.runtime.snapshots.n) listIterator;
                if (!nVar.hasNext()) {
                    break;
                }
                C2749t c2749t2 = (C2749t) nVar.next();
                p141l2.C c10 = c2749t2.f44299c;
                kotlin.jvm.internal.i.c(c10, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination");
                C1423p.a aVar = (C1423p.a) c10;
                boolean zK2 = c1086gP.k(c1423p) | c1086gP.k(c2749t2);
                Object objF3 = c1086gP.f();
                if (zK2 || objF3 == c0153a) {
                    objF3 = new C1414g(c1423p, 0, c2749t2);
                    c1086gP.E(objF3);
                }
                AndroidDialog_androidKt.a((Ia.a) objF3, aVar.f19190g, androidx.compose.runtime.internal.a.b(1129586364, new a(c2749t2, c1423p, saveableStateHolderImplA, snapshotStateList3, aVar), c1086gP), c1086gP, 384, 0);
                xA2 = xA2;
                snapshotStateList3 = snapshotStateList3;
                z10 = false;
                c0153a = c0153a;
            }
            SnapshotStateList snapshotStateList4 = snapshotStateList3;
            X x10 = xA2;
            InterfaceC1084f.a.C0153a c0153a2 = c0153a;
            c1086gP.T(z10);
            Set set = (Set) x10.getValue();
            boolean zK3 = c1086gP.K(x10) | c1086gP.k(c1423p);
            Object objF4 = c1086gP.f();
            if (zK3 || objF4 == c0153a2) {
                objF4 = new DialogHostKt$DialogHost$2$1(x10, c1423p, snapshotStateList4, null);
                c1086gP.E(objF4);
            }
            androidx.compose.runtime.E.e(set, snapshotStateList4, (Ia.p) objF4, c1086gP);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: androidx.navigation.compose.h
                @Override // Ia.p
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    int iL = L4.b.l(i10 | 1);
                    DialogHostKt.a(c1423p, (InterfaceC1084f) obj3, iL);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void b(final SnapshotStateList snapshotStateList, final Collection collection, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(1537894851);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.k(snapshotStateList) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.k(collection) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c1086gP.s()) {
            c1086gP.w();
        } else {
            final boolean zBooleanValue = ((Boolean) c1086gP.x(InspectionModeKt.f14931a)).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                final C2749t c2749t = (C2749t) it.next();
                C1378v c1378v = c2749t.f44305i.j;
                boolean zC = c1086gP.c(zBooleanValue) | c1086gP.k(snapshotStateList) | c1086gP.k(c2749t);
                Object objF = c1086gP.f();
                if (zC || objF == InterfaceC1084f.a.f12980a) {
                    objF = new Ia.l() { // from class: androidx.navigation.compose.i
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r4v2, types: [androidx.lifecycle.s, androidx.navigation.compose.k] */
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            final C2749t c2749t2 = c2749t;
                            final boolean z10 = zBooleanValue;
                            final SnapshotStateList snapshotStateList2 = snapshotStateList;
                            ?? r10 = new androidx.lifecycle.r() { // from class: androidx.navigation.compose.k
                                @Override // androidx.lifecycle.r
                                public final void h(InterfaceC1376t interfaceC1376t, Lifecycle.Event event) {
                                    C2749t c2749t3 = c2749t2;
                                    boolean z11 = z10;
                                    SnapshotStateList snapshotStateList3 = snapshotStateList2;
                                    if (z11 && !snapshotStateList3.contains(c2749t3)) {
                                        snapshotStateList3.add(c2749t3);
                                    }
                                    if (event == Lifecycle.Event.ON_START && !snapshotStateList3.contains(c2749t3)) {
                                        snapshotStateList3.add(c2749t3);
                                    }
                                    if (event == Lifecycle.Event.ON_STOP) {
                                        snapshotStateList3.remove(c2749t3);
                                    }
                                }
                            };
                            c2749t2.f44305i.j.a(r10);
                            return new C1422o(c2749t2, r10);
                        }
                    };
                    c1086gP.E(objF);
                }
                androidx.compose.runtime.E.a(c1378v, (Ia.l) objF, c1086gP);
            }
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: androidx.navigation.compose.j
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = L4.b.l(i10 | 1);
                    DialogHostKt.b(snapshotStateList, collection, (InterfaceC1084f) obj, iL);
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
