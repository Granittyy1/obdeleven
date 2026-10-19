package bo.app;

import com.braze.models.IPutIntoJson;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class v5 implements IPutIntoJson {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f22077d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UUID f22078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f22079c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final v5 a() {
            UUID uuidRandomUUID = UUID.randomUUID();
            kotlin.jvm.internal.i.d(uuidRandomUUID, "randomUUID()");
            return new v5(uuidRandomUUID);
        }

        private a() {
        }

        public final v5 a(String sessionId) {
            kotlin.jvm.internal.i.e(sessionId, "sessionId");
            UUID uuidFromString = UUID.fromString(sessionId);
            kotlin.jvm.internal.i.d(uuidFromString, "fromString(sessionId)");
            return new v5(uuidFromString);
        }
    }

    public v5(UUID sessionIdUuid) {
        kotlin.jvm.internal.i.e(sessionIdUuid, "sessionIdUuid");
        this.f22078b = sessionIdUuid;
        String string = sessionIdUuid.toString();
        kotlin.jvm.internal.i.d(string, "sessionIdUuid.toString()");
        this.f22079c = string;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v5) && kotlin.jvm.internal.i.a(this.f22078b, ((v5) obj).f22078b);
    }

    public int hashCode() {
        return this.f22078b.hashCode();
    }

    public String toString() {
        return this.f22079c;
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public String forJsonPut() {
        return this.f22079c;
    }
}
