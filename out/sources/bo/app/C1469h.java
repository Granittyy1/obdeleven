package bo.app;

import com.braze.models.IPutIntoJson;

/* JADX INFO: renamed from: bo.app.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1469h implements IPutIntoJson {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21154b;

    public C1469h(String apiKey) {
        kotlin.jvm.internal.i.e(apiKey, "apiKey");
        this.f21154b = apiKey;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1469h) && kotlin.jvm.internal.i.a(this.f21154b, ((C1469h) obj).f21154b);
    }

    public int hashCode() {
        return this.f21154b.hashCode();
    }

    public String toString() {
        return this.f21154b;
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public String forJsonPut() {
        return this.f21154b;
    }
}
