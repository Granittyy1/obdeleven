package androidx.compose.animation;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f9659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f9660b;

    static {
        LinkedHashMap linkedHashMap = null;
        q qVar = null;
        A a10 = null;
        i iVar = null;
        w wVar = null;
        f9659a = new p(new E(qVar, a10, iVar, wVar, false, linkedHashMap, 63));
        f9660b = new p(new E(qVar, a10, iVar, wVar, true, linkedHashMap, 47));
    }

    public abstract E a();

    public final p b(o oVar) {
        q qVar = oVar.a().f9270a;
        if (qVar == null) {
            qVar = a().f9270a;
        }
        q qVar2 = qVar;
        A a10 = oVar.a().f9271b;
        if (a10 == null) {
            a10 = a().f9271b;
        }
        A a11 = a10;
        i iVar = oVar.a().f9272c;
        if (iVar == null) {
            iVar = a().f9272c;
        }
        i iVar2 = iVar;
        w wVar = oVar.a().f9273d;
        if (wVar == null) {
            wVar = a().f9273d;
        }
        w wVar2 = wVar;
        boolean z10 = oVar.a().f9274e || a().f9274e;
        Map<Object, Object> map = a().f9275f;
        Map<Object, Object> map2 = oVar.a().f9275f;
        kotlin.jvm.internal.i.e(map, "<this>");
        kotlin.jvm.internal.i.e(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new p(new E(qVar2, a11, iVar2, wVar2, z10, linkedHashMap));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o) && kotlin.jvm.internal.i.a(((o) obj).a(), a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        if (equals(f9659a)) {
            return "ExitTransition.None";
        }
        if (equals(f9660b)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        E eA = a();
        StringBuilder sb2 = new StringBuilder("ExitTransition: \nFade - ");
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
        sb2.append(",\nKeepUntilTransitionsFinished - ");
        sb2.append(eA.f9274e);
        return sb2.toString();
    }
}
