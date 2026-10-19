package androidx.work;

import Q2.z;
import java.util.Set;
import java.util.UUID;
import kotlin.collections.B;

/* JADX INFO: compiled from: WorkRequest.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f20466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f20467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<String> f20468c;

    /* JADX INFO: compiled from: WorkRequest.kt */
    public static abstract class a<B extends a<B, ?>, W extends p> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public UUID f20469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public z f20470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set<String> f20471c;

        public a(Class<? extends j> cls) {
            UUID uuidRandomUUID = UUID.randomUUID();
            kotlin.jvm.internal.i.d(uuidRandomUUID, "randomUUID()");
            this.f20469a = uuidRandomUUID;
            String string = this.f20469a.toString();
            kotlin.jvm.internal.i.d(string, "id.toString()");
            this.f20470b = new z(string, (WorkInfo$State) null, cls.getName(), (String) null, (d) null, (d) null, 0L, 0L, 0L, (c) null, 0, (BackoffPolicy) null, 0L, 0L, 0L, 0L, false, (OutOfQuotaPolicy) null, 0, 0L, 0, 0, 8388602);
            this.f20471c = B.z(cls.getName());
        }

        public final W a() {
            m.a aVar = (m.a) this;
            m mVar = new m(aVar.f20469a, aVar.f20470b, aVar.f20471c);
            c cVar = this.f20470b.j;
            boolean z10 = !cVar.f20348h.isEmpty() || cVar.f20344d || cVar.f20342b || cVar.f20343c;
            z zVar = this.f20470b;
            if (zVar.f5051q) {
                if (z10) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if (zVar.f5042g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            kotlin.jvm.internal.i.d(uuidRandomUUID, "randomUUID()");
            this.f20469a = uuidRandomUUID;
            String string = uuidRandomUUID.toString();
            kotlin.jvm.internal.i.d(string, "id.toString()");
            z other = this.f20470b;
            kotlin.jvm.internal.i.e(other, "other");
            this.f20470b = new z(string, other.f5037b, other.f5038c, other.f5039d, new d(other.f5040e), new d(other.f5041f), other.f5042g, other.f5043h, other.f5044i, new c(other.j), other.f5045k, other.f5046l, other.f5047m, other.f5048n, other.f5049o, other.f5050p, other.f5051q, other.f5052r, other.f5053s, other.f5055u, other.f5056v, other.f5057w, 524288);
            return mVar;
        }
    }

    public p(UUID id, z workSpec, Set<String> tags) {
        kotlin.jvm.internal.i.e(id, "id");
        kotlin.jvm.internal.i.e(workSpec, "workSpec");
        kotlin.jvm.internal.i.e(tags, "tags");
        this.f20466a = id;
        this.f20467b = workSpec;
        this.f20468c = tags;
    }
}
