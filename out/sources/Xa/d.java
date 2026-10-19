package Xa;

import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import kotlin.jvm.internal.i;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.format.u;
import p011ab.l;
import p037cb.q0;

/* JADX INFO: compiled from: LocalDateTimeSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements Ya.b<Ua.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f7440a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f7441b = l.a("kotlinx.datetime.LocalDateTime", ab.d.i.f8102a);

    @Override // Ya.a
    public final Object deserialize(p024bb.c cVar) {
        Ua.f.a aVar = Ua.f.Companion;
        String input = cVar.n();
        u format = Ua.f.b.f6581a;
        aVar.getClass();
        i.e(input, "input");
        i.e(format, "format");
        try {
            return new Ua.f(LocalDateTime.parse(input));
        } catch (DateTimeParseException e10) {
            throw new DateTimeFormatException(e10);
        }
    }

    @Override // Ya.l, Ya.a
    public final p011ab.e getDescriptor() {
        return f7441b;
    }

    @Override // Ya.l
    public final void serialize(p024bb.d dVar, Object obj) {
        Ua.f value = (Ua.f) obj;
        i.e(value, "value");
        dVar.C(value.toString());
    }
}
