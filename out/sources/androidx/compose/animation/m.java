package androidx.compose.animation;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f9657a = new n(new E(null, null, null, null, false, null, 63));

    public abstract E a();

    public final n b(m mVar) {
        q qVar = mVar.a().f9270a;
        if (qVar == null) {
            qVar = a().f9270a;
        }
        q qVar2 = qVar;
        A a10 = mVar.a().f9271b;
        if (a10 == null) {
            a10 = a().f9271b;
        }
        A a11 = a10;
        i iVar = mVar.a().f9272c;
        if (iVar == null) {
            iVar = a().f9272c;
        }
        i iVar2 = iVar;
        w wVar = mVar.a().f9273d;
        if (wVar == null) {
            wVar = a().f9273d;
        }
        w wVar2 = wVar;
        Map<Object, Object> map = a().f9275f;
        Map<Object, Object> map2 = mVar.a().f9275f;
        kotlin.jvm.internal.i.e(map, "<this>");
        kotlin.jvm.internal.i.e(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new n(new E(qVar2, a11, iVar2, wVar2, false, linkedHashMap, 16));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof m) && kotlin.jvm.internal.i.a(((m) obj).a(), a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        if (equals(f9657a)) {
            return "EnterTransition.None";
        }
        E eA = a();
        StringBuilder sb2 = new StringBuilder("EnterTransition: \nFade - ");
        q qVar = eA.f9270a;
        sb2.append(qVar != null ? qVar.toString() : null);
        sb2.append(",\nSlide - ");
        A a10 = eA.f9271b;
        sb2.append(a10 != null ? a10.toString() : null);
        sb2.append(",\nShrink - ");
        i iVar = eA.f9272c;
        sb2.append(iVar != null ? iVar.toString() : null);
        sb2.append(",\nScale - ");
        w wVar = eA.f9273d;
        sb2.append(wVar != null ? wVar.toString() : null);
        return sb2.toString();
    }
}
