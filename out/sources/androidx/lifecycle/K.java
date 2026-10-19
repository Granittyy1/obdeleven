package androidx.lifecycle;

import java.util.LinkedHashMap;
import kotlin.collections.builders.MapBuilder;

/* JADX INFO: compiled from: SavedStateHandle.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f17742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p002a1.b f17743b;

    /* JADX INFO: compiled from: SavedStateHandle.android.kt */
    public static final class a<T> extends C<T> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f17744l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public K f17745m;

        @Override // androidx.lifecycle.AbstractC1382z
        public final void j(T t8) {
            p002a1.b bVar;
            K k10 = this.f17745m;
            if (k10 != null && (bVar = k10.f17743b) != null) {
                bVar.a(t8, this.f17744l);
            }
            super.j(t8);
        }
    }

    public K(MapBuilder mapBuilder) {
        this.f17742a = new LinkedHashMap();
        this.f17743b = new p002a1.b(mapBuilder);
    }

    public final a a(Object obj, String str) {
        p002a1.b bVar = this.f17743b;
        if (bVar.f7996d.containsKey(str)) {
            throw new IllegalArgumentException(androidx.compose.foundation.gestures.d.b("StateFlow and LiveData are mutually exclusive for the same key. Please use either 'getMutableStateFlow' or 'getLiveData' for key '", str, "', but not both.").toString());
        }
        LinkedHashMap linkedHashMap = this.f17742a;
        Object obj2 = linkedHashMap.get(str);
        if (obj2 == null) {
            LinkedHashMap linkedHashMap2 = bVar.f7993a;
            if (linkedHashMap2.containsKey(str)) {
                a aVar = new a(linkedHashMap2.get(str));
                aVar.f17744l = str;
                aVar.f17745m = this;
                obj2 = aVar;
            } else {
                linkedHashMap2.put(str, obj);
                a aVar2 = new a(obj);
                aVar2.f17744l = str;
                aVar2.f17745m = this;
                obj2 = aVar2;
            }
            linkedHashMap.put(str, obj2);
        }
        return (a) obj2;
    }

    public K() {
        this.f17742a = new LinkedHashMap();
        this.f17743b = new p002a1.b(kotlin.collections.y.p());
    }
}
