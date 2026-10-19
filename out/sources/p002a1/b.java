package p002a1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.y;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.flow.q;

/* JADX INFO: compiled from: SavedStateHandleImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f7993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f7994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f7995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f7996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f7997e;

    public b(Map<String, ? extends Object> initialState) {
        i.e(initialState, "initialState");
        this.f7993a = y.y(initialState);
        this.f7994b = new LinkedHashMap();
        this.f7995c = new LinkedHashMap();
        this.f7996d = new LinkedHashMap();
        this.f7997e = new a(this);
    }

    public final void a(Object obj, String key) {
        i.e(key, "key");
        this.f7993a.put(key, obj);
        q qVar = (q) this.f7995c.get(key);
        if (qVar != null) {
            qVar.setValue(obj);
        }
        q qVar2 = (q) this.f7996d.get(key);
        if (qVar2 != null) {
            qVar2.setValue(obj);
        }
    }
}
