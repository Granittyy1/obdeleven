package Xa;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import kotlin.jvm.internal.i;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.format.InterfaceC2723h;
import kotlinx.datetime.format.LocalDateFormatKt;
import p011ab.l;
import p037cb.q0;

/* JADX INFO: compiled from: LocalDateSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements Ya.b<Ua.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f7438a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f7439b = l.a("kotlinx.datetime.LocalDate", ab.d.i.f8102a);

    @Override // Ya.a
    public final Object deserialize(p024bb.c cVar) {
        Ua.e.a aVar = Ua.e.Companion;
        String input = cVar.n();
        InterfaceC2723h<Ua.e> interfaceC2723h = Ua.e.b.f6579a;
        p293xa.g gVar = LocalDateFormatKt.f43745a;
        InterfaceC2723h format = (InterfaceC2723h) gVar.getValue();
        aVar.getClass();
        i.e(input, "input");
        i.e(format, "format");
        if (format != ((InterfaceC2723h) gVar.getValue())) {
            return (Ua.e) format.a(input);
        }
        try {
            return new Ua.e(LocalDate.parse(input));
        } catch (DateTimeParseException e10) {
            throw new DateTimeFormatException(e10);
        }
    }

    @Override // Ya.l, Ya.a
    public final p011ab.e getDescriptor() {
        return f7439b;
    }

    @Override // Ya.l
    public final void serialize(p024bb.d dVar, Object obj) {
        Ua.e value = (Ua.e) obj;
        i.e(value, "value");
        dVar.C(value.toString());
    }
}
