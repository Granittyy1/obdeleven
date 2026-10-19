package androidx.compose.animation;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f9270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A f9271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f9272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f9273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<Object, Object> f9275f;

    public E() {
        this(null, null, null, null, false, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e10 = (E) obj;
        return kotlin.jvm.internal.i.a(this.f9270a, e10.f9270a) && kotlin.jvm.internal.i.a(this.f9271b, e10.f9271b) && kotlin.jvm.internal.i.a(this.f9272c, e10.f9272c) && kotlin.jvm.internal.i.a(this.f9273d, e10.f9273d) && this.f9274e == e10.f9274e && kotlin.jvm.internal.i.a(this.f9275f, e10.f9275f);
    }

    public final int hashCode() {
        q qVar = this.f9270a;
        int iHashCode = (qVar == null ? 0 : qVar.hashCode()) * 31;
        A a10 = this.f9271b;
        int iHashCode2 = (iHashCode + (a10 == null ? 0 : a10.hashCode())) * 31;
        i iVar = this.f9272c;
        int iHashCode3 = (iHashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        w wVar = this.f9273d;
        return this.f9275f.hashCode() + D.b((iHashCode3 + (wVar != null ? wVar.hashCode() : 0)) * 31, 31, this.f9274e);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f9270a + ", slide=" + this.f9271b + ", changeSize=" + this.f9272c + ", scale=" + this.f9273d + ", hold=" + this.f9274e + ", effectsMap=" + this.f9275f + ')';
    }

    public E(q qVar, A a10, i iVar, w wVar, boolean z10, Map<Object, Object> map) {
        this.f9270a = qVar;
        this.f9271b = a10;
        this.f9272c = iVar;
        this.f9273d = wVar;
        this.f9274e = z10;
        this.f9275f = map;
    }

    public /* synthetic */ E(q qVar, A a10, i iVar, w wVar, boolean z10, LinkedHashMap linkedHashMap, int i10) {
        this((i10 & 1) != 0 ? null : qVar, (i10 & 2) != 0 ? null : a10, (i10 & 4) != 0 ? null : iVar, (i10 & 8) == 0 ? wVar : null, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? kotlin.collections.y.p() : linkedHashMap);
    }
}
