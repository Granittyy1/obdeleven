package H7;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ComponentMonitor.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public final List<p228s6.a<?>> a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (p228s6.a<?> aVar : componentRegistrar.getComponents()) {
            String str = aVar.f46930a;
            if (str != null) {
                a aVar2 = new a(str, aVar);
                aVar = new p228s6.a<>(str, aVar.f46931b, aVar.f46932c, aVar.f46933d, aVar.f46934e, aVar2, aVar.f46936g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }
}
