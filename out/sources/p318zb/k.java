package p318zb;

import Oa.c;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.q;
import kotlin.collections.y;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: FileMetadata.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f49093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f49094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f49095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f49096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f49097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f49098f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f49099g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map<c<?>, Object> f49100h;

    public k(boolean z10, boolean z11, z zVar, Long l10, Long l11, Long l12, Long l13, Map<c<?>, ? extends Object> extras) {
        i.e(extras, "extras");
        this.f49093a = z10;
        this.f49094b = z11;
        this.f49095c = zVar;
        this.f49096d = l10;
        this.f49097e = l11;
        this.f49098f = l12;
        this.f49099g = l13;
        this.f49100h = y.x(extras);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f49093a) {
            arrayList.add("isRegularFile");
        }
        if (this.f49094b) {
            arrayList.add("isDirectory");
        }
        Long l10 = this.f49096d;
        if (l10 != null) {
            arrayList.add("byteCount=" + l10);
        }
        Long l11 = this.f49097e;
        if (l11 != null) {
            arrayList.add("createdAt=" + l11);
        }
        Long l12 = this.f49098f;
        if (l12 != null) {
            arrayList.add("lastModifiedAt=" + l12);
        }
        Long l13 = this.f49099g;
        if (l13 != null) {
            arrayList.add("lastAccessedAt=" + l13);
        }
        Map<c<?>, Object> map = this.f49100h;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return q.U(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }

    public /* synthetic */ k(boolean z10, boolean z11, z zVar, Long l10, Long l11, Long l12, Long l13) {
        this(z10, z11, zVar, l10, l11, l12, l13, y.p());
    }
}
