package androidx.lifecycle;

import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.StateFlowImpl;

/* JADX INFO: renamed from: androidx.lifecycle.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LifecycleRegistry.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1378v extends Lifecycle {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p173o.a<InterfaceC1375s, a> f17827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Lifecycle.State f17828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference<InterfaceC1376t> f17829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f17831g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17832h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList<Lifecycle.State> f17833i;
    public final StateFlowImpl j;

    /* JADX INFO: renamed from: androidx.lifecycle.v$a */
    /* JADX INFO: compiled from: LifecycleRegistry.jvm.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Lifecycle.State f17834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public r f17835b;

        public final void a(InterfaceC1376t interfaceC1376t, Lifecycle.Event event) {
            Lifecycle.State stateA = event.a();
            Lifecycle.State state1 = this.f17834a;
            kotlin.jvm.internal.i.e(state1, "state1");
            if (stateA.compareTo(state1) < 0) {
                state1 = stateA;
            }
            this.f17834a = state1;
            this.f17835b.h(interfaceC1376t, event);
            this.f17834a = stateA;
        }
    }

    public C1378v(InterfaceC1376t provider) {
        kotlin.jvm.internal.i.e(provider, "provider");
        this.f17826b = true;
        this.f17827c = new p173o.a<>();
        Lifecycle.State state = Lifecycle.State.f17750c;
        this.f17828d = state;
        this.f17833i = new ArrayList<>();
        this.f17829e = new WeakReference<>(provider);
        this.j = kotlinx.coroutines.flow.B.a(state);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // androidx.lifecycle.Lifecycle
    public final void a(InterfaceC1375s observer) {
        r i10;
        InterfaceC1376t interfaceC1376t;
        ArrayList<Lifecycle.State> arrayList = this.f17833i;
        a aVar = null;
        kotlin.jvm.internal.i.e(observer, "observer");
        e("addObserver");
        Lifecycle.State state = this.f17828d;
        Lifecycle.State state2 = Lifecycle.State.f17749b;
        if (state != state2) {
            state2 = Lifecycle.State.f17750c;
        }
        a aVar2 = new a();
        HashMap map = C1381y.f17837a;
        boolean z10 = observer instanceof r;
        boolean z11 = observer instanceof InterfaceC1363f;
        if (z10 && z11) {
            i10 = new C1364g((InterfaceC1363f) observer, (r) observer);
        } else if (z11) {
            i10 = new C1364g((InterfaceC1363f) observer, null);
        } else if (z10) {
            i10 = (r) observer;
        } else {
            Class<?> cls = observer.getClass();
            if (C1381y.b(cls) == 2) {
                Object obj = C1381y.f17838b.get(cls);
                kotlin.jvm.internal.i.b(obj);
                List list = (List) obj;
                if (list.size() == 1) {
                    i10 = new V(C1381y.a((Constructor) list.get(0), observer));
                } else {
                    int size = list.size();
                    InterfaceC1368k[] interfaceC1368kArr = new InterfaceC1368k[size];
                    for (int i11 = 0; i11 < size; i11++) {
                        interfaceC1368kArr[i11] = C1381y.a((Constructor) list.get(i11), observer);
                    }
                    i10 = new C1361d(interfaceC1368kArr);
                }
            } else {
                i10 = new I(observer);
            }
        }
        aVar2.f17835b = i10;
        aVar2.f17834a = state2;
        p173o.a<InterfaceC1375s, a> aVar3 = this.f17827c;
        o.b.c<InterfaceC1375s, a> cVarD = aVar3.d(observer);
        if (cVarD != null) {
            aVar = cVarD.f45039c;
        } else {
            HashMap<K, o.b.c<K, V>> map2 = aVar3.f45033f;
            o.b.c<K, V> cVar = new o.b.c<>(observer, aVar2);
            aVar3.f45037e++;
            o.b.c<K, V> cVar2 = aVar3.f45035c;
            if (cVar2 == 0) {
                aVar3.f45034b = cVar;
                aVar3.f45035c = cVar;
            } else {
                cVar2.f45040d = cVar;
                cVar.f45041e = cVar2;
                aVar3.f45035c = cVar;
            }
            map2.put((K) observer, cVar);
        }
        if (aVar == null && (interfaceC1376t = this.f17829e.get()) != null) {
            boolean z12 = this.f17830f != 0 || this.f17831g;
            Lifecycle.State stateD = d(observer);
            this.f17830f++;
            while (aVar2.f17834a.compareTo(stateD) < 0 && this.f17827c.f45033f.containsKey(observer)) {
                arrayList.add(aVar2.f17834a);
                Lifecycle.Event.a aVar4 = Lifecycle.Event.Companion;
                Lifecycle.State state3 = aVar2.f17834a;
                aVar4.getClass();
                Lifecycle.Event eventB = Lifecycle.Event.a.b(state3);
                if (eventB == null) {
                    throw new IllegalStateException("no event up from " + aVar2.f17834a);
                }
                aVar2.a(interfaceC1376t, eventB);
                arrayList.remove(arrayList.size() - 1);
                stateD = d(observer);
            }
            if (!z12) {
                i();
            }
            this.f17830f--;
        }
    }

    @Override // androidx.lifecycle.Lifecycle
    public final Lifecycle.State b() {
        return this.f17828d;
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void c(InterfaceC1375s observer) {
        kotlin.jvm.internal.i.e(observer, "observer");
        e("removeObserver");
        this.f17827c.e(observer);
    }

    public final Lifecycle.State d(InterfaceC1375s interfaceC1375s) {
        HashMap<InterfaceC1375s, o.b.c<InterfaceC1375s, a>> map = this.f17827c.f45033f;
        o.b.c<InterfaceC1375s, a> cVar = map.containsKey(interfaceC1375s) ? map.get(interfaceC1375s).f45041e : null;
        Lifecycle.State state = cVar != null ? cVar.f45039c.f17834a : null;
        ArrayList<Lifecycle.State> arrayList = this.f17833i;
        Lifecycle.State state2 = arrayList.isEmpty() ? null : (Lifecycle.State) Z3.n.f(1, arrayList);
        Lifecycle.State state1 = this.f17828d;
        kotlin.jvm.internal.i.e(state1, "state1");
        if (state == null || state.compareTo(state1) >= 0) {
            state = state1;
        }
        return (state2 == null || state2.compareTo(state) >= 0) ? state : state2;
    }

    public final void e(String str) {
        if (this.f17826b && !p160n.b.i0().j0()) {
            throw new IllegalStateException(androidx.compose.foundation.gestures.d.b("Method ", str, " must be called on the main thread").toString());
        }
    }

    public final void f(Lifecycle.Event event) {
        kotlin.jvm.internal.i.e(event, "event");
        e("handleLifecycleEvent");
        g(event.a());
    }

    public final void g(Lifecycle.State next) {
        if (this.f17828d == next) {
            return;
        }
        InterfaceC1376t interfaceC1376t = this.f17829e.get();
        Lifecycle.State current = this.f17828d;
        kotlin.jvm.internal.i.e(current, "current");
        kotlin.jvm.internal.i.e(next, "next");
        if (current == Lifecycle.State.f17750c && next == Lifecycle.State.f17749b) {
            throw new IllegalStateException(("State must be at least '" + Lifecycle.State.f17751d + "' to be moved to '" + next + "' in component " + interfaceC1376t).toString());
        }
        Lifecycle.State state = Lifecycle.State.f17749b;
        if (current == state && current != next) {
            throw new IllegalStateException(("State is '" + state + "' and cannot be moved to `" + next + "` in component " + interfaceC1376t).toString());
        }
        this.f17828d = next;
        if (this.f17831g || this.f17830f != 0) {
            this.f17832h = true;
            return;
        }
        this.f17831g = true;
        i();
        this.f17831g = false;
        if (this.f17828d == state) {
            this.f17827c = new p173o.a<>();
        }
    }

    public final void h(Lifecycle.State state) {
        kotlin.jvm.internal.i.e(state, "state");
        e("setCurrentState");
        g(state);
    }

    public final void i() {
        InterfaceC1376t interfaceC1376t = this.f17829e.get();
        if (interfaceC1376t == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            p173o.a<InterfaceC1375s, a> aVar = this.f17827c;
            if (aVar.f45037e != 0) {
                o.b.c<InterfaceC1375s, a> cVar = aVar.f45034b;
                kotlin.jvm.internal.i.b(cVar);
                Lifecycle.State state = cVar.f45039c.f17834a;
                o.b.c<InterfaceC1375s, a> cVar2 = this.f17827c.f45035c;
                kotlin.jvm.internal.i.b(cVar2);
                Lifecycle.State state2 = cVar2.f45039c.f17834a;
                if (state == state2 && this.f17828d == state2) {
                    break;
                }
                this.f17832h = false;
                Lifecycle.State state3 = this.f17828d;
                o.b.c<InterfaceC1375s, a> cVar3 = this.f17827c.f45034b;
                kotlin.jvm.internal.i.b(cVar3);
                if (state3.compareTo(cVar3.f45039c.f17834a) < 0) {
                    p173o.a<InterfaceC1375s, a> aVar2 = this.f17827c;
                    p173o.b.C0511b c0511b = new p173o.b.C0511b(aVar2.f45035c, aVar2.f45034b);
                    aVar2.f45036d.put(c0511b, Boolean.FALSE);
                    while (c0511b.hasNext() && !this.f17832h) {
                        Map.Entry entry = (Map.Entry) c0511b.next();
                        kotlin.jvm.internal.i.b(entry);
                        InterfaceC1375s interfaceC1375s = (InterfaceC1375s) entry.getKey();
                        a aVar3 = (a) entry.getValue();
                        while (aVar3.f17834a.compareTo(this.f17828d) > 0 && !this.f17832h && this.f17827c.f45033f.containsKey(interfaceC1375s)) {
                            Lifecycle.Event.a aVar4 = Lifecycle.Event.Companion;
                            Lifecycle.State state4 = aVar3.f17834a;
                            aVar4.getClass();
                            Lifecycle.Event eventA = Lifecycle.Event.a.a(state4);
                            if (eventA == null) {
                                throw new IllegalStateException("no event down from " + aVar3.f17834a);
                            }
                            this.f17833i.add(eventA.a());
                            aVar3.a(interfaceC1376t, eventA);
                            ArrayList<Lifecycle.State> arrayList = this.f17833i;
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                o.b.c<InterfaceC1375s, a> cVar4 = this.f17827c.f45035c;
                if (!this.f17832h && cVar4 != null && this.f17828d.compareTo(cVar4.f45039c.f17834a) > 0) {
                    p173o.a<InterfaceC1375s, a> aVar5 = this.f17827c;
                    aVar5.getClass();
                    o.b.d dVar = new o.b.d();
                    aVar5.f45036d.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.f17832h) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        InterfaceC1375s interfaceC1375s2 = (InterfaceC1375s) entry2.getKey();
                        a aVar6 = (a) entry2.getValue();
                        while (aVar6.f17834a.compareTo(this.f17828d) < 0 && !this.f17832h && this.f17827c.f45033f.containsKey(interfaceC1375s2)) {
                            this.f17833i.add(aVar6.f17834a);
                            Lifecycle.Event.a aVar7 = Lifecycle.Event.Companion;
                            Lifecycle.State state5 = aVar6.f17834a;
                            aVar7.getClass();
                            Lifecycle.Event eventB = Lifecycle.Event.a.b(state5);
                            if (eventB == null) {
                                throw new IllegalStateException("no event up from " + aVar6.f17834a);
                            }
                            aVar6.a(interfaceC1376t, eventB);
                            ArrayList<Lifecycle.State> arrayList2 = this.f17833i;
                            arrayList2.remove(arrayList2.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.f17832h = false;
        this.j.setValue(this.f17828d);
    }
}
