package p083g7;

import Q3.k;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;

/* JADX INFO: compiled from: BannerMessage.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f35611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f35612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f35613f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f35614g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f35615h;

    public c() {
        throw null;
    }

    public c(k kVar, n nVar, n nVar2, f fVar, a aVar, String str, Map map) {
        super(kVar, MessageType.BANNER, map);
        this.f35611d = nVar;
        this.f35612e = nVar2;
        this.f35613f = fVar;
        this.f35614g = aVar;
        this.f35615h = str;
    }

    @Override // p083g7.h
    public final f a() {
        return this.f35613f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (hashCode() != cVar.hashCode()) {
            return false;
        }
        n nVar = cVar.f35612e;
        n nVar2 = this.f35612e;
        if ((nVar2 == null && nVar != null) || (nVar2 != null && !nVar2.equals(nVar))) {
            return false;
        }
        f fVar = cVar.f35613f;
        f fVar2 = this.f35613f;
        if ((fVar2 == null && fVar != null) || (fVar2 != null && !fVar2.equals(fVar))) {
            return false;
        }
        a aVar = cVar.f35614g;
        a aVar2 = this.f35614g;
        return (aVar2 != null || aVar == null) && (aVar2 == null || aVar2.equals(aVar)) && this.f35611d.equals(cVar.f35611d) && this.f35615h.equals(cVar.f35615h);
    }

    public final int hashCode() {
        n nVar = this.f35612e;
        int iHashCode = nVar != null ? nVar.hashCode() : 0;
        f fVar = this.f35613f;
        int iHashCode2 = fVar != null ? fVar.f35624a.hashCode() : 0;
        a aVar = this.f35614g;
        return this.f35615h.hashCode() + this.f35611d.hashCode() + iHashCode + iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }
}
