package kotlinx.datetime.format;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: DateTimeComponents.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DateTimeComponents$Formats$RFC_1123$1 extends Lambda implements Ia.l<InterfaceC2724i.c, p293xa.r> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final DateTimeComponents$Formats$RFC_1123$1 f43652h = new DateTimeComponents$Formats$RFC_1123$1();

    public DateTimeComponents$Formats$RFC_1123$1() {
        super(1);
    }

    @Override // Ia.l
    public final p293xa.r invoke(InterfaceC2724i.c cVar) {
        InterfaceC2724i.c Format = cVar;
        kotlin.jvm.internal.i.e(Format, "$this$Format");
        C2725j.a(Format, new Ia.l[]{new Ia.l<InterfaceC2724i.c, p293xa.r>() { // from class: kotlinx.datetime.format.DateTimeComponents$Formats$RFC_1123$1.1
            @Override // Ia.l
            public final p293xa.r invoke(InterfaceC2724i.c cVar2) {
                InterfaceC2724i.c alternativeParsing = cVar2;
                kotlin.jvm.internal.i.e(alternativeParsing, "$this$alternativeParsing");
                return p293xa.r.f47939a;
            }
        }}, new Ia.l<InterfaceC2724i.c, p293xa.r>() { // from class: kotlinx.datetime.format.DateTimeComponents$Formats$RFC_1123$1.2
            @Override // Ia.l
            public final p293xa.r invoke(InterfaceC2724i.c cVar2) {
                InterfaceC2724i.c alternativeParsing = cVar2;
                kotlin.jvm.internal.i.e(alternativeParsing, "$this$alternativeParsing");
                alternativeParsing.o(m.f43821b);
                alternativeParsing.d(", ");
                return p293xa.r.f47939a;
            }
        });
        Format.p(Padding.f43773b);
        C2725j.b(Format, ' ');
        Format.r(z.f43853b);
        C2725j.b(Format, ' ');
        Format.j(Padding.f43774c);
        C2725j.b(Format, ' ');
        Format.n(Padding.f43774c);
        C2725j.b(Format, ':');
        Format.f(Padding.f43774c);
        C2725j.c(Format, "", new Ia.l<InterfaceC2724i.c, p293xa.r>() { // from class: kotlinx.datetime.format.DateTimeComponents$Formats$RFC_1123$1.3
            @Override // Ia.l
            public final p293xa.r invoke(InterfaceC2724i.c cVar2) {
                InterfaceC2724i.c optional = cVar2;
                kotlin.jvm.internal.i.e(optional, "$this$optional");
                C2725j.b(optional, ':');
                optional.g(Padding.f43774c);
                return p293xa.r.f47939a;
            }
        });
        Format.d(" ");
        C2725j.a(Format, new Ia.l[]{new Ia.l<InterfaceC2724i.c, p293xa.r>() { // from class: kotlinx.datetime.format.DateTimeComponents$Formats$RFC_1123$1.4
            @Override // Ia.l
            public final p293xa.r invoke(InterfaceC2724i.c cVar2) {
                InterfaceC2724i.c alternativeParsing = cVar2;
                kotlin.jvm.internal.i.e(alternativeParsing, "$this$alternativeParsing");
                alternativeParsing.d("UT");
                return p293xa.r.f47939a;
            }
        }, new Ia.l<InterfaceC2724i.c, p293xa.r>() { // from class: kotlinx.datetime.format.DateTimeComponents$Formats$RFC_1123$1.5
            @Override // Ia.l
            public final p293xa.r invoke(InterfaceC2724i.c cVar2) {
                InterfaceC2724i.c alternativeParsing = cVar2;
                kotlin.jvm.internal.i.e(alternativeParsing, "$this$alternativeParsing");
                alternativeParsing.d("Z");
                return p293xa.r.f47939a;
            }
        }}, new Ia.l<InterfaceC2724i.c, p293xa.r>() { // from class: kotlinx.datetime.format.DateTimeComponents$Formats$RFC_1123$1.6
            @Override // Ia.l
            public final p293xa.r invoke(InterfaceC2724i.c cVar2) {
                InterfaceC2724i.c alternativeParsing = cVar2;
                kotlin.jvm.internal.i.e(alternativeParsing, "$this$alternativeParsing");
                C2725j.c(alternativeParsing, "GMT", new Ia.l<InterfaceC2724i.c, p293xa.r>() { // from class: kotlinx.datetime.format.DateTimeComponents.Formats.RFC_1123.1.6.1
                    @Override // Ia.l
                    public final p293xa.r invoke(InterfaceC2724i.c cVar3) {
                        InterfaceC2724i.c optional = cVar3;
                        kotlin.jvm.internal.i.e(optional, "$this$optional");
                        optional.m((H) UtcOffsetFormatKt.f43791c.getValue());
                        return p293xa.r.f47939a;
                    }
                });
                return p293xa.r.f47939a;
            }
        });
        return p293xa.r.f47939a;
    }
}
