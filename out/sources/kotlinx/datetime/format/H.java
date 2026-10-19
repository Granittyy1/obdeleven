package kotlinx.datetime.format;

import java.time.DateTimeException;
import java.time.ZoneOffset;
import kotlinx.datetime.UtcOffsetJvmKt;
import kotlinx.datetime.internal.format.SignedFormatStructure;

/* JADX INFO: compiled from: UtcOffsetFormat.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class H extends AbstractC2716a<Ua.i, s> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlinx.datetime.internal.format.f<G> f43738a;

    /* JADX INFO: compiled from: UtcOffsetFormat.kt */
    public static final class a implements InterfaceC2717b<G, a>, InterfaceC2724i.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final kotlinx.datetime.internal.format.d f43739a;

        public a(kotlinx.datetime.internal.format.d dVar) {
            this.f43739a = dVar;
        }

        @Override // kotlinx.datetime.format.InterfaceC2717b
        public final kotlinx.datetime.internal.format.d a() {
            return this.f43739a;
        }

        @Override // kotlinx.datetime.format.InterfaceC2717b
        public final void c(Ia.l lVar, String str) {
            InterfaceC2717b.a.b(this, str, lVar);
        }

        @Override // kotlinx.datetime.format.InterfaceC2724i
        public final void d(String str) {
            InterfaceC2717b.a.d(this, str);
        }

        @Override // kotlinx.datetime.format.InterfaceC2724i.e
        public final void s(Padding padding) {
            kotlin.jvm.internal.i.e(padding, "padding");
            z(new kotlinx.datetime.internal.format.e(new I(padding)));
        }

        @Override // kotlinx.datetime.format.InterfaceC2717b
        public final void t(Ia.l<? super a, p293xa.r>[] lVarArr, Ia.l<? super a, p293xa.r> lVar) {
            InterfaceC2717b.a.a(this, lVarArr, lVar);
        }

        @Override // kotlinx.datetime.format.InterfaceC2717b
        public final InterfaceC2717b v() {
            return new a(new kotlinx.datetime.internal.format.d());
        }

        @Override // kotlinx.datetime.format.InterfaceC2724i.e
        public final void w(Padding padding) {
            kotlin.jvm.internal.i.e(padding, "padding");
            z(new SignedFormatStructure(new kotlinx.datetime.internal.format.e(new K(padding))));
        }

        @Override // kotlinx.datetime.format.InterfaceC2724i.e
        public final void y(Padding padding) {
            kotlin.jvm.internal.i.e(padding, "padding");
            z(new kotlinx.datetime.internal.format.e(new J(padding)));
        }

        public final void z(kotlinx.datetime.internal.format.n<? super G> nVar) {
            this.f43739a.a(nVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public H(kotlinx.datetime.internal.format.f<? super G> fVar) {
        this.f43738a = fVar;
    }

    @Override // kotlinx.datetime.format.AbstractC2716a
    public final kotlinx.datetime.internal.format.f<G> b() {
        return this.f43738a;
    }

    @Override // kotlinx.datetime.format.AbstractC2716a
    public final kotlinx.datetime.internal.format.parser.c c() {
        return UtcOffsetFormatKt.f43792d;
    }

    @Override // kotlinx.datetime.format.AbstractC2716a
    public final Ua.i d(kotlinx.datetime.internal.format.parser.c cVar) {
        Ua.i iVar;
        s intermediate = (s) cVar;
        kotlin.jvm.internal.i.e(intermediate, "intermediate");
        int i10 = kotlin.jvm.internal.i.a(intermediate.f43840a, Boolean.TRUE) ? -1 : 1;
        Integer num = intermediate.f43841b;
        Integer numValueOf = num != null ? Integer.valueOf(num.intValue() * i10) : null;
        Integer num2 = intermediate.f43842c;
        Integer numValueOf2 = num2 != null ? Integer.valueOf(num2.intValue() * i10) : null;
        Integer num3 = intermediate.f43843d;
        Integer numValueOf3 = num3 != null ? Integer.valueOf(num3.intValue() * i10) : null;
        p293xa.g gVar = UtcOffsetJvmKt.f43622a;
        try {
            if (numValueOf != null) {
                ZoneOffset zoneOffsetOfHoursMinutesSeconds = ZoneOffset.ofHoursMinutesSeconds(numValueOf.intValue(), numValueOf2 != null ? numValueOf2.intValue() : 0, numValueOf3 != null ? numValueOf3.intValue() : 0);
                kotlin.jvm.internal.i.d(zoneOffsetOfHoursMinutesSeconds, "ofHoursMinutesSeconds(...)");
                iVar = new Ua.i(zoneOffsetOfHoursMinutesSeconds);
            } else if (numValueOf2 != null) {
                ZoneOffset zoneOffsetOfHoursMinutesSeconds2 = ZoneOffset.ofHoursMinutesSeconds(numValueOf2.intValue() / 60, numValueOf2.intValue() % 60, numValueOf3 != null ? numValueOf3.intValue() : 0);
                kotlin.jvm.internal.i.d(zoneOffsetOfHoursMinutesSeconds2, "ofHoursMinutesSeconds(...)");
                iVar = new Ua.i(zoneOffsetOfHoursMinutesSeconds2);
            } else {
                ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(numValueOf3 != null ? numValueOf3.intValue() : 0);
                kotlin.jvm.internal.i.d(zoneOffsetOfTotalSeconds, "ofTotalSeconds(...)");
                iVar = new Ua.i(zoneOffsetOfTotalSeconds);
            }
            return iVar;
        } catch (DateTimeException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
