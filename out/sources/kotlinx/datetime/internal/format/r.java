package kotlinx.datetime.internal.format;

/* JADX INFO: compiled from: FieldSpec.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class r<Object, Field> implements b<Object, Field> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Oa.h<Object, Field> f43934a;

    public r(Oa.h<Object, Field> property) {
        kotlin.jvm.internal.i.e(property, "property");
        this.f43934a = property;
    }

    @Override // kotlinx.datetime.internal.format.b
    public final Field a(Object object) {
        return this.f43934a.get(object);
    }

    @Override // kotlinx.datetime.internal.format.b
    public final Field b(Object object) {
        Oa.h<Object, Field> hVar = this.f43934a;
        Field field = hVar.get(object);
        if (field != null) {
            return field;
        }
        throw new IllegalStateException("Field " + hVar.getName() + " is not set");
    }

    @Override // kotlinx.datetime.internal.format.parser.a
    public final Field c(Object object, Field field) {
        Oa.h<Object, Field> hVar = this.f43934a;
        Field field2 = hVar.get(object);
        if (field2 == null) {
            hVar.set(object, field);
        } else if (!field2.equals(field)) {
            return field2;
        }
        return null;
    }

    @Override // kotlinx.datetime.internal.format.parser.a
    public final String getName() {
        return this.f43934a.getName();
    }
}
