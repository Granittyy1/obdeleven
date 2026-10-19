package kotlinx.datetime.format;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: DateTimeComponents.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DateTimeComponents$Formats$ISO_DATE_TIME_OFFSET$1 extends Lambda implements Ia.l<InterfaceC2724i.c, p293xa.r> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final DateTimeComponents$Formats$ISO_DATE_TIME_OFFSET$1 f43646h = new DateTimeComponents$Formats$ISO_DATE_TIME_OFFSET$1();

    public DateTimeComponents$Formats$ISO_DATE_TIME_OFFSET$1() {
        super(1);
    }

    @Override // Ia.l
    public final p293xa.r invoke(InterfaceC2724i.c cVar) {
        InterfaceC2724i.c Format = cVar;
        kotlin.jvm.internal.i.e(Format, "$this$Format");
        Format.q((InterfaceC2723h) LocalDateFormatKt.f43745a.getValue());
        C2725j.a(Format, new Ia.l[]{new Ia.l<InterfaceC2724i.c, p293xa.r>() { // from class: kotlinx.datetime.format.DateTimeComponents$Formats$ISO_DATE_TIME_OFFSET$1.1
            @Override // Ia.l
            public final p293xa.r invoke(InterfaceC2724i.c cVar2) {
                InterfaceC2724i.c alternativeParsing = cVar2;
                kotlin.jvm.internal.i.e(alternativeParsing, "$this$alternativeParsing");
                C2725j.b(alternativeParsing, 't');
                return p293xa.r.f47939a;
            }
        }}, new Ia.l<InterfaceC2724i.c, p293xa.r>() { // from class: kotlinx.datetime.format.DateTimeComponents$Formats$ISO_DATE_TIME_OFFSET$1.2
            @Override // Ia.l
            public final p293xa.r invoke(InterfaceC2724i.c cVar2) {
                InterfaceC2724i.c alternativeParsing = cVar2;
                kotlin.jvm.internal.i.e(alternativeParsing, "$this$alternativeParsing");
                C2725j.b(alternativeParsing, 'T');
                return p293xa.r.f47939a;
            }
        });
        Format.n(Padding.f43774c);
        C2725j.b(Format, ':');
        Format.f(Padding.f43774c);
        C2725j.b(Format, ':');
        Format.g(Padding.f43774c);
        C2725j.c(Format, "", new Ia.l<InterfaceC2724i.c, p293xa.r>() { // from class: kotlinx.datetime.format.DateTimeComponents$Formats$ISO_DATE_TIME_OFFSET$1.3
            @Override // Ia.l
            public final p293xa.r invoke(InterfaceC2724i.c cVar2) {
                InterfaceC2724i.c optional = cVar2;
                kotlin.jvm.internal.i.e(optional, "$this$optional");
                C2725j.b(optional, '.');
                optional.l(1, 9);
                return p293xa.r.f47939a;
            }
        });
        C2725j.a(Format, new Ia.l[]{new Ia.l<InterfaceC2724i.c, p293xa.r>() { // from class: kotlinx.datetime.format.DateTimeComponents$Formats$ISO_DATE_TIME_OFFSET$1.4
            @Override // Ia.l
            public final p293xa.r invoke(InterfaceC2724i.c cVar2) {
                InterfaceC2724i.c alternativeParsing = cVar2;
                kotlin.jvm.internal.i.e(alternativeParsing, "$this$alternativeParsing");
                alternativeParsing.w(Padding.f43774c);
                return p293xa.r.f47939a;
            }
        }}, new Ia.l<InterfaceC2724i.c, p293xa.r>() { // from class: kotlinx.datetime.format.DateTimeComponents$Formats$ISO_DATE_TIME_OFFSET$1.5
            @Override // Ia.l
            public final p293xa.r invoke(InterfaceC2724i.c cVar2) {
                InterfaceC2724i.c alternativeParsing = cVar2;
                kotlin.jvm.internal.i.e(alternativeParsing, "$this$alternativeParsing");
                alternativeParsing.m((H) UtcOffsetFormatKt.f43789a.getValue());
                return p293xa.r.f47939a;
            }
        });
        return p293xa.r.f47939a;
    }
}
