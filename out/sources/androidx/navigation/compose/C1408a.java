package androidx.navigation.compose;

import androidx.lifecycle.Y;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;

/* JADX INFO: renamed from: androidx.navigation.compose.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: NavBackStackEntryProvider.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1408a extends Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19147a = "SaveableStateHolder_BackStackEntryKey";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p137kb.b f19149c;

    public C1408a(androidx.lifecycle.K k10) {
        Object value;
        k10.getClass();
        p002a1.b bVar = k10.f17743b;
        LinkedHashMap linkedHashMap = bVar.f7993a;
        LinkedHashMap linkedHashMap2 = bVar.f7996d;
        try {
            kotlinx.coroutines.flow.q qVar = (kotlinx.coroutines.flow.q) linkedHashMap2.get("SaveableStateHolder_BackStackEntryKey");
            if (qVar == null || (value = qVar.getValue()) == null) {
                value = linkedHashMap.get("SaveableStateHolder_BackStackEntryKey");
            }
        } catch (ClassCastException unused) {
            linkedHashMap.remove("SaveableStateHolder_BackStackEntryKey");
            bVar.f7995c.remove("SaveableStateHolder_BackStackEntryKey");
            linkedHashMap2.remove("SaveableStateHolder_BackStackEntryKey");
            value = null;
        }
        String string = (String) value;
        if (string == null) {
            string = UUID.randomUUID().toString();
            String key = this.f19147a;
            kotlin.jvm.internal.i.e(key, "key");
            if (string != null) {
                ArrayList arrayList = p002a1.c.f7998a;
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    do {
                        if (it.hasNext()) {
                        }
                    } while (!((Class) it.next()).isInstance(string));
                }
                throw new IllegalArgumentException(("Can't put value with type " + string.getClass() + " into saved state").toString());
            }
            ArrayList arrayList2 = p002a1.c.f7998a;
            Object obj = k10.f17742a.get(key);
            androidx.lifecycle.C c10 = obj instanceof androidx.lifecycle.C ? (androidx.lifecycle.C) obj : null;
            if (c10 != null) {
                c10.j(string);
            }
            bVar.a(string, key);
        }
        this.f19148b = string;
    }

    @Override // androidx.lifecycle.Y
    public final void onCleared() {
        super.onCleared();
        p137kb.b bVar = this.f19149c;
        if (bVar == null) {
            kotlin.jvm.internal.i.m("saveableStateHolderRef");
            throw null;
        }
        androidx.compose.runtime.saveable.c cVar = (androidx.compose.runtime.saveable.c) ((WeakReference) bVar.f42919a).get();
        if (cVar != null) {
            cVar.f(this.f19148b);
        }
        p137kb.b bVar2 = this.f19149c;
        if (bVar2 != null) {
            ((WeakReference) bVar2.f42919a).clear();
        } else {
            kotlin.jvm.internal.i.m("saveableStateHolderRef");
            throw null;
        }
    }
}
