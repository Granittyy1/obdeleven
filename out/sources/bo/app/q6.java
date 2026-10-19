package bo.app;

/* JADX INFO: loaded from: classes.dex */
public final class q6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a2 f21796b;

    public q6(String campaignId, a2 pushClickEvent) {
        kotlin.jvm.internal.i.e(campaignId, "campaignId");
        kotlin.jvm.internal.i.e(pushClickEvent, "pushClickEvent");
        this.f21795a = campaignId;
        this.f21796b = pushClickEvent;
    }

    public final String a() {
        return this.f21795a;
    }

    public final a2 b() {
        return this.f21796b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6)) {
            return false;
        }
        q6 q6Var = (q6) obj;
        return kotlin.jvm.internal.i.a(this.f21795a, q6Var.f21795a) && kotlin.jvm.internal.i.a(this.f21796b, q6Var.f21796b);
    }

    public int hashCode() {
        return this.f21796b.hashCode() + (this.f21795a.hashCode() * 31);
    }

    public String toString() {
        return "TriggerEligiblePushClickEvent(campaignId=" + this.f21795a + ", pushClickEvent=" + this.f21796b + ')';
    }
}
