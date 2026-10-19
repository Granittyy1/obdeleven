package Xa;

import Ua.i;
import java.time.format.DateTimeFormatter;
import kotlinx.datetime.UtcOffsetJvmKt;
import kotlinx.datetime.format.H;
import kotlinx.datetime.format.UtcOffsetFormatKt;
import p011ab.l;
import p037cb.q0;

/* JADX INFO: compiled from: TimeZoneSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements Ya.b<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f7446a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f7447b = l.a("kotlinx.datetime.UtcOffset", ab.d.i.f8102a);

    @Override // Ya.a
    public final Object deserialize(p024bb.c cVar) {
        i.a aVar = i.Companion;
        String input = cVar.n();
        p293xa.g gVar = UtcOffsetFormatKt.f43789a;
        H format = (H) gVar.getValue();
        aVar.getClass();
        kotlin.jvm.internal.i.e(input, "input");
        kotlin.jvm.internal.i.e(format, "format");
        if (format == ((H) gVar.getValue())) {
            DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) UtcOffsetJvmKt.f43622a.getValue();
            kotlin.jvm.internal.i.d(dateTimeFormatter, "access$getIsoFormat(...)");
            return UtcOffsetJvmKt.a(input, dateTimeFormatter);
        }
        if (format == ((H) UtcOffsetFormatKt.f43790b.getValue())) {
            DateTimeFormatter dateTimeFormatter2 = (DateTimeFormatter) UtcOffsetJvmKt.f43623b.getValue();
            kotlin.jvm.internal.i.d(dateTimeFormatter2, "access$getIsoBasicFormat(...)");
            return UtcOffsetJvmKt.a(input, dateTimeFormatter2);
        }
        if (format != ((H) UtcOffsetFormatKt.f43791c.getValue())) {
            return (i) format.a(input);
        }
        DateTimeFormatter dateTimeFormatter3 = (DateTimeFormatter) UtcOffsetJvmKt.f43624c.getValue();
        kotlin.jvm.internal.i.d(dateTimeFormatter3, "access$getFourDigitsFormat(...)");
        return UtcOffsetJvmKt.a(input, dateTimeFormatter3);
    }

    @Override // Ya.l, Ya.a
    public final p011ab.e getDescriptor() {
        return f7447b;
    }

    @Override // Ya.l
    public final void serialize(p024bb.d dVar, Object obj) {
        i value = (i) obj;
        kotlin.jvm.internal.i.e(value, "value");
        dVar.C(value.toString());
    }
}
