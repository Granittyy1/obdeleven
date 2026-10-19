package androidx.lifecycle;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;

/* JADX INFO: compiled from: SavedStateHandleSupport.kt */
/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f17760a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f17761b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f17762c = new d();

    /* JADX INFO: compiled from: SavedStateHandleSupport.kt */
    public static final class a implements a0.c {
        @Override // androidx.lifecycle.a0.c
        public final <T extends Y> T create(Oa.c<T> cVar, p014b1.a aVar) {
            return new Q();
        }
    }

    /* JADX INFO: compiled from: CreationExtras.kt */
    public static final class b implements b1.a.b<p248u2.e> {
    }

    /* JADX INFO: compiled from: CreationExtras.kt */
    public static final class c implements b1.a.b<c0> {
    }

    /* JADX INFO: compiled from: CreationExtras.kt */
    public static final class d implements b1.a.b<Bundle> {
    }

    public static final K a(p014b1.a aVar) {
        kotlin.jvm.internal.i.e(aVar, "<this>");
        p248u2.e eVar = (p248u2.e) aVar.a(f17760a);
        if (eVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        c0 c0Var = (c0) aVar.a(f17761b);
        if (c0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) aVar.a(f17762c);
        String str = (String) aVar.a(a0.f17795b);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        u2.c.b bVarB = eVar.getSavedStateRegistry().b();
        Bundle bundle2 = null;
        P p10 = bVarB instanceof P ? (P) bVarB : null;
        if (p10 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap = c(c0Var).f17769a;
        K k10 = (K) linkedHashMap.get(str);
        if (k10 == null) {
            p10.b();
            Bundle bundle3 = p10.f17767c;
            if (bundle3 != null && bundle3.containsKey(str)) {
                Bundle bundle4 = bundle3.getBundle(str);
                if (bundle4 == null) {
                    kotlin.collections.y.p();
                    bundle4 = p271w0.c.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
                }
                bundle3.remove(str);
                if (bundle3.isEmpty()) {
                    p10.f17767c = null;
                }
                bundle2 = bundle4;
            }
            if (bundle2 != null) {
                bundle = bundle2;
            }
            if (bundle == null) {
                k10 = new K();
            } else {
                ClassLoader classLoader = K.class.getClassLoader();
                kotlin.jvm.internal.i.b(classLoader);
                bundle.setClassLoader(classLoader);
                MapBuilder mapBuilder = new MapBuilder(bundle.size());
                for (String str2 : bundle.keySet()) {
                    kotlin.jvm.internal.i.b(str2);
                    mapBuilder.put(str2, bundle.get(str2));
                }
                k10 = new K(mapBuilder.k());
            }
            linkedHashMap.put(str, k10);
        }
        return k10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends p248u2.e & c0> void b(T t8) {
        kotlin.jvm.internal.i.e(t8, "<this>");
        Lifecycle.State stateB = t8.getLifecycle().b();
        if (stateB != Lifecycle.State.f17750c && stateB != Lifecycle.State.f17751d) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (t8.getSavedStateRegistry().b() == null) {
            P p10 = new P(t8.getSavedStateRegistry(), t8);
            t8.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", p10);
            t8.getLifecycle().a(new L(p10));
        }
    }

    public static final Q c(c0 c0Var) {
        kotlin.jvm.internal.i.e(c0Var, "<this>");
        a0 a0VarA = a0.b.a(c0Var, new a(), 4);
        return (Q) a0VarA.f17796a.a(kotlin.jvm.internal.l.a(Q.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
