package Y6;

import T4.S;
import W6.n;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: DaggerAppComponent.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements p268va.a<Map<String, p268va.a<n>>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f7615a;

    public a(e eVar) {
        this.f7615a = eVar;
    }

    @Override // p268va.a
    public final Map<String, p268va.a<n>> get() {
        e eVar = this.f7615a;
        S s10 = new S();
        Z6.n nVar = eVar.f7628d;
        LinkedHashMap linkedHashMap = (LinkedHashMap) s10.f5887b;
        linkedHashMap.put("IMAGE_ONLY_PORTRAIT", nVar);
        linkedHashMap.put("IMAGE_ONLY_LANDSCAPE", eVar.f7629e);
        linkedHashMap.put("MODAL_LANDSCAPE", eVar.f7630f);
        linkedHashMap.put("MODAL_PORTRAIT", eVar.f7631g);
        linkedHashMap.put("CARD_LANDSCAPE", eVar.f7632h);
        linkedHashMap.put("CARD_PORTRAIT", eVar.f7633i);
        linkedHashMap.put("BANNER_PORTRAIT", eVar.j);
        linkedHashMap.put("BANNER_LANDSCAPE", eVar.f7634k);
        Map<String, p268va.a<n>> mapEmptyMap = linkedHashMap.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(linkedHashMap);
        if (mapEmptyMap != null) {
            return mapEmptyMap;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
