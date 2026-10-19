package bo.app;

import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.JsonUtils;

/* JADX INFO: loaded from: classes.dex */
public final class g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x2 f21141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c3 f21142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IInAppMessage f21143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f21144d;

    public g3(x2 triggerEvent, c3 triggeredAction, IInAppMessage inAppMessage, String str) {
        kotlin.jvm.internal.i.e(triggerEvent, "triggerEvent");
        kotlin.jvm.internal.i.e(triggeredAction, "triggeredAction");
        kotlin.jvm.internal.i.e(inAppMessage, "inAppMessage");
        this.f21141a = triggerEvent;
        this.f21142b = triggeredAction;
        this.f21143c = inAppMessage;
        this.f21144d = str;
    }

    public final x2 a() {
        return this.f21141a;
    }

    public final c3 b() {
        return this.f21142b;
    }

    public final IInAppMessage c() {
        return this.f21143c;
    }

    public final String d() {
        return this.f21144d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3)) {
            return false;
        }
        g3 g3Var = (g3) obj;
        return kotlin.jvm.internal.i.a(this.f21141a, g3Var.f21141a) && kotlin.jvm.internal.i.a(this.f21142b, g3Var.f21142b) && kotlin.jvm.internal.i.a(this.f21143c, g3Var.f21143c) && kotlin.jvm.internal.i.a(this.f21144d, g3Var.f21144d);
    }

    public int hashCode() {
        int iHashCode = (this.f21143c.hashCode() + ((this.f21142b.hashCode() + (this.f21141a.hashCode() * 31)) * 31)) * 31;
        String str = this.f21144d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return kotlin.text.i.v("\n             " + JsonUtils.getPrettyPrintedString(this.f21143c.forJsonPut()) + "\n             Triggered Action Id: " + this.f21142b.getId() + "\n             Trigger Event: " + this.f21141a + "\n             User Id: " + this.f21144d + "\n        ");
    }
}
