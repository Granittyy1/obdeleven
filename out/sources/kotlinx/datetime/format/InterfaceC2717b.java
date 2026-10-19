package kotlinx.datetime.format;

import java.util.ArrayList;
import kotlinx.datetime.format.InterfaceC2717b;
import kotlinx.datetime.internal.format.OptionalFormatStructure;

/* JADX INFO: renamed from: kotlinx.datetime.format.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DateTimeFormatBuilder.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2717b<Target, ActualSelf extends InterfaceC2717b<Target, ActualSelf>> extends InterfaceC2724i {

    /* JADX INFO: renamed from: kotlinx.datetime.format.b$a */
    /* JADX INFO: compiled from: DateTimeFormatBuilder.kt */
    public static final class a {
        public static <Target, ActualSelf extends InterfaceC2717b<Target, ActualSelf>> void a(InterfaceC2717b<Target, ActualSelf> interfaceC2717b, Ia.l<? super ActualSelf, p293xa.r>[] otherFormats, Ia.l<? super ActualSelf, p293xa.r> mainFormat) {
            kotlin.jvm.internal.i.e(otherFormats, "otherFormats");
            kotlin.jvm.internal.i.e(mainFormat, "mainFormat");
            ArrayList arrayList = new ArrayList(otherFormats.length);
            for (Ia.l<? super ActualSelf, p293xa.r> lVar : otherFormats) {
                InterfaceC2717b interfaceC2717bV = interfaceC2717b.v();
                lVar.invoke(interfaceC2717bV);
                arrayList.add(new kotlinx.datetime.internal.format.h((ArrayList) interfaceC2717bV.a().f43882b));
            }
            InterfaceC2717b interfaceC2717bV2 = interfaceC2717b.v();
            mainFormat.invoke(interfaceC2717bV2);
            interfaceC2717b.a().a(new kotlinx.datetime.internal.format.c(new kotlinx.datetime.internal.format.h((ArrayList) interfaceC2717bV2.a().f43882b), arrayList));
        }

        public static <Target, ActualSelf extends InterfaceC2717b<Target, ActualSelf>> void b(InterfaceC2717b<Target, ActualSelf> interfaceC2717b, String onZero, Ia.l<? super ActualSelf, p293xa.r> format) {
            kotlin.jvm.internal.i.e(onZero, "onZero");
            kotlin.jvm.internal.i.e(format, "format");
            kotlinx.datetime.internal.format.d dVarA = interfaceC2717b.a();
            InterfaceC2717b interfaceC2717bV = interfaceC2717b.v();
            format.invoke(interfaceC2717bV);
            p293xa.r rVar = p293xa.r.f47939a;
            dVarA.a(new OptionalFormatStructure(onZero, new kotlinx.datetime.internal.format.h((ArrayList) interfaceC2717bV.a().f43882b)));
        }

        public static <Target, ActualSelf extends InterfaceC2717b<Target, ActualSelf>> kotlinx.datetime.internal.format.f<Target> c(InterfaceC2717b<Target, ActualSelf> interfaceC2717b) {
            ArrayList formats = (ArrayList) interfaceC2717b.a().f43882b;
            kotlin.jvm.internal.i.e(formats, "formats");
            return new kotlinx.datetime.internal.format.f<>(formats);
        }

        public static <Target, ActualSelf extends InterfaceC2717b<Target, ActualSelf>> void d(InterfaceC2717b<Target, ActualSelf> interfaceC2717b, String value) {
            kotlin.jvm.internal.i.e(value, "value");
            interfaceC2717b.a().a(new kotlinx.datetime.internal.format.j(value));
        }
    }

    kotlinx.datetime.internal.format.d a();

    void c(Ia.l lVar, String str);

    void t(Ia.l<? super ActualSelf, p293xa.r>[] lVarArr, Ia.l<? super ActualSelf, p293xa.r> lVar);

    ActualSelf v();
}
