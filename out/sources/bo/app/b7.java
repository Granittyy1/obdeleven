package bo.app;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f20776a;

    public b7(List triggeredActions) {
        kotlin.jvm.internal.i.e(triggeredActions, "triggeredActions");
        this.f20776a = triggeredActions;
    }

    public final List a() {
        return this.f20776a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b7) && kotlin.jvm.internal.i.a(this.f20776a, ((b7) obj).f20776a);
    }

    public int hashCode() {
        return this.f20776a.hashCode();
    }

    public String toString() {
        return Q8.d.b(new StringBuilder("TriggeredActionsReceivedEvent(triggeredActions="), this.f20776a, ')');
    }
}
