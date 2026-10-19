package p083g7;

import Q3.k;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;

/* JADX INFO: compiled from: ModalMessage.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f35630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f35631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f35632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f35633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f35634h;

    public i() {
        throw null;
    }

    public i(k kVar, n nVar, n nVar2, f fVar, a aVar, String str, Map map) {
        super(kVar, MessageType.MODAL, map);
        this.f35630d = nVar;
        this.f35631e = nVar2;
        this.f35632f = fVar;
        this.f35633g = aVar;
        this.f35634h = str;
    }

    @Override // p083g7.h
    public final f a() {
        return this.f35632f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (hashCode() != iVar.hashCode()) {
            return false;
        }
        n nVar = iVar.f35631e;
        n nVar2 = this.f35631e;
        if ((nVar2 == null && nVar != null) || (nVar2 != null && !nVar2.equals(nVar))) {
            return false;
        }
        a aVar = iVar.f35633g;
        a aVar2 = this.f35633g;
        if ((aVar2 == null && aVar != null) || (aVar2 != null && !aVar2.equals(aVar))) {
            return false;
        }
        f fVar = iVar.f35632f;
        f fVar2 = this.f35632f;
        return (fVar2 != null || fVar == null) && (fVar2 == null || fVar2.equals(fVar)) && this.f35630d.equals(iVar.f35630d) && this.f35634h.equals(iVar.f35634h);
    }

    public final int hashCode() {
        n nVar = this.f35631e;
        int iHashCode = nVar != null ? nVar.hashCode() : 0;
        a aVar = this.f35633g;
        int iHashCode2 = aVar != null ? aVar.hashCode() : 0;
        f fVar = this.f35632f;
        return this.f35634h.hashCode() + this.f35630d.hashCode() + iHashCode + iHashCode2 + (fVar != null ? fVar.f35624a.hashCode() : 0);
    }
}
