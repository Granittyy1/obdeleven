package Xa;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import kotlin.jvm.internal.i;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.format.LocalTimeFormatKt;
import kotlinx.datetime.format.v;
import p011ab.l;
import p037cb.q0;

/* JADX INFO: compiled from: LocalTimeSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements Ya.b<Ua.g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f7442a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f7443b = l.a("kotlinx.datetime.LocalTime", ab.d.i.f8102a);

    @Override // Ya.a
    public final Object deserialize(p024bb.c cVar) {
        Ua.g.a aVar = Ua.g.Companion;
        String input = cVar.n();
        p293xa.g gVar = LocalTimeFormatKt.f43758a;
        v format = (v) gVar.getValue();
        aVar.getClass();
        i.e(input, "input");
        i.e(format, "format");
        if (format != ((v) gVar.getValue())) {
            return (Ua.g) format.a(input);
        }
        try {
            return new Ua.g(LocalTime.parse(input));
        } catch (DateTimeParseException e10) {
            throw new DateTimeFormatException(e10);
        }
    }

    @Override // Ya.l, Ya.a
    public final p011ab.e getDescriptor() {
        return f7443b;
    }

    @Override // Ya.l
    public final void serialize(p024bb.d dVar, Object obj) {
        Ua.g value = (Ua.g) obj;
        i.e(value, "value");
        dVar.C(value.toString());
    }
}
