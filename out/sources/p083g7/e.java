package p083g7;

import Q3.k;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;

/* JADX INFO: compiled from: CardMessage.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f35618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f35619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f35620f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f35621g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f35622h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f f35623i;
    public final f j;

    public e() {
        throw null;
    }

    public e(k kVar, n nVar, n nVar2, f fVar, f fVar2, String str, a aVar, a aVar2, Map map) {
        super(kVar, MessageType.CARD, map);
        this.f35618d = nVar;
        this.f35619e = nVar2;
        this.f35623i = fVar;
        this.j = fVar2;
        this.f35620f = str;
        this.f35621g = aVar;
        this.f35622h = aVar2;
    }

    @Override // p083g7.h
    @Deprecated
    public final f a() {
        return this.f35623i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (hashCode() != eVar.hashCode()) {
            return false;
        }
        n nVar = eVar.f35619e;
        n nVar2 = this.f35619e;
        if ((nVar2 == null && nVar != null) || (nVar2 != null && !nVar2.equals(nVar))) {
            return false;
        }
        a aVar = eVar.f35622h;
        a aVar2 = this.f35622h;
        if ((aVar2 == null && aVar != null) || (aVar2 != null && !aVar2.equals(aVar))) {
            return false;
        }
        f fVar = eVar.f35623i;
        f fVar2 = this.f35623i;
        if ((fVar2 == null && fVar != null) || (fVar2 != null && !fVar2.equals(fVar))) {
            return false;
        }
        f fVar3 = eVar.j;
        f fVar4 = this.j;
        return (fVar4 != null || fVar3 == null) && (fVar4 == null || fVar4.equals(fVar3)) && this.f35618d.equals(eVar.f35618d) && this.f35621g.equals(eVar.f35621g) && this.f35620f.equals(eVar.f35620f);
    }

    public final int hashCode() {
        n nVar = this.f35619e;
        int iHashCode = nVar != null ? nVar.hashCode() : 0;
        a aVar = this.f35622h;
        int iHashCode2 = aVar != null ? aVar.hashCode() : 0;
        f fVar = this.f35623i;
        int iHashCode3 = fVar != null ? fVar.f35624a.hashCode() : 0;
        f fVar2 = this.j;
        return this.f35621g.hashCode() + this.f35620f.hashCode() + this.f35618d.hashCode() + iHashCode + iHashCode2 + iHashCode3 + (fVar2 != null ? fVar2.f35624a.hashCode() : 0);
    }
}
