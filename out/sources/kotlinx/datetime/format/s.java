package kotlinx.datetime.format;

/* JADX INFO: compiled from: UtcOffsetFormat.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class s implements G, kotlinx.datetime.internal.format.parser.c<s> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f43840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f43841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f43842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f43843d;

    public s() {
        this(null, null, null, null);
    }

    @Override // kotlinx.datetime.format.G
    public final void B(Integer num) {
        this.f43841b = num;
    }

    @Override // kotlinx.datetime.format.G
    public final void C(Integer num) {
        this.f43843d = num;
    }

    @Override // kotlinx.datetime.internal.format.parser.c
    public final s d() {
        return new s(this.f43840a, this.f43841b, this.f43842c, this.f43843d);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (kotlin.jvm.internal.i.a(this.f43840a, sVar.f43840a) && kotlin.jvm.internal.i.a(this.f43841b, sVar.f43841b) && kotlin.jvm.internal.i.a(this.f43842c, sVar.f43842c) && kotlin.jvm.internal.i.a(this.f43843d, sVar.f43843d)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.datetime.format.G
    public final Integer f() {
        return this.f43841b;
    }

    public final int hashCode() {
        Boolean bool = this.f43840a;
        int iHashCode = bool != null ? bool.hashCode() : 0;
        Integer num = this.f43841b;
        int iHashCode2 = iHashCode + (num != null ? num.hashCode() : 0);
        Integer num2 = this.f43842c;
        int iHashCode3 = iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        Integer num3 = this.f43843d;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // kotlinx.datetime.format.G
    public final Integer j() {
        return this.f43843d;
    }

    @Override // kotlinx.datetime.format.G
    public final Integer r() {
        return this.f43842c;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        Boolean bool = this.f43840a;
        if (bool != null) {
            str = bool.booleanValue() ? "-" : "+";
        } else {
            str = " ";
        }
        sb2.append(str);
        Object obj = this.f43841b;
        if (obj == null) {
            obj = "??";
        }
        sb2.append(obj);
        sb2.append(':');
        Object obj2 = this.f43842c;
        if (obj2 == null) {
            obj2 = "??";
        }
        sb2.append(obj2);
        sb2.append(':');
        Integer num = this.f43843d;
        sb2.append(num != null ? num : "??");
        return sb2.toString();
    }

    @Override // kotlinx.datetime.format.G
    public final Boolean w() {
        return this.f43840a;
    }

    @Override // kotlinx.datetime.format.G
    public final void x(Boolean bool) {
        this.f43840a = bool;
    }

    @Override // kotlinx.datetime.format.G
    public final void z(Integer num) {
        this.f43842c = num;
    }

    public s(Boolean bool, Integer num, Integer num2, Integer num3) {
        this.f43840a = bool;
        this.f43841b = num;
        this.f43842c = num2;
        this.f43843d = num3;
    }
}
