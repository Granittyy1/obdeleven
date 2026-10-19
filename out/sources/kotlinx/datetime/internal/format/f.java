package kotlinx.datetime.internal.format;

import java.util.ArrayList;

/* JADX INFO: compiled from: FormatStructure.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class f<T> extends h<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p293xa.g f43884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p293xa.g f43885c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ArrayList formats) {
        super(formats);
        kotlin.jvm.internal.i.e(formats, "formats");
        this.f43884b = kotlin.a.a(new Ia.a<Wa.e<Object>>(this) { // from class: kotlinx.datetime.internal.format.CachedFormatStructure$cachedFormatter$2
            final /* synthetic */ f<Object> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // Ia.a
            public final Wa.e<Object> invoke() {
                return super/*kotlinx.datetime.internal.format.h*/.a();
            }
        });
        this.f43885c = kotlin.a.a(new Ia.a<kotlinx.datetime.internal.format.parser.l<Object>>(this) { // from class: kotlinx.datetime.internal.format.CachedFormatStructure$cachedParser$2
            final /* synthetic */ f<Object> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // Ia.a
            public final kotlinx.datetime.internal.format.parser.l<Object> invoke() {
                return super/*kotlinx.datetime.internal.format.h*/.b();
            }
        });
    }

    @Override // kotlinx.datetime.internal.format.h, kotlinx.datetime.internal.format.n
    public final Wa.e<T> a() {
        return (Wa.e) this.f43884b.getValue();
    }

    @Override // kotlinx.datetime.internal.format.h, kotlinx.datetime.internal.format.n
    public final kotlinx.datetime.internal.format.parser.l<T> b() {
        return (kotlinx.datetime.internal.format.parser.l) this.f43885c.getValue();
    }
}
