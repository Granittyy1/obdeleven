package androidx.compose.runtime.saveable;

import androidx.collection.K;
import androidx.compose.runtime.A;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SaveableStateHolderImpl f13137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f13139c;

    public d(SaveableStateHolderImpl saveableStateHolderImpl, Object obj, f fVar) {
        this.f13137a = saveableStateHolderImpl;
        this.f13138b = obj;
        this.f13139c = fVar;
    }

    @Override // androidx.compose.runtime.A
    public final void dispose() {
        SaveableStateHolderImpl saveableStateHolderImpl = this.f13137a;
        K<Object, f> k10 = saveableStateHolderImpl.f13126b;
        Object obj = this.f13138b;
        f fVarJ = k10.j(obj);
        f fVar = this.f13139c;
        if (fVarJ == fVar) {
            Map<String, List<Object>> mapB = fVar.b();
            boolean zIsEmpty = mapB.isEmpty();
            Map<Object, Map<String, List<Object>>> map = saveableStateHolderImpl.f13125a;
            if (zIsEmpty) {
                map.remove(obj);
            } else {
                map.put(obj, mapB);
            }
        }
    }
}
