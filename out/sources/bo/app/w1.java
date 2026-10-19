package bo.app;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f22143a;

    public w1(List geofencesList) {
        kotlin.jvm.internal.i.e(geofencesList, "geofencesList");
        this.f22143a = geofencesList;
    }

    public final List a() {
        return this.f22143a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w1) && kotlin.jvm.internal.i.a(this.f22143a, ((w1) obj).f22143a);
    }

    public int hashCode() {
        return this.f22143a.hashCode();
    }

    public String toString() {
        return Q8.d.b(new StringBuilder("GeofencesReceivedEvent(geofencesList="), this.f22143a, ')');
    }
}
