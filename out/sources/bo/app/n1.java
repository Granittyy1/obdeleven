package bo.app;

import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONArray f21662a;

    public n1(JSONArray featureFlagsData) {
        kotlin.jvm.internal.i.e(featureFlagsData, "featureFlagsData");
        this.f21662a = featureFlagsData;
    }

    public final JSONArray a() {
        return this.f21662a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n1) && kotlin.jvm.internal.i.a(this.f21662a, ((n1) obj).f21662a);
    }

    public int hashCode() {
        return this.f21662a.hashCode();
    }

    public String toString() {
        return "FeatureFlagsReceivedEvent(featureFlagsData=" + this.f21662a + ')';
    }
}
