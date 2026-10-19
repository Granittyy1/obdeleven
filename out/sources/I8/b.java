package I8;

import com.voltasit.obdeleven.domain.models.oca.CommandType;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: OcaCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CommandType f3915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3918d;

    public b(CommandType commandType, String data, String type, String values) {
        i.e(data, "data");
        i.e(type, "type");
        i.e(values, "values");
        this.f3915a = commandType;
        this.f3916b = data;
        this.f3917c = type;
        this.f3918d = values;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f3915a == bVar.f3915a && i.a(this.f3916b, bVar.f3916b) && i.a(this.f3917c, bVar.f3917c) && i.a(this.f3918d, bVar.f3918d);
    }

    public final int hashCode() {
        return this.f3918d.hashCode() + B1.a.b(this.f3917c, B1.a.b(this.f3916b, this.f3915a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "OcaCommand(command=" + this.f3915a + ", data=" + this.f3916b + ", type=" + this.f3917c + ", values=" + this.f3918d + ")";
    }
}
