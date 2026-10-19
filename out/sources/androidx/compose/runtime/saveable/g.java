package androidx.compose.runtime.saveable;

import androidx.collection.K;
import java.util.List;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SaveableStateRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g implements f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K<String, List<Ia.a<Object>>> f13140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Lambda f13142c;

    /* JADX WARN: Multi-variable type inference failed */
    public g(K<String, List<Ia.a<Object>>> k10, String str, Ia.a<? extends Object> aVar) {
        this.f13140a = k10;
        this.f13141b = str;
        this.f13142c = (Lambda) aVar;
    }

    @Override // androidx.compose.runtime.saveable.f.a
    public final void a() {
        K<String, List<Ia.a<Object>>> k10 = this.f13140a;
        String str = this.f13141b;
        List<Ia.a<Object>> listJ = k10.j(str);
        if (listJ != null) {
            listJ.remove(this.f13142c);
        }
        List<Ia.a<Object>> list = listJ;
        if (list == null || list.isEmpty()) {
            return;
        }
        k10.l(str, listJ);
    }
}
